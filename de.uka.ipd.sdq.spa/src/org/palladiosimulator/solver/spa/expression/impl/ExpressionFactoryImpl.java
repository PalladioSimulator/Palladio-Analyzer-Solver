/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.solver.spa.expression.Acquire;
import org.palladiosimulator.solver.spa.expression.Alternative;
import org.palladiosimulator.solver.spa.expression.ExpressionFactory;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.Loop;
import org.palladiosimulator.solver.spa.expression.Option;
import org.palladiosimulator.solver.spa.expression.Parallel;
import org.palladiosimulator.solver.spa.expression.Release;
import org.palladiosimulator.solver.spa.expression.Sequence;
import org.palladiosimulator.solver.spa.expression.Symbol;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static ExpressionFactory init() {
        try {
            final ExpressionFactory theExpressionFactory = (ExpressionFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ExpressionPackage.eNS_URI);
            if (theExpressionFactory != null) {
                return theExpressionFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpressionFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExpressionFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ExpressionPackage.SYMBOL:
            return this.createSymbol();
        case ExpressionPackage.SEQUENCE:
            return this.createSequence();
        case ExpressionPackage.RELEASE:
            return this.createRelease();
        case ExpressionPackage.PARALLEL:
            return this.createParallel();
        case ExpressionPackage.OPTION:
            return this.createOption();
        case ExpressionPackage.LOOP:
            return this.createLoop();
        case ExpressionPackage.ALTERNATIVE:
            return this.createAlternative();
        case ExpressionPackage.ACQUIRE:
            return this.createAcquire();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Symbol createSymbol() {
        final SymbolImpl symbol = new SymbolImpl();
        return symbol;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Sequence createSequence() {
        final SequenceImpl sequence = new SequenceImpl();
        return sequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Release createRelease() {
        final ReleaseImpl release = new ReleaseImpl();
        return release;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Parallel createParallel() {
        final ParallelImpl parallel = new ParallelImpl();
        return parallel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Option createOption() {
        final OptionImpl option = new OptionImpl();
        return option;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Loop createLoop() {
        final LoopImpl loop = new LoopImpl();
        return loop;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Alternative createAlternative() {
        final AlternativeImpl alternative = new AlternativeImpl();
        return alternative;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Acquire createAcquire() {
        final AcquireImpl acquire = new AcquireImpl();
        return acquire;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExpressionPackage getExpressionPackage() {
        return (ExpressionPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExpressionPackage getPackage() {
        return ExpressionPackage.eINSTANCE;
    }

} // ExpressionFactoryImpl
