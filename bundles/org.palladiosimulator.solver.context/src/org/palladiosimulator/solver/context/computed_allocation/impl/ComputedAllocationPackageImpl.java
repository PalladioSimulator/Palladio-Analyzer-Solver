/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_allocation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.CorePackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.seff.seff_performance.SeffPerformancePackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedUsageContextPackageImpl;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocation;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationFactory;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;
import org.palladiosimulator.solver.context.computed_allocation.ResourceDemand;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.impl.ComputedUsagePackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputedAllocationPackageImpl extends EPackageImpl implements ComputedAllocationPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass computedAllocationContextEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceDemandEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass computedAllocationEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ComputedAllocationPackageImpl() {
        super(eNS_URI, ComputedAllocationFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link ComputedAllocationPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ComputedAllocationPackage init() {
        if (isInited) {
            return (ComputedAllocationPackage) EPackage.Registry.INSTANCE
                    .getEPackage(ComputedAllocationPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ComputedAllocationPackageImpl theComputedAllocationPackage = (ComputedAllocationPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ComputedAllocationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ComputedAllocationPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final ComputedUsagePackageImpl theComputedUsagePackage = (ComputedUsagePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ComputedUsagePackage.eNS_URI) instanceof ComputedUsagePackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(ComputedUsagePackage.eNS_URI)
                : ComputedUsagePackage.eINSTANCE);
        final AggregatedUsageContextPackageImpl theAggregatedUsageContextPackage = (AggregatedUsageContextPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(AggregatedUsageContextPackage.eNS_URI) instanceof AggregatedUsageContextPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(AggregatedUsageContextPackage.eNS_URI)
                : AggregatedUsageContextPackage.eINSTANCE);

        // Create package meta-data objects
        theComputedAllocationPackage.createPackageContents();
        theComputedUsagePackage.createPackageContents();
        theAggregatedUsageContextPackage.createPackageContents();

        // Initialize created meta-data
        theComputedAllocationPackage.initializePackageContents();
        theComputedUsagePackage.initializePackageContents();
        theAggregatedUsageContextPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theComputedAllocationPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ComputedAllocationPackage.eNS_URI, theComputedAllocationPackage);
        return theComputedAllocationPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComputedAllocationContext() {
        return this.computedAllocationContextEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedAllocationContext_ResourceDemands_ComputedAllocationContext() {
        return (EReference) this.computedAllocationContextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedAllocationContext_UsageContext_ComputedAllocationContext() {
        return (EReference) this.computedAllocationContextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedAllocationContext_AllocationContext_ComputedAllocationContext() {
        return (EReference) this.computedAllocationContextEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceDemand() {
        return this.resourceDemandEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceDemand_ParametricResourceDemand_ResourceDemand() {
        return (EReference) this.resourceDemandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceDemand_Specification_ResourceDemand() {
        return (EReference) this.resourceDemandEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComputedAllocation() {
        return this.computedAllocationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedAllocation_ComputedAllocationContexts_ComputedAllocation() {
        return (EReference) this.computedAllocationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedAllocationFactory getComputedAllocationFactory() {
        return (ComputedAllocationFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.computedAllocationContextEClass = this.createEClass(COMPUTED_ALLOCATION_CONTEXT);
        this.createEReference(this.computedAllocationContextEClass,
                COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT);
        this.createEReference(this.computedAllocationContextEClass,
                COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT);
        this.createEReference(this.computedAllocationContextEClass,
                COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT);

        this.resourceDemandEClass = this.createEClass(RESOURCE_DEMAND);
        this.createEReference(this.resourceDemandEClass, RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND);
        this.createEReference(this.resourceDemandEClass, RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND);

        this.computedAllocationEClass = this.createEClass(COMPUTED_ALLOCATION);
        this.createEReference(this.computedAllocationEClass,
                COMPUTED_ALLOCATION__COMPUTED_ALLOCATION_CONTEXTS_COMPUTED_ALLOCATION);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);
        final ComputedUsagePackage theComputedUsagePackage = (ComputedUsagePackage) EPackage.Registry.INSTANCE
                .getEPackage(ComputedUsagePackage.eNS_URI);
        final AllocationPackage theAllocationPackage = (AllocationPackage) EPackage.Registry.INSTANCE
                .getEPackage(AllocationPackage.eNS_URI);
        final SeffPerformancePackage theSeffPerformancePackage = (SeffPerformancePackage) EPackage.Registry.INSTANCE
                .getEPackage(SeffPerformancePackage.eNS_URI);
        final CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.computedAllocationContextEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.computedAllocationContextEClass, ComputedAllocationContext.class,
                "ComputedAllocationContext",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComputedAllocationContext_ResourceDemands_ComputedAllocationContext(),
                this.getResourceDemand(), null, "resourceDemands_ComputedAllocationContext", null, 0, -1,
                ComputedAllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComputedAllocationContext_UsageContext_ComputedAllocationContext(),
                theComputedUsagePackage.getComputedUsageContext(), null, "usageContext_ComputedAllocationContext",
                null, 1, 1, ComputedAllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComputedAllocationContext_AllocationContext_ComputedAllocationContext(),
                theAllocationPackage.getAllocationContext(), null, "allocationContext_ComputedAllocationContext", null,
                1, 1, ComputedAllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.resourceDemandEClass, ResourceDemand.class, "ResourceDemand", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceDemand_ParametricResourceDemand_ResourceDemand(),
                theSeffPerformancePackage.getParametricResourceDemand(), null,
                "parametricResourceDemand_ResourceDemand", null, 1, 1, ResourceDemand.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEReference(this.getResourceDemand_Specification_ResourceDemand(),
                theCorePackage.getPCMRandomVariable(), null,
                "specification_ResourceDemand", null, 1, 1, ResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.computedAllocationEClass, ComputedAllocation.class, "ComputedAllocation", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComputedAllocation_ComputedAllocationContexts_ComputedAllocation(),
                this.getComputedAllocationContext(), null, "computedAllocationContexts_ComputedAllocation", null, 0,
                -1, ComputedAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ComputedAllocationPackageImpl
