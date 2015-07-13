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
import org.palladiosimulator.solver.lqn.SolverParamsType;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.SolverParamsType}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class SolverParamsTypeItemProvider
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
    public SolverParamsTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addCommentPropertyDescriptor(object);
            this.addConvValPropertyDescriptor(object);
            this.addItLimitPropertyDescriptor(object);
            this.addPrintIntPropertyDescriptor(object);
            this.addUnderrelaxCoeffPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Comment feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addCommentPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_SolverParamsType_comment_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_SolverParamsType_comment_feature",
                                "_UI_SolverParamsType_type"),
                                LqnPackage.Literals.SOLVER_PARAMS_TYPE__COMMENT,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Conv Val feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addConvValPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_SolverParamsType_convVal_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_SolverParamsType_convVal_feature",
                                "_UI_SolverParamsType_type"),
                                LqnPackage.Literals.SOLVER_PARAMS_TYPE__CONV_VAL,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the It Limit feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addItLimitPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_SolverParamsType_itLimit_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_SolverParamsType_itLimit_feature",
                                "_UI_SolverParamsType_type"),
                                LqnPackage.Literals.SOLVER_PARAMS_TYPE__IT_LIMIT,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Print Int feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addPrintIntPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_SolverParamsType_printInt_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_SolverParamsType_printInt_feature",
                                "_UI_SolverParamsType_type"),
                                LqnPackage.Literals.SOLVER_PARAMS_TYPE__PRINT_INT,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Underrelax Coeff feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUnderrelaxCoeffPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_SolverParamsType_underrelaxCoeff_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_SolverParamsType_underrelaxCoeff_feature",
                                "_UI_SolverParamsType_type"),
                                LqnPackage.Literals.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
            this.childrenFeatures.add(LqnPackage.Literals.SOLVER_PARAMS_TYPE__RESULT_GENERAL);
            this.childrenFeatures.add(LqnPackage.Literals.SOLVER_PARAMS_TYPE__PRAGMA);
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
     * This returns SolverParamsType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/SolverParamsType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((SolverParamsType) object).getComment();
        return label == null || label.length() == 0 ?
                this.getString("_UI_SolverParamsType_type") :
                this.getString("_UI_SolverParamsType_type") + " " + label;
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

        switch (notification.getFeatureID(SolverParamsType.class))
        {
        case LqnPackage.SOLVER_PARAMS_TYPE__COMMENT:
        case LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
        case LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
        case LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
        case LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
        case LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA:
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
                (LqnPackage.Literals.SOLVER_PARAMS_TYPE__RESULT_GENERAL,
                        LqnFactory.eINSTANCE.createResultGeneralType()));

        newChildDescriptors.add
                (this.createChildParameter
                (LqnPackage.Literals.SOLVER_PARAMS_TYPE__PRAGMA,
                        LqnFactory.eINSTANCE.createPragmaType()));
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
