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

import org.palladiosimulator.solver.lqn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LqnFactoryImpl extends EFactoryImpl implements LqnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LqnFactory init() {
		try {
			LqnFactory theLqnFactory = (LqnFactory)EPackage.Registry.INSTANCE.getEFactory(LqnPackage.eNS_URI);
			if (theLqnFactory != null) {
				return theLqnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LqnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LqnPackage.ACTIVITY_DEF_BASE: return createActivityDefBase();
			case LqnPackage.ACTIVITY_DEF_TYPE: return createActivityDefType();
			case LqnPackage.ACTIVITY_GRAPH_BASE: return createActivityGraphBase();
			case LqnPackage.ACTIVITY_LIST_TYPE: return createActivityListType();
			case LqnPackage.ACTIVITY_LOOP_LIST_TYPE: return createActivityLoopListType();
			case LqnPackage.ACTIVITY_LOOP_TYPE: return createActivityLoopType();
			case LqnPackage.ACTIVITY_MAKING_CALL_TYPE: return createActivityMakingCallType();
			case LqnPackage.ACTIVITY_OR_TYPE: return createActivityOrType();
			case LqnPackage.ACTIVITY_PHASES_TYPE: return createActivityPhasesType();
			case LqnPackage.ACTIVITY_TYPE: return createActivityType();
			case LqnPackage.AND_JOIN_LIST_TYPE: return createAndJoinListType();
			case LqnPackage.ASYNCH_CALL_TYPE: return createAsynchCallType();
			case LqnPackage.BIND_TYPE: return createBindType();
			case LqnPackage.CALL_LIST_TYPE: return createCallListType();
			case LqnPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE: return createEntryActivityDefType();
			case LqnPackage.ENTRY_ACTIVITY_GRAPH: return createEntryActivityGraph();
			case LqnPackage.ENTRY_MAKING_CALL_TYPE: return createEntryMakingCallType();
			case LqnPackage.ENTRY_TYPE: return createEntryType();
			case LqnPackage.FAN_IN_TYPE: return createFanInType();
			case LqnPackage.FAN_OUT_TYPE: return createFanOutType();
			case LqnPackage.FIRST_PLOT_TYPE: return createFirstPlotType();
			case LqnPackage.GROUP_TYPE: return createGroupType();
			case LqnPackage.HISTOGRAM_BIN_TYPE: return createHistogramBinType();
			case LqnPackage.IN_PORT_TYPE: return createInPortType();
			case LqnPackage.INTERFACE_TYPE: return createInterfaceType();
			case LqnPackage.LQN_CORE_TYPE: return createLqnCoreType();
			case LqnPackage.LQN_MODEL_TYPE: return createLqnModelType();
			case LqnPackage.MAKING_CALL_TYPE: return createMakingCallType();
			case LqnPackage.MVA_INFO_TYPE: return createMvaInfoType();
			case LqnPackage.OR_LIST_TYPE: return createOrListType();
			case LqnPackage.OUT_PORT_TYPE: return createOutPortType();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE: return createOutputDistributionType();
			case LqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE: return createOutputEntryDistributionType();
			case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE: return createOutputResultJoinDelayType();
			case LqnPackage.OUTPUT_RESULT_TYPE: return createOutputResultType();
			case LqnPackage.PARAMETER_TYPE: return createParameterType();
			case LqnPackage.PARA_TYPE: return createParaType();
			case LqnPackage.PHASE_ACTIVITIES: return createPhaseActivities();
			case LqnPackage.PLOT_CONTROL_TYPE: return createPlotControlType();
			case LqnPackage.PLOT_TYPE: return createPlotType();
			case LqnPackage.PORT_BINDING_TYPE: return createPortBindingType();
			case LqnPackage.PRAGMA_TYPE: return createPragmaType();
			case LqnPackage.PRECEDENCE_TYPE: return createPrecedenceType();
			case LqnPackage.PROCESSOR_BINDING_TYPE: return createProcessorBindingType();
			case LqnPackage.PROCESSOR_TYPE: return createProcessorType();
			case LqnPackage.REPLY_ACTIVITY_TYPE: return createReplyActivityType();
			case LqnPackage.REPLY_ENTRY_TYPE: return createReplyEntryType();
			case LqnPackage.RESULT_CONF95_TYPE: return createResultConf95Type();
			case LqnPackage.RESULT_CONF95_TYPE1: return createResultConf95Type1();
			case LqnPackage.RESULT_CONF99_TYPE: return createResultConf99Type();
			case LqnPackage.RESULT_CONF99_TYPE1: return createResultConf99Type1();
			case LqnPackage.RESULT_GENERAL_TYPE: return createResultGeneralType();
			case LqnPackage.RUN_CONTROL_TYPE: return createRunControlType();
			case LqnPackage.SERVICE_TYPE: return createServiceType();
			case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE: return createSingleActivityListType();
			case LqnPackage.SLOT_TYPE: return createSlotType();
			case LqnPackage.SOLVER_PARAMS_TYPE: return createSolverParamsType();
			case LqnPackage.SYNCH_CALL_TYPE: return createSynchCallType();
			case LqnPackage.TASK_ACTIVITY_GRAPH: return createTaskActivityGraph();
			case LqnPackage.TASK_TYPE: return createTaskType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LqnPackage.CALL_ORDER_TYPE:
				return createCallOrderTypeFromString(eDataType, initialValue);
			case LqnPackage.RW_LOCK_TYPE:
				return createRWLockTypeFromString(eDataType, initialValue);
			case LqnPackage.SCHEDULING_TYPE:
				return createSchedulingTypeFromString(eDataType, initialValue);
			case LqnPackage.SEMAPHORE_TYPE:
				return createSemaphoreTypeFromString(eDataType, initialValue);
			case LqnPackage.TASK_OPTION_TYPE:
				return createTaskOptionTypeFromString(eDataType, initialValue);
			case LqnPackage.TASK_SCHEDULING_TYPE:
				return createTaskSchedulingTypeFromString(eDataType, initialValue);
			case LqnPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case LqnPackage.VALID_TYPE:
				return createValidTypeFromString(eDataType, initialValue);
			case LqnPackage.CALL_ORDER_TYPE_OBJECT:
				return createCallOrderTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.CONNECT_FROM_TYPE:
				return createConnectFromTypeFromString(eDataType, initialValue);
			case LqnPackage.CONNECT_TO_TYPE:
				return createConnectToTypeFromString(eDataType, initialValue);
			case LqnPackage.EXT_VARIABLE:
				return createExtVariableFromString(eDataType, initialValue);
			case LqnPackage.PHASE_TYPE:
				return createPhaseTypeFromString(eDataType, initialValue);
			case LqnPackage.RW_LOCK_TYPE_OBJECT:
				return createRWLockTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.SCHEDULING_TYPE_OBJECT:
				return createSchedulingTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.SEMAPHORE_TYPE_OBJECT:
				return createSemaphoreTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.SRVN_FLOAT:
				return createSrvnFloatFromString(eDataType, initialValue);
			case LqnPackage.SRVN_NON_NEGATIVE_INTEGER:
				return createSrvnNonNegativeIntegerFromString(eDataType, initialValue);
			case LqnPackage.TASK_OPTION_TYPE_OBJECT:
				return createTaskOptionTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
				return createTaskSchedulingTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case LqnPackage.VALID_TYPE_OBJECT:
				return createValidTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LqnPackage.CALL_ORDER_TYPE:
				return convertCallOrderTypeToString(eDataType, instanceValue);
			case LqnPackage.RW_LOCK_TYPE:
				return convertRWLockTypeToString(eDataType, instanceValue);
			case LqnPackage.SCHEDULING_TYPE:
				return convertSchedulingTypeToString(eDataType, instanceValue);
			case LqnPackage.SEMAPHORE_TYPE:
				return convertSemaphoreTypeToString(eDataType, instanceValue);
			case LqnPackage.TASK_OPTION_TYPE:
				return convertTaskOptionTypeToString(eDataType, instanceValue);
			case LqnPackage.TASK_SCHEDULING_TYPE:
				return convertTaskSchedulingTypeToString(eDataType, instanceValue);
			case LqnPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case LqnPackage.VALID_TYPE:
				return convertValidTypeToString(eDataType, instanceValue);
			case LqnPackage.CALL_ORDER_TYPE_OBJECT:
				return convertCallOrderTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.CONNECT_FROM_TYPE:
				return convertConnectFromTypeToString(eDataType, instanceValue);
			case LqnPackage.CONNECT_TO_TYPE:
				return convertConnectToTypeToString(eDataType, instanceValue);
			case LqnPackage.EXT_VARIABLE:
				return convertExtVariableToString(eDataType, instanceValue);
			case LqnPackage.PHASE_TYPE:
				return convertPhaseTypeToString(eDataType, instanceValue);
			case LqnPackage.RW_LOCK_TYPE_OBJECT:
				return convertRWLockTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.SCHEDULING_TYPE_OBJECT:
				return convertSchedulingTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.SEMAPHORE_TYPE_OBJECT:
				return convertSemaphoreTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.SRVN_FLOAT:
				return convertSrvnFloatToString(eDataType, instanceValue);
			case LqnPackage.SRVN_NON_NEGATIVE_INTEGER:
				return convertSrvnNonNegativeIntegerToString(eDataType, instanceValue);
			case LqnPackage.TASK_OPTION_TYPE_OBJECT:
				return convertTaskOptionTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
				return convertTaskSchedulingTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case LqnPackage.VALID_TYPE_OBJECT:
				return convertValidTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefBase createActivityDefBase() {
		ActivityDefBaseImpl activityDefBase = new ActivityDefBaseImpl();
		return activityDefBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefType createActivityDefType() {
		ActivityDefTypeImpl activityDefType = new ActivityDefTypeImpl();
		return activityDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGraphBase createActivityGraphBase() {
		ActivityGraphBaseImpl activityGraphBase = new ActivityGraphBaseImpl();
		return activityGraphBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityListType createActivityListType() {
		ActivityListTypeImpl activityListType = new ActivityListTypeImpl();
		return activityListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopListType createActivityLoopListType() {
		ActivityLoopListTypeImpl activityLoopListType = new ActivityLoopListTypeImpl();
		return activityLoopListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopType createActivityLoopType() {
		ActivityLoopTypeImpl activityLoopType = new ActivityLoopTypeImpl();
		return activityLoopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityMakingCallType createActivityMakingCallType() {
		ActivityMakingCallTypeImpl activityMakingCallType = new ActivityMakingCallTypeImpl();
		return activityMakingCallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityOrType createActivityOrType() {
		ActivityOrTypeImpl activityOrType = new ActivityOrTypeImpl();
		return activityOrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPhasesType createActivityPhasesType() {
		ActivityPhasesTypeImpl activityPhasesType = new ActivityPhasesTypeImpl();
		return activityPhasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityType() {
		ActivityTypeImpl activityType = new ActivityTypeImpl();
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJoinListType createAndJoinListType() {
		AndJoinListTypeImpl andJoinListType = new AndJoinListTypeImpl();
		return andJoinListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchCallType createAsynchCallType() {
		AsynchCallTypeImpl asynchCallType = new AsynchCallTypeImpl();
		return asynchCallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindType createBindType() {
		BindTypeImpl bindType = new BindTypeImpl();
		return bindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallListType createCallListType() {
		CallListTypeImpl callListType = new CallListTypeImpl();
		return callListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityDefType createEntryActivityDefType() {
		EntryActivityDefTypeImpl entryActivityDefType = new EntryActivityDefTypeImpl();
		return entryActivityDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityGraph createEntryActivityGraph() {
		EntryActivityGraphImpl entryActivityGraph = new EntryActivityGraphImpl();
		return entryActivityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryMakingCallType createEntryMakingCallType() {
		EntryMakingCallTypeImpl entryMakingCallType = new EntryMakingCallTypeImpl();
		return entryMakingCallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FanInType createFanInType() {
		FanInTypeImpl fanInType = new FanInTypeImpl();
		return fanInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FanOutType createFanOutType() {
		FanOutTypeImpl fanOutType = new FanOutTypeImpl();
		return fanOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstPlotType createFirstPlotType() {
		FirstPlotTypeImpl firstPlotType = new FirstPlotTypeImpl();
		return firstPlotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramBinType createHistogramBinType() {
		HistogramBinTypeImpl histogramBinType = new HistogramBinTypeImpl();
		return histogramBinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortType createInPortType() {
		InPortTypeImpl inPortType = new InPortTypeImpl();
		return inPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceType() {
		InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnCoreType createLqnCoreType() {
		LqnCoreTypeImpl lqnCoreType = new LqnCoreTypeImpl();
		return lqnCoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnModelType createLqnModelType() {
		LqnModelTypeImpl lqnModelType = new LqnModelTypeImpl();
		return lqnModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakingCallType createMakingCallType() {
		MakingCallTypeImpl makingCallType = new MakingCallTypeImpl();
		return makingCallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvaInfoType createMvaInfoType() {
		MvaInfoTypeImpl mvaInfoType = new MvaInfoTypeImpl();
		return mvaInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrListType createOrListType() {
		OrListTypeImpl orListType = new OrListTypeImpl();
		return orListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortType createOutPortType() {
		OutPortTypeImpl outPortType = new OutPortTypeImpl();
		return outPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDistributionType createOutputDistributionType() {
		OutputDistributionTypeImpl outputDistributionType = new OutputDistributionTypeImpl();
		return outputDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEntryDistributionType createOutputEntryDistributionType() {
		OutputEntryDistributionTypeImpl outputEntryDistributionType = new OutputEntryDistributionTypeImpl();
		return outputEntryDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputResultJoinDelayType createOutputResultJoinDelayType() {
		OutputResultJoinDelayTypeImpl outputResultJoinDelayType = new OutputResultJoinDelayTypeImpl();
		return outputResultJoinDelayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputResultType createOutputResultType() {
		OutputResultTypeImpl outputResultType = new OutputResultTypeImpl();
		return outputResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParaType createParaType() {
		ParaTypeImpl paraType = new ParaTypeImpl();
		return paraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseActivities createPhaseActivities() {
		PhaseActivitiesImpl phaseActivities = new PhaseActivitiesImpl();
		return phaseActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlotControlType createPlotControlType() {
		PlotControlTypeImpl plotControlType = new PlotControlTypeImpl();
		return plotControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlotType createPlotType() {
		PlotTypeImpl plotType = new PlotTypeImpl();
		return plotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortBindingType createPortBindingType() {
		PortBindingTypeImpl portBindingType = new PortBindingTypeImpl();
		return portBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PragmaType createPragmaType() {
		PragmaTypeImpl pragmaType = new PragmaTypeImpl();
		return pragmaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceType createPrecedenceType() {
		PrecedenceTypeImpl precedenceType = new PrecedenceTypeImpl();
		return precedenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorBindingType createProcessorBindingType() {
		ProcessorBindingTypeImpl processorBindingType = new ProcessorBindingTypeImpl();
		return processorBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorType createProcessorType() {
		ProcessorTypeImpl processorType = new ProcessorTypeImpl();
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyActivityType createReplyActivityType() {
		ReplyActivityTypeImpl replyActivityType = new ReplyActivityTypeImpl();
		return replyActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyEntryType createReplyEntryType() {
		ReplyEntryTypeImpl replyEntryType = new ReplyEntryTypeImpl();
		return replyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConf95Type createResultConf95Type() {
		ResultConf95TypeImpl resultConf95Type = new ResultConf95TypeImpl();
		return resultConf95Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConf95Type1 createResultConf95Type1() {
		ResultConf95Type1Impl resultConf95Type1 = new ResultConf95Type1Impl();
		return resultConf95Type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConf99Type createResultConf99Type() {
		ResultConf99TypeImpl resultConf99Type = new ResultConf99TypeImpl();
		return resultConf99Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConf99Type1 createResultConf99Type1() {
		ResultConf99Type1Impl resultConf99Type1 = new ResultConf99Type1Impl();
		return resultConf99Type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultGeneralType createResultGeneralType() {
		ResultGeneralTypeImpl resultGeneralType = new ResultGeneralTypeImpl();
		return resultGeneralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunControlType createRunControlType() {
		RunControlTypeImpl runControlType = new RunControlTypeImpl();
		return runControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivityListType createSingleActivityListType() {
		SingleActivityListTypeImpl singleActivityListType = new SingleActivityListTypeImpl();
		return singleActivityListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotType createSlotType() {
		SlotTypeImpl slotType = new SlotTypeImpl();
		return slotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverParamsType createSolverParamsType() {
		SolverParamsTypeImpl solverParamsType = new SolverParamsTypeImpl();
		return solverParamsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchCallType createSynchCallType() {
		SynchCallTypeImpl synchCallType = new SynchCallTypeImpl();
		return synchCallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActivityGraph createTaskActivityGraph() {
		TaskActivityGraphImpl taskActivityGraph = new TaskActivityGraphImpl();
		return taskActivityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrderType createCallOrderTypeFromString(EDataType eDataType, String initialValue) {
		CallOrderType result = CallOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWLockType createRWLockTypeFromString(EDataType eDataType, String initialValue) {
		RWLockType result = RWLockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWLockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingType createSchedulingTypeFromString(EDataType eDataType, String initialValue) {
		SchedulingType result = SchedulingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType createSemaphoreTypeFromString(EDataType eDataType, String initialValue) {
		SemaphoreType result = SemaphoreType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOptionType createTaskOptionTypeFromString(EDataType eDataType, String initialValue) {
		TaskOptionType result = TaskOptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskOptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingType createTaskSchedulingTypeFromString(EDataType eDataType, String initialValue) {
		TaskSchedulingType result = TaskSchedulingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSchedulingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidType createValidTypeFromString(EDataType eDataType, String initialValue) {
		ValidType result = ValidType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrderType createCallOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCallOrderTypeFromString(LqnPackage.Literals.CALL_ORDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCallOrderTypeToString(LqnPackage.Literals.CALL_ORDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createConnectFromTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectFromTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createConnectToTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectToTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExtVariableFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtVariableToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPhaseTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWLockType createRWLockTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRWLockTypeFromString(LqnPackage.Literals.RW_LOCK_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWLockTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRWLockTypeToString(LqnPackage.Literals.RW_LOCK_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingType createSchedulingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSchedulingTypeFromString(LqnPackage.Literals.SCHEDULING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSchedulingTypeToString(LqnPackage.Literals.SCHEDULING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType createSemaphoreTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSemaphoreTypeFromString(LqnPackage.Literals.SEMAPHORE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSemaphoreTypeToString(LqnPackage.Literals.SEMAPHORE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSrvnFloatFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExtVariableFromString(LqnPackage.Literals.EXT_VARIABLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSrvnFloatToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DECIMAL.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (LqnPackage.Literals.EXT_VARIABLE.isInstance(instanceValue)) {
			try {
				String value = convertExtVariableToString(LqnPackage.Literals.EXT_VARIABLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSrvnNonNegativeIntegerFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createExtVariableFromString(LqnPackage.Literals.EXT_VARIABLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSrvnNonNegativeIntegerToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (LqnPackage.Literals.EXT_VARIABLE.isInstance(instanceValue)) {
			try {
				String value = convertExtVariableToString(LqnPackage.Literals.EXT_VARIABLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOptionType createTaskOptionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskOptionTypeFromString(LqnPackage.Literals.TASK_OPTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskOptionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskOptionTypeToString(LqnPackage.Literals.TASK_OPTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingType createTaskSchedulingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskSchedulingTypeFromString(LqnPackage.Literals.TASK_SCHEDULING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSchedulingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskSchedulingTypeToString(LqnPackage.Literals.TASK_SCHEDULING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(LqnPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(LqnPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidType createValidTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValidTypeFromString(LqnPackage.Literals.VALID_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValidTypeToString(LqnPackage.Literals.VALID_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnPackage getLqnPackage() {
		return (LqnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LqnPackage getPackage() {
		return LqnPackage.eINSTANCE;
	}

} //LqnFactoryImpl
