/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.ResultGeneralType;
import org.palladiosimulator.solver.lqn.ValidType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result General Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getConvVal
 * <em>Conv Val</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getElapsedTime
 * <em>Elapsed Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getIterations
 * <em>Iterations</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getPlatformInfo
 * <em>Platform Info</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getSolverInfo
 * <em>Solver Info</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getSystemCpuTime
 * <em>System Cpu Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getUserCpuTime
 * <em>User Cpu Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getValid <em>Valid</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class ResultGeneralTypeImpl extends EObjectImpl implements ResultGeneralType {

    /**
     * The default value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConvVal()
     * @generated
     * @ordered
     */
    protected static final Object CONV_VAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConvVal()
     * @generated
     * @ordered
     */
    protected Object convVal = CONV_VAL_EDEFAULT;

    /**
     * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getElapsedTime()
     * @generated
     * @ordered
     */
    protected static final String ELAPSED_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getElapsedTime()
     * @generated
     * @ordered
     */
    protected String elapsedTime = ELAPSED_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIterations()
     * @generated
     * @ordered
     */
    protected static final Object ITERATIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIterations()
     * @generated
     * @ordered
     */
    protected Object iterations = ITERATIONS_EDEFAULT;

    /**
     * The default value of the '{@link #getPlatformInfo() <em>Platform Info</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPlatformInfo()
     * @generated
     * @ordered
     */
    protected static final String PLATFORM_INFO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlatformInfo() <em>Platform Info</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPlatformInfo()
     * @generated
     * @ordered
     */
    protected String platformInfo = PLATFORM_INFO_EDEFAULT;

    /**
     * The default value of the '{@link #getSolverInfo() <em>Solver Info</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSolverInfo()
     * @generated
     * @ordered
     */
    protected static final String SOLVER_INFO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSolverInfo() <em>Solver Info</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSolverInfo()
     * @generated
     * @ordered
     */
    protected String solverInfo = SOLVER_INFO_EDEFAULT;

    /**
     * The default value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSystemCpuTime()
     * @generated
     * @ordered
     */
    protected static final String SYSTEM_CPU_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSystemCpuTime()
     * @generated
     * @ordered
     */
    protected String systemCpuTime = SYSTEM_CPU_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUserCpuTime()
     * @generated
     * @ordered
     */
    protected static final String USER_CPU_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUserCpuTime()
     * @generated
     * @ordered
     */
    protected String userCpuTime = USER_CPU_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getValid() <em>Valid</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValid()
     * @generated
     * @ordered
     */
    protected static final ValidType VALID_EDEFAULT = ValidType.YES;

    /**
     * The cached value of the '{@link #getValid() <em>Valid</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValid()
     * @generated
     * @ordered
     */
    protected ValidType valid = VALID_EDEFAULT;

    /**
     * This is true if the Valid attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean validESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResultGeneralTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.RESULT_GENERAL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getConvVal() {
        return this.convVal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConvVal(final Object newConvVal) {
        final Object oldConvVal = this.convVal;
        this.convVal = newConvVal;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__CONV_VAL,
                    oldConvVal, this.convVal));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getElapsedTime() {
        return this.elapsedTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setElapsedTime(final String newElapsedTime) {
        final String oldElapsedTime = this.elapsedTime;
        this.elapsedTime = newElapsedTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME,
                    oldElapsedTime, this.elapsedTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getIterations() {
        return this.iterations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIterations(final Object newIterations) {
        final Object oldIterations = this.iterations;
        this.iterations = newIterations;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__ITERATIONS,
                    oldIterations, this.iterations));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getPlatformInfo() {
        return this.platformInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPlatformInfo(final String newPlatformInfo) {
        final String oldPlatformInfo = this.platformInfo;
        this.platformInfo = newPlatformInfo;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO,
                    oldPlatformInfo, this.platformInfo));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getSolverInfo() {
        return this.solverInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSolverInfo(final String newSolverInfo) {
        final String oldSolverInfo = this.solverInfo;
        this.solverInfo = newSolverInfo;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO,
                    oldSolverInfo, this.solverInfo));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getSystemCpuTime() {
        return this.systemCpuTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSystemCpuTime(final String newSystemCpuTime) {
        final String oldSystemCpuTime = this.systemCpuTime;
        this.systemCpuTime = newSystemCpuTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME,
                    oldSystemCpuTime, this.systemCpuTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getUserCpuTime() {
        return this.userCpuTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUserCpuTime(final String newUserCpuTime) {
        final String oldUserCpuTime = this.userCpuTime;
        this.userCpuTime = newUserCpuTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME,
                    oldUserCpuTime, this.userCpuTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ValidType getValid() {
        return this.valid;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValid(final ValidType newValid) {
        final ValidType oldValid = this.valid;
        this.valid = newValid == null ? VALID_EDEFAULT : newValid;
        final boolean oldValidESet = this.validESet;
        this.validESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.RESULT_GENERAL_TYPE__VALID, oldValid,
                    this.valid, !oldValidESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetValid() {
        final ValidType oldValid = this.valid;
        final boolean oldValidESet = this.validESet;
        this.valid = VALID_EDEFAULT;
        this.validESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, lqnPackage.RESULT_GENERAL_TYPE__VALID,
                    oldValid, VALID_EDEFAULT, oldValidESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetValid() {
        return this.validESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case lqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            return this.getConvVal();
        case lqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            return this.getElapsedTime();
        case lqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            return this.getIterations();
        case lqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            return this.getPlatformInfo();
        case lqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            return this.getSolverInfo();
        case lqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            return this.getSystemCpuTime();
        case lqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            return this.getUserCpuTime();
        case lqnPackage.RESULT_GENERAL_TYPE__VALID:
            return this.getValid();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case lqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            this.setConvVal(newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            this.setElapsedTime((String) newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            this.setIterations(newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            this.setPlatformInfo((String) newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            this.setSolverInfo((String) newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            this.setSystemCpuTime((String) newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            this.setUserCpuTime((String) newValue);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__VALID:
            this.setValid((ValidType) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case lqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            this.setConvVal(CONV_VAL_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            this.setElapsedTime(ELAPSED_TIME_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            this.setIterations(ITERATIONS_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            this.setPlatformInfo(PLATFORM_INFO_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            this.setSolverInfo(SOLVER_INFO_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            this.setSystemCpuTime(SYSTEM_CPU_TIME_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            this.setUserCpuTime(USER_CPU_TIME_EDEFAULT);
            return;
        case lqnPackage.RESULT_GENERAL_TYPE__VALID:
            this.unsetValid();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case lqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            return CONV_VAL_EDEFAULT == null ? this.convVal != null : !CONV_VAL_EDEFAULT.equals(this.convVal);
        case lqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            return ELAPSED_TIME_EDEFAULT == null ? this.elapsedTime != null
                    : !ELAPSED_TIME_EDEFAULT.equals(this.elapsedTime);
        case lqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            return ITERATIONS_EDEFAULT == null ? this.iterations != null : !ITERATIONS_EDEFAULT.equals(this.iterations);
        case lqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            return PLATFORM_INFO_EDEFAULT == null ? this.platformInfo != null
                    : !PLATFORM_INFO_EDEFAULT.equals(this.platformInfo);
        case lqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            return SOLVER_INFO_EDEFAULT == null ? this.solverInfo != null
                    : !SOLVER_INFO_EDEFAULT.equals(this.solverInfo);
        case lqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            return SYSTEM_CPU_TIME_EDEFAULT == null ? this.systemCpuTime != null
                    : !SYSTEM_CPU_TIME_EDEFAULT.equals(this.systemCpuTime);
        case lqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            return USER_CPU_TIME_EDEFAULT == null ? this.userCpuTime != null
                    : !USER_CPU_TIME_EDEFAULT.equals(this.userCpuTime);
        case lqnPackage.RESULT_GENERAL_TYPE__VALID:
            return this.isSetValid();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (convVal: ");
        result.append(this.convVal);
        result.append(", elapsedTime: ");
        result.append(this.elapsedTime);
        result.append(", iterations: ");
        result.append(this.iterations);
        result.append(", platformInfo: ");
        result.append(this.platformInfo);
        result.append(", solverInfo: ");
        result.append(this.solverInfo);
        result.append(", systemCpuTime: ");
        result.append(this.systemCpuTime);
        result.append(", userCpuTime: ");
        result.append(this.userCpuTime);
        result.append(", valid: ");
        if (this.validESet) {
            result.append(this.valid);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // ResultGeneralTypeImpl
