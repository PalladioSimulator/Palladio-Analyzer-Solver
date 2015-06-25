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
import org.palladiosimulator.solver.lqn.ActivityDefBase;
import org.palladiosimulator.solver.lqn.CallOrderType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultForwardingANDJoinDelay;
import org.palladiosimulator.solver.lqn.OutputResultType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Def Base</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getResultJoinDelay
 * <em>Result Join Delay</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getResultForwarding
 * <em>Result Forwarding</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getServiceTimeDistribution
 * <em>Service Time Distribution</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getResultActivity
 * <em>Result Activity</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getCallOrder
 * <em>Call Order</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getHostDemandCvsq
 * <em>Host Demand Cvsq</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getHostDemandMean
 * <em>Host Demand Mean</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getMaxServiceTime
 * <em>Max Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl#getThinkTime
 * <em>Think Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDefBaseImpl extends EObjectImpl implements ActivityDefBase {

    /**
     * The cached value of the '{@link #getResultJoinDelay() <em>Result Join Delay</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultJoinDelay()
     * @generated
     * @ordered
     */
    protected EList<OutputResultForwardingANDJoinDelay> resultJoinDelay;

    /**
     * The cached value of the '{@link #getResultForwarding() <em>Result Forwarding</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultForwarding()
     * @generated
     * @ordered
     */
    protected EList<OutputResultForwardingANDJoinDelay> resultForwarding;

    /**
     * The cached value of the '{@link #getServiceTimeDistribution()
     * <em>Service Time Distribution</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getServiceTimeDistribution()
     * @generated
     * @ordered
     */
    protected EList<OutputDistributionType> serviceTimeDistribution;

    /**
     * The cached value of the '{@link #getResultActivity() <em>Result Activity</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultActivity()
     * @generated
     * @ordered
     */
    protected EList<OutputResultType> resultActivity;

    /**
     * The default value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCallOrder()
     * @generated
     * @ordered
     */
    protected static final CallOrderType CALL_ORDER_EDEFAULT = CallOrderType.STOCHASTIC;

    /**
     * The cached value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCallOrder()
     * @generated
     * @ordered
     */
    protected CallOrderType callOrder = CALL_ORDER_EDEFAULT;

    /**
     * This is true if the Call Order attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean callOrderESet;

    /**
     * The default value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHostDemandCvsq()
     * @generated
     * @ordered
     */
    protected static final Object HOST_DEMAND_CVSQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHostDemandCvsq()
     * @generated
     * @ordered
     */
    protected Object hostDemandCvsq = HOST_DEMAND_CVSQ_EDEFAULT;

    /**
     * The default value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHostDemandMean()
     * @generated
     * @ordered
     */
    protected static final Object HOST_DEMAND_MEAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHostDemandMean()
     * @generated
     * @ordered
     */
    protected Object hostDemandMean = HOST_DEMAND_MEAN_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaxServiceTime()
     * @generated
     * @ordered
     */
    protected static final Object MAX_SERVICE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaxServiceTime()
     * @generated
     * @ordered
     */
    protected Object maxServiceTime = MAX_SERVICE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThinkTime()
     * @generated
     * @ordered
     */
    protected static final Object THINK_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThinkTime()
     * @generated
     * @ordered
     */
    protected Object thinkTime = THINK_TIME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityDefBaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.ACTIVITY_DEF_BASE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultForwardingANDJoinDelay> getResultJoinDelay() {
        if (this.resultJoinDelay == null) {
            this.resultJoinDelay = new EObjectContainmentEList<OutputResultForwardingANDJoinDelay>(
                    OutputResultForwardingANDJoinDelay.class, this, LqnPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY);
        }
        return this.resultJoinDelay;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultForwardingANDJoinDelay> getResultForwarding() {
        if (this.resultForwarding == null) {
            this.resultForwarding = new EObjectContainmentEList<OutputResultForwardingANDJoinDelay>(
                    OutputResultForwardingANDJoinDelay.class, this, LqnPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING);
        }
        return this.resultForwarding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputDistributionType> getServiceTimeDistribution() {
        if (this.serviceTimeDistribution == null) {
            this.serviceTimeDistribution = new EObjectContainmentEList<OutputDistributionType>(
                    OutputDistributionType.class, this, LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION);
        }
        return this.serviceTimeDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultType> getResultActivity() {
        if (this.resultActivity == null) {
            this.resultActivity = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
                    LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY);
        }
        return this.resultActivity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CallOrderType getCallOrder() {
        return this.callOrder;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCallOrder(final CallOrderType newCallOrder) {
        final CallOrderType oldCallOrder = this.callOrder;
        this.callOrder = newCallOrder == null ? CALL_ORDER_EDEFAULT : newCallOrder;
        final boolean oldCallOrderESet = this.callOrderESet;
        this.callOrderESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER,
                    oldCallOrder, this.callOrder, !oldCallOrderESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetCallOrder() {
        final CallOrderType oldCallOrder = this.callOrder;
        final boolean oldCallOrderESet = this.callOrderESet;
        this.callOrder = CALL_ORDER_EDEFAULT;
        this.callOrderESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER,
                    oldCallOrder, CALL_ORDER_EDEFAULT, oldCallOrderESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetCallOrder() {
        return this.callOrderESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getHostDemandCvsq() {
        return this.hostDemandCvsq;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setHostDemandCvsq(final Object newHostDemandCvsq) {
        final Object oldHostDemandCvsq = this.hostDemandCvsq;
        this.hostDemandCvsq = newHostDemandCvsq;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ,
                    oldHostDemandCvsq, this.hostDemandCvsq));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getHostDemandMean() {
        return this.hostDemandMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setHostDemandMean(final Object newHostDemandMean) {
        final Object oldHostDemandMean = this.hostDemandMean;
        this.hostDemandMean = newHostDemandMean;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN,
                    oldHostDemandMean, this.hostDemandMean));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getMaxServiceTime() {
        return this.maxServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaxServiceTime(final Object newMaxServiceTime) {
        final Object oldMaxServiceTime = this.maxServiceTime;
        this.maxServiceTime = newMaxServiceTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME,
                    oldMaxServiceTime, this.maxServiceTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__NAME, oldName,
                    this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getThinkTime() {
        return this.thinkTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setThinkTime(final Object newThinkTime) {
        final Object oldThinkTime = this.thinkTime;
        this.thinkTime = newThinkTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME,
                    oldThinkTime, this.thinkTime));
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
        switch (featureID) {
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
            return ((InternalEList<?>) this.getResultJoinDelay()).basicRemove(otherEnd, msgs);
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
            return ((InternalEList<?>) this.getResultForwarding()).basicRemove(otherEnd, msgs);
        case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
            return ((InternalEList<?>) this.getServiceTimeDistribution()).basicRemove(otherEnd, msgs);
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
            return ((InternalEList<?>) this.getResultActivity()).basicRemove(otherEnd, msgs);
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
        switch (featureID) {
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
            return this.getResultJoinDelay();
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
            return this.getResultForwarding();
        case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
            return this.getServiceTimeDistribution();
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
            return this.getResultActivity();
        case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
            return this.getCallOrder();
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
            return this.getHostDemandCvsq();
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
            return this.getHostDemandMean();
        case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
            return this.getMaxServiceTime();
        case LqnPackage.ACTIVITY_DEF_BASE__NAME:
            return this.getName();
        case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
            return this.getThinkTime();
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
        switch (featureID) {
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
            this.getResultJoinDelay().clear();
            this.getResultJoinDelay().addAll((Collection<? extends OutputResultForwardingANDJoinDelay>) newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
            this.getResultForwarding().clear();
            this.getResultForwarding().addAll((Collection<? extends OutputResultForwardingANDJoinDelay>) newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
            this.getServiceTimeDistribution().clear();
            this.getServiceTimeDistribution().addAll((Collection<? extends OutputDistributionType>) newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
            this.getResultActivity().clear();
            this.getResultActivity().addAll((Collection<? extends OutputResultType>) newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
            this.setCallOrder((CallOrderType) newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
            this.setHostDemandCvsq(newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
            this.setHostDemandMean(newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
            this.setMaxServiceTime(newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__NAME:
            this.setName((String) newValue);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
            this.setThinkTime(newValue);
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
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
            this.getResultJoinDelay().clear();
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
            this.getResultForwarding().clear();
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
            this.getServiceTimeDistribution().clear();
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
            this.getResultActivity().clear();
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
            this.unsetCallOrder();
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
            this.setHostDemandCvsq(HOST_DEMAND_CVSQ_EDEFAULT);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
            this.setHostDemandMean(HOST_DEMAND_MEAN_EDEFAULT);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
            this.setMaxServiceTime(MAX_SERVICE_TIME_EDEFAULT);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
            this.setThinkTime(THINK_TIME_EDEFAULT);
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
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
            return this.resultJoinDelay != null && !this.resultJoinDelay.isEmpty();
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
            return this.resultForwarding != null && !this.resultForwarding.isEmpty();
        case LqnPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
            return this.serviceTimeDistribution != null && !this.serviceTimeDistribution.isEmpty();
        case LqnPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
            return this.resultActivity != null && !this.resultActivity.isEmpty();
        case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
            return this.isSetCallOrder();
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
            return HOST_DEMAND_CVSQ_EDEFAULT == null ? this.hostDemandCvsq != null
                    : !HOST_DEMAND_CVSQ_EDEFAULT.equals(this.hostDemandCvsq);
        case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
            return HOST_DEMAND_MEAN_EDEFAULT == null ? this.hostDemandMean != null
                    : !HOST_DEMAND_MEAN_EDEFAULT.equals(this.hostDemandMean);
        case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
            return MAX_SERVICE_TIME_EDEFAULT == null ? this.maxServiceTime != null
                    : !MAX_SERVICE_TIME_EDEFAULT.equals(this.maxServiceTime);
        case LqnPackage.ACTIVITY_DEF_BASE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
            return THINK_TIME_EDEFAULT == null ? this.thinkTime != null : !THINK_TIME_EDEFAULT.equals(this.thinkTime);
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
        result.append(" (callOrder: ");
        if (this.callOrderESet) {
            result.append(this.callOrder);
        } else {
            result.append("<unset>");
        }
        result.append(", hostDemandCvsq: ");
        result.append(this.hostDemandCvsq);
        result.append(", hostDemandMean: ");
        result.append(this.hostDemandMean);
        result.append(", maxServiceTime: ");
        result.append(this.maxServiceTime);
        result.append(", name: ");
        result.append(this.name);
        result.append(", thinkTime: ");
        result.append(this.thinkTime);
        result.append(')');
        return result.toString();
    }

} // ActivityDefBaseImpl
