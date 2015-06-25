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
import org.palladiosimulator.solver.spa.expression.Expression;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.Loop;

import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Loop</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.LoopImpl#getRegExp <em>Reg Exp</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.LoopImpl#getIterationsPMF
 * <em>Iterations PMF</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.LoopImpl#getIterationsString
 * <em>Iterations String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends OperationImpl implements Loop {

    /**
     * The cached value of the '{@link #getRegExp() <em>Reg Exp</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRegExp()
     * @generated
     * @ordered
     */
    protected Expression regExp;

    protected ProbabilityMassFunction iterationsPMF;

    /**
     * The default value of the '{@link #getIterationsString() <em>Iterations String</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIterationsString()
     * @generated
     * @ordered
     */
    protected static final String ITERATIONS_STRING_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getIterationsString() <em>Iterations String</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIterationsString()
     * @generated
     * @ordered
     */
    protected String iterationsString = ITERATIONS_STRING_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LoopImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionPackage.Literals.LOOP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getRegExp() {
        return this.regExp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRegExp(final Expression newRegExp, NotificationChain msgs) {
        final Expression oldRegExp = this.regExp;
        this.regExp = newRegExp;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.LOOP__REG_EXP, oldRegExp, newRegExp);
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
    public void setRegExp(final Expression newRegExp) {
        if (newRegExp != this.regExp) {
            NotificationChain msgs = null;
            if (this.regExp != null) {
                msgs = ((InternalEObject) this.regExp).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.LOOP__REG_EXP, null, msgs);
            }
            if (newRegExp != null) {
                msgs = ((InternalEObject) newRegExp).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.LOOP__REG_EXP, null, msgs);
            }
            msgs = this.basicSetRegExp(newRegExp, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.LOOP__REG_EXP, newRegExp,
                    newRegExp));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbabilityMassFunction getIterationsPMF() {
        // TODO: implement this method to return the 'Iterations PMF' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetIterationsPMF(final ProbabilityMassFunction newIterationsPMF,
            final NotificationChain msgs) {
        // TODO: implement this method to set the contained 'Iterations PMF' containment reference
        // -> this method is automatically invoked to keep the containment relationship in synch
        // -> do not modify other features
        // -> return msgs, after adding any generated Notification to it (if it is null, a
        // NotificationChain object must be created first)
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    @Override
    public void setIterationsPMF(final ProbabilityMassFunction newIterationsPMF) {
        // TODO: implement this method to set the 'Iterations PMF' containment reference
        // Ensure that you remove @generated or mark it @generated NOT
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getIterationsString() {
        return this.iterationsString;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIterationsString(final String newIterationsString) {
        final String oldIterationsString = this.iterationsString;
        this.iterationsString = newIterationsString;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.LOOP__ITERATIONS_STRING,
                    oldIterationsString, this.iterationsString));
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
        case ExpressionPackage.LOOP__REG_EXP:
            return this.basicSetRegExp(null, msgs);
        case ExpressionPackage.LOOP__ITERATIONS_PMF:
            return this.basicSetIterationsPMF(null, msgs);
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
        case ExpressionPackage.LOOP__REG_EXP:
            return this.getRegExp();
        case ExpressionPackage.LOOP__ITERATIONS_PMF:
            return this.getIterationsPMF();
        case ExpressionPackage.LOOP__ITERATIONS_STRING:
            return this.getIterationsString();
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
        case ExpressionPackage.LOOP__REG_EXP:
            this.setRegExp((Expression) newValue);
            return;
        case ExpressionPackage.LOOP__ITERATIONS_PMF:
            this.setIterationsPMF((ProbabilityMassFunction) newValue);
            return;
        case ExpressionPackage.LOOP__ITERATIONS_STRING:
            this.setIterationsString((String) newValue);
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
        case ExpressionPackage.LOOP__REG_EXP:
            this.setRegExp((Expression) null);
            return;
        case ExpressionPackage.LOOP__ITERATIONS_PMF:
            this.setIterationsPMF((ProbabilityMassFunction) null);
            return;
        case ExpressionPackage.LOOP__ITERATIONS_STRING:
            this.setIterationsString(ITERATIONS_STRING_EDEFAULT);
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
        case ExpressionPackage.LOOP__REG_EXP:
            return this.regExp != null;
        case ExpressionPackage.LOOP__ITERATIONS_PMF:
            return this.getIterationsPMF() != null;
        case ExpressionPackage.LOOP__ITERATIONS_STRING:
            return ITERATIONS_STRING_EDEFAULT == null ? this.iterationsString != null
                    : !ITERATIONS_STRING_EDEFAULT.equals(this.iterationsString);
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
        result.append(" (iterationsString: ");
        result.append(this.iterationsString);
        result.append(')');
        return result.toString();
    }

} // LoopImpl
