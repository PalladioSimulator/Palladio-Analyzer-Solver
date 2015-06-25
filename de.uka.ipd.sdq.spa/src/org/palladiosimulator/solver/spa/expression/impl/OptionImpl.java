/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.spa.expression.Expression;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.Option;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Option</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.OptionImpl#getProbability
 * <em>Probability</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.OptionImpl#getRegexp <em>Regexp</em>}
 * </li>
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
     * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRegexp()
     * @generated
     * @ordered
     */
    protected Expression regexp;

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
        return ExpressionPackage.Literals.OPTION;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.OPTION__PROBABILITY,
                    oldProbability, this.probability));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getRegexp() {
        return this.regexp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRegexp(final Expression newRegexp, NotificationChain msgs) {
        final Expression oldRegexp = this.regexp;
        this.regexp = newRegexp;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.OPTION__REGEXP, oldRegexp, newRegexp);
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
    public void setRegexp(final Expression newRegexp) {
        if (newRegexp != this.regexp) {
            NotificationChain msgs = null;
            if (this.regexp != null) {
                msgs = ((InternalEObject) this.regexp).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.OPTION__REGEXP, null, msgs);
            }
            if (newRegexp != null) {
                msgs = ((InternalEObject) newRegexp).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.OPTION__REGEXP, null, msgs);
            }
            msgs = this.basicSetRegexp(newRegexp, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.OPTION__REGEXP, newRegexp,
                    newRegexp));
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
        case ExpressionPackage.OPTION__REGEXP:
            return this.basicSetRegexp(null, msgs);
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
        case ExpressionPackage.OPTION__PROBABILITY:
            return this.getProbability();
        case ExpressionPackage.OPTION__REGEXP:
            return this.getRegexp();
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
        case ExpressionPackage.OPTION__PROBABILITY:
            this.setProbability((Double) newValue);
            return;
        case ExpressionPackage.OPTION__REGEXP:
            this.setRegexp((Expression) newValue);
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
        case ExpressionPackage.OPTION__PROBABILITY:
            this.setProbability(PROBABILITY_EDEFAULT);
            return;
        case ExpressionPackage.OPTION__REGEXP:
            this.setRegexp((Expression) null);
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
        case ExpressionPackage.OPTION__PROBABILITY:
            return this.probability != PROBABILITY_EDEFAULT;
        case ExpressionPackage.OPTION__REGEXP:
            return this.regexp != null;
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
