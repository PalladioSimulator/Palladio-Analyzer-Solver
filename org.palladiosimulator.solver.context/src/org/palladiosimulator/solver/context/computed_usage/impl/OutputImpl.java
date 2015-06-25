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
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.Output;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Output</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.OutputImpl#getParameterCharacterisations_Output
 * <em>Parameter Characterisations Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputImpl extends EObjectImpl implements Output {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getParameterCharacterisations_Output()
     * <em>Parameter Characterisations Output</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getParameterCharacterisations_Output()
     * @generated
     * @ordered
     */
    protected EList<VariableUsage> parameterCharacterisations_Output;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OutputImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.OUTPUT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<VariableUsage> getParameterCharacterisations_Output() {
        if (this.parameterCharacterisations_Output == null)
        {
            this.parameterCharacterisations_Output = new EObjectContainmentEList<VariableUsage>(VariableUsage.class,
                    this,
                    ComputedUsagePackage.OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT);
        }
        return this.parameterCharacterisations_Output;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case ComputedUsagePackage.OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT:
            return ((InternalEList<?>) this.getParameterCharacterisations_Output()).basicRemove(otherEnd, msgs);
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
        switch (featureID)
        {
        case ComputedUsagePackage.OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT:
            return this.getParameterCharacterisations_Output();
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
        case ComputedUsagePackage.OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT:
            this.getParameterCharacterisations_Output().clear();
            this.getParameterCharacterisations_Output().addAll((Collection<? extends VariableUsage>) newValue);
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
        case ComputedUsagePackage.OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT:
            this.getParameterCharacterisations_Output().clear();
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
        case ComputedUsagePackage.OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT:
            return this.parameterCharacterisations_Output != null && !this.parameterCharacterisations_Output.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // OutputImpl
