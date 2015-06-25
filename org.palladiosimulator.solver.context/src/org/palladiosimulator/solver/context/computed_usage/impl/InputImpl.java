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
import org.palladiosimulator.solver.context.computed_usage.Input;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Input</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.InputImpl#getParameterChacterisations_Input
 * <em>Parameter Chacterisations Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends EObjectImpl implements Input {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getParameterChacterisations_Input()
     * <em>Parameter Chacterisations Input</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getParameterChacterisations_Input()
     * @generated
     * @ordered
     */
    protected EList<VariableUsage> parameterChacterisations_Input;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InputImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.INPUT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<VariableUsage> getParameterChacterisations_Input() {
        if (this.parameterChacterisations_Input == null) {
            this.parameterChacterisations_Input = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this,
                    ComputedUsagePackage.INPUT__PARAMETER_CHACTERISATIONS_INPUT);
        }
        return this.parameterChacterisations_Input;
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
        case ComputedUsagePackage.INPUT__PARAMETER_CHACTERISATIONS_INPUT:
            return ((InternalEList<?>) this.getParameterChacterisations_Input()).basicRemove(otherEnd, msgs);
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
        case ComputedUsagePackage.INPUT__PARAMETER_CHACTERISATIONS_INPUT:
            return this.getParameterChacterisations_Input();
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
        case ComputedUsagePackage.INPUT__PARAMETER_CHACTERISATIONS_INPUT:
            this.getParameterChacterisations_Input().clear();
            this.getParameterChacterisations_Input().addAll((Collection<? extends VariableUsage>) newValue);
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
        case ComputedUsagePackage.INPUT__PARAMETER_CHACTERISATIONS_INPUT:
            this.getParameterChacterisations_Input().clear();
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
        case ComputedUsagePackage.INPUT__PARAMETER_CHACTERISATIONS_INPUT:
            return this.parameterChacterisations_Input != null && !this.parameterChacterisations_Input.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // InputImpl
