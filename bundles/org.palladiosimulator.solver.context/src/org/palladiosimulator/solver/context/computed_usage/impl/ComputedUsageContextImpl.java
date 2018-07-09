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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.solver.context.computed_usage.BranchProbability;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallInput;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallOutput;
import org.palladiosimulator.solver.context.computed_usage.Input;
import org.palladiosimulator.solver.context.computed_usage.LoopIteration;
import org.palladiosimulator.solver.context.computed_usage.Output;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Context</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getBranchProbabilities_ComputedUsageContext
 * <em>Branch Probabilities Computed Usage Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getLoopiterations_ComputedUsageContext
 * <em>Loopiterations Computed Usage Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getAssemblyContext_ComputedUsageContext
 * <em>Assembly Context Computed Usage Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getInput_ComputedUsageContext
 * <em>Input Computed Usage Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getExternalCallOutput_ComputedUsageContext
 * <em>External Call Output Computed Usage Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getExternalCallInput_ComputedUsageContext
 * <em>External Call Input Computed Usage Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsageContextImpl#getOutput_ComputedUsageContext
 * <em>Output Computed Usage Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputedUsageContextImpl extends EntityImpl implements ComputedUsageContext {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getBranchProbabilities_ComputedUsageContext()
     * <em>Branch Probabilities Computed Usage Context</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBranchProbabilities_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected EList<BranchProbability> branchProbabilities_ComputedUsageContext;

    /**
     * The cached value of the '{@link #getLoopiterations_ComputedUsageContext()
     * <em>Loopiterations Computed Usage Context</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLoopiterations_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected EList<LoopIteration> loopiterations_ComputedUsageContext;

    /**
     * The cached value of the '{@link #getAssemblyContext_ComputedUsageContext()
     * <em>Assembly Context Computed Usage Context</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getAssemblyContext_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected AssemblyContext assemblyContext_ComputedUsageContext;

    /**
     * The cached value of the '{@link #getInput_ComputedUsageContext()
     * <em>Input Computed Usage Context</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getInput_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected Input input_ComputedUsageContext;

    /**
     * The cached value of the '{@link #getExternalCallOutput_ComputedUsageContext()
     * <em>External Call Output Computed Usage Context</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExternalCallOutput_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected EList<ExternalCallOutput> externalCallOutput_ComputedUsageContext;

    /**
     * The cached value of the '{@link #getExternalCallInput_ComputedUsageContext()
     * <em>External Call Input Computed Usage Context</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExternalCallInput_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected EList<ExternalCallInput> externalCallInput_ComputedUsageContext;

    /**
     * The cached value of the '{@link #getOutput_ComputedUsageContext()
     * <em>Output Computed Usage Context</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getOutput_ComputedUsageContext()
     * @generated
     * @ordered
     */
    protected Output output_ComputedUsageContext;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComputedUsageContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.COMPUTED_USAGE_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<BranchProbability> getBranchProbabilities_ComputedUsageContext() {
        if (this.branchProbabilities_ComputedUsageContext == null)
        {
            this.branchProbabilities_ComputedUsageContext = new EObjectContainmentEList<BranchProbability>(
                    BranchProbability.class, this,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT);
        }
        return this.branchProbabilities_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<LoopIteration> getLoopiterations_ComputedUsageContext() {
        if (this.loopiterations_ComputedUsageContext == null)
        {
            this.loopiterations_ComputedUsageContext = new EObjectContainmentEList<LoopIteration>(LoopIteration.class,
                    this,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT);
        }
        return this.loopiterations_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AssemblyContext getAssemblyContext_ComputedUsageContext() {
        if (this.assemblyContext_ComputedUsageContext != null
                && ((EObject) this.assemblyContext_ComputedUsageContext).eIsProxy())
        {
            final InternalEObject oldAssemblyContext_ComputedUsageContext = (InternalEObject) this.assemblyContext_ComputedUsageContext;
            this.assemblyContext_ComputedUsageContext = (AssemblyContext) this
                    .eResolveProxy(oldAssemblyContext_ComputedUsageContext);
            if (this.assemblyContext_ComputedUsageContext != oldAssemblyContext_ComputedUsageContext)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT,
                            oldAssemblyContext_ComputedUsageContext, this.assemblyContext_ComputedUsageContext));
                }
            }
        }
        return this.assemblyContext_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AssemblyContext basicGetAssemblyContext_ComputedUsageContext() {
        return this.assemblyContext_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAssemblyContext_ComputedUsageContext(final AssemblyContext newAssemblyContext_ComputedUsageContext) {
        final AssemblyContext oldAssemblyContext_ComputedUsageContext = this.assemblyContext_ComputedUsageContext;
        this.assemblyContext_ComputedUsageContext = newAssemblyContext_ComputedUsageContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT,
                    oldAssemblyContext_ComputedUsageContext, this.assemblyContext_ComputedUsageContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Input getInput_ComputedUsageContext() {
        return this.input_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetInput_ComputedUsageContext(final Input newInput_ComputedUsageContext,
            NotificationChain msgs) {
        final Input oldInput_ComputedUsageContext = this.input_ComputedUsageContext;
        this.input_ComputedUsageContext = newInput_ComputedUsageContext;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT,
                    oldInput_ComputedUsageContext, newInput_ComputedUsageContext);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInput_ComputedUsageContext(final Input newInput_ComputedUsageContext) {
        if (newInput_ComputedUsageContext != this.input_ComputedUsageContext)
        {
            NotificationChain msgs = null;
            if (this.input_ComputedUsageContext != null) {
                msgs = ((InternalEObject) this.input_ComputedUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT, null, msgs);
            }
            if (newInput_ComputedUsageContext != null) {
                msgs = ((InternalEObject) newInput_ComputedUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT, null, msgs);
            }
            msgs = this.basicSetInput_ComputedUsageContext(newInput_ComputedUsageContext, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT,
                    newInput_ComputedUsageContext, newInput_ComputedUsageContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExternalCallOutput> getExternalCallOutput_ComputedUsageContext() {
        if (this.externalCallOutput_ComputedUsageContext == null)
        {
            this.externalCallOutput_ComputedUsageContext = new EObjectContainmentEList<ExternalCallOutput>(
                    ExternalCallOutput.class, this,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT);
        }
        return this.externalCallOutput_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExternalCallInput> getExternalCallInput_ComputedUsageContext() {
        if (this.externalCallInput_ComputedUsageContext == null)
        {
            this.externalCallInput_ComputedUsageContext = new EObjectContainmentWithInverseEList<ExternalCallInput>(
                    ExternalCallInput.class, this,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT,
                    ComputedUsagePackage.EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT);
        }
        return this.externalCallInput_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Output getOutput_ComputedUsageContext() {
        return this.output_ComputedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetOutput_ComputedUsageContext(final Output newOutput_ComputedUsageContext,
            NotificationChain msgs) {
        final Output oldOutput_ComputedUsageContext = this.output_ComputedUsageContext;
        this.output_ComputedUsageContext = newOutput_ComputedUsageContext;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT,
                    oldOutput_ComputedUsageContext, newOutput_ComputedUsageContext);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOutput_ComputedUsageContext(final Output newOutput_ComputedUsageContext) {
        if (newOutput_ComputedUsageContext != this.output_ComputedUsageContext)
        {
            NotificationChain msgs = null;
            if (this.output_ComputedUsageContext != null) {
                msgs = ((InternalEObject) this.output_ComputedUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT, null, msgs);
            }
            if (newOutput_ComputedUsageContext != null) {
                msgs = ((InternalEObject) newOutput_ComputedUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT, null, msgs);
            }
            msgs = this.basicSetOutput_ComputedUsageContext(newOutput_ComputedUsageContext, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT,
                    newOutput_ComputedUsageContext, newOutput_ComputedUsageContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this
                    .getExternalCallInput_ComputedUsageContext())
                    .basicAdd(otherEnd, msgs);
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
        switch (featureID)
        {
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT:
            return ((InternalEList<?>) this.getBranchProbabilities_ComputedUsageContext()).basicRemove(otherEnd, msgs);
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT:
            return ((InternalEList<?>) this.getLoopiterations_ComputedUsageContext()).basicRemove(otherEnd, msgs);
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT:
            return this.basicSetInput_ComputedUsageContext(null, msgs);
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT:
            return ((InternalEList<?>) this.getExternalCallOutput_ComputedUsageContext()).basicRemove(otherEnd, msgs);
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT:
            return ((InternalEList<?>) this.getExternalCallInput_ComputedUsageContext()).basicRemove(otherEnd, msgs);
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT:
            return this.basicSetOutput_ComputedUsageContext(null, msgs);
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
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT:
            return this.getBranchProbabilities_ComputedUsageContext();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT:
            return this.getLoopiterations_ComputedUsageContext();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT:
            if (resolve) {
                return this.getAssemblyContext_ComputedUsageContext();
            }
            return this.basicGetAssemblyContext_ComputedUsageContext();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT:
            return this.getInput_ComputedUsageContext();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT:
            return this.getExternalCallOutput_ComputedUsageContext();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT:
            return this.getExternalCallInput_ComputedUsageContext();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT:
            return this.getOutput_ComputedUsageContext();
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
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT:
            this.getBranchProbabilities_ComputedUsageContext().clear();
            this.getBranchProbabilities_ComputedUsageContext().addAll(
                    (Collection<? extends BranchProbability>) newValue);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT:
            this.getLoopiterations_ComputedUsageContext().clear();
            this.getLoopiterations_ComputedUsageContext().addAll((Collection<? extends LoopIteration>) newValue);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT:
            this.setAssemblyContext_ComputedUsageContext((AssemblyContext) newValue);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT:
            this.setInput_ComputedUsageContext((Input) newValue);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT:
            this.getExternalCallOutput_ComputedUsageContext().clear();
            this.getExternalCallOutput_ComputedUsageContext().addAll(
                    (Collection<? extends ExternalCallOutput>) newValue);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT:
            this.getExternalCallInput_ComputedUsageContext().clear();
            this.getExternalCallInput_ComputedUsageContext().addAll((Collection<? extends ExternalCallInput>) newValue);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT:
            this.setOutput_ComputedUsageContext((Output) newValue);
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
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT:
            this.getBranchProbabilities_ComputedUsageContext().clear();
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT:
            this.getLoopiterations_ComputedUsageContext().clear();
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT:
            this.setAssemblyContext_ComputedUsageContext((AssemblyContext) null);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT:
            this.setInput_ComputedUsageContext((Input) null);
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT:
            this.getExternalCallOutput_ComputedUsageContext().clear();
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT:
            this.getExternalCallInput_ComputedUsageContext().clear();
            return;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT:
            this.setOutput_ComputedUsageContext((Output) null);
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
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT:
            return this.branchProbabilities_ComputedUsageContext != null
            && !this.branchProbabilities_ComputedUsageContext.isEmpty();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT:
            return this.loopiterations_ComputedUsageContext != null
                    && !this.loopiterations_ComputedUsageContext.isEmpty();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT:
            return this.assemblyContext_ComputedUsageContext != null;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT:
            return this.input_ComputedUsageContext != null;
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT:
            return this.externalCallOutput_ComputedUsageContext != null
            && !this.externalCallOutput_ComputedUsageContext.isEmpty();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT:
            return this.externalCallInput_ComputedUsageContext != null
                    && !this.externalCallInput_ComputedUsageContext.isEmpty();
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT:
            return this.output_ComputedUsageContext != null;
        }
        return super.eIsSet(featureID);
    }

} // ComputedUsageContextImpl
