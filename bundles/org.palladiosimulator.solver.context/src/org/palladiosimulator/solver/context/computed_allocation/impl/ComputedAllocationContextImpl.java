/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_allocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;
import org.palladiosimulator.solver.context.computed_allocation.ResourceDemand;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Context</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_allocation.impl.ComputedAllocationContextImpl#getResourceDemands_ComputedAllocationContext
 * <em>Resource Demands Computed Allocation Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_allocation.impl.ComputedAllocationContextImpl#getUsageContext_ComputedAllocationContext
 * <em>Usage Context Computed Allocation Context</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_allocation.impl.ComputedAllocationContextImpl#getAllocationContext_ComputedAllocationContext
 * <em>Allocation Context Computed Allocation Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputedAllocationContextImpl extends EntityImpl implements ComputedAllocationContext {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getResourceDemands_ComputedAllocationContext()
     * <em>Resource Demands Computed Allocation Context</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResourceDemands_ComputedAllocationContext()
     * @generated
     * @ordered
     */
    protected EList<ResourceDemand> resourceDemands_ComputedAllocationContext;

    /**
     * The cached value of the '{@link #getUsageContext_ComputedAllocationContext()
     * <em>Usage Context Computed Allocation Context</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getUsageContext_ComputedAllocationContext()
     * @generated
     * @ordered
     */
    protected ComputedUsageContext usageContext_ComputedAllocationContext;

    /**
     * The cached value of the '{@link #getAllocationContext_ComputedAllocationContext()
     * <em>Allocation Context Computed Allocation Context</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getAllocationContext_ComputedAllocationContext()
     * @generated
     * @ordered
     */
    protected AllocationContext allocationContext_ComputedAllocationContext;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComputedAllocationContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedAllocationPackage.Literals.COMPUTED_ALLOCATION_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ResourceDemand> getResourceDemands_ComputedAllocationContext() {
        if (this.resourceDemands_ComputedAllocationContext == null)
        {
            this.resourceDemands_ComputedAllocationContext = new EObjectContainmentEList<ResourceDemand>(
                    ResourceDemand.class, this,
                    ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT);
        }
        return this.resourceDemands_ComputedAllocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComputedUsageContext getUsageContext_ComputedAllocationContext() {
        if (this.usageContext_ComputedAllocationContext != null
                && this.usageContext_ComputedAllocationContext.eIsProxy())
        {
            final InternalEObject oldUsageContext_ComputedAllocationContext = (InternalEObject) this.usageContext_ComputedAllocationContext;
            this.usageContext_ComputedAllocationContext = (ComputedUsageContext) this
                    .eResolveProxy(oldUsageContext_ComputedAllocationContext);
            if (this.usageContext_ComputedAllocationContext != oldUsageContext_ComputedAllocationContext)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(
                            this,
                            Notification.RESOLVE,
                            ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT,
                            oldUsageContext_ComputedAllocationContext, this.usageContext_ComputedAllocationContext));
                }
            }
        }
        return this.usageContext_ComputedAllocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ComputedUsageContext basicGetUsageContext_ComputedAllocationContext() {
        return this.usageContext_ComputedAllocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageContext_ComputedAllocationContext(
            final ComputedUsageContext newUsageContext_ComputedAllocationContext) {
        final ComputedUsageContext oldUsageContext_ComputedAllocationContext = this.usageContext_ComputedAllocationContext;
        this.usageContext_ComputedAllocationContext = newUsageContext_ComputedAllocationContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT,
                    oldUsageContext_ComputedAllocationContext, this.usageContext_ComputedAllocationContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AllocationContext getAllocationContext_ComputedAllocationContext() {
        if (this.allocationContext_ComputedAllocationContext != null
                && ((EObject) this.allocationContext_ComputedAllocationContext).eIsProxy())
        {
            final InternalEObject oldAllocationContext_ComputedAllocationContext = (InternalEObject) this.allocationContext_ComputedAllocationContext;
            this.allocationContext_ComputedAllocationContext = (AllocationContext) this
                    .eResolveProxy(oldAllocationContext_ComputedAllocationContext);
            if (this.allocationContext_ComputedAllocationContext != oldAllocationContext_ComputedAllocationContext)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(
                            this,
                            Notification.RESOLVE,
                            ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT,
                            oldAllocationContext_ComputedAllocationContext,
                            this.allocationContext_ComputedAllocationContext));
                }
            }
        }
        return this.allocationContext_ComputedAllocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AllocationContext basicGetAllocationContext_ComputedAllocationContext() {
        return this.allocationContext_ComputedAllocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAllocationContext_ComputedAllocationContext(
            final AllocationContext newAllocationContext_ComputedAllocationContext) {
        final AllocationContext oldAllocationContext_ComputedAllocationContext = this.allocationContext_ComputedAllocationContext;
        this.allocationContext_ComputedAllocationContext = newAllocationContext_ComputedAllocationContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT,
                    oldAllocationContext_ComputedAllocationContext, this.allocationContext_ComputedAllocationContext));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT:
            return ((InternalEList<?>) this.getResourceDemands_ComputedAllocationContext()).basicRemove(otherEnd, msgs);
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
        switch (featureID)
        {
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT:
            return this.getResourceDemands_ComputedAllocationContext();
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            if (resolve) {
                return this.getUsageContext_ComputedAllocationContext();
            }
            return this.basicGetUsageContext_ComputedAllocationContext();
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            if (resolve) {
                return this.getAllocationContext_ComputedAllocationContext();
            }
            return this.basicGetAllocationContext_ComputedAllocationContext();
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
        switch (featureID)
        {
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT:
            this.getResourceDemands_ComputedAllocationContext().clear();
            this.getResourceDemands_ComputedAllocationContext().addAll((Collection<? extends ResourceDemand>) newValue);
            return;
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            this.setUsageContext_ComputedAllocationContext((ComputedUsageContext) newValue);
            return;
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            this.setAllocationContext_ComputedAllocationContext((AllocationContext) newValue);
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
        switch (featureID)
        {
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT:
            this.getResourceDemands_ComputedAllocationContext().clear();
            return;
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            this.setUsageContext_ComputedAllocationContext((ComputedUsageContext) null);
            return;
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            this.setAllocationContext_ComputedAllocationContext((AllocationContext) null);
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
        switch (featureID)
        {
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__RESOURCE_DEMANDS_COMPUTED_ALLOCATION_CONTEXT:
            return this.resourceDemands_ComputedAllocationContext != null
            && !this.resourceDemands_ComputedAllocationContext.isEmpty();
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__USAGE_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            return this.usageContext_ComputedAllocationContext != null;
        case ComputedAllocationPackage.COMPUTED_ALLOCATION_CONTEXT__ALLOCATION_CONTEXT_COMPUTED_ALLOCATION_CONTEXT:
            return this.allocationContext_ComputedAllocationContext != null;
        }
        return super.eIsSet(featureID);
    }

} // ComputedAllocationContextImpl
