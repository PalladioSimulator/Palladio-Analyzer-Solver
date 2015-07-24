/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.ActivityType;
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultJoinDelayType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>And Join List Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl#getResultJoinDelay <em>Result Join Delay</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl#getQuorum <em>Quorum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndJoinListTypeImpl extends MinimalEObjectImpl.Container implements AndJoinListType {
	/**
	 * The cached value of the '{@link #getResultJoinDelay() <em>Result Join Delay</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultJoinDelay()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultJoinDelayType> resultJoinDelay;

	/**
	 * The cached value of the '{@link #getServiceTimeDistribution() <em>Service Time Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getServiceTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDistributionType> serviceTimeDistribution;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> activity;

	/**
	 * The default value of the '{@link #getQuorum() <em>Quorum</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getQuorum()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUORUM_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getQuorum() <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getQuorum()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quorum = QUORUM_EDEFAULT;

	/**
	 * This is true if the Quorum attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean quorumESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AndJoinListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.AND_JOIN_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputResultJoinDelayType> getResultJoinDelay() {
		if (resultJoinDelay == null) {
			resultJoinDelay = new EObjectContainmentEList<OutputResultJoinDelayType>(OutputResultJoinDelayType.class,
					this, LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY);
		}
		return resultJoinDelay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputDistributionType> getServiceTimeDistribution() {
		if (serviceTimeDistribution == null) {
			serviceTimeDistribution = new EObjectContainmentEList<OutputDistributionType>(OutputDistributionType.class,
					this, LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION);
		}
		return serviceTimeDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this,
					LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getQuorum() {
		return quorum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuorum(BigInteger newQuorum) {
		BigInteger oldQuorum = quorum;
		quorum = newQuorum;
		boolean oldQuorumESet = quorumESet;
		quorumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.AND_JOIN_LIST_TYPE__QUORUM, oldQuorum,
					quorum, !oldQuorumESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetQuorum() {
		BigInteger oldQuorum = quorum;
		boolean oldQuorumESet = quorumESet;
		quorum = QUORUM_EDEFAULT;
		quorumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.AND_JOIN_LIST_TYPE__QUORUM, oldQuorum,
					QUORUM_EDEFAULT, oldQuorumESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetQuorum() {
		return quorumESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY:
			return ((InternalEList<?>) getResultJoinDelay()).basicRemove(otherEnd, msgs);
		case LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION:
			return ((InternalEList<?>) getServiceTimeDistribution()).basicRemove(otherEnd, msgs);
		case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY:
			return getResultJoinDelay();
		case LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION:
			return getServiceTimeDistribution();
		case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
			return getActivity();
		case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
			return getQuorum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY:
			getResultJoinDelay().clear();
			getResultJoinDelay().addAll((Collection<? extends OutputResultJoinDelayType>) newValue);
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION:
			getServiceTimeDistribution().clear();
			getServiceTimeDistribution().addAll((Collection<? extends OutputDistributionType>) newValue);
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
			getActivity().clear();
			getActivity().addAll((Collection<? extends ActivityType>) newValue);
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
			setQuorum((BigInteger) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY:
			getResultJoinDelay().clear();
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION:
			getServiceTimeDistribution().clear();
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
			getActivity().clear();
			return;
		case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
			unsetQuorum();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LqnPackage.AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY:
			return resultJoinDelay != null && !resultJoinDelay.isEmpty();
		case LqnPackage.AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION:
			return serviceTimeDistribution != null && !serviceTimeDistribution.isEmpty();
		case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
			return activity != null && !activity.isEmpty();
		case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
			return isSetQuorum();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (quorum: ");
		if (quorumESet)
			result.append(quorum);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AndJoinListTypeImpl
