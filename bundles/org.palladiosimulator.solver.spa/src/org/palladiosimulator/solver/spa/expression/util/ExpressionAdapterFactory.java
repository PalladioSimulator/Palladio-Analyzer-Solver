/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage
 * @generated
 */
public class ExpressionAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ExpressionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExpressionAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ExpressionPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected ExpressionSwitch<Adapter> modelSwitch = new ExpressionSwitch<Adapter>() {

        @Override
        public Adapter caseTerminal(final Terminal object) {
            return ExpressionAdapterFactory.this.createTerminalAdapter();
        }

        @Override
        public Adapter caseExpression(final Expression object) {
            return ExpressionAdapterFactory.this.createExpressionAdapter();
        }

        @Override
        public Adapter caseSymbol(final Symbol object) {
            return ExpressionAdapterFactory.this.createSymbolAdapter();
        }

        @Override
        public Adapter caseSequence(final Sequence object) {
            return ExpressionAdapterFactory.this.createSequenceAdapter();
        }

        @Override
        public Adapter caseOperation(final Operation object) {
            return ExpressionAdapterFactory.this.createOperationAdapter();
        }

        @Override
        public Adapter caseRelease(final Release object) {
            return ExpressionAdapterFactory.this.createReleaseAdapter();
        }

        @Override
        public Adapter caseParallel(final Parallel object) {
            return ExpressionAdapterFactory.this.createParallelAdapter();
        }

        @Override
        public Adapter caseOption(final Option object) {
            return ExpressionAdapterFactory.this.createOptionAdapter();
        }

        @Override
        public Adapter caseLoop(final Loop object) {
            return ExpressionAdapterFactory.this.createLoopAdapter();
        }

        @Override
        public Adapter caseAlternative(final Alternative object) {
            return ExpressionAdapterFactory.this.createAlternativeAdapter();
        }

        @Override
        public Adapter caseAcquire(final Acquire object) {
            return ExpressionAdapterFactory.this.createAcquireAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return ExpressionAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Terminal <em>Terminal</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Terminal
     * @generated
     */
    public Adapter createTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Expression <em>Expression</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Symbol <em>Symbol</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Symbol
     * @generated
     */
    public Adapter createSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Sequence <em>Sequence</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Sequence
     * @generated
     */
    public Adapter createSequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Operation <em>Operation</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Release <em>Release</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Release
     * @generated
     */
    public Adapter createReleaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Parallel <em>Parallel</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Parallel
     * @generated
     */
    public Adapter createParallelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Option <em>Option</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Option
     * @generated
     */
    public Adapter createOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Loop <em>Loop</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Loop
     * @generated
     */
    public Adapter createLoopAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Alternative <em>Alternative</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Alternative
     * @generated
     */
    public Adapter createAlternativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.spa.expression.Acquire <em>Acquire</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.expression.Acquire
     * @generated
     */
    public Adapter createAcquireAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ExpressionAdapterFactory
