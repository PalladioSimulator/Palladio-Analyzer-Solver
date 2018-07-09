/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.solver.context.computed_usage.BranchProbability;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsage;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageFactory;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallInput;
import org.palladiosimulator.solver.context.computed_usage.ExternalCallOutput;
import org.palladiosimulator.solver.context.computed_usage.Input;
import org.palladiosimulator.solver.context.computed_usage.LoopIteration;
import org.palladiosimulator.solver.context.computed_usage.Output;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputedUsageFactoryImpl extends EFactoryImpl implements ComputedUsageFactory {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ComputedUsageFactory init() {
        try
        {
            final ComputedUsageFactory theComputedUsageFactory = (ComputedUsageFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ComputedUsagePackage.eNS_URI);
            if (theComputedUsageFactory != null)
            {
                return theComputedUsageFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ComputedUsageFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ComputedUsageFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID())
        {
        case ComputedUsagePackage.COMPUTED_USAGE_CONTEXT:
            return this.createComputedUsageContext();
        case ComputedUsagePackage.BRANCH_PROBABILITY:
            return this.createBranchProbability();
        case ComputedUsagePackage.LOOP_ITERATION:
            return this.createLoopIteration();
        case ComputedUsagePackage.INPUT:
            return this.createInput();
        case ComputedUsagePackage.EXTERNAL_CALL_OUTPUT:
            return this.createExternalCallOutput();
        case ComputedUsagePackage.EXTERNAL_CALL_INPUT:
            return this.createExternalCallInput();
        case ComputedUsagePackage.OUTPUT:
            return this.createOutput();
        case ComputedUsagePackage.COMPUTED_USAGE:
            return this.createComputedUsage();
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
    public ComputedUsageContext createComputedUsageContext() {
        final ComputedUsageContextImpl computedUsageContext = new ComputedUsageContextImpl();
        return computedUsageContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BranchProbability createBranchProbability() {
        final BranchProbabilityImpl branchProbability = new BranchProbabilityImpl();
        return branchProbability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LoopIteration createLoopIteration() {
        final LoopIterationImpl loopIteration = new LoopIterationImpl();
        return loopIteration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Input createInput() {
        final InputImpl input = new InputImpl();
        return input;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExternalCallOutput createExternalCallOutput() {
        final ExternalCallOutputImpl externalCallOutput = new ExternalCallOutputImpl();
        return externalCallOutput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExternalCallInput createExternalCallInput() {
        final ExternalCallInputImpl externalCallInput = new ExternalCallInputImpl();
        return externalCallInput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Output createOutput() {
        final OutputImpl output = new OutputImpl();
        return output;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedUsage createComputedUsage() {
        final ComputedUsageImpl computedUsage = new ComputedUsageImpl();
        return computedUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedUsagePackage getComputedUsagePackage() {
        return (ComputedUsagePackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ComputedUsagePackage getPackage() {
        return ComputedUsagePackage.eINSTANCE;
    }

} // ComputedUsageFactoryImpl
