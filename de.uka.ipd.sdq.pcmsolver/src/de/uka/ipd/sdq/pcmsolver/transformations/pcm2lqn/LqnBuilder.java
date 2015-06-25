package de.uka.ipd.sdq.pcmsolver.transformations.pcm2lqn;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.solver.lqn.ActivityDefType;
import org.palladiosimulator.solver.lqn.ActivityListType;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.ActivityOrType;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.ActivityType;
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.OrListType;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.PhaseActivities;
import org.palladiosimulator.solver.lqn.PrecedenceType;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.ReplyActivityType;
import org.palladiosimulator.solver.lqn.ReplyEntryType;
import org.palladiosimulator.solver.lqn.SchedulingType;
import org.palladiosimulator.solver.lqn.SemaphoreType;
import org.palladiosimulator.solver.lqn.ServiceType;
import org.palladiosimulator.solver.lqn.SingleActivityListType;
import org.palladiosimulator.solver.lqn.SolverParamsType;
import org.palladiosimulator.solver.lqn.TaskActivityGraph;
import org.palladiosimulator.solver.lqn.TaskOptionType;
import org.palladiosimulator.solver.lqn.TaskSchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;
import org.palladiosimulator.solver.lqn.TypeType;

import de.uka.ipd.sdq.pcmsolver.runconfig.PCMSolverWorkflowRunConfiguration;

public class LqnBuilder {

    private static Logger logger = Logger.getLogger(LqnBuilder.class.getName());

    private final LqnFactory lqnFactory = LqnFactory.eINSTANCE;
    private LqnModelType lqnModel = null;

    private final Stack<TaskActivityGraph> taskGraphStack = new Stack<TaskActivityGraph>();

    private boolean isLQSimAnalysis;
    private final boolean isInfiniteTaskMultiplicity;

    public LqnBuilder(final boolean isInfTask) {
        this.lqnModel = this.lqnFactory.createLqnModelType();
        this.lqnModel.setName("PCM2LQN_Model");

        setIsLQSimAnalysis(false);
        this.isInfiniteTaskMultiplicity = isInfTask;
    }

    /**
     * Creates a new processor if no processor with the given id exists yet. Otherwise, returns the
     * matching existing processor. See {@link #getProcessorTypeFromModel(String)} for how to match
     * the id.
     * 
     * @param id
     * @return
     */
    public ProcessorType addProcessor(final String id) {
        ProcessorType pt = getProcessorTypeFromModel(id);
        if (pt == null) {
            pt = this.lqnFactory.createProcessorType();
            pt.setName(id + "_Processor");
            pt.setMultiplicity(new BigInteger("1"));
            pt.setScheduling(SchedulingType.FCFS);
            this.lqnModel.getProcessor().add(pt);
        }
        return pt;
    }

    private ProcessorType getProcessorTypeFromModel(final String id) {
        final EList<ProcessorType> list = this.lqnModel.getProcessor();
        for (final ProcessorType procType : list) {
            if (procType.getName().equals(id + "_Processor")) {
                return procType;
            }
        }
        return null;
    }

    private EntryType getEntryTypeFromTask(final String id, final TaskType tt) {
        final EList<EntryType> entryList = tt.getEntry();
        for (final EntryType entryType : entryList) {
            if (entryType.getName().equals(id + "_Entry")) {
                return entryType;
            }
        }
        return null;
    }

