/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.spa.ProcessBehaviour;
import org.palladiosimulator.solver.spa.SpaPackage;
import org.palladiosimulator.solver.spa.expression.Expression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Process Behaviour</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.impl.ProcessBehaviourImpl#getNumReplicas
 * <em>Num Replicas</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.impl.ProcessBehaviourImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.impl.ProcessBehaviourImpl#getBehaviour
 * <em>Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessBehaviourImpl extends EObjectImpl implements ProcessBehaviour {

    /**
     * The default value of the '{@link #getNumReplicas() <em>Num Replicas</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumReplicas()
     * @generated
     * @ordered
     */
    protected static final int NUM_REPLICAS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumReplicas() <em>Num Replicas</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumReplicas()
     * @generated
     * @ordered
     */
    protected int numReplicas = NUM_REPLICAS_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = "";

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
     * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBehaviour()
     * @generated
     * @ordered
     */
    protected Expression behaviour;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProcessBehaviourImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpaPackage.Literals.PROCESS_BEHAVIOUR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getNumReplicas() {
        return this.numReplicas;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumReplicas(final int newNumReplicas) {
        final int oldNumReplicas = this.numReplicas;
        this.numReplicas = newNumReplicas;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, SpaPackage.PROCESS_BEHAVIOUR__NUM_REPLICAS,
                    oldNumReplicas, this.numReplicas));
        }
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, SpaPackage.PROCESS_BEHAVIOUR__NAME, oldName,
                    this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Expression getBehaviour() {
        return this.behaviour;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBehaviour(final Expression newBehaviour, NotificationChain msgs) {
        final Expression oldBehaviour = this.behaviour;
        this.behaviour = newBehaviour;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR, oldBehaviour, newBehaviour);
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
    public void setBehaviour(final Expression newBehaviour) {
        if (newBehaviour != this.behaviour) {
            NotificationChain msgs = null;
            if (this.behaviour != null) {
                msgs = ((InternalEObject) this.behaviour).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR, null, msgs);
            }
            if (newBehaviour != null) {
                msgs = ((InternalEObject) newBehaviour).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR, null, msgs);
            }
            msgs = this.basicSetBehaviour(newBehaviour, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR,
                    newBehaviour, newBehaviour));
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
        switch (featureID) {
        case SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR:
            return this.basicSetBehaviour(null, msgs);
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
        case SpaPackage.PROCESS_BEHAVIOUR__NUM_REPLICAS:
            return this.getNumReplicas();
        case SpaPackage.PROCESS_BEHAVIOUR__NAME:
            return this.getName();
        case SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR:
            return this.getBehaviour();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SpaPackage.PROCESS_BEHAVIOUR__NUM_REPLICAS:
            this.setNumReplicas((Integer) newValue);
            return;
        case SpaPackage.PROCESS_BEHAVIOUR__NAME:
            this.setName((String) newValue);
            return;
        case SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR:
            this.setBehaviour((Expression) newValue);
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
        case SpaPackage.PROCESS_BEHAVIOUR__NUM_REPLICAS:
            this.setNumReplicas(NUM_REPLICAS_EDEFAULT);
            return;
        case SpaPackage.PROCESS_BEHAVIOUR__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR:
            this.setBehaviour((Expression) null);
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
        case SpaPackage.PROCESS_BEHAVIOUR__NUM_REPLICAS:
            return this.numReplicas != NUM_REPLICAS_EDEFAULT;
        case SpaPackage.PROCESS_BEHAVIOUR__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case SpaPackage.PROCESS_BEHAVIOUR__BEHAVIOUR:
            return this.behaviour != null;
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
        result.append(" (numReplicas: ");
        result.append(this.numReplicas);
        result.append(", name: ");
        result.append(this.name);
        result.append(')');
        return result.toString();
    }

} // ProcessBehaviourImpl
