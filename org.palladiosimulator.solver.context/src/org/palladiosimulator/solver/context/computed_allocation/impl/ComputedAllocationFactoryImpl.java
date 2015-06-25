/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_allocation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocation;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationFactory;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;
import org.palladiosimulator.solver.context.computed_allocation.ResourceDemand;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputedAllocationFactoryImpl extends EFactoryImpl implements ComputedAllocationFactory {

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
    public static ComputedAllocationFactory init() {
        try
        {
            final ComputedAllocationFactory theComputedAllocationFactory = (ComputedAllocationFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ComputedAllocationPackage.eNS_URI);
            if (theComputedAllocationFactory != null)
            {
                return theComputedAllocationFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ComputedAllocationFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ComputedAllocationFactoryImpl() {
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
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT:
            return this.createComputedAllocationContext();
        case ComputedAllocationPackage.RESOURCE_DEMAND:
            return this.createResourceDemand();
        case ComputedAllocationPackage.COMPUTED_ALLOCATION:
            return this.createComputedAllocation();
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
    public ComputedAllocationContext createComputedAllocationContext() {
        final ComputedAllocationContextImpl computedAllocationContext = new ComputedAllocationContextImpl();
        return computedAllocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceDemand createResourceDemand() {
        final ResourceDemandImpl resourceDemand = new ResourceDemandImpl();
        return resourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedAllocation createComputedAllocation() {
        final ComputedAllocationImpl computedAllocation = new ComputedAllocationImpl();
        return computedAllocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedAllocationPackage getComputedAllocationPackage() {
        return (ComputedAllocationPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ComputedAllocationPackage getPackage() {
        return ComputedAllocationPackage.eINSTANCE;
    }

} // ComputedAllocationFactoryImpl
