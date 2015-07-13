/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.MvaInfoType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mva Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getCore <em>Core</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getStepSquared <em>Step Squared</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getSubmodels <em>Submodels</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getWaitSquared <em>Wait Squared</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MvaInfoTypeImpl extends MinimalEObjectImpl.Container implements MvaInfoType {
	/**
	 * The default value of the '{@link #getCore() <em>Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected BigInteger core = CORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaults() <em>Faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FAULTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaults() <em>Faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults()
	 * @generated
	 * @ordered
	 */
	protected BigInteger faults = FAULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * This is true if the Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepESet;

	/**
	 * The default value of the '{@link #getStepSquared() <em>Step Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSquared()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_SQUARED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStepSquared() <em>Step Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSquared()
	 * @generated
	 * @ordered
	 */
	protected double stepSquared = STEP_SQUARED_EDEFAULT;

	/**
	 * This is true if the Step Squared attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepSquaredESet;

	/**
	 * The default value of the '{@link #getSubmodels() <em>Submodels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodels()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SUBMODELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmodels() <em>Submodels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodels()
	 * @generated
	 * @ordered
	 */
	protected BigInteger submodels = SUBMODELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWait() <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected static final double WAIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected double wait = WAIT_EDEFAULT;

	/**
	 * This is true if the Wait attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waitESet;

	/**
	 * The default value of the '{@link #getWaitSquared() <em>Wait Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitSquared()
	 * @generated
	 * @ordered
	 */
	protected static final double WAIT_SQUARED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWaitSquared() <em>Wait Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitSquared()
	 * @generated
	 * @ordered
	 */
	protected double waitSquared = WAIT_SQUARED_EDEFAULT;

	/**
	 * This is true if the Wait Squared attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waitSquaredESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MvaInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.MVA_INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(BigInteger newCore) {
		BigInteger oldCore = core;
		core = newCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__CORE, oldCore, core));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFaults() {
		return faults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaults(BigInteger newFaults) {
		BigInteger oldFaults = faults;
		faults = newFaults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__FAULTS, oldFaults, faults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		boolean oldStepESet = stepESet;
		stepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__STEP, oldStep, step, !oldStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStep() {
		double oldStep = step;
		boolean oldStepESet = stepESet;
		step = STEP_EDEFAULT;
		stepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__STEP, oldStep, STEP_EDEFAULT, oldStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
		return stepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStepSquared() {
		return stepSquared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSquared(double newStepSquared) {
		double oldStepSquared = stepSquared;
		stepSquared = newStepSquared;
		boolean oldStepSquaredESet = stepSquaredESet;
		stepSquaredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__STEP_SQUARED, oldStepSquared, stepSquared, !oldStepSquaredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStepSquared() {
		double oldStepSquared = stepSquared;
		boolean oldStepSquaredESet = stepSquaredESet;
		stepSquared = STEP_SQUARED_EDEFAULT;
		stepSquaredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__STEP_SQUARED, oldStepSquared, STEP_SQUARED_EDEFAULT, oldStepSquaredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStepSquared() {
		return stepSquaredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSubmodels() {
		return submodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmodels(BigInteger newSubmodels) {
		BigInteger oldSubmodels = submodels;
		submodels = newSubmodels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__SUBMODELS, oldSubmodels, submodels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(double newWait) {
		double oldWait = wait;
		wait = newWait;
		boolean oldWaitESet = waitESet;
		waitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__WAIT, oldWait, wait, !oldWaitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWait() {
		double oldWait = wait;
		boolean oldWaitESet = waitESet;
		wait = WAIT_EDEFAULT;
		waitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__WAIT, oldWait, WAIT_EDEFAULT, oldWaitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWait() {
		return waitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWaitSquared() {
		return waitSquared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitSquared(double newWaitSquared) {
		double oldWaitSquared = waitSquared;
		waitSquared = newWaitSquared;
		boolean oldWaitSquaredESet = waitSquaredESet;
		waitSquaredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED, oldWaitSquared, waitSquared, !oldWaitSquaredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWaitSquared() {
		double oldWaitSquared = waitSquared;
		boolean oldWaitSquaredESet = waitSquaredESet;
		waitSquared = WAIT_SQUARED_EDEFAULT;
		waitSquaredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED, oldWaitSquared, WAIT_SQUARED_EDEFAULT, oldWaitSquaredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWaitSquared() {
		return waitSquaredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.MVA_INFO_TYPE__CORE:
				return getCore();
			case LqnPackage.MVA_INFO_TYPE__FAULTS:
				return getFaults();
			case LqnPackage.MVA_INFO_TYPE__STEP:
				return getStep();
			case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
				return getStepSquared();
			case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
				return getSubmodels();
			case LqnPackage.MVA_INFO_TYPE__WAIT:
				return getWait();
			case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
				return getWaitSquared();
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
			case LqnPackage.MVA_INFO_TYPE__CORE:
				setCore((BigInteger)newValue);
				return;
			case LqnPackage.MVA_INFO_TYPE__FAULTS:
				setFaults((BigInteger)newValue);
				return;
			case LqnPackage.MVA_INFO_TYPE__STEP:
				setStep((Double)newValue);
				return;
			case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
				setStepSquared((Double)newValue);
				return;
			case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
				setSubmodels((BigInteger)newValue);
				return;
			case LqnPackage.MVA_INFO_TYPE__WAIT:
				setWait((Double)newValue);
				return;
			case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
				setWaitSquared((Double)newValue);
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
			case LqnPackage.MVA_INFO_TYPE__CORE:
				setCore(CORE_EDEFAULT);
				return;
			case LqnPackage.MVA_INFO_TYPE__FAULTS:
				setFaults(FAULTS_EDEFAULT);
				return;
			case LqnPackage.MVA_INFO_TYPE__STEP:
				unsetStep();
				return;
			case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
				unsetStepSquared();
				return;
			case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
				setSubmodels(SUBMODELS_EDEFAULT);
				return;
			case LqnPackage.MVA_INFO_TYPE__WAIT:
				unsetWait();
				return;
			case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
				unsetWaitSquared();
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
			case LqnPackage.MVA_INFO_TYPE__CORE:
				return CORE_EDEFAULT == null ? core != null : !CORE_EDEFAULT.equals(core);
			case LqnPackage.MVA_INFO_TYPE__FAULTS:
				return FAULTS_EDEFAULT == null ? faults != null : !FAULTS_EDEFAULT.equals(faults);
			case LqnPackage.MVA_INFO_TYPE__STEP:
				return isSetStep();
			case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
				return isSetStepSquared();
			case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
				return SUBMODELS_EDEFAULT == null ? submodels != null : !SUBMODELS_EDEFAULT.equals(submodels);
			case LqnPackage.MVA_INFO_TYPE__WAIT:
				return isSetWait();
			case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
				return isSetWaitSquared();
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
		result.append(" (core: ");
		result.append(core);
		result.append(", faults: ");
		result.append(faults);
		result.append(", step: ");
		if (stepESet) result.append(step); else result.append("<unset>");
		result.append(", stepSquared: ");
		if (stepSquaredESet) result.append(stepSquared); else result.append("<unset>");
		result.append(", submodels: ");
		result.append(submodels);
		result.append(", wait: ");
		if (waitESet) result.append(wait); else result.append("<unset>");
		result.append(", waitSquared: ");
		if (waitSquaredESet) result.append(waitSquared); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MvaInfoTypeImpl
