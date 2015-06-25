/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import static org.palladiosimulator.solver.resourcemodel.ResourceModelPackage.RESOURCE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.solver.resourcemodel.AbstractResourceUsage;
import org.palladiosimulator.solver.resourcemodel.ActiveResource;
import org.palladiosimulator.solver.resourcemodel.AlternativeResourceUsage;
import org.palladiosimulator.solver.resourcemodel.ContentionResource;
import org.palladiosimulator.solver.resourcemodel.DelayResource;
import org.palladiosimulator.solver.resourcemodel.Option;
import org.palladiosimulator.solver.resourcemodel.PassiveResource;
import org.palladiosimulator.solver.resourcemodel.ProcessingResource;
import org.palladiosimulator.solver.resourcemodel.Resource;
import org.palladiosimulator.solver.resourcemodel.ResourceModelFactory;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;
import org.palladiosimulator.solver.resourcemodel.ResourceUsage;
import org.palladiosimulator.solver.resourcemodel.SequentialResourceUsage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceModelPackageImpl extends EPackageImpl implements ResourceModelPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sequentialResourceUsageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass abstractResourceUsageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass alternativeResourceUsageEClass = null;

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
    private EClass resourceUsageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass activeResourceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass resourceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass passiveResourceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass contentionResourceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass processingResourceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass delayResourceEClass = null;

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
     * @see org.palladiosimulator.solver.resourcemodel.ResourceModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ResourceModelPackageImpl() {
        super(eNS_URI, ResourceModelFactory.eINSTANCE);
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
     * This method is used to initialize {@link ResourceModelPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ResourceModelPackage init() {
        if (isInited) {
            return (ResourceModelPackage) EPackage.Registry.INSTANCE.getEPackage(ResourceModelPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ResourceModelPackageImpl theResourceModelPackage = (ResourceModelPackageImpl) (EPackage.Registry.INSTANCE
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSequentialResourceUsage() {
        return this.sequentialResourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSequentialResourceUsage_ResourceUsages() {
        return (EReference) this.sequentialResourceUsageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAbstractResourceUsage() {
        return this.abstractResourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAlternativeResourceUsage() {
        return this.alternativeResourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAlternativeResourceUsage_Options() {
        return (EReference) this.alternativeResourceUsageEClass.getEStructuralFeatures().get(0);
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
    public EReference getOption_ResourceUsage() {
        return (EReference) this.optionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getResourceUsage() {
        return this.resourceUsageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResourceUsage_UsageTime() {
        return (EReference) this.resourceUsageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResourceUsage_Resource() {
        return (EReference) this.resourceUsageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getActiveResource() {
        return this.activeResourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getResource() {
        return this.resourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getResource_Name() {
        return (EAttribute) this.resourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getResource_NumberOfServers() {
        return (EAttribute) this.resourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getPassiveResource() {
        return this.passiveResourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getContentionResource() {
        return this.contentionResourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getContentionResource_NumReplicas() {
        return (EAttribute) this.contentionResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProcessingResource() {
        return this.processingResourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDelayResource() {
        return this.delayResourceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceModelFactory getResourceModelFactory() {
        return (ResourceModelFactory) this.getEFactoryInstance();
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
        this.sequentialResourceUsageEClass = this.createEClass(SEQUENTIAL_RESOURCE_USAGE);
        this.createEReference(this.sequentialResourceUsageEClass, SEQUENTIAL_RESOURCE_USAGE__RESOURCE_USAGES);

        this.abstractResourceUsageEClass = this.createEClass(ABSTRACT_RESOURCE_USAGE);

        this.alternativeResourceUsageEClass = this.createEClass(ALTERNATIVE_RESOURCE_USAGE);
        this.createEReference(this.alternativeResourceUsageEClass, ALTERNATIVE_RESOURCE_USAGE__OPTIONS);

        this.optionEClass = this.createEClass(OPTION);
        this.createEAttribute(this.optionEClass, OPTION__PROBABILITY);
        this.createEReference(this.optionEClass, OPTION__RESOURCE_USAGE);

        this.resourceUsageEClass = this.createEClass(RESOURCE_USAGE);
        this.createEReference(this.resourceUsageEClass, RESOURCE_USAGE__USAGE_TIME);
        this.createEReference(this.resourceUsageEClass, RESOURCE_USAGE__RESOURCE);

        this.activeResourceEClass = this.createEClass(ACTIVE_RESOURCE);

        this.resourceEClass = this.createEClass(RESOURCE);
        this.createEAttribute(this.resourceEClass, RESOURCE__NAME);
        this.createEAttribute(this.resourceEClass, RESOURCE__NUMBER_OF_SERVERS);

        this.passiveResourceEClass = this.createEClass(PASSIVE_RESOURCE);

        this.contentionResourceEClass = this.createEClass(CONTENTION_RESOURCE);
        this.createEAttribute(this.contentionResourceEClass, CONTENTION_RESOURCE__NUM_REPLICAS);

        this.processingResourceEClass = this.createEClass(PROCESSING_RESOURCE);

        this.delayResourceEClass = this.createEClass(DELAY_RESOURCE);
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
        final ProbfunctionPackage theProbfunctionPackage = (ProbfunctionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ProbfunctionPackage.eNS_URI);

        // Add supertypes to classes
        this.sequentialResourceUsageEClass.getESuperTypes().add(this.getAbstractResourceUsage());
        this.alternativeResourceUsageEClass.getESuperTypes().add(this.getAbstractResourceUsage());
        this.resourceUsageEClass.getESuperTypes().add(this.getAbstractResourceUsage());
        this.activeResourceEClass.getESuperTypes().add(this.getResource());
        this.passiveResourceEClass.getESuperTypes().add(this.getContentionResource());
        this.contentionResourceEClass.getESuperTypes().add(this.getResource());
        this.processingResourceEClass.getESuperTypes().add(this.getContentionResource());
        this.processingResourceEClass.getESuperTypes().add(this.getActiveResource());
        this.delayResourceEClass.getESuperTypes().add(this.getActiveResource());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.sequentialResourceUsageEClass, SequentialResourceUsage.class, "SequentialResourceUsage",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSequentialResourceUsage_ResourceUsages(), this.getAbstractResourceUsage(), null,
                "resourceUsages", null, 0, -1, SequentialResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.abstractResourceUsageEClass, AbstractResourceUsage.class, "AbstractResourceUsage",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.alternativeResourceUsageEClass, AlternativeResourceUsage.class, "AlternativeResourceUsage",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAlternativeResourceUsage_Options(), this.getOption(), null, "options", null, 0, -1,
                AlternativeResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getOption_Probability(), this.ecorePackage.getEDouble(), "probability", null, 1, 1,
                Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getOption_ResourceUsage(), this.getAbstractResourceUsage(), null, "resourceUsage",
                null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resourceUsageEClass, ResourceUsage.class, "ResourceUsage", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceUsage_UsageTime(), theProbfunctionPackage.getProbabilityDensityFunction(),
                null, "usageTime", null, 1, 1, ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getResourceUsage_Resource(), this.getActiveResource(), null, "resource", null, 1, 1,
                ResourceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activeResourceEClass, ActiveResource.class, "ActiveResource", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResource_Name(), this.ecorePackage.getEString(), "name", "", 1, 1, Resource.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResource_NumberOfServers(), this.ecorePackage.getEInt(), "numberOfServers", null, 1,
                1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.passiveResourceEClass, PassiveResource.class, "PassiveResource", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.contentionResourceEClass, ContentionResource.class, "ContentionResource", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getContentionResource_NumReplicas(), this.ecorePackage.getEInt(), "numReplicas", null,
                1, 1, ContentionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.processingResourceEClass, ProcessingResource.class, "ProcessingResource", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.delayResourceEClass, DelayResource.class, "DelayResource", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ResourceModelPackageImpl
