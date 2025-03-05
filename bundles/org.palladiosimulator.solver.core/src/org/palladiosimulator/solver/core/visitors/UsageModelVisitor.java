package org.palladiosimulator.solver.core.visitors;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.parameter.ParameterFactory;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.usagemodel.Branch;
import org.palladiosimulator.pcm.usagemodel.BranchTransition;
import org.palladiosimulator.pcm.usagemodel.Delay;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.Loop;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.Start;
import org.palladiosimulator.pcm.usagemodel.Stop;
import org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationFactory;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageFactory;
import org.palladiosimulator.solver.core.models.PCMInstance;
import org.palladiosimulator.solver.core.transformations.ContextWrapper;

/**
 * Visitor that builds the computed usage and computed allocation contexts by calling
 * {@link SeffVisitor} for each {@link EntryLevelSystemCall}.
 * 
 * @author Koziolek, Martens
 * 
 */
public class UsageModelVisitor extends UsagemodelSwitch {

    protected static Logger logger = Logger.getLogger(UsageModelVisitor.class.getName());

    protected PCMInstance pcmInstance;
    private ComputedUsageFactory compUsageFactory;
    private ComputedAllocationFactory compAllocationFactory;
    private ParameterFactory parameterFactory;

    protected ContextWrapper myContextWrapper = null;

    /**
     * Solves dependencies for this {@link PCMInstance} and adds the results to the
     * {@link PCMInstance}'s computed contexts (such as {@link PCMInstance#getComputedUsage()}).
     * 
     * @param inst
     *            an instance of the Palladio Component Metamodel
     */
    public UsageModelVisitor(PCMInstance inst) {
        pcmInstance = inst;
        compUsageFactory = ComputedUsageFactory.eINSTANCE;
        compAllocationFactory = ComputedAllocationFactory.eINSTANCE;
        parameterFactory = ParameterFactory.eINSTANCE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseScenarioBehaviour(org.
     * palladiosimulator.pcm.usagemodel.ScenarioBehaviour)
     */
    @Override
    public Object caseScenarioBehaviour(ScenarioBehaviour object) {
        logger.debug("VisitScenarioBehaviour");
        doSwitch(getStartAction(object));
        return object;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseStart(org.palladiosimulator.
     * pcm.usagemodel.Start)
     */
    @Override
    public Object caseStart(Start object) {
        logger.debug("VisitStart");
        doSwitch(object.getSuccessor());
        return object;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseStop(org.palladiosimulator.pcm
     * .usagemodel.Stop)
     */
    @Override
    public Object caseStop(Stop object) {
        logger.debug("VisitStop");
        return object;
    }

    @Override
    public Object caseBranch(Branch object) {
        logger.debug("VisitBranch");
        EList<BranchTransition> btList = object.getBranchTransitions_Branch();
        for (BranchTransition bt : btList) {
            doSwitch(bt.getBranchedBehaviour_BranchTransition());
        }
        doSwitch(object.getSuccessor());
        return object;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseEntryLevelSystemCall(org.
     * palladiosimulator.pcm.usagemodel.EntryLevelSystemCall)
     */
    @Override
    public Object caseEntryLevelSystemCall(EntryLevelSystemCall elsc) {
        logger.debug("VisitEntryLevelSystemCall");
        logger.debug("Called System Method " + elsc.getOperationSignature__EntryLevelSystemCall()
            .getEntityName());

        // Get List of ContextWrappers, one for each called component instance
        List<ContextWrapper> contextWrapperList;
        if (myContextWrapper == null)
            contextWrapperList = ContextWrapper.getContextWrapperFor(elsc, pcmInstance);
        else
            contextWrapperList = myContextWrapper.getContextWrapperFor(elsc);

        for (ContextWrapper contextWrapper : contextWrapperList) {
            ServiceEffectSpecification seff = contextWrapper.getNextSEFF(elsc);
            SeffVisitor visitor = new SeffVisitor(contextWrapper);
            // try {
            visitor.doSwitch(seff);
            /*
             * } catch (Exception e) { logger.error("Error while visiting RDSEFF");
             * e.printStackTrace(); }
             */
        }

        // XXX: The internal myContextWrapper is not affected by the handling of the
        // EntryLevelSystem call because the copies of it handle it. This was different
        // before allowing replication, when only one ContextWrapper instance was used.
        doSwitch(elsc.getSuccessor());
        return elsc;
    }

    @Override
    public Object caseDelay(Delay object) {
        logger.debug("VisitDelay");
        doSwitch(object.getSuccessor());
        return object;
    }

    @Override
    public Object caseLoop(Loop object) {
        logger.debug("VisitLoop");
        doSwitch(object.getBodyBehaviour_Loop());
        doSwitch(object.getSuccessor());
        return object;
    }

    /**
     * @param object
     * @return
     */
    private Start getStartAction(ScenarioBehaviour object) {
        Start startAction = (Start) EMFQueryHelper.getObjectByType(object.getActions_ScenarioBehaviour(), Start.class);
        return startAction;
    }

}
