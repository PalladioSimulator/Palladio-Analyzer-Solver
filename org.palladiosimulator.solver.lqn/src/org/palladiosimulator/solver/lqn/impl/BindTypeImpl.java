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
import org.palladiosimulator.solver.lqn.BindType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ParameterType;
import org.palladiosimulator.solver.lqn.PortBindingType;
import org.palladiosimulator.solver.lqn.ProcessorBindingType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bind Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.BindTypeImpl#getParameter <em>Parameter</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.BindTypeImpl#getProcessorBinding <em>Processor
 * Binding</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.BindTypeImpl#getPortBinding <em>Port Binding
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindTypeImpl extends MinimalEObjectImpl.Container implements BindType {
    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected EList<ParameterType> parameter;

    /**
     * The cached value of the '{@link #getProcessorBinding() <em>Processor Binding</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcessorBinding()
     * @generated
     * @ordered
     */
    protected EList<ProcessorBindingType> processorBinding;

    /**
     * The cached value of the '{@link #getPortBinding() <em>Port Binding</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPortBinding()
     * @generated
     * @ordered
     */
    protected EList<PortBindingType> portBinding;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BindTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.BIND_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ParameterType> getParameter() {
        if (this.parameter == null)
        {
            this.parameter = new EObjectContainmentEList<ParameterType>(ParameterType.class, this,
                    LqnPackage.BIND_TYPE__PARAMETER);
        }
        return this.parameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ProcessorBindingType> getProcessorBinding() {
        if (this.processorBinding == null)
        {
            this.processorBinding = new EObjectContainmentEList<ProcessorBindingType>(ProcessorBindingType.class, this,
                    LqnPackage.BIND_TYPE__PROCESSOR_BINDING);
        }
        return this.processorBinding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<PortBindingType> getPortBinding() {
        if (this.portBinding == null)
        {
            this.portBinding = new EObjectContainmentEList<PortBindingType>(PortBindingType.class, this,
                    LqnPackage.BIND_TYPE__PORT_BINDING);
        }
        return this.portBinding;
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
        case LqnPackage.BIND_TYPE__PARAMETER:
            return ((InternalEList<?>) this.getParameter()).basicRemove(otherEnd, msgs);
        case LqnPackage.BIND_TYPE__PROCESSOR_BINDING:
            return ((InternalEList<?>) this.getProcessorBinding()).basicRemove(otherEnd, msgs);
        case LqnPackage.BIND_TYPE__PORT_BINDING:
            return ((InternalEList<?>) this.getPortBinding()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.BIND_TYPE__PARAMETER:
            return this.getParameter();
        case LqnPackage.BIND_TYPE__PROCESSOR_BINDING:
            return this.getProcessorBinding();
        case LqnPackage.BIND_TYPE__PORT_BINDING:
            return this.getPortBinding();
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
        case LqnPackage.BIND_TYPE__PARAMETER:
            this.getParameter().clear();
            this.getParameter().addAll((Collection<? extends ParameterType>) newValue);
            return;
        case LqnPackage.BIND_TYPE__PROCESSOR_BINDING:
            this.getProcessorBinding().clear();
            this.getProcessorBinding().addAll((Collection<? extends ProcessorBindingType>) newValue);
            return;
        case LqnPackage.BIND_TYPE__PORT_BINDING:
            this.getPortBinding().clear();
            this.getPortBinding().addAll((Collection<? extends PortBindingType>) newValue);
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
        case LqnPackage.BIND_TYPE__PARAMETER:
            this.getParameter().clear();
            return;
        case LqnPackage.BIND_TYPE__PROCESSOR_BINDING:
            this.getProcessorBinding().clear();
            return;
        case LqnPackage.BIND_TYPE__PORT_BINDING:
            this.getPortBinding().clear();
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
        case LqnPackage.BIND_TYPE__PARAMETER:
            return this.parameter != null && !this.parameter.isEmpty();
        case LqnPackage.BIND_TYPE__PROCESSOR_BINDING:
            return this.processorBinding != null && !this.processorBinding.isEmpty();
        case LqnPackage.BIND_TYPE__PORT_BINDING:
            return this.portBinding != null && !this.portBinding.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // BindTypeImpl
