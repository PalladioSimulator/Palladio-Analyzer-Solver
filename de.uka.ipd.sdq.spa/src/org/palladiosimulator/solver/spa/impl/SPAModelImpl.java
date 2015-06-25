/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.spa.ProcessBehaviour;
import org.palladiosimulator.solver.spa.SPAModel;
import org.palladiosimulator.solver.spa.SpaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SPA Model</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.impl.SPAModelImpl#getProcesses <em>Processes</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.spa.impl.SPAModelImpl#getResources <em>Resources</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class SPAModelImpl extends EObjectImpl implements SPAModel {

    /**
     * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getProcesses()
     * @generated
     * @ordered
     */
    protected EList<ProcessBehaviour> processes;

    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected EList<org.palladiosimulator.solver.resourcemodel.Resource> resources;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SPAModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpaPackage.Literals.SPA_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ProcessBehaviour> getProcesses() {
        if (this.processes == null) {
            this.processes = new EObjectContainmentEList<ProcessBehaviour>(ProcessBehaviour.class, this,
                    SpaPackage.SPA_MODEL__PROCESSES);
        }
        return this.processes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<org.palladiosimulator.solver.resourcemodel.Resource> getResources() {
        if (this.resources == null) {
            this.resources = new EObjectContainmentEList<org.palladiosimulator.solver.resourcemodel.Resource>(
                    org.palladiosimulator.solver.resourcemodel.Resource.class, this, SpaPackage.SPA_MODEL__RESOURCES);
        }
        return this.resources;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case SpaPackage.SPA_MODEL__PROCESSES:
            return ((InternalEList<?>) this.getProcesses()).basicRemove(otherEnd, msgs);
        case SpaPackage.SPA_MODEL__RESOURCES:
            return ((InternalEList<?>) this.getResources()).basicRemove(otherEnd, msgs);
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
        switch (featureID) {
        case SpaPackage.SPA_MODEL__PROCESSES:
            return this.getProcesses();
        case SpaPackage.SPA_MODEL__RESOURCES:
            return this.getResources();
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
        switch (featureID) {
        case SpaPackage.SPA_MODEL__PROCESSES:
            this.getProcesses().clear();
            this.getProcesses().addAll((Collection<? extends ProcessBehaviour>) newValue);
            return;
        case SpaPackage.SPA_MODEL__RESOURCES:
            this.getResources().clear();
            this.getResources()
                    .addAll((Collection<? extends org.palladiosimulator.solver.resourcemodel.Resource>) newValue);
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
        switch (featureID) {
        case SpaPackage.SPA_MODEL__PROCESSES:
            this.getProcesses().clear();
            return;
        case SpaPackage.SPA_MODEL__RESOURCES:
            this.getResources().clear();
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
        switch (featureID) {
        case SpaPackage.SPA_MODEL__PROCESSES:
            return this.processes != null && !this.processes.isEmpty();
        case SpaPackage.SPA_MODEL__RESOURCES:
            return this.resources != null && !this.resources.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SPAModelImpl
