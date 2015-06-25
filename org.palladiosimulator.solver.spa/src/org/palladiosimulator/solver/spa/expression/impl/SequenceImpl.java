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
import org.palladiosimulator.solver.spa.expression.Sequence;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sequence</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.SequenceImpl#getLeftRegExp
 * <em>Left Reg Exp</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.SequenceImpl#getRightRegExp
 * <em>Right Reg Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends OperationImpl implements Sequence {

    /**
     * The cached value of the '{@link #getLeftRegExp() <em>Left Reg Exp</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLeftRegExp()
     * @generated
     * @ordered
     */
    protected Expression leftRegExp;

    /**
     * The cached value of the '{@link #getRightRegExp() <em>Right Reg Exp</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRightRegExp()
     * @generated
     * @ordered
     */
    protected Expression rightRegExp;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionPackage.Literals.SEQUENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getLeftRegExp() {
        return this.leftRegExp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLeftRegExp(final Expression newLeftRegExp, NotificationChain msgs) {
        final Expression oldLeftRegExp = this.leftRegExp;
        this.leftRegExp = newLeftRegExp;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.SEQUENCE__LEFT_REG_EXP, oldLeftRegExp, newLeftRegExp);
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
    public void setLeftRegExp(final Expression newLeftRegExp) {
        if (newLeftRegExp != this.leftRegExp) {
            NotificationChain msgs = null;
            if (this.leftRegExp != null) {
                msgs = ((InternalEObject) this.leftRegExp).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.SEQUENCE__LEFT_REG_EXP, null, msgs);
            }
            if (newLeftRegExp != null) {
                msgs = ((InternalEObject) newLeftRegExp).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.SEQUENCE__LEFT_REG_EXP, null, msgs);
            }
            msgs = this.basicSetLeftRegExp(newLeftRegExp, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SEQUENCE__LEFT_REG_EXP,
                    newLeftRegExp, newLeftRegExp));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getRightRegExp() {
        return this.rightRegExp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRightRegExp(final Expression newRightRegExp, NotificationChain msgs) {
        final Expression oldRightRegExp = this.rightRegExp;
        this.rightRegExp = newRightRegExp;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.SEQUENCE__RIGHT_REG_EXP, oldRightRegExp, newRightRegExp);
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
    public void setRightRegExp(final Expression newRightRegExp) {
        if (newRightRegExp != this.rightRegExp) {
            NotificationChain msgs = null;
            if (this.rightRegExp != null) {
                msgs = ((InternalEObject) this.rightRegExp).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.SEQUENCE__RIGHT_REG_EXP, null, msgs);
            }
            if (newRightRegExp != null) {
                msgs = ((InternalEObject) newRightRegExp).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.SEQUENCE__RIGHT_REG_EXP, null, msgs);
            }
            msgs = this.basicSetRightRegExp(newRightRegExp, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SEQUENCE__RIGHT_REG_EXP,
                    newRightRegExp, newRightRegExp));
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
        case ExpressionPackage.SEQUENCE__LEFT_REG_EXP:
            return this.basicSetLeftRegExp(null, msgs);
        case ExpressionPackage.SEQUENCE__RIGHT_REG_EXP:
            return this.basicSetRightRegExp(null, msgs);
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
        case ExpressionPackage.SEQUENCE__LEFT_REG_EXP:
            return this.getLeftRegExp();
        case ExpressionPackage.SEQUENCE__RIGHT_REG_EXP:
            return this.getRightRegExp();
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
        case ExpressionPackage.SEQUENCE__LEFT_REG_EXP:
            this.setLeftRegExp((Expression) newValue);
            return;
        case ExpressionPackage.SEQUENCE__RIGHT_REG_EXP:
            this.setRightRegExp((Expression) newValue);
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
        case ExpressionPackage.SEQUENCE__LEFT_REG_EXP:
            this.setLeftRegExp((Expression) null);
            return;
        case ExpressionPackage.SEQUENCE__RIGHT_REG_EXP:
            this.setRightRegExp((Expression) null);
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
        case ExpressionPackage.SEQUENCE__LEFT_REG_EXP:
            return this.leftRegExp != null;
        case ExpressionPackage.SEQUENCE__RIGHT_REG_EXP:
            return this.rightRegExp != null;
        }
        return super.eIsSet(featureID);
    }

} // SequenceImpl
