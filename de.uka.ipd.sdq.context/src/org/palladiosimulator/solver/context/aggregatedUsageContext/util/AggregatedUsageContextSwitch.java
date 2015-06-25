/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedCommunication;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedResourceDemand;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ComputedAggregatedUsage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ServiceExecutionContext;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage
 * @generated
 */
public class AggregatedUsageContextSwitch<T> extends Switch<T> {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static AggregatedUsageContextPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AggregatedUsageContextSwitch() {
        if (modelPackage == null) {
            modelPackage = AggregatedUsageContextPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT: {
            final ServiceExecutionContext serviceExecutionContext = (ServiceExecutionContext) theEObject;
            T result = this.caseServiceExecutionContext(serviceExecutionContext);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND: {
            final AggregatedResourceDemand aggregatedResourceDemand = (AggregatedResourceDemand) theEObject;
            T result = this.caseAggregatedResourceDemand(aggregatedResourceDemand);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION: {
            final AggregatedCommunication aggregatedCommunication = (AggregatedCommunication) theEObject;
            T result = this.caseAggregatedCommunication(aggregatedCommunication);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case AggregatedUsageContextPackage.COMPUTED_AGGREGATED_USAGE: {
            final ComputedAggregatedUsage computedAggregatedUsage = (ComputedAggregatedUsage) theEObject;
            T result = this.caseComputedAggregatedUsage(computedAggregatedUsage);
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
     * <em>Service Execution Context</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Service Execution Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceExecutionContext(final ServiceExecutionContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Aggregated Resource Demand</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Aggregated Resource Demand</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregatedResourceDemand(final AggregatedResourceDemand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Aggregated Communication</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Aggregated Communication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregatedCommunication(final AggregatedCommunication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Computed Aggregated Usage</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Computed Aggregated Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComputedAggregatedUsage(final ComputedAggregatedUsage object) {
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
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // AggregatedUsageContextSwitch
