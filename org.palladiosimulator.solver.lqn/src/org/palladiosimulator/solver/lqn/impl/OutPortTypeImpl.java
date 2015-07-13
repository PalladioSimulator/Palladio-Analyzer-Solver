/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutPortType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Out Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl#getConnectTo <em>Connect To
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl#getDescription <em>Description
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutPortTypeImpl extends MinimalEObjectImpl.Container implements OutPortType {
    /**
     * The default value of the '{@link #getConnectTo() <em>Connect To</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConnectTo()
     * @generated
     * @ordered
     */
    protected static final List<String> CONNECT_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectTo() <em>Connect To</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConnectTo()
     * @generated
     * @ordered
     */
    protected List<String> connectTo = CONNECT_TO_EDEFAULT;

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
    protected OutPortTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.OUT_PORT_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<String> getConnectTo() {
        return this.connectTo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConnectTo(final List<String> newConnectTo) {
        final List<String> oldConnectTo = this.connectTo;
        this.connectTo = newConnectTo;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUT_PORT_TYPE__CONNECT_TO,
                    oldConnectTo,
                    this.connectTo));
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUT_PORT_TYPE__DESCRIPTION,
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUT_PORT_TYPE__NAME, oldName,
                    this.name));
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
        case LqnPackage.OUT_PORT_TYPE__CONNECT_TO:
            return this.getConnectTo();
        case LqnPackage.OUT_PORT_TYPE__DESCRIPTION:
            return this.getDescription();
        case LqnPackage.OUT_PORT_TYPE__NAME:
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
        switch (featureID)
        {
        case LqnPackage.OUT_PORT_TYPE__CONNECT_TO:
            this.setConnectTo((List<String>) newValue);
            return;
        case LqnPackage.OUT_PORT_TYPE__DESCRIPTION:
            this.setDescription((String) newValue);
            return;
        case LqnPackage.OUT_PORT_TYPE__NAME:
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
        switch (featureID)
        {
        case LqnPackage.OUT_PORT_TYPE__CONNECT_TO:
            this.setConnectTo(CONNECT_TO_EDEFAULT);
            return;
        case LqnPackage.OUT_PORT_TYPE__DESCRIPTION:
            this.setDescription(DESCRIPTION_EDEFAULT);
            return;
        case LqnPackage.OUT_PORT_TYPE__NAME:
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
        switch (featureID)
        {
        case LqnPackage.OUT_PORT_TYPE__CONNECT_TO:
            return CONNECT_TO_EDEFAULT == null ? this.connectTo != null : !CONNECT_TO_EDEFAULT.equals(this.connectTo);
        case LqnPackage.OUT_PORT_TYPE__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT
                    .equals(this.description);
        case LqnPackage.OUT_PORT_TYPE__NAME:
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
        result.append(" (connectTo: ");
        result.append(this.connectTo);
        result.append(", description: ");
        result.append(this.description);
        result.append(", name: ");
        result.append(this.name);
        result.append(')');
        return result.toString();
    }

} // OutPortTypeImpl
