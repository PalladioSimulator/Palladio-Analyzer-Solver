/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.solver.context.computed_usage.BranchProbability;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsage;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallInput;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallOutput;
import org.palladiosimulator.solver.context.computed_usage.Input;
import org.palladiosimulator.solver.context.computed_usage.LoopIteration;
import org.palladiosimulator.solver.context.computed_usage.Output;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage
 * @generated
 */
public class ComputedUsageSwitch<T> extends Switch<T> {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ComputedUsagePackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ComputedUsageSwitch() {
        if (modelPackage == null) {
            modelPackage = ComputedUsagePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT: {
            final ComputedUsageContext computedUsageContext = (ComputedUsageContext) theEObject;
            T result = this.caseComputedUsageContext(computedUsageContext);
            if (result == null) {
                result = this.caseEntity(computedUsageContext);
            }
            if (result == null) {
                result = this.caseIdentifier(computedUsageContext);
            }
            if (result == null) {
                result = this.caseNamedElement(computedUsageContext);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.BRANCH_PROBABILITY: {
            final BranchProbability branchProbability = (BranchProbability) theEObject;
            T result = this.caseBranchProbability(branchProbability);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.LOOP_ITERATION: {
            final LoopIteration loopIteration = (LoopIteration) theEObject;
            T result = this.caseLoopIteration(loopIteration);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.INPUT: {
            final Input input = (Input) theEObject;
            T result = this.caseInput(input);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT: {
            final ExternalCallOutput externalCallOutput = (ExternalCallOutput) theEObject;
            T result = this.caseExternalCallOutput(externalCallOutput);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT: {
            final ExternalCallInput externalCallInput = (ExternalCallInput) theEObject;
            T result = this.caseExternalCallInput(externalCallInput);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.OUTPUT: {
            final Output output = (Output) theEObject;
            T result = this.caseOutput(output);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ComputedUsagePackage.COMPUTED_USAGE: {
            final ComputedUsage computedUsage = (ComputedUsage) theEObject;
            T result = this.caseComputedUsage(computedUsage);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComputedUsageContext(final ComputedUsageContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Branch Probability</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Branch Probability</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBranchProbability(final BranchProbability object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Loop Iteration</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loop Iteration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoopIteration(final LoopIteration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInput(final Input object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>External Call Output</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>External Call Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalCallOutput(final ExternalCallOutput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Call Input</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Call Input</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalCallInput(final ExternalCallInput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutput(final Output object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Computed Usage</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Computed Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComputedUsage(final ComputedUsage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // ComputedUsageSwitch