    /**
     * Checks whether the passed {@link ProcessorType} contains a task. If yes, the first task is
     * returned. If no, a new task is created and added to the processor.
     * 
     * Two entries are created for the task if it is newly created: A wait entry and a signal entry.
     * The entry ids are created using {@link #getSignalEntryId(String)} and
     * {@link #getWaitEntryId(String)} (use these for accessing the entries, using the id of the
     * passive resource).
     * 
     * The multiplicity of the task are set to the passed capacity.
     * 
     * @param id
     *            The id of the {@link PassiveResource}
     * @param pt
     * @param capacity
     *            The {@link PassiveResource}'s capacity
     * @return
     */
    public TaskType addSemaphoreTask(final String id, final ProcessorType pt, final int capacity) {

        final TaskType tt = addTask(id, pt);

        // if this task has been newly created, it has no semaphore scheduling yet
        // and thus needs to be initialised.
        if (!tt.getScheduling().equals(TaskSchedulingType.SEMAPHORE)) {

            // set this task to be a semaphore (see LQN userman Sec. 3.2.3)
            tt.setScheduling(TaskSchedulingType.SEMAPHORE);
            // set the capacity (see LQN userman Sec. 1.1.2)
            tt.setMultiplicity(BigInteger.valueOf(capacity));

            final LqnFactory lqnFactory = LqnFactory.eINSTANCE;

            final EntryType wait = lqnFactory.createEntryType();
            wait.setName(Pcm2LqnHelper.getWaitEntryId(id));
            wait.setType(TypeType.PH1PH2);
            wait.setSemaphore(SemaphoreType.WAIT);
            tt.getEntry().add(wait);

            final ActivityPhasesType aptWait = this.addActivityPhases(id);
            final PhaseActivities paWait = this.addPhaseActivities(aptWait);
            wait.setEntryPhaseActivities(paWait);

            final EntryType signal = lqnFactory.createEntryType();
            signal.setName(Pcm2LqnHelper.getSignalEntryId(id));
            signal.setType(TypeType.PH1PH2);
            signal.setSemaphore(SemaphoreType.SIGNAL);
            tt.getEntry().add(signal);

            final ActivityPhasesType aptSignal = this.addActivityPhases(id);
            final PhaseActivities paSignal = this.addPhaseActivities(aptSignal);
            signal.setEntryPhaseActivities(paSignal);

        }
        return tt;

    }

    /**
     * Checks whether the passed {@link ProcessorType} contains a task. If yes, the first task is
     * returned. If no, a new task is created and added to the processor.
     * 
     * @param id
     * @param pt
     * @return
     */
    public TaskType addTask(final String id, final ProcessorType pt) {

        TaskType tt = null;
        if (!pt.getTask().isEmpty()) {
            tt = pt.getTask().get(0);
        }
        if (tt == null) {
            tt = this.lqnFactory.createTaskType();
            tt.setName(id + "_Task");
            tt.setMultiplicity(new BigInteger("1"));

            tt.setThinkTime("0.0");
            tt.setActivityGraph(TaskOptionType.YES);

            if (this.isInfiniteTaskMultiplicity) {
                tt.setScheduling(TaskSchedulingType.INF);
            } else {
                tt.setScheduling(TaskSchedulingType.FCFS);
                tt.setMultiplicity(new BigInteger("10000"));
            }

            final ServiceType st = this.lqnFactory.createServiceType();
            st.setName("MyService");
            tt.getService().add(st);

            pt.getTask().add(tt);
        }
        return tt;
    }

    public TaskType addTaskForResourceDemand(final String id, final ProcessorType pt) {

        TaskType tt = null;
        if (!pt.getTask().isEmpty()) {
            final EList<TaskType> taskList = pt.getTask();
            for (final TaskType t : taskList) {
                if (t.getName().equals(id + "_Task")) {
                    return t;
                }
            }
        }
        if (tt == null) {
            tt = this.lqnFactory.createTaskType();
            tt.setName(id + "_Task");
            tt.setMultiplicity(new BigInteger("1"));

            tt.setThinkTime("0.0");
            tt.setScheduling(TaskSchedulingType.FCFS);
            tt.setActivityGraph(TaskOptionType.YES);

            final ServiceType st = this.lqnFactory.createServiceType();
            st.setName("MyService");
            tt.getService().add(st);

            pt.getTask().add(tt);
        }
        return tt;
    }

    public EntryType addEntry(final String id, final TaskType tt) {
        EntryType et = getEntryTypeFromTask(id, tt);
        if (et == null) {
            et = this.lqnFactory.createEntryType();
            et.setName(id + "_Entry");
            et.setType(TypeType.NONE); // actually TypeType.GRAPH, but not
            // supported by lqns
            tt.getEntry().add(et);
        }
        return et;
    }

    public TaskActivityGraph addTaskActivityGraph(final TaskType tt) {
        TaskActivityGraph taskActivityGraph = tt.getTaskActivities();
        if (taskActivityGraph == null) {
            taskActivityGraph = this.lqnFactory.createTaskActivityGraph();
            tt.setTaskActivities(taskActivityGraph);
        }
        this.taskGraphStack.push(taskActivityGraph);
        return taskActivityGraph;
    }

