/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.resourcemodel.AbstractResourceUsage;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;
import org.palladiosimulator.solver.resourcemodel.SequentialResourceUsage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sequential Resource Usage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.resourcemodel.impl.SequentialResourceUsageImpl#getResourceUsages
 * <em>Resource Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequentialResourceUsageImpl extends AbstractResourceUsageImpl implements SequentialResourceUsage {

    /**
     * The cached value of the '{@link #getResourceUsages() <em>Resource Usages</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getResourceUsages()
     * @generated
     * @ordered
     */
    protected EList resourceUsages;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SequentialResourceUsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.SEQUENTIAL_RESOURCE_USAGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList getResourceUsages() {
        if (this.resourceUsages == null) {
            this.resourceUsages = new EObjectContainmentEList(AbstractResourceUsage.class, this,
                    ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES);
        }
        return this.resourceUsages;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES:
            return ((InternalEList) this.getResourceUsages()).basicRemove(otherEnd, msgs);
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
        switch (featureID) {
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES:
            return this.getResourceUsages();
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
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES:
            this.getResourceUsages().clear();
            this.getResourceUsages().addAll((Collection) newValue);
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
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES:
            this.getResourceUsages().clear();
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
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES:
            return this.resourceUsages != null && !this.resourceUsages.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SequentialResourceUsageImpl
