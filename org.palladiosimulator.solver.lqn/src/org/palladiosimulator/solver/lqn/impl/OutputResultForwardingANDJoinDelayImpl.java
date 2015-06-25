/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultForwardingANDJoinDelay;
import org.palladiosimulator.solver.lqn.ResultConf95Type;
import org.palladiosimulator.solver.lqn.ResultConf99Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Output Result Forwarding AND Join Delay</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultForwardingANDJoinDelayImpl#getResultConf95
 * <em>Result Conf95</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultForwardingANDJoinDelayImpl#getResultConf99
 * <em>Result Conf99</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultForwardingANDJoinDelayImpl#getDest
 * <em>Dest</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultForwardingANDJoinDelayImpl#getJoinVariance
 * <em>Join Variance</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultForwardingANDJoinDelayImpl#getJoinWaiting
 * <em>Join Waiting</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultForwardingANDJoinDelayImpl#getWaiting
 * <em>Waiting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputResultForwardingANDJoinDelayImpl extends EObjectImpl implements OutputResultForwardingANDJoinDelay {

    /**
     * The cached value of the '{@link #getResultConf95() <em>Result Conf95</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultConf95()
     * @generated
     * @ordered
     */
    protected EList<ResultConf95Type> resultConf95;

    /**
     * The cached value of the '{@link #getResultConf99() <em>Result Conf99</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultConf99()
     * @generated
     * @ordered
     */
    protected EList<ResultConf99Type> resultConf99;

    /**
     * The default value of the '{@link #getDest() <em>Dest</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getDest()
     * @generated
     * @ordered
     */
    protected static final String DEST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDest() <em>Dest</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDest()
     * @generated
     * @ordered
     */
    protected String dest = DEST_EDEFAULT;

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
    protected OutputResultForwardingANDJoinDelayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ResultConf95Type> getResultConf95() {
        if (this.resultConf95 == null)
        {
            this.resultConf95 = new EObjectContainmentEList<ResultConf95Type>(ResultConf95Type.class, this,
                    LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95);
        }
        return this.resultConf95;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ResultConf99Type> getResultConf99() {
        if (this.resultConf99 == null)
        {
            this.resultConf99 = new EObjectContainmentEList<ResultConf99Type>(ResultConf99Type.class, this,
                    LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99);
        }
        return this.resultConf99;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDest() {
        return this.dest;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDest(final String newDest) {
        final String oldDest = this.dest;
        this.dest = newDest;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST, oldDest, this.dest));
        }
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
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE, oldJoinVariance,
                    this.joinVariance));
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
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING, oldJoinWaiting, this.joinWaiting));
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
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING, oldWaiting, this.waiting));
        }
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
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
            return ((InternalEList<?>) this.getResultConf95()).basicRemove(otherEnd, msgs);
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
            return ((InternalEList<?>) this.getResultConf99()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
            return this.getResultConf95();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
            return this.getResultConf99();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
            return this.getDest();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
            return this.getJoinVariance();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
            return this.getJoinWaiting();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
            return this.getWaiting();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
            this.getResultConf95().clear();
            this.getResultConf95().addAll((Collection<? extends ResultConf95Type>) newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
            this.getResultConf99().clear();
            this.getResultConf99().addAll((Collection<? extends ResultConf99Type>) newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
            this.setDest((String) newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
            this.setJoinVariance(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
            this.setJoinWaiting(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
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
        switch (featureID)
        {
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
            this.getResultConf95().clear();
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
            this.getResultConf99().clear();
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
            this.setDest(DEST_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
            this.setJoinVariance(JOIN_VARIANCE_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
            this.setJoinWaiting(JOIN_WAITING_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
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
        switch (featureID)
        {
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
            return this.resultConf95 != null && !this.resultConf95.isEmpty();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
            return this.resultConf99 != null && !this.resultConf99.isEmpty();
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
            return DEST_EDEFAULT == null ? this.dest != null : !DEST_EDEFAULT.equals(this.dest);
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
            return JOIN_VARIANCE_EDEFAULT == null ? this.joinVariance != null : !JOIN_VARIANCE_EDEFAULT
                    .equals(this.joinVariance);
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
            return JOIN_WAITING_EDEFAULT == null ? this.joinWaiting != null : !JOIN_WAITING_EDEFAULT
                    .equals(this.joinWaiting);
        case LqnPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
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
        result.append(" (dest: ");
        result.append(this.dest);
        result.append(", joinVariance: ");
        result.append(this.joinVariance);
        result.append(", joinWaiting: ");
        result.append(this.joinWaiting);
        result.append(", waiting: ");
        result.append(this.waiting);
        result.append(')');
        return result.toString();
    }

} // OutputResultForwardingANDJoinDelayImpl
