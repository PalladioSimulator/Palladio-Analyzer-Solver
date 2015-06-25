/**
 */
package org.palladiosimulator.solver.spa.resourcemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.solver.spa.resourcemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage
 * @generated
 */
public class ResourceModelAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ResourceModelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ResourceModelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceModelSwitch modelSwitch = new ResourceModelSwitch() {

        public Object caseSequentialResourceUsage(SequentialResourceUsage object) {
            return createSequentialResourceUsageAdapter();
        }

        public Object caseAbstractResourceUsage(AbstractResourceUsage object) {
            return createAbstractResourceUsageAdapter();
        }

        public Object caseAlternativeResourceUsage(AlternativeResourceUsage object) {
            return createAlternativeResourceUsageAdapter();
        }

        public Object caseOption(Option object) {
            return createOptionAdapter();
        }

        public Object caseResourceUsage(ResourceUsage object) {
            return createResourceUsageAdapter();
        }

        public Object caseActiveResource(ActiveResource object) {
            return createActiveResourceAdapter();
        }

        public Object caseResource(Resource object) {
            return createResourceAdapter();
        }

        public Object casePassiveResource(PassiveResource object) {
            return createPassiveResourceAdapter();
        }

        public Object caseContentionResource(ContentionResource object) {
            return createContentionResourceAdapter();
        }

        public Object caseProcessingResource(ProcessingResource object) {
            return createProcessingResourceAdapter();
        }

        public Object caseDelayResource(DelayResource object) {
            return createDelayResourceAdapter();
        }

        public Object defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    public Adapter createAdapter(Notifier target) {
        return (Adapter) modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.SequentialResourceUsage <em>Sequential Resource Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.SequentialResourceUsage
     * @generated
     */
    public Adapter createSequentialResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.AbstractResourceUsage <em>Abstract Resource Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.AbstractResourceUsage
     * @generated
     */
    public Adapter createAbstractResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.AlternativeResourceUsage <em>Alternative Resource Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.AlternativeResourceUsage
     * @generated
     */
    public Adapter createAlternativeResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.Option <em>Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.Option
     * @generated
     */
    public Adapter createOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.ResourceUsage <em>Resource Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceUsage
     * @generated
     */
    public Adapter createResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.ActiveResource <em>Active Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.ActiveResource
     * @generated
     */
    public Adapter createActiveResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.PassiveResource <em>Passive Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.PassiveResource
     * @generated
     */
    public Adapter createPassiveResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.ContentionResource <em>Contention Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.ContentionResource
     * @generated
     */
    public Adapter createContentionResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.ProcessingResource <em>Processing Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.ProcessingResource
     * @generated
     */
    public Adapter createProcessingResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.solver.spa.resourcemodel.DelayResource <em>Delay Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.solver.spa.resourcemodel.DelayResource
     * @generated
     */
    public Adapter createDelayResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ResourceModelAdapterFactory
