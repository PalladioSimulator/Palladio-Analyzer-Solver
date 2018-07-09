/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.provider;

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
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedResourceDemand;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.computed_usage.provider.ContextEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedResourceDemand}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregatedResourceDemandItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

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
    public AggregatedResourceDemandItemProvider(final AdapterFactory adapterFactory) {
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

            this.addAggregatedResourceDemandPropertyDescriptor(object);
            this.addResourceType_AggregatedResourceDemandPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aggregated Resource Demand feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAggregatedResourceDemandPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
        .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_AggregatedResourceDemand_aggregatedResourceDemand_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_AggregatedResourceDemand_aggregatedResourceDemand_feature",
                                "_UI_AggregatedResourceDemand_type"),
                                AggregatedUsageContextPackage.Literals.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Resource Type Aggregated Resource Demand feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addResourceType_AggregatedResourceDemandPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors
                .add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_AggregatedResourceDemand_resourceType_AggregatedResourceDemand_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_AggregatedResourceDemand_resourceType_AggregatedResourceDemand_feature",
                                "_UI_AggregatedResourceDemand_type"),
                                AggregatedUsageContextPackage.Literals.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This returns AggregatedResourceDemand.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/AggregatedResourceDemand"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final AggregatedResourceDemand aggregatedResourceDemand = (AggregatedResourceDemand) object;
        return this.getString("_UI_AggregatedResourceDemand_type") + " "
                + aggregatedResourceDemand.getAggregatedResourceDemand();
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

        switch (notification.getFeatureID(AggregatedResourceDemand.class))
        {
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND:
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
        return ContextEditPlugin.INSTANCE;
    }

}
