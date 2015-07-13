/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.FanOutType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fan Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.FanOutTypeImpl#getDest <em>Dest</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.FanOutTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FanOutTypeImpl extends MinimalEObjectImpl.Container implements FanOutType {
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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final BigInteger VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected BigInteger value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FanOutTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.FAN_OUT_TYPE;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.FAN_OUT_TYPE__DEST, oldDest,
                    this.dest));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValue(final BigInteger newValue) {
        final BigInteger oldValue = this.value;
        this.value = newValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.FAN_OUT_TYPE__VALUE, oldValue,
                    this.value));
        }
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
        case LqnPackage.FAN_OUT_TYPE__DEST:
            return this.getDest();
        case LqnPackage.FAN_OUT_TYPE__VALUE:
            return this.getValue();
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
        case LqnPackage.FAN_OUT_TYPE__DEST:
            this.setDest((String) newValue);
            return;
        case LqnPackage.FAN_OUT_TYPE__VALUE:
            this.setValue((BigInteger) newValue);
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
        case LqnPackage.FAN_OUT_TYPE__DEST:
            this.setDest(DEST_EDEFAULT);
            return;
        case LqnPackage.FAN_OUT_TYPE__VALUE:
            this.setValue(VALUE_EDEFAULT);
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
        case LqnPackage.FAN_OUT_TYPE__DEST:
            return DEST_EDEFAULT == null ? this.dest != null : !DEST_EDEFAULT.equals(this.dest);
        case LqnPackage.FAN_OUT_TYPE__VALUE:
            return VALUE_EDEFAULT == null ? this.value != null : !VALUE_EDEFAULT.equals(this.value);
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
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

} // FanOutTypeImpl
