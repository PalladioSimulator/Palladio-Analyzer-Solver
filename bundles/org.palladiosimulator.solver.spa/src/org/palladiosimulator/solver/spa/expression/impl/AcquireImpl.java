/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.spa.expression.Acquire;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Acquire</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.AcquireImpl#getResource
 * <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireImpl extends TerminalImpl implements Acquire {

    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected org.palladiosimulator.solver.spa.resourcemodel.PassiveResource resource;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AcquireImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionPackage.Literals.ACQUIRE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public org.palladiosimulator.solver.spa.resourcemodel.PassiveResource getResource() {
        if (this.resource != null && this.resource.eIsProxy()) {
            final InternalEObject oldResource = (InternalEObject) this.resource;
            this.resource = (org.palladiosimulator.solver.spa.resourcemodel.PassiveResource) this
                    .eResolveProxy(oldResource);
            if (this.resource != oldResource) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.ACQUIRE__RESOURCE,
                            oldResource, this.resource));
                }
            }
        }
        return this.resource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public org.palladiosimulator.solver.spa.resourcemodel.PassiveResource basicGetResource() {
        return this.resource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setResource(final org.palladiosimulator.solver.spa.resourcemodel.PassiveResource newResource) {
        final org.palladiosimulator.solver.spa.resourcemodel.PassiveResource oldResource = this.resource;
        this.resource = newResource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.ACQUIRE__RESOURCE, oldResource,
                    this.resource));
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
        case ExpressionPackage.ACQUIRE__RESOURCE:
            if (resolve) {
                return this.getResource();
            }
            return this.basicGetResource();
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
        case ExpressionPackage.ACQUIRE__RESOURCE:
            this.setResource((org.palladiosimulator.solver.spa.resourcemodel.PassiveResource) newValue);
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
        case ExpressionPackage.ACQUIRE__RESOURCE:
            this.setResource((org.palladiosimulator.solver.spa.resourcemodel.PassiveResource) null);
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
        case ExpressionPackage.ACQUIRE__RESOURCE:
            return this.resource != null;
        }
        return super.eIsSet(featureID);
    }

} // AcquireImpl
