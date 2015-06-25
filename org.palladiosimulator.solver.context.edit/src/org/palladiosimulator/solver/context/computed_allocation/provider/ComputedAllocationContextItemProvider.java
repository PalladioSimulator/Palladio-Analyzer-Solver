/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_allocation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationFactory;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;
import org.palladiosimulator.solver.context.computed_usage.provider.ContextEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputedAllocationContextItemProvider extends EntityItemProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ComputedAllocationContextItemProvider(final AdapterFactory adapterFactory) {
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

            this.addUsageContext_ComputedAllocationContextPropertyDescriptor(object);
            this.addAllocationContext_ComputedAllocationContextPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Usage Context Computed Allocation Context feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUsageContext_ComputedAllocationContextPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ComputedAllocationContext_usageContext_ComputedAllocationContext_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ComputedAllocationContext_usageContext_ComputedAllocationContext_feature",
                        "_UI_ComputedAllocationContext_type"),
                ComputedAllocationPackage.Literals.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Allocation Context Computed Allocation Context
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAllocationContext_ComputedAllocationContextPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ComputedAllocationContext_allocationContext_ComputedAllocationContext_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ComputedAllocationContext_allocationContext_ComputedAllocationContext_feature",
                        "_UI_ComputedAllocationContext_type"),
                ComputedAllocationPackage.Literals.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT,
                true, false, true, null, null, null));
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
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(
                    ComputedAllocationPackage.Literals.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT);
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
     * This returns ComputedAllocationContext.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ComputedAllocationContext"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ComputedAllocationContext) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_ComputedAllocationContext_type")
                : this.getString("_UI_ComputedAllocationContext_type") + " " + label;
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

        switch (notification.getFeatureID(ComputedAllocationContext.class)) {
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT:
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

        newChildDescriptors.add(this.createChildParameter(
                ComputedAllocationPackage.Literals.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT,
                ComputedAllocationFactory.eINSTANCE.createResourceDemand()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ContextEditPlugin.INSTANCE;
    }

}
