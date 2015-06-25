/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.solver.spa.ProcessBehaviour;
import org.palladiosimulator.solver.spa.SPAModel;
import org.palladiosimulator.solver.spa.SpaFactory;
import org.palladiosimulator.solver.spa.SpaPackage;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.impl.ExpressionPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SpaPackageImpl extends EPackageImpl implements SpaPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass processBehaviourEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass spaModelEClass = null;

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
     * @see org.palladiosimulator.solver.spa.SpaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SpaPackageImpl() {
        super(eNS_URI, SpaFactory.eINSTANCE);
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
     * This method is used to initialize {@link SpaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SpaPackage init() {
        if (isInited) {
            return (SpaPackage) EPackage.Registry.INSTANCE.getEPackage(SpaPackage.eNS_URI);
        }

        // Obtain or create and register package
        final SpaPackageImpl theSpaPackage = (SpaPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof SpaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new SpaPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
                        : ExpressionPackage.eINSTANCE);

        // Create package meta-data objects
        theSpaPackage.createPackageContents();
        theExpressionPackage.createPackageContents();

        // Initialize created meta-data
        theSpaPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSpaPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SpaPackage.eNS_URI, theSpaPackage);
        return theSpaPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProcessBehaviour() {
        return this.processBehaviourEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getProcessBehaviour_NumReplicas() {
        return (EAttribute) this.processBehaviourEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getProcessBehaviour_Name() {
        return (EAttribute) this.processBehaviourEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProcessBehaviour_Behaviour() {
        return (EReference) this.processBehaviourEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSPAModel() {
        return this.spaModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSPAModel_Processes() {
        return (EReference) this.spaModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSPAModel_Resources() {
        return (EReference) this.spaModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SpaFactory getSpaFactory() {
        return (SpaFactory) this.getEFactoryInstance();
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
        this.processBehaviourEClass = this.createEClass(PROCESS_BEHAVIOUR);
        this.createEAttribute(this.processBehaviourEClass, PROCESS_BEHAVIOUR__NUM_REPLICAS);
        this.createEAttribute(this.processBehaviourEClass, PROCESS_BEHAVIOUR__NAME);
        this.createEReference(this.processBehaviourEClass, PROCESS_BEHAVIOUR__BEHAVIOUR);

        this.spaModelEClass = this.createEClass(SPA_MODEL);
        this.createEReference(this.spaModelEClass, SPA_MODEL__PROCESSES);
        this.createEReference(this.spaModelEClass, SPA_MODEL__RESOURCES);
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
        final ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI);
        final org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage theResourceModelPackage = (org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage) EPackage.Registry.INSTANCE
                .getEPackage(org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage.eNS_URI);

        // Add subpackages
        this.getESubpackages().add(theExpressionPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.processBehaviourEClass, ProcessBehaviour.class, "ProcessBehaviour", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getProcessBehaviour_NumReplicas(), this.ecorePackage.getEInt(), "numReplicas", null, 0,
                1, ProcessBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessBehaviour_Name(), this.ecorePackage.getEString(), "name", "", 0, 1,
                ProcessBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getProcessBehaviour_Behaviour(), theExpressionPackage.getExpression(), null,
                "behaviour", null, 1, 1, ProcessBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.spaModelEClass, SPAModel.class, "SPAModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSPAModel_Processes(), this.getProcessBehaviour(), null, "processes", null, 0, -1,
                SPAModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getSPAModel_Resources(), theResourceModelPackage.getResource(), null, "resources",
                null, 0, -1, SPAModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // SpaPackageImpl
