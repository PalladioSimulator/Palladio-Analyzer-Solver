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
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.LqnModelType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class LqnModelTypeItemProvider
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
    public LqnModelTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addLqxPropertyDescriptor(object);
            this.addDescriptionPropertyDescriptor(object);
            this.addLqnSchemaVersionPropertyDescriptor(object);
            this.addLqncoreSchemaVersionPropertyDescriptor(object);
            this.addNamePropertyDescriptor(object);
            this.addXmlDebugPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Lqx feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addLqxPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_LqnModelType_lqx_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_lqx_feature",
                                        "_UI_LqnModelType_type"),
                                LqnPackage.Literals.LQN_MODEL_TYPE__LQX,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Description feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_LqnModelType_description_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_LqnModelType_description_feature",
                                        "_UI_LqnModelType_type"),
                                LqnPackage.Literals.LQN_MODEL_TYPE__DESCRIPTION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Lqn Schema Version feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLqnSchemaVersionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_LqnModelType_lqnSchemaVersion_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_LqnModelType_lqnSchemaVersion_feature",
                                        "_UI_LqnModelType_type"),
                                LqnPackage.Literals.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Lqncore Schema Version feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLqncoreSchemaVersionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_LqnModelType_lqncoreSchemaVersion_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_LqnModelType_lqncoreSchemaVersion_feature", "_UI_LqnModelType_type"),
                                LqnPackage.Literals.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addNamePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_LqnModelType_name_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_name_feature",
                                        "_UI_LqnModelType_type"),
                                LqnPackage.Literals.LQN_MODEL_TYPE__NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Xml Debug feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addXmlDebugPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_LqnModelType_xmlDebug_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_LqnModelType_xmlDebug_feature",
                                        "_UI_LqnModelType_type"),
                                LqnPackage.Literals.LQN_MODEL_TYPE__XML_DEBUG,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
            this.childrenFeatures.add(LqnPackage.Literals.LQN_MODEL_TYPE__RUN_CONTROL);
            this.childrenFeatures.add(LqnPackage.Literals.LQN_MODEL_TYPE__PLOT_CONTROL);
            this.childrenFeatures.add(LqnPackage.Literals.LQN_MODEL_TYPE__SOLVER_PARAMS);
            this.childrenFeatures.add(LqnPackage.Literals.LQN_MODEL_TYPE__PROCESSOR);
            this.childrenFeatures.add(LqnPackage.Literals.LQN_MODEL_TYPE__SLOT);
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
     * This returns LqnModelType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/LqnModelType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((LqnModelType) object).getName();
        return label == null || label.length() == 0 ?
                this.getString("_UI_LqnModelType_type") :
                    this.getString("_UI_LqnModelType_type") + " " + label;
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

        switch (notification.getFeatureID(LqnModelType.class))
        {
        case LqnPackage.LQN_MODEL_TYPE__LQX:
        case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
        case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
        case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
        case LqnPackage.LQN_MODEL_TYPE__NAME:
        case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
        case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
        case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
        case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
        case LqnPackage.LQN_MODEL_TYPE__SLOT:
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
                        (LqnPackage.Literals.LQN_MODEL_TYPE__RUN_CONTROL,
                                LqnFactory.eINSTANCE.createRunControlType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.LQN_MODEL_TYPE__PLOT_CONTROL,
                                LqnFactory.eINSTANCE.createPlotControlType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.LQN_MODEL_TYPE__SOLVER_PARAMS,
                                LqnFactory.eINSTANCE.createSolverParamsType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.LQN_MODEL_TYPE__PROCESSOR,
                                LqnFactory.eINSTANCE.createProcessorType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.LQN_MODEL_TYPE__SLOT,
                                LqnFactory.eINSTANCE.createSlotType()));
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
