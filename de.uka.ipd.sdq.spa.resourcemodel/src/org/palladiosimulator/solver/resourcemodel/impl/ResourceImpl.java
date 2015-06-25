/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.resourcemodel.Resource;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.ResourceImpl#getName <em>Name</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.ResourceImpl#getNumberOfServers
 * <em>Number Of Servers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends EObjectImpl implements Resource {

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = "";

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
     * The default value of the '{@link #getNumberOfServers() <em>Number Of Servers</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumberOfServers()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_SERVERS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumberOfServers() <em>Number Of Servers</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumberOfServers()
     * @generated
     * @ordered
     */
    protected int numberOfServers = NUMBER_OF_SERVERS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.RESOURCE;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, ResourceModelPackage.RESOURCE__NAME, oldName,
                    this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getNumberOfServers() {
        return this.numberOfServers;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumberOfServers(final int newNumberOfServers) {
        final int oldNumberOfServers = this.numberOfServers;
        this.numberOfServers = newNumberOfServers;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ResourceModelPackage.RESOURCE__NUMBER_OF_SERVERS,
                    oldNumberOfServers, this.numberOfServers));
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
        case ResourceModelPackage.RESOURCE__NAME:
            return this.getName();
        case ResourceModelPackage.RESOURCE__NUMBER_OF_SERVERS:
            return new Integer(this.getNumberOfServers());
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
        case ResourceModelPackage.RESOURCE__NAME:
            this.setName((String) newValue);
            return;
        case ResourceModelPackage.RESOURCE__NUMBER_OF_SERVERS:
            this.setNumberOfServers(((Integer) newValue).intValue());
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
        case ResourceModelPackage.RESOURCE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case ResourceModelPackage.RESOURCE__NUMBER_OF_SERVERS:
            this.setNumberOfServers(NUMBER_OF_SERVERS_EDEFAULT);
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
        case ResourceModelPackage.RESOURCE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case ResourceModelPackage.RESOURCE__NUMBER_OF_SERVERS:
            return this.numberOfServers != NUMBER_OF_SERVERS_EDEFAULT;
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
        result.append(" (name: ");
        result.append(this.name);
        result.append(", numberOfServers: ");
        result.append(this.numberOfServers);
        result.append(')');
        return result.toString();
    }

} // ResourceImpl
