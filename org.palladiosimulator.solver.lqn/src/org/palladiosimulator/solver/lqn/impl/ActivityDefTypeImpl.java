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
import org.palladiosimulator.solver.lqn.ActivityDefType;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Def Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl#getCallList <em>Call List</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl#getBoundToEntry <em>Bound To Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDefTypeImpl extends ActivityDefBaseImpl implements ActivityDefType {
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
	 * The default value of the '{@link #getBoundToEntry() <em>Bound To Entry</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getBoundToEntry()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_TO_ENTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundToEntry() <em>Bound To Entry</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getBoundToEntry()
	 * @generated
	 * @ordered
	 */
	protected String boundToEntry = BOUND_TO_ENTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ACTIVITY_DEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CallListType> getCallList() {
		if (callList == null) {
			callList = new EObjectContainmentEList<CallListType>(CallListType.class, this,
					LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST);
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
			group = new BasicFeatureMap(this, LqnPackage.ACTIVITY_DEF_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityMakingCallType> getSynchCall() {
		return getGroup().list(LqnPackage.Literals.ACTIVITY_DEF_TYPE__SYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityMakingCallType> getAsynchCall() {
		return getGroup().list(LqnPackage.Literals.ACTIVITY_DEF_TYPE__ASYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBoundToEntry() {
		return boundToEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundToEntry(String newBoundToEntry) {
		String oldBoundToEntry = boundToEntry;
		boundToEntry = newBoundToEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY,
					oldBoundToEntry, boundToEntry));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
			return ((InternalEList<?>) getCallList()).basicRemove(otherEnd, msgs);
		case LqnPackage.ACTIVITY_DEF_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case LqnPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
			return ((InternalEList<?>) getSynchCall()).basicRemove(otherEnd, msgs);
		case LqnPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
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
		case LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
			return getCallList();
		case LqnPackage.ACTIVITY_DEF_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case LqnPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
			return getSynchCall();
		case LqnPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			return getAsynchCall();
		case LqnPackage.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY:
			return getBoundToEntry();
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
		case LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
			getCallList().clear();
			getCallList().addAll((Collection<? extends CallListType>) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
			getSynchCall().clear();
			getSynchCall().addAll((Collection<? extends ActivityMakingCallType>) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			getAsynchCall().clear();
			getAsynchCall().addAll((Collection<? extends ActivityMakingCallType>) newValue);
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY:
			setBoundToEntry((String) newValue);
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
		case LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
			getCallList().clear();
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__GROUP:
			getGroup().clear();
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
			getSynchCall().clear();
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			getAsynchCall().clear();
			return;
		case LqnPackage.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY:
			setBoundToEntry(BOUND_TO_ENTRY_EDEFAULT);
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
		case LqnPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
			return callList != null && !callList.isEmpty();
		case LqnPackage.ACTIVITY_DEF_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case LqnPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
			return !getSynchCall().isEmpty();
		case LqnPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
			return !getAsynchCall().isEmpty();
		case LqnPackage.ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY:
			return BOUND_TO_ENTRY_EDEFAULT == null ? boundToEntry != null
					: !BOUND_TO_ENTRY_EDEFAULT.equals(boundToEntry);
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
		result.append(", boundToEntry: ");
		result.append(boundToEntry);
		result.append(')');
		return result.toString();
	}

} // ActivityDefTypeImpl
