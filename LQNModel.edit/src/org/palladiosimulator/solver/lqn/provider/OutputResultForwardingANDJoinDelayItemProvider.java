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
import org.palladiosimulator.solver.lqn.OutputResultForwardingANDJoinDelay;
import org.palladiosimulator.solver.lqn.lqnFactory;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.lqn.OutputResultForwardingANDJoinDelay} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputResultForwardingANDJoinDelayItemProvider extends ItemProviderAdapter
        implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public OutputResultForwardingANDJoinDelayItemProvider(final AdapterFactory adapterFactory) {
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

            this.addDestPropertyDescriptor(object);
            this.addJoinVariancePropertyDescriptor(object);
            this.addJoinWaitingPropertyDescriptor(object);
            this.addWaitingPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dest feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addDestPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputResultForwardingANDJoinDelay_dest_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_OutputResultForwardingANDJoinDelay_dest_feature",
                        "_UI_OutputResultForwardingANDJoinDelay_type"),
                lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Join Variance feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addJoinVariancePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputResultForwardingANDJoinDelay_joinVariance_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_OutputResultForwardingANDJoinDelay_joinVariance_feature",
                        "_UI_OutputResultForwardingANDJoinDelay_type"),
                lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Join Waiting feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addJoinWaitingPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputResultForwardingANDJoinDelay_joinWaiting_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_OutputResultForwardingANDJoinDelay_joinWaiting_feature",
                        "_UI_OutputResultForwardingANDJoinDelay_type"),
                lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING, true, false, false,
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
                this.getString("_UI_OutputResultForwardingANDJoinDelay_waiting_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_OutputResultForwardingANDJoinDelay_waiting_feature",
                        "_UI_OutputResultForwardingANDJoinDelay_type"),
                lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            this.childrenFeatures.add(lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95);
            this.childrenFeatures.add(lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99);
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
     * This returns OutputResultForwardingANDJoinDelay.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/OutputResultForwardingANDJoinDelay"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((OutputResultForwardingANDJoinDelay) object).getDest();
        return label == null || label.length() == 0 ? this.getString("_UI_OutputResultForwardingANDJoinDelay_type")
                : this.getString("_UI_OutputResultForwardingANDJoinDelay_type") + " " + label;
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

        switch (notification.getFeatureID(OutputResultForwardingANDJoinDelay.class)) {
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
        case lqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
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

        newChildDescriptors.add(
                this.createChildParameter(lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95,
                        lqnFactory.eINSTANCE.createResultConf95Type()));

        newChildDescriptors.add(
                this.createChildParameter(lqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99,
                        lqnFactory.eINSTANCE.createResultConf99Type()));
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
