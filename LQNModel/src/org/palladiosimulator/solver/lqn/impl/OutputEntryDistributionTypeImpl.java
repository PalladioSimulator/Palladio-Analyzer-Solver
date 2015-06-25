/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Output Entry Distribution Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputEntryDistributionTypeImpl#getPhase
 * <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputEntryDistributionTypeImpl extends OutputDistributionTypeImpl implements OutputEntryDistributionType {

    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final BigInteger PHASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected BigInteger phase = PHASE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OutputEntryDistributionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.OUTPUT_ENTRY_DISTRIBUTION_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getPhase() {
        return this.phase;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase(final BigInteger newPhase) {
        final BigInteger oldPhase = this.phase;
        this.phase = newPhase;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE,
                    oldPhase, this.phase));
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
        case lqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE:
            return this.getPhase();
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
        case lqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE:
            this.setPhase((BigInteger) newValue);
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
        case lqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE:
            this.setPhase(PHASE_EDEFAULT);
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
        case lqnPackage.OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE:
            return PHASE_EDEFAULT == null ? this.phase != null : !PHASE_EDEFAULT.equals(this.phase);
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
        result.append(" (phase: ");
        result.append(this.phase);
        result.append(')');
        return result.toString();
    }

} // OutputEntryDistributionTypeImpl
