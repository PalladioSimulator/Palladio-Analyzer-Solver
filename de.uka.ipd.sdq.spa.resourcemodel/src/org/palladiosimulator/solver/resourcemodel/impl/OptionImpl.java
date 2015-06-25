/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.resourcemodel.AbstractResourceUsage;
import org.palladiosimulator.solver.resourcemodel.Option;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Option</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.OptionImpl#getProbability
 * <em>Probability</em>}</li>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.OptionImpl#getResourceUsage
 * <em>Resource Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends EObjectImpl implements Option {

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
     * The cached value of the '{@link #getResourceUsage() <em>Resource Usage</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getResourceUsage()
     * @generated
     * @ordered
     */
    protected AbstractResourceUsage resourceUsage;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected OptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.OPTION;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, ResourceModelPackage.OPTION__PROBABILITY,
                    oldProbability, this.probability));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AbstractResourceUsage getResourceUsage() {
        return this.resourceUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetResourceUsage(final AbstractResourceUsage newResourceUsage,
            NotificationChain msgs) {
        final AbstractResourceUsage oldResourceUsage = this.resourceUsage;
        this.resourceUsage = newResourceUsage;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ResourceModelPackage.OPTION__RESOURCE_USAGE, oldResourceUsage, newResourceUsage);
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
    public void setResourceUsage(final AbstractResourceUsage newResourceUsage) {
        if (newResourceUsage != this.resourceUsage) {
            NotificationChain msgs = null;
            if (this.resourceUsage != null) {
                msgs = ((InternalEObject) this.resourceUsage).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ResourceModelPackage.OPTION__RESOURCE_USAGE, null, msgs);
            }
            if (newResourceUsage != null) {
                msgs = ((InternalEObject) newResourceUsage).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ResourceModelPackage.OPTION__RESOURCE_USAGE, null, msgs);
            }
            msgs = this.basicSetResourceUsage(newResourceUsage, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ResourceModelPackage.OPTION__RESOURCE_USAGE,
                    newResourceUsage, newResourceUsage));
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
        case ResourceModelPackage.OPTION__RESOURCE_USAGE:
            return this.basicSetResourceUsage(null, msgs);
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
        case ResourceModelPackage.OPTION__PROBABILITY:
            return new Double(this.getProbability());
        case ResourceModelPackage.OPTION__RESOURCE_USAGE:
            return this.getResourceUsage();
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
        case ResourceModelPackage.OPTION__PROBABILITY:
            this.setProbability(((Double) newValue).doubleValue());
            return;
        case ResourceModelPackage.OPTION__RESOURCE_USAGE:
            this.setResourceUsage((AbstractResourceUsage) newValue);
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
        case ResourceModelPackage.OPTION__PROBABILITY:
            this.setProbability(PROBABILITY_EDEFAULT);
            return;
        case ResourceModelPackage.OPTION__RESOURCE_USAGE:
            this.setResourceUsage((AbstractResourceUsage) null);
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
        case ResourceModelPackage.OPTION__PROBABILITY:
            return this.probability != PROBABILITY_EDEFAULT;
        case ResourceModelPackage.OPTION__RESOURCE_USAGE:
            return this.resourceUsage != null;
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

} // OptionImpl
