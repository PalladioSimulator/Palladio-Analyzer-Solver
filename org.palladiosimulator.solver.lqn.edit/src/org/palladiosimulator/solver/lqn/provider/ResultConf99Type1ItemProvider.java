/**
 */
package org.palladiosimulator.solver.lqn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ResultConf99Type1;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.solver.lqn.ResultConf99Type1} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ResultConf99Type1ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ResultConf99Type1ItemProvider(AdapterFactory adapterFactory) {
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

			addLossProbabilityPropertyDescriptor(object);
			addOpenWaitTimePropertyDescriptor(object);
			addPhase1ProcWaitingPropertyDescriptor(object);
			addPhase1ServiceTimePropertyDescriptor(object);
			addPhase1ServiceTimeVariancePropertyDescriptor(object);
			addPhase1UtilizationPropertyDescriptor(object);
			addPhase1WaitingPropertyDescriptor(object);
			addPhase1WaitingVariancePropertyDescriptor(object);
			addPhase2ProcWaitingPropertyDescriptor(object);
			addPhase2ServiceTimePropertyDescriptor(object);
			addPhase2ServiceTimeVariancePropertyDescriptor(object);
			addPhase2UtilizationPropertyDescriptor(object);
			addPhase2WaitingPropertyDescriptor(object);
			addPhase2WaitingVariancePropertyDescriptor(object);
			addPhase3ProcWaitingPropertyDescriptor(object);
			addPhase3ServiceTimePropertyDescriptor(object);
			addPhase3ServiceTimeVariancePropertyDescriptor(object);
			addPhase3UtilizationPropertyDescriptor(object);
			addPhase3WaitingPropertyDescriptor(object);
			addPhase3WaitingVariancePropertyDescriptor(object);
			addProbExceedMaxServiceTimePropertyDescriptor(object);
			addProcUtilizationPropertyDescriptor(object);
			addProcWaitingPropertyDescriptor(object);
			addRwlockReaderHoldingPropertyDescriptor(object);
			addRwlockReaderUtilizationPropertyDescriptor(object);
			addRwlockReaderWaitingPropertyDescriptor(object);
			addRwlockReaderWaitingVariancePropertyDescriptor(object);
			addRwlockWriterHoldingPropertyDescriptor(object);
			addRwlockWriterUtilizationPropertyDescriptor(object);
			addRwlockWriterWaitingPropertyDescriptor(object);
			addRwlockWriterWaitingVariancePropertyDescriptor(object);
			addSemaphoreUtilizationPropertyDescriptor(object);
			addSemaphoreWaitingPropertyDescriptor(object);
			addSemaphoreWaitingVariancePropertyDescriptor(object);
			addServiceTimePropertyDescriptor(object);
			addServiceTimeVariancePropertyDescriptor(object);
			addSquaredCoeffVariationPropertyDescriptor(object);
			addThroughputPropertyDescriptor(object);
			addThroughputBoundPropertyDescriptor(object);
			addUtilizationPropertyDescriptor(object);
			addWaitingPropertyDescriptor(object);
			addWaitingVariancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Loss Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLossProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_lossProbability_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_lossProbability_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__LOSS_PROBABILITY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Open Wait Time feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addOpenWaitTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_openWaitTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_openWaitTime_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase1 Proc Waiting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase1ProcWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase1ProcWaiting_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1ProcWaiting_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase1 Service Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase1ServiceTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase1ServiceTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1ServiceTime_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase1 Service Time Variance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addPhase1ServiceTimeVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase1ServiceTimeVariance_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultConf99Type1_phase1ServiceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase1 Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase1UtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase1Utilization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1Utilization_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase1 Waiting feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addPhase1WaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_phase1Waiting_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1Waiting_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_WAITING, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase1 Waiting Variance feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase1WaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase1WaitingVariance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase1WaitingVariance_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase2 Proc Waiting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase2ProcWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase2ProcWaiting_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2ProcWaiting_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase2 Service Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase2ServiceTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase2ServiceTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2ServiceTime_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase2 Service Time Variance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addPhase2ServiceTimeVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase2ServiceTimeVariance_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultConf99Type1_phase2ServiceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase2 Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase2UtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase2Utilization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2Utilization_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase2 Waiting feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addPhase2WaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_phase2Waiting_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2Waiting_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_WAITING, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase2 Waiting Variance feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase2WaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase2WaitingVariance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase2WaitingVariance_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase3 Proc Waiting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase3ProcWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase3ProcWaiting_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3ProcWaiting_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase3 Service Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase3ServiceTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase3ServiceTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3ServiceTime_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase3 Service Time Variance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addPhase3ServiceTimeVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase3ServiceTimeVariance_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultConf99Type1_phase3ServiceTimeVariance_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase3 Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase3UtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase3Utilization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3Utilization_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase3 Waiting feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addPhase3WaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_phase3Waiting_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3Waiting_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_WAITING, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phase3 Waiting Variance feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase3WaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_phase3WaitingVariance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_phase3WaitingVariance_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prob Exceed Max Service Time feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addProbExceedMaxServiceTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_probExceedMaxServiceTime_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResultConf99Type1_probExceedMaxServiceTime_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proc Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_procUtilization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_procUtilization_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__PROC_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proc Waiting feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addProcWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_procWaiting_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_procWaiting_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__PROC_WAITING, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Reader Holding feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRwlockReaderHoldingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_rwlockReaderHolding_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_rwlockReaderHolding_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Reader Utilization feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addRwlockReaderUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_rwlockReaderUtilization_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResultConf99Type1_rwlockReaderUtilization_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Reader Waiting feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRwlockReaderWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_rwlockReaderWaiting_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_rwlockReaderWaiting_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Reader Waiting Variance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addRwlockReaderWaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_rwlockReaderWaitingVariance_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultConf99Type1_rwlockReaderWaitingVariance_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Writer Holding feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRwlockWriterHoldingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_rwlockWriterHolding_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_rwlockWriterHolding_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Writer Utilization feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addRwlockWriterUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_rwlockWriterUtilization_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResultConf99Type1_rwlockWriterUtilization_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Writer Waiting feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRwlockWriterWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_rwlockWriterWaiting_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_rwlockWriterWaiting_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rwlock Writer Waiting Variance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addRwlockWriterWaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_rwlockWriterWaitingVariance_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResultConf99Type1_rwlockWriterWaitingVariance_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semaphore Utilization feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemaphoreUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_semaphoreUtilization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_semaphoreUtilization_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semaphore Waiting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemaphoreWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_semaphoreWaiting_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_semaphoreWaiting_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semaphore Waiting Variance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addSemaphoreWaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_semaphoreWaitingVariance_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResultConf99Type1_semaphoreWaitingVariance_feature", "_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Service Time feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addServiceTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_serviceTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_serviceTime_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__SERVICE_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Service Time Variance feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceTimeVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_serviceTimeVariance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_serviceTimeVariance_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Squared Coeff Variation feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSquaredCoeffVariationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_squaredCoeffVariation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_squaredCoeffVariation_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Throughput feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addThroughputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_throughput_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_throughput_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__THROUGHPUT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Throughput Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_throughputBound_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_throughputBound_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Utilization feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_utilization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_utilization_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__UTILIZATION, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Waiting feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addWaitingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResultConf99Type1_waiting_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_waiting_feature",
								"_UI_ResultConf99Type1_type"),
						LqnPackage.Literals.RESULT_CONF99_TYPE1__WAITING, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Waiting Variance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResultConf99Type1_waitingVariance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResultConf99Type1_waitingVariance_feature",
						"_UI_ResultConf99Type1_type"),
				LqnPackage.Literals.RESULT_CONF99_TYPE1__WAITING_VARIANCE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ResultConf99Type1.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResultConf99Type1"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ResultConf99Type1 resultConf99Type1 = (ResultConf99Type1) object;
		return getString("_UI_ResultConf99Type1_type") + " " + resultConf99Type1.getLossProbability();
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

		switch (notification.getFeatureID(ResultConf99Type1.class)) {
		case LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY:
		case LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
		case LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME:
		case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE:
		case LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION:
		case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT:
		case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND:
		case LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION:
		case LqnPackage.RESULT_CONF99_TYPE1__WAITING:
		case LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
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
