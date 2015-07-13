/**
 */
package org.palladiosimulator.solver.lqn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ResultConf95Type1;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ResultConf95Type1ItemProvider
        extends ItemProviderAdapter
        implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ResultConf95Type1ItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            this.addLossProbabilityPropertyDescriptor(object);
            this.addOpenWaitTimePropertyDescriptor(object);
            this.addPhase1ProcWaitingPropertyDescriptor(object);
            this.addPhase1ServiceTimePropertyDescriptor(object);
            this.addPhase1ServiceTimeVariancePropertyDescriptor(object);
            this.addPhase1UtilizationPropertyDescriptor(object);
            this.addPhase1WaitingPropertyDescriptor(object);
            this.addPhase1WaitingVariancePropertyDescriptor(object);
            this.addPhase2ProcWaitingPropertyDescriptor(object);
            this.addPhase2ServiceTimePropertyDescriptor(object);
            this.addPhase2ServiceTimeVariancePropertyDescriptor(object);
            this.addPhase2UtilizationPropertyDescriptor(object);
            this.addPhase2WaitingPropertyDescriptor(object);
            this.addPhase2WaitingVariancePropertyDescriptor(object);
            this.addPhase3ProcWaitingPropertyDescriptor(object);
            this.addPhase3ServiceTimePropertyDescriptor(object);
            this.addPhase3ServiceTimeVariancePropertyDescriptor(object);
            this.addPhase3UtilizationPropertyDescriptor(object);
            this.addPhase3WaitingPropertyDescriptor(object);
            this.addPhase3WaitingVariancePropertyDescriptor(object);
            this.addProbExceedMaxServiceTimePropertyDescriptor(object);
            this.addProcUtilizationPropertyDescriptor(object);
            this.addProcWaitingPropertyDescriptor(object);
            this.addRwlockReaderHoldingPropertyDescriptor(object);
            this.addRwlockReaderUtilizationPropertyDescriptor(object);
            this.addRwlockReaderWaitingPropertyDescriptor(object);
            this.addRwlockReaderWaitingVariancePropertyDescriptor(object);
            this.addRwlockWriterHoldingPropertyDescriptor(object);
            this.addRwlockWriterUtilizationPropertyDescriptor(object);
            this.addRwlockWriterWaitingPropertyDescriptor(object);
            this.addRwlockWriterWaitingVariancePropertyDescriptor(object);
            this.addSemaphoreUtilizationPropertyDescriptor(object);
            this.addSemaphoreWaitingPropertyDescriptor(object);
            this.addSemaphoreWaitingVariancePropertyDescriptor(object);
            this.addServiceTimePropertyDescriptor(object);
            this.addServiceTimeVariancePropertyDescriptor(object);
            this.addSquaredCoeffVariationPropertyDescriptor(object);
            this.addThroughputPropertyDescriptor(object);
            this.addThroughputBoundPropertyDescriptor(object);
            this.addUtilizationPropertyDescriptor(object);
            this.addWaitingPropertyDescriptor(object);
            this.addWaitingVariancePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Loss Probability feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLossProbabilityPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_lossProbability_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_lossProbability_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__LOSS_PROBABILITY,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Open Wait Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addOpenWaitTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_openWaitTime_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_openWaitTime_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__OPEN_WAIT_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase1 Proc Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1ProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase1ProcWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase1ProcWaiting_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase1 Service Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1ServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase1ServiceTime_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase1ServiceTime_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase1 Service Time Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1ServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase1ServiceTimeVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase1ServiceTimeVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase1 Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1UtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase1Utilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase1Utilization_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE1_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase1 Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1WaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase1Waiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase1Waiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE1_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase1 Waiting Variance feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1WaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase1WaitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase1WaitingVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE1_WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase2 Proc Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2ProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase2ProcWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase2ProcWaiting_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase2 Service Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2ServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase2ServiceTime_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase2ServiceTime_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase2 Service Time Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2ServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase2ServiceTimeVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase2ServiceTimeVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase2 Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2UtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase2Utilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase2Utilization_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE2_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase2 Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2WaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase2Waiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase2Waiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE2_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase2 Waiting Variance feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2WaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase2WaitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase2WaitingVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE2_WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase3 Proc Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3ProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase3ProcWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase3ProcWaiting_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase3 Service Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3ServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase3ServiceTime_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase3ServiceTime_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase3 Service Time Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3ServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase3ServiceTimeVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase3ServiceTimeVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase3 Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3UtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase3Utilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase3Utilization_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE3_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase3 Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3WaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase3Waiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase3Waiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE3_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Phase3 Waiting Variance feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3WaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_phase3WaitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_phase3WaitingVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PHASE3_WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Prob Exceed Max Service Time feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addProbExceedMaxServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_probExceedMaxServiceTime_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_probExceedMaxServiceTime_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Proc Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addProcUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_procUtilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_procUtilization_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PROC_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Proc Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_procWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_procWaiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__PROC_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Reader Holding feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockReaderHoldingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockReaderHolding_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockReaderHolding_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_READER_HOLDING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Reader Utilization feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockReaderUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockReaderUtilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockReaderUtilization_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_READER_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Reader Waiting feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockReaderWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockReaderWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockReaderWaiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Reader Waiting Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockReaderWaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockReaderWaitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockReaderWaitingVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Writer Holding feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockWriterHoldingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockWriterHolding_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockWriterHolding_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_WRITER_HOLDING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Writer Utilization feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockWriterUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockWriterUtilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockWriterUtilization_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_WRITER_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Writer Waiting feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockWriterWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockWriterWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockWriterWaiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock Writer Waiting Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockWriterWaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_rwlockWriterWaitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_rwlockWriterWaitingVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Semaphore Utilization feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSemaphoreUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_semaphoreUtilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_semaphoreUtilization_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__SEMAPHORE_UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Semaphore Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSemaphoreWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_semaphoreWaiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_semaphoreWaiting_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__SEMAPHORE_WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Semaphore Waiting Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSemaphoreWaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_semaphoreWaitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_semaphoreWaitingVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__SEMAPHORE_WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Service Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_serviceTime_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_serviceTime_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__SERVICE_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Service Time Variance feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_serviceTimeVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_serviceTimeVariance_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Squared Coeff Variation feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSquaredCoeffVariationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_squaredCoeffVariation_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_squaredCoeffVariation_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Throughput feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addThroughputPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_throughput_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_throughput_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__THROUGHPUT,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Throughput Bound feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addThroughputBoundPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_throughputBound_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_throughputBound_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__THROUGHPUT_BOUND,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Utilization feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_utilization_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_utilization_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__UTILIZATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_waiting_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_waiting_feature",
                                "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__WAITING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Waiting Variance feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addWaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ResultConf95Type1_waitingVariance_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ResultConf95Type1_waitingVariance_feature", "_UI_ResultConf95Type1_type"),
                                LqnPackage.Literals.RESULT_CONF95_TYPE1__WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This returns ResultConf95Type1.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ResultConf95Type1"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final ResultConf95Type1 resultConf95Type1 = (ResultConf95Type1) object;
        return this.getString("_UI_ResultConf95Type1_type") + " " + resultConf95Type1.getLossProbability();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(ResultConf95Type1.class))
        {
        case LqnPackage.RESULT_CONF95_TYPE1__LOSS_PROBABILITY:
        case LqnPackage.RESULT_CONF95_TYPE1__OPEN_WAIT_TIME:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE1_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE1_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE1_WAITING_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE2_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE2_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE2_WAITING_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE3_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE3_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__PHASE3_WAITING_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
        case LqnPackage.RESULT_CONF95_TYPE1__PROC_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__PROC_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_READER_HOLDING:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_READER_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_WRITER_HOLDING:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_WRITER_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__SEMAPHORE_UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__SEMAPHORE_WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__SEMAPHORE_WAITING_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__SERVICE_TIME:
        case LqnPackage.RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE:
        case LqnPackage.RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION:
        case LqnPackage.RESULT_CONF95_TYPE1__THROUGHPUT:
        case LqnPackage.RESULT_CONF95_TYPE1__THROUGHPUT_BOUND:
        case LqnPackage.RESULT_CONF95_TYPE1__UTILIZATION:
        case LqnPackage.RESULT_CONF95_TYPE1__WAITING:
        case LqnPackage.RESULT_CONF95_TYPE1__WAITING_VARIANCE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return LqnEditPlugin.INSTANCE;
    }

}
