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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.BindType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.SlotType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Slot Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl#getInterface <em>Interface</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl#getBinding <em>Binding</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl#getBindTarget <em>Bind Target</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl#getReplicNum <em>Replic Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotTypeImpl extends EObjectImpl implements SlotType {

    /**
     * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInterface()
     * @generated
     * @ordered
     */
    protected InterfaceType interface_;

    /**
     * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBinding()
     * @generated
     * @ordered
     */
    protected EList<BindType> binding;

    /**
     * The default value of the '{@link #getBindTarget() <em>Bind Target</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBindTarget()
     * @generated
     * @ordered
     */
    protected static final String BIND_TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBindTarget() <em>Bind Target</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBindTarget()
     * @generated
     * @ordered
     */
    protected String bindTarget = BIND_TARGET_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getReplicNum() <em>Replic Num</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplicNum()
     * @generated
     * @ordered
     */
    protected static final int REPLIC_NUM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReplicNum() <em>Replic Num</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplicNum()
     * @generated
     * @ordered
     */
    protected int replicNum = REPLIC_NUM_EDEFAULT;

    /**
     * This is true if the Replic Num attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean replicNumESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SlotTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.SLOT_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InterfaceType getInterface() {
        return this.interface_;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetInterface(final InterfaceType newInterface, NotificationChain msgs) {
        final InterfaceType oldInterface = this.interface_;
        this.interface_ = newInterface;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.SLOT_TYPE__INTERFACE, oldInterface, newInterface);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInterface(final InterfaceType newInterface) {
        if (newInterface != this.interface_)
        {
            NotificationChain msgs = null;
            if (this.interface_ != null) {
                msgs = ((InternalEObject) this.interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.SLOT_TYPE__INTERFACE, null, msgs);
            }
            if (newInterface != null) {
                msgs = ((InternalEObject) newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.SLOT_TYPE__INTERFACE, null, msgs);
            }
            msgs = this.basicSetInterface(newInterface, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SLOT_TYPE__INTERFACE, newInterface,
                    newInterface));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<BindType> getBinding() {
        if (this.binding == null)
        {
            this.binding = new EObjectContainmentEList<BindType>(BindType.class, this, LqnPackage.SLOT_TYPE__BINDING);
        }
        return this.binding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getBindTarget() {
        return this.bindTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBindTarget(final String newBindTarget) {
        final String oldBindTarget = this.bindTarget;
        this.bindTarget = newBindTarget;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SLOT_TYPE__BIND_TARGET,
                    oldBindTarget,
                    this.bindTarget));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setId(final String newId) {
        final String oldId = this.id;
        this.id = newId;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SLOT_TYPE__ID, oldId, this.id));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getReplicNum() {
        return this.replicNum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReplicNum(final int newReplicNum) {
        final int oldReplicNum = this.replicNum;
        this.replicNum = newReplicNum;
        final boolean oldReplicNumESet = this.replicNumESet;
        this.replicNumESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SLOT_TYPE__REPLIC_NUM, oldReplicNum,
                    this.replicNum, !oldReplicNumESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetReplicNum() {
        final int oldReplicNum = this.replicNum;
        final boolean oldReplicNumESet = this.replicNumESet;
        this.replicNum = REPLIC_NUM_EDEFAULT;
        this.replicNumESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.SLOT_TYPE__REPLIC_NUM,
                    oldReplicNum,
                    REPLIC_NUM_EDEFAULT, oldReplicNumESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetReplicNum() {
        return this.replicNumESet;
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
        case LqnPackage.SLOT_TYPE__INTERFACE:
            return this.basicSetInterface(null, msgs);
        case LqnPackage.SLOT_TYPE__BINDING:
            return ((InternalEList<?>) this.getBinding()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.SLOT_TYPE__INTERFACE:
            return this.getInterface();
        case LqnPackage.SLOT_TYPE__BINDING:
            return this.getBinding();
        case LqnPackage.SLOT_TYPE__BIND_TARGET:
            return this.getBindTarget();
        case LqnPackage.SLOT_TYPE__ID:
            return this.getId();
        case LqnPackage.SLOT_TYPE__REPLIC_NUM:
            return this.getReplicNum();
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
        case LqnPackage.SLOT_TYPE__INTERFACE:
            this.setInterface((InterfaceType) newValue);
            return;
        case LqnPackage.SLOT_TYPE__BINDING:
            this.getBinding().clear();
            this.getBinding().addAll((Collection<? extends BindType>) newValue);
            return;
        case LqnPackage.SLOT_TYPE__BIND_TARGET:
            this.setBindTarget((String) newValue);
            return;
        case LqnPackage.SLOT_TYPE__ID:
            this.setId((String) newValue);
            return;
        case LqnPackage.SLOT_TYPE__REPLIC_NUM:
            this.setReplicNum((Integer) newValue);
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
        case LqnPackage.SLOT_TYPE__INTERFACE:
            this.setInterface((InterfaceType) null);
            return;
        case LqnPackage.SLOT_TYPE__BINDING:
            this.getBinding().clear();
            return;
        case LqnPackage.SLOT_TYPE__BIND_TARGET:
            this.setBindTarget(BIND_TARGET_EDEFAULT);
            return;
        case LqnPackage.SLOT_TYPE__ID:
            this.setId(ID_EDEFAULT);
            return;
        case LqnPackage.SLOT_TYPE__REPLIC_NUM:
            this.unsetReplicNum();
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
        case LqnPackage.SLOT_TYPE__INTERFACE:
            return this.interface_ != null;
        case LqnPackage.SLOT_TYPE__BINDING:
            return this.binding != null && !this.binding.isEmpty();
        case LqnPackage.SLOT_TYPE__BIND_TARGET:
            return BIND_TARGET_EDEFAULT == null ? this.bindTarget != null : !BIND_TARGET_EDEFAULT
                    .equals(this.bindTarget);
        case LqnPackage.SLOT_TYPE__ID:
            return ID_EDEFAULT == null ? this.id != null : !ID_EDEFAULT.equals(this.id);
        case LqnPackage.SLOT_TYPE__REPLIC_NUM:
            return this.isSetReplicNum();
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
        result.append(" (bindTarget: ");
        result.append(this.bindTarget);
        result.append(", id: ");
        result.append(this.id);
        result.append(", replicNum: ");
        if (this.replicNumESet) {
            result.append(this.replicNum);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // SlotTypeImpl
