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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.GroupType;
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
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getResultProcessor <em>Result Processor</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getQuantum <em>Quantum</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorTypeImpl extends MinimalEObjectImpl.Container implements
		ProcessorType {
	/**
	 * The cached value of the '{@link #getResultProcessor() <em>Result Processor</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultProcessor;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupType> group;

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
	protected static final Object MULTIPLICITY_EDEFAULT = LqnFactory.eINSTANCE
			.createFromString(LqnPackage.eINSTANCE.getSrvnNonNegativeInteger(),
					"1");

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Object multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	protected static final Object QUANTUM_EDEFAULT = LqnFactory.eINSTANCE
			.createFromString(LqnPackage.eINSTANCE.getSrvnFloat(), "0");

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
	 * This is true if the Replication attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Scheduling attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	protected static final Object SPEED_FACTOR_EDEFAULT = LqnFactory.eINSTANCE
			.createFromString(LqnPackage.eINSTANCE.getSrvnFloat(), "1");

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
	 * This is true if the Speed Factor attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedFactorESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.PROCESSOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputResultType> getResultProcessor() {
		if (resultProcessor == null) {
			resultProcessor = new EObjectContainmentEList<OutputResultType>(
					OutputResultType.class, this,
					LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR);
		}
		return resultProcessor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GroupType> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<GroupType>(GroupType.class,
					this, LqnPackage.PROCESSOR_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskType> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<TaskType>(TaskType.class, this,
					LqnPackage.PROCESSOR_TYPE__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(Object newMultiplicity) {
		Object oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.PROCESSOR_TYPE__MULTIPLICITY, oldMultiplicity,
					multiplicity, !oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMultiplicity() {
		Object oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.PROCESSOR_TYPE__MULTIPLICITY, oldMultiplicity,
					MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMultiplicity() {
		return multiplicityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.PROCESSOR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getQuantum() {
		return quantum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantum(Object newQuantum) {
		Object oldQuantum = quantum;
		quantum = newQuantum;
		boolean oldQuantumESet = quantumESet;
		quantumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.PROCESSOR_TYPE__QUANTUM, oldQuantum, quantum,
					!oldQuantumESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetQuantum() {
		Object oldQuantum = quantum;
		boolean oldQuantumESet = quantumESet;
		quantum = QUANTUM_EDEFAULT;
		quantumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.PROCESSOR_TYPE__QUANTUM, oldQuantum,
					QUANTUM_EDEFAULT, oldQuantumESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetQuantum() {
		return quantumESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplication(BigInteger newReplication) {
		BigInteger oldReplication = replication;
		replication = newReplication;
		boolean oldReplicationESet = replicationESet;
		replicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.PROCESSOR_TYPE__REPLICATION, oldReplication,
					replication, !oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReplication() {
		BigInteger oldReplication = replication;
		boolean oldReplicationESet = replicationESet;
		replication = REPLICATION_EDEFAULT;
		replicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.PROCESSOR_TYPE__REPLICATION, oldReplication,
					REPLICATION_EDEFAULT, oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReplication() {
		return replicationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduling(SchedulingType newScheduling) {
		SchedulingType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT
				: newScheduling;
		boolean oldSchedulingESet = schedulingESet;
		schedulingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.PROCESSOR_TYPE__SCHEDULING, oldScheduling,
					scheduling, !oldSchedulingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScheduling() {
		SchedulingType oldScheduling = scheduling;
		boolean oldSchedulingESet = schedulingESet;
		scheduling = SCHEDULING_EDEFAULT;
		schedulingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.PROCESSOR_TYPE__SCHEDULING, oldScheduling,
					SCHEDULING_EDEFAULT, oldSchedulingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScheduling() {
		return schedulingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeedFactor(Object newSpeedFactor) {
		Object oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR, oldSpeedFactor,
					speedFactor, !oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpeedFactor() {
		Object oldSpeedFactor = speedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactor = SPEED_FACTOR_EDEFAULT;
		speedFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR, oldSpeedFactor,
					SPEED_FACTOR_EDEFAULT, oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpeedFactor() {
		return speedFactorESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
			return ((InternalEList<?>) getResultProcessor()).basicRemove(
					otherEnd, msgs);
		case LqnPackage.PROCESSOR_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case LqnPackage.PROCESSOR_TYPE__TASK:
			return ((InternalEList<?>) getTask()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
			return getResultProcessor();
		case LqnPackage.PROCESSOR_TYPE__GROUP:
			return getGroup();
		case LqnPackage.PROCESSOR_TYPE__TASK:
			return getTask();
		case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
			return getMultiplicity();
		case LqnPackage.PROCESSOR_TYPE__NAME:
			return getName();
		case LqnPackage.PROCESSOR_TYPE__QUANTUM:
			return getQuantum();
		case LqnPackage.PROCESSOR_TYPE__REPLICATION:
			return getReplication();
		case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
			return getScheduling();
		case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
			return getSpeedFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
			getResultProcessor().clear();
			getResultProcessor().addAll(
					(Collection<? extends OutputResultType>) newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__GROUP:
			getGroup().clear();
			getGroup().addAll((Collection<? extends GroupType>) newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends TaskType>) newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
			setMultiplicity(newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__NAME:
			setName((String) newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__QUANTUM:
			setQuantum(newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__REPLICATION:
			setReplication((BigInteger) newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
			setScheduling((SchedulingType) newValue);
			return;
		case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
			setSpeedFactor(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
			getResultProcessor().clear();
			return;
		case LqnPackage.PROCESSOR_TYPE__GROUP:
			getGroup().clear();
			return;
		case LqnPackage.PROCESSOR_TYPE__TASK:
			getTask().clear();
			return;
		case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
			unsetMultiplicity();
			return;
		case LqnPackage.PROCESSOR_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LqnPackage.PROCESSOR_TYPE__QUANTUM:
			unsetQuantum();
			return;
		case LqnPackage.PROCESSOR_TYPE__REPLICATION:
			unsetReplication();
			return;
		case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
			unsetScheduling();
			return;
		case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
			unsetSpeedFactor();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LqnPackage.PROCESSOR_TYPE__RESULT_PROCESSOR:
			return resultProcessor != null && !resultProcessor.isEmpty();
		case LqnPackage.PROCESSOR_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case LqnPackage.PROCESSOR_TYPE__TASK:
			return task != null && !task.isEmpty();
		case LqnPackage.PROCESSOR_TYPE__MULTIPLICITY:
			return isSetMultiplicity();
		case LqnPackage.PROCESSOR_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case LqnPackage.PROCESSOR_TYPE__QUANTUM:
			return isSetQuantum();
		case LqnPackage.PROCESSOR_TYPE__REPLICATION:
			return isSetReplication();
		case LqnPackage.PROCESSOR_TYPE__SCHEDULING:
			return isSetScheduling();
		case LqnPackage.PROCESSOR_TYPE__SPEED_FACTOR:
			return isSetSpeedFactor();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (multiplicity: ");
		if (multiplicityESet)
			result.append(multiplicity);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", quantum: ");
		if (quantumESet)
			result.append(quantum);
		else
			result.append("<unset>");
		result.append(", replication: ");
		if (replicationESet)
			result.append(replication);
		else
			result.append("<unset>");
		result.append(", scheduling: ");
		if (schedulingESet)
			result.append(scheduling);
		else
			result.append("<unset>");
		result.append(", speedFactor: ");
		if (speedFactorESet)
			result.append(speedFactor);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProcessorTypeImpl
