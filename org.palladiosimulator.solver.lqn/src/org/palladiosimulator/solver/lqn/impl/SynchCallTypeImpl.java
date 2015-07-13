/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.SynchCallType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synch Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchCallTypeImpl extends MinimalEObjectImpl.Container implements SynchCallType {
	/**
	 * The default value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected String dest = DEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchCallTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.SYNCH_CALL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(String newDest) {
		String oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SYNCH_CALL_TYPE__DEST, oldDest, dest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.SYNCH_CALL_TYPE__DEST:
				return getDest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnPackage.SYNCH_CALL_TYPE__DEST:
				setDest((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LqnPackage.SYNCH_CALL_TYPE__DEST:
				setDest(DEST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LqnPackage.SYNCH_CALL_TYPE__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dest: ");
		result.append(dest);
		result.append(')');
		return result.toString();
	}

} //SynchCallTypeImpl