    public OutputEntryDistributionType addOutputEntryDistributionType(final EntryType et) {
        final OutputEntryDistributionType oedt = this.lqnFactory.createOutputEntryDistributionType();
        oedt.setPhase(new BigInteger("1"));
        oedt.setMin("0.0");
        oedt.setMax("10.0");
        et.getServiceTimeDistribution().add(oedt);
        return oedt;
    }

    public ReplyActivityType addReplyActivity(final String id, final String startId, final String stopId) {
        final EList<ReplyEntryType> list = this.taskGraphStack.peek().getReplyEntry();
        if (list.size() > 0) {
            return list.get(0).getReplyActivity().get(0);
        }

        final ReplyActivityType rat = this.lqnFactory.createReplyActivityType();
        // rat.setName((String)doSwitch(getStartAction(sb)));
        rat.setName(stopId);

        final ReplyEntryType ret = this.lqnFactory.createReplyEntryType();
        ret.setName(id + "_Entry");
        ret.getReplyActivity().add(rat);
        this.taskGraphStack.peek().getReplyEntry().add(ret);
        return rat;
    }

    public PrecedenceType addSequencePrecedence(final String firstId, final String secondId) {
        final EList<PrecedenceType> list = this.taskGraphStack.peek().getPrecedence();
        for (final PrecedenceType precType : list) {
            final SingleActivityListType salt = precType.getPre();
            if (salt != null) {
                if (salt.getActivity().getName().equals(firstId)) {
                    return precType;
                }
            }
        }

        final PrecedenceType pt = this.lqnFactory.createPrecedenceType();

        final SingleActivityListType saltPre = this.lqnFactory.createSingleActivityListType();
        final ActivityType atPre = this.lqnFactory.createActivityType();
        atPre.setName(firstId);
        saltPre.setActivity(atPre);

        final SingleActivityListType saltPost = this.lqnFactory.createSingleActivityListType();
        final ActivityType atPost = this.lqnFactory.createActivityType();
        atPost.setName(secondId);
        saltPost.setActivity(atPost);

        pt.setPre(saltPre);
        pt.setPost(saltPost);

        this.taskGraphStack.peek().getPrecedence().add(pt);
        return pt;
    }

    public ActivityDefType addActivityDef(final String id) {
        final EList<ActivityDefType> list = this.taskGraphStack.peek().getActivity();
        for (final ActivityDefType actDefType : list) {
            if (actDefType.getName().equals(id))
                return actDefType;
        }

        final ActivityDefType adt = this.lqnFactory.createActivityDefType();
        adt.setHostDemandMean("0.0");
        adt.setName(id);
        this.taskGraphStack.peek().getActivity().add(adt);
        return adt;
    }

    /**
     * Add or reuse an activity making call with call means = 1.0
     * 
     * @param callId
     * @param targetId
     * @param callType
     * @return
     */
    public ActivityMakingCallType addActivityMakingCall(final String callId, final String targetId,
            final CallType callType) {
        return addActivityMakingCall(callId, targetId, callType, 1.0);
    }

    /**
     * Add or reuse an activity making call
     * 
     * @param callId
     * @param targetId
     * @param callType
     * @param callMeans
     * @return
     */
    public ActivityMakingCallType addActivityMakingCall(final String callId, final String targetId,
            final CallType callType, final double callMeans) {
        final EList<ActivityDefType> actList = this.taskGraphStack.peek().getActivity();
        // check the existing ActivityMakingCallTypes and possibly reuse one of them
        for (final ActivityDefType actDefType : actList) {
            if (actDefType.getName().equals(callId)) {
                EList<ActivityMakingCallType> list2 = null;
                if (callType == CallType.SYNCH) {
                    list2 = actDefType.getSynchCall();
                } else {
                    list2 = actDefType.getAsynchCall();
                }
                for (final ActivityMakingCallType amct : list2) {
                    if (amct.getDest().equals(targetId)) {
                        // should not be incremented when this part of the system is just revisited
                        // due to parameters in different contexts / or replication
                        // amct.setCallsMean(""+(getDoubleFromValue(amct.getCallsMean())+callMeans));
                        amct.setCallsMean("1.0");
                        return amct;
                    }
                }
            }
        }

        // no existing matching ActivityMakingCallType found, use a new one.
        final ActivityMakingCallType amct = this.lqnFactory.createActivityMakingCallType();
        amct.setDest(targetId);
        amct.setCallsMean("" + callMeans);

        final EList<ActivityDefType> list = this.taskGraphStack.peek().getActivity();
        for (final ActivityDefType adt : list) {
            if (adt.getName().equals(callId)) {
                if (callType == CallType.SYNCH) {
                    adt.getSynchCall().add(amct);
                } else {
                    adt.getAsynchCall().add(amct);
                }
            }
        }

        return amct;
    }

