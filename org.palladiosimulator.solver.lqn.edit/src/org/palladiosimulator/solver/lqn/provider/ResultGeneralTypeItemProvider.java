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
import org.palladiosimulator.solver.lqn.ResultGeneralType;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.lqn.ResultGeneralType} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ResultGeneralTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ResultGeneralTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addConvValPropertyDescriptor(object);
            this.addElapsedTimePropertyDescriptor(object);
            this.addIterationsPropertyDescriptor(object);
            this.addPlatformInfoPropertyDescriptor(object);
            this.addSolverInfoPropertyDescriptor(object);
            this.addSystemCpuTimePropertyDescriptor(object);
            this.addUserCpuTimePropertyDescriptor(object);
            this.addValidPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Conv Val feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addConvValPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_convVal_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_convVal_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__CONV_VAL, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Elapsed Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addElapsedTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_elapsedTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_elapsedTime_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__ELAPSED_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Iterations feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addIterationsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_iterations_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_iterations_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__ITERATIONS, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Platform Info feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPlatformInfoPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_platformInfo_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_platformInfo_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__PLATFORM_INFO, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Solver Info feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSolverInfoPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_solverInfo_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_solverInfo_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__SOLVER_INFO, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the System Cpu Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSystemCpuTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_systemCpuTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_systemCpuTime_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the User Cpu Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addUserCpuTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_userCpuTime_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_userCpuTime_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__USER_CPU_TIME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Valid feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addValidPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResultGeneralType_valid_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ResultGeneralType_valid_feature",
                        "_UI_ResultGeneralType_type"),
                LqnPackage.Literals.RESULT_GENERAL_TYPE__VALID, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ResultGeneralType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ResultGeneralType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final Object labelValue = ((ResultGeneralType) object).getConvVal();
        final String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? this.getString("_UI_ResultGeneralType_type")
                : this.getString("_UI_ResultGeneralType_type") + " " + label;
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

        switch (notification.getFeatureID(ResultGeneralType.class)) {
        case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
        case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
        case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
        case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
        case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
        case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
        case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
        case LqnPackage.RESULT_GENERAL_TYPE__VALID:
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
