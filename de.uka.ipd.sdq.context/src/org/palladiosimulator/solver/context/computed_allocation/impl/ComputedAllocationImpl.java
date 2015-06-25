/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_allocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocation;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Computed Allocation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_allocation.impl.ComputedAllocationImpl#getComputedAllocationContexts_ComputedAllocation
 * <em>Computed Allocation Contexts Computed Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputedAllocationImpl extends EObjectImpl implements ComputedAllocation {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getComputedAllocationContexts_ComputedAllocation()
     * <em>Computed Allocation Contexts Computed Allocation</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getComputedAllocationContexts_ComputedAllocation()
     * @generated
     * @ordered
     */
    protected EList<ComputedAllocationContext> computedAllocationContexts_ComputedAllocation;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComputedAllocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedAllocationPackage.Literals.COMPUTED_ALLOCATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ComputedAllocationContext> getComputedAllocationContexts_ComputedAllocation() {
        if (this.computedAllocationContexts_ComputedAllocation == null) {
            this.computedAllocationContexts_ComputedAllocation = new EObjectContainmentEList<ComputedAllocationContext>(
                    ComputedAllocationContext.class, this,
                    ComputedAllocationPackage.COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION);
        }
        return this.computedAllocationContexts_ComputedAllocation;
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
        case ComputedAllocationPackage.COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION:
            return ((InternalEList<?>) this.getComputedAllocationContexts_ComputedAllocation()).basicRemove(otherEnd,
                    msgs);
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
        case ComputedAllocationPackage.COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION:
            return this.getComputedAllocationContexts_ComputedAllocation();
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
        case ComputedAllocationPackage.COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION:
            this.getComputedAllocationContexts_ComputedAllocation().clear();
            this.getComputedAllocationContexts_ComputedAllocation()
                    .addAll((Collection<? extends ComputedAllocationContext>) newValue);
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
        case ComputedAllocationPackage.COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION:
            this.getComputedAllocationContexts_ComputedAllocation().clear();
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
        case ComputedAllocationPackage.COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION:
            return this.computedAllocationContexts_ComputedAllocation != null
                    && !this.computedAllocationContexts_ComputedAllocation.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ComputedAllocationImpl
