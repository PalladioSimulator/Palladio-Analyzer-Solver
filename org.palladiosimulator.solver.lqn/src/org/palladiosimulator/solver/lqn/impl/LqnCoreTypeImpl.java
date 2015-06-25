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
import org.palladiosimulator.solver.lqn.LqnCoreType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.SlotType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Core Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnCoreTypeImpl#getProcessor <em>Processor</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnCoreTypeImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LqnCoreTypeImpl extends EObjectImpl implements LqnCoreType {

    /**
     * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcessor()
     * @generated
     * @ordered
     */
    protected EList<ProcessorType> processor;

    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected EList<SlotType> slot;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LqnCoreTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.LQN_CORE_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ProcessorType> getProcessor() {
        if (this.processor == null)
        {
            this.processor = new EObjectContainmentEList<ProcessorType>(ProcessorType.class, this,
                    LqnPackage.LQN_CORE_TYPE__PROCESSOR);
        }
        return this.processor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<SlotType> getSlot() {
        if (this.slot == null)
        {
            this.slot = new EObjectContainmentEList<SlotType>(SlotType.class, this, LqnPackage.LQN_CORE_TYPE__SLOT);
        }
        return this.slot;
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
        case LqnPackage.LQN_CORE_TYPE__PROCESSOR:
            return ((InternalEList<?>) this.getProcessor()).basicRemove(otherEnd, msgs);
        case LqnPackage.LQN_CORE_TYPE__SLOT:
            return ((InternalEList<?>) this.getSlot()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.LQN_CORE_TYPE__PROCESSOR:
            return this.getProcessor();
        case LqnPackage.LQN_CORE_TYPE__SLOT:
            return this.getSlot();
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
        case LqnPackage.LQN_CORE_TYPE__PROCESSOR:
            this.getProcessor().clear();
            this.getProcessor().addAll((Collection<? extends ProcessorType>) newValue);
            return;
        case LqnPackage.LQN_CORE_TYPE__SLOT:
            this.getSlot().clear();
            this.getSlot().addAll((Collection<? extends SlotType>) newValue);
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
        case LqnPackage.LQN_CORE_TYPE__PROCESSOR:
            this.getProcessor().clear();
            return;
        case LqnPackage.LQN_CORE_TYPE__SLOT:
            this.getSlot().clear();
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
        case LqnPackage.LQN_CORE_TYPE__PROCESSOR:
            return this.processor != null && !this.processor.isEmpty();
        case LqnPackage.LQN_CORE_TYPE__SLOT:
            return this.slot != null && !this.slot.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // LqnCoreTypeImpl
