/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Histogram Bin Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getBegin <em>Begin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getConf95 <em>Conf95</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getConf99 <em>Conf99</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getEnd <em>End</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistogramBinTypeImpl extends MinimalEObjectImpl.Container implements HistogramBinType {
    /**
     * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected static final double BEGIN_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected double begin = BEGIN_EDEFAULT;

    /**
     * This is true if the Begin attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean beginESet;

    /**
     * The default value of the '{@link #getConf95() <em>Conf95</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConf95()
     * @generated
     * @ordered
     */
    protected static final double CONF95_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getConf95() <em>Conf95</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getConf95()
     * @generated
     * @ordered
     */
    protected double conf95 = CONF95_EDEFAULT;

    /**
     * This is true if the Conf95 attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean conf95ESet;

    /**
     * The default value of the '{@link #getConf99() <em>Conf99</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConf99()
     * @generated
     * @ordered
     */
    protected static final double CONF99_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getConf99() <em>Conf99</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getConf99()
     * @generated
     * @ordered
     */
    protected double conf99 = CONF99_EDEFAULT;

    /**
     * This is true if the Conf99 attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean conf99ESet;

    /**
     * The default value of the '{@link #getEnd() <em>End</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected static final double END_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected double end = END_EDEFAULT;

    /**
     * This is true if the End attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean endESet;

    /**
     * The default value of the '{@link #getProb() <em>Prob</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getProb()
     * @generated
     * @ordered
     */
    protected static final double PROB_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getProb()
     * @generated
     * @ordered
     */
    protected double prob = PROB_EDEFAULT;

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
    public double getBegin() {
        return this.begin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBegin(final double newBegin) {
        final double oldBegin = this.begin;
        this.begin = newBegin;
        final boolean oldBeginESet = this.beginESet;
        this.beginESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN, oldBegin,
                    this.begin, !oldBeginESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetBegin() {
        final double oldBegin = this.begin;
        final boolean oldBeginESet = this.beginESet;
        this.begin = BEGIN_EDEFAULT;
        this.beginESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN,
                    oldBegin,
                    BEGIN_EDEFAULT, oldBeginESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetBegin() {
        return this.beginESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getConf95() {
        return this.conf95;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConf95(final double newConf95) {
        final double oldConf95 = this.conf95;
        this.conf95 = newConf95;
        final boolean oldConf95ESet = this.conf95ESet;
        this.conf95ESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__CONF95,
                    oldConf95,
                    this.conf95, !oldConf95ESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetConf95() {
        final double oldConf95 = this.conf95;
        final boolean oldConf95ESet = this.conf95ESet;
        this.conf95 = CONF95_EDEFAULT;
        this.conf95ESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.HISTOGRAM_BIN_TYPE__CONF95,
                    oldConf95,
                    CONF95_EDEFAULT, oldConf95ESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetConf95() {
        return this.conf95ESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getConf99() {
        return this.conf99;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConf99(final double newConf99) {
        final double oldConf99 = this.conf99;
        this.conf99 = newConf99;
        final boolean oldConf99ESet = this.conf99ESet;
        this.conf99ESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__CONF99,
                    oldConf99,
                    this.conf99, !oldConf99ESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetConf99() {
        final double oldConf99 = this.conf99;
        final boolean oldConf99ESet = this.conf99ESet;
        this.conf99 = CONF99_EDEFAULT;
        this.conf99ESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.HISTOGRAM_BIN_TYPE__CONF99,
                    oldConf99,
                    CONF99_EDEFAULT, oldConf99ESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetConf99() {
        return this.conf99ESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getEnd() {
        return this.end;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEnd(final double newEnd) {
        final double oldEnd = this.end;
        this.end = newEnd;
        final boolean oldEndESet = this.endESet;
        this.endESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__END, oldEnd,
                    this.end,
                    !oldEndESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetEnd() {
        final double oldEnd = this.end;
        final boolean oldEndESet = this.endESet;
        this.end = END_EDEFAULT;
        this.endESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.HISTOGRAM_BIN_TYPE__END, oldEnd,
                    END_EDEFAULT, oldEndESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetEnd() {
        return this.endESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProb() {
        return this.prob;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProb(final double newProb) {
        final double oldProb = this.prob;
        this.prob = newProb;
        final boolean oldProbESet = this.probESet;
        this.probESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.HISTOGRAM_BIN_TYPE__PROB, oldProb,
                    this.prob,
                    !oldProbESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetProb() {
        final double oldProb = this.prob;
        final boolean oldProbESet = this.probESet;
        this.prob = PROB_EDEFAULT;
        this.probESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.HISTOGRAM_BIN_TYPE__PROB, oldProb,
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
        switch (featureID)
        {
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
        switch (featureID)
        {
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            this.setBegin((Double) newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            this.setConf95((Double) newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            this.setConf99((Double) newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            this.setEnd((Double) newValue);
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
            this.setProb((Double) newValue);
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
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            this.unsetBegin();
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            this.unsetConf95();
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            this.unsetConf99();
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            this.unsetEnd();
            return;
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
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
        switch (featureID)
        {
        case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
            return this.isSetBegin();
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
            return this.isSetConf95();
        case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
            return this.isSetConf99();
        case LqnPackage.HISTOGRAM_BIN_TYPE__END:
            return this.isSetEnd();
        case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
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
        result.append(" (begin: ");
        if (this.beginESet) {
            result.append(this.begin);
        } else {
            result.append("<unset>");
        }
        result.append(", conf95: ");
        if (this.conf95ESet) {
            result.append(this.conf95);
        } else {
            result.append("<unset>");
        }
        result.append(", conf99: ");
        if (this.conf99ESet) {
            result.append(this.conf99);
        } else {
            result.append("<unset>");
        }
        result.append(", end: ");
        if (this.endESet) {
            result.append(this.end);
        } else {
            result.append("<unset>");
        }
        result.append(", prob: ");
        if (this.probESet) {
            result.append(this.prob);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // HistogramBinTypeImpl
