/**
 */
package org.palladiosimulator.solver.lqn.provider;

import java.math.BigInteger;
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
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.AndJoinListType} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AndJoinListTypeItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public AndJoinListTypeItemProvider(AdapterFactory adapterFactory) {
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

			addQuorumPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Quorum feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addQuorumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AndJoinListType_quorum_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AndJoinListType_quorum_feature",
						"_UI_AndJoinListType_type"),
				LqnPackage.Literals.AND_JOIN_LIST_TYPE__QUORUM, true, false,
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
					.add(LqnPackage.Literals.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY);
			childrenFeatures
					.add(LqnPackage.Literals.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION);
			childrenFeatures
					.add(LqnPackage.Literals.AND_JOIN_LIST_TYPE__ACTIVITY);
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
	 * This returns AndJoinListType.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/AndJoinListType"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((AndJoinListType) object).getQuorum();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_AndJoinListType_type")
				: getString("_UI_AndJoinListType_type") + " " + label;
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

		switch (notification.getFeatureID(AndJoinListType.class)) {
		case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY:
		case LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION:
		case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
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
				LqnPackage.Literals.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY,
				LqnFactory.eINSTANCE.createOutputResultJoinDelayType()));

		newChildDescriptors
				.add(createChildParameter(
						LqnPackage.Literals.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION,
						LqnFactory.eINSTANCE.createOutputDistributionType()));

		newChildDescriptors
				.add(createChildParameter(
						LqnPackage.Literals.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION,
						LqnFactory.eINSTANCE
								.createOutputEntryDistributionType()));

		newChildDescriptors.add(createChildParameter(
				LqnPackage.Literals.AND_JOIN_LIST_TYPE__ACTIVITY,
				LqnFactory.eINSTANCE.createActivityType()));

		newChildDescriptors.add(createChildParameter(
				LqnPackage.Literals.AND_JOIN_LIST_TYPE__ACTIVITY,
				LqnFactory.eINSTANCE.createActivityLoopType()));

		newChildDescriptors.add(createChildParameter(
				LqnPackage.Literals.AND_JOIN_LIST_TYPE__ACTIVITY,
				LqnFactory.eINSTANCE.createActivityOrType()));
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
