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
import org.palladiosimulator.solver.lqn.ProcessorType;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.ProcessorType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcessorTypeItemProvider
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
    public ProcessorTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addMultiplicityPropertyDescriptor(object);
            this.addNamePropertyDescriptor(object);
            this.addQuantumPropertyDescriptor(object);
            this.addReplicationPropertyDescriptor(object);
            this.addSchedulingPropertyDescriptor(object);
            this.addSpeedFactorPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Multiplicity feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMultiplicityPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_ProcessorType_multiplicity_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_ProcessorType_multiplicity_feature",
                                        "_UI_ProcessorType_type"),
                                LqnPackage.Literals.PROCESSOR_TYPE__MULTIPLICITY,
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
                                this.getString("_UI_ProcessorType_name_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_ProcessorType_name_feature",
                                        "_UI_ProcessorType_type"),
                                LqnPackage.Literals.PROCESSOR_TYPE__NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Quantum feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addQuantumPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_ProcessorType_quantum_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_ProcessorType_quantum_feature",
                                        "_UI_ProcessorType_type"),
                                LqnPackage.Literals.PROCESSOR_TYPE__QUANTUM,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Replication feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addReplicationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_ProcessorType_replication_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_ProcessorType_replication_feature",
                                        "_UI_ProcessorType_type"),
                                LqnPackage.Literals.PROCESSOR_TYPE__REPLICATION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Scheduling feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSchedulingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_ProcessorType_scheduling_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_ProcessorType_scheduling_feature",
                                        "_UI_ProcessorType_type"),
                                LqnPackage.Literals.PROCESSOR_TYPE__SCHEDULING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Speed Factor feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSpeedFactorPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_ProcessorType_speedFactor_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_ProcessorType_speedFactor_feature",
                                        "_UI_ProcessorType_type"),
                                LqnPackage.Literals.PROCESSOR_TYPE__SPEED_FACTOR,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            this.childrenFeatures.add(LqnPackage.Literals.PROCESSOR_TYPE__RESULT_PROCESSOR);
            this.childrenFeatures.add(LqnPackage.Literals.PROCESSOR_TYPE__GROUP);
            this.childrenFeatures.add(LqnPackage.Literals.PROCESSOR_TYPE__TASK);
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
     * This returns ProcessorType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ProcessorType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ProcessorType) object).getName();
        return label == null || label.length() == 0 ?
                this.getString("_UI_ProcessorType_type") :
                    this.getString("_UI_ProcessorType_type") + " " + label;
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

        switch (notification.getFeatureID(ProcessorType.class))
        {
        case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
        case LqnPackage.PROCESSOR_TYPE__NAME:
        case LqnPackage.PROCESSOR_TYPE__QUANTUM:
        case LqnPackage.PROCESSOR_TYPE__REPLICATION:
        case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
        case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
        case LqnPackage.PROCESSOR_TYPE__GROUP:
        case LqnPackage.PROCESSOR_TYPE__TASK:
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
                        (LqnPackage.Literals.PROCESSOR_TYPE__RESULT_PROCESSOR,
                                LqnFactory.eINSTANCE.createOutputResultType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.PROCESSOR_TYPE__GROUP,
                                LqnFactory.eINSTANCE.createGroupType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.PROCESSOR_TYPE__TASK,
                                LqnFactory.eINSTANCE.createTaskType()));
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
