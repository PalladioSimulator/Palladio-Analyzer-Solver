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
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage
 * @generated
 */
public class LqnAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static LqnPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LqnAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = LqnPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected LqnSwitch<Adapter> modelSwitch =
            new LqnSwitch<Adapter>()
            {
        @Override
        public Adapter caseActivityDefBase(final ActivityDefBase object)
        {
            return LqnAdapterFactory.this.createActivityDefBaseAdapter();
        }

        @Override
        public Adapter caseActivityDefType(final ActivityDefType object)
        {
            return LqnAdapterFactory.this.createActivityDefTypeAdapter();
        }

        @Override
        public Adapter caseActivityGraphBase(final ActivityGraphBase object)
        {
            return LqnAdapterFactory.this.createActivityGraphBaseAdapter();
        }

        @Override
        public Adapter caseActivityListType(final ActivityListType object)
        {
            return LqnAdapterFactory.this.createActivityListTypeAdapter();
        }

        @Override
        public Adapter caseActivityLoopListType(final ActivityLoopListType object)
        {
            return LqnAdapterFactory.this.createActivityLoopListTypeAdapter();
        }

        @Override
        public Adapter caseActivityLoopType(final ActivityLoopType object)
        {
            return LqnAdapterFactory.this.createActivityLoopTypeAdapter();
        }

        @Override
        public Adapter caseActivityMakingCallType(final ActivityMakingCallType object)
        {
            return LqnAdapterFactory.this.createActivityMakingCallTypeAdapter();
        }

        @Override
        public Adapter caseActivityOrType(final ActivityOrType object)
        {
            return LqnAdapterFactory.this.createActivityOrTypeAdapter();
        }

        @Override
        public Adapter caseActivityPhasesType(final ActivityPhasesType object)
        {
            return LqnAdapterFactory.this.createActivityPhasesTypeAdapter();
        }

        @Override
        public Adapter caseActivityType(final ActivityType object)
        {
            return LqnAdapterFactory.this.createActivityTypeAdapter();
        }

        @Override
        public Adapter caseAndJoinListType(final AndJoinListType object)
        {
            return LqnAdapterFactory.this.createAndJoinListTypeAdapter();
        }

        @Override
        public Adapter caseAsynchCallType(final AsynchCallType object)
        {
            return LqnAdapterFactory.this.createAsynchCallTypeAdapter();
        }

        @Override
        public Adapter caseBindType(final BindType object)
        {
            return LqnAdapterFactory.this.createBindTypeAdapter();
        }

        @Override
        public Adapter caseCallListType(final CallListType object)
        {
            return LqnAdapterFactory.this.createCallListTypeAdapter();
        }

        @Override
        public Adapter caseDocumentRoot(final DocumentRoot object)
        {
            return LqnAdapterFactory.this.createDocumentRootAdapter();
        }

        @Override
        public Adapter caseEntryActivityDefType(final EntryActivityDefType object)
        {
            return LqnAdapterFactory.this.createEntryActivityDefTypeAdapter();
        }

        @Override
        public Adapter caseEntryActivityGraph(final EntryActivityGraph object)
        {
            return LqnAdapterFactory.this.createEntryActivityGraphAdapter();
        }

        @Override
        public Adapter caseEntryMakingCallType(final EntryMakingCallType object)
        {
            return LqnAdapterFactory.this.createEntryMakingCallTypeAdapter();
        }

        @Override
        public Adapter caseEntryType(final EntryType object)
        {
            return LqnAdapterFactory.this.createEntryTypeAdapter();
        }

        @Override
        public Adapter caseFanInType(final FanInType object)
        {
            return LqnAdapterFactory.this.createFanInTypeAdapter();
        }

        @Override
        public Adapter caseFanOutType(final FanOutType object)
        {
            return LqnAdapterFactory.this.createFanOutTypeAdapter();
        }

        @Override
        public Adapter caseFirstPlotType(final FirstPlotType object)
        {
            return LqnAdapterFactory.this.createFirstPlotTypeAdapter();
        }

        @Override
        public Adapter caseGroupType(final GroupType object)
        {
            return LqnAdapterFactory.this.createGroupTypeAdapter();
        }

        @Override
        public Adapter caseHistogramBinType(final HistogramBinType object)
        {
            return LqnAdapterFactory.this.createHistogramBinTypeAdapter();
        }

        @Override
        public Adapter caseInPortType(final InPortType object)
        {
            return LqnAdapterFactory.this.createInPortTypeAdapter();
        }

        @Override
        public Adapter caseInterfaceType(final InterfaceType object)
        {
            return LqnAdapterFactory.this.createInterfaceTypeAdapter();
        }

        @Override
        public Adapter caseLqnCoreType(final LqnCoreType object)
        {
            return LqnAdapterFactory.this.createLqnCoreTypeAdapter();
        }

        @Override
        public Adapter caseLqnModelType(final LqnModelType object)
        {
            return LqnAdapterFactory.this.createLqnModelTypeAdapter();
        }

        @Override
        public Adapter caseMakingCallType(final MakingCallType object)
        {
            return LqnAdapterFactory.this.createMakingCallTypeAdapter();
        }

        @Override
        public Adapter caseMvaInfoType(final MvaInfoType object)
        {
            return LqnAdapterFactory.this.createMvaInfoTypeAdapter();
        }

        @Override
        public Adapter caseOrListType(final OrListType object)
        {
            return LqnAdapterFactory.this.createOrListTypeAdapter();
        }

        @Override
        public Adapter caseOutPortType(final OutPortType object)
        {
            return LqnAdapterFactory.this.createOutPortTypeAdapter();
        }

        @Override
        public Adapter caseOutputDistributionType(final OutputDistributionType object)
        {
            return LqnAdapterFactory.this.createOutputDistributionTypeAdapter();
        }

        @Override
        public Adapter caseOutputEntryDistributionType(final OutputEntryDistributionType object)
        {
            return LqnAdapterFactory.this.createOutputEntryDistributionTypeAdapter();
        }

        @Override
        public Adapter caseOutputResultJoinDelayType(final OutputResultJoinDelayType object)
        {
            return LqnAdapterFactory.this.createOutputResultJoinDelayTypeAdapter();
        }

        @Override
        public Adapter caseOutputResultType(final OutputResultType object)
        {
            return LqnAdapterFactory.this.createOutputResultTypeAdapter();
        }

        @Override
        public Adapter caseParameterType(final ParameterType object)
        {
            return LqnAdapterFactory.this.createParameterTypeAdapter();
        }

        @Override
        public Adapter caseParaType(final ParaType object)
        {
            return LqnAdapterFactory.this.createParaTypeAdapter();
        }

        @Override
        public Adapter casePhaseActivities(final PhaseActivities object)
        {
            return LqnAdapterFactory.this.createPhaseActivitiesAdapter();
        }

        @Override
        public Adapter casePlotControlType(final PlotControlType object)
        {
            return LqnAdapterFactory.this.createPlotControlTypeAdapter();
        }

        @Override
        public Adapter casePlotType(final PlotType object)
        {
            return LqnAdapterFactory.this.createPlotTypeAdapter();
        }

        @Override
        public Adapter casePortBindingType(final PortBindingType object)
        {
            return LqnAdapterFactory.this.createPortBindingTypeAdapter();
        }

        @Override
        public Adapter casePragmaType(final PragmaType object)
        {
            return LqnAdapterFactory.this.createPragmaTypeAdapter();
        }

        @Override
        public Adapter casePrecedenceType(final PrecedenceType object)
        {
            return LqnAdapterFactory.this.createPrecedenceTypeAdapter();
        }

        @Override
        public Adapter caseProcessorBindingType(final ProcessorBindingType object)
        {
            return LqnAdapterFactory.this.createProcessorBindingTypeAdapter();
        }

        @Override
        public Adapter caseProcessorType(final ProcessorType object)
        {
            return LqnAdapterFactory.this.createProcessorTypeAdapter();
        }

        @Override
        public Adapter caseReplyActivityType(final ReplyActivityType object)
        {
            return LqnAdapterFactory.this.createReplyActivityTypeAdapter();
        }

        @Override
        public Adapter caseReplyEntryType(final ReplyEntryType object)
        {
            return LqnAdapterFactory.this.createReplyEntryTypeAdapter();
        }

        @Override
        public Adapter caseResultConf95Type(final ResultConf95Type object)
        {
            return LqnAdapterFactory.this.createResultConf95TypeAdapter();
        }

        @Override
        public Adapter caseResultConf95Type1(final ResultConf95Type1 object)
        {
            return LqnAdapterFactory.this.createResultConf95Type1Adapter();
        }

        @Override
        public Adapter caseResultConf99Type(final ResultConf99Type object)
        {
            return LqnAdapterFactory.this.createResultConf99TypeAdapter();
        }

        @Override
        public Adapter caseResultConf99Type1(final ResultConf99Type1 object)
        {
            return LqnAdapterFactory.this.createResultConf99Type1Adapter();
        }

        @Override
        public Adapter caseResultGeneralType(final ResultGeneralType object)
        {
            return LqnAdapterFactory.this.createResultGeneralTypeAdapter();
        }

        @Override
        public Adapter caseRunControlType(final RunControlType object)
        {
            return LqnAdapterFactory.this.createRunControlTypeAdapter();
        }

        @Override
        public Adapter caseServiceType(final ServiceType object)
        {
            return LqnAdapterFactory.this.createServiceTypeAdapter();
        }

        @Override
        public Adapter caseSingleActivityListType(final SingleActivityListType object)
        {
            return LqnAdapterFactory.this.createSingleActivityListTypeAdapter();
        }

        @Override
        public Adapter caseSlotType(final SlotType object)
        {
            return LqnAdapterFactory.this.createSlotTypeAdapter();
        }

        @Override
        public Adapter caseSolverParamsType(final SolverParamsType object)
        {
            return LqnAdapterFactory.this.createSolverParamsTypeAdapter();
        }

        @Override
        public Adapter caseSynchCallType(final SynchCallType object)
        {
            return LqnAdapterFactory.this.createSynchCallTypeAdapter();
        }

        @Override
        public Adapter caseTaskActivityGraph(final TaskActivityGraph object)
        {
            return LqnAdapterFactory.this.createTaskActivityGraphAdapter();
        }

        @Override
        public Adapter caseTaskType(final TaskType object)
        {
            return LqnAdapterFactory.this.createTaskTypeAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return LqnAdapterFactory.this.createEObjectAdapter();
        }
            };

            /**
             * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
             * @generated
             */
             @Override
             public Adapter createAdapter(final Notifier target) {
                 return this.modelSwitch.doSwitch((EObject) target);
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ActivityGraphBase <em>Activity Graph Base</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ActivityLoopListType
     * <em>Activity Loop List Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ActivityMakingCallType
     * <em>Activity Making Call Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ActivityPhasesType <em>Activity Phases Type</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.BindType <em>Bind Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.EntryActivityDefType
     * <em>Entry Activity Def Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.EntryActivityDefType
                * @generated
                */
               public Adapter createEntryActivityDefTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.EntryActivityGraph <em>Entry Activity Graph</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.EntryActivityGraph
                * @generated
                */
               public Adapter createEntryActivityGraphAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.EntryMakingCallType <em>Entry Making Call Type</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.EntryMakingCallType
                * @generated
                */
               public Adapter createEntryMakingCallTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.EntryType <em>Entry Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.EntryType
                * @generated
                */
               public Adapter createEntryTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.FanInType <em>Fan In Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.GroupType <em>Group Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.LqnCoreType <em>Core Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.OutputDistributionType
     * <em>Output Distribution Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.OutputDistributionType
                * @generated
                */
               public Adapter createOutputDistributionTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.OutputEntryDistributionType
     * <em>Output Entry Distribution Type</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.OutputEntryDistributionType
                * @generated
                */
               public Adapter createOutputEntryDistributionTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType
     * <em>Output Result Join Delay Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ParaType <em>Para Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.PlotType <em>Plot Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ProcessorBindingType <em>Processor Binding Type</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ReplyActivityType <em>Reply Activity Type</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1 <em>Result Conf95 Type1</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ResultConf99Type1 <em>Result Conf99 Type1</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.ResultConf99Type1
                * @generated
                */
               public Adapter createResultConf99Type1Adapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType <em>Result General Type</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.SingleActivityListType
     * <em>Single Activity List Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.SingleActivityListType
                * @generated
                */
               public Adapter createSingleActivityListTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.SlotType <em>Slot Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
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
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.TaskActivityGraph <em>Task Activity Graph</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.TaskActivityGraph
                * @generated
                */
               public Adapter createTaskActivityGraphAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.lqn.TaskType <em>Task Type</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @see org.palladiosimulator.solver.lqn.TaskType
                * @generated
                */
               public Adapter createTaskTypeAdapter() {
                   return null;
               }

               /**
                * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
                * @generated
                */
               public Adapter createEObjectAdapter() {
                   return null;
               }

} // LqnAdapterFactory
