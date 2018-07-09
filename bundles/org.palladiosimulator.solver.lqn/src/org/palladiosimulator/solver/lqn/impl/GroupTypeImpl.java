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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.GroupType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.TaskType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Group Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getResultGroup <em>Result Group</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#isCap <em>Cap</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getShare <em>Share</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupTypeImpl extends MinimalEObjectImpl.Container implements
		GroupType {
	/**
	 * The cached value of the '{@link #getResultGroup() <em>Result Group</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultGroup;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskType> task;

	/**
	 * The default value of the '{@link #isCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCap()
	 * @generated
	 * @ordered
	 */
	protected boolean cap = CAP_EDEFAULT;

	/**
	 * This is true if the Cap attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShare() <em>Share</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getShare()
	 * @generated
	 * @ordered
	 */
	protected static final Object SHARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShare() <em>Share</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getShare()
	 * @generated
	 * @ordered
	 */
	protected Object share = SHARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputResultType> getResultGroup() {
		if (resultGroup == null) {
			resultGroup = new EObjectContainmentEList<OutputResultType>(
					OutputResultType.class, this,
					LqnPackage.GROUP_TYPE__RESULT_GROUP);
		}
		return resultGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<TaskType>(TaskType.class, this,
					LqnPackage.GROUP_TYPE__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCap(boolean newCap) {
		boolean oldCap = cap;
		cap = newCap;
		boolean oldCapESet = capESet;
		capESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.GROUP_TYPE__CAP, oldCap, cap, !oldCapESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCap() {
		boolean oldCap = cap;
		boolean oldCapESet = capESet;
		cap = CAP_EDEFAULT;
		capESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.GROUP_TYPE__CAP, oldCap, CAP_EDEFAULT,
					oldCapESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCap() {
		return capESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.GROUP_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getShare() {
		return share;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShare(Object newShare) {
		Object oldShare = share;
		share = newShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.GROUP_TYPE__SHARE, oldShare, share));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.GROUP_TYPE__RESULT_GROUP:
			return ((InternalEList<?>) getResultGroup()).basicRemove(otherEnd,
					msgs);
		case LqnPackage.GROUP_TYPE__TASK:
			return ((InternalEList<?>) getTask()).basicRemove(otherEnd, msgs);
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
		case LqnPackage.GROUP_TYPE__RESULT_GROUP:
			return getResultGroup();
		case LqnPackage.GROUP_TYPE__TASK:
			return getTask();
		case LqnPackage.GROUP_TYPE__CAP:
			return isCap();
		case LqnPackage.GROUP_TYPE__NAME:
			return getName();
		case LqnPackage.GROUP_TYPE__SHARE:
			return getShare();
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
		case LqnPackage.GROUP_TYPE__RESULT_GROUP:
			getResultGroup().clear();
			getResultGroup().addAll(
					(Collection<? extends OutputResultType>) newValue);
			return;
		case LqnPackage.GROUP_TYPE__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends TaskType>) newValue);
			return;
		case LqnPackage.GROUP_TYPE__CAP:
			setCap((Boolean) newValue);
			return;
		case LqnPackage.GROUP_TYPE__NAME:
			setName((String) newValue);
			return;
		case LqnPackage.GROUP_TYPE__SHARE:
			setShare(newValue);
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
		case LqnPackage.GROUP_TYPE__RESULT_GROUP:
			getResultGroup().clear();
			return;
		case LqnPackage.GROUP_TYPE__TASK:
			getTask().clear();
			return;
		case LqnPackage.GROUP_TYPE__CAP:
			unsetCap();
			return;
		case LqnPackage.GROUP_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LqnPackage.GROUP_TYPE__SHARE:
			setShare(SHARE_EDEFAULT);
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
		case LqnPackage.GROUP_TYPE__RESULT_GROUP:
			return resultGroup != null && !resultGroup.isEmpty();
		case LqnPackage.GROUP_TYPE__TASK:
			return task != null && !task.isEmpty();
		case LqnPackage.GROUP_TYPE__CAP:
			return isSetCap();
		case LqnPackage.GROUP_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case LqnPackage.GROUP_TYPE__SHARE:
			return SHARE_EDEFAULT == null ? share != null : !SHARE_EDEFAULT
					.equals(share);
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
		result.append(" (cap: ");
		if (capESet)
			result.append(cap);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", share: ");
		result.append(share);
		result.append(')');
		return result.toString();
	}

} // GroupTypeImpl
