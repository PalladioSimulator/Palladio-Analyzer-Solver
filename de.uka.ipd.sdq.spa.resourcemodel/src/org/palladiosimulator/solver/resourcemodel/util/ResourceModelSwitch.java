/**
 */
package org.palladiosimulator.solver.resourcemodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.solver.resourcemodel.ResourceModelPackage
 * @generated
 */
public class ResourceModelSwitch {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ResourceModelPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceModelSwitch() {
        if (modelPackage == null) {
            modelPackage = ResourceModelPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            final List eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? this.defaultCase(theEObject)
                    : this.doSwitch((EClass) eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE: {
            final SequentialResourceUsage sequentialResourceUsage = (SequentialResourceUsage) theEObject;
            Object result = this.caseSequentialResourceUsage(sequentialResourceUsage);
            if (result == null) {
                result = this.caseAbstractResourceUsage(sequentialResourceUsage);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.ABSTRACT_RESOURCE_USAGE: {
            final AbstractResourceUsage abstractResourceUsage = (AbstractResourceUsage) theEObject;
            Object result = this.caseAbstractResourceUsage(abstractResourceUsage);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE: {
            final AlternativeResourceUsage alternativeResourceUsage = (AlternativeResourceUsage) theEObject;
            Object result = this.caseAlternativeResourceUsage(alternativeResourceUsage);
            if (result == null) {
                result = this.caseAbstractResourceUsage(alternativeResourceUsage);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.OPTION: {
            final Option option = (Option) theEObject;
            Object result = this.caseOption(option);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.RESOURCE_USAGE: {
            final ResourceUsage resourceUsage = (ResourceUsage) theEObject;
            Object result = this.caseResourceUsage(resourceUsage);
            if (result == null) {
                result = this.caseAbstractResourceUsage(resourceUsage);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.ACTIVE_RESOURCE: {
            final ActiveResource activeResource = (ActiveResource) theEObject;
            Object result = this.caseActiveResource(activeResource);
            if (result == null) {
                result = this.caseResource(activeResource);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.RESOURCE: {
            final Resource resource = (Resource) theEObject;
            Object result = this.caseResource(resource);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.PASSIVE_RESOURCE: {
            final PassiveResource passiveResource = (PassiveResource) theEObject;
            Object result = this.casePassiveResource(passiveResource);
            if (result == null) {
                result = this.caseContentionResource(passiveResource);
            }
            if (result == null) {
                result = this.caseResource(passiveResource);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.CONTENTION_RESOURCE: {
            final ContentionResource contentionResource = (ContentionResource) theEObject;
            Object result = this.caseContentionResource(contentionResource);
            if (result == null) {
                result = this.caseResource(contentionResource);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.PROCESSING_RESOURCE: {
            final ProcessingResource processingResource = (ProcessingResource) theEObject;
            Object result = this.caseProcessingResource(processingResource);
            if (result == null) {
                result = this.caseContentionResource(processingResource);
            }
            if (result == null) {
                result = this.caseActiveResource(processingResource);
            }
            if (result == null) {
                result = this.caseResource(processingResource);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ResourceModelPackage.DELAY_RESOURCE: {
            final DelayResource delayResource = (DelayResource) theEObject;
            Object result = this.caseDelayResource(delayResource);
            if (result == null) {
                result = this.caseActiveResource(delayResource);
            }
            if (result == null) {
                result = this.caseResource(delayResource);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Sequential Resource Usage</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Sequential Resource Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSequentialResourceUsage(final SequentialResourceUsage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Abstract Resource Usage</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Abstract Resource Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAbstractResourceUsage(final AbstractResourceUsage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Alternative Resource Usage</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Alternative Resource Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAlternativeResourceUsage(final AlternativeResourceUsage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Option</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseOption(final Option object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseResourceUsage(final ResourceUsage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Active Resource</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Active Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseActiveResource(final ActiveResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseResource(final Resource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object casePassiveResource(final PassiveResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contention Resource</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contention Resource</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseContentionResource(final ContentionResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseProcessingResource(final ProcessingResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delay Resource</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delay Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDelayResource(final DelayResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public Object defaultCase(final EObject object) {
        return null;
    }

} // ResourceModelSwitch