    private double getDoubleFromValue(final Object callsMean) {
        if (callsMean instanceof String) {
            return Double.valueOf((String) callsMean);
        }
        if (callsMean instanceof Double) {
            return ((Double) callsMean).doubleValue();
        } else {
            throw new RuntimeException(
                    "Cannot parse LQN value " + callsMean.getClass().getName() + " " + callsMean.toString());
        }

    }

    public PrecedenceType addBeginBranchPrecedence(final String id) {
        final EList<PrecedenceType> list = this.taskGraphStack.peek().getPrecedence();
        for (final PrecedenceType precType : list) {
            if (precType.getPre() != null) {
                if (precType.getPre().getActivity().getName().equals(id)) {
                    return precType;
                }
            }
        }

        final PrecedenceType ptBegin = getInitialPrecedence(id);

        final OrListType oltPreBegin = this.lqnFactory.createOrListType(); // branch
        ptBegin.setPostOR(oltPreBegin);
        this.taskGraphStack.peek().getPrecedence().add(ptBegin);

        return ptBegin;
    }

    private PrecedenceType getInitialPrecedence(final String id) {
        final PrecedenceType ptBegin = this.lqnFactory.createPrecedenceType();
        final SingleActivityListType saltPreBegin = this.lqnFactory.createSingleActivityListType();
        final ActivityType atPre = this.lqnFactory.createActivityType();
        atPre.setName(id);
        saltPreBegin.setActivity(atPre);
        ptBegin.setPre(saltPreBegin);
        return ptBegin;
    }

    public PrecedenceType addBeginForkPrecedence(final String id) {
        final EList<PrecedenceType> list = this.taskGraphStack.peek().getPrecedence();
        for (final PrecedenceType precType : list) {
            if (precType.getPre() != null) {
                if (precType.getPre().getActivity().getName().equals(id)) {
                    return precType;
                }
            }
        }

        final PrecedenceType ptBegin = getInitialPrecedence(id);

        final ActivityListType alt = this.lqnFactory.createActivityListType();
        ptBegin.setPostAND(alt);
        this.taskGraphStack.peek().getPrecedence().add(ptBegin);
        return ptBegin;
    }

    public PrecedenceType addEndForkPrecedence() {
        final PrecedenceType ptEnd = this.lqnFactory.createPrecedenceType();
        final AndJoinListType ajlt = this.lqnFactory.createAndJoinListType();
        ptEnd.setPreAND(ajlt);

        final SingleActivityListType saltPostEnd = this.lqnFactory.createSingleActivityListType();
        final ActivityType atPostEnd = this.lqnFactory.createActivityType();
        saltPostEnd.setActivity(atPostEnd);

        ptEnd.setPost(saltPostEnd);
        this.taskGraphStack.peek().getPrecedence().add(ptEnd);
        return ptEnd;
    }

    public PrecedenceType addEndBranchPrecedence() {
        final PrecedenceType ptEnd = this.lqnFactory.createPrecedenceType();
        final ActivityListType altPreEnd = this.lqnFactory.createActivityListType(); // merge
        ptEnd.setPreOR(altPreEnd);

        final SingleActivityListType saltPostEnd = this.lqnFactory.createSingleActivityListType();
        final ActivityType atPostEnd = this.lqnFactory.createActivityType();
        // atPostEnd.setName(successorId);
        saltPostEnd.setActivity(atPostEnd);

        ptEnd.setPost(saltPostEnd);
        this.taskGraphStack.peek().getPrecedence().add(ptEnd);
        return ptEnd;
    }

