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
import org.palladiosimulator.solver.lqn.ActivityDefType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.ActivityDefType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ActivityDefTypeItemProvider extends ActivityDefBaseItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ActivityDefTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addBoundToEntryPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bound To Entry feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addBoundToEntryPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ActivityDefType_boundToEntry_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ActivityDefType_boundToEntry_feature",
                                "_UI_ActivityDefType_type"),
                                LqnPackage.Literals.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY,
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
            this.childrenFeatures.add(LqnPackage.Literals.ACTIVITY_DEF_TYPE__CALL_LIST);
            this.childrenFeatures.add(LqnPackage.Literals.ACTIVITY_DEF_TYPE__GROUP);
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
     * This returns ActivityDefType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ActivityDefType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ActivityDefType) object).getName();
        return label == null || label.length() == 0 ?
                this.getString("_UI_ActivityDefType_type") :
                this.getString("_UI_ActivityDefType_type") + " " + label;
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

        switch (notification.getFeatureID(ActivityDefType.class))
        {
        case LqnPackage.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
        case LqnPackage.ACTIVITY_DEF_TYPE__GROUP:
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
                (LqnPackage.Literals.ACTIVITY_DEF_TYPE__CALL_LIST,
                        LqnFactory.eINSTANCE.createCallListType()));

        newChildDescriptors.add
                (this.createChildParameter
                (LqnPackage.Literals.ACTIVITY_DEF_TYPE__GROUP,
                        FeatureMapUtil.createEntry
                        (LqnPackage.Literals.ACTIVITY_DEF_TYPE__SYNCH_CALL,
                                LqnFactory.eINSTANCE.createActivityMakingCallType())));

        newChildDescriptors.add
                (this.createChildParameter
                (LqnPackage.Literals.ACTIVITY_DEF_TYPE__GROUP,
                        FeatureMapUtil.createEntry
                        (LqnPackage.Literals.ACTIVITY_DEF_TYPE__ASYNCH_CALL,
                                LqnFactory.eINSTANCE.createActivityMakingCallType())));
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
                && FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature))
        {
            final FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        final boolean qualify =
                childFeature == LqnPackage.Literals.ACTIVITY_DEF_TYPE__SYNCH_CALL ||
                        childFeature == LqnPackage.Literals.ACTIVITY_DEF_TYPE__ASYNCH_CALL;

        if (qualify)
        {
            return this.getString(
                    "_UI_CreateChild_text2",
                    new Object[] { this.getTypeText(childObject), this.getFeatureText(childFeature),
                            this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
