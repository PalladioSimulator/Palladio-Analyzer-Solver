/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.ActivityLoopListType;
import org.palladiosimulator.solver.lqn.ActivityLoopType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Loop List Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityLoopListTypeImpl#getActivity <em>
 * Activity</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityLoopListTypeImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityLoopListTypeImpl extends EObjectImpl implements ActivityLoopListType {

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected EList<ActivityLoopType> activity;

    /**
     * The default value of the '{@link #getEnd() <em>End</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected static final String END_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected String end = END_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityLoopListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.ACTIVITY_LOOP_LIST_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ActivityLoopType> getActivity() {
        if (this.activity == null)
        {
            this.activity = new EObjectContainmentEList<ActivityLoopType>(ActivityLoopType.class, this,
                    LqnPackage.ACTIVITY_LOOP_LIST_TYPE__ACTIVITY);
        }
        return this.activity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getEnd() {
        return this.end;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEnd(final String newEnd) {
        final String oldEnd = this.end;
        this.end = newEnd;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_LOOP_LIST_TYPE__END, oldEnd,
                    this.end));
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
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__ACTIVITY:
            return ((InternalEList<?>) this.getActivity()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__ACTIVITY:
            return this.getActivity();
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__END:
            return this.getEnd();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__ACTIVITY:
            this.getActivity().clear();
            this.getActivity().addAll((Collection<? extends ActivityLoopType>) newValue);
            return;
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__END:
            this.setEnd((String) newValue);
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
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__ACTIVITY:
            this.getActivity().clear();
            return;
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__END:
            this.setEnd(END_EDEFAULT);
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
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__ACTIVITY:
            return this.activity != null && !this.activity.isEmpty();
        case LqnPackage.ACTIVITY_LOOP_LIST_TYPE__END:
            return END_EDEFAULT == null ? this.end != null : !END_EDEFAULT.equals(this.end);
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
        result.append(" (end: ");
        result.append(this.end);
        result.append(')');
        return result.toString();
    }

} // ActivityLoopListTypeImpl
