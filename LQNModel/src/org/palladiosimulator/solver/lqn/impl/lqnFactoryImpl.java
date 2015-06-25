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
import org.palladiosimulator.solver.lqn.LqnModelType;
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
import org.palladiosimulator.solver.lqn.lqnFactory;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class lqnFactoryImpl extends EFactoryImpl implements lqnFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static lqnFactory init() {
        try {
            final lqnFactory thelqnFactory = (lqnFactory) EPackage.Registry.INSTANCE.getEFactory(lqnPackage.eNS_URI);
            if (thelqnFactory != null) {
                return thelqnFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new lqnFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public lqnFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case lqnPackage.ACTIVITY_DEF_BASE:
            return this.createActivityDefBase();
        case lqnPackage.ACTIVITY_DEF_TYPE:
            return this.createActivityDefType();
        case lqnPackage.ACTIVITY_GRAPH_BASE:
            return this.createActivityGraphBase();
        case lqnPackage.ACTIVITY_LIST_TYPE:
            return this.createActivityListType();
        case lqnPackage.ACTIVITY_LOOP_LIST_TYPE:
            return this.createActivityLoopListType();
        case lqnPackage.ACTIVITY_LOOP_TYPE:
            return this.createActivityLoopType();
        case lqnPackage.ACTIVITY_MAKING_CALL_TYPE:
            return this.createActivityMakingCallType();
        case lqnPackage.ACTIVITY_OR_TYPE:
            return this.createActivityOrType();
        case lqnPackage.ACTIVITY_PHASES_TYPE:
            return this.createActivityPhasesType();
        case lqnPackage.ACTIVITY_TYPE:
            return this.createActivityType();
        case lqnPackage.AND_JOIN_LIST_TYPE:
            return this.createAndJoinListType();
        case lqnPackage.ASYNCH_CALL_TYPE:
            return this.createAsynchCallType();
        case lqnPackage.BIND_TYPE:
            return this.createBindType();
        case lqnPackage.CALL_LIST_TYPE:
            return this.createCallListType();
        case lqnPackage.DOCUMENT_ROOT:
            return this.createDocumentRoot();
        case lqnPackage.ENTRY_ACTIVITY_DEF_TYPE:
            return this.createEntryActivityDefType();
        case lqnPackage.ENTRY_ACTIVITY_GRAPH:
            return this.createEntryActivityGraph();
        case lqnPackage.ENTRY_MAKING_CALL_TYPE:
            return this.createEntryMakingCallType();
        case lqnPackage.ENTRY_TYPE:
            return this.createEntryType();
        case lqnPackage.FIRST_PLOT_TYPE:
            return this.createFirstPlotType();
        case lqnPackage.HISTOGRAM_BIN_TYPE:
            return this.createHistogramBinType();
        case lqnPackage.IN_PORT_TYPE:
            return this.createInPortType();
        case lqnPackage.INTERFACE_TYPE:
            return this.createInterfaceType();
        case lqnPackage.LQN_CORE_TYPE:
            return this.createLqnCoreType();
        case lqnPackage.LQN_MODEL_TYPE:
            return this.createLqnModelType();
        case lqnPackage.MAKING_CALL_TYPE:
            return this.createMakingCallType();
        case lqnPackage.OR_LIST_TYPE:
            return this.createOrListType();
        case lqnPackage.OUT_PORT_TYPE:
            return this.createOutPortType();
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE:
            return this.createOutputDistributionType();
        case lqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE:
            return this.createOutputEntryDistributionType();
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY:
            return this.createOutputResultForwardingANDJoinDelay();
        case lqnPackage.OUTPUT_RESULT_TYPE:
            return this.createOutputResultType();
        case lqnPackage.PARAMETER_TYPE:
            return this.createParameterType();
        case lqnPackage.PARA_TYPE:
            return this.createParaType();
        case lqnPackage.PHASE_ACTIVITIES:
            return this.createPhaseActivities();
        case lqnPackage.PLOT_CONTROL_TYPE:
            return this.createPlotControlType();
        case lqnPackage.PLOT_TYPE:
            return this.createPlotType();
        case lqnPackage.PORT_BINDING_TYPE:
            return this.createPortBindingType();
        case lqnPackage.PRAGMA_TYPE:
            return this.createPragmaType();
        case lqnPackage.PRECEDENCE_TYPE:
            return this.createPrecedenceType();
        case lqnPackage.PROCESSOR_BINDING_TYPE:
            return this.createProcessorBindingType();
        case lqnPackage.PROCESSOR_TYPE:
            return this.createProcessorType();
        case lqnPackage.REPLY_ACTIVITY_TYPE:
            return this.createReplyActivityType();
        case lqnPackage.REPLY_ENTRY_TYPE:
            return this.createReplyEntryType();
        case lqnPackage.RESULT_CONF95_TYPE:
            return this.createResultConf95Type();
        case lqnPackage.RESULT_CONF95_TYPE1:
            return this.createResultConf95Type1();
        case lqnPackage.RESULT_CONF99_TYPE:
            return this.createResultConf99Type();
        case lqnPackage.RESULT_CONF99_TYPE1:
            return this.createResultConf99Type1();
        case lqnPackage.RESULT_GENERAL_TYPE:
            return this.createResultGeneralType();
        case lqnPackage.RUN_CONTROL_TYPE:
            return this.createRunControlType();
        case lqnPackage.SERVICE_TYPE:
            return this.createServiceType();
        case lqnPackage.SINGLE_ACTIVITY_LIST_TYPE:
            return this.createSingleActivityListType();
        case lqnPackage.SLOT_TYPE:
            return this.createSlotType();
        case lqnPackage.SOLVER_PARAMS_TYPE:
            return this.createSolverParamsType();
        case lqnPackage.SYNCH_CALL_TYPE:
            return this.createSynchCallType();
        case lqnPackage.TASK_ACTIVITY_GRAPH:
            return this.createTaskActivityGraph();
        case lqnPackage.TASK_TYPE:
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
        switch (eDataType.getClassifierID()) {
        case lqnPackage.AXIS_TYPE:
            return this.createAxisTypeFromString(eDataType, initialValue);
        case lqnPackage.CALL_ORDER_TYPE:
            return this.createCallOrderTypeFromString(eDataType, initialValue);
        case lqnPackage.SCHEDULING_TYPE:
            return this.createSchedulingTypeFromString(eDataType, initialValue);
        case lqnPackage.SEMAPHORE_TYPE:
            return this.createSemaphoreTypeFromString(eDataType, initialValue);
        case lqnPackage.TASK_OPTION_TYPE:
            return this.createTaskOptionTypeFromString(eDataType, initialValue);
        case lqnPackage.TASK_SCHEDULING_TYPE:
            return this.createTaskSchedulingTypeFromString(eDataType, initialValue);
        case lqnPackage.TYPE_TYPE:
            return this.createTypeTypeFromString(eDataType, initialValue);
        case lqnPackage.VALID_TYPE:
            return this.createValidTypeFromString(eDataType, initialValue);
        case lqnPackage.XML_DEBUG_TYPE:
            return this.createXmlDebugTypeFromString(eDataType, initialValue);
        case lqnPackage.AXIS_TYPE_OBJECT:
            return this.createAxisTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.CALL_ORDER_TYPE_OBJECT:
            return this.createCallOrderTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.CONNECT_FROM_TYPE:
            return this.createConnectFromTypeFromString(eDataType, initialValue);
        case lqnPackage.CONNECT_TO_TYPE:
            return this.createConnectToTypeFromString(eDataType, initialValue);
        case lqnPackage.PHASE_TYPE:
            return this.createPhaseTypeFromString(eDataType, initialValue);
        case lqnPackage.SCHEDULING_TYPE_OBJECT:
            return this.createSchedulingTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.SCI_NOTATION:
            return this.createSciNotationFromString(eDataType, initialValue);
        case lqnPackage.SEMAPHORE_TYPE_OBJECT:
            return this.createSemaphoreTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.SRVN_FLOAT:
            return this.createSrvnFloatFromString(eDataType, initialValue);
        case lqnPackage.TASK_OPTION_TYPE_OBJECT:
            return this.createTaskOptionTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
            return this.createTaskSchedulingTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.TYPE_TYPE_OBJECT:
            return this.createTypeTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.VALID_TYPE_OBJECT:
            return this.createValidTypeObjectFromString(eDataType, initialValue);
        case lqnPackage.XML_DEBUG_TYPE_OBJECT:
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
        switch (eDataType.getClassifierID()) {
        case lqnPackage.AXIS_TYPE:
            return this.convertAxisTypeToString(eDataType, instanceValue);
        case lqnPackage.CALL_ORDER_TYPE:
            return this.convertCallOrderTypeToString(eDataType, instanceValue);
        case lqnPackage.SCHEDULING_TYPE:
            return this.convertSchedulingTypeToString(eDataType, instanceValue);
        case lqnPackage.SEMAPHORE_TYPE:
            return this.convertSemaphoreTypeToString(eDataType, instanceValue);
        case lqnPackage.TASK_OPTION_TYPE:
            return this.convertTaskOptionTypeToString(eDataType, instanceValue);
        case lqnPackage.TASK_SCHEDULING_TYPE:
            return this.convertTaskSchedulingTypeToString(eDataType, instanceValue);
        case lqnPackage.TYPE_TYPE:
            return this.convertTypeTypeToString(eDataType, instanceValue);
        case lqnPackage.VALID_TYPE:
            return this.convertValidTypeToString(eDataType, instanceValue);
        case lqnPackage.XML_DEBUG_TYPE:
            return this.convertXmlDebugTypeToString(eDataType, instanceValue);
        case lqnPackage.AXIS_TYPE_OBJECT:
            return this.convertAxisTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.CALL_ORDER_TYPE_OBJECT:
            return this.convertCallOrderTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.CONNECT_FROM_TYPE:
            return this.convertConnectFromTypeToString(eDataType, instanceValue);
        case lqnPackage.CONNECT_TO_TYPE:
            return this.convertConnectToTypeToString(eDataType, instanceValue);
        case lqnPackage.PHASE_TYPE:
            return this.convertPhaseTypeToString(eDataType, instanceValue);
        case lqnPackage.SCHEDULING_TYPE_OBJECT:
            return this.convertSchedulingTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.SCI_NOTATION:
            return this.convertSciNotationToString(eDataType, instanceValue);
        case lqnPackage.SEMAPHORE_TYPE_OBJECT:
            return this.convertSemaphoreTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.SRVN_FLOAT:
            return this.convertSrvnFloatToString(eDataType, instanceValue);
        case lqnPackage.TASK_OPTION_TYPE_OBJECT:
            return this.convertTaskOptionTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
            return this.convertTaskSchedulingTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.TYPE_TYPE_OBJECT:
            return this.convertTypeTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.VALID_TYPE_OBJECT:
            return this.convertValidTypeObjectToString(eDataType, instanceValue);
        case lqnPackage.XML_DEBUG_TYPE_OBJECT:
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
        return this.createAxisTypeFromString(lqnPackage.Literals.AXIS_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertAxisTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertAxisTypeToString(lqnPackage.Literals.AXIS_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CallOrderType createCallOrderTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createCallOrderTypeFromString(lqnPackage.Literals.CALL_ORDER_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCallOrderTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertCallOrderTypeToString(lqnPackage.Literals.CALL_ORDER_TYPE, instanceValue);
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
        for (final String item : this.split(initialValue)) {
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
        for (final Object item : list) {
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
        for (final String item : this.split(initialValue)) {
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
        for (final Object item : list) {
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
        return this.createSchedulingTypeFromString(lqnPackage.Literals.SCHEDULING_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSchedulingTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertSchedulingTypeToString(lqnPackage.Literals.SCHEDULING_TYPE, instanceValue);
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
        return this.createSemaphoreTypeFromString(lqnPackage.Literals.SEMAPHORE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertSemaphoreTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertSemaphoreTypeToString(lqnPackage.Literals.SEMAPHORE_TYPE, instanceValue);
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
        try {
            result = this.createSciNotationFromString(lqnPackage.Literals.SCI_NOTATION, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        } catch (final RuntimeException e) {
            exception = e;
        }
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        } catch (final RuntimeException e) {
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
        if (lqnPackage.Literals.SCI_NOTATION.isInstance(instanceValue)) {
            try {
                final String value = this.convertSciNotationToString(lqnPackage.Literals.SCI_NOTATION, instanceValue);
                if (value != null) {
                    return value;
                }
            } catch (final Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XMLTypePackage.Literals.DECIMAL.isInstance(instanceValue)) {
            try {
                final String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL,
                        instanceValue);
                if (value != null) {
                    return value;
                }
            } catch (final Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException(
                "Invalid value: '" + instanceValue + "' for datatype :" + eDataType.getName());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TaskOptionType createTaskOptionTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createTaskOptionTypeFromString(lqnPackage.Literals.TASK_OPTION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTaskOptionTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertTaskOptionTypeToString(lqnPackage.Literals.TASK_OPTION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TaskSchedulingType createTaskSchedulingTypeObjectFromString(final EDataType eDataType,
            final String initialValue) {
        return this.createTaskSchedulingTypeFromString(lqnPackage.Literals.TASK_SCHEDULING_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTaskSchedulingTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertTaskSchedulingTypeToString(lqnPackage.Literals.TASK_SCHEDULING_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeType createTypeTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createTypeTypeFromString(lqnPackage.Literals.TYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTypeTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertTypeTypeToString(lqnPackage.Literals.TYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ValidType createValidTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createValidTypeFromString(lqnPackage.Literals.VALID_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertValidTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertValidTypeToString(lqnPackage.Literals.VALID_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public XmlDebugType createXmlDebugTypeObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createXmlDebugTypeFromString(lqnPackage.Literals.XML_DEBUG_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertXmlDebugTypeObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertXmlDebugTypeToString(lqnPackage.Literals.XML_DEBUG_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public lqnPackage getlqnPackage() {
        return (lqnPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static lqnPackage getPackage() {
        return lqnPackage.eINSTANCE;
    }

} // lqnFactoryImpl
