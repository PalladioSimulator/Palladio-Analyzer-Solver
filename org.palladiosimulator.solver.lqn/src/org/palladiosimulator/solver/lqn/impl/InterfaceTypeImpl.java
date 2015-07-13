/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutPortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTypeImpl extends MinimalEObjectImpl.Container implements InterfaceType {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InPortType> inPort;

	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPortType> outPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.INTERFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPortType> getInPort() {
		if (inPort == null) {
			inPort = new EObjectContainmentEList<InPortType>(InPortType.class, this, LqnPackage.INTERFACE_TYPE__IN_PORT);
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPortType> getOutPort() {
		if (outPort == null) {
			outPort = new EObjectContainmentEList<OutPortType>(OutPortType.class, this, LqnPackage.INTERFACE_TYPE__OUT_PORT);
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.INTERFACE_TYPE__IN_PORT:
				return ((InternalEList<?>)getInPort()).basicRemove(otherEnd, msgs);
			case LqnPackage.INTERFACE_TYPE__OUT_PORT:
				return ((InternalEList<?>)getOutPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.INTERFACE_TYPE__IN_PORT:
				return getInPort();
			case LqnPackage.INTERFACE_TYPE__OUT_PORT:
				return getOutPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnPackage.INTERFACE_TYPE__IN_PORT:
				getInPort().clear();
				getInPort().addAll((Collection<? extends InPortType>)newValue);
				return;
			case LqnPackage.INTERFACE_TYPE__OUT_PORT:
				getOutPort().clear();
				getOutPort().addAll((Collection<? extends OutPortType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LqnPackage.INTERFACE_TYPE__IN_PORT:
				getInPort().clear();
				return;
			case LqnPackage.INTERFACE_TYPE__OUT_PORT:
				getOutPort().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LqnPackage.INTERFACE_TYPE__IN_PORT:
				return inPort != null && !inPort.isEmpty();
			case LqnPackage.INTERFACE_TYPE__OUT_PORT:
				return outPort != null && !outPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceTypeImpl
