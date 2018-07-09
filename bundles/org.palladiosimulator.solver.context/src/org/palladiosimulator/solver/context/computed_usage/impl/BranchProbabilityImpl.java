/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.solver.context.computed_usage.BranchProbability;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Branch Probability</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.BranchProbabilityImpl#getProbability
 * <em>Probability</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.BranchProbabilityImpl#getBranchtransition_BranchProbability
 * <em>Branchtransition Branch Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchProbabilityImpl extends EObjectImpl implements BranchProbability {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProbability()
     * @generated
     * @ordered
     */
    protected static final double PROBABILITY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProbability()
     * @generated
     * @ordered
     */
    protected double probability = PROBABILITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getBranchtransition_BranchProbability()
     * <em>Branchtransition Branch Probability</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getBranchtransition_BranchProbability()
     * @generated
     * @ordered
     */
    protected AbstractBranchTransition branchtransition_BranchProbability;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BranchProbabilityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.BRANCH_PROBABILITY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProbability() {
        return this.probability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProbability(final double newProbability) {
        final double oldProbability = this.probability;
        this.probability = newProbability;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.BRANCH_PROBABILITY__PROBABILITY,
                    oldProbability, this.probability));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AbstractBranchTransition getBranchtransition_BranchProbability() {
        if (this.branchtransition_BranchProbability != null
                && ((EObject) this.branchtransition_BranchProbability).eIsProxy())
        {
            final InternalEObject oldBranchtransition_BranchProbability = (InternalEObject) this.branchtransition_BranchProbability;
            this.branchtransition_BranchProbability = (AbstractBranchTransition) this
                    .eResolveProxy(oldBranchtransition_BranchProbability);
            if (this.branchtransition_BranchProbability != oldBranchtransition_BranchProbability)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ComputedUsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY,
                            oldBranchtransition_BranchProbability, this.branchtransition_BranchProbability));
                }
            }
        }
        return this.branchtransition_BranchProbability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AbstractBranchTransition basicGetBranchtransition_BranchProbability() {
        return this.branchtransition_BranchProbability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBranchtransition_BranchProbability(
            final AbstractBranchTransition newBranchtransition_BranchProbability) {
        final AbstractBranchTransition oldBranchtransition_BranchProbability = this.branchtransition_BranchProbability;
        this.branchtransition_BranchProbability = newBranchtransition_BranchProbability;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY,
                    oldBranchtransition_BranchProbability, this.branchtransition_BranchProbability));
        }
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
        case ComputedUsagePackage.BRANCH_PROBABILITY__PROBABILITY:
            return this.getProbability();
        case ComputedUsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
            if (resolve) {
                return this.getBranchtransition_BranchProbability();
            }
            return this.basicGetBranchtransition_BranchProbability();
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
        case ComputedUsagePackage.BRANCH_PROBABILITY__PROBABILITY:
            this.setProbability((Double) newValue);
            return;
        case ComputedUsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
            this.setBranchtransition_BranchProbability((AbstractBranchTransition) newValue);
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
        case ComputedUsagePackage.BRANCH_PROBABILITY__PROBABILITY:
            this.setProbability(PROBABILITY_EDEFAULT);
            return;
        case ComputedUsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
            this.setBranchtransition_BranchProbability((AbstractBranchTransition) null);
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
        case ComputedUsagePackage.BRANCH_PROBABILITY__PROBABILITY:
            return this.probability != PROBABILITY_EDEFAULT;
        case ComputedUsagePackage.BRANCH_PROBABILITY__BRANCHTRANSITION_BRANCH_PROBABILITY:
            return this.branchtransition_BranchProbability != null;
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
        result.append(" (probability: ");
        result.append(this.probability);
        result.append(')');
        return result.toString();
    }

} // BranchProbabilityImpl
