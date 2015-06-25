/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallOutput;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>External Call Output</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ExternalCallOutputImpl#getParameterCharacterisations_ExternalCallOutput
 * <em>Parameter Characterisations External Call Output</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ExternalCallOutputImpl#getExternalCallAction_ExternalCallOutput
 * <em>External Call Action External Call Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalCallOutputImpl extends EObjectImpl implements ExternalCallOutput {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getParameterCharacterisations_ExternalCallOutput()
     * <em>Parameter Characterisations External Call Output</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getParameterCharacterisations_ExternalCallOutput()
     * @generated
     * @ordered
     */
    protected EList<VariableUsage> parameterCharacterisations_ExternalCallOutput;

    /**
     * The cached value of the '{@link #getExternalCallAction_ExternalCallOutput()
     * <em>External Call Action External Call Output</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getExternalCallAction_ExternalCallOutput()
     * @generated
     * @ordered
     */
    protected ExternalCallAction externalCallAction_ExternalCallOutput;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ExternalCallOutputImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.EXTERNAL_CALL_OUTPUT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<VariableUsage> getParameterCharacterisations_ExternalCallOutput() {
        if (this.parameterCharacterisations_ExternalCallOutput == null) {
            this.parameterCharacterisations_ExternalCallOutput = new EObjectContainmentEList<VariableUsage>(
                    VariableUsage.class, this,
                    ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT);
        }
        return this.parameterCharacterisations_ExternalCallOutput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExternalCallAction getExternalCallAction_ExternalCallOutput() {
        if (this.externalCallAction_ExternalCallOutput != null
                && ((EObject) this.externalCallAction_ExternalCallOutput).eIsProxy()) {
            final InternalEObject oldExternalCallAction_ExternalCallOutput = (InternalEObject) this.externalCallAction_ExternalCallOutput;
            this.externalCallAction_ExternalCallOutput = (ExternalCallAction) this
                    .eResolveProxy(oldExternalCallAction_ExternalCallOutput);
            if (this.externalCallAction_ExternalCallOutput != oldExternalCallAction_ExternalCallOutput) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT,
                            oldExternalCallAction_ExternalCallOutput, this.externalCallAction_ExternalCallOutput));
                }
            }
        }
        return this.externalCallAction_ExternalCallOutput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExternalCallAction basicGetExternalCallAction_ExternalCallOutput() {
        return this.externalCallAction_ExternalCallOutput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setExternalCallAction_ExternalCallOutput(
            final ExternalCallAction newExternalCallAction_ExternalCallOutput) {
        final ExternalCallAction oldExternalCallAction_ExternalCallOutput = this.externalCallAction_ExternalCallOutput;
        this.externalCallAction_ExternalCallOutput = newExternalCallAction_ExternalCallOutput;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT,
                    oldExternalCallAction_ExternalCallOutput, this.externalCallAction_ExternalCallOutput));
        }
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
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT:
            return ((InternalEList<?>) this.getParameterCharacterisations_ExternalCallOutput()).basicRemove(otherEnd,
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
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT:
            return this.getParameterCharacterisations_ExternalCallOutput();
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT:
            if (resolve) {
                return this.getExternalCallAction_ExternalCallOutput();
            }
            return this.basicGetExternalCallAction_ExternalCallOutput();
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
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT:
            this.getParameterCharacterisations_ExternalCallOutput().clear();
            this.getParameterCharacterisations_ExternalCallOutput()
                    .addAll((Collection<? extends VariableUsage>) newValue);
            return;
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT:
            this.setExternalCallAction_ExternalCallOutput((ExternalCallAction) newValue);
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
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT:
            this.getParameterCharacterisations_ExternalCallOutput().clear();
            return;
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT:
            this.setExternalCallAction_ExternalCallOutput((ExternalCallAction) null);
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
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT:
            return this.parameterCharacterisations_ExternalCallOutput != null
                    && !this.parameterCharacterisations_ExternalCallOutput.isEmpty();
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT:
            return this.externalCallAction_ExternalCallOutput != null;
        }
        return super.eIsSet(featureID);
    }

} // ExternalCallOutputImpl
