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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.EntryActivityDefType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entry Activity Def Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getCallList
 * <em>Call List</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getGroup <em>Group</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getSynchCall
 * <em>Synch Call</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getAsynchCall
 * <em>Asynch Call</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getFirstActivity
 * <em>First Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryActivityDefTypeImpl extends ActivityDefBaseImpl implements EntryActivityDefType {

    /**
     * The cached value of the '{@link #getCallList() <em>Call List</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCallList()
     * @generated
     * @ordered
     */
    protected EList<CallListType> callList;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * The default value of the '{@link #getFirstActivity() <em>First Activity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFirstActivity()
     * @generated
     * @ordered
     */
    protected static final String FIRST_ACTIVITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFirstActivity() <em>First Activity</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFirstActivity()
     * @generated
     * @ordered
     */
    protected String firstActivity = FIRST_ACTIVITY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EntryActivityDefTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<CallListType> getCallList() {
        if (this.callList == null) {
            this.callList = new EObjectContainmentEList<CallListType>(CallListType.class, this,
                    LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST);
        }
        return this.callList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FeatureMap getGroup() {
        if (this.group == null) {
            this.group = new BasicFeatureMap(this, LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP);
        }
        return this.group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ActivityMakingCallType> getSynchCall() {
        return this.getGroup().list(LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ActivityMakingCallType> getAsynchCall() {
        return this.getGroup().list(LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getFirstActivity() {
        return this.firstActivity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFirstActivity(final String newFirstActivity) {
        final String oldFirstActivity = this.firstActivity;
        this.firstActivity = newFirstActivity;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY, oldFirstActivity, this.firstActivity));
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
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
            return ((InternalEList<?>) this.getCallList()).basicRemove(otherEnd, msgs);
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
            return ((InternalEList<?>) this.getGroup()).basicRemove(otherEnd, msgs);
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
            return ((InternalEList<?>) this.getSynchCall()).basicRemove(otherEnd, msgs);
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
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
        switch (featureID) {
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
            return this.getCallList();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
            if (coreType) {
                return this.getGroup();
            }
            return ((FeatureMap.Internal) this.getGroup()).getWrapper();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
            return this.getSynchCall();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
            return this.getAsynchCall();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
            return this.getFirstActivity();
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
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
            this.getCallList().clear();
            this.getCallList().addAll((Collection<? extends CallListType>) newValue);
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
            ((FeatureMap.Internal) this.getGroup()).set(newValue);
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
            this.getSynchCall().clear();
            this.getSynchCall().addAll((Collection<? extends ActivityMakingCallType>) newValue);
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
            this.getAsynchCall().clear();
            this.getAsynchCall().addAll((Collection<? extends ActivityMakingCallType>) newValue);
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
            this.setFirstActivity((String) newValue);
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
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
            this.getCallList().clear();
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
            this.getGroup().clear();
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
            this.getSynchCall().clear();
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
            this.getAsynchCall().clear();
            return;
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
            this.setFirstActivity(FIRST_ACTIVITY_EDEFAULT);
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
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
            return this.callList != null && !this.callList.isEmpty();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
            return this.group != null && !this.group.isEmpty();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
            return !this.getSynchCall().isEmpty();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
            return !this.getAsynchCall().isEmpty();
        case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
            return FIRST_ACTIVITY_EDEFAULT == null ? this.firstActivity != null
                    : !FIRST_ACTIVITY_EDEFAULT.equals(this.firstActivity);
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
        result.append(" (group: ");
        result.append(this.group);
        result.append(", firstActivity: ");
        result.append(this.firstActivity);
        result.append(')');
        return result.toString();
    }

} // EntryActivityDefTypeImpl
