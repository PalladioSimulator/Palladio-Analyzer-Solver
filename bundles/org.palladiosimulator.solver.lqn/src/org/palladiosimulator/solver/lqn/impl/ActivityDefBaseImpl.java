/**
 */
package org.palladiosimulator.solver.lqn.impl;

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
import org.palladiosimulator.solver.lqn.ActivityDefBase;
import org.palladiosimulator.solver.lqn.CallOrderType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Def Base</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getResultActivity <em>Result Activity</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getCallOrder <em>Call Order</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getHostDemandCvsq <em>Host Demand Cvsq</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getHostDemandMean <em>Host Demand Mean</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getMaxServiceTime <em>Max Service Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDefBaseImpl extends MinimalEObjectImpl.Container implements
		ActivityDefBase {
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
	 * The cached value of the '{@link #getResultActivity() <em>Result Activity</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultActivity;

	/**
	 * The default value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCallOrder()
	 * @generated
	 * @ordered
	 */
	protected static final CallOrderType CALL_ORDER_EDEFAULT = CallOrderType.STOCHASTIC;

	/**
	 * The cached value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCallOrder()
	 * @generated
	 * @ordered
	 */
	protected CallOrderType callOrder = CALL_ORDER_EDEFAULT;

	/**
	 * This is true if the Call Order attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callOrderESet;

	/**
	 * The default value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostDemandCvsq()
	 * @generated
	 * @ordered
	 */
	protected static final Object HOST_DEMAND_CVSQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostDemandCvsq()
	 * @generated
	 * @ordered
	 */
	protected Object hostDemandCvsq = HOST_DEMAND_CVSQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostDemandMean()
	 * @generated
	 * @ordered
	 */
	protected static final Object HOST_DEMAND_MEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHostDemandMean()
	 * @generated
	 * @ordered
	 */
	protected Object hostDemandMean = HOST_DEMAND_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object maxServiceTime = MAX_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object THINK_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected Object thinkTime = THINK_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ACTIVITY_DEF_BASE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputDistributionType> getServiceTimeDistribution() {
		if (serviceTimeDistribution == null) {
			serviceTimeDistribution = new EObjectContainmentEList<OutputDistributionType>(
					OutputDistributionType.class, this,
					LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION);
		}
		return serviceTimeDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputResultType> getResultActivity() {
		if (resultActivity == null) {
			resultActivity = new EObjectContainmentEList<OutputResultType>(
					OutputResultType.class, this,
					LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY);
		}
		return resultActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOrderType getCallOrder() {
		return callOrder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallOrder(CallOrderType newCallOrder) {
		CallOrderType oldCallOrder = callOrder;
		callOrder = newCallOrder == null ? CALL_ORDER_EDEFAULT : newCallOrder;
		boolean oldCallOrderESet = callOrderESet;
		callOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER, oldCallOrder,
					callOrder, !oldCallOrderESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCallOrder() {
		CallOrderType oldCallOrder = callOrder;
		boolean oldCallOrderESet = callOrderESet;
		callOrder = CALL_ORDER_EDEFAULT;
		callOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER, oldCallOrder,
					CALL_ORDER_EDEFAULT, oldCallOrderESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCallOrder() {
		return callOrderESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getHostDemandCvsq() {
		return hostDemandCvsq;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostDemandCvsq(Object newHostDemandCvsq) {
		Object oldHostDemandCvsq = hostDemandCvsq;
		hostDemandCvsq = newHostDemandCvsq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ,
					oldHostDemandCvsq, hostDemandCvsq));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getHostDemandMean() {
		return hostDemandMean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostDemandMean(Object newHostDemandMean) {
		Object oldHostDemandMean = hostDemandMean;
		hostDemandMean = newHostDemandMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN,
					oldHostDemandMean, hostDemandMean));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMaxServiceTime() {
		return maxServiceTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxServiceTime(Object newMaxServiceTime) {
		Object oldMaxServiceTime = maxServiceTime;
		maxServiceTime = newMaxServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME,
					oldMaxServiceTime, maxServiceTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.ACTIVITY_DEF_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinkTime(Object newThinkTime) {
		Object oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME, oldThinkTime,
					thinkTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
			return ((InternalEList<?>) getServiceTimeDistribution())
					.basicRemove(otherEnd, msgs);
		case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
			return ((InternalEList<?>) getResultActivity()).basicRemove(
					otherEnd, msgs);
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
		case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
			return getServiceTimeDistribution();
		case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
			return getResultActivity();
		case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
			return getCallOrder();
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
			return getHostDemandCvsq();
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
			return getHostDemandMean();
		case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
			return getMaxServiceTime();
		case LqnPackage.ACTIVITY_DEF_BASE__NAME:
			return getName();
		case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
			return getThinkTime();
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
		case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
			getServiceTimeDistribution().clear();
			getServiceTimeDistribution().addAll(
					(Collection<? extends OutputDistributionType>) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
			getResultActivity().clear();
			getResultActivity().addAll(
					(Collection<? extends OutputResultType>) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
			setCallOrder((CallOrderType) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
			setHostDemandCvsq(newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
			setHostDemandMean(newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
			setMaxServiceTime(newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__NAME:
			setName((String) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
			setThinkTime(newValue);
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
		case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
			getServiceTimeDistribution().clear();
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
			getResultActivity().clear();
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
			unsetCallOrder();
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
			setHostDemandCvsq(HOST_DEMAND_CVSQ_EDEFAULT);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
			setHostDemandMean(HOST_DEMAND_MEAN_EDEFAULT);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
			setMaxServiceTime(MAX_SERVICE_TIME_EDEFAULT);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
			setThinkTime(THINK_TIME_EDEFAULT);
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
		case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
			return serviceTimeDistribution != null
					&& !serviceTimeDistribution.isEmpty();
		case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
			return resultActivity != null && !resultActivity.isEmpty();
		case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
			return isSetCallOrder();
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
			return HOST_DEMAND_CVSQ_EDEFAULT == null ? hostDemandCvsq != null
					: !HOST_DEMAND_CVSQ_EDEFAULT.equals(hostDemandCvsq);
		case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
			return HOST_DEMAND_MEAN_EDEFAULT == null ? hostDemandMean != null
					: !HOST_DEMAND_MEAN_EDEFAULT.equals(hostDemandMean);
		case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
			return MAX_SERVICE_TIME_EDEFAULT == null ? maxServiceTime != null
					: !MAX_SERVICE_TIME_EDEFAULT.equals(maxServiceTime);
		case LqnPackage.ACTIVITY_DEF_BASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
			return THINK_TIME_EDEFAULT == null ? thinkTime != null
					: !THINK_TIME_EDEFAULT.equals(thinkTime);
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
		result.append(" (callOrder: ");
		if (callOrderESet)
			result.append(callOrder);
		else
			result.append("<unset>");
		result.append(", hostDemandCvsq: ");
		result.append(hostDemandCvsq);
		result.append(", hostDemandMean: ");
		result.append(hostDemandMean);
		result.append(", maxServiceTime: ");
		result.append(maxServiceTime);
		result.append(", name: ");
		result.append(name);
		result.append(", thinkTime: ");
		result.append(thinkTime);
		result.append(')');
		return result.toString();
	}

} // ActivityDefBaseImpl
