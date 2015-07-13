/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.FanInType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fan In Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.FanInTypeImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.FanInTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FanInTypeImpl extends MinimalEObjectImpl.Container implements FanInType {
    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

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
    protected FanInTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.FAN_IN_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getSource() {
        return this.source;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSource(final String newSource) {
        final String oldSource = this.source;
        this.source = newSource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.FAN_IN_TYPE__SOURCE, oldSource,
                    this.source));
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.FAN_IN_TYPE__VALUE, oldValue,
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
        case LqnPackage.FAN_IN_TYPE__SOURCE:
            return this.getSource();
        case LqnPackage.FAN_IN_TYPE__VALUE:
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
        case LqnPackage.FAN_IN_TYPE__SOURCE:
            this.setSource((String) newValue);
            return;
        case LqnPackage.FAN_IN_TYPE__VALUE:
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
        case LqnPackage.FAN_IN_TYPE__SOURCE:
            this.setSource(SOURCE_EDEFAULT);
            return;
        case LqnPackage.FAN_IN_TYPE__VALUE:
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
        case LqnPackage.FAN_IN_TYPE__SOURCE:
            return SOURCE_EDEFAULT == null ? this.source != null : !SOURCE_EDEFAULT.equals(this.source);
        case LqnPackage.FAN_IN_TYPE__VALUE:
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
        result.append(" (source: ");
        result.append(this.source);
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

} // FanInTypeImpl
