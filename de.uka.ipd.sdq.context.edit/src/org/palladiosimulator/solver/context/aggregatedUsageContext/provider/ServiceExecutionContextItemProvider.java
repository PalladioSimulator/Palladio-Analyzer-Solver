/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.provider;

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
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextFactory;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ServiceExecutionContext;
import org.palladiosimulator.solver.context.computed_usage.provider.ContextEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.ServiceExecutionContext}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceExecutionContextItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
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
    public ServiceExecutionContextItemProvider(final AdapterFactory adapterFactory) {
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

            this.addGlobalExecutionFrequencyPropertyDescriptor(object);
            this.addAllocationContext_ServiceExecutionContextPropertyDescriptor(object);
            this.addDescribedSEFF_ServiceExecutionContextPropertyDescriptor(object);
            this.addUsageScenario_ServiceExecutionContextPropertyDescriptor(object);
            this.addReceivedAggregatedCommunication_AggregatedCommunicationPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Global Execution Frequency feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addGlobalExecutionFrequencyPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceExecutionContext_globalExecutionFrequency_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ServiceExecutionContext_globalExecutionFrequency_feature",
                        "_UI_ServiceExecutionContext_type"),
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY, true,
                false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Allocation Context Service Execution Context feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAllocationContext_ServiceExecutionContextPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceExecutionContext_allocationContext_ServiceExecutionContext_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ServiceExecutionContext_allocationContext_ServiceExecutionContext_feature",
                        "_UI_ServiceExecutionContext_type"),
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Described SEFF Service Execution Context feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addDescribedSEFF_ServiceExecutionContextPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceExecutionContext_describedSEFF_ServiceExecutionContext_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ServiceExecutionContext_describedSEFF_ServiceExecutionContext_feature",
                        "_UI_ServiceExecutionContext_type"),
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Usage Scenario Service Execution Context feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUsageScenario_ServiceExecutionContextPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceExecutionContext_usageScenario_ServiceExecutionContext_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ServiceExecutionContext_usageScenario_ServiceExecutionContext_feature",
                        "_UI_ServiceExecutionContext_type"),
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Received Aggregated Communication Aggregated
     * Communication feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addReceivedAggregatedCommunication_AggregatedCommunicationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_ServiceExecutionContext_receivedAggregatedCommunication_AggregatedCommunication_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ServiceExecutionContext_receivedAggregatedCommunication_AggregatedCommunication_feature",
                        "_UI_ServiceExecutionContext_type"),
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION,
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
                    AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT);
            this.childrenFeatures.add(
                    AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT);
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
     * This returns ServiceExecutionContext.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ServiceExecutionContext"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final ServiceExecutionContext serviceExecutionContext = (ServiceExecutionContext) object;
        return this.getString("_UI_ServiceExecutionContext_type") + " "
                + serviceExecutionContext.getGlobalExecutionFrequency();
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

        switch (notification.getFeatureID(ServiceExecutionContext.class)) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT:
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT:
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
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT,
                AggregatedUsageContextFactory.eINSTANCE.createAggregatedResourceDemand()));

        newChildDescriptors.add(this.createChildParameter(
                AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT,
                AggregatedUsageContextFactory.eINSTANCE.createAggregatedCommunication()));
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
