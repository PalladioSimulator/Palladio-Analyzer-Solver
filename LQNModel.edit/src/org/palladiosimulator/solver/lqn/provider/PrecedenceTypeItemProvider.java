/**
 */
package org.palladiosimulator.solver.lqn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.PrecedenceType;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.PrecedenceType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class PrecedenceTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public PrecedenceTypeItemProvider(final AdapterFactory adapterFactory) {
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

        }
        return this.itemPropertyDescriptors;
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
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__PRE);
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__PRE_OR);
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__PRE_AND);
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__POST);
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__POST_OR);
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__POST_AND);
            this.childrenFeatures.add(LqnPackage.Literals.PRECEDENCE_TYPE__POST_LOOP);
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
     * This returns PrecedenceType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/PrecedenceType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        return this.getString("_UI_PrecedenceType_type");
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

        switch (notification.getFeatureID(PrecedenceType.class)) {
        case LqnPackage.PRECEDENCE_TYPE__PRE:
        case LqnPackage.PRECEDENCE_TYPE__PRE_OR:
        case LqnPackage.PRECEDENCE_TYPE__PRE_AND:
        case LqnPackage.PRECEDENCE_TYPE__POST:
        case LqnPackage.PRECEDENCE_TYPE__POST_OR:
        case LqnPackage.PRECEDENCE_TYPE__POST_AND:
        case LqnPackage.PRECEDENCE_TYPE__POST_LOOP:
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

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__PRE,
                LqnFactory.eINSTANCE.createSingleActivityListType()));

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__PRE_OR,
                LqnFactory.eINSTANCE.createActivityListType()));

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__PRE_AND,
                LqnFactory.eINSTANCE.createAndJoinListType()));

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__POST,
                LqnFactory.eINSTANCE.createSingleActivityListType()));

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__POST_OR,
                LqnFactory.eINSTANCE.createOrListType()));

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__POST_AND,
                LqnFactory.eINSTANCE.createActivityListType()));

        newChildDescriptors.add(this.createChildParameter(LqnPackage.Literals.PRECEDENCE_TYPE__POST_LOOP,
                LqnFactory.eINSTANCE.createActivityLoopListType()));
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
        final Object childFeature = feature;
        final Object childObject = child;

        final boolean qualify = childFeature == LqnPackage.Literals.PRECEDENCE_TYPE__PRE
                || childFeature == LqnPackage.Literals.PRECEDENCE_TYPE__POST
                || childFeature == LqnPackage.Literals.PRECEDENCE_TYPE__PRE_OR
                || childFeature == LqnPackage.Literals.PRECEDENCE_TYPE__POST_AND;

        if (qualify) {
            return this.getString("_UI_CreateChild_text2", new Object[] { this.getTypeText(childObject),
                    this.getFeatureText(childFeature), this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
