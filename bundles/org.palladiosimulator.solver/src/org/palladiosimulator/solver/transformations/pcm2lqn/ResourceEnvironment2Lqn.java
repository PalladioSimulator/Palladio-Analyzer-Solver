package org.palladiosimulator.solver.transformations.pcm2lqn;

import java.math.BigInteger;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.resourceenvironment.util.ResourceenvironmentSwitch;
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.solver.core.runconfig.PCMSolverWorkflowRunConfiguration;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.PhaseActivities;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.SchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;
import org.palladiosimulator.solver.lqn.TypeType;
import org.palladiosimulator.solver.transformations.ExpressionToPDFWrapper;
import org.palladiosimulator.solver.visitors.ExpressionHelper;

public class ResourceEnvironment2Lqn extends ResourceenvironmentSwitch {

    private static Logger logger = Logger.getLogger(ResourceEnvironment2Lqn.class.getName());

    private final LqnBuilder lqnBuilder;
    private final PCMSolverWorkflowRunConfiguration config;

    public ResourceEnvironment2Lqn(final LqnBuilder aLqnBuilder, final PCMSolverWorkflowRunConfiguration aConfig) {
        this.lqnBuilder = aLqnBuilder;
        this.config = aConfig;
    }

    @Override
    public Object caseCommunicationLinkResourceSpecification(final CommunicationLinkResourceSpecification object) {
        final LinkingResource lr = (LinkingResource) object.eContainer();
        final CommunicationLinkResourceType clrt = object
                .getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
        final String id = Pcm2LqnHelper.getIdForCommResource(lr, clrt);

        final PCMRandomVariable throughputVariable = object.getThroughput_CommunicationLinkResourceSpecification();
        final PCMRandomVariable latencyVariable = object.getLatency_CommunicationLinkResourceSpecification();

        if (throughputVariable != null || latencyVariable != null) {
            // only handle linking resource if a throughput or latency is specified

            final ProcessorType pt = this.lqnBuilder.addProcessor(id);
            pt.setSpeedFactor("1");
            pt.setScheduling(SchedulingType.FCFS);

            final TaskType tt = this.lqnBuilder.addTask(id, pt);

            // Throughput: Create throughput entry that can be called
            // for remote external call with bytesize information
            // FIXME: Calls to this need to be added with BYTESIZE info. Not yet supported.
            if (throughputVariable != null) {

                final String throughputID = Pcm2LqnHelper.getIdForThroughput(id);
                final ActivityPhasesType apt = this.lqnBuilder.addActivityPhases(throughputID);
                final PhaseActivities pa = this.lqnBuilder.addPhaseActivities(apt);
                final EntryType et = this.lqnBuilder.addEntry(throughputID, tt);
                et.setType(TypeType.NONE);
                et.setEntryPhaseActivities(pa);

                // callers must call this task BYTESIZE times, that should make no difference for
                // the LQN mean value analysis
                // we could thin about aggregating this to KB or so, but that might cause
                // misunderstandings.
                // alternatively, for each call using a BYTESIZE, a new entry of this processor must
                // be created.
                final double throughputSpeedFactor = 1 / ExpressionHelper.getMeanValue(throughputVariable);
                apt.setHostDemandMean("" + throughputSpeedFactor);

                // TODO: each external call can create a new entry here with the demand (compare
                // internal actions)

            }
            if (latencyVariable != null) {
                // careful: calls to the latency are generated only if latency is larger > 0

                final ExpressionToPDFWrapper expToPDF = ExpressionToPDFWrapper
                        .createExpressionToPDFWrapper(latencyVariable.getExpression());
                final double latency = expToPDF.getMeanValue();

                final CallType[] callTypes = CallType.values();
                // LQN does not allow to receive synchronous and asynchronous calls at one entry,
                // so need to create one entry per call type.
                for (int i = 0; i < callTypes.length; i++) {
                    final CallType callType = callTypes[i];

                    final String latencyID = Pcm2LqnHelper.getIdForLatency(id, callType);
                    final ActivityPhasesType apt = this.lqnBuilder.addActivityPhases(latencyID);
                    final PhaseActivities pa = this.lqnBuilder.addPhaseActivities(apt);

                    final EntryType et = this.lqnBuilder.addEntry(latencyID, tt);
                    et.setType(TypeType.PH1PH2);
                    et.setEntryPhaseActivities(pa);

                    apt.setHostDemandMean("" + latency);
                    final double stdev = expToPDF.getStandardDeviation();
                    if (!Double.isNaN(stdev) && latency != 0) {
                        // squared coefficient of variation
                        apt.setHostDemandCvsq("" + (stdev * stdev / (latency * latency)));
                    }
                }
            }

        } else {
            logger.warn(
                    "Found linking resource with neither throughput specification nor latency specification, ignoring it.");
        }

        return null;
    }

