/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ResultConf99Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Result Conf99 Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99TypeImpl#getJoinVariance <em>Join Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99TypeImpl#getJoinWaiting <em>Join Waiting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultConf99TypeImpl extends MinimalEObjectImpl.Container implements ResultConf99Type {
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
	protected ResultConf99TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.RESULT_CONF99_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE,
					oldJoinVariance, JOIN_VARIANCE_EDEFAULT, oldJoinVarianceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE__JOIN_WAITING,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE__JOIN_WAITING,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
			return getJoinVariance();
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
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
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
			setJoinVariance((Double) newValue);
			return;
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
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
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
			unsetJoinVariance();
			return;
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
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
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
			return isSetJoinVariance();
		case LqnPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
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

} // ResultConf99TypeImpl
