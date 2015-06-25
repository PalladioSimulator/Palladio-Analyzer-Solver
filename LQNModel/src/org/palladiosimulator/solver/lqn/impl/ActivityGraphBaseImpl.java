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
import org.palladiosimulator.solver.lqn.ActivityDefType;
import org.palladiosimulator.solver.lqn.ActivityGraphBase;
import org.palladiosimulator.solver.lqn.PrecedenceType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Graph Base</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityGraphBaseImpl#getActivity
 * <em>Activity</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityGraphBaseImpl#getPrecedence
 * <em>Precedence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityGraphBaseImpl extends EObjectImpl implements ActivityGraphBase {

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected EList<ActivityDefType> activity;

    /**
     * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPrecedence()
     * @generated
     * @ordered
     */
    protected EList<PrecedenceType> precedence;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActivityGraphBaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.ACTIVITY_GRAPH_BASE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ActivityDefType> getActivity() {
        if (this.activity == null) {
            this.activity = new EObjectContainmentEList<ActivityDefType>(ActivityDefType.class, this,
                    lqnPackage.ACTIVITY_GRAPH_BASE__ACTIVITY);
        }
        return this.activity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<PrecedenceType> getPrecedence() {
        if (this.precedence == null) {
            this.precedence = new EObjectContainmentEList<PrecedenceType>(PrecedenceType.class, this,
                    lqnPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE);
        }
        return this.precedence;
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
        case lqnPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
            return ((InternalEList<?>) this.getActivity()).basicRemove(otherEnd, msgs);
        case lqnPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
            return ((InternalEList<?>) this.getPrecedence()).basicRemove(otherEnd, msgs);
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
        case lqnPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
            return this.getActivity();
        case lqnPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
            return this.getPrecedence();
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
        switch (featureID) {
        case lqnPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
            this.getActivity().clear();
            this.getActivity().addAll((Collection<? extends ActivityDefType>) newValue);
            return;
        case lqnPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
            this.getPrecedence().clear();
            this.getPrecedence().addAll((Collection<? extends PrecedenceType>) newValue);
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
        case lqnPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
            this.getActivity().clear();
            return;
        case lqnPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
            this.getPrecedence().clear();
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
        case lqnPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
            return this.activity != null && !this.activity.isEmpty();
        case lqnPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
            return this.precedence != null && !this.precedence.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ActivityGraphBaseImpl
