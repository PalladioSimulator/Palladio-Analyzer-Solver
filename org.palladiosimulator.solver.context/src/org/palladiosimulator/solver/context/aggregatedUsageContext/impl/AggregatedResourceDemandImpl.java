/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedResourceDemand;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aggregated Resource Demand</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedResourceDemandImpl#getAggregatedResourceDemand
 * <em>Aggregated Resource Demand</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedResourceDemandImpl#getResourceType_AggregatedResourceDemand
 * <em>Resource Type Aggregated Resource Demand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedResourceDemandImpl extends EObjectImpl implements AggregatedResourceDemand {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The default value of the '{@link #getAggregatedResourceDemand()
     * <em>Aggregated Resource Demand</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getAggregatedResourceDemand()
     * @generated
     * @ordered
     */
    protected static final double AGGREGATED_RESOURCE_DEMAND_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAggregatedResourceDemand()
     * <em>Aggregated Resource Demand</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getAggregatedResourceDemand()
     * @generated
     * @ordered
     */
    protected double aggregatedResourceDemand = AGGREGATED_RESOURCE_DEMAND_EDEFAULT;

    /**
     * The cached value of the '{@link #getResourceType_AggregatedResourceDemand()
     * <em>Resource Type Aggregated Resource Demand</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getResourceType_AggregatedResourceDemand()
     * @generated
     * @ordered
     */
    protected ResourceType resourceType_AggregatedResourceDemand;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AggregatedResourceDemandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AggregatedUsageContextPackage.Literals.AGGREGATED_RESOURCE_DEMAND;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getAggregatedResourceDemand() {
        return this.aggregatedResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregatedResourceDemand(final double newAggregatedResourceDemand) {
        final double oldAggregatedResourceDemand = this.aggregatedResourceDemand;
        this.aggregatedResourceDemand = newAggregatedResourceDemand;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND,
                    oldAggregatedResourceDemand, this.aggregatedResourceDemand));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceType getResourceType_AggregatedResourceDemand() {
        if (this.resourceType_AggregatedResourceDemand != null
                && ((EObject) this.resourceType_AggregatedResourceDemand).eIsProxy()) {
            final InternalEObject oldResourceType_AggregatedResourceDemand = (InternalEObject) this.resourceType_AggregatedResourceDemand;
            this.resourceType_AggregatedResourceDemand = (ResourceType) this
                    .eResolveProxy(oldResourceType_AggregatedResourceDemand);
            if (this.resourceType_AggregatedResourceDemand != oldResourceType_AggregatedResourceDemand) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND,
                            oldResourceType_AggregatedResourceDemand, this.resourceType_AggregatedResourceDemand));
                }
            }
        }
        return this.resourceType_AggregatedResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ResourceType basicGetResourceType_AggregatedResourceDemand() {
        return this.resourceType_AggregatedResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResourceType_AggregatedResourceDemand(final ResourceType newResourceType_AggregatedResourceDemand) {
        final ResourceType oldResourceType_AggregatedResourceDemand = this.resourceType_AggregatedResourceDemand;
        this.resourceType_AggregatedResourceDemand = newResourceType_AggregatedResourceDemand;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND,
                    oldResourceType_AggregatedResourceDemand, this.resourceType_AggregatedResourceDemand));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND:
            return this.getAggregatedResourceDemand();
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND:
            if (resolve) {
                return this.getResourceType_AggregatedResourceDemand();
            }
            return this.basicGetResourceType_AggregatedResourceDemand();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND:
            this.setAggregatedResourceDemand((Double) newValue);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND:
            this.setResourceType_AggregatedResourceDemand((ResourceType) newValue);
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
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND:
            this.setAggregatedResourceDemand(AGGREGATED_RESOURCE_DEMAND_EDEFAULT);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND:
            this.setResourceType_AggregatedResourceDemand((ResourceType) null);
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
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__AGGREGATED_RESOURCE_DEMAND:
            return this.aggregatedResourceDemand != AGGREGATED_RESOURCE_DEMAND_EDEFAULT;
        case AggregatedUsageContextPackage.AGGREGATED_RESOURCE_DEMAND__RESOURCE_TYPE_AGGREGATED_RESOURCE_DEMAND:
            return this.resourceType_AggregatedResourceDemand != null;
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
        result.append(" (aggregatedResourceDemand: ");
        result.append(this.aggregatedResourceDemand);
        result.append(')');
        return result.toString();
    }

} // AggregatedResourceDemandImpl
