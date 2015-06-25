/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.resourcemodel.ContentionResource;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Contention Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.ContentionResourceImpl#getNumReplicas
 * <em>Num Replicas</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentionResourceImpl extends ResourceImpl implements ContentionResource {

    /**
     * The default value of the '{@link #getNumReplicas() <em>Num Replicas</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumReplicas()
     * @generated
     * @ordered
     */
    protected static final int NUM_REPLICAS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumReplicas() <em>Num Replicas</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumReplicas()
     * @generated
     * @ordered
     */
    protected int numReplicas = NUM_REPLICAS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ContentionResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.CONTENTION_RESOURCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getNumReplicas() {
        return this.numReplicas;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumReplicas(final int newNumReplicas) {
        final int oldNumReplicas = this.numReplicas;
        this.numReplicas = newNumReplicas;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ResourceModelPackage.CONTENTION_RESOURCE__NUM_REPLICAS, oldNumReplicas, this.numReplicas));
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
        case ResourceModelPackage.CONTENTION_RESOURCE__NUM_REPLICAS:
            return new Integer(this.getNumReplicas());
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
        case ResourceModelPackage.CONTENTION_RESOURCE__NUM_REPLICAS:
            this.setNumReplicas(((Integer) newValue).intValue());
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
        case ResourceModelPackage.CONTENTION_RESOURCE__NUM_REPLICAS:
            this.setNumReplicas(NUM_REPLICAS_EDEFAULT);
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
        case ResourceModelPackage.CONTENTION_RESOURCE__NUM_REPLICAS:
            return this.numReplicas != NUM_REPLICAS_EDEFAULT;
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
        result.append(" (numReplicas: ");
        result.append(this.numReplicas);
        result.append(')');
        return result.toString();
    }

} // ContentionResourceImpl