    @Override
    public Object caseLinkingResource(final LinkingResource object) {
        doSwitch(object.getCommunicationLinkResourceSpecifications_LinkingResource());
        return null;
    }

    @Override
    public Object caseProcessingResourceSpecification(final ProcessingResourceSpecification object) {
        final ResourceContainer rc = (ResourceContainer) object.eContainer();
        final ProcessingResourceType prt = object.getActiveResourceType_ActiveResourceSpecification();
        final String id = Pcm2LqnHelper.getIdForProcResource(rc, prt);

        final ProcessorType pt = this.lqnBuilder.addProcessor(id);
        setSchedulingPolicy(object, pt);

        // The speed of the processing resource is already considered in the resource demands,
        // they are calculated in term of tiem spent on the processor.
        /*
         * String processingRate = object .getProcessingRate_ProcessingResourceSpecification()
         * .getSpecification();
         */
        pt.setSpeedFactor("1.0");
        // pt.setMultiplicity(new BigInteger("1"));
        pt.setMultiplicity(new BigInteger("" + object.getNumberOfReplicas()));

        // String processingRateSolved =
        // ExpressionHelper.getSolvedExpressionAsString(processingRate, null);
        //
        // pt.setSpeedFactor(processingRateSolved);

        final TaskType tt = this.lqnBuilder.addTask(id, pt);
        tt.setMultiplicity(new BigInteger(""+object.getNumberOfReplicas()));
        final ActivityPhasesType apt = this.lqnBuilder.addActivityPhases(id);
        final PhaseActivities pa = this.lqnBuilder.addPhaseActivities(apt);
        final EntryType et = this.lqnBuilder.addEntry(id, tt);
        et.setType(TypeType.NONE);
        et.setEntryPhaseActivities(pa);

        return null;
    }

    private void setSchedulingPolicy(final ProcessingResourceSpecification object, final ProcessorType pt) {
        final String schedulingPolicyID = object.getSchedulingPolicy().getId();
        if (schedulingPolicyID.equals("FCFS")) {
            pt.setScheduling(SchedulingType.FCFS);
        } else if (schedulingPolicyID.equals("Delay")) {
            // The SchedulingType.INF has been added manually to the generated code, so
            // there may appear a compile error here if the LQN code is regenerated again.
            // I purposefully did not set it to "generated not" so that this problem is
            // brought to attention whenever the model is regenerated
            // However, if the model is successfully regenerated from the LQN version 4.3 or later
            // XML schema
            // the inf value should be available in the generated code and this note can be deleted.
            pt.setScheduling(SchedulingType.INF);
        } else if (schedulingPolicyID.equals("ProcessorSharing")) {
            pt.setScheduling(SchedulingType.PS);
            pt.setQuantum(this.config.getPsQuantum());
        } else {
            logger.warn("Unknown scheduling strategy " + object.getSchedulingPolicy().getId()
                    + ", using PROCESSOR_SHARING for "
                    + object.getActiveResourceType_ActiveResourceSpecification().getEntityName() + " of server "
                    + object.getResourceContainer_ProcessingResourceSpecification().getEntityName() + " (id: "
                    + object.getResourceContainer_ProcessingResourceSpecification().getId() + ")");
            pt.setScheduling(SchedulingType.PS);
            pt.setQuantum(this.config.getPsQuantum());
        }
    }

    @Override
    public Object caseResourceContainer(final ResourceContainer object) {
        final EList<ProcessingResourceSpecification> procResList = object
                .getActiveResourceSpecifications_ResourceContainer();
        for (final ProcessingResourceSpecification prs : procResList) {
            doSwitch(prs);
        }
        return null;
    }

    @Override
    public Object caseResourceEnvironment(final ResourceEnvironment object) {
        final EList<ResourceContainer> resConList = object.getResourceContainer_ResourceEnvironment();
        for (final ResourceContainer rc : resConList) {
            doSwitch(rc); // TODO
        }

        final EList<LinkingResource> linkResList = object.getLinkingResources__ResourceEnvironment();
        for (final LinkingResource lr : linkResList) {
            doSwitch(lr);
        }

        return null;
    }

}
