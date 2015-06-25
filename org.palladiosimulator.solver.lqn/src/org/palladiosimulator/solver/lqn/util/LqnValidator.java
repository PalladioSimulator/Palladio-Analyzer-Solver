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
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage
 * @generated
 */
public class LqnValidator extends EObjectValidator {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final LqnValidator INSTANCE = new LqnValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.solver.lqn";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants in a derived class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected XMLTypeValidator xmlTypeValidator;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LqnValidator() {
        super();
        this.xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return LqnPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected boolean validate(final int classifierID, final Object value, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        switch (classifierID)
        {
        case LqnPackage.ACTIVITY_DEF_BASE:
            return this.validateActivityDefBase((ActivityDefBase) value, diagnostics, context);
        case LqnPackage.ACTIVITY_DEF_TYPE:
            return this.validateActivityDefType((ActivityDefType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_GRAPH_BASE:
            return this.validateActivityGraphBase((ActivityGraphBase) value, diagnostics, context);
        case LqnPackage.ACTIVITY_LIST_TYPE:
            return this.validateActivityListType((ActivityListType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE:
            return this.validateActivityLoopListType((ActivityLoopListType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_LOOP_TYPE:
            return this.validateActivityLoopType((ActivityLoopType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE:
            return this.validateActivityMakingCallType((ActivityMakingCallType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_OR_TYPE:
            return this.validateActivityOrType((ActivityOrType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_PHASES_TYPE:
            return this.validateActivityPhasesType((ActivityPhasesType) value, diagnostics, context);
        case LqnPackage.ACTIVITY_TYPE:
            return this.validateActivityType((ActivityType) value, diagnostics, context);
        case LqnPackage.AND_JOIN_LIST_TYPE:
            return this.validateAndJoinListType((AndJoinListType) value, diagnostics, context);
        case LqnPackage.ASYNCH_CALL_TYPE:
            return this.validateAsynchCallType((AsynchCallType) value, diagnostics, context);
        case LqnPackage.BIND_TYPE:
            return this.validateBindType((BindType) value, diagnostics, context);
        case LqnPackage.CALL_LIST_TYPE:
            return this.validateCallListType((CallListType) value, diagnostics, context);
        case LqnPackage.DOCUMENT_ROOT:
            return this.validateDocumentRoot((DocumentRoot) value, diagnostics, context);
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE:
            return this.validateEntryActivityDefType((EntryActivityDefType) value, diagnostics, context);
        case LqnPackage.ENTRY_ACTIVITY_GRAPH:
            return this.validateEntryActivityGraph((EntryActivityGraph) value, diagnostics, context);
        case LqnPackage.ENTRY_MAKING_CALL_TYPE:
            return this.validateEntryMakingCallType((EntryMakingCallType) value, diagnostics, context);
        case LqnPackage.ENTRY_TYPE:
            return this.validateEntryType((EntryType) value, diagnostics, context);
        case LqnPackage.FIRST_PLOT_TYPE:
            return this.validateFirstPlotType((FirstPlotType) value, diagnostics, context);
        case LqnPackage.HISTOGRAM_BIN_TYPE:
            return this.validateHistogramBinType((HistogramBinType) value, diagnostics, context);
        case LqnPackage.IN_PORT_TYPE:
            return this.validateInPortType((InPortType) value, diagnostics, context);
        case LqnPackage.INTERFACE_TYPE:
            return this.validateInterfaceType((InterfaceType) value, diagnostics, context);
        case LqnPackage.LQN_CORE_TYPE:
            return this.validateLqnCoreType((LqnCoreType) value, diagnostics, context);
        case LqnPackage.LQN_MODEL_TYPE:
            return this.validateLqnModelType((LqnModelType) value, diagnostics, context);
        case LqnPackage.MAKING_CALL_TYPE:
            return this.validateMakingCallType((MakingCallType) value, diagnostics, context);
        case LqnPackage.OR_LIST_TYPE:
            return this.validateOrListType((OrListType) value, diagnostics, context);
        case LqnPackage.OUT_PORT_TYPE:
            return this.validateOutPortType((OutPortType) value, diagnostics, context);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE:
            return this.validateOutputDistributionType((OutputDistributionType) value, diagnostics, context);
        case LqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE:
            return this.validateOutputEntryDistributionType((OutputEntryDistributionType) value, diagnostics, context);
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY:
            return this.validateOutputResultForwardingANDJoinDelay((OutputResultForwardingANDJoinDelay) value,
                    diagnostics,
                    context);
        case LqnPackage.OUTPUT_RESULT_TYPE:
            return this.validateOutputResultType((OutputResultType) value, diagnostics, context);
        case LqnPackage.PARAMETER_TYPE:
            return this.validateParameterType((ParameterType) value, diagnostics, context);
        case LqnPackage.PARA_TYPE:
            return this.validateParaType((ParaType) value, diagnostics, context);
        case LqnPackage.PHASE_ACTIVITIES:
            return this.validatePhaseActivities((PhaseActivities) value, diagnostics, context);
        case LqnPackage.PLOT_CONTROL_TYPE:
            return this.validatePlotControlType((PlotControlType) value, diagnostics, context);
        case LqnPackage.PLOT_TYPE:
            return this.validatePlotType((PlotType) value, diagnostics, context);
        case LqnPackage.PORT_BINDING_TYPE:
            return this.validatePortBindingType((PortBindingType) value, diagnostics, context);
        case LqnPackage.PRAGMA_TYPE:
            return this.validatePragmaType((PragmaType) value, diagnostics, context);
        case LqnPackage.PRECEDENCE_TYPE:
            return this.validatePrecedenceType((PrecedenceType) value, diagnostics, context);
        case LqnPackage.PROCESSOR_BINDING_TYPE:
            return this.validateProcessorBindingType((ProcessorBindingType) value, diagnostics, context);
        case LqnPackage.PROCESSOR_TYPE:
            return this.validateProcessorType((ProcessorType) value, diagnostics, context);
        case LqnPackage.REPLY_ACTIVITY_TYPE:
            return this.validateReplyActivityType((ReplyActivityType) value, diagnostics, context);
        case LqnPackage.REPLY_ENTRY_TYPE:
            return this.validateReplyEntryType((ReplyEntryType) value, diagnostics, context);
        case LqnPackage.RESULT_CONF95_TYPE:
            return this.validateResultConf95Type((ResultConf95Type) value, diagnostics, context);
        case LqnPackage.RESULT_CONF95_TYPE1:
            return this.validateResultConf95Type1((ResultConf95Type1) value, diagnostics, context);
        case LqnPackage.RESULT_CONF99_TYPE:
            return this.validateResultConf99Type((ResultConf99Type) value, diagnostics, context);
        case LqnPackage.RESULT_CONF99_TYPE1:
            return this.validateResultConf99Type1((ResultConf99Type1) value, diagnostics, context);
        case LqnPackage.RESULT_GENERAL_TYPE:
            return this.validateResultGeneralType((ResultGeneralType) value, diagnostics, context);
        case LqnPackage.RUN_CONTROL_TYPE:
            return this.validateRunControlType((RunControlType) value, diagnostics, context);
        case LqnPackage.SERVICE_TYPE:
            return this.validateServiceType((ServiceType) value, diagnostics, context);
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE:
            return this.validateSingleActivityListType((SingleActivityListType) value, diagnostics, context);
        case LqnPackage.SLOT_TYPE:
            return this.validateSlotType((SlotType) value, diagnostics, context);
        case LqnPackage.SOLVER_PARAMS_TYPE:
            return this.validateSolverParamsType((SolverParamsType) value, diagnostics, context);
        case LqnPackage.SYNCH_CALL_TYPE:
            return this.validateSynchCallType((SynchCallType) value, diagnostics, context);
        case LqnPackage.TASK_ACTIVITY_GRAPH:
            return this.validateTaskActivityGraph((TaskActivityGraph) value, diagnostics, context);
        case LqnPackage.TASK_TYPE:
            return this.validateTaskType((TaskType) value, diagnostics, context);
        case LqnPackage.AXIS_TYPE:
            return this.validateAxisType((AxisType) value, diagnostics, context);
        case LqnPackage.CALL_ORDER_TYPE:
            return this.validateCallOrderType((CallOrderType) value, diagnostics, context);
        case LqnPackage.SCHEDULING_TYPE:
            return this.validateSchedulingType((SchedulingType) value, diagnostics, context);
        case LqnPackage.SEMAPHORE_TYPE:
            return this.validateSemaphoreType((SemaphoreType) value, diagnostics, context);
        case LqnPackage.TASK_OPTION_TYPE:
            return this.validateTaskOptionType((TaskOptionType) value, diagnostics, context);
        case LqnPackage.TASK_SCHEDULING_TYPE:
            return this.validateTaskSchedulingType((TaskSchedulingType) value, diagnostics, context);
        case LqnPackage.TYPE_TYPE:
            return this.validateTypeType((TypeType) value, diagnostics, context);
        case LqnPackage.VALID_TYPE:
            return this.validateValidType((ValidType) value, diagnostics, context);
        case LqnPackage.XML_DEBUG_TYPE:
            return this.validateXmlDebugType((XmlDebugType) value, diagnostics, context);
        case LqnPackage.AXIS_TYPE_OBJECT:
            return this.validateAxisTypeObject((AxisType) value, diagnostics, context);
        case LqnPackage.CALL_ORDER_TYPE_OBJECT:
            return this.validateCallOrderTypeObject((CallOrderType) value, diagnostics, context);
        case LqnPackage.CONNECT_FROM_TYPE:
            return this.validateConnectFromType((List<?>) value, diagnostics, context);
        case LqnPackage.CONNECT_TO_TYPE:
            return this.validateConnectToType((List<?>) value, diagnostics, context);
        case LqnPackage.PHASE_TYPE:
            return this.validatePhaseType((BigInteger) value, diagnostics, context);
        case LqnPackage.SCHEDULING_TYPE_OBJECT:
            return this.validateSchedulingTypeObject((SchedulingType) value, diagnostics, context);
        case LqnPackage.SCI_NOTATION:
            return this.validateSciNotation((String) value, diagnostics, context);
        case LqnPackage.SEMAPHORE_TYPE_OBJECT:
            return this.validateSemaphoreTypeObject((SemaphoreType) value, diagnostics, context);
        case LqnPackage.SRVN_FLOAT:
            return this.validateSrvnFloat(value, diagnostics, context);
        case LqnPackage.TASK_OPTION_TYPE_OBJECT:
            return this.validateTaskOptionTypeObject((TaskOptionType) value, diagnostics, context);
        case LqnPackage.TASK_SCHEDULING_TYPE_OBJECT:
            return this.validateTaskSchedulingTypeObject((TaskSchedulingType) value, diagnostics, context);
        case LqnPackage.TYPE_TYPE_OBJECT:
            return this.validateTypeTypeObject((TypeType) value, diagnostics, context);
        case LqnPackage.VALID_TYPE_OBJECT:
            return this.validateValidTypeObject((ValidType) value, diagnostics, context);
        case LqnPackage.XML_DEBUG_TYPE_OBJECT:
            return this.validateXmlDebugTypeObject((XmlDebugType) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityDefBase(final ActivityDefBase activityDefBase, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityDefBase, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityDefType(final ActivityDefType activityDefType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityDefType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityGraphBase(final ActivityGraphBase activityGraphBase,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityGraphBase, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityListType(final ActivityListType activityListType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityListType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityLoopListType(final ActivityLoopListType activityLoopListType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityLoopListType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityLoopType(final ActivityLoopType activityLoopType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityLoopType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityMakingCallType(final ActivityMakingCallType activityMakingCallType,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityMakingCallType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityOrType(final ActivityOrType activityOrType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityOrType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityPhasesType(final ActivityPhasesType activityPhasesType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityPhasesType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateActivityType(final ActivityType activityType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(activityType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateAndJoinListType(final AndJoinListType andJoinListType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(andJoinListType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateAsynchCallType(final AsynchCallType asynchCallType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(asynchCallType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateBindType(final BindType bindType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(bindType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCallListType(final CallListType callListType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(callListType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDocumentRoot(final DocumentRoot documentRoot, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEntryActivityDefType(final EntryActivityDefType entryActivityDefType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(entryActivityDefType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEntryActivityGraph(final EntryActivityGraph entryActivityGraph,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(entryActivityGraph, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEntryMakingCallType(final EntryMakingCallType entryMakingCallType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(entryMakingCallType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEntryType(final EntryType entryType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(entryType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateFirstPlotType(final FirstPlotType firstPlotType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(firstPlotType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateHistogramBinType(final HistogramBinType histogramBinType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(histogramBinType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateInPortType(final InPortType inPortType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(inPortType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateInterfaceType(final InterfaceType interfaceType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(interfaceType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateLqnCoreType(final LqnCoreType lqnCoreType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(lqnCoreType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateLqnModelType(final LqnModelType lqnModelType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(lqnModelType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateMakingCallType(final MakingCallType makingCallType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(makingCallType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOrListType(final OrListType orListType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(orListType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOutPortType(final OutPortType outPortType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(outPortType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOutputDistributionType(final OutputDistributionType outputDistributionType,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(outputDistributionType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOutputEntryDistributionType(final OutputEntryDistributionType outputEntryDistributionType,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(outputEntryDistributionType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOutputResultForwardingANDJoinDelay(
            final OutputResultForwardingANDJoinDelay outputResultForwardingANDJoinDelay,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(outputResultForwardingANDJoinDelay, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOutputResultType(final OutputResultType outputResultType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(outputResultType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateParameterType(final ParameterType parameterType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(parameterType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateParaType(final ParaType paraType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(paraType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePhaseActivities(final PhaseActivities phaseActivities, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(phaseActivities, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePlotControlType(final PlotControlType plotControlType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(plotControlType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePlotType(final PlotType plotType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(plotType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePortBindingType(final PortBindingType portBindingType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(portBindingType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePragmaType(final PragmaType pragmaType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(pragmaType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePrecedenceType(final PrecedenceType precedenceType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(precedenceType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateProcessorBindingType(final ProcessorBindingType processorBindingType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(processorBindingType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateProcessorType(final ProcessorType processorType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(processorType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateReplyActivityType(final ReplyActivityType replyActivityType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(replyActivityType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateReplyEntryType(final ReplyEntryType replyEntryType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(replyEntryType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResultConf95Type(final ResultConf95Type resultConf95Type, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(resultConf95Type, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResultConf95Type1(final ResultConf95Type1 resultConf95Type1,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(resultConf95Type1, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResultConf99Type(final ResultConf99Type resultConf99Type, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(resultConf99Type, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResultConf99Type1(final ResultConf99Type1 resultConf99Type1,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(resultConf99Type1, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResultGeneralType(final ResultGeneralType resultGeneralType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(resultGeneralType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRunControlType(final RunControlType runControlType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(runControlType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateServiceType(final ServiceType serviceType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(serviceType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSingleActivityListType(final SingleActivityListType singleActivityListType,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(singleActivityListType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSlotType(final SlotType slotType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(slotType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSolverParamsType(final SolverParamsType solverParamsType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(solverParamsType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSynchCallType(final SynchCallType synchCallType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(synchCallType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTaskActivityGraph(final TaskActivityGraph taskActivityGraph,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(taskActivityGraph, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTaskType(final TaskType taskType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(taskType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateAxisType(final AxisType axisType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCallOrderType(final CallOrderType callOrderType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSchedulingType(final SchedulingType schedulingType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSemaphoreType(final SemaphoreType semaphoreType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTaskOptionType(final TaskOptionType taskOptionType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTaskSchedulingType(final TaskSchedulingType taskSchedulingType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTypeType(final TypeType typeType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateValidType(final ValidType validType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateXmlDebugType(final XmlDebugType xmlDebugType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateAxisTypeObject(final AxisType axisTypeObject, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCallOrderTypeObject(final CallOrderType callOrderTypeObject,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateConnectFromType(final List<?> connectFromType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = this.validateConnectFromType_ItemType(connectFromType, diagnostics, context);
        return result;
    }

    /**
     * Validates the ItemType constraint of '<em>Connect From Type</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateConnectFromType_ItemType(final List<?> connectFromType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        boolean result = true;
        for (final Iterator<?> i = connectFromType.iterator(); i.hasNext() && (result || diagnostics != null);)
        {
            final Object item = i.next();
            if (XMLTypePackage.Literals.STRING.isInstance(item))
            {
                result &= this.xmlTypeValidator.validateString((String) item, diagnostics, context);
            }
            else
            {
                result = false;
                this.reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
            }
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateConnectToType(final List<?> connectToType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = this.validateConnectToType_ItemType(connectToType, diagnostics, context);
        return result;
    }

    /**
     * Validates the ItemType constraint of '<em>Connect To Type</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validateConnectToType_ItemType(final List<?> connectToType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        boolean result = true;
        for (final Iterator<?> i = connectToType.iterator(); i.hasNext() && (result || diagnostics != null);)
        {
            final Object item = i.next();
            if (XMLTypePackage.Literals.STRING.isInstance(item))
            {
                result &= this.xmlTypeValidator.validateString((String) item, diagnostics, context);
            }
            else
            {
                result = false;
                this.reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
            }
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePhaseType(final BigInteger phaseType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        boolean result = this.validatePhaseType_Min(phaseType, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validatePhaseType_Max(phaseType, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @see #validatePhaseType_Min
     */
    public static final BigInteger PHASE_TYPE__MIN__VALUE = new BigInteger("1");

    /**
     * Validates the Min constraint of '<em>Phase Type</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validatePhaseType_Min(final BigInteger phaseType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = phaseType.compareTo(PHASE_TYPE__MIN__VALUE) >= 0;
        if (!result && diagnostics != null) {
            this.reportMinViolation(LqnPackage.Literals.PHASE_TYPE, phaseType, PHASE_TYPE__MIN__VALUE, true,
                    diagnostics,
                    context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @see #validatePhaseType_Max
     */
    public static final BigInteger PHASE_TYPE__MAX__VALUE = new BigInteger("3");

    /**
     * Validates the Max constraint of '<em>Phase Type</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validatePhaseType_Max(final BigInteger phaseType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = phaseType.compareTo(PHASE_TYPE__MAX__VALUE) <= 0;
        if (!result && diagnostics != null) {
            this.reportMaxViolation(LqnPackage.Literals.PHASE_TYPE, phaseType, PHASE_TYPE__MAX__VALUE, true,
                    diagnostics,
                    context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSchedulingTypeObject(final SchedulingType schedulingTypeObject,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSciNotation(final String sciNotation, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = this.validateSciNotation_Pattern(sciNotation, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @see #validateSciNotation_Pattern
     */
    public static final PatternMatcher[][] SCI_NOTATION__PATTERN__VALUES = new PatternMatcher[][]
            {
        new PatternMatcher[]
                {
                XMLTypeUtil.createPatternMatcher("[\\+|\\-]?\\d+((\\.\\d+)?[e|E][\\+|\\-]\\d+)?")
                }
            };

    /**
     * Validates the Pattern constraint of '<em>Sci Notation</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validateSciNotation_Pattern(final String sciNotation, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validatePattern(LqnPackage.Literals.SCI_NOTATION, sciNotation, SCI_NOTATION__PATTERN__VALUES,
                diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSemaphoreTypeObject(final SemaphoreType semaphoreTypeObject,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSrvnFloat(final Object srvnFloat, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        final boolean result = this.validateSrvnFloat_MemberTypes(srvnFloat, diagnostics, context);
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Srvn Float</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public boolean validateSrvnFloat_MemberTypes(final Object srvnFloat, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (diagnostics != null)
        {
            final BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if (LqnPackage.Literals.SCI_NOTATION.isInstance(srvnFloat))
            {
                if (this.validateSciNotation((String) srvnFloat, tempDiagnostics, context)) {
                    return true;
                }
            }
            if (XMLTypePackage.Literals.DECIMAL.isInstance(srvnFloat))
            {
                if (this.xmlTypeValidator.validateDecimal((BigDecimal) srvnFloat, tempDiagnostics, context)) {
                    return true;
                }
            }
            for (final Diagnostic diagnostic : tempDiagnostics.getChildren())
            {
                diagnostics.add(diagnostic);
            }
        }
        else
        {
            if (LqnPackage.Literals.SCI_NOTATION.isInstance(srvnFloat))
            {
                if (this.validateSciNotation((String) srvnFloat, null, context)) {
                    return true;
                }
            }
            if (XMLTypePackage.Literals.DECIMAL.isInstance(srvnFloat))
            {
                if (this.xmlTypeValidator.validateDecimal((BigDecimal) srvnFloat, null, context)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTaskOptionTypeObject(final TaskOptionType taskOptionTypeObject,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTaskSchedulingTypeObject(final TaskSchedulingType taskSchedulingTypeObject,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateTypeTypeObject(final TypeType typeTypeObject, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateValidTypeObject(final ValidType validTypeObject, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateXmlDebugTypeObject(final XmlDebugType xmlDebugTypeObject, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's
     * diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} // LqnValidator
