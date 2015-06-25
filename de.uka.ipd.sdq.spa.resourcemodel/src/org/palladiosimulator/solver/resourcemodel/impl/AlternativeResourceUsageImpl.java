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
import org.palladiosimulator.solver.resourcemodel.AlternativeResourceUsage;
import org.palladiosimulator.solver.resourcemodel.Option;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Alternative Resource Usage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.resourcemodel.impl.AlternativeResourceUsageImpl#getOptions
 * <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeResourceUsageImpl extends AbstractResourceUsageImpl implements AlternativeResourceUsage {

    /**
     * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOptions()
     * @generated
     * @ordered
     */
    protected EList options;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AlternativeResourceUsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.ALTERNATIVE_RESOURCE_USAGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList getOptions() {
        if (this.options == null) {
            this.options = new EObjectContainmentEList(Option.class, this,
                    ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS);
        }
        return this.options;
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
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            return ((InternalEList) this.getOptions()).basicRemove(otherEnd, msgs);
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
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            return this.getOptions();
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
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            this.getOptions().clear();
            this.getOptions().addAll((Collection) newValue);
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
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            this.getOptions().clear();
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
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE__OPTIONS:
            return this.options != null && !this.options.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // AlternativeResourceUsageImpl
