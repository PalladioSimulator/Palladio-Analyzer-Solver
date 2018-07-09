/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultJoinDelayType;
import org.palladiosimulator.solver.lqn.ResultConf95Type;
import org.palladiosimulator.solver.lqn.ResultConf99Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Output Result Join Delay Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl#getResultConf95 <em>Result Conf95</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl#getResultConf99 <em>Result Conf99</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl#getJoinVariance <em>Join Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl#getJoinWaiting <em>Join Waiting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputResultJoinDelayTypeImpl extends MinimalEObjectImpl.Container
		implements OutputResultJoinDelayType {
	/**
	 * The cached value of the '{@link #getResultConf95() <em>Result Conf95</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultConf95()
	 * @generated
	 * @ordered
	 */
	protected ResultConf95Type resultConf95;

	/**
	 * The cached value of the '{@link #getResultConf99() <em>Result Conf99</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultConf99()
	 * @generated
	 * @ordered
	 */
	protected ResultConf99Type resultConf99;

	/**
	 * The default value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJoinVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double JOIN_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJoinVariance()
	 * @generated
	 * @ordered
	 */
	protected double joinVariance = JOIN_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Join Variance attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean joinVarianceESet;

	/**
	 * The default value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJoinWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double JOIN_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJoinWaiting()
	 * @generated
	 * @ordered
	 */
	protected double joinWaiting = JOIN_WAITING_EDEFAULT;

	/**
	 * This is true if the Join Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean joinWaitingESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputResultJoinDelayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.OUTPUT_RESULT_JOIN_DELAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultConf95Type getResultConf95() {
		return resultConf95;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultConf95(
			ResultConf95Type newResultConf95, NotificationChain msgs) {
		ResultConf95Type oldResultConf95 = resultConf95;
		resultConf95 = newResultConf95;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95,
					oldResultConf95, newResultConf95);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultConf95(ResultConf95Type newResultConf95) {
		if (newResultConf95 != resultConf95) {
			NotificationChain msgs = null;
			if (resultConf95 != null)
				msgs = ((InternalEObject) resultConf95)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95,
								null, msgs);
			if (newResultConf95 != null)
				msgs = ((InternalEObject) newResultConf95)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95,
								null, msgs);
			msgs = basicSetResultConf95(newResultConf95, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95,
					newResultConf95, newResultConf95));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultConf99Type getResultConf99() {
		return resultConf99;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultConf99(
			ResultConf99Type newResultConf99, NotificationChain msgs) {
		ResultConf99Type oldResultConf99 = resultConf99;
		resultConf99 = newResultConf99;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99,
					oldResultConf99, newResultConf99);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultConf99(ResultConf99Type newResultConf99) {
		if (newResultConf99 != resultConf99) {
			NotificationChain msgs = null;
			if (resultConf99 != null)
				msgs = ((InternalEObject) resultConf99)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99,
								null, msgs);
			if (newResultConf99 != null)
				msgs = ((InternalEObject) newResultConf99)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99,
								null, msgs);
			msgs = basicSetResultConf99(newResultConf99, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99,
					newResultConf99, newResultConf99));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getJoinVariance() {
		return joinVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinVariance(double newJoinVariance) {
		double oldJoinVariance = joinVariance;
		joinVariance = newJoinVariance;
		boolean oldJoinVarianceESet = joinVarianceESet;
		joinVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE,
					oldJoinVariance, joinVariance, !oldJoinVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetJoinVariance() {
		double oldJoinVariance = joinVariance;
		boolean oldJoinVarianceESet = joinVarianceESet;
		joinVariance = JOIN_VARIANCE_EDEFAULT;
		joinVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE,
					oldJoinVariance, JOIN_VARIANCE_EDEFAULT,
					oldJoinVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetJoinVariance() {
		return joinVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getJoinWaiting() {
		return joinWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinWaiting(double newJoinWaiting) {
		double oldJoinWaiting = joinWaiting;
		joinWaiting = newJoinWaiting;
		boolean oldJoinWaitingESet = joinWaitingESet;
		joinWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING,
					oldJoinWaiting, joinWaiting, !oldJoinWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetJoinWaiting() {
		double oldJoinWaiting = joinWaiting;
		boolean oldJoinWaitingESet = joinWaitingESet;
		joinWaiting = JOIN_WAITING_EDEFAULT;
		joinWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING,
					oldJoinWaiting, JOIN_WAITING_EDEFAULT, oldJoinWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetJoinWaiting() {
		return joinWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95:
			return basicSetResultConf95(null, msgs);
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99:
			return basicSetResultConf99(null, msgs);
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
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95:
			return getResultConf95();
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99:
			return getResultConf99();
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE:
			return getJoinVariance();
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING:
			return getJoinWaiting();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95:
			setResultConf95((ResultConf95Type) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99:
			setResultConf99((ResultConf99Type) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE:
			setJoinVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING:
			setJoinWaiting((Double) newValue);
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
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95:
			setResultConf95((ResultConf95Type) null);
			return;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99:
			setResultConf99((ResultConf99Type) null);
			return;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE:
			unsetJoinVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING:
			unsetJoinWaiting();
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
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95:
			return resultConf95 != null;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99:
			return resultConf99 != null;
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE:
			return isSetJoinVariance();
		case LqnPackage.OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING:
			return isSetJoinWaiting();
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
		result.append(" (joinVariance: ");
		if (joinVarianceESet)
			result.append(joinVariance);
		else
			result.append("<unset>");
		result.append(", joinWaiting: ");
		if (joinWaitingESet)
			result.append(joinWaiting);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OutputResultJoinDelayTypeImpl
