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
import org.palladiosimulator.solver.spa.expression.Parallel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parallel</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.ParallelImpl#getLeftTask
 * <em>Left Task</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.ParallelImpl#getRightTask
 * <em>Right Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelImpl extends OperationImpl implements Parallel {

    /**
     * The cached value of the '{@link #getLeftTask() <em>Left Task</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLeftTask()
     * @generated
     * @ordered
     */
    protected Expression leftTask;

    /**
     * The cached value of the '{@link #getRightTask() <em>Right Task</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRightTask()
     * @generated
     * @ordered
     */
    protected Expression rightTask;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ParallelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionPackage.Literals.PARALLEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getLeftTask() {
        return this.leftTask;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLeftTask(final Expression newLeftTask, NotificationChain msgs) {
        final Expression oldLeftTask = this.leftTask;
        this.leftTask = newLeftTask;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.PARALLEL__LEFT_TASK, oldLeftTask, newLeftTask);
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
    public void setLeftTask(final Expression newLeftTask) {
        if (newLeftTask != this.leftTask) {
            NotificationChain msgs = null;
            if (this.leftTask != null) {
                msgs = ((InternalEObject) this.leftTask).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.PARALLEL__LEFT_TASK, null, msgs);
            }
            if (newLeftTask != null) {
                msgs = ((InternalEObject) newLeftTask).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.PARALLEL__LEFT_TASK, null, msgs);
            }
            msgs = this.basicSetLeftTask(newLeftTask, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.PARALLEL__LEFT_TASK,
                    newLeftTask, newLeftTask));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getRightTask() {
        return this.rightTask;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRightTask(final Expression newRightTask, NotificationChain msgs) {
        final Expression oldRightTask = this.rightTask;
        this.rightTask = newRightTask;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.PARALLEL__RIGHT_TASK, oldRightTask, newRightTask);
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
    public void setRightTask(final Expression newRightTask) {
        if (newRightTask != this.rightTask) {
            NotificationChain msgs = null;
            if (this.rightTask != null) {
                msgs = ((InternalEObject) this.rightTask).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.PARALLEL__RIGHT_TASK, null, msgs);
            }
            if (newRightTask != null) {
                msgs = ((InternalEObject) newRightTask).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.PARALLEL__RIGHT_TASK, null, msgs);
            }
            msgs = this.basicSetRightTask(newRightTask, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.PARALLEL__RIGHT_TASK,
                    newRightTask, newRightTask));
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
        case ExpressionPackage.PARALLEL__LEFT_TASK:
            return this.basicSetLeftTask(null, msgs);
        case ExpressionPackage.PARALLEL__RIGHT_TASK:
            return this.basicSetRightTask(null, msgs);
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
        case ExpressionPackage.PARALLEL__LEFT_TASK:
            return this.getLeftTask();
        case ExpressionPackage.PARALLEL__RIGHT_TASK:
            return this.getRightTask();
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
        case ExpressionPackage.PARALLEL__LEFT_TASK:
            this.setLeftTask((Expression) newValue);
            return;
        case ExpressionPackage.PARALLEL__RIGHT_TASK:
            this.setRightTask((Expression) newValue);
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
        case ExpressionPackage.PARALLEL__LEFT_TASK:
            this.setLeftTask((Expression) null);
            return;
        case ExpressionPackage.PARALLEL__RIGHT_TASK:
            this.setRightTask((Expression) null);
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
        case ExpressionPackage.PARALLEL__LEFT_TASK:
            return this.leftTask != null;
        case ExpressionPackage.PARALLEL__RIGHT_TASK:
            return this.rightTask != null;
        }
        return super.eIsSet(featureID);
    }

} // ParallelImpl
