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
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedCommunication;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.computed_usage.provider.ContextEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedCommunication}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregatedCommunicationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
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
    public AggregatedCommunicationItemProvider(final AdapterFactory adapterFactory) {
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

            this.addAverageMessageSizePropertyDescriptor(object);
            this.addAverageMessageFrequencyPropertyDescriptor(object);
            this.addReceiver_AggregatedCommunicationPropertyDescriptor(object);
            this.addUsedCommunicationLinkResourceSpecification_AggregatedCommunicationPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Average Message Size feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAverageMessageSizePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_AggregatedCommunication_averageMessageSize_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_AggregatedCommunication_averageMessageSize_feature", "_UI_AggregatedCommunication_type"),
                AggregatedUsageContextPackage.Literals.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE, true, false,
                false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Average Message Frequency feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAverageMessageFrequencyPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_AggregatedCommunication_averageMessageFrequency_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_AggregatedCommunication_averageMessageFrequency_feature",
                        "_UI_AggregatedCommunication_type"),
                AggregatedUsageContextPackage.Literals.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY, true, false,
                false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Receiver Aggregated Communication feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addReceiver_AggregatedCommunicationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_AggregatedCommunication_receiver_AggregatedCommunication_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_AggregatedCommunication_receiver_AggregatedCommunication_feature",
                        "_UI_AggregatedCommunication_type"),
                AggregatedUsageContextPackage.Literals.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Used Communication Link Resource Specification
     * Aggregated Communication feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUsedCommunicationLinkResourceSpecification_AggregatedCommunicationPropertyDescriptor(
            final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_AggregatedCommunication_usedCommunicationLinkResourceSpecification_AggregatedCommunication_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_AggregatedCommunication_usedCommunicationLinkResourceSpecification_AggregatedCommunication_feature",
                        "_UI_AggregatedCommunication_type"),
                AggregatedUsageContextPackage.Literals.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION,
                true, false, true, null, null, null));
    }

    /**
     * This returns AggregatedCommunication.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/AggregatedCommunication"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final AggregatedCommunication aggregatedCommunication = (AggregatedCommunication) object;
        return this.getString("_UI_AggregatedCommunication_type") + " "
                + aggregatedCommunication.getAverageMessageSize();
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

        switch (notification.getFeatureID(AggregatedCommunication.class)) {
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE:
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY:
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
