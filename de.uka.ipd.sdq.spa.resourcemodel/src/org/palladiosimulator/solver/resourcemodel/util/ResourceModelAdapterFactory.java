/**
 */
package org.palladiosimulator.solver.resourcemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.solver.resourcemodel.AbstractResourceUsage;
import org.palladiosimulator.solver.resourcemodel.ActiveResource;
import org.palladiosimulator.solver.resourcemodel.AlternativeResourceUsage;
import org.palladiosimulator.solver.resourcemodel.ContentionResource;
import org.palladiosimulator.solver.resourcemodel.DelayResource;
import org.palladiosimulator.solver.resourcemodel.Option;
import org.palladiosimulator.solver.resourcemodel.PassiveResource;
import org.palladiosimulator.solver.resourcemodel.ProcessingResource;
import org.palladiosimulator.solver.resourcemodel.Resource;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;
import org.palladiosimulator.solver.resourcemodel.ResourceUsage;
import org.palladiosimulator.solver.resourcemodel.SequentialResourceUsage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.solver.resourcemodel.ResourceModelPackage
 * @generated
 */
public class ResourceModelAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ResourceModelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ResourceModelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected ResourceModelSwitch modelSwitch = new ResourceModelSwitch() {

        @Override
        public Object caseSequentialResourceUsage(final SequentialResourceUsage object) {
            return ResourceModelAdapterFactory.this.createSequentialResourceUsageAdapter();
        }

        @Override
        public Object caseAbstractResourceUsage(final AbstractResourceUsage object) {
            return ResourceModelAdapterFactory.this.createAbstractResourceUsageAdapter();
        }

        @Override
        public Object caseAlternativeResourceUsage(final AlternativeResourceUsage object) {
            return ResourceModelAdapterFactory.this.createAlternativeResourceUsageAdapter();
        }

        @Override
        public Object caseOption(final Option object) {
            return ResourceModelAdapterFactory.this.createOptionAdapter();
        }

        @Override
        public Object caseResourceUsage(final ResourceUsage object) {
            return ResourceModelAdapterFactory.this.createResourceUsageAdapter();
        }

        @Override
        public Object caseActiveResource(final ActiveResource object) {
            return ResourceModelAdapterFactory.this.createActiveResourceAdapter();
        }

        @Override
        public Object caseResource(final Resource object) {
            return ResourceModelAdapterFactory.this.createResourceAdapter();
        }

        @Override
        public Object casePassiveResource(final PassiveResource object) {
            return ResourceModelAdapterFactory.this.createPassiveResourceAdapter();
        }

        @Override
        public Object caseContentionResource(final ContentionResource object) {
            return ResourceModelAdapterFactory.this.createContentionResourceAdapter();
        }

        @Override
        public Object caseProcessingResource(final ProcessingResource object) {
            return ResourceModelAdapterFactory.this.createProcessingResourceAdapter();
        }

        @Override
        public Object caseDelayResource(final DelayResource object) {
            return ResourceModelAdapterFactory.this.createDelayResourceAdapter();
        }

        @Override
        public Object defaultCase(final EObject object) {
            return ResourceModelAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return (Adapter) this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.SequentialResourceUsage
     * <em>Sequential Resource Usage</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.SequentialResourceUsage
     * @generated
     */
    public Adapter createSequentialResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.AbstractResourceUsage
     * <em>Abstract Resource Usage</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.AbstractResourceUsage
     * @generated
     */
    public Adapter createAbstractResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.AlternativeResourceUsage
     * <em>Alternative Resource Usage</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.AlternativeResourceUsage
     * @generated
     */
    public Adapter createAlternativeResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.Option <em>Option</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.Option
     * @generated
     */
    public Adapter createOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.ResourceUsage <em>Resource Usage</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.ResourceUsage
     * @generated
     */
    public Adapter createResourceUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.ActiveResource <em>Active Resource</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.ActiveResource
     * @generated
     */
    public Adapter createActiveResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.Resource <em>Resource</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.PassiveResource <em>Passive Resource</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.PassiveResource
     * @generated
     */
    public Adapter createPassiveResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.ContentionResource
     * <em>Contention Resource</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.ContentionResource
     * @generated
     */
    public Adapter createContentionResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.ProcessingResource
     * <em>Processing Resource</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.ProcessingResource
     * @generated
     */
    public Adapter createProcessingResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.solver.resourcemodel.DelayResource <em>Delay Resource</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.solver.resourcemodel.DelayResource
     * @generated
     */
    public Adapter createDelayResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ResourceModelAdapterFactory
