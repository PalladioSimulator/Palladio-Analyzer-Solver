/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage;
import org.palladiosimulator.solver.context.computed_usage.LoopIteration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Loop Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.LoopIterationImpl#getLoopaction_LoopIteration
 * <em>Loopaction Loop Iteration</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.impl.LoopIterationImpl#getSpecification_LoopIteration
 * <em>Specification Loop Iteration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopIterationImpl extends EObjectImpl implements LoopIteration {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The cached value of the '{@link #getLoopaction_LoopIteration()
     * <em>Loopaction Loop Iteration</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLoopaction_LoopIteration()
     * @generated
     * @ordered
     */
    protected AbstractLoopAction loopaction_LoopIteration;

    /**
     * The cached value of the '{@link #getSpecification_LoopIteration()
     * <em>Specification Loop Iteration</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getSpecification_LoopIteration()
     * @generated
     * @ordered
     */
    protected PCMRandomVariable specification_LoopIteration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LoopIterationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComputedUsagePackage.Literals.LOOP_ITERATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AbstractLoopAction getLoopaction_LoopIteration() {
        if (this.loopaction_LoopIteration != null && ((EObject) this.loopaction_LoopIteration).eIsProxy()) {
            final InternalEObject oldLoopaction_LoopIteration = (InternalEObject) this.loopaction_LoopIteration;
            this.loopaction_LoopIteration = (AbstractLoopAction) this.eResolveProxy(oldLoopaction_LoopIteration);
            if (this.loopaction_LoopIteration != oldLoopaction_LoopIteration) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ComputedUsagePackage.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION, oldLoopaction_LoopIteration,
                            this.loopaction_LoopIteration));
                }
            }
        }
        return this.loopaction_LoopIteration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AbstractLoopAction basicGetLoopaction_LoopIteration() {
        return this.loopaction_LoopIteration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLoopaction_LoopIteration(final AbstractLoopAction newLoopaction_LoopIteration) {
        final AbstractLoopAction oldLoopaction_LoopIteration = this.loopaction_LoopIteration;
        this.loopaction_LoopIteration = newLoopaction_LoopIteration;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION, oldLoopaction_LoopIteration,
                    this.loopaction_LoopIteration));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRandomVariable getSpecification_LoopIteration() {
        return this.specification_LoopIteration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSpecification_LoopIteration(final PCMRandomVariable newSpecification_LoopIteration,
            NotificationChain msgs) {
        final PCMRandomVariable oldSpecification_LoopIteration = this.specification_LoopIteration;
        this.specification_LoopIteration = newSpecification_LoopIteration;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION, oldSpecification_LoopIteration,
                    newSpecification_LoopIteration);
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
    public void setSpecification_LoopIteration(final PCMRandomVariable newSpecification_LoopIteration) {
        if (newSpecification_LoopIteration != this.specification_LoopIteration) {
            NotificationChain msgs = null;
            if (this.specification_LoopIteration != null) {
                msgs = ((InternalEObject) this.specification_LoopIteration).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION,
                        null, msgs);
            }
            if (newSpecification_LoopIteration != null) {
                msgs = ((InternalEObject) newSpecification_LoopIteration).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION,
                        null, msgs);
            }
            msgs = this.basicSetSpecification_LoopIteration(newSpecification_LoopIteration, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION, newSpecification_LoopIteration,
                    newSpecification_LoopIteration));
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
        switch (featureID) {
        case ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION:
            return this.basicSetSpecification_LoopIteration(null, msgs);
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
        case ComputedUsagePackage.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION:
            if (resolve) {
                return this.getLoopaction_LoopIteration();
            }
            return this.basicGetLoopaction_LoopIteration();
        case ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION:
            return this.getSpecification_LoopIteration();
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
        case ComputedUsagePackage.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION:
            this.setLoopaction_LoopIteration((AbstractLoopAction) newValue);
            return;
        case ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION:
            this.setSpecification_LoopIteration((PCMRandomVariable) newValue);
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
        case ComputedUsagePackage.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION:
            this.setLoopaction_LoopIteration((AbstractLoopAction) null);
            return;
        case ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION:
            this.setSpecification_LoopIteration((PCMRandomVariable) null);
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
        case ComputedUsagePackage.LOOP_ITERATION__LOOPACTION_LOOP_ITERATION:
            return this.loopaction_LoopIteration != null;
        case ComputedUsagePackage.LOOP_ITERATION__SPECIFICATION_LOOP_ITERATION:
            return this.specification_LoopIteration != null;
        }
        return super.eIsSet(featureID);
    }

} // LoopIterationImpl
