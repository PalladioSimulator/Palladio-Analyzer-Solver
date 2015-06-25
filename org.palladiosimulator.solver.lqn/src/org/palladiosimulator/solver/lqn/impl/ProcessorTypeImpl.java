/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;
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
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.SchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Processor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getResultProcessor <em>Result
 * Processor</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getTask <em>Task</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getMultiplicity <em>
 * Multiplicity</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getQuantum <em>Quantum</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getReplication <em>Replication
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getScheduling <em>Scheduling
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getSpeedFactor <em>Speed
 * Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorTypeImpl extends EObjectImpl implements ProcessorType {

    /**
     * The cached value of the '{@link #getResultProcessor() <em>Result Processor</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultProcessor()
     * @generated
     * @ordered
     */
    protected EList<OutputResultType> resultProcessor;

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
     * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
    protected static final BigInteger MULTIPLICITY_EDEFAULT = new BigInteger("1");

    /**
     * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
    protected BigInteger multiplicity = MULTIPLICITY_EDEFAULT;

    /**
     * This is true if the Multiplicity attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean multiplicityESet;

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
     * The default value of the '{@link #getQuantum() <em>Quantum</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getQuantum()
     * @generated
     * @ordered
     */
    protected static final Object QUANTUM_EDEFAULT = LqnFactory.eINSTANCE.createFromString(
            LqnPackage.eINSTANCE.getSrvnFloat(), "0");

    /**
     * The cached value of the '{@link #getQuantum() <em>Quantum</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getQuantum()
     * @generated
     * @ordered
     */
    protected Object quantum = QUANTUM_EDEFAULT;

    /**
     * This is true if the Quantum attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean quantumESet;

    /**
     * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplication()
     * @generated
     * @ordered
     */
    protected static final BigInteger REPLICATION_EDEFAULT = new BigInteger("1");

    /**
     * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReplication()
     * @generated
     * @ordered
     */
    protected BigInteger replication = REPLICATION_EDEFAULT;

    /**
     * This is true if the Replication attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean replicationESet;

    /**
     * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getScheduling()
     * @generated
     * @ordered
     */
    protected static final SchedulingType SCHEDULING_EDEFAULT = SchedulingType.FCFS;

    /**
     * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getScheduling()
     * @generated
     * @ordered
     */
    protected SchedulingType scheduling = SCHEDULING_EDEFAULT;

    /**
     * This is true if the Scheduling attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean schedulingESet;

    /**
     * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSpeedFactor()
     * @generated
     * @ordered
     */
    protected static final Object SPEED_FACTOR_EDEFAULT = LqnFactory.eINSTANCE.createFromString(
            LqnPackage.eINSTANCE.getSrvnFloat(), "1");

    /**
     * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSpeedFactor()
     * @generated
     * @ordered
     */
    protected Object speedFactor = SPEED_FACTOR_EDEFAULT;

    /**
     * This is true if the Speed Factor attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean speedFactorESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ProcessorTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.PROCESSOR_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultType> getResultProcessor() {
        if (this.resultProcessor == null)
        {
            this.resultProcessor = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
                    LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR);
        }
        return this.resultProcessor;
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
            this.task = new EObjectContainmentEList<TaskType>(TaskType.class, this, LqnPackage.PROCESSOR_TYPE__TASK);
        }
        return this.task;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getMultiplicity() {
        return this.multiplicity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMultiplicity(final BigInteger newMultiplicity) {
        final BigInteger oldMultiplicity = this.multiplicity;
        this.multiplicity = newMultiplicity;
        final boolean oldMultiplicityESet = this.multiplicityESet;
        this.multiplicityESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR_TYPE__MULTIPLICITY,
                    oldMultiplicity, this.multiplicity, !oldMultiplicityESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetMultiplicity() {
        final BigInteger oldMultiplicity = this.multiplicity;
        final boolean oldMultiplicityESet = this.multiplicityESet;
        this.multiplicity = MULTIPLICITY_EDEFAULT;
        this.multiplicityESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PROCESSOR_TYPE__MULTIPLICITY,
                    oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetMultiplicity() {
        return this.multiplicityESet;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR_TYPE__NAME, oldName,
                    this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getQuantum() {
        return this.quantum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setQuantum(final Object newQuantum) {
        final Object oldQuantum = this.quantum;
        this.quantum = newQuantum;
        final boolean oldQuantumESet = this.quantumESet;
        this.quantumESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR_TYPE__QUANTUM, oldQuantum,
                    this.quantum, !oldQuantumESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetQuantum() {
        final Object oldQuantum = this.quantum;
        final boolean oldQuantumESet = this.quantumESet;
        this.quantum = QUANTUM_EDEFAULT;
        this.quantumESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PROCESSOR_TYPE__QUANTUM,
                    oldQuantum,
                    QUANTUM_EDEFAULT, oldQuantumESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetQuantum() {
        return this.quantumESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getReplication() {
        return this.replication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReplication(final BigInteger newReplication) {
        final BigInteger oldReplication = this.replication;
        this.replication = newReplication;
        final boolean oldReplicationESet = this.replicationESet;
        this.replicationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR_TYPE__REPLICATION,
                    oldReplication, this.replication, !oldReplicationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetReplication() {
        final BigInteger oldReplication = this.replication;
        final boolean oldReplicationESet = this.replicationESet;
        this.replication = REPLICATION_EDEFAULT;
        this.replicationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PROCESSOR_TYPE__REPLICATION,
                    oldReplication, REPLICATION_EDEFAULT, oldReplicationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetReplication() {
        return this.replicationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SchedulingType getScheduling() {
        return this.scheduling;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setScheduling(final SchedulingType newScheduling) {
        final SchedulingType oldScheduling = this.scheduling;
        this.scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
        final boolean oldSchedulingESet = this.schedulingESet;
        this.schedulingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR_TYPE__SCHEDULING,
                    oldScheduling,
                    this.scheduling, !oldSchedulingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetScheduling() {
        final SchedulingType oldScheduling = this.scheduling;
        final boolean oldSchedulingESet = this.schedulingESet;
        this.scheduling = SCHEDULING_EDEFAULT;
        this.schedulingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PROCESSOR_TYPE__SCHEDULING,
                    oldScheduling, SCHEDULING_EDEFAULT, oldSchedulingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetScheduling() {
        return this.schedulingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getSpeedFactor() {
        return this.speedFactor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSpeedFactor(final Object newSpeedFactor) {
        final Object oldSpeedFactor = this.speedFactor;
        this.speedFactor = newSpeedFactor;
        final boolean oldSpeedFactorESet = this.speedFactorESet;
        this.speedFactorESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR,
                    oldSpeedFactor, this.speedFactor, !oldSpeedFactorESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSpeedFactor() {
        final Object oldSpeedFactor = this.speedFactor;
        final boolean oldSpeedFactorESet = this.speedFactorESet;
        this.speedFactor = SPEED_FACTOR_EDEFAULT;
        this.speedFactorESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR,
                    oldSpeedFactor, SPEED_FACTOR_EDEFAULT, oldSpeedFactorESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSpeedFactor() {
        return this.speedFactorESet;
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
        case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
            return ((InternalEList<?>) this.getResultProcessor()).basicRemove(otherEnd, msgs);
        case LqnPackage.PROCESSOR_TYPE__TASK:
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
        case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
            return this.getResultProcessor();
        case LqnPackage.PROCESSOR_TYPE__TASK:
            return this.getTask();
        case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
            return this.getMultiplicity();
        case LqnPackage.PROCESSOR_TYPE__NAME:
            return this.getName();
        case LqnPackage.PROCESSOR_TYPE__QUANTUM:
            return this.getQuantum();
        case LqnPackage.PROCESSOR_TYPE__REPLICATION:
            return this.getReplication();
        case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
            return this.getScheduling();
        case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
            return this.getSpeedFactor();
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
        case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
            this.getResultProcessor().clear();
            this.getResultProcessor().addAll((Collection<? extends OutputResultType>) newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__TASK:
            this.getTask().clear();
            this.getTask().addAll((Collection<? extends TaskType>) newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
            this.setMultiplicity((BigInteger) newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__NAME:
            this.setName((String) newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__QUANTUM:
            this.setQuantum(newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__REPLICATION:
            this.setReplication((BigInteger) newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
            this.setScheduling((SchedulingType) newValue);
            return;
        case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
            this.setSpeedFactor(newValue);
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
        case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
            this.getResultProcessor().clear();
            return;
        case LqnPackage.PROCESSOR_TYPE__TASK:
            this.getTask().clear();
            return;
        case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
            this.unsetMultiplicity();
            return;
        case LqnPackage.PROCESSOR_TYPE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case LqnPackage.PROCESSOR_TYPE__QUANTUM:
            this.unsetQuantum();
            return;
        case LqnPackage.PROCESSOR_TYPE__REPLICATION:
            this.unsetReplication();
            return;
        case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
            this.unsetScheduling();
            return;
        case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
            this.unsetSpeedFactor();
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
        case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
            return this.resultProcessor != null && !this.resultProcessor.isEmpty();
        case LqnPackage.PROCESSOR_TYPE__TASK:
            return this.task != null && !this.task.isEmpty();
        case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
            return this.isSetMultiplicity();
        case LqnPackage.PROCESSOR_TYPE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case LqnPackage.PROCESSOR_TYPE__QUANTUM:
            return this.isSetQuantum();
        case LqnPackage.PROCESSOR_TYPE__REPLICATION:
            return this.isSetReplication();
        case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
            return this.isSetScheduling();
        case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
            return this.isSetSpeedFactor();
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
        result.append(" (multiplicity: ");
        if (this.multiplicityESet) {
            result.append(this.multiplicity);
        } else {
            result.append("<unset>");
        }
        result.append(", name: ");
        result.append(this.name);
        result.append(", quantum: ");
        if (this.quantumESet) {
            result.append(this.quantum);
        } else {
            result.append("<unset>");
        }
        result.append(", replication: ");
        if (this.replicationESet) {
            result.append(this.replication);
        } else {
            result.append("<unset>");
        }
        result.append(", scheduling: ");
        if (this.schedulingESet) {
            result.append(this.scheduling);
        } else {
            result.append("<unset>");
        }
        result.append(", speedFactor: ");
        if (this.speedFactorESet) {
            result.append(this.speedFactor);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // ProcessorTypeImpl
