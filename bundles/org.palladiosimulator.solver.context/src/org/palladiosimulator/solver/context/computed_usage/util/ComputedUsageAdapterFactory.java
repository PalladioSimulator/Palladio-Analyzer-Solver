/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage
 * @generated
 */
public class ComputedUsageAdapterFactory extends AdapterFactoryImpl {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ComputedUsagePackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ComputedUsageAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = ComputedUsagePackage.eINSTANCE;
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
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
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
    protected ComputedUsageSwitch<Adapter> modelSwitch = new ComputedUsageSwitch<Adapter>()
            {
        @Override
        public Adapter caseComputedUsageContext(final ComputedUsageContext object)
        {
            return ComputedUsageAdapterFactory.this.createComputedUsageContextAdapter();
        }

        @Override
        public Adapter caseBranchProbability(final BranchProbability object)
        {
            return ComputedUsageAdapterFactory.this.createBranchProbabilityAdapter();
        }

        @Override
        public Adapter caseLoopIteration(final LoopIteration object)
        {
            return ComputedUsageAdapterFactory.this.createLoopIterationAdapter();
        }

        @Override
        public Adapter caseInput(final Input object)
        {
            return ComputedUsageAdapterFactory.this.createInputAdapter();
        }

        @Override
        public Adapter caseExternalCallOutput(final ExternalCallOutput object)
        {
            return ComputedUsageAdapterFactory.this.createExternalCallOutputAdapter();
        }

        @Override
        public Adapter caseExternalCallInput(final ExternalCallInput object)
        {
            return ComputedUsageAdapterFactory.this.createExternalCallInputAdapter();
        }

        @Override
        public Adapter caseOutput(final Output object)
        {
            return ComputedUsageAdapterFactory.this.createOutputAdapter();
        }

        @Override
        public Adapter caseComputedUsage(final ComputedUsage object)
        {
            return ComputedUsageAdapterFactory.this.createComputedUsageAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return ComputedUsageAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return ComputedUsageAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object)
        {
            return ComputedUsageAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return ComputedUsageAdapterFactory.this.createEObjectAdapter();
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
     * {@link org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext
     * <em>Context</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext
             * @generated
             */
            public Adapter createComputedUsageContextAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.context.computed_usage.BranchProbability
     * <em>Branch Probability</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.BranchProbability
             * @generated
             */
            public Adapter createBranchProbabilityAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.context.computed_usage.LoopIteration
     * <em>Loop Iteration</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.LoopIteration
             * @generated
             */
            public Adapter createLoopIterationAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.solver.context.computed_usage.Input <em>Input</em>}'. <!--
             * begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
             * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.Input
             * @generated
             */
            public Adapter createInputAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.context.computed_usage.ExternalCallOutput
     * <em>External Call Output</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.ExternalCallOutput
             * @generated
             */
            public Adapter createExternalCallOutputAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.context.computed_usage.ExternalCallInput
     * <em>External Call Input</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.ExternalCallInput
             * @generated
             */
            public Adapter createExternalCallInputAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.solver.context.computed_usage.Output <em>Output</em>}'. <!--
             * begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
             * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.Output
             * @generated
             */
            public Adapter createOutputAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.context.computed_usage.ComputedUsage
     * <em>Computed Usage</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsage
             * @generated
             */
            public Adapter createComputedUsageAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see de.uka.ipd.sdq.identifier.Identifier
             * @generated
             */
            public Adapter createIdentifierAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
             * begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
             * @return the new adapter.
             * @see org.palladiosimulator.pcm.core.entity.NamedElement
             * @generated
             */
            public Adapter createNamedElementAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.pcm.core.entity.Entity
             * @generated
             */
            public Adapter createEntityAdapter() {
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

} // ComputedUsageAdapterFactory
