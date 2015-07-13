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
import org.palladiosimulator.solver.lqn.TaskType;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.TaskType} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskTypeItemProvider
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
    public TaskTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addActivityGraphPropertyDescriptor(object);
            this.addInitiallyPropertyDescriptor(object);
            this.addMultiplicityPropertyDescriptor(object);
            this.addNamePropertyDescriptor(object);
            this.addPriorityPropertyDescriptor(object);
            this.addQueueLengthPropertyDescriptor(object);
            this.addReplicationPropertyDescriptor(object);
            this.addSchedulingPropertyDescriptor(object);
            this.addThinkTimePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Activity Graph feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addActivityGraphPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_TaskType_activityGraph_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_TaskType_activityGraph_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__ACTIVITY_GRAPH,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Initially feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addInitiallyPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_TaskType_initially_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_TaskType_initially_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__INITIALLY,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
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
                                this.getString("_UI_TaskType_multiplicity_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_TaskType_multiplicity_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__MULTIPLICITY,
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
                                this.getString("_UI_TaskType_name_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_TaskType_name_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Priority feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPriorityPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_TaskType_priority_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_TaskType_priority_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__PRIORITY,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Queue Length feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addQueueLengthPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_TaskType_queueLength_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_TaskType_queueLength_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__QUEUE_LENGTH,
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
                                this.getString("_UI_TaskType_replication_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_TaskType_replication_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__REPLICATION,
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
                                this.getString("_UI_TaskType_scheduling_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_TaskType_scheduling_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__SCHEDULING,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Think Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addThinkTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_TaskType_thinkTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_TaskType_thinkTime_feature",
                                        "_UI_TaskType_type"),
                                LqnPackage.Literals.TASK_TYPE__THINK_TIME,
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
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__RESULT_TASK);
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__SERVICE_TIME_DISTRIBUTION);
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__FAN_OUT);
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__FAN_IN);
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__ENTRY);
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__SERVICE);
            this.childrenFeatures.add(LqnPackage.Literals.TASK_TYPE__TASK_ACTIVITIES);
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
     * This returns TaskType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/TaskType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((TaskType) object).getName();
        return label == null || label.length() == 0 ?
                this.getString("_UI_TaskType_type") :
                    this.getString("_UI_TaskType_type") + " " + label;
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

        switch (notification.getFeatureID(TaskType.class))
        {
        case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
        case LqnPackage.TASK_TYPE__INITIALLY:
        case LqnPackage.TASK_TYPE__MULTIPLICITY:
        case LqnPackage.TASK_TYPE__NAME:
        case LqnPackage.TASK_TYPE__PRIORITY:
        case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
        case LqnPackage.TASK_TYPE__REPLICATION:
        case LqnPackage.TASK_TYPE__SCHEDULING:
        case LqnPackage.TASK_TYPE__THINK_TIME:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.TASK_TYPE__RESULT_TASK:
        case LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION:
        case LqnPackage.TASK_TYPE__FAN_OUT:
        case LqnPackage.TASK_TYPE__FAN_IN:
        case LqnPackage.TASK_TYPE__ENTRY:
        case LqnPackage.TASK_TYPE__SERVICE:
        case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
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
                        (LqnPackage.Literals.TASK_TYPE__RESULT_TASK,
                                LqnFactory.eINSTANCE.createOutputResultType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__SERVICE_TIME_DISTRIBUTION,
                                LqnFactory.eINSTANCE.createOutputDistributionType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__SERVICE_TIME_DISTRIBUTION,
                                LqnFactory.eINSTANCE.createOutputEntryDistributionType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__FAN_OUT,
                                LqnFactory.eINSTANCE.createFanOutType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__FAN_IN,
                                LqnFactory.eINSTANCE.createFanInType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__ENTRY,
                                LqnFactory.eINSTANCE.createEntryType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__SERVICE,
                                LqnFactory.eINSTANCE.createServiceType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.TASK_TYPE__TASK_ACTIVITIES,
                                LqnFactory.eINSTANCE.createTaskActivityGraph()));
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
