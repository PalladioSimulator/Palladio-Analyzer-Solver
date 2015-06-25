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
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.lqnFactory;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.solver.lqn.OutputDistributionType} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputDistributionTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public OutputDistributionTypeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addBinSizePropertyDescriptor(object);
            this.addKurtosisPropertyDescriptor(object);
            this.addMaxPropertyDescriptor(object);
            this.addMeanPropertyDescriptor(object);
            this.addMidPointPropertyDescriptor(object);
            this.addMinPropertyDescriptor(object);
            this.addNumberBinsPropertyDescriptor(object);
            this.addSkewPropertyDescriptor(object);
            this.addStdDevPropertyDescriptor(object);
            this.addXSamplesPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bin Size feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addBinSizePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_binSize_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_binSize_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Kurtosis feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addKurtosisPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_kurtosis_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_kurtosis_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Max feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMaxPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_max_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_max_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__MAX, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Mean feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMeanPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_mean_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_mean_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__MEAN, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Mid Point feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMidPointPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_midPoint_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_midPoint_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__MID_POINT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Min feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMinPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_min_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_min_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__MIN, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Number Bins feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addNumberBinsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_numberBins_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_numberBins_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Skew feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSkewPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_skew_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_skew_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__SKEW, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Std Dev feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addStdDevPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_stdDev_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_stdDev_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__STD_DEV, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the XSamples feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addXSamplesPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_OutputDistributionType_xSamples_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_OutputDistributionType_xSamples_feature",
                        "_UI_OutputDistributionType_type"),
                lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES, true, false, false,
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
            this.childrenFeatures.add(lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN);
            this.childrenFeatures.add(lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN);
            this.childrenFeatures.add(lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN);
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
     * This returns OutputDistributionType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/OutputDistributionType"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final Object labelValue = ((OutputDistributionType) object).getBinSize();
        final String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? this.getString("_UI_OutputDistributionType_type")
                : this.getString("_UI_OutputDistributionType_type") + " " + label;
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

        switch (notification.getFeatureID(OutputDistributionType.class)) {
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
        case lqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
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

        newChildDescriptors.add(this.createChildParameter(lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN,
                lqnFactory.eINSTANCE.createHistogramBinType()));

        newChildDescriptors.add(this.createChildParameter(lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN,
                lqnFactory.eINSTANCE.createHistogramBinType()));

        newChildDescriptors.add(this.createChildParameter(lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN,
                lqnFactory.eINSTANCE.createHistogramBinType()));
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

        final boolean qualify = childFeature == lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN
                || childFeature == lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN
                || childFeature == lqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN;

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