    public ActivityOrType addActivityOrType(final String startId, final String branchProb, final PrecedenceType pt) {
        final EList<ActivityOrType> list = pt.getPostOR().getActivity();
        for (final ActivityOrType aot : list) {
            if (aot.getName().equals(startId))
                return aot;
        }

        final ActivityOrType aot = this.lqnFactory.createActivityOrType();
        aot.setProb(branchProb);
        aot.setName(startId);
        pt.getPostOR().getActivity().add(aot);
        return aot;
    }

    public ActivityType addActivityType(final String stopId, final PrecedenceType pt) {
        final EList<ActivityType> list = pt.getPreOR().getActivity();
        for (final ActivityType at : list) {
            if (at.getName().equals(stopId))
                return at;
        }

        final ActivityType at = this.lqnFactory.createActivityType();
        at.setName(stopId);
        pt.getPreOR().getActivity().add(at);
        return at;
    }

    public PhaseActivities addPhaseActivities(final ActivityPhasesType apt) {
        final PhaseActivities pa = this.lqnFactory.createPhaseActivities();
        pa.getActivity().add(apt);
        return pa;
    }

    public ActivityPhasesType addActivityPhases(final String id) {
        final ActivityPhasesType apt = this.lqnFactory.createActivityPhasesType();
        apt.setHostDemandMean("0.0");
        apt.setPhase(new BigInteger("1"));
        apt.setName(id + "_Activity");
        return apt;
    }

    public TaskType getTaskForProcessor(final String processorId) {
        final EList<ProcessorType> list = this.lqnModel.getProcessor();
        for (final ProcessorType pt : list) {
            if (pt.getName().equals(processorId + "_Processor")) {
                return pt.getTask().get(0);
            }
        }
        logger.error("Could not find processor in Lqn Model.");
        return null;
    }

    public void finalizeLqnModel(final PCMSolverWorkflowRunConfiguration config) {

        // Two branches may generated two precedences with exactly
        // the same activities, which causes errors in the lqn solver.
        // this one needs to be deleted.
        // This can happen if this SEFF is called from multiple contexts.
        // TODO: should we not be able to distinguish multiple contexts?
        final List<ProcessorType> processors = this.lqnModel.getProcessor();
        // We want to compare the precedences for all processors and all their
        // activities
        for (final ProcessorType processorType : processors) {
            if (processorType == null)
                continue;
            final List<TaskType> tasks = processorType.getTask();
            for (final TaskType taskType : tasks) {
                if (taskType == null)
                    continue;
                final TaskActivityGraph taskActivityGraph = taskType.getTaskActivities();
                if (taskActivityGraph == null)
                    continue;
                final List<PrecedenceType> precedences = taskActivityGraph.getPrecedence();
                // Compare each precedence entry with each other. We only
                // compare the pre entries.
                for (int i = 0; i < precedences.size() - 1; i++) {
                    // using an temporary variable here for iteration to avoid
                    // concurrent modification exceptions.
                    // Size is checked again each time, so this should be safe.
                    final PrecedenceType precedenceType = precedences.get(i);
                    // Only compare with the ones further down in the list, so
                    // we compare each pair just once.
                    for (final ListIterator<PrecedenceType> iteratorToCompareTo = precedences
                            .listIterator(i + 1); iteratorToCompareTo.hasNext();) {
                        // using an iterator here to be able to directly remove
                        // a found duplicate element.
                        final PrecedenceType precedenceTypeToCompareTo = iteratorToCompareTo.next();
                        // logger.debug("comparing item "+i+" with item "+nextIndex);
                        if (duplicatePrecedence(precedenceType, precedenceTypeToCompareTo)) {
                            iteratorToCompareTo.remove();
                            // logger.warn("removed precedence with index "+nextIndex);
                        }

                    }
                }
            }
        }

        final SolverParamsType spt = LqnFactory.eINSTANCE.createSolverParamsType();

        spt.setConvVal(config.getConvValue());

        final int itLimit = Integer.parseInt(config.getItLimit());
        spt.setItLimit(itLimit);

        final int printInt = Integer.parseInt(config.getPrintInt());
        spt.setPrintInt(printInt);

        spt.setUnderrelaxCoeff(config.getUnderCoeff());

        spt.setComment("Generated by PCM2LQN on " + new Date());

        this.lqnModel.setSolverParams(spt);

    }

