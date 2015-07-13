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
 * <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getResultGroup <em>Result Group
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getTask <em>Task</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#isCap <em>Cap</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl#getShare <em>Share</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupTypeImpl extends MinimalEObjectImpl.Container implements GroupType {
    /**
     * The cached value of the '{@link #getResultGroup() <em>Result Group</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
     * The default value of the '{@link #isCap() <em>Cap</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isCap()
     * @generated
     * @ordered
     */
    protected static final boolean CAP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCap() <em>Cap</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isCap()
     * @generated
     * @ordered
     */
    protected boolean cap = CAP_EDEFAULT;

    /**
     * This is true if the Cap attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean capESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getShare() <em>Share</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getShare()
     * @generated
     * @ordered
     */
    protected static final Object SHARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShare() <em>Share</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getShare()
     * @generated
     * @ordered
     */
    protected Object share = SHARE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GroupTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.GROUP_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultType> getResultGroup() {
        if (this.resultGroup == null)
        {
            this.resultGroup = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
                    LqnPackage.GROUP_TYPE__RESULT_GROUP);
        }
        return this.resultGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<TaskType> getTask() {
        if (this.task == null)
        {
            this.task = new EObjectContainmentEList<TaskType>(TaskType.class, this, LqnPackage.GROUP_TYPE__TASK);
        }
        return this.task;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isCap() {
        return this.cap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCap(final boolean newCap) {
        final boolean oldCap = this.cap;
        this.cap = newCap;
        final boolean oldCapESet = this.capESet;
        this.capESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.GROUP_TYPE__CAP, oldCap, this.cap,
                    !oldCapESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetCap() {
        final boolean oldCap = this.cap;
        final boolean oldCapESet = this.capESet;
        this.cap = CAP_EDEFAULT;
        this.capESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.GROUP_TYPE__CAP, oldCap,
                    CAP_EDEFAULT,
                    oldCapESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetCap() {
        return this.capESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.GROUP_TYPE__NAME, oldName, this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getShare() {
        return this.share;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setShare(final Object newShare) {
        final Object oldShare = this.share;
        this.share = newShare;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.GROUP_TYPE__SHARE, oldShare,
                    this.share));
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
        case LqnPackage.GROUP_TYPE__RESULT_GROUP:
            return ((InternalEList<?>) this.getResultGroup()).basicRemove(otherEnd, msgs);
        case LqnPackage.GROUP_TYPE__TASK:
            return ((InternalEList<?>) this.getTask()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.GROUP_TYPE__RESULT_GROUP:
            return this.getResultGroup();
        case LqnPackage.GROUP_TYPE__TASK:
            return this.getTask();
        case LqnPackage.GROUP_TYPE__CAP:
            return this.isCap();
        case LqnPackage.GROUP_TYPE__NAME:
            return this.getName();
        case LqnPackage.GROUP_TYPE__SHARE:
            return this.getShare();
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
        case LqnPackage.GROUP_TYPE__RESULT_GROUP:
            this.getResultGroup().clear();
            this.getResultGroup().addAll((Collection<? extends OutputResultType>) newValue);
            return;
        case LqnPackage.GROUP_TYPE__TASK:
            this.getTask().clear();
            this.getTask().addAll((Collection<? extends TaskType>) newValue);
            return;
        case LqnPackage.GROUP_TYPE__CAP:
            this.setCap((Boolean) newValue);
            return;
        case LqnPackage.GROUP_TYPE__NAME:
            this.setName((String) newValue);
            return;
        case LqnPackage.GROUP_TYPE__SHARE:
            this.setShare(newValue);
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
        case LqnPackage.GROUP_TYPE__RESULT_GROUP:
            this.getResultGroup().clear();
            return;
        case LqnPackage.GROUP_TYPE__TASK:
            this.getTask().clear();
            return;
        case LqnPackage.GROUP_TYPE__CAP:
            this.unsetCap();
            return;
        case LqnPackage.GROUP_TYPE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case LqnPackage.GROUP_TYPE__SHARE:
            this.setShare(SHARE_EDEFAULT);
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
        case LqnPackage.GROUP_TYPE__RESULT_GROUP:
            return this.resultGroup != null && !this.resultGroup.isEmpty();
        case LqnPackage.GROUP_TYPE__TASK:
            return this.task != null && !this.task.isEmpty();
        case LqnPackage.GROUP_TYPE__CAP:
            return this.isSetCap();
        case LqnPackage.GROUP_TYPE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case LqnPackage.GROUP_TYPE__SHARE:
            return SHARE_EDEFAULT == null ? this.share != null : !SHARE_EDEFAULT.equals(this.share);
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
        result.append(" (cap: ");
        if (this.capESet) {
            result.append(this.cap);
        } else {
            result.append("<unset>");
        }
        result.append(", name: ");
        result.append(this.name);
        result.append(", share: ");
        result.append(this.share);
        result.append(')');
        return result.toString();
    }

} // GroupTypeImpl
