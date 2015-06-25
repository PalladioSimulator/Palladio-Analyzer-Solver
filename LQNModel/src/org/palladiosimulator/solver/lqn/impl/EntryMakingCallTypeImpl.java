/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.lqn.EntryMakingCallType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entry Making Call Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryMakingCallTypeImpl#getProb <em>Prob</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class EntryMakingCallTypeImpl extends MakingCallTypeImpl implements EntryMakingCallType {

    /**
     * The default value of the '{@link #getProb() <em>Prob</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getProb()
     * @generated
     * @ordered
     */
    protected static final Object PROB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getProb()
     * @generated
     * @ordered
     */
    protected Object prob = PROB_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EntryMakingCallTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.ENTRY_MAKING_CALL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getProb() {
        return this.prob;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProb(final Object newProb) {
        final Object oldProb = this.prob;
        this.prob = newProb;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.ENTRY_MAKING_CALL_TYPE__PROB, oldProb,
                    this.prob));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case lqnPackage.ENTRY_MAKING_CALL_TYPE__PROB:
            return this.getProb();
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
        case lqnPackage.ENTRY_MAKING_CALL_TYPE__PROB:
            this.setProb(newValue);
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
        case lqnPackage.ENTRY_MAKING_CALL_TYPE__PROB:
            this.setProb(PROB_EDEFAULT);
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
        case lqnPackage.ENTRY_MAKING_CALL_TYPE__PROB:
            return PROB_EDEFAULT == null ? this.prob != null : !PROB_EDEFAULT.equals(this.prob);
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
        result.append(" (prob: ");
        result.append(this.prob);
        result.append(')');
        return result.toString();
    }

} // EntryMakingCallTypeImpl
