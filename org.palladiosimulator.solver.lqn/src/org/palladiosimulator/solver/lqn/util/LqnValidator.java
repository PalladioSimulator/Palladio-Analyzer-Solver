/**
 */
package org.palladiosimulator.solver.lqn.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.palladiosimulator.solver.lqn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.solver.lqn.LqnPackage
 * @generated
 */
public class LqnValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LqnValidator INSTANCE = new LqnValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.solver.lqn";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LqnPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LqnPackage.ACTIVITY_DEF_BASE:
				return validateActivityDefBase((ActivityDefBase)value, diagnostics, context);
			case LqnPackage.ACTIVITY_DEF_TYPE:
				return validateActivityDefType((ActivityDefType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_GRAPH_BASE:
				return validateActivityGraphBase((ActivityGraphBase)value, diagnostics, context);
			case LqnPackage.ACTIVITY_LIST_TYPE:
				return validateActivityListType((ActivityListType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_LOOP_LIST_TYPE:
				return validateActivityLoopListType((ActivityLoopListType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_LOOP_TYPE:
				return validateActivityLoopType((ActivityLoopType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_MAKING_CALL_TYPE:
				return validateActivityMakingCallType((ActivityMakingCallType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_OR_TYPE:
				return validateActivityOrType((ActivityOrType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_PHASES_TYPE:
				return validateActivityPhasesType((ActivityPhasesType)value, diagnostics, context);
			case LqnPackage.ACTIVITY_TYPE:
				return validateActivityType((ActivityType)value, diagnostics, context);
			case LqnPackage.AND_JOIN_LIST_TYPE:
				return validateAndJoinListType((AndJoinListType)value, diagnostics, context);
			case LqnPackage.ASYNCH_CALL_TYPE:
				return validateAsynchCallType((AsynchCallType)value, diagnostics, context);
			case LqnPackage.BIND_TYPE:
				return validateBindType((BindType)value, diagnostics, context);
			case LqnPackage.CALL_LIST_TYPE:
				return validateCallListType((CallListType)value, diagnostics, context);
			case LqnPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE:
				return validateEntryActivityDefType((EntryActivityDefType)value, diagnostics, context);
			case LqnPackage.ENTRY_ACTIVITY_GRAPH:
				return validateEntryActivityGraph((EntryActivityGraph)value, diagnostics, context);
			case LqnPackage.ENTRY_MAKING_CALL_TYPE:
				return validateEntryMakingCallType((EntryMakingCallType)value, diagnostics, context);
			case LqnPackage.ENTRY_TYPE:
				return validateEntryType((EntryType)value, diagnostics, context);
			case LqnPackage.FAN_IN_TYPE:
				return validateFanInType((FanInType)value, diagnostics, context);
			case LqnPackage.FAN_OUT_TYPE:
				return validateFanOutType((FanOutType)value, diagnostics, context);
			case LqnPackage.FIRST_PLOT_TYPE:
				return validateFirstPlotType((FirstPlotType)value, diagnostics, context);
			case LqnPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case LqnPackage.HISTOGRAM_BIN_TYPE:
				return validateHistogramBinType((HistogramBinType)value, diagnostics, context);
			case LqnPackage.IN_PORT_TYPE:
				return validateInPortType((InPortType)value, diagnostics, context);
			case LqnPackage.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case LqnPackage.LQN_CORE_TYPE:
				return validateLqnCoreType((LqnCoreType)value, diagnostics, context);
			case LqnPackage.LQN_MODEL_TYPE:
				return validateLqnModelType((LqnModelType)value, diagnostics, context);
			case LqnPackage.MAKING_CALL_TYPE:
				return validateMakingCallType((MakingCallType)value, diagnostics, context);
			case LqnPackage.MVA_INFO_TYPE:
				return validateMvaInfoType((MvaInfoType)value, diagnostics, context);
			case LqnPackage.OR_LIST_TYPE:
				return validateOrListType((OrListType)value, diagnostics, context);
			case LqnPackage.OUT_PORT_TYPE:
				return validateOutPortType((OutPortType)value, diagnostics, context);
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE:
				return validateOutputDistributionType((OutputDistributionType)value, diagnostics, context);
			case LqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE:
				return validateOutputEntryDistributionType((OutputEntryDistributionType)value, diagnostics, context);
			case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE:
				return validateOutputResultJoinDelayType((OutputResultJoinDelayType)value, diagnostics, context);
			case LqnPackage.OUTPUT_RESULT_TYPE:
				return validateOutputResultType((OutputResultType)value, diagnostics, context);
			case LqnPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case LqnPackage.PARA_TYPE:
				return validateParaType((ParaType)value, diagnostics, context);
			case LqnPackage.PHASE_ACTIVITIES:
				return validatePhaseActivities((PhaseActivities)value, diagnostics, context);
			case LqnPackage.PLOT_CONTROL_TYPE:
				return validatePlotControlType((PlotControlType)value, diagnostics, context);
			case LqnPackage.PLOT_TYPE:
				return validatePlotType((PlotType)value, diagnostics, context);
			case LqnPackage.PORT_BINDING_TYPE:
				return validatePortBindingType((PortBindingType)value, diagnostics, context);
			case LqnPackage.PRAGMA_TYPE:
				return validatePragmaType((PragmaType)value, diagnostics, context);
			case LqnPackage.PRECEDENCE_TYPE:
				return validatePrecedenceType((PrecedenceType)value, diagnostics, context);
			case LqnPackage.PROCESSOR_BINDING_TYPE:
				return validateProcessorBindingType((ProcessorBindingType)value, diagnostics, context);
			case LqnPackage.PROCESSOR_TYPE:
				return validateProcessorType((ProcessorType)value, diagnostics, context);
			case LqnPackage.REPLY_ACTIVITY_TYPE:
				return validateReplyActivityType((ReplyActivityType)value, diagnostics, context);
			case LqnPackage.REPLY_ENTRY_TYPE:
				return validateReplyEntryType((ReplyEntryType)value, diagnostics, context);
			case LqnPackage.RESULT_CONF95_TYPE:
				return validateResultConf95Type((ResultConf95Type)value, diagnostics, context);
			case LqnPackage.RESULT_CONF95_TYPE1:
				return validateResultConf95Type1((ResultConf95Type1)value, diagnostics, context);
			case LqnPackage.RESULT_CONF99_TYPE:
				return validateResultConf99Type((ResultConf99Type)value, diagnostics, context);
			case LqnPackage.RESULT_CONF99_TYPE1:
				return validateResultConf99Type1((ResultConf99Type1)value, diagnostics, context);
			case LqnPackage.RESULT_GENERAL_TYPE:
				return validateResultGeneralType((ResultGeneralType)value, diagnostics, context);
			case LqnPackage.RUN_CONTROL_TYPE:
				return validateRunControlType((RunControlType)value, diagnostics, context);
			case LqnPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE:
				return validateSingleActivityListType((SingleActivityListType)value, diagnostics, context);
			case LqnPackage.SLOT_TYPE:
				return validateSlotType((SlotType)value, diagnostics, context);
			case LqnPackage.SOLVER_PARAMS_TYPE:
				return validateSolverParamsType((SolverParamsType)value, diagnostics, context);
			case LqnPackage.SYNCH_CALL_TYPE:
				return validateSynchCallType((SynchCallType)value, diagnostics, context);
			case LqnPackage.TASK_ACTIVITY_GRAPH:
				return validateTaskActivityGraph((TaskActivityGraph)value, diagnostics, context);
			case LqnPackage.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case LqnPackage.CALL_ORDER_TYPE:
				return validateCallOrderType((CallOrderType)value, diagnostics, context);
			case LqnPackage.RW_LOCK_TYPE:
				return validateRWLockType((RWLockType)value, diagnostics, context);
			case LqnPackage.SCHEDULING_TYPE:
				return validateSchedulingType((SchedulingType)value, diagnostics, context);
			case LqnPackage.SEMAPHORE_TYPE:
				return validateSemaphoreType((SemaphoreType)value, diagnostics, context);
			case LqnPackage.TASK_OPTION_TYPE:
				return validateTaskOptionType((TaskOptionType)value, diagnostics, context);
			case LqnPackage.TASK_SCHEDULING_TYPE:
				return validateTaskSchedulingType((TaskSchedulingType)value, diagnostics, context);
			case LqnPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case LqnPackage.VALID_TYPE:
				return validateValidType((ValidType)value, diagnostics, context);
			case LqnPackage.CALL_ORDER_TYPE_OBJECT:
				return validateCallOrderTypeObject((CallOrderType)value, diagnostics, context);
			case LqnPackage.CONNECT_FROM_TYPE:
				return validateConnectFromType((List<?>)value, diagnostics, context);
			case LqnPackage.CONNECT_TO_TYPE:
				return validateConnectToType((List<?>)value, diagnostics, context);
			case LqnPackage.EXT_VARIABLE:
				return validateExtVariable((String)value, diagnostics, context);
			case LqnPackage.PHASE_TYPE:
				return validatePhaseType((BigInteger)value, diagnostics, context);
			case LqnPackage.RW_LOCK_TYPE_OBJECT:
				return validateRWLockTypeObject((RWLockType)value, diagnostics, context);
			case LqnPackage.SCHEDULING_TYPE_OBJECT:
				return validateSchedulingTypeObject((SchedulingType)value, diagnostics, context);
			case LqnPackage.SEMAPHORE_TYPE_OBJECT:
				return validateSemaphoreTypeObject((SemaphoreType)value, diagnostics, context);
			case LqnPackage.SRVN_FLOAT:
				return validateSrvnFloat(value, diagnostics, context);
			case LqnPackage.SRVN_NON_NEGATIVE_INTEGER:
				return validateSrvnNonNegativeInteger(value, diagnostics, context);
			case LqnPackage.TASK_OPTION_TYPE_OBJECT:
				return validateTaskOptionTypeObject((TaskOptionType)value, diagnostics, context);
			case LqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
				return validateTaskSchedulingTypeObject((TaskSchedulingType)value, diagnostics, context);
			case LqnPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case LqnPackage.VALID_TYPE_OBJECT:
				return validateValidTypeObject((ValidType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefBase(ActivityDefBase activityDefBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefType(ActivityDefType activityDefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGraphBase(ActivityGraphBase activityGraphBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityGraphBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityListType(ActivityListType activityListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityLoopListType(ActivityLoopListType activityLoopListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityLoopListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityLoopType(ActivityLoopType activityLoopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityLoopType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityMakingCallType(ActivityMakingCallType activityMakingCallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityMakingCallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityOrType(ActivityOrType activityOrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityOrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPhasesType(ActivityPhasesType activityPhasesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityPhasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAndJoinListType(AndJoinListType andJoinListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(andJoinListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsynchCallType(AsynchCallType asynchCallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asynchCallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindType(BindType bindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallListType(CallListType callListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryActivityDefType(EntryActivityDefType entryActivityDefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryActivityDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryActivityGraph(EntryActivityGraph entryActivityGraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryActivityGraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryMakingCallType(EntryMakingCallType entryMakingCallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryMakingCallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryType(EntryType entryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFanInType(FanInType fanInType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fanInType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFanOutType(FanOutType fanOutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fanOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPlotType(FirstPlotType firstPlotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstPlotType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistogramBinType(HistogramBinType histogramBinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(histogramBinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInPortType(InPortType inPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLqnCoreType(LqnCoreType lqnCoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lqnCoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLqnModelType(LqnModelType lqnModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lqnModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMakingCallType(MakingCallType makingCallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(makingCallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMvaInfoType(MvaInfoType mvaInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mvaInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrListType(OrListType orListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutPortType(OutPortType outPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDistributionType(OutputDistributionType outputDistributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputDistributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputEntryDistributionType(OutputEntryDistributionType outputEntryDistributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputEntryDistributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputResultJoinDelayType(OutputResultJoinDelayType outputResultJoinDelayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputResultJoinDelayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputResultType(OutputResultType outputResultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputResultType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParaType(ParaType paraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paraType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseActivities(PhaseActivities phaseActivities, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phaseActivities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlotControlType(PlotControlType plotControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plotControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlotType(PlotType plotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plotType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortBindingType(PortBindingType portBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePragmaType(PragmaType pragmaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pragmaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecedenceType(PrecedenceType precedenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(precedenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorBindingType(ProcessorBindingType processorBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processorBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorType(ProcessorType processorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyActivityType(ReplyActivityType replyActivityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replyActivityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyEntryType(ReplyEntryType replyEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replyEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultConf95Type(ResultConf95Type resultConf95Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultConf95Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultConf95Type1(ResultConf95Type1 resultConf95Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultConf95Type1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultConf99Type(ResultConf99Type resultConf99Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultConf99Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultConf99Type1(ResultConf99Type1 resultConf99Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultConf99Type1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultGeneralType(ResultGeneralType resultGeneralType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultGeneralType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunControlType(RunControlType runControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleActivityListType(SingleActivityListType singleActivityListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleActivityListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotType(SlotType slotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolverParamsType(SolverParamsType solverParamsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solverParamsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchCallType(SynchCallType synchCallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchCallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskActivityGraph(TaskActivityGraph taskActivityGraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskActivityGraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOrderType(CallOrderType callOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRWLockType(RWLockType rwLockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingType(SchedulingType schedulingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreType(SemaphoreType semaphoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskOptionType(TaskOptionType taskOptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSchedulingType(TaskSchedulingType taskSchedulingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidType(ValidType validType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOrderTypeObject(CallOrderType callOrderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectFromType(List<?> connectFromType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConnectFromType_ItemType(connectFromType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Connect From Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectFromType_ItemType(List<?> connectFromType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = connectFromType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.STRING.isInstance(item)) {
				result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectToType(List<?> connectToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConnectToType_ItemType(connectToType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Connect To Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectToType_ItemType(List<?> connectToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = connectToType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.STRING.isInstance(item)) {
				result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtVariable(String extVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtVariable_Pattern(extVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExtVariable_Pattern
	 */
	public static final  PatternMatcher [][] EXT_VARIABLE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("$(_|[a-zA-Z])(([a-zA-Z]|[0-9]|_)+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ext Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtVariable_Pattern(String extVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(LqnPackage.Literals.EXT_VARIABLE, extVariable, EXT_VARIABLE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseType(BigInteger phaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePhaseType_Min(phaseType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhaseType_Max(phaseType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePhaseType_Min
	 */
	public static final BigInteger PHASE_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Phase Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseType_Min(BigInteger phaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = phaseType.compareTo(PHASE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(LqnPackage.Literals.PHASE_TYPE, phaseType, PHASE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePhaseType_Max
	 */
	public static final BigInteger PHASE_TYPE__MAX__VALUE = new BigInteger("3");

	/**
	 * Validates the Max constraint of '<em>Phase Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseType_Max(BigInteger phaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = phaseType.compareTo(PHASE_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(LqnPackage.Literals.PHASE_TYPE, phaseType, PHASE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRWLockTypeObject(RWLockType rwLockTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingTypeObject(SchedulingType schedulingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreTypeObject(SemaphoreType semaphoreTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrvnFloat(Object srvnFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSrvnFloat_MemberTypes(srvnFloat, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Srvn Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrvnFloat_MemberTypes(Object srvnFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(srvnFloat)) {
				if (xmlTypeValidator.validateDouble((Double)srvnFloat, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DECIMAL.isInstance(srvnFloat)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)srvnFloat, tempDiagnostics, context)) return true;
			}
			if (LqnPackage.Literals.EXT_VARIABLE.isInstance(srvnFloat)) {
				if (validateExtVariable((String)srvnFloat, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DOUBLE.isInstance(srvnFloat)) {
				if (xmlTypeValidator.validateDouble((Double)srvnFloat, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DECIMAL.isInstance(srvnFloat)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)srvnFloat, null, context)) return true;
			}
			if (LqnPackage.Literals.EXT_VARIABLE.isInstance(srvnFloat)) {
				if (validateExtVariable((String)srvnFloat, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrvnNonNegativeInteger(Object srvnNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSrvnNonNegativeInteger_MemberTypes(srvnNonNegativeInteger, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Srvn Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrvnNonNegativeInteger_MemberTypes(Object srvnNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(srvnNonNegativeInteger)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)srvnNonNegativeInteger, tempDiagnostics, context)) return true;
			}
			if (LqnPackage.Literals.EXT_VARIABLE.isInstance(srvnNonNegativeInteger)) {
				if (validateExtVariable((String)srvnNonNegativeInteger, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(srvnNonNegativeInteger)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)srvnNonNegativeInteger, null, context)) return true;
			}
			if (LqnPackage.Literals.EXT_VARIABLE.isInstance(srvnNonNegativeInteger)) {
				if (validateExtVariable((String)srvnNonNegativeInteger, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskOptionTypeObject(TaskOptionType taskOptionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSchedulingTypeObject(TaskSchedulingType taskSchedulingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidTypeObject(ValidType validTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LqnValidator
