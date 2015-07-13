/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ResultConf95Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Result Conf95 Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl#getJoinVariance <em>Join
 * Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl#getJoinWaiting <em>Join
 * Waiting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultConf95TypeImpl extends MinimalEObjectImpl.Container implements ResultConf95Type {
    /**
     * The default value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinVariance()
     * @generated
     * @ordered
     */
    protected static final double JOIN_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinVariance()
     * @generated
     * @ordered
     */
    protected double joinVariance = JOIN_VARIANCE_EDEFAULT;

    /**
     * This is true if the Join Variance attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean joinVarianceESet;

    /**
     * The default value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinWaiting()
     * @generated
     * @ordered
     */
    protected static final double JOIN_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinWaiting()
     * @generated
     * @ordered
     */
    protected double joinWaiting = JOIN_WAITING_EDEFAULT;

    /**
     * This is true if the Join Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean joinWaitingESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResultConf95TypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.RESULT_CONF95_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getJoinVariance() {
        return this.joinVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setJoinVariance(final double newJoinVariance) {
        final double oldJoinVariance = this.joinVariance;
        this.joinVariance = newJoinVariance;
        final boolean oldJoinVarianceESet = this.joinVarianceESet;
        this.joinVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE,
                    oldJoinVariance, this.joinVariance, !oldJoinVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetJoinVariance() {
        final double oldJoinVariance = this.joinVariance;
        final boolean oldJoinVarianceESet = this.joinVarianceESet;
        this.joinVariance = JOIN_VARIANCE_EDEFAULT;
        this.joinVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE,
                    oldJoinVariance, JOIN_VARIANCE_EDEFAULT, oldJoinVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetJoinVariance() {
        return this.joinVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getJoinWaiting() {
        return this.joinWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setJoinWaiting(final double newJoinWaiting) {
        final double oldJoinWaiting = this.joinWaiting;
        this.joinWaiting = newJoinWaiting;
        final boolean oldJoinWaitingESet = this.joinWaitingESet;
        this.joinWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING,
                    oldJoinWaiting, this.joinWaiting, !oldJoinWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetJoinWaiting() {
        final double oldJoinWaiting = this.joinWaiting;
        final boolean oldJoinWaitingESet = this.joinWaitingESet;
        this.joinWaiting = JOIN_WAITING_EDEFAULT;
        this.joinWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING,
                    oldJoinWaiting, JOIN_WAITING_EDEFAULT, oldJoinWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetJoinWaiting() {
        return this.joinWaitingESet;
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            return this.getJoinVariance();
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            return this.getJoinWaiting();
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            this.setJoinVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            this.setJoinWaiting((Double) newValue);
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            this.unsetJoinVariance();
            return;
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            this.unsetJoinWaiting();
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            return this.isSetJoinVariance();
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            return this.isSetJoinWaiting();
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
        result.append(" (joinVariance: ");
        if (this.joinVarianceESet) {
            result.append(this.joinVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", joinWaiting: ");
        if (this.joinWaitingESet) {
            result.append(this.joinWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // ResultConf95TypeImpl
