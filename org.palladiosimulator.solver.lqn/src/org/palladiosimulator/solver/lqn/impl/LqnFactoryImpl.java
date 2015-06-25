/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.palladiosimulator.solver.lqn.AxisType;
import org.palladiosimulator.solver.lqn.BindType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.CallOrderType;
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
import org.palladiosimulator.solver.lqn.LqnFactory;
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
import org.palladiosimulator.solver.lqn.SchedulingType;
import org.palladiosimulator.solver.lqn.SemaphoreType;
import org.palladiosimulator.solver.lqn.ServiceType;
import org.palladiosimulator.solver.lqn.SingleActivityListType;
import org.palladiosimulator.solver.lqn.SlotType;
import org.palladiosimulator.solver.lqn.SolverParamsType;
import org.palladiosimulator.solver.lqn.SynchCallType;
import org.palladiosimulator.solver.lqn.TaskActivityGraph;
import org.palladiosimulator.solver.lqn.TaskOptionType;
import org.palladiosimulator.solver.lqn.TaskSchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;
import org.palladiosimulator.solver.lqn.TypeType;
import org.palladiosimulator.solver.lqn.ValidType;
import org.palladiosimulator.solver.lqn.XmlDebugType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class LqnFactoryImpl extends EFactoryImpl implements LqnFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static LqnFactory init() {
        try
        {
            final LqnFactory theLqnFactory = (LqnFactory) EPackage.Registry.INSTANCE.getEFactory(LqnPackage.eNS_URI);
            if (theLqnFactory != null)
            {
                return theLqnFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new LqnFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LqnFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID())
        {
        case LqnPackage.ACTIVITY_DEF_BASE:
            return this.createActivityDefBase();
        case LqnPackage.ACTIVITY_DEF_TYPE:
            return this.createActivityDefType();
        case LqnPackage.ACTIVITY_GRAPH_BASE:
            return this.createActivityGraphBase();
        case LqnPackage.ACTIVITY_LIST_TYPE:
            return this.createActivityListType();
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE:
            return this.createActivityLoopListType();
        case LqnPackage.ACTIVITY_LOOP_TYPE:
            return this.createActivityLoopType();
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE:
            return this.createActivityMakingCallType();
        case LqnPackage.ACTIVITY_OR_TYPE:
            return this.createActivityOrType();
        case LqnPackage.ACTIVITY_PHASES_TYPE:
            return this.createActivityPhasesType();
        case LqnPackage.ACTIVITY_TYPE:
            return this.createActivityType();
        case LqnPackage.AND_JOIN_LIST_TYPE:
            return this.createAndJoinListType();
        case LqnPackage.ASYNCH_CALL_TYPE:
            return this.createAsynchCallType();
        case LqnPackage.BIND_TYPE:
            return this.createBindType();
        case LqnPackage.CALL_LIST_TYPE:
            return this.createCallListType();
        case LqnPackage.DOCUMENT_ROOT:
            return this.createDocumentRoot();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE:
            return this.createEntryActivityDefType();
        case LqnPackage.ENTRY_ACTIVITY_GRAPH:
            return this.createEntryActivityGraph();
        case LqnPackage.ENTRY_MAKING_CALL_TYPE:
            return this.createEntryMakingCallType();
        case LqnPackage.ENTRY_TYPE:
            return this.createEntryType();
        case LqnPackage.FIRST_PLOT_TYPE:
            return this.createFirstPlotType();
        case LqnPackage.HISTOGRAM_BIN_TYPE:
            return this.createHistogramBinType();
        case LqnPackage.IN_PORT_TYPE:
            return this.createInPortType();
        case LqnPackage.INTERFACE_TYPE:
            return this.createInterfaceType();
        case LqnPackage.LQN_CORE_TYPE:
            return this.createLqnCoreType();
        case LqnPackage.LQN_MODEL_TYPE:
            return this.createLqnModelType();
        case LqnPackage.MAKING_CALL_TYPE:
            return this.createMakingCallType();
        case LqnPackage.OR_LIST_TYPE:
            return this.createOrListType();
        case LqnPackage.OUT_PORT_TYPE:
            return this.createOutPortType();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE:
            return this.createOutputDistributionType();
        case LqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE:
            return this.createOutputEntryDistributionType();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY:
            return this.createOutputResultForwardingANDJoinDelay();
        case LqnPackage.OUTPUT_RESULT_TYPE:
            return this.createOutputResultType();
        case LqnPackage.PARAMETER_TYPE:
            return this.createParameterType();
        case LqnPackage.PARA_TYPE:
            return this.createParaType();
        case LqnPackage.PHASE_ACTIVITIES:
            return this.createPhaseActivities();
        case LqnPackage.PLOT_CONTROL_TYPE:
            return this.createPlotControlType();
        case LqnPackage.PLOT_TYPE:
            return this.createPlotType();
        case LqnPackage.PORT_BINDING_TYPE:
            return this.createPortBindingType();
        case LqnPackage.PRAGMA_TYPE:
            return this.createPragmaType();
        case LqnPackage.PRECEDENCE_TYPE:
            return this.createPrecedenceType();
        case LqnPackage.PROCESSOR_BINDING_TYPE:
            return this.createProcessorBindingType();
        case LqnPackage.PROCESSOR_TYPE:
            return this.createProcessorType();
        case LqnPackage.REPLY_ACTIVITY_TYPE:
            return this.createReplyActivityType();
        case LqnPackage.REPLY_ENTRY_TYPE:
            return this.createReplyEntryType();
        case LqnPackage.RESULT_CONF95_TYPE:
            return this.createResultConf95Type();
        case LqnPackage.RESULT_CONF95_TYPE1:
            return this.createResultConf95Type1();
        case LqnPackage.RESULT_CONF99_TYPE:
            return this.createResultConf99Type();
        case LqnPackage.RESULT_CONF99_TYPE1:
            return this.createResultConf99Type1();
        case LqnPackage.RESULT_GENERAL_TYPE:
            return this.createResultGeneralType();
        case LqnPackage.RUN_CONTROL_TYPE:
            return this.createRunControlType();
        case LqnPackage.SERVICE_TYPE:
            return this.createServiceType();
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE:
            return this.createSingleActivityListType();
        case LqnPackage.SLOT_TYPE:
            return this.createSlotType();
        case LqnPackage.SOLVER_PARAMS_TYPE:
            return this.createSolverParamsType();
        case LqnPackage.SYNCH_CALL_TYPE:
            return this.createSynchCallType();
        case LqnPackage.TASK_ACTIVITY_GRAPH:
            return this.createTaskActivityGraph();
        case LqnPackage.TASK_TYPE:
            return this.createTaskType();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID())
        {
        case LqnPackage.AXIS_TYPE:
            return this.createAxisTypeFromString(eDataType, initialValue);
        case LqnPackage.CALL_ORDER_TYPE:
            return this.createCallOrderTypeFromString(eDataType, initialValue);
        case LqnPackage.SCHEDULING_TYPE:
            return this.createSchedulingTypeFromString(eDataType, initialValue);
        case LqnPackage.SEMAPHORE_TYPE:
            return this.createSemaphoreTypeFromString(eDataType, initialValue);
        case LqnPackage.TASK_OPTION_TYPE:
            return this.createTaskOptionTypeFromString(eDataType, initialValue);
        case LqnPackage.TASK_SCHEDULING_TYPE:
            return this.createTaskSchedulingTypeFromString(eDataType, initialValue);
        case LqnPackage.TYPE_TYPE:
            return this.createTypeTypeFromString(eDataType, initialValue);
        case LqnPackage.VALID_TYPE:
            return this.createValidTypeFromString(eDataType, initialValue);
        case LqnPackage.XML_DEBUG_TYPE:
            return this.createXmlDebugTypeFromString(eDataType, initialValue);
        case LqnPackage.AXIS_TYPE_OBJECT:
            return this.createAxisTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.CALL_ORDER_TYPE_OBJECT:
            return this.createCallOrderTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.CONNECT_FROM_TYPE:
            return this.createConnectFromTypeFromString(eDataType, initialValue);
        case LqnPackage.CONNECT_TO_TYPE:
            return this.createConnectToTypeFromString(eDataType, initialValue);
        case LqnPackage.PHASE_TYPE:
            return this.createPhaseTypeFromString(eDataType, initialValue);
        case LqnPackage.SCHEDULING_TYPE_OBJECT:
            return this.createSchedulingTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.SCI_NOTATION:
            return this.createSciNotationFromString(eDataType, initialValue);
        case LqnPackage.SEMAPHORE_TYPE_OBJECT:
            return this.createSemaphoreTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.SRVN_FLOAT:
            return this.createSrvnFloatFromString(eDataType, initialValue);
        case LqnPackage.TASK_OPTION_TYPE_OBJECT:
            return this.createTaskOptionTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
            return this.createTaskSchedulingTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.TYPE_TYPE_OBJECT:
            return this.createTypeTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.VALID_TYPE_OBJECT:
            return this.createValidTypeObjectFromString(eDataType, initialValue);
        case LqnPackage.XML_DEBUG_TYPE_OBJECT:
            return this.createXmlDebugTypeObjectFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID())
        {
        case LqnPackage.AXIS_TYPE:
            return this.convertAxisTypeToString(eDataType, instanceValue);
        case LqnPackage.CALL_ORDER_TYPE:
            return this.convertCallOrderTypeToString(eDataType, instanceValue);
        case LqnPackage.SCHEDULING_TYPE:
            return this.convertSchedulingTypeToString(eDataType, instanceValue);
        case LqnPackage.SEMAPHORE_TYPE:
            return this.convertSemaphoreTypeToString(eDataType, instanceValue);
        case LqnPackage.TASK_OPTION_TYPE:
            return this.convertTaskOptionTypeToString(eDataType, instanceValue);
        case LqnPackage.TASK_SCHEDULING_TYPE:
            return this.convertTaskSchedulingTypeToString(eDataType, instanceValue);
        case LqnPackage.TYPE_TYPE:
            return this.convertTypeTypeToString(eDataType, instanceValue);
        case LqnPackage.VALID_TYPE:
            return this.convertValidTypeToString(eDataType, instanceValue);
        case LqnPackage.XML_DEBUG_TYPE:
            return this.convertXmlDebugTypeToString(eDataType, instanceValue);
        case LqnPackage.AXIS_TYPE_OBJECT:
            return this.convertAxisTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.CALL_ORDER_TYPE_OBJECT:
            return this.convertCallOrderTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.CONNECT_FROM_TYPE:
            return this.convertConnectFromTypeToString(eDataType, instanceValue);
        case LqnPackage.CONNECT_TO_TYPE:
            return this.convertConnectToTypeToString(eDataType, instanceValue);
        case LqnPackage.PHASE_TYPE:
            return this.convertPhaseTypeToString(eDataType, instanceValue);
        case LqnPackage.SCHEDULING_TYPE_OBJECT:
            return this.convertSchedulingTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.SCI_NOTATION:
            return this.convertSciNotationToString(eDataType, instanceValue);
        case LqnPackage.SEMAPHORE_TYPE_OBJECT:
            return this.convertSemaphoreTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.SRVN_FLOAT:
            return this.convertSrvnFloatToString(eDataType, instanceValue);
        case LqnPackage.TASK_OPTION_TYPE_OBJECT:
            return this.convertTaskOptionTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
            return this.convertTaskSchedulingTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.TYPE_TYPE_OBJECT:
            return this.convertTypeTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.VALID_TYPE_OBJECT:
            return this.convertValidTypeObjectToString(eDataType, instanceValue);
        case LqnPackage.XML_DEBUG_TYPE_OBJECT:
            return this.convertXmlDebugTypeObjectToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityDefBase createActivityDefBase() {
        final ActivityDefBaseImpl activityDefBase = new ActivityDefBaseImpl();
        return activityDefBase;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityDefType createActivityDefType() {
        final ActivityDefTypeImpl activityDefType = new ActivityDefTypeImpl();
        return activityDefType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityGraphBase createActivityGraphBase() {
        final ActivityGraphBaseImpl activityGraphBase = new ActivityGraphBaseImpl();
        return activityGraphBase;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityListType createActivityListType() {
        final ActivityListTypeImpl activityListType = new ActivityListTypeImpl();
        return activityListType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityLoopListType createActivityLoopListType() {
        final ActivityLoopListTypeImpl activityLoopListType = new ActivityLoopListTypeImpl();
        return activityLoopListType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityLoopType createActivityLoopType() {
        final ActivityLoopTypeImpl activityLoopType = new ActivityLoopTypeImpl();
        return activityLoopType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityMakingCallType createActivityMakingCallType() {
        final ActivityMakingCallTypeImpl activityMakingCallType = new ActivityMakingCallTypeImpl();
        return activityMakingCallType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityOrType createActivityOrType() {
        final ActivityOrTypeImpl activityOrType = new ActivityOrTypeImpl();
        return activityOrType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityPhasesType createActivityPhasesType() {
        final ActivityPhasesTypeImpl activityPhasesType = new ActivityPhasesTypeImpl();
        return activityPhasesType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityType createActivityType() {
        final ActivityTypeImpl activityType = new ActivityTypeImpl();
        return activityType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AndJoinListType createAndJoinListType() {
        final AndJoinListTypeImpl andJoinListType = new AndJoinListTypeImpl();
        return andJoinListType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AsynchCallType createAsynchCallType() {
        final AsynchCallTypeImpl asynchCallType = new AsynchCallTypeImpl();
        return asynchCallType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BindType createBindType() {
        final BindTypeImpl bindType = new BindTypeImpl();
        return bindType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CallListType createCallListType() {
        final CallListTypeImpl callListType = new CallListTypeImpl();
        return callListType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DocumentRoot createDocumentRoot() {
        final DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryActivityDefType createEntryActivityDefType() {
        final EntryActivityDefTypeImpl entryActivityDefType = new EntryActivityDefTypeImpl();
        return entryActivityDefType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryActivityGraph createEntryActivityGraph() {
        final EntryActivityGraphImpl entryActivityGraph = new EntryActivityGraphImpl();
        return entryActivityGraph;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryMakingCallType createEntryMakingCallType() {
        final EntryMakingCallTypeImpl entryMakingCallType = new EntryMakingCallTypeImpl();
        return entryMakingCallType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryType createEntryType() {
        final EntryTypeImpl entryType = new EntryTypeImpl();
        return entryType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FirstPlotType createFirstPlotType() {
        final FirstPlotTypeImpl firstPlotType = new FirstPlotTypeImpl();
        return firstPlotType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public HistogramBinType createHistogramBinType() {
        final HistogramBinTypeImpl histogramBinType = new HistogramBinTypeImpl();
        return histogramBinType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InPortType createInPortType() {
        final InPortTypeImpl inPortType = new InPortTypeImpl();
        return inPortType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InterfaceType createInterfaceType() {
        final InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
        return interfaceType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LqnCoreType createLqnCoreType() {
        final LqnCoreTypeImpl lqnCoreType = new LqnCoreTypeImpl();
        return lqnCoreType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LqnModelType createLqnModelType() {
        final LqnModelTypeImpl lqnModelType = new LqnModelTypeImpl();
        return lqnModelType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MakingCallType createMakingCallType() {
        final MakingCallTypeImpl makingCallType = new MakingCallTypeImpl();
        return makingCallType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OrListType createOrListType() {
        final OrListTypeImpl orListType = new OrListTypeImpl();
        return orListType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OutPortType createOutPortType() {
        final OutPortTypeImpl outPortType = new OutPortTypeImpl();
        return outPortType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OutputDistributionType createOutputDistributionType() {
        final OutputDistributionTypeImpl outputDistributionType = new OutputDistributionTypeImpl();
        return outputDistributionType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OutputEntryDistributionType createOutputEntryDistributionType() {
        final OutputEntryDistributionTypeImpl outputEntryDistributionType = new OutputEntryDistributionTypeImpl();
        return outputEntryDistributionType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OutputResultForwardingANDJoinDelay createOutputResultForwardingANDJoinDelay() {
        final OutputResultForwardingANDJoinDelayImpl outputResultForwardingANDJoinDelay = new OutputResultForwardingANDJoinDelayImpl();
        return outputResultForwardingANDJoinDelay;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OutputResultType createOutputResultType() {
        final OutputResultTypeImpl outputResultType = new OutputResultTypeImpl();
        return outputResultType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ParameterType createParameterType() {
        final ParameterTypeImpl parameterType = new ParameterTypeImpl();
        return parameterType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ParaType createParaType() {
        final ParaTypeImpl paraType = new ParaTypeImpl();
        return paraType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PhaseActivities createPhaseActivities() {
        final PhaseActivitiesImpl phaseActivities = new PhaseActivitiesImpl();
        return phaseActivities;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PlotControlType createPlotControlType() {
        final PlotControlTypeImpl plotControlType = new PlotControlTypeImpl();
        return plotControlType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PlotType createPlotType() {
        final PlotTypeImpl plotType = new PlotTypeImpl();
        return plotType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PortBindingType createPortBindingType() {
        final PortBindingTypeImpl portBindingType = new PortBindingTypeImpl();
        return portBindingType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PragmaType createPragmaType() {
        final PragmaTypeImpl pragmaType = new PragmaTypeImpl();
        return pragmaType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PrecedenceType createPrecedenceType() {
        final PrecedenceTypeImpl precedenceType = new PrecedenceTypeImpl();
        return precedenceType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ProcessorBindingType createProcessorBindingType() {
        final ProcessorBindingTypeImpl processorBindingType = new ProcessorBindingTypeImpl();
        return processorBindingType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ProcessorType createProcessorType() {
        final ProcessorTypeImpl processorType = new ProcessorTypeImpl();
        return processorType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ReplyActivityType createReplyActivityType() {
        final ReplyActivityTypeImpl replyActivityType = new ReplyActivityTypeImpl();
        return replyActivityType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ReplyEntryType createReplyEntryType() {
        final ReplyEntryTypeImpl replyEntryType = new ReplyEntryTypeImpl();
        return replyEntryType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultConf95Type createResultConf95Type() {
        final ResultConf95TypeImpl resultConf95Type = new ResultConf95TypeImpl();
        return resultConf95Type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultConf95Type1 createResultConf95Type1() {
        final ResultConf95Type1Impl resultConf95Type1 = new ResultConf95Type1Impl();
        return resultConf95Type1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultConf99Type createResultConf99Type() {
        final ResultConf99TypeImpl resultConf99Type = new ResultConf99TypeImpl();
        return resultConf99Type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultConf99Type1 createResultConf99Type1() {
        final ResultConf99Type1Impl resultConf99Type1 = new ResultConf99Type1Impl();
        return resultConf99Type1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultGeneralType createResultGeneralType() {
        final ResultGeneralTypeImpl resultGeneralType = new ResultGeneralTypeImpl();
        return resultGeneralType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RunControlType createRunControlType() {
        final RunControlTypeImpl runControlType = new RunControlTypeImpl();
        return runControlType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceType createServiceType() {
        final ServiceTypeImpl serviceType = new ServiceTypeImpl();
        return serviceType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SingleActivityListType createSingleActivityListType() {
        final SingleActivityListTypeImpl singleActivityListType = new SingleActivityListTypeImpl();
        return singleActivityListType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SlotType createSlotType() {
        final SlotTypeImpl slotType = new SlotTypeImpl();
        return slotType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SolverParamsType createSolverParamsType() {
        final SolverParamsTypeImpl solverParamsType = new SolverParamsTypeImpl();
        return solverParamsType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SynchCallType createSynchCallType() {
        final SynchCallTypeImpl synchCallType = new SynchCallTypeImpl();
        return synchCallType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TaskActivityGraph createTaskActivityGraph() {
        final TaskActivityGraphImpl taskActivityGraph = new TaskActivityGraphImpl();
        return taskActivityGraph;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TaskType createTaskType() {
        final TaskTypeImpl taskType = new TaskTypeImpl();
        return taskType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AxisType createAxisTypeFromString(final EDataType eDataType, final String initialValue) {
        final AxisType result = AxisType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertAxisTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CallOrderType createCallOrderTypeFromString(final EDataType eDataType, final String initialValue) {
        final CallOrderType result = CallOrderType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCallOrderTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SchedulingType createSchedulingTypeFromString(final EDataType eDataType, final String initialValue) {
        final SchedulingType result = SchedulingType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSchedulingTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SemaphoreType createSemaphoreTypeFromString(final EDataType eDataType, final String initialValue) {
        final SemaphoreType result = SemaphoreType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSemaphoreTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TaskOptionType createTaskOptionTypeFromString(final EDataType eDataType, final String initialValue) {
        final TaskOptionType result = TaskOptionType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTaskOptionTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TaskSchedulingType createTaskSchedulingTypeFromString(final EDataType eDataType, final String initialValue) {
        final TaskSchedulingType result = TaskSchedulingType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTaskSchedulingTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType createTypeTypeFromString(final EDataType eDataType, final String initialValue) {
        final TypeType result = TypeType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ValidType createValidTypeFromString(final EDataType eDataType, final String initialValue) {
        final ValidType result = ValidType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertValidTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public XmlDebugType createXmlDebugTypeFromString(final EDataType eDataType, final String initialValue) {
        final XmlDebugType result = XmlDebugType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertXmlDebugTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AxisType createAxisTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createAxisTypeFromString(LqnPackage.Literals.AXIS_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertAxisTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertAxisTypeToString(LqnPackage.Literals.AXIS_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CallOrderType createCallOrderTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createCallOrderTypeFromString(LqnPackage.Literals.CALL_ORDER_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCallOrderTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertCallOrderTypeToString(LqnPackage.Literals.CALL_ORDER_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public List<String> createConnectFromTypeFromString(final EDataType eDataType, final String initialValue) {
        if (initialValue == null) {
            return null;
        }
        final List<String> result = new ArrayList<String>();
        for (final String item : this.split(initialValue))
        {
            result.add((String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertConnectFromTypeToString(final EDataType eDataType, final Object instanceValue) {
        if (instanceValue == null) {
            return null;
        }
        final List<?> list = (List<?>) instanceValue;
        if (list.isEmpty()) {
            return "";
        }
        final StringBuffer result = new StringBuffer();
        for (final Object item : list)
        {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public List<String> createConnectToTypeFromString(final EDataType eDataType, final String initialValue) {
        if (initialValue == null) {
            return null;
        }
        final List<String> result = new ArrayList<String>();
        for (final String item : this.split(initialValue))
        {
            result.add((String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertConnectToTypeToString(final EDataType eDataType, final Object instanceValue) {
        if (instanceValue == null) {
            return null;
        }
        final List<?> list = (List<?>) instanceValue;
        if (list.isEmpty()) {
            return "";
        }
        final StringBuffer result = new StringBuffer();
        for (final Object item : list)
        {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public BigInteger createPhaseTypeFromString(final EDataType eDataType, final String initialValue) {
        return (BigInteger) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER,
                initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertPhaseTypeToString(final EDataType eDataType, final Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SchedulingType createSchedulingTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createSchedulingTypeFromString(LqnPackage.Literals.SCHEDULING_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSchedulingTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertSchedulingTypeToString(LqnPackage.Literals.SCHEDULING_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String createSciNotationFromString(final EDataType eDataType, final String initialValue) {
        return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSciNotationToString(final EDataType eDataType, final Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SemaphoreType createSemaphoreTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createSemaphoreTypeFromString(LqnPackage.Literals.SEMAPHORE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSemaphoreTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertSemaphoreTypeToString(LqnPackage.Literals.SEMAPHORE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Object createSrvnFloatFromString(final EDataType eDataType, final String initialValue) {
        if (initialValue == null) {
            return null;
        }
        Object result = null;
        RuntimeException exception = null;
        try
        {
            result = this.createSciNotationFromString(LqnPackage.Literals.SCI_NOTATION, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
            {
                return result;
            }
        } catch (final RuntimeException e)
        {
            exception = e;
        }
        try
        {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
            {
                return result;
            }
        } catch (final RuntimeException e)
        {
            exception = e;
        }
        if (result != null || exception == null) {
            return result;
        }

        throw exception;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSrvnFloatToString(final EDataType eDataType, final Object instanceValue) {
        if (instanceValue == null) {
            return null;
        }
        if (LqnPackage.Literals.SCI_NOTATION.isInstance(instanceValue))
        {
            try
            {
                final String value = this.convertSciNotationToString(LqnPackage.Literals.SCI_NOTATION, instanceValue);
                if (value != null) {
                    return value;
                }
            } catch (final Exception e)
            {
                // Keep trying other member types until all have failed.
            }
        }
        if (XMLTypePackage.Literals.DECIMAL.isInstance(instanceValue))
        {
            try
            {
                final String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL,
                        instanceValue);
                if (value != null) {
                    return value;
                }
            } catch (final Exception e)
            {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '" + instanceValue + "' for datatype :"
                + eDataType.getName());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TaskOptionType createTaskOptionTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createTaskOptionTypeFromString(LqnPackage.Literals.TASK_OPTION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTaskOptionTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertTaskOptionTypeToString(LqnPackage.Literals.TASK_OPTION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TaskSchedulingType createTaskSchedulingTypeObjectFromString(final EDataType eDataType,
            final String initialValue) {
        return this.createTaskSchedulingTypeFromString(LqnPackage.Literals.TASK_SCHEDULING_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTaskSchedulingTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertTaskSchedulingTypeToString(LqnPackage.Literals.TASK_SCHEDULING_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType createTypeTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createTypeTypeFromString(LqnPackage.Literals.TYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertTypeTypeToString(LqnPackage.Literals.TYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ValidType createValidTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createValidTypeFromString(LqnPackage.Literals.VALID_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertValidTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertValidTypeToString(LqnPackage.Literals.VALID_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public XmlDebugType createXmlDebugTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createXmlDebugTypeFromString(LqnPackage.Literals.XML_DEBUG_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertXmlDebugTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertXmlDebugTypeToString(LqnPackage.Literals.XML_DEBUG_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LqnPackage getLqnPackage() {
        return (LqnPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static LqnPackage getPackage() {
        return LqnPackage.eINSTANCE;
    }

} // LqnFactoryImpl
