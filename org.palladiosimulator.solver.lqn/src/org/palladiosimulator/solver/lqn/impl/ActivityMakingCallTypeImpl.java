/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Making Call Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityMakingCallTypeImpl#getCallsMean <em>
 * Calls Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityMakingCallTypeImpl extends MakingCallTypeImpl implements ActivityMakingCallType {

    /**
     * The default value of the '{@link #getCallsMean() <em>Calls Mean</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCallsMean()
     * @generated
     * @ordered
     */
    protected static final Object CALLS_MEAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCallsMean() <em>Calls Mean</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCallsMean()
     * @generated
     * @ordered
     */
    protected Object callsMean = CALLS_MEAN_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityMakingCallTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.ACTIVITY_MAKING_CALL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getCallsMean() {
        return this.callsMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCallsMean(final Object newCallsMean) {
        final Object oldCallsMean = this.callsMean;
        this.callsMean = newCallsMean;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN,
                    oldCallsMean, this.callsMean));
        }
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
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
            return this.getCallsMean();
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
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
            this.setCallsMean(newValue);
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
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
            this.setCallsMean(CALLS_MEAN_EDEFAULT);
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
        case LqnPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
            return CALLS_MEAN_EDEFAULT == null ? this.callsMean != null : !CALLS_MEAN_EDEFAULT.equals(this.callsMean);
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
        result.append(" (callsMean: ");
        result.append(this.callsMean);
        result.append(')');
        return result.toString();
    }

} // ActivityMakingCallTypeImpl
