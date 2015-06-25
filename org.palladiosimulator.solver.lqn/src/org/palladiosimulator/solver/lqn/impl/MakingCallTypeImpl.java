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
import org.palladiosimulator.solver.lqn.MakingCallType;
import org.palladiosimulator.solver.lqn.OutputResultType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Making Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl#getResultCall <em>Result Call
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl#getDest <em>Dest</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl#getFanin <em>Fanin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl#getFanout <em>Fanout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MakingCallTypeImpl extends EObjectImpl implements MakingCallType {

    /**
     * The cached value of the '{@link #getResultCall() <em>Result Call</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultCall()
     * @generated
     * @ordered
     */
    protected EList<OutputResultType> resultCall;

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
    protected MakingCallTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.MAKING_CALL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultType> getResultCall() {
        if (this.resultCall == null)
        {
            this.resultCall = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
                    LqnPackage.MAKING_CALL_TYPE__RESULT_CALL);
        }
        return this.resultCall;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MAKING_CALL_TYPE__DEST, oldDest,
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MAKING_CALL_TYPE__FANIN, oldFanin,
                    this.fanin,
                    !oldFaninESet));
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
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MAKING_CALL_TYPE__FANIN, oldFanin,
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.MAKING_CALL_TYPE__FANOUT, oldFanout,
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
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.MAKING_CALL_TYPE__FANOUT,
                    oldFanout,
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
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case LqnPackage.MAKING_CALL_TYPE__RESULT_CALL:
            return ((InternalEList<?>) this.getResultCall()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.MAKING_CALL_TYPE__RESULT_CALL:
            return this.getResultCall();
        case LqnPackage.MAKING_CALL_TYPE__DEST:
            return this.getDest();
        case LqnPackage.MAKING_CALL_TYPE__FANIN:
            return this.getFanin();
        case LqnPackage.MAKING_CALL_TYPE__FANOUT:
            return this.getFanout();
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
        case LqnPackage.MAKING_CALL_TYPE__RESULT_CALL:
            this.getResultCall().clear();
            this.getResultCall().addAll((Collection<? extends OutputResultType>) newValue);
            return;
        case LqnPackage.MAKING_CALL_TYPE__DEST:
            this.setDest((String) newValue);
            return;
        case LqnPackage.MAKING_CALL_TYPE__FANIN:
            this.setFanin((Integer) newValue);
            return;
        case LqnPackage.MAKING_CALL_TYPE__FANOUT:
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
        switch (featureID)
        {
        case LqnPackage.MAKING_CALL_TYPE__RESULT_CALL:
            this.getResultCall().clear();
            return;
        case LqnPackage.MAKING_CALL_TYPE__DEST:
            this.setDest(DEST_EDEFAULT);
            return;
        case LqnPackage.MAKING_CALL_TYPE__FANIN:
            this.unsetFanin();
            return;
        case LqnPackage.MAKING_CALL_TYPE__FANOUT:
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
        switch (featureID)
        {
        case LqnPackage.MAKING_CALL_TYPE__RESULT_CALL:
            return this.resultCall != null && !this.resultCall.isEmpty();
        case LqnPackage.MAKING_CALL_TYPE__DEST:
            return DEST_EDEFAULT == null ? this.dest != null : !DEST_EDEFAULT.equals(this.dest);
        case LqnPackage.MAKING_CALL_TYPE__FANIN:
            return this.isSetFanin();
        case LqnPackage.MAKING_CALL_TYPE__FANOUT:
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

} // MakingCallTypeImpl
