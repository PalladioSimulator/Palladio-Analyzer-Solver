/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedCommunication;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedResourceDemand;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ServiceExecutionContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Service Execution Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getGlobalExecutionFrequency
 * <em>Global Execution Frequency</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getAllocationContext_ServiceExecutionContext
 * <em>Allocation Context Service Execution Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getDescribedSEFF_ServiceExecutionContext
 * <em>Described SEFF Service Execution Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getAggregatedResourceDemands_ServiceExecutionContext
 * <em>Aggregated Resource Demands Service Execution Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getUsageScenario_ServiceExecutionContext
 * <em>Usage Scenario Service Execution Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getSentAggregatedCommunications_ServiceExecutionContext
 * <em>Sent Aggregated Communications Service Execution Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.ServiceExecutionContextImpl#getReceivedAggregatedCommunication_AggregatedCommunication
 * <em>Received Aggregated Communication Aggregated Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceExecutionContextImpl extends EObjectImpl implements ServiceExecutionContext {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The default value of the '{@link #getGlobalExecutionFrequency()
     * <em>Global Execution Frequency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getGlobalExecutionFrequency()
     * @generated
     * @ordered
     */
    protected static final double GLOBAL_EXECUTION_FREQUENCY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getGlobalExecutionFrequency()
     * <em>Global Execution Frequency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getGlobalExecutionFrequency()
     * @generated
     * @ordered
     */
    protected double globalExecutionFrequency = GLOBAL_EXECUTION_FREQUENCY_EDEFAULT;

    /**
     * The cached value of the '{@link #getAllocationContext_ServiceExecutionContext()
     * <em>Allocation Context Service Execution Context</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getAllocationContext_ServiceExecutionContext()
     * @generated
     * @ordered
     */
    protected AllocationContext allocationContext_ServiceExecutionContext;

    /**
     * The cached value of the '{@link #getDescribedSEFF_ServiceExecutionContext()
     * <em>Described SEFF Service Execution Context</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDescribedSEFF_ServiceExecutionContext()
     * @generated
     * @ordered
     */
    protected ResourceDemandingSEFF describedSEFF_ServiceExecutionContext;

    /**
     * The cached value of the '{@link #getAggregatedResourceDemands_ServiceExecutionContext()
     * <em>Aggregated Resource Demands Service Execution Context</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAggregatedResourceDemands_ServiceExecutionContext()
     * @generated
     * @ordered
     */
    protected EList<AggregatedResourceDemand> aggregatedResourceDemands_ServiceExecutionContext;

    /**
     * The cached value of the '{@link #getUsageScenario_ServiceExecutionContext()
     * <em>Usage Scenario Service Execution Context</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUsageScenario_ServiceExecutionContext()
     * @generated
     * @ordered
     */
    protected UsageScenario usageScenario_ServiceExecutionContext;

    /**
     * The cached value of the '{@link #getSentAggregatedCommunications_ServiceExecutionContext()
     * <em>Sent Aggregated Communications Service Execution Context</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSentAggregatedCommunications_ServiceExecutionContext()
     * @generated
     * @ordered
     */
    protected EList<AggregatedCommunication> sentAggregatedCommunications_ServiceExecutionContext;

    /**
     * The cached value of the '{@link #getReceivedAggregatedCommunication_AggregatedCommunication()
     * <em>Received Aggregated Communication Aggregated Communication</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getReceivedAggregatedCommunication_AggregatedCommunication()
     * @generated
     * @ordered
     */
    protected EList<AggregatedCommunication> receivedAggregatedCommunication_AggregatedCommunication;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ServiceExecutionContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AggregatedUsageContextPackage.Literals.SERVICE_EXECUTION_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getGlobalExecutionFrequency() {
        return this.globalExecutionFrequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setGlobalExecutionFrequency(final double newGlobalExecutionFrequency) {
        final double oldGlobalExecutionFrequency = this.globalExecutionFrequency;
        this.globalExecutionFrequency = newGlobalExecutionFrequency;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY,
                    oldGlobalExecutionFrequency, this.globalExecutionFrequency));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AllocationContext getAllocationContext_ServiceExecutionContext() {
        if (this.allocationContext_ServiceExecutionContext != null
                && ((EObject) this.allocationContext_ServiceExecutionContext).eIsProxy()) {
            final InternalEObject oldAllocationContext_ServiceExecutionContext = (InternalEObject) this.allocationContext_ServiceExecutionContext;
            this.allocationContext_ServiceExecutionContext = (AllocationContext) this
                    .eResolveProxy(oldAllocationContext_ServiceExecutionContext);
            if (this.allocationContext_ServiceExecutionContext != oldAllocationContext_ServiceExecutionContext) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT,
                            oldAllocationContext_ServiceExecutionContext,
                            this.allocationContext_ServiceExecutionContext));
                }
            }
        }
        return this.allocationContext_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AllocationContext basicGetAllocationContext_ServiceExecutionContext() {
        return this.allocationContext_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setAllocationContext_ServiceExecutionContext(
            final AllocationContext newAllocationContext_ServiceExecutionContext) {
        final AllocationContext oldAllocationContext_ServiceExecutionContext = this.allocationContext_ServiceExecutionContext;
        this.allocationContext_ServiceExecutionContext = newAllocationContext_ServiceExecutionContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT,
                    oldAllocationContext_ServiceExecutionContext, this.allocationContext_ServiceExecutionContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceDemandingSEFF getDescribedSEFF_ServiceExecutionContext() {
        if (this.describedSEFF_ServiceExecutionContext != null
                && ((EObject) this.describedSEFF_ServiceExecutionContext).eIsProxy()) {
            final InternalEObject oldDescribedSEFF_ServiceExecutionContext = (InternalEObject) this.describedSEFF_ServiceExecutionContext;
            this.describedSEFF_ServiceExecutionContext = (ResourceDemandingSEFF) this
                    .eResolveProxy(oldDescribedSEFF_ServiceExecutionContext);
            if (this.describedSEFF_ServiceExecutionContext != oldDescribedSEFF_ServiceExecutionContext) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT,
                            oldDescribedSEFF_ServiceExecutionContext, this.describedSEFF_ServiceExecutionContext));
                }
            }
        }
        return this.describedSEFF_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceDemandingSEFF basicGetDescribedSEFF_ServiceExecutionContext() {
        return this.describedSEFF_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDescribedSEFF_ServiceExecutionContext(
            final ResourceDemandingSEFF newDescribedSEFF_ServiceExecutionContext) {
        final ResourceDemandingSEFF oldDescribedSEFF_ServiceExecutionContext = this.describedSEFF_ServiceExecutionContext;
        this.describedSEFF_ServiceExecutionContext = newDescribedSEFF_ServiceExecutionContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT,
                    oldDescribedSEFF_ServiceExecutionContext, this.describedSEFF_ServiceExecutionContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<AggregatedResourceDemand> getAggregatedResourceDemands_ServiceExecutionContext() {
        if (this.aggregatedResourceDemands_ServiceExecutionContext == null) {
            this.aggregatedResourceDemands_ServiceExecutionContext = new EObjectContainmentEList<AggregatedResourceDemand>(
                    AggregatedResourceDemand.class, this,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT);
        }
        return this.aggregatedResourceDemands_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UsageScenario getUsageScenario_ServiceExecutionContext() {
        if (this.usageScenario_ServiceExecutionContext != null
                && ((EObject) this.usageScenario_ServiceExecutionContext).eIsProxy()) {
            final InternalEObject oldUsageScenario_ServiceExecutionContext = (InternalEObject) this.usageScenario_ServiceExecutionContext;
            this.usageScenario_ServiceExecutionContext = (UsageScenario) this
                    .eResolveProxy(oldUsageScenario_ServiceExecutionContext);
            if (this.usageScenario_ServiceExecutionContext != oldUsageScenario_ServiceExecutionContext) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT,
                            oldUsageScenario_ServiceExecutionContext, this.usageScenario_ServiceExecutionContext));
                }
            }
        }
        return this.usageScenario_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UsageScenario basicGetUsageScenario_ServiceExecutionContext() {
        return this.usageScenario_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUsageScenario_ServiceExecutionContext(final UsageScenario newUsageScenario_ServiceExecutionContext) {
        final UsageScenario oldUsageScenario_ServiceExecutionContext = this.usageScenario_ServiceExecutionContext;
        this.usageScenario_ServiceExecutionContext = newUsageScenario_ServiceExecutionContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT,
                    oldUsageScenario_ServiceExecutionContext, this.usageScenario_ServiceExecutionContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<AggregatedCommunication> getSentAggregatedCommunications_ServiceExecutionContext() {
        if (this.sentAggregatedCommunications_ServiceExecutionContext == null) {
            this.sentAggregatedCommunications_ServiceExecutionContext = new EObjectContainmentEList<AggregatedCommunication>(
                    AggregatedCommunication.class, this,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT);
        }
        return this.sentAggregatedCommunications_ServiceExecutionContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<AggregatedCommunication> getReceivedAggregatedCommunication_AggregatedCommunication() {
        if (this.receivedAggregatedCommunication_AggregatedCommunication == null) {
            this.receivedAggregatedCommunication_AggregatedCommunication = new EObjectWithInverseResolvingEList<AggregatedCommunication>(
                    AggregatedCommunication.class, this,
                    AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION,
                    AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION);
        }
        return this.receivedAggregatedCommunication_AggregatedCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this
                    .getReceivedAggregatedCommunication_AggregatedCommunication()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT:
            return ((InternalEList<?>) this.getAggregatedResourceDemands_ServiceExecutionContext())
                    .basicRemove(otherEnd, msgs);
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT:
            return ((InternalEList<?>) this.getSentAggregatedCommunications_ServiceExecutionContext())
                    .basicRemove(otherEnd, msgs);
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION:
            return ((InternalEList<?>) this.getReceivedAggregatedCommunication_AggregatedCommunication())
                    .basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY:
            return this.getGlobalExecutionFrequency();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT:
            if (resolve) {
                return this.getAllocationContext_ServiceExecutionContext();
            }
            return this.basicGetAllocationContext_ServiceExecutionContext();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT:
            if (resolve) {
                return this.getDescribedSEFF_ServiceExecutionContext();
            }
            return this.basicGetDescribedSEFF_ServiceExecutionContext();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT:
            return this.getAggregatedResourceDemands_ServiceExecutionContext();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT:
            if (resolve) {
                return this.getUsageScenario_ServiceExecutionContext();
            }
            return this.basicGetUsageScenario_ServiceExecutionContext();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT:
            return this.getSentAggregatedCommunications_ServiceExecutionContext();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION:
            return this.getReceivedAggregatedCommunication_AggregatedCommunication();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY:
            this.setGlobalExecutionFrequency((Double) newValue);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT:
            this.setAllocationContext_ServiceExecutionContext((AllocationContext) newValue);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT:
            this.setDescribedSEFF_ServiceExecutionContext((ResourceDemandingSEFF) newValue);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT:
            this.getAggregatedResourceDemands_ServiceExecutionContext().clear();
            this.getAggregatedResourceDemands_ServiceExecutionContext()
                    .addAll((Collection<? extends AggregatedResourceDemand>) newValue);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT:
            this.setUsageScenario_ServiceExecutionContext((UsageScenario) newValue);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT:
            this.getSentAggregatedCommunications_ServiceExecutionContext().clear();
            this.getSentAggregatedCommunications_ServiceExecutionContext()
                    .addAll((Collection<? extends AggregatedCommunication>) newValue);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION:
            this.getReceivedAggregatedCommunication_AggregatedCommunication().clear();
            this.getReceivedAggregatedCommunication_AggregatedCommunication()
                    .addAll((Collection<? extends AggregatedCommunication>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY:
            this.setGlobalExecutionFrequency(GLOBAL_EXECUTION_FREQUENCY_EDEFAULT);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT:
            this.setAllocationContext_ServiceExecutionContext((AllocationContext) null);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT:
            this.setDescribedSEFF_ServiceExecutionContext((ResourceDemandingSEFF) null);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT:
            this.getAggregatedResourceDemands_ServiceExecutionContext().clear();
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT:
            this.setUsageScenario_ServiceExecutionContext((UsageScenario) null);
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT:
            this.getSentAggregatedCommunications_ServiceExecutionContext().clear();
            return;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION:
            this.getReceivedAggregatedCommunication_AggregatedCommunication().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__GLOBAL_EXECUTION_FREQUENCY:
            return this.globalExecutionFrequency != GLOBAL_EXECUTION_FREQUENCY_EDEFAULT;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__ALLOCATION_CONTEXT_SERVICE_EXECUTION_CONTEXT:
            return this.allocationContext_ServiceExecutionContext != null;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__DESCRIBED_SEFF_SERVICE_EXECUTION_CONTEXT:
            return this.describedSEFF_ServiceExecutionContext != null;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__AGGREGATED_RESOURCE_DEMANDS_SERVICE_EXECUTION_CONTEXT:
            return this.aggregatedResourceDemands_ServiceExecutionContext != null
                    && !this.aggregatedResourceDemands_ServiceExecutionContext.isEmpty();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__USAGE_SCENARIO_SERVICE_EXECUTION_CONTEXT:
            return this.usageScenario_ServiceExecutionContext != null;
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__SENT_AGGREGATED_COMMUNICATIONS_SERVICE_EXECUTION_CONTEXT:
            return this.sentAggregatedCommunications_ServiceExecutionContext != null
                    && !this.sentAggregatedCommunications_ServiceExecutionContext.isEmpty();
        case AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION:
            return this.receivedAggregatedCommunication_AggregatedCommunication != null
                    && !this.receivedAggregatedCommunication_AggregatedCommunication.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (globalExecutionFrequency: ");
        result.append(this.globalExecutionFrequency);
        result.append(')');
        return result.toString();
    }

} // ServiceExecutionContextImpl
