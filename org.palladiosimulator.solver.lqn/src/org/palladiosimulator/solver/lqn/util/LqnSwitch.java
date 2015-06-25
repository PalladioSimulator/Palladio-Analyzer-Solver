/**
 */
package org.palladiosimulator.solver.lqn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.solver.lqn.ActivityDefBase;
import org.palladiosimulator.solver.lqn.ActivityDefType;
import org.palladiosimulator.solver.lqn.ActivityGraphBase;
import org.palladiosimulator.solver.lqn.ActivityListType;
import org.palladiosimulator.solver.lqn.ActivityLoopListType;
import org.palladiosimulator.solver.lqn.ActivityLoopType;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.ActivityOrType;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.ActivityType;
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.AsynchCallType;
import org.palladiosimulator.solver.lqn.BindType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.DocumentRoot;
import org.palladiosimulator.solver.lqn.EntryActivityDefType;
import org.palladiosimulator.solver.lqn.EntryActivityGraph;
import org.palladiosimulator.solver.lqn.EntryMakingCallType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.FirstPlotType;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnCoreType;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.MakingCallType;
import org.palladiosimulator.solver.lqn.OrListType;
import org.palladiosimulator.solver.lqn.OutPortType;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultForwardingANDJoinDelay;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.ParaType;
import org.palladiosimulator.solver.lqn.ParameterType;
import org.palladiosimulator.solver.lqn.PhaseActivities;
import org.palladiosimulator.solver.lqn.PlotControlType;
import org.palladiosimulator.solver.lqn.PlotType;
import org.palladiosimulator.solver.lqn.PortBindingType;
import org.palladiosimulator.solver.lqn.PragmaType;
import org.palladiosimulator.solver.lqn.PrecedenceType;
import org.palladiosimulator.solver.lqn.ProcessorBindingType;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.ReplyActivityType;
import org.palladiosimulator.solver.lqn.ReplyEntryType;
import org.palladiosimulator.solver.lqn.ResultConf95Type;
import org.palladiosimulator.solver.lqn.ResultConf95Type1;
import org.palladiosimulator.solver.lqn.ResultConf99Type;
import org.palladiosimulator.solver.lqn.ResultConf99Type1;
import org.palladiosimulator.solver.lqn.ResultGeneralType;
import org.palladiosimulator.solver.lqn.RunControlType;
import org.palladiosimulator.solver.lqn.ServiceType;
import org.palladiosimulator.solver.lqn.SingleActivityListType;
import org.palladiosimulator.solver.lqn.SlotType;
import org.palladiosimulator.solver.lqn.SolverParamsType;
import org.palladiosimulator.solver.lqn.SynchCallType;
import org.palladiosimulator.solver.lqn.TaskActivityGraph;
import org.palladiosimulator.solver.lqn.TaskType;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage
 * @generated
 */
