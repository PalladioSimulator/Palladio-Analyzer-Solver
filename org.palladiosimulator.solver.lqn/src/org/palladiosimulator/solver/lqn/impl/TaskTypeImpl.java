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
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.FanInType;
import org.palladiosimulator.solver.lqn.FanOutType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.ServiceType;
import org.palladiosimulator.solver.lqn.TaskActivityGraph;
import org.palladiosimulator.solver.lqn.TaskOptionType;
import org.palladiosimulator.solver.lqn.TaskSchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Task Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getResultTask <em>Result Task</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getFanOut <em>Fan Out</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getFanIn <em>Fan In</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getTaskActivities <em>Task Activities</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getActivityGraph <em>Activity Graph</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getInitially <em>Initially</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskTypeImpl extends MinimalEObjectImpl.Container implements TaskType {
	/**
	 * The cached value of the '{@link #getResultTask() <em>Result Task</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultTask;

	/**
	 * The cached value of the '{@link #getServiceTimeDistribution() <em>Service Time Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getServiceTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDistributionType> serviceTimeDistribution;

	/**
	 * The cached value of the '{@link #getFanOut() <em>Fan Out</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFanOut()
	 * @generated
	 * @ordered
	 */
	protected EList<FanOutType> fanOut;

	/**
	 * The cached value of the '{@link #getFanIn() <em>Fan In</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFanIn()
	 * @generated
	 * @ordered
	 */
	protected EList<FanInType> fanIn;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryType> entry;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> service;

	/**
	 * The cached value of the '{@link #getTaskActivities() <em>Task Activities</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTaskActivities()
	 * @generated
	 * @ordered
	 */
	protected TaskActivityGraph taskActivities;

	/**
	 * The default value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected static final TaskOptionType ACTIVITY_GRAPH_EDEFAULT = TaskOptionType.YES;

	/**
	 * The cached value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected TaskOptionType activityGraph = ACTIVITY_GRAPH_EDEFAULT;

	/**
	 * This is true if the Activity Graph attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityGraphESet;

	/**
	 * The default value of the '{@link #getInitially() <em>Initially</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getInitially()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INITIALLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitially() <em>Initially</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getInitially()
	 * @generated
	 * @ordered
	 */
	protected BigInteger initially = INITIALLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Object MULTIPLICITY_EDEFAULT = LqnFactory.eINSTANCE
			.createFromString(LqnPackage.eINSTANCE.getSrvnNonNegativeInteger(), "1");

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRIORITY_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUEUE_LENGTH_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger queueLength = QUEUE_LENGTH_EDEFAULT;

	/**
	 * This is true if the Queue Length attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueLengthESet;

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
	protected static final TaskSchedulingType SCHEDULING_EDEFAULT = TaskSchedulingType.FCFS;

	/**
	 * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected TaskSchedulingType scheduling = SCHEDULING_EDEFAULT;

	/**
	 * This is true if the Scheduling attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedulingESet;

	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object THINK_TIME_EDEFAULT = LqnFactory.eINSTANCE
			.createFromString(LqnPackage.eINSTANCE.getSrvnFloat(), "0");

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected Object thinkTime = THINK_TIME_EDEFAULT;

	/**
	 * This is true if the Think Time attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thinkTimeESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.TASK_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputResultType> getResultTask() {
		if (resultTask == null) {
			resultTask = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
					LqnPackage.TASK_TYPE__RESULT_TASK);
		}
		return resultTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputDistributionType> getServiceTimeDistribution() {
		if (serviceTimeDistribution == null) {
			serviceTimeDistribution = new EObjectContainmentEList<OutputDistributionType>(OutputDistributionType.class,
					this, LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION);
		}
		return serviceTimeDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FanOutType> getFanOut() {
		if (fanOut == null) {
			fanOut = new EObjectContainmentEList<FanOutType>(FanOutType.class, this, LqnPackage.TASK_TYPE__FAN_OUT);
		}
		return fanOut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FanInType> getFanIn() {
		if (fanIn == null) {
			fanIn = new EObjectContainmentEList<FanInType>(FanInType.class, this, LqnPackage.TASK_TYPE__FAN_IN);
		}
		return fanIn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntryType> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<EntryType>(EntryType.class, this, LqnPackage.TASK_TYPE__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceType> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<ServiceType>(ServiceType.class, this, LqnPackage.TASK_TYPE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskActivityGraph getTaskActivities() {
		return taskActivities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskActivities(TaskActivityGraph newTaskActivities, NotificationChain msgs) {
		TaskActivityGraph oldTaskActivities = taskActivities;
		taskActivities = newTaskActivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LqnPackage.TASK_TYPE__TASK_ACTIVITIES, oldTaskActivities, newTaskActivities);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskActivities(TaskActivityGraph newTaskActivities) {
		if (newTaskActivities != taskActivities) {
			NotificationChain msgs = null;
			if (taskActivities != null)
				msgs = ((InternalEObject) taskActivities).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.TASK_TYPE__TASK_ACTIVITIES, null, msgs);
			if (newTaskActivities != null)
				msgs = ((InternalEObject) newTaskActivities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.TASK_TYPE__TASK_ACTIVITIES, null, msgs);
			msgs = basicSetTaskActivities(newTaskActivities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__TASK_ACTIVITIES,
					newTaskActivities, newTaskActivities));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOptionType getActivityGraph() {
		return activityGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityGraph(TaskOptionType newActivityGraph) {
		TaskOptionType oldActivityGraph = activityGraph;
		activityGraph = newActivityGraph == null ? ACTIVITY_GRAPH_EDEFAULT : newActivityGraph;
		boolean oldActivityGraphESet = activityGraphESet;
		activityGraphESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__ACTIVITY_GRAPH,
					oldActivityGraph, activityGraph, !oldActivityGraphESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActivityGraph() {
		TaskOptionType oldActivityGraph = activityGraph;
		boolean oldActivityGraphESet = activityGraphESet;
		activityGraph = ACTIVITY_GRAPH_EDEFAULT;
		activityGraphESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__ACTIVITY_GRAPH,
					oldActivityGraph, ACTIVITY_GRAPH_EDEFAULT, oldActivityGraphESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActivityGraph() {
		return activityGraphESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getInitially() {
		return initially;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitially(BigInteger newInitially) {
		BigInteger oldInitially = initially;
		initially = newInitially;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__INITIALLY, oldInitially,
					initially));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__MULTIPLICITY, oldMultiplicity,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__MULTIPLICITY, oldMultiplicity,
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(BigInteger newPriority) {
		BigInteger oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__PRIORITY, oldPriority, priority,
					!oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPriority() {
		BigInteger oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__PRIORITY, oldPriority,
					PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getQueueLength() {
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueLength(BigInteger newQueueLength) {
		BigInteger oldQueueLength = queueLength;
		queueLength = newQueueLength;
		boolean oldQueueLengthESet = queueLengthESet;
		queueLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__QUEUE_LENGTH, oldQueueLength,
					queueLength, !oldQueueLengthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetQueueLength() {
		BigInteger oldQueueLength = queueLength;
		boolean oldQueueLengthESet = queueLengthESet;
		queueLength = QUEUE_LENGTH_EDEFAULT;
		queueLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__QUEUE_LENGTH, oldQueueLength,
					QUEUE_LENGTH_EDEFAULT, oldQueueLengthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetQueueLength() {
		return queueLengthESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__REPLICATION, oldReplication,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__REPLICATION, oldReplication,
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
	public TaskSchedulingType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduling(TaskSchedulingType newScheduling) {
		TaskSchedulingType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
		boolean oldSchedulingESet = schedulingESet;
		schedulingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__SCHEDULING, oldScheduling,
					scheduling, !oldSchedulingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScheduling() {
		TaskSchedulingType oldScheduling = scheduling;
		boolean oldSchedulingESet = schedulingESet;
		scheduling = SCHEDULING_EDEFAULT;
		schedulingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__SCHEDULING, oldScheduling,
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
	public Object getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinkTime(Object newThinkTime) {
		Object oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		boolean oldThinkTimeESet = thinkTimeESet;
		thinkTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__THINK_TIME, oldThinkTime,
					thinkTime, !oldThinkTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetThinkTime() {
		Object oldThinkTime = thinkTime;
		boolean oldThinkTimeESet = thinkTimeESet;
		thinkTime = THINK_TIME_EDEFAULT;
		thinkTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__THINK_TIME, oldThinkTime,
					THINK_TIME_EDEFAULT, oldThinkTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetThinkTime() {
		return thinkTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.TASK_TYPE__RESULT_TASK:
			return ((InternalEList<?>) getResultTask()).basicRemove(otherEnd, msgs);
		case LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION:
			return ((InternalEList<?>) getServiceTimeDistribution()).basicRemove(otherEnd, msgs);
		case LqnPackage.TASK_TYPE__FAN_OUT:
			return ((InternalEList<?>) getFanOut()).basicRemove(otherEnd, msgs);
		case LqnPackage.TASK_TYPE__FAN_IN:
			return ((InternalEList<?>) getFanIn()).basicRemove(otherEnd, msgs);
		case LqnPackage.TASK_TYPE__ENTRY:
			return ((InternalEList<?>) getEntry()).basicRemove(otherEnd, msgs);
		case LqnPackage.TASK_TYPE__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
			return basicSetTaskActivities(null, msgs);
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
		case LqnPackage.TASK_TYPE__RESULT_TASK:
			return getResultTask();
		case LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION:
			return getServiceTimeDistribution();
		case LqnPackage.TASK_TYPE__FAN_OUT:
			return getFanOut();
		case LqnPackage.TASK_TYPE__FAN_IN:
			return getFanIn();
		case LqnPackage.TASK_TYPE__ENTRY:
			return getEntry();
		case LqnPackage.TASK_TYPE__SERVICE:
			return getService();
		case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
			return getTaskActivities();
		case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
			return getActivityGraph();
		case LqnPackage.TASK_TYPE__INITIALLY:
			return getInitially();
		case LqnPackage.TASK_TYPE__MULTIPLICITY:
			return getMultiplicity();
		case LqnPackage.TASK_TYPE__NAME:
			return getName();
		case LqnPackage.TASK_TYPE__PRIORITY:
			return getPriority();
		case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
			return getQueueLength();
		case LqnPackage.TASK_TYPE__REPLICATION:
			return getReplication();
		case LqnPackage.TASK_TYPE__SCHEDULING:
			return getScheduling();
		case LqnPackage.TASK_TYPE__THINK_TIME:
			return getThinkTime();
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
		case LqnPackage.TASK_TYPE__RESULT_TASK:
			getResultTask().clear();
			getResultTask().addAll((Collection<? extends OutputResultType>) newValue);
			return;
		case LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION:
			getServiceTimeDistribution().clear();
			getServiceTimeDistribution().addAll((Collection<? extends OutputDistributionType>) newValue);
			return;
		case LqnPackage.TASK_TYPE__FAN_OUT:
			getFanOut().clear();
			getFanOut().addAll((Collection<? extends FanOutType>) newValue);
			return;
		case LqnPackage.TASK_TYPE__FAN_IN:
			getFanIn().clear();
			getFanIn().addAll((Collection<? extends FanInType>) newValue);
			return;
		case LqnPackage.TASK_TYPE__ENTRY:
			getEntry().clear();
			getEntry().addAll((Collection<? extends EntryType>) newValue);
			return;
		case LqnPackage.TASK_TYPE__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends ServiceType>) newValue);
			return;
		case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
			setTaskActivities((TaskActivityGraph) newValue);
			return;
		case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
			setActivityGraph((TaskOptionType) newValue);
			return;
		case LqnPackage.TASK_TYPE__INITIALLY:
			setInitially((BigInteger) newValue);
			return;
		case LqnPackage.TASK_TYPE__MULTIPLICITY:
			setMultiplicity(newValue);
			return;
		case LqnPackage.TASK_TYPE__NAME:
			setName((String) newValue);
			return;
		case LqnPackage.TASK_TYPE__PRIORITY:
			setPriority((BigInteger) newValue);
			return;
		case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
			setQueueLength((BigInteger) newValue);
			return;
		case LqnPackage.TASK_TYPE__REPLICATION:
			setReplication((BigInteger) newValue);
			return;
		case LqnPackage.TASK_TYPE__SCHEDULING:
			setScheduling((TaskSchedulingType) newValue);
			return;
		case LqnPackage.TASK_TYPE__THINK_TIME:
			setThinkTime(newValue);
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
		case LqnPackage.TASK_TYPE__RESULT_TASK:
			getResultTask().clear();
			return;
		case LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION:
			getServiceTimeDistribution().clear();
			return;
		case LqnPackage.TASK_TYPE__FAN_OUT:
			getFanOut().clear();
			return;
		case LqnPackage.TASK_TYPE__FAN_IN:
			getFanIn().clear();
			return;
		case LqnPackage.TASK_TYPE__ENTRY:
			getEntry().clear();
			return;
		case LqnPackage.TASK_TYPE__SERVICE:
			getService().clear();
			return;
		case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
			setTaskActivities((TaskActivityGraph) null);
			return;
		case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
			unsetActivityGraph();
			return;
		case LqnPackage.TASK_TYPE__INITIALLY:
			setInitially(INITIALLY_EDEFAULT);
			return;
		case LqnPackage.TASK_TYPE__MULTIPLICITY:
			unsetMultiplicity();
			return;
		case LqnPackage.TASK_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LqnPackage.TASK_TYPE__PRIORITY:
			unsetPriority();
			return;
		case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
			unsetQueueLength();
			return;
		case LqnPackage.TASK_TYPE__REPLICATION:
			unsetReplication();
			return;
		case LqnPackage.TASK_TYPE__SCHEDULING:
			unsetScheduling();
			return;
		case LqnPackage.TASK_TYPE__THINK_TIME:
			unsetThinkTime();
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
		case LqnPackage.TASK_TYPE__RESULT_TASK:
			return resultTask != null && !resultTask.isEmpty();
		case LqnPackage.TASK_TYPE__SERVICE_TIME_DISTRIBUTION:
			return serviceTimeDistribution != null && !serviceTimeDistribution.isEmpty();
		case LqnPackage.TASK_TYPE__FAN_OUT:
			return fanOut != null && !fanOut.isEmpty();
		case LqnPackage.TASK_TYPE__FAN_IN:
			return fanIn != null && !fanIn.isEmpty();
		case LqnPackage.TASK_TYPE__ENTRY:
			return entry != null && !entry.isEmpty();
		case LqnPackage.TASK_TYPE__SERVICE:
			return service != null && !service.isEmpty();
		case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
			return taskActivities != null;
		case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
			return isSetActivityGraph();
		case LqnPackage.TASK_TYPE__INITIALLY:
			return INITIALLY_EDEFAULT == null ? initially != null : !INITIALLY_EDEFAULT.equals(initially);
		case LqnPackage.TASK_TYPE__MULTIPLICITY:
			return isSetMultiplicity();
		case LqnPackage.TASK_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LqnPackage.TASK_TYPE__PRIORITY:
			return isSetPriority();
		case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
			return isSetQueueLength();
		case LqnPackage.TASK_TYPE__REPLICATION:
			return isSetReplication();
		case LqnPackage.TASK_TYPE__SCHEDULING:
			return isSetScheduling();
		case LqnPackage.TASK_TYPE__THINK_TIME:
			return isSetThinkTime();
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
		result.append(" (activityGraph: ");
		if (activityGraphESet)
			result.append(activityGraph);
		else
			result.append("<unset>");
		result.append(", initially: ");
		result.append(initially);
		result.append(", multiplicity: ");
		if (multiplicityESet)
			result.append(multiplicity);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		if (priorityESet)
			result.append(priority);
		else
			result.append("<unset>");
		result.append(", queueLength: ");
		if (queueLengthESet)
			result.append(queueLength);
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
		result.append(", thinkTime: ");
		if (thinkTimeESet)
			result.append(thinkTime);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TaskTypeImpl
