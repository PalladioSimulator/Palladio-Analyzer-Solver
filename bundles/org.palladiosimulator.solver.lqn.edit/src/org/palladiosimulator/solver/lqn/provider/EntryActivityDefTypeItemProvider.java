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
import org.palladiosimulator.solver.lqn.EntryActivityDefType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.EntryActivityDefType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryActivityDefTypeItemProvider extends
		ActivityDefBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public EntryActivityDefTypeItemProvider(AdapterFactory adapterFactory) {
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

			addFirstActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the First Activity feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addFirstActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EntryActivityDefType_firstActivity_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EntryActivityDefType_firstActivity_feature",
						"_UI_EntryActivityDefType_type"),
				LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
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
					.add(LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST);
			childrenFeatures
					.add(LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__GROUP);
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
	 * This returns EntryActivityDefType.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator()
						.getImage("full/obj16/EntryActivityDefType"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntryActivityDefType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_EntryActivityDefType_type")
				: getString("_UI_EntryActivityDefType_type") + " " + label;
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

		switch (notification.getFeatureID(EntryActivityDefType.class)) {
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
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
				LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST,
				LqnFactory.eINSTANCE.createCallListType()));

		newChildDescriptors
				.add(createChildParameter(
						LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__GROUP,
						FeatureMapUtil
								.createEntry(
										LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL,
										LqnFactory.eINSTANCE
												.createActivityMakingCallType())));

		newChildDescriptors
				.add(createChildParameter(
						LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__GROUP,
						FeatureMapUtil
								.createEntry(
										LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL,
										LqnFactory.eINSTANCE
												.createActivityMakingCallType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature
				&& FeatureMapUtil
						.isFeatureMap((EStructuralFeature) childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify = childFeature == LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL
				|| childFeature == LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
