/**
 */
package org.palladiosimulator.solver.lqn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultType;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.OutputResultType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputResultTypeItemProvider
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
    public OutputResultTypeItemProvider(final AdapterFactory adapterFactory) {
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
                                this.getString("_UI_OutputResultType_lossProbability_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_lossProbability_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY,
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
                                this.getString("_UI_OutputResultType_openWaitTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_openWaitTime_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase1ProcWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase1ProcWaiting_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase1ServiceTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase1ServiceTime_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase1ServiceTimeVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase1ServiceTimeVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase1Utilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase1Utilization_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION,
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
                                this.getString("_UI_OutputResultType_phase1Waiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase1Waiting_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE1_WAITING,
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
                                this.getString("_UI_OutputResultType_phase1WaitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase1WaitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase2ProcWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase2ProcWaiting_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase2ServiceTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase2ServiceTime_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase2ServiceTimeVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase2ServiceTimeVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase2Utilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase2Utilization_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION,
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
                                this.getString("_UI_OutputResultType_phase2Waiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase2Waiting_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE2_WAITING,
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
                                this.getString("_UI_OutputResultType_phase2WaitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase2WaitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase3ProcWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase3ProcWaiting_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase3ServiceTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase3ServiceTime_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase3ServiceTimeVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase3ServiceTimeVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_phase3Utilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase3Utilization_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION,
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
                                this.getString("_UI_OutputResultType_phase3Waiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase3Waiting_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE3_WAITING,
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
                                this.getString("_UI_OutputResultType_phase3WaitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_phase3WaitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_probExceedMaxServiceTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_probExceedMaxServiceTime_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME,
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
                                this.getString("_UI_OutputResultType_procUtilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_procUtilization_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PROC_UTILIZATION,
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
                                this.getString("_UI_OutputResultType_procWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_procWaiting_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__PROC_WAITING,
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
        this.itemPropertyDescriptors
                .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_rwlockReaderHolding_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockReaderHolding_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING,
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
                                this.getString("_UI_OutputResultType_rwlockReaderUtilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockReaderUtilization_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION,
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
        this.itemPropertyDescriptors
                .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_rwlockReaderWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockReaderWaiting_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING,
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
        this.itemPropertyDescriptors
        .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_rwlockReaderWaitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockReaderWaitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE,
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
        this.itemPropertyDescriptors
                .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_rwlockWriterHolding_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockWriterHolding_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING,
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
                                this.getString("_UI_OutputResultType_rwlockWriterUtilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockWriterUtilization_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION,
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
        this.itemPropertyDescriptors
                .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_rwlockWriterWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockWriterWaiting_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING,
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
        this.itemPropertyDescriptors
        .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_rwlockWriterWaitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_rwlockWriterWaitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE,
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
                                this.getString("_UI_OutputResultType_semaphoreUtilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_semaphoreUtilization_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_semaphoreWaiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_semaphoreWaiting_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING,
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
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_semaphoreWaitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_semaphoreWaitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE,
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
                                this.getString("_UI_OutputResultType_serviceTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_serviceTime_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__SERVICE_TIME,
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
        this.itemPropertyDescriptors
                .add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_OutputResultType_serviceTimeVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_serviceTimeVariance_feature", "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE,
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
                                this.getString("_UI_OutputResultType_squaredCoeffVariation_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_squaredCoeffVariation_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION,
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
                                this.getString("_UI_OutputResultType_throughput_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_throughput_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__THROUGHPUT,
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
                                this.getString("_UI_OutputResultType_throughputBound_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_throughputBound_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND,
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
                                this.getString("_UI_OutputResultType_utilization_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_utilization_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__UTILIZATION,
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
                                this.getString("_UI_OutputResultType_waiting_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_waiting_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__WAITING,
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
                                this.getString("_UI_OutputResultType_waitingVariance_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_OutputResultType_waitingVariance_feature",
                                        "_UI_OutputResultType_type"),
                                LqnPackage.Literals.OUTPUT_RESULT_TYPE__WAITING_VARIANCE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null)
        {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(LqnPackage.Literals.OUTPUT_RESULT_TYPE__RESULT_CONF95);
            this.childrenFeatures.add(LqnPackage.Literals.OUTPUT_RESULT_TYPE__RESULT_CONF99);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns OutputResultType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/OutputResultType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final OutputResultType outputResultType = (OutputResultType) object;
        return this.getString("_UI_OutputResultType_type") + " " + outputResultType.getLossProbability();
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

        switch (notification.getFeatureID(OutputResultType.class))
        {
        case LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY:
        case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
        case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
        case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.OUTPUT_RESULT_TYPE__RESULT_CONF95,
                                LqnFactory.eINSTANCE.createResultConf95Type1()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.OUTPUT_RESULT_TYPE__RESULT_CONF99,
                                LqnFactory.eINSTANCE.createResultConf99Type1()));
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
