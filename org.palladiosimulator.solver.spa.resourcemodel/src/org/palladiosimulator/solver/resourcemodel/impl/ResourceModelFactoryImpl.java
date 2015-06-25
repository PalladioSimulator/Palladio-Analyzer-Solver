/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.solver.resourcemodel.AlternativeResourceUsage;
import org.palladiosimulator.solver.resourcemodel.DelayResource;
import org.palladiosimulator.solver.resourcemodel.Option;
import org.palladiosimulator.solver.resourcemodel.PassiveResource;
import org.palladiosimulator.solver.resourcemodel.ProcessingResource;
import org.palladiosimulator.solver.resourcemodel.ResourceModelFactory;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;
import org.palladiosimulator.solver.resourcemodel.ResourceUsage;
import org.palladiosimulator.solver.resourcemodel.SequentialResourceUsage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceModelFactoryImpl extends EFactoryImpl implements ResourceModelFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static ResourceModelFactory init() {
        try {
            final ResourceModelFactory theResourceModelFactory = (ResourceModelFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ResourceModelPackage.eNS_URI);
            if (theResourceModelFactory != null) {
                return theResourceModelFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ResourceModelFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceModelFactoryImpl() {
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
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE:
            return this.createSequentialResourceUsage();
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE:
            return this.createAlternativeResourceUsage();
        case ResourceModelPackage.OPTION:
            return this.createOption();
        case ResourceModelPackage.RESOURCE_USAGE:
            return this.createResourceUsage();
        case ResourceModelPackage.PASSIVE_RESOURCE:
            return this.createPassiveResource();
        case ResourceModelPackage.PROCESSING_RESOURCE:
            return this.createProcessingResource();
        case ResourceModelPackage.DELAY_RESOURCE:
            return this.createDelayResource();
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
    public SequentialResourceUsage createSequentialResourceUsage() {
        final SequentialResourceUsageImpl sequentialResourceUsage = new SequentialResourceUsageImpl();
        return sequentialResourceUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AlternativeResourceUsage createAlternativeResourceUsage() {
        final AlternativeResourceUsageImpl alternativeResourceUsage = new AlternativeResourceUsageImpl();
        return alternativeResourceUsage;
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
    public ResourceUsage createResourceUsage() {
        final ResourceUsageImpl resourceUsage = new ResourceUsageImpl();
        return resourceUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PassiveResource createPassiveResource() {
        final PassiveResourceImpl passiveResource = new PassiveResourceImpl();
        return passiveResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProcessingResource createProcessingResource() {
        final ProcessingResourceImpl processingResource = new ProcessingResourceImpl();
        return processingResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DelayResource createDelayResource() {
        final DelayResourceImpl delayResource = new DelayResourceImpl();
        return delayResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceModelPackage getResourceModelPackage() {
        return (ResourceModelPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ResourceModelPackage getPackage() {
        return ResourceModelPackage.eINSTANCE;
    }

} // ResourceModelFactoryImpl
