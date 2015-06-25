/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.solver.spa.expression.Acquire;
import org.palladiosimulator.solver.spa.expression.Alternative;
import org.palladiosimulator.solver.spa.expression.Expression;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.Loop;
import org.palladiosimulator.solver.spa.expression.Operation;
import org.palladiosimulator.solver.spa.expression.Option;
import org.palladiosimulator.solver.spa.expression.Parallel;
import org.palladiosimulator.solver.spa.expression.Release;
import org.palladiosimulator.solver.spa.expression.Sequence;
import org.palladiosimulator.solver.spa.expression.Symbol;
import org.palladiosimulator.solver.spa.expression.Terminal;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ExpressionPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExpressionSwitch() {
        if (modelPackage == null) {
            modelPackage = ExpressionPackage.eINSTANCE;
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
        case ExpressionPackage.TERMINAL: {
            final Terminal terminal = (Terminal) theEObject;
            T result = this.caseTerminal(terminal);
            if (result == null) {
                result = this.caseExpression(terminal);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.EXPRESSION: {
            final Expression expression = (Expression) theEObject;
            T result = this.caseExpression(expression);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.SYMBOL: {
            final Symbol symbol = (Symbol) theEObject;
            T result = this.caseSymbol(symbol);
            if (result == null) {
                result = this.caseTerminal(symbol);
            }
            if (result == null) {
                result = this.caseExpression(symbol);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.SEQUENCE: {
            final Sequence sequence = (Sequence) theEObject;
            T result = this.caseSequence(sequence);
            if (result == null) {
                result = this.caseOperation(sequence);
            }
            if (result == null) {
                result = this.caseExpression(sequence);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.OPERATION: {
            final Operation operation = (Operation) theEObject;
            T result = this.caseOperation(operation);
            if (result == null) {
                result = this.caseExpression(operation);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.RELEASE: {
            final Release release = (Release) theEObject;
            T result = this.caseRelease(release);
            if (result == null) {
                result = this.caseTerminal(release);
            }
            if (result == null) {
                result = this.caseExpression(release);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.PARALLEL: {
            final Parallel parallel = (Parallel) theEObject;
            T result = this.caseParallel(parallel);
            if (result == null) {
                result = this.caseOperation(parallel);
            }
            if (result == null) {
                result = this.caseExpression(parallel);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.OPTION: {
            final Option option = (Option) theEObject;
            T result = this.caseOption(option);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.LOOP: {
            final Loop loop = (Loop) theEObject;
            T result = this.caseLoop(loop);
            if (result == null) {
                result = this.caseOperation(loop);
            }
            if (result == null) {
                result = this.caseExpression(loop);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.ALTERNATIVE: {
            final Alternative alternative = (Alternative) theEObject;
            T result = this.caseAlternative(alternative);
            if (result == null) {
                result = this.caseOperation(alternative);
            }
            if (result == null) {
                result = this.caseExpression(alternative);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExpressionPackage.ACQUIRE: {
            final Acquire acquire = (Acquire) theEObject;
            T result = this.caseAcquire(acquire);
            if (result == null) {
                result = this.caseTerminal(acquire);
            }
            if (result == null) {
                result = this.caseExpression(acquire);
            }
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
     * Returns the result of interpretting the object as an instance of '<em>Terminal</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTerminal(final Terminal object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Expression</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(final Expression object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Symbol</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Symbol</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSymbol(final Symbol object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Sequence</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSequence(final Sequence object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Operation</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperation(final Operation object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Release</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Release</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelease(final Release object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Parallel</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Parallel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParallel(final Parallel object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Option</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOption(final Option object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Loop</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Loop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoop(final Loop object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Alternative</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Alternative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlternative(final Alternative object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Acquire</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Acquire</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAcquire(final Acquire object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // ExpressionSwitch
