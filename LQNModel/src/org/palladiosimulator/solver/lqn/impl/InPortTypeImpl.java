/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>In Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.InPortTypeImpl#getConnectFrom
 * <em>Connect From</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.InPortTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.InPortTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InPortTypeImpl extends EObjectImpl implements InPortType {

    /**
     * The default value of the '{@link #getConnectFrom() <em>Connect From</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConnectFrom()
     * @generated
     * @ordered
     */
    protected static final List<String> CONNECT_FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectFrom() <em>Connect From</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConnectFrom()
     * @generated
     * @ordered
     */
    protected List<String> connectFrom = CONNECT_FROM_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InPortTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.IN_PORT_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<String> getConnectFrom() {
        return this.connectFrom;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConnectFrom(final List<String> newConnectFrom) {
        final List<String> oldConnectFrom = this.connectFrom;
        this.connectFrom = newConnectFrom;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.IN_PORT_TYPE__CONNECT_FROM,
                    oldConnectFrom, this.connectFrom));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(final String newDescription) {
        final String oldDescription = this.description;
        this.description = newDescription;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.IN_PORT_TYPE__DESCRIPTION,
                    oldDescription, this.description));
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
            this.eNotify(
                    new ENotificationImpl(this, Notification.SET, lqnPackage.IN_PORT_TYPE__NAME, oldName, this.name));
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
        case lqnPackage.IN_PORT_TYPE__CONNECT_FROM:
            return this.getConnectFrom();
        case lqnPackage.IN_PORT_TYPE__DESCRIPTION:
            return this.getDescription();
        case lqnPackage.IN_PORT_TYPE__NAME:
            return this.getName();
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
        case lqnPackage.IN_PORT_TYPE__CONNECT_FROM:
            this.setConnectFrom((List<String>) newValue);
            return;
        case lqnPackage.IN_PORT_TYPE__DESCRIPTION:
            this.setDescription((String) newValue);
            return;
        case lqnPackage.IN_PORT_TYPE__NAME:
            this.setName((String) newValue);
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
        case lqnPackage.IN_PORT_TYPE__CONNECT_FROM:
            this.setConnectFrom(CONNECT_FROM_EDEFAULT);
            return;
        case lqnPackage.IN_PORT_TYPE__DESCRIPTION:
            this.setDescription(DESCRIPTION_EDEFAULT);
            return;
        case lqnPackage.IN_PORT_TYPE__NAME:
            this.setName(NAME_EDEFAULT);
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
        case lqnPackage.IN_PORT_TYPE__CONNECT_FROM:
            return CONNECT_FROM_EDEFAULT == null ? this.connectFrom != null
                    : !CONNECT_FROM_EDEFAULT.equals(this.connectFrom);
        case lqnPackage.IN_PORT_TYPE__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? this.description != null
                    : !DESCRIPTION_EDEFAULT.equals(this.description);
        case lqnPackage.IN_PORT_TYPE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
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
        result.append(" (connectFrom: ");
        result.append(this.connectFrom);
        result.append(", description: ");
        result.append(this.description);
        result.append(", name: ");
        result.append(this.name);
        result.append(')');
        return result.toString();
    }

} // InPortTypeImpl
