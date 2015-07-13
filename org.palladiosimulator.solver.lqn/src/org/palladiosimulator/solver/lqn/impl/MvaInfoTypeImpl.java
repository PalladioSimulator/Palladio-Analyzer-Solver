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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mva Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getCore <em>Core</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getFaults <em>Faults</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getStep <em>Step</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getStepSquared <em>Step Squared
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getSubmodels <em>Submodels</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getWait <em>Wait</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl#getWaitSquared <em>Wait Squared
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MvaInfoTypeImpl extends MinimalEObjectImpl.Container implements MvaInfoType {
    /**
     * The default value of the '{@link #getCore() <em>Core</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getCore()
     * @generated
     * @ordered
     */
    protected static final BigInteger CORE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCore() <em>Core</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getCore()
     * @generated
     * @ordered
     */
    protected BigInteger core = CORE_EDEFAULT;

    /**
     * The default value of the '{@link #getFaults() <em>Faults</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFaults()
     * @generated
     * @ordered
     */
    protected static final BigInteger FAULTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFaults() <em>Faults</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getFaults()
     * @generated
     * @ordered
     */
    protected BigInteger faults = FAULTS_EDEFAULT;

    /**
     * The default value of the '{@link #getStep() <em>Step</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected static final double STEP_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getStep() <em>Step</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected double step = STEP_EDEFAULT;

    /**
     * This is true if the Step attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean stepESet;

    /**
     * The default value of the '{@link #getStepSquared() <em>Step Squared</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStepSquared()
     * @generated
     * @ordered
     */
    protected static final double STEP_SQUARED_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getStepSquared() <em>Step Squared</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStepSquared()
     * @generated
     * @ordered
     */
    protected double stepSquared = STEP_SQUARED_EDEFAULT;

    /**
     * This is true if the Step Squared attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean stepSquaredESet;

    /**
     * The default value of the '{@link #getSubmodels() <em>Submodels</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSubmodels()
     * @generated
     * @ordered
     */
    protected static final BigInteger SUBMODELS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubmodels() <em>Submodels</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSubmodels()
     * @generated
     * @ordered
     */
    protected BigInteger submodels = SUBMODELS_EDEFAULT;

    /**
     * The default value of the '{@link #getWait() <em>Wait</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getWait()
     * @generated
     * @ordered
     */
    protected static final double WAIT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getWait() <em>Wait</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getWait()
     * @generated
     * @ordered
     */
    protected double wait = WAIT_EDEFAULT;

    /**
     * This is true if the Wait attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean waitESet;

    /**
     * The default value of the '{@link #getWaitSquared() <em>Wait Squared</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaitSquared()
     * @generated
     * @ordered
     */
    protected static final double WAIT_SQUARED_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getWaitSquared() <em>Wait Squared</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaitSquared()
     * @generated
     * @ordered
     */
    protected double waitSquared = WAIT_SQUARED_EDEFAULT;

    /**
     * This is true if the Wait Squared attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean waitSquaredESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MvaInfoTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.MVA_INFO_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getCore() {
        return this.core;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCore(final BigInteger newCore) {
        final BigInteger oldCore = this.core;
        this.core = newCore;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__CORE, oldCore,
                    this.core));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getFaults() {
        return this.faults;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFaults(final BigInteger newFaults) {
        final BigInteger oldFaults = this.faults;
        this.faults = newFaults;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__FAULTS, oldFaults,
                    this.faults));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getStep() {
        return this.step;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStep(final double newStep) {
        final double oldStep = this.step;
        this.step = newStep;
        final boolean oldStepESet = this.stepESet;
        this.stepESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__STEP, oldStep,
                    this.step,
                    !oldStepESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetStep() {
        final double oldStep = this.step;
        final boolean oldStepESet = this.stepESet;
        this.step = STEP_EDEFAULT;
        this.stepESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__STEP, oldStep,
                    STEP_EDEFAULT, oldStepESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetStep() {
        return this.stepESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getStepSquared() {
        return this.stepSquared;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStepSquared(final double newStepSquared) {
        final double oldStepSquared = this.stepSquared;
        this.stepSquared = newStepSquared;
        final boolean oldStepSquaredESet = this.stepSquaredESet;
        this.stepSquaredESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__STEP_SQUARED,
                    oldStepSquared, this.stepSquared, !oldStepSquaredESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetStepSquared() {
        final double oldStepSquared = this.stepSquared;
        final boolean oldStepSquaredESet = this.stepSquaredESet;
        this.stepSquared = STEP_SQUARED_EDEFAULT;
        this.stepSquaredESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__STEP_SQUARED,
                    oldStepSquared, STEP_SQUARED_EDEFAULT, oldStepSquaredESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetStepSquared() {
        return this.stepSquaredESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getSubmodels() {
        return this.submodels;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSubmodels(final BigInteger newSubmodels) {
        final BigInteger oldSubmodels = this.submodels;
        this.submodels = newSubmodels;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__SUBMODELS,
                    oldSubmodels,
                    this.submodels));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getWait() {
        return this.wait;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWait(final double newWait) {
        final double oldWait = this.wait;
        this.wait = newWait;
        final boolean oldWaitESet = this.waitESet;
        this.waitESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__WAIT, oldWait,
                    this.wait,
                    !oldWaitESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetWait() {
        final double oldWait = this.wait;
        final boolean oldWaitESet = this.waitESet;
        this.wait = WAIT_EDEFAULT;
        this.waitESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__WAIT, oldWait,
                    WAIT_EDEFAULT, oldWaitESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetWait() {
        return this.waitESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getWaitSquared() {
        return this.waitSquared;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWaitSquared(final double newWaitSquared) {
        final double oldWaitSquared = this.waitSquared;
        this.waitSquared = newWaitSquared;
        final boolean oldWaitSquaredESet = this.waitSquaredESet;
        this.waitSquaredESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED,
                    oldWaitSquared, this.waitSquared, !oldWaitSquaredESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetWaitSquared() {
        final double oldWaitSquared = this.waitSquared;
        final boolean oldWaitSquaredESet = this.waitSquaredESet;
        this.waitSquared = WAIT_SQUARED_EDEFAULT;
        this.waitSquaredESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED,
                    oldWaitSquared, WAIT_SQUARED_EDEFAULT, oldWaitSquaredESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetWaitSquared() {
        return this.waitSquaredESet;
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
        case LqnPackage.MVA_INFO_TYPE__CORE:
            return this.getCore();
        case LqnPackage.MVA_INFO_TYPE__FAULTS:
            return this.getFaults();
        case LqnPackage.MVA_INFO_TYPE__STEP:
            return this.getStep();
        case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
            return this.getStepSquared();
        case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
            return this.getSubmodels();
        case LqnPackage.MVA_INFO_TYPE__WAIT:
            return this.getWait();
        case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
            return this.getWaitSquared();
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
        case LqnPackage.MVA_INFO_TYPE__CORE:
            this.setCore((BigInteger) newValue);
            return;
        case LqnPackage.MVA_INFO_TYPE__FAULTS:
            this.setFaults((BigInteger) newValue);
            return;
        case LqnPackage.MVA_INFO_TYPE__STEP:
            this.setStep((Double) newValue);
            return;
        case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
            this.setStepSquared((Double) newValue);
            return;
        case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
            this.setSubmodels((BigInteger) newValue);
            return;
        case LqnPackage.MVA_INFO_TYPE__WAIT:
            this.setWait((Double) newValue);
            return;
        case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
            this.setWaitSquared((Double) newValue);
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
        case LqnPackage.MVA_INFO_TYPE__CORE:
            this.setCore(CORE_EDEFAULT);
            return;
        case LqnPackage.MVA_INFO_TYPE__FAULTS:
            this.setFaults(FAULTS_EDEFAULT);
            return;
        case LqnPackage.MVA_INFO_TYPE__STEP:
            this.unsetStep();
            return;
        case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
            this.unsetStepSquared();
            return;
        case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
            this.setSubmodels(SUBMODELS_EDEFAULT);
            return;
        case LqnPackage.MVA_INFO_TYPE__WAIT:
            this.unsetWait();
            return;
        case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
            this.unsetWaitSquared();
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
        case LqnPackage.MVA_INFO_TYPE__CORE:
            return CORE_EDEFAULT == null ? this.core != null : !CORE_EDEFAULT.equals(this.core);
        case LqnPackage.MVA_INFO_TYPE__FAULTS:
            return FAULTS_EDEFAULT == null ? this.faults != null : !FAULTS_EDEFAULT.equals(this.faults);
        case LqnPackage.MVA_INFO_TYPE__STEP:
            return this.isSetStep();
        case LqnPackage.MVA_INFO_TYPE__STEP_SQUARED:
            return this.isSetStepSquared();
        case LqnPackage.MVA_INFO_TYPE__SUBMODELS:
            return SUBMODELS_EDEFAULT == null ? this.submodels != null : !SUBMODELS_EDEFAULT.equals(this.submodels);
        case LqnPackage.MVA_INFO_TYPE__WAIT:
            return this.isSetWait();
        case LqnPackage.MVA_INFO_TYPE__WAIT_SQUARED:
            return this.isSetWaitSquared();
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
        result.append(" (core: ");
        result.append(this.core);
        result.append(", faults: ");
        result.append(this.faults);
        result.append(", step: ");
        if (this.stepESet) {
            result.append(this.step);
        } else {
            result.append("<unset>");
        }
        result.append(", stepSquared: ");
        if (this.stepSquaredESet) {
            result.append(this.stepSquared);
        } else {
            result.append("<unset>");
        }
        result.append(", submodels: ");
        result.append(this.submodels);
        result.append(", wait: ");
        if (this.waitESet) {
            result.append(this.wait);
        } else {
            result.append("<unset>");
        }
        result.append(", waitSquared: ");
        if (this.waitSquaredESet) {
            result.append(this.waitSquared);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // MvaInfoTypeImpl
