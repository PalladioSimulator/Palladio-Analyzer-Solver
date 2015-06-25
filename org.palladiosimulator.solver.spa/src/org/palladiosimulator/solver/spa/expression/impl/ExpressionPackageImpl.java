/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.solver.spa.SpaPackage;
import org.palladiosimulator.solver.spa.expression.Acquire;
import org.palladiosimulator.solver.spa.expression.Alternative;
import org.palladiosimulator.solver.spa.expression.Expression;
import org.palladiosimulator.solver.spa.expression.ExpressionFactory;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.Loop;
import org.palladiosimulator.solver.spa.expression.Operation;
import org.palladiosimulator.solver.spa.expression.Option;
import org.palladiosimulator.solver.spa.expression.Parallel;
import org.palladiosimulator.solver.spa.expression.Release;
import org.palladiosimulator.solver.spa.expression.Sequence;
import org.palladiosimulator.solver.spa.expression.Symbol;
import org.palladiosimulator.solver.spa.expression.Terminal;
import org.palladiosimulator.solver.spa.impl.SpaPackageImpl;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass terminalEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass symbolEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sequenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass operationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass releaseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass parallelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass optionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass loopEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass alternativeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass acquireEClass = null;

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
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ExpressionPackageImpl() {
        super(eNS_URI, ExpressionFactory.eINSTANCE);
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
     * This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ExpressionPackage init() {
        if (isInited) {
            return (ExpressionPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ExpressionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final SpaPackageImpl theSpaPackage = (SpaPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SpaPackage.eNS_URI) instanceof SpaPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SpaPackage.eNS_URI) : SpaPackage.eINSTANCE);

        // Create package meta-data objects
        theExpressionPackage.createPackageContents();
        theSpaPackage.createPackageContents();

        // Initialize created meta-data
        theExpressionPackage.initializePackageContents();
        theSpaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theExpressionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
        return theExpressionPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getTerminal() {
        return this.terminalEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExpression() {
        return this.expressionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSymbol() {
        return this.symbolEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSymbol_Name() {
        return (EAttribute) this.symbolEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSymbol_ResourceUsages() {
        return (EReference) this.symbolEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSequence() {
        return this.sequenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSequence_LeftRegExp() {
        return (EReference) this.sequenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSequence_RightRegExp() {
        return (EReference) this.sequenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getOperation() {
        return this.operationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRelease() {
        return this.releaseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRelease_Resource() {
        return (EReference) this.releaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getParallel() {
        return this.parallelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getParallel_LeftTask() {
        return (EReference) this.parallelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getParallel_RightTask() {
        return (EReference) this.parallelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getOption() {
        return this.optionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getOption_Probability() {
        return (EAttribute) this.optionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getOption_Regexp() {
        return (EReference) this.optionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getLoop() {
        return this.loopEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getLoop_RegExp() {
        return (EReference) this.loopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getLoop_IterationsPMF() {
        return (EReference) this.loopEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getLoop_IterationsString() {
        return (EAttribute) this.loopEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAlternative() {
        return this.alternativeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAlternative_LeftOption() {
        return (EReference) this.alternativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAlternative_RightOption() {
        return (EReference) this.alternativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAcquire() {
        return this.acquireEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAcquire_Resource() {
        return (EReference) this.acquireEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExpressionFactory getExpressionFactory() {
        return (ExpressionFactory) this.getEFactoryInstance();
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
        this.terminalEClass = this.createEClass(TERMINAL);

        this.expressionEClass = this.createEClass(EXPRESSION);

        this.symbolEClass = this.createEClass(SYMBOL);
        this.createEAttribute(this.symbolEClass, SYMBOL__NAME);
        this.createEReference(this.symbolEClass, SYMBOL__RESOURCE_USAGES);

        this.sequenceEClass = this.createEClass(SEQUENCE);
        this.createEReference(this.sequenceEClass, SEQUENCE__LEFT_REG_EXP);
        this.createEReference(this.sequenceEClass, SEQUENCE__RIGHT_REG_EXP);

        this.operationEClass = this.createEClass(OPERATION);

        this.releaseEClass = this.createEClass(RELEASE);
        this.createEReference(this.releaseEClass, RELEASE__RESOURCE);

        this.parallelEClass = this.createEClass(PARALLEL);
        this.createEReference(this.parallelEClass, PARALLEL__LEFT_TASK);
        this.createEReference(this.parallelEClass, PARALLEL__RIGHT_TASK);

        this.optionEClass = this.createEClass(OPTION);
        this.createEAttribute(this.optionEClass, OPTION__PROBABILITY);
        this.createEReference(this.optionEClass, OPTION__REGEXP);

        this.loopEClass = this.createEClass(LOOP);
        this.createEReference(this.loopEClass, LOOP__REG_EXP);
        this.createEReference(this.loopEClass, LOOP__ITERATIONS_PMF);
        this.createEAttribute(this.loopEClass, LOOP__ITERATIONS_STRING);

        this.alternativeEClass = this.createEClass(ALTERNATIVE);
        this.createEReference(this.alternativeEClass, ALTERNATIVE__LEFT_OPTION);
        this.createEReference(this.alternativeEClass, ALTERNATIVE__RIGHT_OPTION);

        this.acquireEClass = this.createEClass(ACQUIRE);
        this.createEReference(this.acquireEClass, ACQUIRE__RESOURCE);
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
        final org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage theResourceModelPackage = (org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage) EPackage.Registry.INSTANCE
                .getEPackage(org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage.eNS_URI);
        final ProbfunctionPackage theProbfunctionPackage = (ProbfunctionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ProbfunctionPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.terminalEClass.getESuperTypes().add(this.getExpression());
        this.symbolEClass.getESuperTypes().add(this.getTerminal());
        this.sequenceEClass.getESuperTypes().add(this.getOperation());
        this.operationEClass.getESuperTypes().add(this.getExpression());
        this.releaseEClass.getESuperTypes().add(this.getTerminal());
        this.parallelEClass.getESuperTypes().add(this.getOperation());
        this.loopEClass.getESuperTypes().add(this.getOperation());
        this.alternativeEClass.getESuperTypes().add(this.getOperation());
        this.acquireEClass.getESuperTypes().add(this.getTerminal());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.terminalEClass, Terminal.class, "Terminal", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getSymbol_Name(), this.ecorePackage.getEString(), "name", "", 0, 1, Symbol.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getSymbol_ResourceUsages(), theResourceModelPackage.getResourceUsage(), null,
                "resourceUsages", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSequence_LeftRegExp(), this.getExpression(), null, "leftRegExp", null, 1, 1,
                Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getSequence_RightRegExp(), this.getExpression(), null, "rightRegExp", null, 1, 1,
                Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRelease_Resource(), theResourceModelPackage.getPassiveResource(), null, "resource",
                null, 1, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getParallel_LeftTask(), this.getExpression(), null, "leftTask", null, 0, 1,
                Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getParallel_RightTask(), this.getExpression(), null, "rightTask", null, 0, 1,
                Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getOption_Probability(), this.ecorePackage.getEDouble(), "probability", null, 0, 1,
                Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getOption_Regexp(), this.getExpression(), null, "regexp", null, 1, 1, Option.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getLoop_RegExp(), this.getExpression(), null, "regExp", null, 1, 1, Loop.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getLoop_IterationsPMF(), theProbfunctionPackage.getProbabilityMassFunction(), null,
                "iterationsPMF", null, 0, 1, Loop.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLoop_IterationsString(), this.ecorePackage.getEString(), "iterationsString", "", 0,
                1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAlternative_LeftOption(), this.getOption(), null, "leftOption", null, 1, 1,
                Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getAlternative_RightOption(), this.getOption(), null, "rightOption", null, 1, 1,
                Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.acquireEClass, Acquire.class, "Acquire", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAcquire_Resource(), theResourceModelPackage.getPassiveResource(), null, "resource",
                null, 1, 1, Acquire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} // ExpressionPackageImpl
