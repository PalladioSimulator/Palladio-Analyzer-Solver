/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.PhaseActivities;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Phase Activities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PhaseActivitiesImpl#getActivity <em>Activity
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseActivitiesImpl extends EObjectImpl implements PhaseActivities {

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected EList<ActivityPhasesType> activity;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PhaseActivitiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.PHASE_ACTIVITIES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ActivityPhasesType> getActivity() {
        if (this.activity == null)
        {
            this.activity = new EObjectContainmentEList<ActivityPhasesType>(ActivityPhasesType.class, this,
                    LqnPackage.PHASE_ACTIVITIES__ACTIVITY);
        }
        return this.activity;
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
        case LqnPackage.PHASE_ACTIVITIES__ACTIVITY:
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
        case LqnPackage.PHASE_ACTIVITIES__ACTIVITY:
            return this.getActivity();
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
        case LqnPackage.PHASE_ACTIVITIES__ACTIVITY:
            this.getActivity().clear();
            this.getActivity().addAll((Collection<? extends ActivityPhasesType>) newValue);
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
        case LqnPackage.PHASE_ACTIVITIES__ACTIVITY:
            this.getActivity().clear();
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
        case LqnPackage.PHASE_ACTIVITIES__ACTIVITY:
            return this.activity != null && !this.activity.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // PhaseActivitiesImpl
