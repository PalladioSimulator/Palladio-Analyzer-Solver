/**
 */
package org.palladiosimulator.solver.spa.resourcemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.solver.spa.resourcemodel.AlternativeResourceUsage;
import org.palladiosimulator.solver.spa.resourcemodel.Option;
import org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.spa.resourcemodel.impl.AlternativeResourceUsageImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeResourceUsageImpl extends AbstractResourceUsageImpl implements AlternativeResourceUsage {

    /**
     * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptions()
     * @generated
     * @ordered
     */
    protected EList options;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AlternativeResourceUsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.ALTERNATIVE_RESOURCE_USAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getOptions() {
        if (options == null) {
            options = new EObjectContainmentEList(Option.class, this,
                    ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS);
        }
        return options;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            return ((InternalEList) getOptions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            return getOptions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            getOptions().clear();
            getOptions().addAll((Collection) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            getOptions().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            return options != null && !options.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AlternativeResourceUsageImpl
