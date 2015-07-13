/**
 */
package org.palladiosimulator.solver.lqn.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.MvaInfoType;
import org.palladiosimulator.solver.lqn.ResultGeneralType;
import org.palladiosimulator.solver.lqn.ValidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result General Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getMvaInfo <em>Mva Info</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getConvVal <em>Conv Val</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getPlatformInfo <em>Platform Info</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getSolverInfo <em>Solver Info</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getSystemCpuTime <em>System Cpu Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getUserCpuTime <em>User Cpu Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultGeneralTypeImpl extends MinimalEObjectImpl.Container implements ResultGeneralType {
	/**
	 * The cached value of the '{@link #getMvaInfo() <em>Mva Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMvaInfo()
	 * @generated
	 * @ordered
	 */
	protected MvaInfoType mvaInfo;

	/**
	 * The default value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvVal()
	 * @generated
	 * @ordered
	 */
	protected static final double CONV_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvVal()
	 * @generated
	 * @ordered
	 */
	protected double convVal = CONV_VAL_EDEFAULT;

	/**
	 * This is true if the Conv Val attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean convValESet;

	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final double ITERATIONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected double iterations = ITERATIONS_EDEFAULT;

	/**
	 * This is true if the Iterations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iterationsESet;

	/**
	 * The default value of the '{@link #getPlatformInfo() <em>Platform Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformInfo() <em>Platform Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformInfo()
	 * @generated
	 * @ordered
	 */
	protected String platformInfo = PLATFORM_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverInfo() <em>Solver Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLVER_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolverInfo() <em>Solver Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverInfo()
	 * @generated
	 * @ordered
	 */
	protected String solverInfo = SOLVER_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCpuTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SYSTEM_CPU_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCpuTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar systemCpuTime = SYSTEM_CPU_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserCpuTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar USER_CPU_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserCpuTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar userCpuTime = USER_CPU_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected static final ValidType VALID_EDEFAULT = ValidType.YES;

	/**
	 * The cached value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected ValidType valid = VALID_EDEFAULT;

	/**
	 * This is true if the Valid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultGeneralTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.RESULT_GENERAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvaInfoType getMvaInfo() {
		return mvaInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMvaInfo(MvaInfoType newMvaInfo, NotificationChain msgs) {
		MvaInfoType oldMvaInfo = mvaInfo;
		mvaInfo = newMvaInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, oldMvaInfo, newMvaInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMvaInfo(MvaInfoType newMvaInfo) {
		if (newMvaInfo != mvaInfo) {
			NotificationChain msgs = null;
			if (mvaInfo != null)
				msgs = ((InternalEObject)mvaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, null, msgs);
			if (newMvaInfo != null)
				msgs = ((InternalEObject)newMvaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, null, msgs);
			msgs = basicSetMvaInfo(newMvaInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, newMvaInfo, newMvaInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConvVal() {
		return convVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvVal(double newConvVal) {
		double oldConvVal = convVal;
		convVal = newConvVal;
		boolean oldConvValESet = convValESet;
		convValESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL, oldConvVal, convVal, !oldConvValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConvVal() {
		double oldConvVal = convVal;
		boolean oldConvValESet = convValESet;
		convVal = CONV_VAL_EDEFAULT;
		convValESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL, oldConvVal, CONV_VAL_EDEFAULT, oldConvValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConvVal() {
		return convValESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElapsedTime(XMLGregorianCalendar newElapsedTime) {
		XMLGregorianCalendar oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(double newIterations) {
		double oldIterations = iterations;
		iterations = newIterations;
		boolean oldIterationsESet = iterationsESet;
		iterationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS, oldIterations, iterations, !oldIterationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIterations() {
		double oldIterations = iterations;
		boolean oldIterationsESet = iterationsESet;
		iterations = ITERATIONS_EDEFAULT;
		iterationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS, oldIterations, ITERATIONS_EDEFAULT, oldIterationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIterations() {
		return iterationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformInfo() {
		return platformInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformInfo(String newPlatformInfo) {
		String oldPlatformInfo = platformInfo;
		platformInfo = newPlatformInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO, oldPlatformInfo, platformInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolverInfo() {
		return solverInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverInfo(String newSolverInfo) {
		String oldSolverInfo = solverInfo;
		solverInfo = newSolverInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO, oldSolverInfo, solverInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSystemCpuTime() {
		return systemCpuTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemCpuTime(XMLGregorianCalendar newSystemCpuTime) {
		XMLGregorianCalendar oldSystemCpuTime = systemCpuTime;
		systemCpuTime = newSystemCpuTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME, oldSystemCpuTime, systemCpuTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getUserCpuTime() {
		return userCpuTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserCpuTime(XMLGregorianCalendar newUserCpuTime) {
		XMLGregorianCalendar oldUserCpuTime = userCpuTime;
		userCpuTime = newUserCpuTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME, oldUserCpuTime, userCpuTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidType getValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(ValidType newValid) {
		ValidType oldValid = valid;
		valid = newValid == null ? VALID_EDEFAULT : newValid;
		boolean oldValidESet = validESet;
		validESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__VALID, oldValid, valid, !oldValidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValid() {
		ValidType oldValid = valid;
		boolean oldValidESet = validESet;
		valid = VALID_EDEFAULT;
		validESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_GENERAL_TYPE__VALID, oldValid, VALID_EDEFAULT, oldValidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValid() {
		return validESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
				return basicSetMvaInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
				return getMvaInfo();
			case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				return getConvVal();
			case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				return getElapsedTime();
			case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				return getIterations();
			case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				return getPlatformInfo();
			case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				return getSolverInfo();
			case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				return getSystemCpuTime();
			case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				return getUserCpuTime();
			case LqnPackage.RESULT_GENERAL_TYPE__VALID:
				return getValid();
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
			case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
				setMvaInfo((MvaInfoType)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				setConvVal((Double)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				setElapsedTime((XMLGregorianCalendar)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				setIterations((Double)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				setPlatformInfo((String)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				setSolverInfo((String)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				setSystemCpuTime((XMLGregorianCalendar)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				setUserCpuTime((XMLGregorianCalendar)newValue);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__VALID:
				setValid((ValidType)newValue);
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
			case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
				setMvaInfo((MvaInfoType)null);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				unsetConvVal();
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				unsetIterations();
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				setPlatformInfo(PLATFORM_INFO_EDEFAULT);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				setSolverInfo(SOLVER_INFO_EDEFAULT);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				setSystemCpuTime(SYSTEM_CPU_TIME_EDEFAULT);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				setUserCpuTime(USER_CPU_TIME_EDEFAULT);
				return;
			case LqnPackage.RESULT_GENERAL_TYPE__VALID:
				unsetValid();
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
			case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
				return mvaInfo != null;
			case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				return isSetConvVal();
			case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				return ELAPSED_TIME_EDEFAULT == null ? elapsedTime != null : !ELAPSED_TIME_EDEFAULT.equals(elapsedTime);
			case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				return isSetIterations();
			case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				return PLATFORM_INFO_EDEFAULT == null ? platformInfo != null : !PLATFORM_INFO_EDEFAULT.equals(platformInfo);
			case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				return SOLVER_INFO_EDEFAULT == null ? solverInfo != null : !SOLVER_INFO_EDEFAULT.equals(solverInfo);
			case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				return SYSTEM_CPU_TIME_EDEFAULT == null ? systemCpuTime != null : !SYSTEM_CPU_TIME_EDEFAULT.equals(systemCpuTime);
			case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				return USER_CPU_TIME_EDEFAULT == null ? userCpuTime != null : !USER_CPU_TIME_EDEFAULT.equals(userCpuTime);
			case LqnPackage.RESULT_GENERAL_TYPE__VALID:
				return isSetValid();
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
		result.append(" (convVal: ");
		if (convValESet) result.append(convVal); else result.append("<unset>");
		result.append(", elapsedTime: ");
		result.append(elapsedTime);
		result.append(", iterations: ");
		if (iterationsESet) result.append(iterations); else result.append("<unset>");
		result.append(", platformInfo: ");
		result.append(platformInfo);
		result.append(", solverInfo: ");
		result.append(solverInfo);
		result.append(", systemCpuTime: ");
		result.append(systemCpuTime);
		result.append(", userCpuTime: ");
		result.append(userCpuTime);
		result.append(", valid: ");
		if (validESet) result.append(valid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResultGeneralTypeImpl
