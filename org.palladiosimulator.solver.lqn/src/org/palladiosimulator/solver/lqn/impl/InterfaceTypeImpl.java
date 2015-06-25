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
import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutPortType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl#getInPort <em>In Port</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceTypeImpl extends EObjectImpl implements InterfaceType {

    /**
     * The cached value of the '{@link #getInPort() <em>In Port</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInPort()
     * @generated
     * @ordered
     */
    protected EList<InPortType> inPort;

    /**
     * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOutPort()
     * @generated
     * @ordered
     */
    protected EList<OutPortType> outPort;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InterfaceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.INTERFACE_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<InPortType> getInPort() {
        if (this.inPort == null)
        {
            this.inPort = new EObjectContainmentEList<InPortType>(InPortType.class, this,
                    LqnPackage.INTERFACE_TYPE__IN_PORT);
        }
        return this.inPort;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutPortType> getOutPort() {
        if (this.outPort == null)
        {
            this.outPort = new EObjectContainmentEList<OutPortType>(OutPortType.class, this,
                    LqnPackage.INTERFACE_TYPE__OUT_PORT);
        }
        return this.outPort;
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
        case LqnPackage.INTERFACE_TYPE__IN_PORT:
            return ((InternalEList<?>) this.getInPort()).basicRemove(otherEnd, msgs);
        case LqnPackage.INTERFACE_TYPE__OUT_PORT:
            return ((InternalEList<?>) this.getOutPort()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.INTERFACE_TYPE__IN_PORT:
            return this.getInPort();
        case LqnPackage.INTERFACE_TYPE__OUT_PORT:
            return this.getOutPort();
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
        case LqnPackage.INTERFACE_TYPE__IN_PORT:
            this.getInPort().clear();
            this.getInPort().addAll((Collection<? extends InPortType>) newValue);
            return;
        case LqnPackage.INTERFACE_TYPE__OUT_PORT:
            this.getOutPort().clear();
            this.getOutPort().addAll((Collection<? extends OutPortType>) newValue);
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
        case LqnPackage.INTERFACE_TYPE__IN_PORT:
            this.getInPort().clear();
            return;
        case LqnPackage.INTERFACE_TYPE__OUT_PORT:
            this.getOutPort().clear();
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
        case LqnPackage.INTERFACE_TYPE__IN_PORT:
            return this.inPort != null && !this.inPort.isEmpty();
        case LqnPackage.INTERFACE_TYPE__OUT_PORT:
            return this.outPort != null && !this.outPort.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // InterfaceTypeImpl