    /**
     * Checks whether all pre entries of the precedence are different.
     * 
     * @param precedenceType
     * @param precedenceTypeToCompareTo
     * @return
     */
    private boolean duplicatePrecedence(final PrecedenceType precedenceType,
            final PrecedenceType precedenceTypeToCompareTo) {

        boolean same = false;

        // first compare normal pre
        if (precedenceType.getPre() != null && precedenceTypeToCompareTo.getPre() != null
                && precedenceType.getPre().getActivity() != null
                && precedenceTypeToCompareTo.getPre().getActivity() != null) {
            if (precedenceType.getPre().getActivity().getName()
                    .equals(precedenceTypeToCompareTo.getPre().getActivity().getName())) {
                same = true;
            }
        }

        // compare pre-AND
        if (precedenceType.getPreAND() != null && precedenceTypeToCompareTo.getPreAND() != null) {
            final List<ActivityType> activityList = precedenceType.getPreAND().getActivity();
            final List<ActivityType> activityListToCompareTo = precedenceTypeToCompareTo.getPreAND().getActivity();
            if (listContainsSameActivities(activityList, activityListToCompareTo))
                same = true;
        }

        // compare pre-OR
        if (precedenceType.getPreOR() != null && precedenceTypeToCompareTo.getPreOR() != null) {
            final List<ActivityType> activityList = precedenceType.getPreOR().getActivity();
            final List<ActivityType> activityListToCompareTo = precedenceTypeToCompareTo.getPreOR().getActivity();
            if (listContainsSameActivities(activityList, activityListToCompareTo))
                same = true;
        }
        return same;
    }

    private boolean listContainsSameActivities(final List<ActivityType> activityList,
            final List<ActivityType> activityListToCompareTo) {
        if (activityList == null || activityListToCompareTo == null || activityList.size() == 0
                || activityListToCompareTo.size() != activityList.size()) {
            return false;
        }
        for (int i = 0; i < activityList.size(); i++) {
            final ActivityType activity1 = activityList.get(i);
            final ActivityType activity2 = activityListToCompareTo.get(i);
            if (!activity1.getName().equals(activity2.getName())) {
                return false;
            }
        }
        return true;
    }

    public void restoreFormerTaskActivityGraph() {
        this.taskGraphStack.pop();
    }

    public LqnModelType getLqnModel() {
        return this.lqnModel;
    }

    public ProcessorType getProcessor(final String processorId) {
        final EList<ProcessorType> list = this.lqnModel.getProcessor();
        for (final ProcessorType pt : list) {
            if (pt.getName().equals(processorId + "_Processor")) {
                return pt;
            }
        }
        return null;
    }

    public boolean isLQSimAnalysis() {
        return this.isLQSimAnalysis;
    }

    public void setIsLQSimAnalysis(final boolean isQLSim) {
        this.isLQSimAnalysis = isQLSim;
        Pcm2LqnHelper.shortenIds = this.isLQSimAnalysis;
    }

    public void addActivityToPostAnd(final String startId, final PrecedenceType ptBegin) {
        final ActivityType at = this.lqnFactory.createActivityType();
        at.setName(startId);
        ptBegin.getPostAND().getActivity().add(at);
    }

    public void addActivityToPreAnd(final String stopId, final PrecedenceType ptEnd) {
        final ActivityType at = this.lqnFactory.createActivityType();
        at.setName(stopId);
        ptEnd.getPreAND().getActivity().add(at);
    }

    public void setPoolCapacity(final Integer poolCapacity) {
        final TaskActivityGraph tag = this.taskGraphStack.peek();
        final TaskType task = (TaskType) tag.eContainer();
        task.setMultiplicity(new BigInteger(poolCapacity.toString()));
        task.setScheduling(TaskSchedulingType.FCFS);
    }

}

enum CallType {
    SYNCH, ASYNCH
}
