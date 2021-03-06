/**
 */
package org.palladiosimulator.solver.spa.resourcemodel.impl;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.solver.spa.resourcemodel.AbstractResourceUsage;
import org.palladiosimulator.solver.spa.resourcemodel.ActiveResource;
import org.palladiosimulator.solver.spa.resourcemodel.AlternativeResourceUsage;
import org.palladiosimulator.solver.spa.resourcemodel.ContentionResource;
import org.palladiosimulator.solver.spa.resourcemodel.DelayResource;
import org.palladiosimulator.solver.spa.resourcemodel.Option;
import org.palladiosimulator.solver.spa.resourcemodel.PassiveResource;
import org.palladiosimulator.solver.spa.resourcemodel.ProcessingResource;
import org.palladiosimulator.solver.spa.resourcemodel.Resource;
import org.palladiosimulator.solver.spa.resourcemodel.ResourceModelFactory;
import org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage;
import org.palladiosimulator.solver.spa.resourcemodel.ResourceUsage;
import org.palladiosimulator.solver.spa.resourcemodel.SequentialResourceUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceModelPackageImpl extends EPackageImpl implements ResourceModelPackage {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sequentialResourceUsageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractResourceUsageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass alternativeResourceUsageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass optionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceUsageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activeResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passiveResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contentionResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processingResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass delayResourceEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ResourceModelPackageImpl() {
        super(eNS_URI, ResourceModelFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ResourceModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ResourceModelPackage init() {
        if (isInited)
            return (ResourceModelPackage) EPackage.Registry.INSTANCE.getEPackage(ResourceModelPackage.eNS_URI);

        // Obtain or create and register package
        ResourceModelPackageImpl theResourceModelPackage = (ResourceModelPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ResourceModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ResourceModelPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ProbfunctionPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theResourceModelPackage.createPackageContents();

        // Initialize created meta-data
        theResourceModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theResourceModelPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ResourceModelPackage.eNS_URI, theResourceModelPackage);
        return theResourceModelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSequentialResourceUsage() {
        return sequentialResourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSequentialResourceUsage_ResourceUsages() {
        return (EReference) sequentialResourceUsageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractResourceUsage() {
        return abstractResourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAlternativeResourceUsage() {
        return alternativeResourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAlternativeResourceUsage_Options() {
        return (EReference) alternativeResourceUsageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOption() {
        return optionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOption_Probability() {
        return (EAttribute) optionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOption_ResourceUsage() {
        return (EReference) optionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceUsage() {
        return resourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourceUsage_UsageTime() {
        return (EReference) resourceUsageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourceUsage_Resource() {
        return (EReference) resourceUsageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActiveResource() {
        return activeResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResource() {
        return resourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_Name() {
        return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_NumberOfServers() {
        return (EAttribute) resourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPassiveResource() {
        return passiveResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContentionResource() {
        return contentionResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContentionResource_NumReplicas() {
        return (EAttribute) contentionResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessingResource() {
        return processingResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelayResource() {
        return delayResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceModelFactory getResourceModelFactory() {
        return (ResourceModelFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        sequentialResourceUsageEClass = createEClass(SEQUENTIAL_RESOURCE_USAGE);
        createEReference(sequentialResourceUsageEClass, SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES);

        abstractResourceUsageEClass = createEClass(ABSTRACT_RESOURCE_USAGE);

        alternativeResourceUsageEClass = createEClass(ALTERNATIVE_RESOURCE_USAGE);
        createEReference(alternativeResourceUsageEClass, ALTERNATIVE_RESOURCE_USAGE__OPTIONS);

        optionEClass = createEClass(OPTION);
        createEAttribute(optionEClass, OPTION__PROBABILITY);
        createEReference(optionEClass, OPTION__RESOURCE_USAGE);

        resourceUsageEClass = createEClass(RESOURCE_USAGE);
        createEReference(resourceUsageEClass, RESOURCE_USAGE__USAGE_TIME);
        createEReference(resourceUsageEClass, RESOURCE_USAGE__RESOURCE);

        activeResourceEClass = createEClass(ACTIVE_RESOURCE);

        resourceEClass = createEClass(RESOURCE);
        createEAttribute(resourceEClass, RESOURCE__NAME);
        createEAttribute(resourceEClass, RESOURCE__NUMBER_OF_SERVERS);

        passiveResourceEClass = createEClass(PASSIVE_RESOURCE);

        contentionResourceEClass = createEClass(CONTENTION_RESOURCE);
        createEAttribute(contentionResourceEClass, CONTENTION_RESOURCE__NUM_REPLICAS);

        processingResourceEClass = createEClass(PROCESSING_RESOURCE);

        delayResourceEClass = createEClass(DELAY_RESOURCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ProbfunctionPackage theProbfunctionPackage = (ProbfunctionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ProbfunctionPackage.eNS_URI);

        // Add supertypes to classes
        sequentialResourceUsageEClass.getESuperTypes().add(this.getAbstractResourceUsage());
        alternativeResourceUsageEClass.getESuperTypes().add(this.getAbstractResourceUsage());
        resourceUsageEClass.getESuperTypes().add(this.getAbstractResourceUsage());
        activeResourceEClass.getESuperTypes().add(this.getResource());
        passiveResourceEClass.getESuperTypes().add(this.getContentionResource());
        contentionResourceEClass.getESuperTypes().add(this.getResource());
        processingResourceEClass.getESuperTypes().add(this.getContentionResource());
        processingResourceEClass.getESuperTypes().add(this.getActiveResource());
        delayResourceEClass.getESuperTypes().add(this.getActiveResource());

        // Initialize classes and features; add operations and parameters
        initEClass(sequentialResourceUsageEClass, SequentialResourceUsage.class, "SequentialResourceUsage",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSequentialResourceUsage_ResourceUsages(), this.getAbstractResourceUsage(), null,
                "resourceUsages", null, 0, -1, SequentialResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractResourceUsageEClass, AbstractResourceUsage.class, "AbstractResourceUsage", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(alternativeResourceUsageEClass, AlternativeResourceUsage.class, "AlternativeResourceUsage",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAlternativeResourceUsage_Options(), this.getOption(), null, "options", null, 0, -1,
                AlternativeResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOption_Probability(), ecorePackage.getEDouble(), "probability", null, 1, 1, Option.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getOption_ResourceUsage(), this.getAbstractResourceUsage(), null, "resourceUsage", null, 1, 1,
                Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceUsageEClass, ResourceUsage.class, "ResourceUsage", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResourceUsage_UsageTime(), theProbfunctionPackage.getProbabilityDensityFunction(), null,
                "usageTime", null, 1, 1, ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getResourceUsage_Resource(), this.getActiveResource(), null, "resource", null, 1, 1,
                ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activeResourceEClass, ActiveResource.class, "ActiveResource", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", "", 1, 1, Resource.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getResource_NumberOfServers(), ecorePackage.getEInt(), "numberOfServers", null, 1, 1,
                Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(passiveResourceEClass, PassiveResource.class, "PassiveResource", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(contentionResourceEClass, ContentionResource.class, "ContentionResource", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContentionResource_NumReplicas(), ecorePackage.getEInt(), "numReplicas", null, 1, 1,
                ContentionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(processingResourceEClass, ProcessingResource.class, "ProcessingResource", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(delayResourceEClass, DelayResource.class, "DelayResource", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ResourceModelPackageImpl
