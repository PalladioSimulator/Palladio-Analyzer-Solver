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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallInput;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>External Call Input</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ExternalCallInputImpl#getParameterCharacterisations_ExternalCallInput
 * <em>Parameter Characterisations External Call Input</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ExternalCallInputImpl#getExternalCallAction_ExternalCallInput
 * <em>External Call Action External Call Input</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ExternalCallInputImpl#getComputedUsageContext_ExternalCallInput
 * <em>Computed Usage Context External Call Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalCallInputImpl extends EObjectImpl implements ExternalCallInput {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getParameterCharacterisations_ExternalCallInput()
     * <em>Parameter Characterisations External Call Input</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getParameterCharacterisations_ExternalCallInput()
     * @generated
     * @ordered
     */
    protected EList<VariableUsage> parameterCharacterisations_ExternalCallInput;

    /**
     * The cached value of the '{@link #getExternalCallAction_ExternalCallInput()
     * <em>External Call Action External Call Input</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getExternalCallAction_ExternalCallInput()
     * @generated
     * @ordered
     */
    protected ExternalCallAction externalCallAction_ExternalCallInput;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ExternalCallInputImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.EXTERNAL_CALL_INPUT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<VariableUsage> getParameterCharacterisations_ExternalCallInput() {
        if (this.parameterCharacterisations_ExternalCallInput == null) {
            this.parameterCharacterisations_ExternalCallInput = new EObjectContainmentEList<VariableUsage>(
                    VariableUsage.class, this,
                    ComputedUsagePackage.EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT);
        }
        return this.parameterCharacterisations_ExternalCallInput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExternalCallAction getExternalCallAction_ExternalCallInput() {
        if (this.externalCallAction_ExternalCallInput != null
                && ((EObject) this.externalCallAction_ExternalCallInput).eIsProxy()) {
            final InternalEObject oldExternalCallAction_ExternalCallInput = (InternalEObject) this.externalCallAction_ExternalCallInput;
            this.externalCallAction_ExternalCallInput = (ExternalCallAction) this
                    .eResolveProxy(oldExternalCallAction_ExternalCallInput);
            if (this.externalCallAction_ExternalCallInput != oldExternalCallAction_ExternalCallInput) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ComputedUsagePackage.EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT,
                            oldExternalCallAction_ExternalCallInput, this.externalCallAction_ExternalCallInput));
                }
            }
        }
        return this.externalCallAction_ExternalCallInput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExternalCallAction basicGetExternalCallAction_ExternalCallInput() {
        return this.externalCallAction_ExternalCallInput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setExternalCallAction_ExternalCallInput(
            final ExternalCallAction newExternalCallAction_ExternalCallInput) {
        final ExternalCallAction oldExternalCallAction_ExternalCallInput = this.externalCallAction_ExternalCallInput;
        this.externalCallAction_ExternalCallInput = newExternalCallAction_ExternalCallInput;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT,
                    oldExternalCallAction_ExternalCallInput, this.externalCallAction_ExternalCallInput));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ComputedUsageContext getComputedUsageContext_ExternalCallInput() {
        if (this.eContainerFeatureID() != ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT) {
            return null;
        }
        return (ComputedUsageContext) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetComputedUsageContext_ExternalCallInput(
            final ComputedUsageContext newComputedUsageContext_ExternalCallInput, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newComputedUsageContext_ExternalCallInput,
                ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setComputedUsageContext_ExternalCallInput(
            final ComputedUsageContext newComputedUsageContext_ExternalCallInput) {
        if (newComputedUsageContext_ExternalCallInput != this.eInternalContainer()
                || (this.eContainerFeatureID() != ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT
                        && newComputedUsageContext_ExternalCallInput != null)) {
            if (EcoreUtil.isAncestor(this, newComputedUsageContext_ExternalCallInput)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newComputedUsageContext_ExternalCallInput != null) {
                msgs = ((InternalEObject) newComputedUsageContext_ExternalCallInput).eInverseAdd(this,
                        ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT,
                        ComputedUsageContext.class, msgs);
            }
            msgs = this.basicSetComputedUsageContext_ExternalCallInput(newComputedUsageContext_ExternalCallInput, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT,
                    newComputedUsageContext_ExternalCallInput, newComputedUsageContext_ExternalCallInput));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetComputedUsageContext_ExternalCallInput((ComputedUsageContext) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
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
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT:
            return ((InternalEList<?>) this.getParameterCharacterisations_ExternalCallInput()).basicRemove(otherEnd,
                    msgs);
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            return this.basicSetComputedUsageContext_ExternalCallInput(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            return this.eInternalContainer().eInverseRemove(this,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT,
                    ComputedUsageContext.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT:
            return this.getParameterCharacterisations_ExternalCallInput();
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT:
            if (resolve) {
                return this.getExternalCallAction_ExternalCallInput();
            }
            return this.basicGetExternalCallAction_ExternalCallInput();
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            return this.getComputedUsageContext_ExternalCallInput();
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
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT:
            this.getParameterCharacterisations_ExternalCallInput().clear();
            this.getParameterCharacterisations_ExternalCallInput()
                    .addAll((Collection<? extends VariableUsage>) newValue);
            return;
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT:
            this.setExternalCallAction_ExternalCallInput((ExternalCallAction) newValue);
            return;
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            this.setComputedUsageContext_ExternalCallInput((ComputedUsageContext) newValue);
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
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT:
            this.getParameterCharacterisations_ExternalCallInput().clear();
            return;
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT:
            this.setExternalCallAction_ExternalCallInput((ExternalCallAction) null);
            return;
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            this.setComputedUsageContext_ExternalCallInput((ComputedUsageContext) null);
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
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT:
            return this.parameterCharacterisations_ExternalCallInput != null
                    && !this.parameterCharacterisations_ExternalCallInput.isEmpty();
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT:
            return this.externalCallAction_ExternalCallInput != null;
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT:
            return this.getComputedUsageContext_ExternalCallInput() != null;
        }
        return super.eIsSet(featureID);
    }

} // ExternalCallInputImpl
