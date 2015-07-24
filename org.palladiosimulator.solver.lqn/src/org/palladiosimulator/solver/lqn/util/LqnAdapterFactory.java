/**
 */
package org.palladiosimulator.solver.lqn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
import org.palladiosimulator.solver.lqn.FanInType;
import org.palladiosimulator.solver.lqn.FanOutType;
import org.palladiosimulator.solver.lqn.FirstPlotType;
import org.palladiosimulator.solver.lqn.GroupType;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnCoreType;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.MakingCallType;
import org.palladiosimulator.solver.lqn.MvaInfoType;
import org.palladiosimulator.solver.lqn.OrListType;
import org.palladiosimulator.solver.lqn.OutPortType;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultJoinDelayType;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.palladiosimulator.solver.lqn.LqnPackage
 * @generated
 */
public class LqnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static LqnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LqnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LqnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected LqnSwitch<Adapter> modelSwitch = new LqnSwitch<Adapter>() {
		@Override
		public Adapter caseActivityDefBase(ActivityDefBase object) {
			return createActivityDefBaseAdapter();
		}

		@Override
		public Adapter caseActivityDefType(ActivityDefType object) {
			return createActivityDefTypeAdapter();
		}

		@Override
		public Adapter caseActivityGraphBase(ActivityGraphBase object) {
			return createActivityGraphBaseAdapter();
		}

		@Override
		public Adapter caseActivityListType(ActivityListType object) {
			return createActivityListTypeAdapter();
		}

		@Override
		public Adapter caseActivityLoopListType(ActivityLoopListType object) {
			return createActivityLoopListTypeAdapter();
		}

		@Override
		public Adapter caseActivityLoopType(ActivityLoopType object) {
			return createActivityLoopTypeAdapter();
		}

		@Override
		public Adapter caseActivityMakingCallType(ActivityMakingCallType object) {
			return createActivityMakingCallTypeAdapter();
		}

		@Override
		public Adapter caseActivityOrType(ActivityOrType object) {
			return createActivityOrTypeAdapter();
		}

		@Override
		public Adapter caseActivityPhasesType(ActivityPhasesType object) {
			return createActivityPhasesTypeAdapter();
		}

		@Override
		public Adapter caseActivityType(ActivityType object) {
			return createActivityTypeAdapter();
		}

		@Override
		public Adapter caseAndJoinListType(AndJoinListType object) {
			return createAndJoinListTypeAdapter();
		}

		@Override
		public Adapter caseAsynchCallType(AsynchCallType object) {
			return createAsynchCallTypeAdapter();
		}

		@Override
		public Adapter caseBindType(BindType object) {
			return createBindTypeAdapter();
		}

