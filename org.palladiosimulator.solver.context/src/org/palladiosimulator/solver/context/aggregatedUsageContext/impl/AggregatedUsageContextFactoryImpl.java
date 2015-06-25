/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedCommunication;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedResourceDemand;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextFactory;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ComputedAggregatedUsage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ServiceExecutionContext;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregatedUsageContextFactoryImpl extends EFactoryImpl implements AggregatedUsageContextFactory {

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
    public static AggregatedUsageContextFactory init() {
        try {
            final AggregatedUsageContextFactory theAggregatedUsageContextFactory = (AggregatedUsageContextFactory) EPackage.Registry.INSTANCE
                    .getEFactory(AggregatedUsageContextPackage.eNS_URI);
            if (theAggregatedUsageContextFactory != null) {
                return theAggregatedUsageContextFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AggregatedUsageContextFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AggregatedUsageContextFactoryImpl() {
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
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT:
            return this.createServiceExecutionContext();
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND:
            return this.createAggregatedResourceDemand();
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION:
            return this.createAggregatedCommunication();
        case AggregatedUsageContextPackage.COMPUTED_AGGREGATED_USAGE:
            return this.createComputedAggregatedUsage();
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
    public ServiceExecutionContext createServiceExecutionContext() {
        final ServiceExecutionContextImpl serviceExecutionContext = new ServiceExecutionContextImpl();
        return serviceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregatedResourceDemand createAggregatedResourceDemand() {
        final AggregatedResourceDemandImpl aggregatedResourceDemand = new AggregatedResourceDemandImpl();
        return aggregatedResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregatedCommunication createAggregatedCommunication() {
        final AggregatedCommunicationImpl aggregatedCommunication = new AggregatedCommunicationImpl();
        return aggregatedCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedAggregatedUsage createComputedAggregatedUsage() {
        final ComputedAggregatedUsageImpl computedAggregatedUsage = new ComputedAggregatedUsageImpl();
        return computedAggregatedUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregatedUsageContextPackage getAggregatedUsageContextPackage() {
        return (AggregatedUsageContextPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AggregatedUsageContextPackage getPackage() {
        return AggregatedUsageContextPackage.eINSTANCE;
    }

} // AggregatedUsageContextFactoryImpl
