/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Histogram Bin Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getBegin <em>Begin</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getConf95 <em>Conf95</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getConf99 <em>Conf99</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getEnd <em>End</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getProb <em>Prob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistogramBinTypeImpl extends EObjectImpl implements HistogramBinType {

    /**
     * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected static final Object BEGIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected Object begin = BEGIN_EDEFAULT;

    /**
     * The default value of the '{@link #getConf95() <em>Conf95</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConf95()
     * @generated
     * @ordered
     */
    protected static final Object CONF95_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConf95() <em>Conf95</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getConf95()
     * @generated
     * @ordered
     */
    protected Object conf95 = CONF95_EDEFAULT;

    /**
     * The default value of the '{@link #getConf99() <em>Conf99</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConf99()
     * @generated
     * @ordered
     */
    protected static final Object CONF99_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConf99() <em>Conf99</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getConf99()
     * @generated
     * @ordered
     */
    protected Object conf99 = CONF99_EDEFAULT;

    /**
     * The default value of the '{@link #getEnd() <em>End</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected static final Object END_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected Object end = END_EDEFAULT;

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
    protected HistogramBinTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.HISTOGRAM_BIN_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getBegin() {
        return this.begin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBegin(final Object newBegin) {
        final Object oldBegin = this.begin;
        this.begin = newBegin;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN, oldBegin,
                    this.begin));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getConf95() {
        return this.conf95;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConf95(final Object newConf95) {
        final Object oldConf95 = this.conf95;
        this.conf95 = newConf95;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__CONF95, oldConf95,
                    this.conf95));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getConf99() {
        return this.conf99;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConf99(final Object newConf99) {
        final Object oldConf99 = this.conf99;
        this.conf99 = newConf99;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__CONF99, oldConf99,
                    this.conf99));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getEnd() {
        return this.end;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEnd(final Object newEnd) {
        final Object oldEnd = this.end;
        this.end = newEnd;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__END, oldEnd,
                    this.end));
        }
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__PROB, oldProb,
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
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            return this.getBegin();
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            return this.getConf95();
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            return this.getConf99();
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            return this.getEnd();
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
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
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            this.setBegin(newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            this.setConf95(newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            this.setConf99(newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            this.setEnd(newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
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
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            this.setBegin(BEGIN_EDEFAULT);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            this.setConf95(CONF95_EDEFAULT);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            this.setConf99(CONF99_EDEFAULT);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            this.setEnd(END_EDEFAULT);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
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
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            return BEGIN_EDEFAULT == null ? this.begin != null : !BEGIN_EDEFAULT.equals(this.begin);
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            return CONF95_EDEFAULT == null ? this.conf95 != null : !CONF95_EDEFAULT.equals(this.conf95);
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            return CONF99_EDEFAULT == null ? this.conf99 != null : !CONF99_EDEFAULT.equals(this.conf99);
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            return END_EDEFAULT == null ? this.end != null : !END_EDEFAULT.equals(this.end);
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
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
        result.append(" (begin: ");
        result.append(this.begin);
        result.append(", conf95: ");
        result.append(this.conf95);
        result.append(", conf99: ");
        result.append(this.conf99);
        result.append(", end: ");
        result.append(this.end);
        result.append(", prob: ");
        result.append(this.prob);
        result.append(')');
        return result.toString();
    }

} // HistogramBinTypeImpl