public class LqnSwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static LqnPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LqnSwitch() {
        if (modelPackage == null)
        {
            modelPackage = LqnPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID)
        {
        case LqnPackage.ACTIVITY_DEF_BASE: {
            final ActivityDefBase activityDefBase = (ActivityDefBase) theEObject;
            T result = this.caseActivityDefBase(activityDefBase);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_DEF_TYPE: {
            final ActivityDefType activityDefType = (ActivityDefType) theEObject;
            T result = this.caseActivityDefType(activityDefType);
            if (result == null) {
                result = this.caseActivityDefBase(activityDefType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_GRAPH_BASE: {
            final ActivityGraphBase activityGraphBase = (ActivityGraphBase) theEObject;
            T result = this.caseActivityGraphBase(activityGraphBase);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_LIST_TYPE: {
            final ActivityListType activityListType = (ActivityListType) theEObject;
            T result = this.caseActivityListType(activityListType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE: {
            final ActivityLoopListType activityLoopListType = (ActivityLoopListType) theEObject;
            T result = this.caseActivityLoopListType(activityLoopListType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_LOOP_TYPE: {
            final ActivityLoopType activityLoopType = (ActivityLoopType) theEObject;
            T result = this.caseActivityLoopType(activityLoopType);
            if (result == null) {
                result = this.caseActivityType(activityLoopType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE: {
            final ActivityMakingCallType activityMakingCallType = (ActivityMakingCallType) theEObject;
            T result = this.caseActivityMakingCallType(activityMakingCallType);
            if (result == null) {
                result = this.caseMakingCallType(activityMakingCallType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_OR_TYPE: {
            final ActivityOrType activityOrType = (ActivityOrType) theEObject;
            T result = this.caseActivityOrType(activityOrType);
            if (result == null) {
                result = this.caseActivityType(activityOrType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_PHASES_TYPE: {
            final ActivityPhasesType activityPhasesType = (ActivityPhasesType) theEObject;
            T result = this.caseActivityPhasesType(activityPhasesType);
            if (result == null) {
                result = this.caseActivityDefBase(activityPhasesType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ACTIVITY_TYPE: {
            final ActivityType activityType = (ActivityType) theEObject;
            T result = this.caseActivityType(activityType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.AND_JOIN_LIST_TYPE: {
            final AndJoinListType andJoinListType = (AndJoinListType) theEObject;
            T result = this.caseAndJoinListType(andJoinListType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ASYNCH_CALL_TYPE: {
            final AsynchCallType asynchCallType = (AsynchCallType) theEObject;
            T result = this.caseAsynchCallType(asynchCallType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.BIND_TYPE: {
            final BindType bindType = (BindType) theEObject;
            T result = this.caseBindType(bindType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.CALL_LIST_TYPE: {
            final CallListType callListType = (CallListType) theEObject;
            T result = this.caseCallListType(callListType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.DOCUMENT_ROOT: {
            final DocumentRoot documentRoot = (DocumentRoot) theEObject;
            T result = this.caseDocumentRoot(documentRoot);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE: {
            final EntryActivityDefType entryActivityDefType = (EntryActivityDefType) theEObject;
            T result = this.caseEntryActivityDefType(entryActivityDefType);
            if (result == null) {
                result = this.caseActivityDefBase(entryActivityDefType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ENTRY_ACTIVITY_GRAPH: {
            final EntryActivityGraph entryActivityGraph = (EntryActivityGraph) theEObject;
            T result = this.caseEntryActivityGraph(entryActivityGraph);
            if (result == null) {
                result = this.caseActivityGraphBase(entryActivityGraph);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ENTRY_MAKING_CALL_TYPE: {
            final EntryMakingCallType entryMakingCallType = (EntryMakingCallType) theEObject;
            T result = this.caseEntryMakingCallType(entryMakingCallType);
            if (result == null) {
                result = this.caseMakingCallType(entryMakingCallType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.ENTRY_TYPE: {
            final EntryType entryType = (EntryType) theEObject;
            T result = this.caseEntryType(entryType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.FIRST_PLOT_TYPE: {
            final FirstPlotType firstPlotType = (FirstPlotType) theEObject;
            T result = this.caseFirstPlotType(firstPlotType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.HISTOGRAM_BIN_TYPE: {
            final HistogramBinType histogramBinType = (HistogramBinType) theEObject;
            T result = this.caseHistogramBinType(histogramBinType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.IN_PORT_TYPE: {
            final InPortType inPortType = (InPortType) theEObject;
            T result = this.caseInPortType(inPortType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.INTERFACE_TYPE: {
            final InterfaceType interfaceType = (InterfaceType) theEObject;
            T result = this.caseInterfaceType(interfaceType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.LQN_CORE_TYPE: {
            final LqnCoreType lqnCoreType = (LqnCoreType) theEObject;
            T result = this.caseLqnCoreType(lqnCoreType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.LQN_MODEL_TYPE: {
            final LqnModelType lqnModelType = (LqnModelType) theEObject;
            T result = this.caseLqnModelType(lqnModelType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.MAKING_CALL_TYPE: {
            final MakingCallType makingCallType = (MakingCallType) theEObject;
            T result = this.caseMakingCallType(makingCallType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.OR_LIST_TYPE: {
            final OrListType orListType = (OrListType) theEObject;
            T result = this.caseOrListType(orListType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.OUT_PORT_TYPE: {
            final OutPortType outPortType = (OutPortType) theEObject;
            T result = this.caseOutPortType(outPortType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE: {
            final OutputDistributionType outputDistributionType = (OutputDistributionType) theEObject;
            T result = this.caseOutputDistributionType(outputDistributionType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE: {
            final OutputEntryDistributionType outputEntryDistributionType = (OutputEntryDistributionType) theEObject;
            T result = this.caseOutputEntryDistributionType(outputEntryDistributionType);
            if (result == null) {
                result = this.caseOutputDistributionType(outputEntryDistributionType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY: {
            final OutputResultForwardingANDJoinDelay outputResultForwardingANDJoinDelay = (OutputResultForwardingANDJoinDelay) theEObject;
            T result = this.caseOutputResultForwardingANDJoinDelay(outputResultForwardingANDJoinDelay);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.OUTPUT_RESULT_TYPE: {
            final OutputResultType outputResultType = (OutputResultType) theEObject;
            T result = this.caseOutputResultType(outputResultType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PARAMETER_TYPE: {
            final ParameterType parameterType = (ParameterType) theEObject;
            T result = this.caseParameterType(parameterType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PARA_TYPE: {
            final ParaType paraType = (ParaType) theEObject;
            T result = this.caseParaType(paraType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PHASE_ACTIVITIES: {
            final PhaseActivities phaseActivities = (PhaseActivities) theEObject;
            T result = this.casePhaseActivities(phaseActivities);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PLOT_CONTROL_TYPE: {
            final PlotControlType plotControlType = (PlotControlType) theEObject;
            T result = this.casePlotControlType(plotControlType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PLOT_TYPE: {
            final PlotType plotType = (PlotType) theEObject;
            T result = this.casePlotType(plotType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PORT_BINDING_TYPE: {
            final PortBindingType portBindingType = (PortBindingType) theEObject;
            T result = this.casePortBindingType(portBindingType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PRAGMA_TYPE: {
            final PragmaType pragmaType = (PragmaType) theEObject;
            T result = this.casePragmaType(pragmaType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PRECEDENCE_TYPE: {
            final PrecedenceType precedenceType = (PrecedenceType) theEObject;
            T result = this.casePrecedenceType(precedenceType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PROCESSOR_BINDING_TYPE: {
            final ProcessorBindingType processorBindingType = (ProcessorBindingType) theEObject;
            T result = this.caseProcessorBindingType(processorBindingType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.PROCESSOR_TYPE: {
            final ProcessorType processorType = (ProcessorType) theEObject;
            T result = this.caseProcessorType(processorType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.REPLY_ACTIVITY_TYPE: {
            final ReplyActivityType replyActivityType = (ReplyActivityType) theEObject;
            T result = this.caseReplyActivityType(replyActivityType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.REPLY_ENTRY_TYPE: {
            final ReplyEntryType replyEntryType = (ReplyEntryType) theEObject;
            T result = this.caseReplyEntryType(replyEntryType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.RESULT_CONF95_TYPE: {
            final ResultConf95Type resultConf95Type = (ResultConf95Type) theEObject;
            T result = this.caseResultConf95Type(resultConf95Type);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.RESULT_CONF95_TYPE1: {
            final ResultConf95Type1 resultConf95Type1 = (ResultConf95Type1) theEObject;
            T result = this.caseResultConf95Type1(resultConf95Type1);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.RESULT_CONF99_TYPE: {
            final ResultConf99Type resultConf99Type = (ResultConf99Type) theEObject;
            T result = this.caseResultConf99Type(resultConf99Type);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.RESULT_CONF99_TYPE1: {
            final ResultConf99Type1 resultConf99Type1 = (ResultConf99Type1) theEObject;
            T result = this.caseResultConf99Type1(resultConf99Type1);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.RESULT_GENERAL_TYPE: {
            final ResultGeneralType resultGeneralType = (ResultGeneralType) theEObject;
            T result = this.caseResultGeneralType(resultGeneralType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.RUN_CONTROL_TYPE: {
            final RunControlType runControlType = (RunControlType) theEObject;
            T result = this.caseRunControlType(runControlType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.SERVICE_TYPE: {
            final ServiceType serviceType = (ServiceType) theEObject;
            T result = this.caseServiceType(serviceType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE: {
            final SingleActivityListType singleActivityListType = (SingleActivityListType) theEObject;
            T result = this.caseSingleActivityListType(singleActivityListType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.SLOT_TYPE: {
            final SlotType slotType = (SlotType) theEObject;
            T result = this.caseSlotType(slotType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.SOLVER_PARAMS_TYPE: {
            final SolverParamsType solverParamsType = (SolverParamsType) theEObject;
            T result = this.caseSolverParamsType(solverParamsType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.SYNCH_CALL_TYPE: {
            final SynchCallType synchCallType = (SynchCallType) theEObject;
            T result = this.caseSynchCallType(synchCallType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.TASK_ACTIVITY_GRAPH: {
            final TaskActivityGraph taskActivityGraph = (TaskActivityGraph) theEObject;
            T result = this.caseTaskActivityGraph(taskActivityGraph);
            if (result == null) {
                result = this.caseActivityGraphBase(taskActivityGraph);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case LqnPackage.TASK_TYPE: {
            final TaskType taskType = (TaskType) theEObject;
            T result = this.caseTaskType(taskType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Def Base</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Def Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityDefBase(final ActivityDefBase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Def Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Def Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityDefType(final ActivityDefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Graph Base</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Graph Base</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityGraphBase(final ActivityGraphBase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity List Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity List Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityListType(final ActivityListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Activity Loop List Type</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Activity Loop List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityLoopListType(final ActivityLoopListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Loop Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Loop Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityLoopType(final ActivityLoopType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Activity Making Call Type</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Activity Making Call Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityMakingCallType(final ActivityMakingCallType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Or Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Or Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityOrType(final ActivityOrType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Activity Phases Type</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Activity Phases Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityPhasesType(final ActivityPhasesType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityType(final ActivityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>And Join List Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>And Join List Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAndJoinListType(final AndJoinListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynch Call Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynch Call Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchCallType(final AsynchCallType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bind Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bind Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBindType(final BindType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call List Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallListType(final CallListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(final DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Entry Activity Def Type</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Entry Activity Def Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryActivityDefType(final EntryActivityDefType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Entry Activity Graph</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Entry Activity Graph</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryActivityGraph(final EntryActivityGraph object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Entry Making Call Type</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Entry Making Call Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryMakingCallType(final EntryMakingCallType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryType(final EntryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>First Plot Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>First Plot Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFirstPlotType(final FirstPlotType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Histogram Bin Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Histogram Bin Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHistogramBinType(final HistogramBinType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>In Port Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>In Port Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInPortType(final InPortType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceType(final InterfaceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Core Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Core Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLqnCoreType(final LqnCoreType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLqnModelType(final LqnModelType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Making Call Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Making Call Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMakingCallType(final MakingCallType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Or List Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Or List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrListType(final OrListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Out Port Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Out Port Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutPortType(final OutPortType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Output Distribution Type</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Output Distribution Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputDistributionType(final OutputDistributionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Output Entry Distribution Type</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Output Entry Distribution Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputEntryDistributionType(final OutputEntryDistributionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Output Result Forwarding AND Join Delay</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Output Result Forwarding AND Join Delay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputResultForwardingANDJoinDelay(final OutputResultForwardingANDJoinDelay object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Result Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Result Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputResultType(final OutputResultType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterType(final ParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Para Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Para Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParaType(final ParaType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Activities</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Activities</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseActivities(final PhaseActivities object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plot Control Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plot Control Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlotControlType(final PlotControlType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plot Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plot Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlotType(final PlotType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port Binding Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePortBindingType(final PortBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pragma Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pragma Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePragmaType(final PragmaType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Precedence Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Precedence Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrecedenceType(final PrecedenceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Processor Binding Type</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Processor Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorBindingType(final ProcessorBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorType(final ProcessorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reply Activity Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reply Activity Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReplyActivityType(final ReplyActivityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reply Entry Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reply Entry Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReplyEntryType(final ReplyEntryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result Conf95 Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result Conf95 Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultConf95Type(final ResultConf95Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result Conf95 Type1</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result Conf95 Type1</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultConf95Type1(final ResultConf95Type1 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result Conf99 Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result Conf99 Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultConf99Type(final ResultConf99Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result Conf99 Type1</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result Conf99 Type1</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultConf99Type1(final ResultConf99Type1 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result General Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result General Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultGeneralType(final ResultGeneralType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Run Control Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Run Control Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRunControlType(final RunControlType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceType(final ServiceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Single Activity List Type</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Single Activity List Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleActivityListType(final SingleActivityListType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Slot Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Slot Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSlotType(final SlotType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Solver Params Type</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Solver Params Type</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSolverParamsType(final SolverParamsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synch Call Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synch Call Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchCallType(final SynchCallType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task Activity Graph</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task Activity Graph</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaskActivityGraph(final TaskActivityGraph object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaskType(final TaskType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // LqnSwitch