		@Override
		public Adapter caseCallListType(CallListType object) {
			return createCallListTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseEntryActivityDefType(EntryActivityDefType object) {
			return createEntryActivityDefTypeAdapter();
		}

		@Override
		public Adapter caseEntryActivityGraph(EntryActivityGraph object) {
			return createEntryActivityGraphAdapter();
		}

		@Override
		public Adapter caseEntryMakingCallType(EntryMakingCallType object) {
			return createEntryMakingCallTypeAdapter();
		}

		@Override
		public Adapter caseEntryType(EntryType object) {
			return createEntryTypeAdapter();
		}

		@Override
		public Adapter caseFanInType(FanInType object) {
			return createFanInTypeAdapter();
		}

		@Override
		public Adapter caseFanOutType(FanOutType object) {
			return createFanOutTypeAdapter();
		}

		@Override
		public Adapter caseFirstPlotType(FirstPlotType object) {
			return createFirstPlotTypeAdapter();
		}

		@Override
		public Adapter caseGroupType(GroupType object) {
			return createGroupTypeAdapter();
		}

		@Override
		public Adapter caseHistogramBinType(HistogramBinType object) {
			return createHistogramBinTypeAdapter();
		}

		@Override
		public Adapter caseInPortType(InPortType object) {
			return createInPortTypeAdapter();
		}

		@Override
		public Adapter caseInterfaceType(InterfaceType object) {
			return createInterfaceTypeAdapter();
		}

		@Override
		public Adapter caseLqnCoreType(LqnCoreType object) {
			return createLqnCoreTypeAdapter();
		}

		@Override
		public Adapter caseLqnModelType(LqnModelType object) {
			return createLqnModelTypeAdapter();
		}

		@Override
		public Adapter caseMakingCallType(MakingCallType object) {
			return createMakingCallTypeAdapter();
		}

		@Override
		public Adapter caseMvaInfoType(MvaInfoType object) {
			return createMvaInfoTypeAdapter();
		}

		@Override
		public Adapter caseOrListType(OrListType object) {
			return createOrListTypeAdapter();
		}

		@Override
		public Adapter caseOutPortType(OutPortType object) {
			return createOutPortTypeAdapter();
		}

		@Override
		public Adapter caseOutputDistributionType(OutputDistributionType object) {
			return createOutputDistributionTypeAdapter();
		}

		@Override
		public Adapter caseOutputEntryDistributionType(OutputEntryDistributionType object) {
			return createOutputEntryDistributionTypeAdapter();
		}

		@Override
		public Adapter caseOutputResultJoinDelayType(OutputResultJoinDelayType object) {
			return createOutputResultJoinDelayTypeAdapter();
		}

		@Override
		public Adapter caseOutputResultType(OutputResultType object) {
			return createOutputResultTypeAdapter();
		}

		@Override
		public Adapter caseParameterType(ParameterType object) {
			return createParameterTypeAdapter();
		}

		@Override
		public Adapter caseParaType(ParaType object) {
			return createParaTypeAdapter();
		}

		@Override
		public Adapter casePhaseActivities(PhaseActivities object) {
			return createPhaseActivitiesAdapter();
		}

		@Override
		public Adapter casePlotControlType(PlotControlType object) {
			return createPlotControlTypeAdapter();
		}

		@Override
		public Adapter casePlotType(PlotType object) {
			return createPlotTypeAdapter();
		}

		@Override
		public Adapter casePortBindingType(PortBindingType object) {
			return createPortBindingTypeAdapter();
		}

		@Override
		public Adapter casePragmaType(PragmaType object) {
			return createPragmaTypeAdapter();
		}

		@Override
		public Adapter casePrecedenceType(PrecedenceType object) {
			return createPrecedenceTypeAdapter();
		}

		@Override
		public Adapter caseProcessorBindingType(ProcessorBindingType object) {
			return createProcessorBindingTypeAdapter();
		}

		@Override
		public Adapter caseProcessorType(ProcessorType object) {
			return createProcessorTypeAdapter();
		}

		@Override
		public Adapter caseReplyActivityType(ReplyActivityType object) {
			return createReplyActivityTypeAdapter();
		}

		@Override
		public Adapter caseReplyEntryType(ReplyEntryType object) {
			return createReplyEntryTypeAdapter();
		}

		@Override
		public Adapter caseResultConf95Type(ResultConf95Type object) {
			return createResultConf95TypeAdapter();
		}

		@Override
		public Adapter caseResultConf95Type1(ResultConf95Type1 object) {
			return createResultConf95Type1Adapter();
		}

		@Override
		public Adapter caseResultConf99Type(ResultConf99Type object) {
			return createResultConf99TypeAdapter();
		}

		@Override
		public Adapter caseResultConf99Type1(ResultConf99Type1 object) {
			return createResultConf99Type1Adapter();
		}

		@Override
		public Adapter caseResultGeneralType(ResultGeneralType object) {
			return createResultGeneralTypeAdapter();
		}

		@Override
		public Adapter caseRunControlType(RunControlType object) {
			return createRunControlTypeAdapter();
		}

		@Override
		public Adapter caseServiceType(ServiceType object) {
			return createServiceTypeAdapter();
		}

		@Override
		public Adapter caseSingleActivityListType(SingleActivityListType object) {
			return createSingleActivityListTypeAdapter();
		}

		@Override
		public Adapter caseSlotType(SlotType object) {
			return createSlotTypeAdapter();
		}

		@Override
		public Adapter caseSolverParamsType(SolverParamsType object) {
			return createSolverParamsTypeAdapter();
		}

		@Override
		public Adapter caseSynchCallType(SynchCallType object) {
			return createSynchCallTypeAdapter();
		}

		@Override
		public Adapter caseTaskActivityGraph(TaskActivityGraph object) {
			return createTaskActivityGraphAdapter();
		}

		@Override
		public Adapter caseTaskType(TaskType object) {
			return createTaskTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ActivityDefBase <em>Activity Def Base</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase
	 * @generated
	 */
	public Adapter createActivityDefBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ActivityDefType <em>Activity Def Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType
	 * @generated
	 */
	public Adapter createActivityDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ActivityGraphBase <em>Activity Graph Base</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityGraphBase
	 * @generated
	 */
	public Adapter createActivityGraphBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ActivityListType <em>Activity List Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityListType
	 * @generated
	 */
	public Adapter createActivityListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ActivityLoopListType <em>Activity Loop List Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	         * returns null so that we can easily ignore cases; it's useful to ignore a case when
	         * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopListType
	 * @generated
	 */
	public Adapter createActivityLoopListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ActivityLoopType <em>Activity Loop Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopType
	 * @generated
	 */
	public Adapter createActivityLoopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ActivityMakingCallType <em>Activity Making Call Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	         * returns null so that we can easily ignore cases; it's useful to ignore a case when
	         * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityMakingCallType
	 * @generated
	 */
	public Adapter createActivityMakingCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ActivityOrType <em>Activity Or Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityOrType
	 * @generated
	 */
	public Adapter createActivityOrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ActivityPhasesType <em>Activity Phases Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType
	 * @generated
	 */
	public Adapter createActivityPhasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ActivityType <em>Activity Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ActivityType
	 * @generated
	 */
	public Adapter createActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.AndJoinListType <em>And Join List Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.AndJoinListType
	 * @generated
	 */
	public Adapter createAndJoinListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.AsynchCallType <em>Asynch Call Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.AsynchCallType
	 * @generated
	 */
	public Adapter createAsynchCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.BindType <em>Bind Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.BindType
	 * @generated
	 */
	public Adapter createBindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.CallListType <em>Call List Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.CallListType
	 * @generated
	 */
	public Adapter createCallListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.DocumentRoot <em>Document Root</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.EntryActivityDefType <em>Entry Activity Def Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	         * returns null so that we can easily ignore cases; it's useful to ignore a case when
	         * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType
	 * @generated
	 */
	public Adapter createEntryActivityDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.EntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityGraph
	 * @generated
	 */
	public Adapter createEntryActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.EntryMakingCallType <em>Entry Making Call Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	         * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.EntryMakingCallType
	 * @generated
	 */
	public Adapter createEntryMakingCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.FanInType <em>Fan In Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.FanInType
	 * @generated
	 */
	public Adapter createFanInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.FanOutType <em>Fan Out Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.FanOutType
	 * @generated
	 */
	public Adapter createFanOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.FirstPlotType <em>First Plot Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.FirstPlotType
	 * @generated
	 */
	public Adapter createFirstPlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.GroupType
	 * @generated
	 */
	public Adapter createGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.HistogramBinType <em>Histogram Bin Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType
	 * @generated
	 */
	public Adapter createHistogramBinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.InPortType <em>In Port Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.InPortType
	 * @generated
	 */
	public Adapter createInPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.InterfaceType <em>Interface Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.LqnCoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.LqnCoreType
	 * @generated
	 */
	public Adapter createLqnCoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.LqnModelType <em>Model Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType
	 * @generated
	 */
	public Adapter createLqnModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.MakingCallType <em>Making Call Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.MakingCallType
	 * @generated
	 */
	public Adapter createMakingCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.MvaInfoType <em>Mva Info Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType
	 * @generated
	 */
	public Adapter createMvaInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.OrListType <em>Or List Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.OrListType
	 * @generated
	 */
	public Adapter createOrListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.OutPortType <em>Out Port Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.OutPortType
	 * @generated
	 */
	public Adapter createOutPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.OutputDistributionType <em>Output Distribution Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	         * returns null so that we can easily ignore cases; it's useful to ignore a case when
	         * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType
	 * @generated
	 */
	public Adapter createOutputDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.OutputEntryDistributionType <em>Output Entry Distribution Type</em>}'.
	 * <!-- begin-user-doc --> This default
	         * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	         * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.OutputEntryDistributionType
	 * @generated
	 */
	public Adapter createOutputEntryDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType <em>Output Result Join Delay Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	         * returns null so that we can easily ignore cases; it's useful to ignore a case when
	         * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.OutputResultJoinDelayType
	 * @generated
	 */
	public Adapter createOutputResultJoinDelayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.OutputResultType <em>Output Result Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType
	 * @generated
	 */
	public Adapter createOutputResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ParameterType <em>Parameter Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ParaType <em>Para Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ParaType
	 * @generated
	 */
	public Adapter createParaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.PhaseActivities <em>Phase Activities</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.PhaseActivities
	 * @generated
	 */
	public Adapter createPhaseActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.PlotControlType <em>Plot Control Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.PlotControlType
	 * @generated
	 */
	public Adapter createPlotControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.PlotType <em>Plot Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.PlotType
	 * @generated
	 */
	public Adapter createPlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.PortBindingType <em>Port Binding Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.PortBindingType
	 * @generated
	 */
	public Adapter createPortBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.PragmaType <em>Pragma Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.PragmaType
	 * @generated
	 */
	public Adapter createPragmaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.PrecedenceType <em>Precedence Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType
	 * @generated
	 */
	public Adapter createPrecedenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ProcessorBindingType <em>Processor Binding Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	         * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ProcessorBindingType
	 * @generated
	 */
	public Adapter createProcessorBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ProcessorType <em>Processor Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType
	 * @generated
	 */
	public Adapter createProcessorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ReplyActivityType <em>Reply Activity Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ReplyActivityType
	 * @generated
	 */
	public Adapter createReplyActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ReplyEntryType <em>Reply Entry Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ReplyEntryType
	 * @generated
	 */
	public Adapter createReplyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ResultConf95Type <em>Result Conf95 Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type
	 * @generated
	 */
	public Adapter createResultConf95TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1 <em>Result Conf95 Type1</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1
	 * @generated
	 */
	public Adapter createResultConf95Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ResultConf99Type <em>Result Conf99 Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type
	 * @generated
	 */
	public Adapter createResultConf99TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1 <em>Result Conf99 Type1</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1
	 * @generated
	 */
	public Adapter createResultConf99Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.ResultGeneralType <em>Result General Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType
	 * @generated
	 */
	public Adapter createResultGeneralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.RunControlType <em>Run Control Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.RunControlType
	 * @generated
	 */
	public Adapter createRunControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.ServiceType <em>Service Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.SingleActivityListType <em>Single Activity List Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	         * returns null so that we can easily ignore cases; it's useful to ignore a case when
	         * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.SingleActivityListType
	 * @generated
	 */
	public Adapter createSingleActivityListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.SlotType
	 * @generated
	 */
	public Adapter createSlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.SolverParamsType <em>Solver Params Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType
	 * @generated
	 */
	public Adapter createSolverParamsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	         * {@link org.palladiosimulator.solver.lqn.SynchCallType <em>Synch Call Type</em>}'. <!--
	         * begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	         *
	         * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.SynchCallType
	 * @generated
	 */
	public Adapter createSynchCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.TaskActivityGraph <em>Task Activity Graph</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	         * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	         * end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.TaskActivityGraph
	 * @generated
	 */
	public Adapter createTaskActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.lqn.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc
	         * --> This default implementation returns null so that we can easily ignore cases; it's useful
	         * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.solver.lqn.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default
	         * implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // LqnAdapterFactory
