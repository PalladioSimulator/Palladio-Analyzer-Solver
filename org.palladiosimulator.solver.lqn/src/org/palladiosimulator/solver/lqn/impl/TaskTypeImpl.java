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
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnPackage;
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
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getResultTask <em>Result Task</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getEntry <em>Entry</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getService <em>Service</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getTaskActivities
 * <em>Task Activities</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getActivityGraph
 * <em>Activity Graph</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getPriority <em>Priority</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getQueueLength
 * <em>Queue Length</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getReplication <em>Replication</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getScheduling <em>Scheduling</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl#getThinkTime <em>Think Time</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class TaskTypeImpl extends EObjectImpl implements TaskType {

    /**
     * The cached value of the '{@link #getResultTask() <em>Result Task</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultTask()
     * @generated
     * @ordered
     */
    protected EList<OutputResultType> resultTask;

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
     *
     * @see #getService()
     * @generated
     * @ordered
     */
    protected EList<ServiceType> service;

    /**
     * The cached value of the '{@link #getTaskActivities() <em>Task Activities</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTaskActivities()
     * @generated
     * @ordered
     */
    protected TaskActivityGraph taskActivities;

    /**
     * The default value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
     * This is true if the Activity Graph attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean activityGraphESet;

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
     * This is true if the Priority attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
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
     * This is true if the Queue Length attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
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
     * This is true if the Scheduling attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
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
     * This is true if the Think Time attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean thinkTimeESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TaskTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.TASK_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultType> getResultTask() {
        if (this.resultTask == null) {
            this.resultTask = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
                    LqnPackage.TASK_TYPE__RESULT_TASK);
        }
        return this.resultTask;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EntryType> getEntry() {
        if (this.entry == null) {
            this.entry = new EObjectContainmentEList<EntryType>(EntryType.class, this, LqnPackage.TASK_TYPE__ENTRY);
        }
        return this.entry;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ServiceType> getService() {
        if (this.service == null) {
            this.service = new EObjectContainmentEList<ServiceType>(ServiceType.class, this,
                    LqnPackage.TASK_TYPE__SERVICE);
        }
        return this.service;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TaskActivityGraph getTaskActivities() {
        return this.taskActivities;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTaskActivities(final TaskActivityGraph newTaskActivities, NotificationChain msgs) {
        final TaskActivityGraph oldTaskActivities = this.taskActivities;
        this.taskActivities = newTaskActivities;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.TASK_TYPE__TASK_ACTIVITIES, oldTaskActivities, newTaskActivities);
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
    public void setTaskActivities(final TaskActivityGraph newTaskActivities) {
        if (newTaskActivities != this.taskActivities) {
            NotificationChain msgs = null;
            if (this.taskActivities != null) {
                msgs = ((InternalEObject) this.taskActivities).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.TASK_TYPE__TASK_ACTIVITIES, null, msgs);
            }
            if (newTaskActivities != null) {
                msgs = ((InternalEObject) newTaskActivities).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.TASK_TYPE__TASK_ACTIVITIES, null, msgs);
            }
            msgs = this.basicSetTaskActivities(newTaskActivities, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__TASK_ACTIVITIES,
                    newTaskActivities, newTaskActivities));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TaskOptionType getActivityGraph() {
        return this.activityGraph;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setActivityGraph(final TaskOptionType newActivityGraph) {
        final TaskOptionType oldActivityGraph = this.activityGraph;
        this.activityGraph = newActivityGraph == null ? ACTIVITY_GRAPH_EDEFAULT : newActivityGraph;
        final boolean oldActivityGraphESet = this.activityGraphESet;
        this.activityGraphESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__ACTIVITY_GRAPH,
                    oldActivityGraph, this.activityGraph, !oldActivityGraphESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetActivityGraph() {
        final TaskOptionType oldActivityGraph = this.activityGraph;
        final boolean oldActivityGraphESet = this.activityGraphESet;
        this.activityGraph = ACTIVITY_GRAPH_EDEFAULT;
        this.activityGraphESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__ACTIVITY_GRAPH,
                    oldActivityGraph, ACTIVITY_GRAPH_EDEFAULT, oldActivityGraphESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetActivityGraph() {
        return this.activityGraphESet;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__MULTIPLICITY,
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
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__MULTIPLICITY,
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__NAME, oldName, this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getPriority() {
        return this.priority;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPriority(final BigInteger newPriority) {
        final BigInteger oldPriority = this.priority;
        this.priority = newPriority;
        final boolean oldPriorityESet = this.priorityESet;
        this.priorityESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__PRIORITY, oldPriority,
                    this.priority, !oldPriorityESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPriority() {
        final BigInteger oldPriority = this.priority;
        final boolean oldPriorityESet = this.priorityESet;
        this.priority = PRIORITY_EDEFAULT;
        this.priorityESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__PRIORITY, oldPriority,
                    PRIORITY_EDEFAULT, oldPriorityESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPriority() {
        return this.priorityESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getQueueLength() {
        return this.queueLength;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setQueueLength(final BigInteger newQueueLength) {
        final BigInteger oldQueueLength = this.queueLength;
        this.queueLength = newQueueLength;
        final boolean oldQueueLengthESet = this.queueLengthESet;
        this.queueLengthESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__QUEUE_LENGTH,
                    oldQueueLength, this.queueLength, !oldQueueLengthESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetQueueLength() {
        final BigInteger oldQueueLength = this.queueLength;
        final boolean oldQueueLengthESet = this.queueLengthESet;
        this.queueLength = QUEUE_LENGTH_EDEFAULT;
        this.queueLengthESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__QUEUE_LENGTH,
                    oldQueueLength, QUEUE_LENGTH_EDEFAULT, oldQueueLengthESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetQueueLength() {
        return this.queueLengthESet;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__REPLICATION,
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
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__REPLICATION,
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
    public TaskSchedulingType getScheduling() {
        return this.scheduling;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setScheduling(final TaskSchedulingType newScheduling) {
        final TaskSchedulingType oldScheduling = this.scheduling;
        this.scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
        final boolean oldSchedulingESet = this.schedulingESet;
        this.schedulingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__SCHEDULING, oldScheduling,
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
        final TaskSchedulingType oldScheduling = this.scheduling;
        final boolean oldSchedulingESet = this.schedulingESet;
        this.scheduling = SCHEDULING_EDEFAULT;
        this.schedulingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__SCHEDULING,
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
    public Object getThinkTime() {
        return this.thinkTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setThinkTime(final Object newThinkTime) {
        final Object oldThinkTime = this.thinkTime;
        this.thinkTime = newThinkTime;
        final boolean oldThinkTimeESet = this.thinkTimeESet;
        this.thinkTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK_TYPE__THINK_TIME, oldThinkTime,
                    this.thinkTime, !oldThinkTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetThinkTime() {
        final Object oldThinkTime = this.thinkTime;
        final boolean oldThinkTimeESet = this.thinkTimeESet;
        this.thinkTime = THINK_TIME_EDEFAULT;
        this.thinkTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.TASK_TYPE__THINK_TIME, oldThinkTime,
                    THINK_TIME_EDEFAULT, oldThinkTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetThinkTime() {
        return this.thinkTimeESet;
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
        case LqnPackage.TASK_TYPE__RESULT_TASK:
            return ((InternalEList<?>) this.getResultTask()).basicRemove(otherEnd, msgs);
        case LqnPackage.TASK_TYPE__ENTRY:
            return ((InternalEList<?>) this.getEntry()).basicRemove(otherEnd, msgs);
        case LqnPackage.TASK_TYPE__SERVICE:
            return ((InternalEList<?>) this.getService()).basicRemove(otherEnd, msgs);
        case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
            return this.basicSetTaskActivities(null, msgs);
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
        case LqnPackage.TASK_TYPE__RESULT_TASK:
            return this.getResultTask();
        case LqnPackage.TASK_TYPE__ENTRY:
            return this.getEntry();
        case LqnPackage.TASK_TYPE__SERVICE:
            return this.getService();
        case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
            return this.getTaskActivities();
        case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
            return this.getActivityGraph();
        case LqnPackage.TASK_TYPE__MULTIPLICITY:
            return this.getMultiplicity();
        case LqnPackage.TASK_TYPE__NAME:
            return this.getName();
        case LqnPackage.TASK_TYPE__PRIORITY:
            return this.getPriority();
        case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
            return this.getQueueLength();
        case LqnPackage.TASK_TYPE__REPLICATION:
            return this.getReplication();
        case LqnPackage.TASK_TYPE__SCHEDULING:
            return this.getScheduling();
        case LqnPackage.TASK_TYPE__THINK_TIME:
            return this.getThinkTime();
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
        case LqnPackage.TASK_TYPE__RESULT_TASK:
            this.getResultTask().clear();
            this.getResultTask().addAll((Collection<? extends OutputResultType>) newValue);
            return;
        case LqnPackage.TASK_TYPE__ENTRY:
            this.getEntry().clear();
            this.getEntry().addAll((Collection<? extends EntryType>) newValue);
            return;
        case LqnPackage.TASK_TYPE__SERVICE:
            this.getService().clear();
            this.getService().addAll((Collection<? extends ServiceType>) newValue);
            return;
        case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
            this.setTaskActivities((TaskActivityGraph) newValue);
            return;
        case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
            this.setActivityGraph((TaskOptionType) newValue);
            return;
        case LqnPackage.TASK_TYPE__MULTIPLICITY:
            this.setMultiplicity((BigInteger) newValue);
            return;
        case LqnPackage.TASK_TYPE__NAME:
            this.setName((String) newValue);
            return;
        case LqnPackage.TASK_TYPE__PRIORITY:
            this.setPriority((BigInteger) newValue);
            return;
        case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
            this.setQueueLength((BigInteger) newValue);
            return;
        case LqnPackage.TASK_TYPE__REPLICATION:
            this.setReplication((BigInteger) newValue);
            return;
        case LqnPackage.TASK_TYPE__SCHEDULING:
            this.setScheduling((TaskSchedulingType) newValue);
            return;
        case LqnPackage.TASK_TYPE__THINK_TIME:
            this.setThinkTime(newValue);
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
        case LqnPackage.TASK_TYPE__RESULT_TASK:
            this.getResultTask().clear();
            return;
        case LqnPackage.TASK_TYPE__ENTRY:
            this.getEntry().clear();
            return;
        case LqnPackage.TASK_TYPE__SERVICE:
            this.getService().clear();
            return;
        case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
            this.setTaskActivities((TaskActivityGraph) null);
            return;
        case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
            this.unsetActivityGraph();
            return;
        case LqnPackage.TASK_TYPE__MULTIPLICITY:
            this.unsetMultiplicity();
            return;
        case LqnPackage.TASK_TYPE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case LqnPackage.TASK_TYPE__PRIORITY:
            this.unsetPriority();
            return;
        case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
            this.unsetQueueLength();
            return;
        case LqnPackage.TASK_TYPE__REPLICATION:
            this.unsetReplication();
            return;
        case LqnPackage.TASK_TYPE__SCHEDULING:
            this.unsetScheduling();
            return;
        case LqnPackage.TASK_TYPE__THINK_TIME:
            this.unsetThinkTime();
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
        case LqnPackage.TASK_TYPE__RESULT_TASK:
            return this.resultTask != null && !this.resultTask.isEmpty();
        case LqnPackage.TASK_TYPE__ENTRY:
            return this.entry != null && !this.entry.isEmpty();
        case LqnPackage.TASK_TYPE__SERVICE:
            return this.service != null && !this.service.isEmpty();
        case LqnPackage.TASK_TYPE__TASK_ACTIVITIES:
            return this.taskActivities != null;
        case LqnPackage.TASK_TYPE__ACTIVITY_GRAPH:
            return this.isSetActivityGraph();
        case LqnPackage.TASK_TYPE__MULTIPLICITY:
            return this.isSetMultiplicity();
        case LqnPackage.TASK_TYPE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case LqnPackage.TASK_TYPE__PRIORITY:
            return this.isSetPriority();
        case LqnPackage.TASK_TYPE__QUEUE_LENGTH:
            return this.isSetQueueLength();
        case LqnPackage.TASK_TYPE__REPLICATION:
            return this.isSetReplication();
        case LqnPackage.TASK_TYPE__SCHEDULING:
            return this.isSetScheduling();
        case LqnPackage.TASK_TYPE__THINK_TIME:
            return this.isSetThinkTime();
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
        result.append(" (activityGraph: ");
        if (this.activityGraphESet) {
            result.append(this.activityGraph);
        } else {
            result.append("<unset>");
        }
        result.append(", multiplicity: ");
        if (this.multiplicityESet) {
            result.append(this.multiplicity);
        } else {
            result.append("<unset>");
        }
        result.append(", name: ");
        result.append(this.name);
        result.append(", priority: ");
        if (this.priorityESet) {
            result.append(this.priority);
        } else {
            result.append("<unset>");
        }
        result.append(", queueLength: ");
        if (this.queueLengthESet) {
            result.append(this.queueLength);
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
        result.append(", thinkTime: ");
        if (this.thinkTimeESet) {
            result.append(this.thinkTime);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // TaskTypeImpl
