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
import org.palladiosimulator.solver.spa.expression.Alternative;
import org.palladiosimulator.solver.spa.expression.ExpressionPackage;
import org.palladiosimulator.solver.spa.expression.Option;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Alternative</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.AlternativeImpl#getLeftOption
 * <em>Left Option</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.impl.AlternativeImpl#getRightOption
 * <em>Right Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeImpl extends OperationImpl implements Alternative {

    /**
     * The cached value of the '{@link #getLeftOption() <em>Left Option</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLeftOption()
     * @generated
     * @ordered
     */
    protected Option leftOption;

    /**
     * The cached value of the '{@link #getRightOption() <em>Right Option</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRightOption()
     * @generated
     * @ordered
     */
    protected Option rightOption;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AlternativeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionPackage.Literals.ALTERNATIVE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Option getLeftOption() {
        return this.leftOption;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLeftOption(final Option newLeftOption, NotificationChain msgs) {
        final Option oldLeftOption = this.leftOption;
        this.leftOption = newLeftOption;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.ALTERNATIVE__LEFT_OPTION, oldLeftOption, newLeftOption);
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
    public void setLeftOption(final Option newLeftOption) {
        if (newLeftOption != this.leftOption) {
            NotificationChain msgs = null;
            if (this.leftOption != null) {
                msgs = ((InternalEObject) this.leftOption).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.ALTERNATIVE__LEFT_OPTION, null, msgs);
            }
            if (newLeftOption != null) {
                msgs = ((InternalEObject) newLeftOption).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.ALTERNATIVE__LEFT_OPTION, null, msgs);
            }
            msgs = this.basicSetLeftOption(newLeftOption, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.ALTERNATIVE__LEFT_OPTION,
                    newLeftOption, newLeftOption));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Option getRightOption() {
        return this.rightOption;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRightOption(final Option newRightOption, NotificationChain msgs) {
        final Option oldRightOption = this.rightOption;
        this.rightOption = newRightOption;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionPackage.ALTERNATIVE__RIGHT_OPTION, oldRightOption, newRightOption);
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
    public void setRightOption(final Option newRightOption) {
        if (newRightOption != this.rightOption) {
            NotificationChain msgs = null;
            if (this.rightOption != null) {
                msgs = ((InternalEObject) this.rightOption).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.ALTERNATIVE__RIGHT_OPTION, null, msgs);
            }
            if (newRightOption != null) {
                msgs = ((InternalEObject) newRightOption).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionPackage.ALTERNATIVE__RIGHT_OPTION, null, msgs);
            }
            msgs = this.basicSetRightOption(newRightOption, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.ALTERNATIVE__RIGHT_OPTION,
                    newRightOption, newRightOption));
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
        case ExpressionPackage.ALTERNATIVE__LEFT_OPTION:
            return this.basicSetLeftOption(null, msgs);
        case ExpressionPackage.ALTERNATIVE__RIGHT_OPTION:
            return this.basicSetRightOption(null, msgs);
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
        case ExpressionPackage.ALTERNATIVE__LEFT_OPTION:
            return this.getLeftOption();
        case ExpressionPackage.ALTERNATIVE__RIGHT_OPTION:
            return this.getRightOption();
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
        case ExpressionPackage.ALTERNATIVE__LEFT_OPTION:
            this.setLeftOption((Option) newValue);
            return;
        case ExpressionPackage.ALTERNATIVE__RIGHT_OPTION:
            this.setRightOption((Option) newValue);
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
        case ExpressionPackage.ALTERNATIVE__LEFT_OPTION:
            this.setLeftOption((Option) null);
            return;
        case ExpressionPackage.ALTERNATIVE__RIGHT_OPTION:
            this.setRightOption((Option) null);
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
        case ExpressionPackage.ALTERNATIVE__LEFT_OPTION:
            return this.leftOption != null;
        case ExpressionPackage.ALTERNATIVE__RIGHT_OPTION:
            return this.rightOption != null;
        }
        return super.eIsSet(featureID);
    }

} // AlternativeImpl
