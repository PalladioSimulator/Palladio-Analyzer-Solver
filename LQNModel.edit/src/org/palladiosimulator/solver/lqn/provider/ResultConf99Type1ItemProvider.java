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
import org.palladiosimulator.solver.lqn.ResultConf99Type1;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.lqn.ResultConf99Type1} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ResultConf99Type1ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ResultConf99Type1ItemProvider(final AdapterFactory adapterFactory) {
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
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addOpenWaitTimePropertyDescriptor(object);
            this.addPhase1ProcWaitingPropertyDescriptor(object);
            this.addPhase1ServiceTimePropertyDescriptor(object);
            this.addPhase1ServiceTimeVariancePropertyDescriptor(object);
            this.addPhase1UtilizationPropertyDescriptor(object);
            this.addPhase2ProcWaitingPropertyDescriptor(object);
            this.addPhase2ServiceTimePropertyDescriptor(object);
            this.addPhase2ServiceTimeVariancePropertyDescriptor(object);
            this.addPhase2UtilizationPropertyDescriptor(object);
            this.addPhase3ProcWaitingPropertyDescriptor(object);
            this.addPhase3ServiceTimePropertyDescriptor(object);
            this.addPhase3ServiceTimeVariancePropertyDescriptor(object);
            this.addPhase3UtilizationPropertyDescriptor(object);
            this.addProbExceedMaxServiceTimePropertyDescriptor(object);
            this.addProcUtilizationPropertyDescriptor(object);
            this.addProcWaitingPropertyDescriptor(object);
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
     * This adds a property descriptor for the Open Wait Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addOpenWaitTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_openWaitTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_openWaitTime_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase1 Proc Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1ProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase1ProcWaiting_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1ProcWaiting_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase1 Service Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1ServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase1ServiceTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1ServiceTime_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase1 Service Time Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1ServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase1ServiceTimeVariance_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResultConf99Type1_phase1ServiceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase1 Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase1UtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase1Utilization_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1Utilization_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase2 Proc Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2ProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase2ProcWaiting_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2ProcWaiting_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase2 Service Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2ServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase2ServiceTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2ServiceTime_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase2 Service Time Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2ServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase2ServiceTimeVariance_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResultConf99Type1_phase2ServiceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase2 Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase2UtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase2Utilization_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2Utilization_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase3 Proc Waiting feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3ProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase3ProcWaiting_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3ProcWaiting_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase3 Service Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3ServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase3ServiceTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3ServiceTime_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase3 Service Time Variance feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3ServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase3ServiceTimeVariance_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResultConf99Type1_phase3ServiceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Phase3 Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPhase3UtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_phase3Utilization_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3Utilization_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Prob Exceed Max Service Time feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addProbExceedMaxServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_probExceedMaxServiceTime_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResultConf99Type1_probExceedMaxServiceTime_feature", "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proc Utilization feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addProcUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_procUtilization_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_procUtilization_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PROC_UTILIZATION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proc Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addProcWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_procWaiting_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_procWaiting_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__PROC_WAITING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Service Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addServiceTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_serviceTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_serviceTime_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__SERVICE_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Service Time Variance feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addServiceTimeVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_serviceTimeVariance_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResultConf99Type1_serviceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Squared Coeff Variation feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSquaredCoeffVariationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_squaredCoeffVariation_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResultConf99Type1_squaredCoeffVariation_feature", "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Throughput feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addThroughputPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_throughput_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_throughput_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__THROUGHPUT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Throughput Bound feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addThroughputBoundPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_throughputBound_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_throughputBound_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Utilization feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addUtilizationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_utilization_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_utilization_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__UTILIZATION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_waiting_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_waiting_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__WAITING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Waiting Variance feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addWaitingVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultConf99Type1_waitingVariance_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_waitingVariance_feature",
                        "_UI_ResultConf99Type1_type"),
                lqnPackage.Literals.RESULT_CONF99_TYPE1__WAITING_VARIANCE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ResultConf99Type1.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ResultConf99Type1"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final Object labelValue = ((ResultConf99Type1) object).getOpenWaitTime();
        final String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? this.getString("_UI_ResultConf99Type1_type")
                : this.getString("_UI_ResultConf99Type1_type") + " " + label;
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

        switch (notification.getFeatureID(ResultConf99Type1.class)) {
        case lqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
        case lqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION:
        case lqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
        case lqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION:
        case lqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING:
        case lqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME:
        case lqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE:
        case lqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION:
        case lqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT:
        case lqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND:
        case lqnPackage.RESULT_CONF99_TYPE1__UTILIZATION:
        case lqnPackage.RESULT_CONF99_TYPE1__WAITING:
        case lqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE:
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
