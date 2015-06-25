/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsage;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Computed Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageImpl#getUsageContexts_ComputedUsage
 * <em>Usage Contexts Computed Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputedUsageImpl extends EObjectImpl implements ComputedUsage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getUsageContexts_ComputedUsage()
     * <em>Usage Contexts Computed Usage</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUsageContexts_ComputedUsage()
     * @generated
     * @ordered
     */
    protected EList<ComputedUsageContext> usageContexts_ComputedUsage;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComputedUsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.COMPUTED_USAGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ComputedUsageContext> getUsageContexts_ComputedUsage() {
        if (this.usageContexts_ComputedUsage == null) {
            this.usageContexts_ComputedUsage = new EObjectContainmentEList<ComputedUsageContext>(
                    ComputedUsageContext.class, this,
                    ComputedUsagePackage.COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE);
        }
        return this.usageContexts_ComputedUsage;
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
        case ComputedUsagePackage.COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE:
            return ((InternalEList<?>) this.getUsageContexts_ComputedUsage()).basicRemove(otherEnd, msgs);
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
        case ComputedUsagePackage.COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE:
            return this.getUsageContexts_ComputedUsage();
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
        case ComputedUsagePackage.COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE:
            this.getUsageContexts_ComputedUsage().clear();
            this.getUsageContexts_ComputedUsage().addAll((Collection<? extends ComputedUsageContext>) newValue);
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
        case ComputedUsagePackage.COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE:
            this.getUsageContexts_ComputedUsage().clear();
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
        case ComputedUsagePackage.COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE:
            return this.usageContexts_ComputedUsage != null && !this.usageContexts_ComputedUsage.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ComputedUsageImpl
