/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.SynchCallType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Synch Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl#getDest <em>Dest</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl#getFanin <em>Fanin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl#getFanout <em>Fanout</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class SynchCallTypeImpl extends EObjectImpl implements SynchCallType {

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
     * The default value of the '{@link #getFanin() <em>Fanin</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getFanin()
     * @generated
     * @ordered
     */
    protected static final int FANIN_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFanin() <em>Fanin</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getFanin()
     * @generated
     * @ordered
     */
    protected int fanin = FANIN_EDEFAULT;

    /**
     * This is true if the Fanin attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean faninESet;

    /**
     * The default value of the '{@link #getFanout() <em>Fanout</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFanout()
     * @generated
     * @ordered
     */
    protected static final int FANOUT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFanout() <em>Fanout</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getFanout()
     * @generated
     * @ordered
     */
    protected int fanout = FANOUT_EDEFAULT;

    /**
     * This is true if the Fanout attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean fanoutESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SynchCallTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.SYNCH_CALL_TYPE;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.SYNCH_CALL_TYPE__DEST, oldDest,
                    this.dest));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getFanin() {
        return this.fanin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFanin(final int newFanin) {
        final int oldFanin = this.fanin;
        this.fanin = newFanin;
        final boolean oldFaninESet = this.faninESet;
        this.faninESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.SYNCH_CALL_TYPE__FANIN, oldFanin,
                    this.fanin, !oldFaninESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetFanin() {
        final int oldFanin = this.fanin;
        final boolean oldFaninESet = this.faninESet;
        this.fanin = FANIN_EDEFAULT;
        this.faninESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, lqnPackage.SYNCH_CALL_TYPE__FANIN, oldFanin,
                    FANIN_EDEFAULT, oldFaninESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetFanin() {
        return this.faninESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getFanout() {
        return this.fanout;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFanout(final int newFanout) {
        final int oldFanout = this.fanout;
        this.fanout = newFanout;
        final boolean oldFanoutESet = this.fanoutESet;
        this.fanoutESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.SYNCH_CALL_TYPE__FANOUT, oldFanout,
                    this.fanout, !oldFanoutESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetFanout() {
        final int oldFanout = this.fanout;
        final boolean oldFanoutESet = this.fanoutESet;
        this.fanout = FANOUT_EDEFAULT;
        this.fanoutESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, lqnPackage.SYNCH_CALL_TYPE__FANOUT, oldFanout,
                    FANOUT_EDEFAULT, oldFanoutESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetFanout() {
        return this.fanoutESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case lqnPackage.SYNCH_CALL_TYPE__DEST:
            return this.getDest();
        case lqnPackage.SYNCH_CALL_TYPE__FANIN:
            return this.getFanin();
        case lqnPackage.SYNCH_CALL_TYPE__FANOUT:
            return this.getFanout();
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
        case lqnPackage.SYNCH_CALL_TYPE__DEST:
            this.setDest((String) newValue);
            return;
        case lqnPackage.SYNCH_CALL_TYPE__FANIN:
            this.setFanin((Integer) newValue);
            return;
        case lqnPackage.SYNCH_CALL_TYPE__FANOUT:
            this.setFanout((Integer) newValue);
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
        case lqnPackage.SYNCH_CALL_TYPE__DEST:
            this.setDest(DEST_EDEFAULT);
            return;
        case lqnPackage.SYNCH_CALL_TYPE__FANIN:
            this.unsetFanin();
            return;
        case lqnPackage.SYNCH_CALL_TYPE__FANOUT:
            this.unsetFanout();
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
        case lqnPackage.SYNCH_CALL_TYPE__DEST:
            return DEST_EDEFAULT == null ? this.dest != null : !DEST_EDEFAULT.equals(this.dest);
        case lqnPackage.SYNCH_CALL_TYPE__FANIN:
            return this.isSetFanin();
        case lqnPackage.SYNCH_CALL_TYPE__FANOUT:
            return this.isSetFanout();
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
        result.append(", fanin: ");
        if (this.faninESet) {
            result.append(this.fanin);
        } else {
            result.append("<unset>");
        }
        result.append(", fanout: ");
        if (this.fanoutESet) {
            result.append(this.fanout);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // SynchCallTypeImpl
