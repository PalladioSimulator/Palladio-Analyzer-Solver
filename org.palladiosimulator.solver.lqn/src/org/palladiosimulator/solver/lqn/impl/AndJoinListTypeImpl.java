/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;
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
import org.palladiosimulator.solver.lqn.ActivityType;
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>And Join List Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl#getActivity <em>Activity
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl#getQuorum <em>Quorum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndJoinListTypeImpl extends EObjectImpl implements AndJoinListType {

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected EList<ActivityType> activity;

    /**
     * The default value of the '{@link #getQuorum() <em>Quorum</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getQuorum()
     * @generated
     * @ordered
     */
    protected static final BigInteger QUORUM_EDEFAULT = new BigInteger("0");

    /**
     * The cached value of the '{@link #getQuorum() <em>Quorum</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getQuorum()
     * @generated
     * @ordered
     */
    protected BigInteger quorum = QUORUM_EDEFAULT;

    /**
     * This is true if the Quorum attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean quorumESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AndJoinListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.AND_JOIN_LIST_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ActivityType> getActivity() {
        if (this.activity == null)
        {
            this.activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this,
                    LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY);
        }
        return this.activity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getQuorum() {
        return this.quorum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setQuorum(final BigInteger newQuorum) {
        final BigInteger oldQuorum = this.quorum;
        this.quorum = newQuorum;
        final boolean oldQuorumESet = this.quorumESet;
        this.quorumESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.AND_JOIN_LIST_TYPE__QUORUM,
                    oldQuorum,
                    this.quorum, !oldQuorumESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetQuorum() {
        final BigInteger oldQuorum = this.quorum;
        final boolean oldQuorumESet = this.quorumESet;
        this.quorum = QUORUM_EDEFAULT;
        this.quorumESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.AND_JOIN_LIST_TYPE__QUORUM,
                    oldQuorum,
                    QUORUM_EDEFAULT, oldQuorumESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetQuorum() {
        return this.quorumESet;
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
        case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
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
        case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
            return this.getActivity();
        case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
            return this.getQuorum();
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
        case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
            this.getActivity().clear();
            this.getActivity().addAll((Collection<? extends ActivityType>) newValue);
            return;
        case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
            this.setQuorum((BigInteger) newValue);
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
        case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
            this.getActivity().clear();
            return;
        case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
            this.unsetQuorum();
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
        case LqnPackage.AND_JOIN_LIST_TYPE__ACTIVITY:
            return this.activity != null && !this.activity.isEmpty();
        case LqnPackage.AND_JOIN_LIST_TYPE__QUORUM:
            return this.isSetQuorum();
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
        result.append(" (quorum: ");
        if (this.quorumESet) {
            result.append(this.quorum);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // AndJoinListTypeImpl
