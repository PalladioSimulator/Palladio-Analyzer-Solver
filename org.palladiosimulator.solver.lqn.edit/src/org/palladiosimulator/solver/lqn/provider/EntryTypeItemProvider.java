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
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.EntryType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class EntryTypeItemProvider
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
    public EntryTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addNamePropertyDescriptor(object);
            this.addOpenArrivalRatePropertyDescriptor(object);
            this.addPriorityPropertyDescriptor(object);
            this.addRwlockPropertyDescriptor(object);
            this.addSemaphorePropertyDescriptor(object);
            this.addTypePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
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
                                this.getString("_UI_EntryType_name_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_EntryType_name_feature",
                                        "_UI_EntryType_type"),
                                LqnPackage.Literals.ENTRY_TYPE__NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Open Arrival Rate feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addOpenArrivalRatePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_EntryType_openArrivalRate_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_EntryType_openArrivalRate_feature",
                                        "_UI_EntryType_type"),
                                LqnPackage.Literals.ENTRY_TYPE__OPEN_ARRIVAL_RATE,
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
                                this.getString("_UI_EntryType_priority_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_EntryType_priority_feature",
                                        "_UI_EntryType_type"),
                                LqnPackage.Literals.ENTRY_TYPE__PRIORITY,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Rwlock feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addRwlockPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_EntryType_rwlock_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_EntryType_rwlock_feature",
                                        "_UI_EntryType_type"),
                                LqnPackage.Literals.ENTRY_TYPE__RWLOCK,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Semaphore feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSemaphorePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_EntryType_semaphore_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_EntryType_semaphore_feature",
                                        "_UI_EntryType_type"),
                                LqnPackage.Literals.ENTRY_TYPE__SEMAPHORE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Type feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addTypePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_EntryType_type_feature"),
                                this.getString("_UI_PropertyDescriptor_description", "_UI_EntryType_type_feature",
                                        "_UI_EntryType_type"),
                                LqnPackage.Literals.ENTRY_TYPE__TYPE,
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
            this.childrenFeatures.add(LqnPackage.Literals.ENTRY_TYPE__RESULT_ENTRY);
            this.childrenFeatures.add(LqnPackage.Literals.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION);
            this.childrenFeatures.add(LqnPackage.Literals.ENTRY_TYPE__FORWARDING);
            this.childrenFeatures.add(LqnPackage.Literals.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH);
            this.childrenFeatures.add(LqnPackage.Literals.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES);
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
     * This returns EntryType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/EntryType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((EntryType) object).getName();
        return label == null || label.length() == 0 ?
                this.getString("_UI_EntryType_type") :
                    this.getString("_UI_EntryType_type") + " " + label;
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

        switch (notification.getFeatureID(EntryType.class))
        {
        case LqnPackage.ENTRY_TYPE__NAME:
        case LqnPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
        case LqnPackage.ENTRY_TYPE__PRIORITY:
        case LqnPackage.ENTRY_TYPE__RWLOCK:
        case LqnPackage.ENTRY_TYPE__SEMAPHORE:
        case LqnPackage.ENTRY_TYPE__TYPE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.ENTRY_TYPE__RESULT_ENTRY:
        case LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
        case LqnPackage.ENTRY_TYPE__FORWARDING:
        case LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
        case LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
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
                        (LqnPackage.Literals.ENTRY_TYPE__RESULT_ENTRY,
                                LqnFactory.eINSTANCE.createOutputResultType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION,
                                LqnFactory.eINSTANCE.createOutputEntryDistributionType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.ENTRY_TYPE__FORWARDING,
                                LqnFactory.eINSTANCE.createEntryMakingCallType()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH,
                                LqnFactory.eINSTANCE.createEntryActivityGraph()));

        newChildDescriptors.add
        (this.createChildParameter
                        (LqnPackage.Literals.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES,
                                LqnFactory.eINSTANCE.createPhaseActivities()));
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
