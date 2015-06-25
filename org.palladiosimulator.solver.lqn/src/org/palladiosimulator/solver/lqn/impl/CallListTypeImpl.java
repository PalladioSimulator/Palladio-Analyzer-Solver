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
import org.palladiosimulator.solver.lqn.AsynchCallType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.SynchCallType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Call List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.CallListTypeImpl#getSynchCall <em>Synch Call
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.CallListTypeImpl#getAsynchCall <em>Asynch Call
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallListTypeImpl extends EObjectImpl implements CallListType {

    /**
     * The cached value of the '{@link #getSynchCall() <em>Synch Call</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSynchCall()
     * @generated
     * @ordered
     */
    protected EList<SynchCallType> synchCall;

    /**
     * The cached value of the '{@link #getAsynchCall() <em>Asynch Call</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAsynchCall()
     * @generated
     * @ordered
     */
    protected EList<AsynchCallType> asynchCall;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CallListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.CALL_LIST_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<SynchCallType> getSynchCall() {
        if (this.synchCall == null)
        {
            this.synchCall = new EObjectContainmentEList<SynchCallType>(SynchCallType.class, this,
                    LqnPackage.CALL_LIST_TYPE__SYNCH_CALL);
        }
        return this.synchCall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<AsynchCallType> getAsynchCall() {
        if (this.asynchCall == null)
        {
            this.asynchCall = new EObjectContainmentEList<AsynchCallType>(AsynchCallType.class, this,
                    LqnPackage.CALL_LIST_TYPE__ASYNCH_CALL);
        }
        return this.asynchCall;
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
        case LqnPackage.CALL_LIST_TYPE__SYNCH_CALL:
            return ((InternalEList<?>) this.getSynchCall()).basicRemove(otherEnd, msgs);
        case LqnPackage.CALL_LIST_TYPE__ASYNCH_CALL:
            return ((InternalEList<?>) this.getAsynchCall()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.CALL_LIST_TYPE__SYNCH_CALL:
            return this.getSynchCall();
        case LqnPackage.CALL_LIST_TYPE__ASYNCH_CALL:
            return this.getAsynchCall();
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
        case LqnPackage.CALL_LIST_TYPE__SYNCH_CALL:
            this.getSynchCall().clear();
            this.getSynchCall().addAll((Collection<? extends SynchCallType>) newValue);
            return;
        case LqnPackage.CALL_LIST_TYPE__ASYNCH_CALL:
            this.getAsynchCall().clear();
            this.getAsynchCall().addAll((Collection<? extends AsynchCallType>) newValue);
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
        case LqnPackage.CALL_LIST_TYPE__SYNCH_CALL:
            this.getSynchCall().clear();
            return;
        case LqnPackage.CALL_LIST_TYPE__ASYNCH_CALL:
            this.getAsynchCall().clear();
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
        case LqnPackage.CALL_LIST_TYPE__SYNCH_CALL:
            return this.synchCall != null && !this.synchCall.isEmpty();
        case LqnPackage.CALL_LIST_TYPE__ASYNCH_CALL:
            return this.asynchCall != null && !this.asynchCall.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // CallListTypeImpl
