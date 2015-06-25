/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ResultConf95Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Result Conf95 Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl#getJoinVariance
 * <em>Join Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl#getJoinWaiting
 * <em>Join Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl#getWaiting <em>Waiting</em>
 * }</li>
 * </ul>
 *
 * @generated
 */
public class ResultConf95TypeImpl extends EObjectImpl implements ResultConf95Type {

    /**
     * The default value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinVariance()
     * @generated
     * @ordered
     */
    protected static final Object JOIN_VARIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinVariance()
     * @generated
     * @ordered
     */
    protected Object joinVariance = JOIN_VARIANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinWaiting()
     * @generated
     * @ordered
     */
    protected static final Object JOIN_WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getJoinWaiting()
     * @generated
     * @ordered
     */
    protected Object joinWaiting = JOIN_WAITING_EDEFAULT;

    /**
     * The default value of the '{@link #getWaiting() <em>Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaiting()
     * @generated
     * @ordered
     */
    protected static final Object WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaiting() <em>Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaiting()
     * @generated
     * @ordered
     */
    protected Object waiting = WAITING_EDEFAULT;

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
    public Object getJoinVariance() {
        return this.joinVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setJoinVariance(final Object newJoinVariance) {
        final Object oldJoinVariance = this.joinVariance;
        this.joinVariance = newJoinVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE,
                    oldJoinVariance, this.joinVariance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getJoinWaiting() {
        return this.joinWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setJoinWaiting(final Object newJoinWaiting) {
        final Object oldJoinWaiting = this.joinWaiting;
        this.joinWaiting = newJoinWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING,
                    oldJoinWaiting, this.joinWaiting));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getWaiting() {
        return this.waiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWaiting(final Object newWaiting) {
        final Object oldWaiting = this.waiting;
        this.waiting = newWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF95_TYPE__WAITING,
                    oldWaiting, this.waiting));
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            return this.getJoinVariance();
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            return this.getJoinWaiting();
        case LqnPackage.RESULT_CONF95_TYPE__WAITING:
            return this.getWaiting();
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            this.setJoinVariance(newValue);
            return;
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            this.setJoinWaiting(newValue);
            return;
        case LqnPackage.RESULT_CONF95_TYPE__WAITING:
            this.setWaiting(newValue);
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            this.setJoinVariance(JOIN_VARIANCE_EDEFAULT);
            return;
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            this.setJoinWaiting(JOIN_WAITING_EDEFAULT);
            return;
        case LqnPackage.RESULT_CONF95_TYPE__WAITING:
            this.setWaiting(WAITING_EDEFAULT);
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
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_VARIANCE:
            return JOIN_VARIANCE_EDEFAULT == null ? this.joinVariance != null
                    : !JOIN_VARIANCE_EDEFAULT.equals(this.joinVariance);
        case LqnPackage.RESULT_CONF95_TYPE__JOIN_WAITING:
            return JOIN_WAITING_EDEFAULT == null ? this.joinWaiting != null
                    : !JOIN_WAITING_EDEFAULT.equals(this.joinWaiting);
        case LqnPackage.RESULT_CONF95_TYPE__WAITING:
            return WAITING_EDEFAULT == null ? this.waiting != null : !WAITING_EDEFAULT.equals(this.waiting);
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
        result.append(this.joinVariance);
        result.append(", joinWaiting: ");
        result.append(this.joinWaiting);
        result.append(", waiting: ");
        result.append(this.waiting);
        result.append(')');
        return result.toString();
    }

} // ResultConf95TypeImpl
