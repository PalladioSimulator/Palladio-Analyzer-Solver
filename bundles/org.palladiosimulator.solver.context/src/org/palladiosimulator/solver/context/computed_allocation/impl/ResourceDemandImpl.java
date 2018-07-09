/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_allocation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationPackage;
import org.palladiosimulator.solver.context.computed_allocation.ResourceDemand;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_allocation.impl.ResourceDemandImpl#getParametricResourceDemand_ResourceDemand
 * <em>Parametric Resource Demand Resource Demand</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_allocation.impl.ResourceDemandImpl#getSpecification_ResourceDemand
 * <em>Specification Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceDemandImpl extends EObjectImpl implements ResourceDemand {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getParametricResourceDemand_ResourceDemand()
     * <em>Parametric Resource Demand Resource Demand</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getParametricResourceDemand_ResourceDemand()
     * @generated
     * @ordered
     */
    protected ParametricResourceDemand parametricResourceDemand_ResourceDemand;

    /**
     * The cached value of the '{@link #getSpecification_ResourceDemand()
     * <em>Specification Resource Demand</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getSpecification_ResourceDemand()
     * @generated
     * @ordered
     */
    protected PCMRandomVariable specification_ResourceDemand;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResourceDemandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedAllocationPackage.Literals.RESOURCE_DEMAND;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ParametricResourceDemand getParametricResourceDemand_ResourceDemand() {
        if (this.parametricResourceDemand_ResourceDemand != null
                && ((EObject) this.parametricResourceDemand_ResourceDemand).eIsProxy())
        {
            final InternalEObject oldParametricResourceDemand_ResourceDemand = (InternalEObject) this.parametricResourceDemand_ResourceDemand;
            this.parametricResourceDemand_ResourceDemand = (ParametricResourceDemand) this
                    .eResolveProxy(oldParametricResourceDemand_ResourceDemand);
            if (this.parametricResourceDemand_ResourceDemand != oldParametricResourceDemand_ResourceDemand)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ComputedAllocationPackage.RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND,
                            oldParametricResourceDemand_ResourceDemand, this.parametricResourceDemand_ResourceDemand));
                }
            }
        }
        return this.parametricResourceDemand_ResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ParametricResourceDemand basicGetParametricResourceDemand_ResourceDemand() {
        return this.parametricResourceDemand_ResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParametricResourceDemand_ResourceDemand(
            final ParametricResourceDemand newParametricResourceDemand_ResourceDemand) {
        final ParametricResourceDemand oldParametricResourceDemand_ResourceDemand = this.parametricResourceDemand_ResourceDemand;
        this.parametricResourceDemand_ResourceDemand = newParametricResourceDemand_ResourceDemand;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedAllocationPackage.RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND,
                    oldParametricResourceDemand_ResourceDemand, this.parametricResourceDemand_ResourceDemand));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMRandomVariable getSpecification_ResourceDemand() {
        return this.specification_ResourceDemand;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetSpecification_ResourceDemand(
            final PCMRandomVariable newSpecification_ResourceDemand, NotificationChain msgs) {
        final PCMRandomVariable oldSpecification_ResourceDemand = this.specification_ResourceDemand;
        this.specification_ResourceDemand = newSpecification_ResourceDemand;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND,
                    oldSpecification_ResourceDemand, newSpecification_ResourceDemand);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSpecification_ResourceDemand(final PCMRandomVariable newSpecification_ResourceDemand) {
        if (newSpecification_ResourceDemand != this.specification_ResourceDemand)
        {
            NotificationChain msgs = null;
            if (this.specification_ResourceDemand != null) {
                msgs = ((InternalEObject) this.specification_ResourceDemand).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND, null, msgs);
            }
            if (newSpecification_ResourceDemand != null) {
                msgs = ((InternalEObject) newSpecification_ResourceDemand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND, null, msgs);
            }
            msgs = this.basicSetSpecification_ResourceDemand(newSpecification_ResourceDemand, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND,
                    newSpecification_ResourceDemand, newSpecification_ResourceDemand));
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
        case ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND:
            return this.basicSetSpecification_ResourceDemand(null, msgs);
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
        case ComputedAllocationPackage.RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND:
            if (resolve) {
                return this.getParametricResourceDemand_ResourceDemand();
            }
            return this.basicGetParametricResourceDemand_ResourceDemand();
        case ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND:
            return this.getSpecification_ResourceDemand();
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
        switch (featureID)
        {
        case ComputedAllocationPackage.RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND:
            this.setParametricResourceDemand_ResourceDemand((ParametricResourceDemand) newValue);
            return;
        case ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND:
            this.setSpecification_ResourceDemand((PCMRandomVariable) newValue);
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
        case ComputedAllocationPackage.RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND:
            this.setParametricResourceDemand_ResourceDemand((ParametricResourceDemand) null);
            return;
        case ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND:
            this.setSpecification_ResourceDemand((PCMRandomVariable) null);
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
        case ComputedAllocationPackage.RESOURCE_DEMAND__PARAMETRIC_RESOURCE_DEMAND_RESOURCE_DEMAND:
            return this.parametricResourceDemand_ResourceDemand != null;
        case ComputedAllocationPackage.RESOURCE_DEMAND__SPECIFICATION_RESOURCE_DEMAND:
            return this.specification_ResourceDemand != null;
        }
        return super.eIsSet(featureID);
    }

} // ResourceDemandImpl
