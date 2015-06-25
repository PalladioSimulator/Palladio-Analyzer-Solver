/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.EntryActivityGraph;
import org.palladiosimulator.solver.lqn.ReplyActivityType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entry Activity Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityGraphImpl#getReplyActivity
 * <em>Reply Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryActivityGraphImpl extends ActivityGraphBaseImpl implements EntryActivityGraph {

    /**
     * The cached value of the '{@link #getReplyActivity() <em>Reply Activity</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplyActivity()
     * @generated
     * @ordered
     */
    protected EList<ReplyActivityType> replyActivity;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EntryActivityGraphImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.ENTRY_ACTIVITY_GRAPH;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ReplyActivityType> getReplyActivity() {
        if (this.replyActivity == null) {
            this.replyActivity = new EObjectContainmentEList<ReplyActivityType>(ReplyActivityType.class, this,
                    lqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY);
        }
        return this.replyActivity;
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
        case lqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
            return ((InternalEList<?>) this.getReplyActivity()).basicRemove(otherEnd, msgs);
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
        case lqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
            return this.getReplyActivity();
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
        case lqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
            this.getReplyActivity().clear();
            this.getReplyActivity().addAll((Collection<? extends ReplyActivityType>) newValue);
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
        case lqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
            this.getReplyActivity().clear();
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
        case lqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
            return this.replyActivity != null && !this.replyActivity.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // EntryActivityGraphImpl
