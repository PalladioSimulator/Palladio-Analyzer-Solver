/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.ActivityType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.SingleActivityListType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Single Activity List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SingleActivityListTypeImpl#getActivity <em>
 * Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleActivityListTypeImpl extends EObjectImpl implements SingleActivityListType {

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected ActivityType activity;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SingleActivityListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.SINGLE_ACTIVITY_LIST_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityType getActivity() {
        return this.activity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetActivity(final ActivityType newActivity, NotificationChain msgs) {
        final ActivityType oldActivity = this.activity;
        this.activity = newActivity;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY, oldActivity, newActivity);
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
    public void setActivity(final ActivityType newActivity) {
        if (newActivity != this.activity)
        {
            NotificationChain msgs = null;
            if (this.activity != null) {
                msgs = ((InternalEObject) this.activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY, null, msgs);
            }
            if (newActivity != null) {
                msgs = ((InternalEObject) newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY, null, msgs);
            }
            msgs = this.basicSetActivity(newActivity, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY,
                    newActivity, newActivity));
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
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY:
            return this.basicSetActivity(null, msgs);
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
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY:
            return this.getActivity();
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
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY:
            this.setActivity((ActivityType) newValue);
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
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY:
            this.setActivity((ActivityType) null);
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
        case LqnPackage.SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY:
            return this.activity != null;
        }
        return super.eIsSet(featureID);
    }

} // SingleActivityListTypeImpl
