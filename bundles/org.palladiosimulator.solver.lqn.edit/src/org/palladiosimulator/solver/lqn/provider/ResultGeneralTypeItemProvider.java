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
import org.palladiosimulator.solver.lqn.ResultGeneralType;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.ResultGeneralType} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ResultGeneralTypeItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ResultGeneralTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConvValPropertyDescriptor(object);
			addElapsedTimePropertyDescriptor(object);
			addIterationsPropertyDescriptor(object);
			addPlatformInfoPropertyDescriptor(object);
			addSolverInfoPropertyDescriptor(object);
			addSystemCpuTimePropertyDescriptor(object);
			addUserCpuTimePropertyDescriptor(object);
			addValidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Conv Val feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addConvValPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_convVal_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_convVal_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__CONV_VAL, true, false,
				false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Elapsed Time feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addElapsedTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_elapsedTime_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_elapsedTime_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__ELAPSED_TIME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Iterations feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_iterations_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_iterations_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__ITERATIONS, true,
				false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Platform Info feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addPlatformInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_platformInfo_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_platformInfo_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__PLATFORM_INFO, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Solver Info feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSolverInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_solverInfo_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_solverInfo_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__SOLVER_INFO, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the System Cpu Time feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSystemCpuTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_systemCpuTime_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_systemCpuTime_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the User Cpu Time feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addUserCpuTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_userCpuTime_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_userCpuTime_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__USER_CPU_TIME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Valid feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addValidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ResultGeneralType_valid_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultGeneralType_valid_feature",
						"_UI_ResultGeneralType_type"),
				LqnPackage.Literals.RESULT_GENERAL_TYPE__VALID, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(LqnPackage.Literals.RESULT_GENERAL_TYPE__MVA_INFO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ResultGeneralType.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ResultGeneralType"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ResultGeneralType resultGeneralType = (ResultGeneralType) object;
		return getString("_UI_ResultGeneralType_type") + " "
				+ resultGeneralType.getConvVal();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ResultGeneralType.class)) {
		case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
		case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
		case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
		case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
		case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
		case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
		case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
		case LqnPackage.RESULT_GENERAL_TYPE__VALID:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				LqnPackage.Literals.RESULT_GENERAL_TYPE__MVA_INFO,
				LqnFactory.eINSTANCE.createMvaInfoType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LqnEditPlugin.INSTANCE;
	}

}
