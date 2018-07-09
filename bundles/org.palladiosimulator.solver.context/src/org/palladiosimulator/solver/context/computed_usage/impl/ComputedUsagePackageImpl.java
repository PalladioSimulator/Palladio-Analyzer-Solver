/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.CorePackage;
import org.palladiosimulator.pcm.core.composition.CompositionPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.parameter.ParameterPackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedUsageContextPackageImpl;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;
import org.palladiosimulator.solver.context.computed_allocation.impl.ComputedAllocationPackageImpl;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputedUsagePackageImpl extends EPackageImpl implements ComputedUsagePackage {

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
    private EClass computedUsageContextEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass branchProbabilityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass loopIterationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass inputEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass externalCallOutputEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass externalCallInputEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass outputEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass computedUsageEClass = null;

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
     * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ComputedUsagePackageImpl() {
        super(eNS_URI, ComputedUsageFactory.eINSTANCE);
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
     * This method is used to initialize {@link ComputedUsagePackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ComputedUsagePackage init() {
        if (isInited) {
            return (ComputedUsagePackage) EPackage.Registry.INSTANCE.getEPackage(ComputedUsagePackage.eNS_URI);
        }

        // Obtain or create and register package
        final ComputedUsagePackageImpl theComputedUsagePackage = (ComputedUsagePackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ComputedUsagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ComputedUsagePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final ComputedAllocationPackageImpl theComputedAllocationPackage = (ComputedAllocationPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ComputedAllocationPackage.eNS_URI) instanceof ComputedAllocationPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(ComputedAllocationPackage.eNS_URI)
                : ComputedAllocationPackage.eINSTANCE);
        final AggregatedUsageContextPackageImpl theAggregatedUsageContextPackage = (AggregatedUsageContextPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(AggregatedUsageContextPackage.eNS_URI) instanceof AggregatedUsageContextPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(AggregatedUsageContextPackage.eNS_URI)
                : AggregatedUsageContextPackage.eINSTANCE);

        // Create package meta-data objects
        theComputedUsagePackage.createPackageContents();
        theComputedAllocationPackage.createPackageContents();
        theAggregatedUsageContextPackage.createPackageContents();

        // Initialize created meta-data
        theComputedUsagePackage.initializePackageContents();
        theComputedAllocationPackage.initializePackageContents();
        theAggregatedUsageContextPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theComputedUsagePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ComputedUsagePackage.eNS_URI, theComputedUsagePackage);
        return theComputedUsagePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComputedUsageContext() {
        return this.computedUsageContextEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_BranchProbabilities_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_Loopiterations_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_AssemblyContext_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_Input_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_ExternalCallOutput_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_ExternalCallInput_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsageContext_Output_ComputedUsageContext() {
        return (EReference) this.computedUsageContextEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBranchProbability() {
        return this.branchProbabilityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBranchProbability_Probability() {
        return (EAttribute) this.branchProbabilityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBranchProbability_Branchtransition_BranchProbability() {
        return (EReference) this.branchProbabilityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLoopIteration() {
        return this.loopIterationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLoopIteration_Loopaction_LoopIteration() {
        return (EReference) this.loopIterationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLoopIteration_Specification_LoopIteration() {
        return (EReference) this.loopIterationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInput() {
        return this.inputEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInput_ParameterChacterisations_Input() {
        return (EReference) this.inputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExternalCallOutput() {
        return this.externalCallOutputEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExternalCallOutput_ParameterCharacterisations_ExternalCallOutput() {
        return (EReference) this.externalCallOutputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExternalCallOutput_ExternalCallAction_ExternalCallOutput() {
        return (EReference) this.externalCallOutputEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExternalCallInput() {
        return this.externalCallInputEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExternalCallInput_ParameterCharacterisations_ExternalCallInput() {
        return (EReference) this.externalCallInputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExternalCallInput_ExternalCallAction_ExternalCallInput() {
        return (EReference) this.externalCallInputEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExternalCallInput_ComputedUsageContext_ExternalCallInput() {
        return (EReference) this.externalCallInputEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOutput() {
        return this.outputEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutput_ParameterCharacterisations_Output() {
        return (EReference) this.outputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComputedUsage() {
        return this.computedUsageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComputedUsage_UsageContexts_ComputedUsage() {
        return (EReference) this.computedUsageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedUsageFactory getComputedUsageFactory() {
        return (ComputedUsageFactory) this.getEFactoryInstance();
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
        this.computedUsageContextEClass = this.createEClass(COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass,
                COMPUTED_USAGE_CONTEXT__BRANCH_PROBABILITIES_COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass,
                COMPUTED_USAGE_CONTEXT__LOOPITERATIONS_COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass,
                COMPUTED_USAGE_CONTEXT__ASSEMBLY_CONTEXT_COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass, COMPUTED_USAGE_CONTEXT__INPUT_COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass,
                COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_OUTPUT_COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass,
                COMPUTED_USAGE_CONTEXT__EXTERNAL_CALL_INPUT_COMPUTED_USAGE_CONTEXT);
        this.createEReference(this.computedUsageContextEClass, COMPUTED_USAGE_CONTEXT__OUTPUT_COMPUTED_USAGE_CONTEXT);

        this.branchProbabilityEClass = this.createEClass(BRANCH_PROBABILITY);
        this.createEAttribute(this.branchProbabilityEClass, BRANCH_PROBABILITY__PROBABILITY);
        this.createEReference(this.branchProbabilityEClass, BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY);

        this.loopIterationEClass = this.createEClass(LOOP_ITERATION);
        this.createEReference(this.loopIterationEClass, LOOP_ITERATION__LOOPACTION_LOOP_ITERATION);
        this.createEReference(this.loopIterationEClass, LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION);

        this.inputEClass = this.createEClass(INPUT);
        this.createEReference(this.inputEClass, INPUT__PARAMETER_CHACTERISATIONS_INPUT);

        this.externalCallOutputEClass = this.createEClass(EXTERNAL_CALL_OUTPUT);
        this.createEReference(this.externalCallOutputEClass,
                EXTERNAL_CALL_OUTPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_OUTPUT);
        this.createEReference(this.externalCallOutputEClass,
                EXTERNAL_CALL_OUTPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_OUTPUT);

        this.externalCallInputEClass = this.createEClass(EXTERNAL_CALL_INPUT);
        this.createEReference(this.externalCallInputEClass,
                EXTERNAL_CALL_INPUT__PARAMETER_CHARACTERISATIONS_EXTERNAL_CALL_INPUT);
        this.createEReference(this.externalCallInputEClass,
                EXTERNAL_CALL_INPUT__EXTERNAL_CALL_ACTION_EXTERNAL_CALL_INPUT);
        this.createEReference(this.externalCallInputEClass,
                EXTERNAL_CALL_INPUT__COMPUTED_USAGE_CONTEXT_EXTERNAL_CALL_INPUT);

        this.outputEClass = this.createEClass(OUTPUT);
        this.createEReference(this.outputEClass, OUTPUT__PARAMETER_CHARACTERISATIONS_OUTPUT);

        this.computedUsageEClass = this.createEClass(COMPUTED_USAGE);
        this.createEReference(this.computedUsageEClass, COMPUTED_USAGE__USAGE_CONTEXTS_COMPUTED_USAGE);
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
        final CompositionPackage theCompositionPackage = (CompositionPackage) EPackage.Registry.INSTANCE
                .getEPackage(CompositionPackage.eNS_URI);
        final SeffPackage theSeffPackage = (SeffPackage) EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);
        final CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        final ParameterPackage theParameterPackage = (ParameterPackage) EPackage.Registry.INSTANCE
                .getEPackage(ParameterPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.computedUsageContextEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.computedUsageContextEClass, ComputedUsageContext.class, "ComputedUsageContext",
                !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComputedUsageContext_BranchProbabilities_ComputedUsageContext(),
                this.getBranchProbability(),
                null, "branchProbabilities_ComputedUsageContext", null, 0, -1, ComputedUsageContext.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComputedUsageContext_Loopiterations_ComputedUsageContext(),
                this.getLoopIteration(), null,
                "loopiterations_ComputedUsageContext", null, 0, -1, ComputedUsageContext.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEReference(this.getComputedUsageContext_AssemblyContext_ComputedUsageContext(),
                theCompositionPackage.getAssemblyContext(), null, "assemblyContext_ComputedUsageContext", null, 1, 1,
                ComputedUsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComputedUsageContext_Input_ComputedUsageContext(), this.getInput(), null,
                "input_ComputedUsageContext", null, 1, 1, ComputedUsageContext.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComputedUsageContext_ExternalCallOutput_ComputedUsageContext(),
                this.getExternalCallOutput(),
                null, "externalCallOutput_ComputedUsageContext", null, 0, -1, ComputedUsageContext.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComputedUsageContext_ExternalCallInput_ComputedUsageContext(),
                this.getExternalCallInput(),
                this.getExternalCallInput_ComputedUsageContext_ExternalCallInput(),
                "externalCallInput_ComputedUsageContext", null, 0, -1, ComputedUsageContext.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEReference(this.getComputedUsageContext_Output_ComputedUsageContext(), this.getOutput(), null,
                "output_ComputedUsageContext", null, 1, 1, ComputedUsageContext.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.branchProbabilityEClass, BranchProbability.class, "BranchProbability", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getBranchProbability_Probability(), this.ecorePackage.getEDouble(), "probability",
                null, 1, 1,
                BranchProbability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getBranchProbability_Branchtransition_BranchProbability(),
                theSeffPackage.getAbstractBranchTransition(), null, "branchtransition_BranchProbability", null, 1, 1,
                BranchProbability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.loopIterationEClass, LoopIteration.class, "LoopIteration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getLoopIteration_Loopaction_LoopIteration(), theSeffPackage.getAbstractLoopAction(),
                null,
                "loopaction_LoopIteration", null, 1, 1, LoopIteration.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getLoopIteration_Specification_LoopIteration(), theCorePackage.getPCMRandomVariable(),
                null,
                "specification_LoopIteration", null, 1, 1, LoopIteration.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getInput_ParameterChacterisations_Input(), theParameterPackage.getVariableUsage(),
                null,
                "parameterChacterisations_Input", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.externalCallOutputEClass, ExternalCallOutput.class, "ExternalCallOutput", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getExternalCallOutput_ParameterCharacterisations_ExternalCallOutput(),
                theParameterPackage.getVariableUsage(), null, "parameterCharacterisations_ExternalCallOutput", null, 0,
                -1, ExternalCallOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExternalCallOutput_ExternalCallAction_ExternalCallOutput(),
                theSeffPackage.getExternalCallAction(), null, "externalCallAction_ExternalCallOutput", null, 1, 1,
                ExternalCallOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.externalCallInputEClass, ExternalCallInput.class, "ExternalCallInput", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getExternalCallInput_ParameterCharacterisations_ExternalCallInput(),
                theParameterPackage.getVariableUsage(), null, "parameterCharacterisations_ExternalCallInput", null, 0,
                -1, ExternalCallInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExternalCallInput_ExternalCallAction_ExternalCallInput(),
                theSeffPackage.getExternalCallAction(), null, "externalCallAction_ExternalCallInput", null, 1, 1,
                ExternalCallInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExternalCallInput_ComputedUsageContext_ExternalCallInput(),
                this.getComputedUsageContext(),
                this.getComputedUsageContext_ExternalCallInput_ComputedUsageContext(),
                "computedUsageContext_ExternalCallInput", null, 1, 1, ExternalCallInput.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOutput_ParameterCharacterisations_Output(), theParameterPackage.getVariableUsage(),
                null,
                "parameterCharacterisations_Output", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.computedUsageEClass, ComputedUsage.class, "ComputedUsage", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComputedUsage_UsageContexts_ComputedUsage(), this.getComputedUsageContext(), null,
                "usageContexts_ComputedUsage", null, 0, -1, ComputedUsage.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ComputedUsagePackageImpl
