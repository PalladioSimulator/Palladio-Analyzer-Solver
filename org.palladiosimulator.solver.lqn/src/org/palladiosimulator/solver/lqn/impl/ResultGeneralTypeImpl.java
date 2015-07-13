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
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result General Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getMvaInfo <em>Mva Info
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getConvVal <em>Conv Val
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getElapsedTime <em>Elapsed
 * Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getIterations <em>
 * Iterations</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getPlatformInfo <em>
 * Platform Info</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getSolverInfo <em>Solver
 * Info</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getSystemCpuTime <em>
 * System Cpu Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getUserCpuTime <em>User
 * Cpu Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl#getValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultGeneralTypeImpl extends MinimalEObjectImpl.Container implements ResultGeneralType {
    /**
     * The cached value of the '{@link #getMvaInfo() <em>Mva Info</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMvaInfo()
     * @generated
     * @ordered
     */
    protected MvaInfoType mvaInfo;

    /**
     * The default value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConvVal()
     * @generated
     * @ordered
     */
    protected static final double CONV_VAL_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConvVal()
     * @generated
     * @ordered
     */
    protected double convVal = CONV_VAL_EDEFAULT;

    /**
     * This is true if the Conv Val attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean convValESet;

    /**
     * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getElapsedTime()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar ELAPSED_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getElapsedTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar elapsedTime = ELAPSED_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIterations()
     * @generated
     * @ordered
     */
    protected static final double ITERATIONS_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIterations()
     * @generated
     * @ordered
     */
    protected double iterations = ITERATIONS_EDEFAULT;

    /**
     * This is true if the Iterations attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean iterationsESet;

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
    protected static final XMLGregorianCalendar SYSTEM_CPU_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSystemCpuTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar systemCpuTime = SYSTEM_CPU_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUserCpuTime()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar USER_CPU_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUserCpuTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar userCpuTime = USER_CPU_TIME_EDEFAULT;

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
        return LqnPackage.Literals.RESULT_GENERAL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MvaInfoType getMvaInfo() {
        return this.mvaInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetMvaInfo(final MvaInfoType newMvaInfo, NotificationChain msgs) {
        final MvaInfoType oldMvaInfo = this.mvaInfo;
        this.mvaInfo = newMvaInfo;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, oldMvaInfo, newMvaInfo);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMvaInfo(final MvaInfoType newMvaInfo) {
        if (newMvaInfo != this.mvaInfo)
        {
            NotificationChain msgs = null;
            if (this.mvaInfo != null) {
                msgs = ((InternalEObject) this.mvaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, null, msgs);
            }
            if (newMvaInfo != null) {
                msgs = ((InternalEObject) newMvaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO, null, msgs);
            }
            msgs = this.basicSetMvaInfo(newMvaInfo, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO,
                    newMvaInfo,
                    newMvaInfo));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getConvVal() {
        return this.convVal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConvVal(final double newConvVal) {
        final double oldConvVal = this.convVal;
        this.convVal = newConvVal;
        final boolean oldConvValESet = this.convValESet;
        this.convValESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL,
                    oldConvVal,
                    this.convVal, !oldConvValESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetConvVal() {
        final double oldConvVal = this.convVal;
        final boolean oldConvValESet = this.convValESet;
        this.convVal = CONV_VAL_EDEFAULT;
        this.convValESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL,
                    oldConvVal, CONV_VAL_EDEFAULT, oldConvValESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetConvVal() {
        return this.convValESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public XMLGregorianCalendar getElapsedTime() {
        return this.elapsedTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setElapsedTime(final XMLGregorianCalendar newElapsedTime) {
        final XMLGregorianCalendar oldElapsedTime = this.elapsedTime;
        this.elapsedTime = newElapsedTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME,
                    oldElapsedTime, this.elapsedTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getIterations() {
        return this.iterations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIterations(final double newIterations) {
        final double oldIterations = this.iterations;
        this.iterations = newIterations;
        final boolean oldIterationsESet = this.iterationsESet;
        this.iterationsESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS,
                    oldIterations, this.iterations, !oldIterationsESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetIterations() {
        final double oldIterations = this.iterations;
        final boolean oldIterationsESet = this.iterationsESet;
        this.iterations = ITERATIONS_EDEFAULT;
        this.iterationsESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS,
                    oldIterations, ITERATIONS_EDEFAULT, oldIterationsESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetIterations() {
        return this.iterationsESet;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO,
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO,
                    oldSolverInfo, this.solverInfo));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public XMLGregorianCalendar getSystemCpuTime() {
        return this.systemCpuTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSystemCpuTime(final XMLGregorianCalendar newSystemCpuTime) {
        final XMLGregorianCalendar oldSystemCpuTime = this.systemCpuTime;
        this.systemCpuTime = newSystemCpuTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME,
                    oldSystemCpuTime, this.systemCpuTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public XMLGregorianCalendar getUserCpuTime() {
        return this.userCpuTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUserCpuTime(final XMLGregorianCalendar newUserCpuTime) {
        final XMLGregorianCalendar oldUserCpuTime = this.userCpuTime;
        this.userCpuTime = newUserCpuTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME,
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_GENERAL_TYPE__VALID, oldValid,
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
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_GENERAL_TYPE__VALID,
                    oldValid,
                    VALID_EDEFAULT, oldValidESet));
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
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
            return this.basicSetMvaInfo(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
            return this.getMvaInfo();
        case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            return this.getConvVal();
        case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            return this.getElapsedTime();
        case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            return this.getIterations();
        case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            return this.getPlatformInfo();
        case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            return this.getSolverInfo();
        case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            return this.getSystemCpuTime();
        case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            return this.getUserCpuTime();
        case LqnPackage.RESULT_GENERAL_TYPE__VALID:
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
        switch (featureID)
        {
        case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
            this.setMvaInfo((MvaInfoType) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            this.setConvVal((Double) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            this.setElapsedTime((XMLGregorianCalendar) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            this.setIterations((Double) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            this.setPlatformInfo((String) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            this.setSolverInfo((String) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            this.setSystemCpuTime((XMLGregorianCalendar) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            this.setUserCpuTime((XMLGregorianCalendar) newValue);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__VALID:
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
        switch (featureID)
        {
        case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
            this.setMvaInfo((MvaInfoType) null);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            this.unsetConvVal();
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            this.setElapsedTime(ELAPSED_TIME_EDEFAULT);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            this.unsetIterations();
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            this.setPlatformInfo(PLATFORM_INFO_EDEFAULT);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            this.setSolverInfo(SOLVER_INFO_EDEFAULT);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            this.setSystemCpuTime(SYSTEM_CPU_TIME_EDEFAULT);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            this.setUserCpuTime(USER_CPU_TIME_EDEFAULT);
            return;
        case LqnPackage.RESULT_GENERAL_TYPE__VALID:
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
        switch (featureID)
        {
        case LqnPackage.RESULT_GENERAL_TYPE__MVA_INFO:
            return this.mvaInfo != null;
        case LqnPackage.RESULT_GENERAL_TYPE__CONV_VAL:
            return this.isSetConvVal();
        case LqnPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
            return ELAPSED_TIME_EDEFAULT == null ? this.elapsedTime != null : !ELAPSED_TIME_EDEFAULT
            .equals(this.elapsedTime);
        case LqnPackage.RESULT_GENERAL_TYPE__ITERATIONS:
            return this.isSetIterations();
        case LqnPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
            return PLATFORM_INFO_EDEFAULT == null ? this.platformInfo != null : !PLATFORM_INFO_EDEFAULT
            .equals(this.platformInfo);
        case LqnPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
            return SOLVER_INFO_EDEFAULT == null ? this.solverInfo != null : !SOLVER_INFO_EDEFAULT
            .equals(this.solverInfo);
        case LqnPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
            return SYSTEM_CPU_TIME_EDEFAULT == null ? this.systemCpuTime != null : !SYSTEM_CPU_TIME_EDEFAULT
                    .equals(this.systemCpuTime);
        case LqnPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
            return USER_CPU_TIME_EDEFAULT == null ? this.userCpuTime != null : !USER_CPU_TIME_EDEFAULT
            .equals(this.userCpuTime);
        case LqnPackage.RESULT_GENERAL_TYPE__VALID:
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
        if (this.convValESet) {
            result.append(this.convVal);
        } else {
            result.append("<unset>");
        }
        result.append(", elapsedTime: ");
        result.append(this.elapsedTime);
        result.append(", iterations: ");
        if (this.iterationsESet) {
            result.append(this.iterations);
        } else {
            result.append("<unset>");
        }
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
