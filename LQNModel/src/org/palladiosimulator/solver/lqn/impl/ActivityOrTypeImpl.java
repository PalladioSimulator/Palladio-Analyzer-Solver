/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.lqn.ActivityOrType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Or Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityOrTypeImpl#getProb <em>Prob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityOrTypeImpl extends ActivityTypeImpl implements ActivityOrType {

    /**
     * The default value of the '{@link #getProb() <em>Prob</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getProb()
     * @generated
     * @ordered
     */
    protected static final String PROB_EDEFAULT = "1";

    /**
     * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getProb()
     * @generated
     * @ordered
     */
    protected String prob = PROB_EDEFAULT;

    /**
     * This is true if the Prob attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean probESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityOrTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.ACTIVITY_OR_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getProb() {
        return this.prob;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProb(final String newProb) {
        final String oldProb = this.prob;
        this.prob = newProb;
        final boolean oldProbESet = this.probESet;
        this.probESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.ACTIVITY_OR_TYPE__PROB, oldProb,
                    this.prob, !oldProbESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetProb() {
        final String oldProb = this.prob;
        final boolean oldProbESet = this.probESet;
        this.prob = PROB_EDEFAULT;
        this.probESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, lqnPackage.ACTIVITY_OR_TYPE__PROB, oldProb,
                    PROB_EDEFAULT, oldProbESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetProb() {
        return this.probESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case lqnPackage.ACTIVITY_OR_TYPE__PROB:
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
        case lqnPackage.ACTIVITY_OR_TYPE__PROB:
            this.setProb((String) newValue);
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
        case lqnPackage.ACTIVITY_OR_TYPE__PROB:
            this.unsetProb();
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
        case lqnPackage.ACTIVITY_OR_TYPE__PROB:
            return this.isSetProb();
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
        if (this.probESet) {
            result.append(this.prob);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // ActivityOrTypeImpl
