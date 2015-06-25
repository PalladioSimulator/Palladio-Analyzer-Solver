/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LqnCore.impl;

import LqnCore.BindType;
import LqnCore.LqnCorePackage;
import LqnCore.ParameterType;
import LqnCore.PortBindingType;
import LqnCore.ProcessorBindingType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LqnCore.impl.BindTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link LqnCore.impl.BindTypeImpl#getProcessorBinding <em>Processor Binding</em>}</li>
 *   <li>{@link LqnCore.impl.BindTypeImpl#getPortBinding <em>Port Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindTypeImpl extends EObjectImpl implements BindType {
	/**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
	protected EList<ParameterType> parameter;

	/**
     * The cached value of the '{@link #getProcessorBinding() <em>Processor Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcessorBinding()
     * @generated
     * @ordered
     */
	protected EList<ProcessorBindingType> processorBinding;

	/**
     * The cached value of the '{@link #getPortBinding() <em>Port Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPortBinding()
     * @generated
     * @ordered
     */
	protected EList<PortBindingType> portBinding;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BindTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return LqnCorePackage.Literals.BIND_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ParameterType> getParameter() {
        if (parameter == null) {
            parameter = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, LqnCorePackage.BIND_TYPE__PARAMETER);
        }
        return parameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ProcessorBindingType> getProcessorBinding() {
        if (processorBinding == null) {
            processorBinding = new EObjectContainmentEList<ProcessorBindingType>(ProcessorBindingType.class, this, LqnCorePackage.BIND_TYPE__PROCESSOR_BINDING);
        }
        return processorBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PortBindingType> getPortBinding() {
        if (portBinding == null) {
            portBinding = new EObjectContainmentEList<PortBindingType>(PortBindingType.class, this, LqnCorePackage.BIND_TYPE__PORT_BINDING);
        }
        return portBinding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case LqnCorePackage.BIND_TYPE__PARAMETER:
                return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
            case LqnCorePackage.BIND_TYPE__PROCESSOR_BINDING:
                return ((InternalEList<?>)getProcessorBinding()).basicRemove(otherEnd, msgs);
            case LqnCorePackage.BIND_TYPE__PORT_BINDING:
                return ((InternalEList<?>)getPortBinding()).basicRemove(otherEnd, msgs);
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
            case LqnCorePackage.BIND_TYPE__PARAMETER:
                return getParameter();
            case LqnCorePackage.BIND_TYPE__PROCESSOR_BINDING:
                return getProcessorBinding();
            case LqnCorePackage.BIND_TYPE__PORT_BINDING:
                return getPortBinding();
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
            case LqnCorePackage.BIND_TYPE__PARAMETER:
                getParameter().clear();
                getParameter().addAll((Collection<? extends ParameterType>)newValue);
                return;
            case LqnCorePackage.BIND_TYPE__PROCESSOR_BINDING:
                getProcessorBinding().clear();
                getProcessorBinding().addAll((Collection<? extends ProcessorBindingType>)newValue);
                return;
            case LqnCorePackage.BIND_TYPE__PORT_BINDING:
                getPortBinding().clear();
                getPortBinding().addAll((Collection<? extends PortBindingType>)newValue);
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
            case LqnCorePackage.BIND_TYPE__PARAMETER:
                getParameter().clear();
                return;
            case LqnCorePackage.BIND_TYPE__PROCESSOR_BINDING:
                getProcessorBinding().clear();
                return;
            case LqnCorePackage.BIND_TYPE__PORT_BINDING:
                getPortBinding().clear();
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
            case LqnCorePackage.BIND_TYPE__PARAMETER:
                return parameter != null && !parameter.isEmpty();
            case LqnCorePackage.BIND_TYPE__PROCESSOR_BINDING:
                return processorBinding != null && !processorBinding.isEmpty();
            case LqnCorePackage.BIND_TYPE__PORT_BINDING:
                return portBinding != null && !portBinding.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BindTypeImpl
