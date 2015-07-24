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
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getCallList <em>Call List</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl#getFirstActivity <em>First Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryActivityDefTypeImpl extends ActivityDefBaseImpl implements EntryActivityDefType {
	/**
	 * The cached value of the '{@link #getCallList() <em>Call List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	protected EntryActivityDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CallListType> getCallList() {
		if (callList == null) {
			callList = new EObjectContainmentEList<CallListType>(CallListType.class, this,
					LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST);
		}
		return callList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityMakingCallType> getSynchCall() {
		return getGroup().list(LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityMakingCallType> getAsynchCall() {
		return getGroup().list(LqnPackage.Literals.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstActivity() {
		return firstActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstActivity(String newFirstActivity) {
		String oldFirstActivity = firstActivity;
		firstActivity = newFirstActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY,
					oldFirstActivity, firstActivity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
			return ((InternalEList<?>) getCallList()).basicRemove(otherEnd, msgs);
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
			return ((InternalEList<?>) getSynchCall()).basicRemove(otherEnd, msgs);
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			return ((InternalEList<?>) getAsynchCall()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
			return getCallList();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
			return getSynchCall();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			return getAsynchCall();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
			return getFirstActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
			getCallList().clear();
			getCallList().addAll((Collection<? extends CallListType>) newValue);
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
			getSynchCall().clear();
			getSynchCall().addAll((Collection<? extends ActivityMakingCallType>) newValue);
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			getAsynchCall().clear();
			getAsynchCall().addAll((Collection<? extends ActivityMakingCallType>) newValue);
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
			setFirstActivity((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
			getCallList().clear();
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
			getGroup().clear();
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
			getSynchCall().clear();
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			getAsynchCall().clear();
			return;
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
			setFirstActivity(FIRST_ACTIVITY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST:
			return callList != null && !callList.isEmpty();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL:
			return !getSynchCall().isEmpty();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			return !getAsynchCall().isEmpty();
		case LqnPackage.ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY:
			return FIRST_ACTIVITY_EDEFAULT == null ? firstActivity != null
					: !FIRST_ACTIVITY_EDEFAULT.equals(firstActivity);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", firstActivity: ");
		result.append(firstActivity);
		result.append(')');
		return result.toString();
	}

} // EntryActivityDefTypeImpl
