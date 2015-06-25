/**
 */
package org.palladiosimulator.solver.lqn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.lqnFactory;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.lqn.ActivityPhasesType} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ActivityPhasesTypeItemProvider extends ActivityDefBaseItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ActivityPhasesTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addPhasePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Phase feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPhasePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ActivityPhasesType_phase_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_ActivityPhasesType_phase_feature",
                        "_UI_ActivityPhasesType_type"),
                lqnPackage.Literals.ACTIVITY_PHASES_TYPE__PHASE, true, false, false,
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
            this.childrenFeatures.add(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__CALL_LIST);
            this.childrenFeatures.add(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__GROUP);
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
     * This returns ActivityPhasesType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ActivityPhasesType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ActivityPhasesType) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_ActivityPhasesType_type")
                : this.getString("_UI_ActivityPhasesType_type") + " " + label;
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

        switch (notification.getFeatureID(ActivityPhasesType.class)) {
        case lqnPackage.ACTIVITY_PHASES_TYPE__PHASE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case lqnPackage.ACTIVITY_PHASES_TYPE__CALL_LIST:
        case lqnPackage.ACTIVITY_PHASES_TYPE__GROUP:
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

        newChildDescriptors.add(this.createChildParameter(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__CALL_LIST,
                lqnFactory.eINSTANCE.createCallListType()));

        newChildDescriptors.add(this.createChildParameter(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__GROUP,
                FeatureMapUtil.createEntry(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__SYNCH_CALL,
                        lqnFactory.eINSTANCE.createActivityMakingCallType())));

        newChildDescriptors.add(this.createChildParameter(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__GROUP,
                FeatureMapUtil.createEntry(lqnPackage.Literals.ACTIVITY_PHASES_TYPE__ASYNCH_CALL,
                        lqnFactory.eINSTANCE.createActivityMakingCallType())));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getCreateChildText(final Object owner, final Object feature, final Object child,
            final Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature
                && FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature)) {
            final FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        final boolean qualify = childFeature == lqnPackage.Literals.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY
                || childFeature == lqnPackage.Literals.ACTIVITY_DEF_BASE__RESULT_FORWARDING
                || childFeature == lqnPackage.Literals.ACTIVITY_PHASES_TYPE__SYNCH_CALL
                || childFeature == lqnPackage.Literals.ACTIVITY_PHASES_TYPE__ASYNCH_CALL;

        if (qualify) {
            return this.getString("_UI_CreateChild_text2", new Object[] { this.getTypeText(childObject),
                    this.getFeatureText(childFeature), this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
