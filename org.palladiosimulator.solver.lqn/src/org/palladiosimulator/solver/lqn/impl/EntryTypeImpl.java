/**
 */
package org.palladiosimulator.solver.lqn.impl;

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
import org.palladiosimulator.solver.lqn.EntryActivityGraph;
import org.palladiosimulator.solver.lqn.EntryMakingCallType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.PhaseActivities;
import org.palladiosimulator.solver.lqn.RWLockType;
import org.palladiosimulator.solver.lqn.SemaphoreType;
import org.palladiosimulator.solver.lqn.TypeType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entry Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getResultEntry <em>Result Entry
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getServiceTimeDistribution <em>
 * Service Time Distribution</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getForwarding <em>Forwarding</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getEntryActivityGraph <em>Entry
 * Activity Graph</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getEntryPhaseActivities <em>Entry
 * Phase Activities</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getOpenArrivalRate <em>Open
 * Arrival Rate</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getPriority <em>Priority</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getRwlock <em>Rwlock</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getSemaphore <em>Semaphore</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryTypeImpl extends MinimalEObjectImpl.Container implements EntryType {
    /**
     * The cached value of the '{@link #getResultEntry() <em>Result Entry</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultEntry()
     * @generated
     * @ordered
     */
    protected EList<OutputResultType> resultEntry;

    /**
     * The cached value of the '{@link #getServiceTimeDistribution()
     * <em>Service Time Distribution</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getServiceTimeDistribution()
     * @generated
     * @ordered
     */
    protected EList<OutputEntryDistributionType> serviceTimeDistribution;

    /**
     * The cached value of the '{@link #getForwarding() <em>Forwarding</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getForwarding()
     * @generated
     * @ordered
     */
    protected EList<EntryMakingCallType> forwarding;

    /**
     * The cached value of the '{@link #getEntryActivityGraph() <em>Entry Activity Graph</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEntryActivityGraph()
     * @generated
     * @ordered
     */
    protected EntryActivityGraph entryActivityGraph;

    /**
     * The cached value of the '{@link #getEntryPhaseActivities() <em>Entry Phase Activities</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEntryPhaseActivities()
     * @generated
     * @ordered
     */
    protected PhaseActivities entryPhaseActivities;

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
     * The default value of the '{@link #getOpenArrivalRate() <em>Open Arrival Rate</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOpenArrivalRate()
     * @generated
     * @ordered
     */
    protected static final Object OPEN_ARRIVAL_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpenArrivalRate() <em>Open Arrival Rate</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOpenArrivalRate()
     * @generated
     * @ordered
     */
    protected Object openArrivalRate = OPEN_ARRIVAL_RATE_EDEFAULT;

    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final int PRIORITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected int priority = PRIORITY_EDEFAULT;

    /**
     * This is true if the Priority attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean priorityESet;

    /**
     * The default value of the '{@link #getRwlock() <em>Rwlock</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlock()
     * @generated
     * @ordered
     */
    protected static final RWLockType RWLOCK_EDEFAULT = RWLockType.RUNLOCK;

    /**
     * The cached value of the '{@link #getRwlock() <em>Rwlock</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getRwlock()
     * @generated
     * @ordered
     */
    protected RWLockType rwlock = RWLOCK_EDEFAULT;

    /**
     * This is true if the Rwlock attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockESet;

    /**
     * The default value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSemaphore()
     * @generated
     * @ordered
     */
    protected static final SemaphoreType SEMAPHORE_EDEFAULT = SemaphoreType.SIGNAL;

    /**
     * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSemaphore()
     * @generated
     * @ordered
     */
    protected SemaphoreType semaphore = SEMAPHORE_EDEFAULT;

    /**
     * This is true if the Semaphore attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean semaphoreESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final TypeType TYPE_EDEFAULT = TypeType.PH1PH2;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected TypeType type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EntryTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.ENTRY_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputResultType> getResultEntry() {
        if (this.resultEntry == null)
        {
            this.resultEntry = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this,
                    LqnPackage.ENTRY_TYPE__RESULT_ENTRY);
        }
        return this.resultEntry;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<OutputEntryDistributionType> getServiceTimeDistribution() {
        if (this.serviceTimeDistribution == null)
        {
            this.serviceTimeDistribution = new EObjectContainmentEList<OutputEntryDistributionType>(
                    OutputEntryDistributionType.class, this, LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION);
        }
        return this.serviceTimeDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EntryMakingCallType> getForwarding() {
        if (this.forwarding == null)
        {
            this.forwarding = new EObjectContainmentEList<EntryMakingCallType>(EntryMakingCallType.class, this,
                    LqnPackage.ENTRY_TYPE__FORWARDING);
        }
        return this.forwarding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryActivityGraph getEntryActivityGraph() {
        return this.entryActivityGraph;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetEntryActivityGraph(final EntryActivityGraph newEntryActivityGraph,
            NotificationChain msgs) {
        final EntryActivityGraph oldEntryActivityGraph = this.entryActivityGraph;
        this.entryActivityGraph = newEntryActivityGraph;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, oldEntryActivityGraph, newEntryActivityGraph);
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
    public void setEntryActivityGraph(final EntryActivityGraph newEntryActivityGraph) {
        if (newEntryActivityGraph != this.entryActivityGraph)
        {
            NotificationChain msgs = null;
            if (this.entryActivityGraph != null) {
                msgs = ((InternalEObject) this.entryActivityGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, null, msgs);
            }
            if (newEntryActivityGraph != null) {
                msgs = ((InternalEObject) newEntryActivityGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, null, msgs);
            }
            msgs = this.basicSetEntryActivityGraph(newEntryActivityGraph, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH,
                    newEntryActivityGraph, newEntryActivityGraph));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PhaseActivities getEntryPhaseActivities() {
        return this.entryPhaseActivities;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetEntryPhaseActivities(final PhaseActivities newEntryPhaseActivities,
            NotificationChain msgs) {
        final PhaseActivities oldEntryPhaseActivities = this.entryPhaseActivities;
        this.entryPhaseActivities = newEntryPhaseActivities;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, oldEntryPhaseActivities, newEntryPhaseActivities);
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
    public void setEntryPhaseActivities(final PhaseActivities newEntryPhaseActivities) {
        if (newEntryPhaseActivities != this.entryPhaseActivities)
        {
            NotificationChain msgs = null;
            if (this.entryPhaseActivities != null) {
                msgs = ((InternalEObject) this.entryPhaseActivities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, null, msgs);
            }
            if (newEntryPhaseActivities != null) {
                msgs = ((InternalEObject) newEntryPhaseActivities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, null, msgs);
            }
            msgs = this.basicSetEntryPhaseActivities(newEntryPhaseActivities, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES,
                    newEntryPhaseActivities, newEntryPhaseActivities));
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__NAME, oldName, this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getOpenArrivalRate() {
        return this.openArrivalRate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOpenArrivalRate(final Object newOpenArrivalRate) {
        final Object oldOpenArrivalRate = this.openArrivalRate;
        this.openArrivalRate = newOpenArrivalRate;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE,
                    oldOpenArrivalRate, this.openArrivalRate));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getPriority() {
        return this.priority;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPriority(final int newPriority) {
        final int oldPriority = this.priority;
        this.priority = newPriority;
        final boolean oldPriorityESet = this.priorityESet;
        this.priorityESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__PRIORITY, oldPriority,
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
        final int oldPriority = this.priority;
        final boolean oldPriorityESet = this.priorityESet;
        this.priority = PRIORITY_EDEFAULT;
        this.priorityESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.ENTRY_TYPE__PRIORITY, oldPriority,
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
    public RWLockType getRwlock() {
        return this.rwlock;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlock(final RWLockType newRwlock) {
        final RWLockType oldRwlock = this.rwlock;
        this.rwlock = newRwlock == null ? RWLOCK_EDEFAULT : newRwlock;
        final boolean oldRwlockESet = this.rwlockESet;
        this.rwlockESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__RWLOCK, oldRwlock,
                    this.rwlock,
                    !oldRwlockESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlock() {
        final RWLockType oldRwlock = this.rwlock;
        final boolean oldRwlockESet = this.rwlockESet;
        this.rwlock = RWLOCK_EDEFAULT;
        this.rwlockESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.ENTRY_TYPE__RWLOCK, oldRwlock,
                    RWLOCK_EDEFAULT, oldRwlockESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlock() {
        return this.rwlockESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SemaphoreType getSemaphore() {
        return this.semaphore;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSemaphore(final SemaphoreType newSemaphore) {
        final SemaphoreType oldSemaphore = this.semaphore;
        this.semaphore = newSemaphore == null ? SEMAPHORE_EDEFAULT : newSemaphore;
        final boolean oldSemaphoreESet = this.semaphoreESet;
        this.semaphoreESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__SEMAPHORE, oldSemaphore,
                    this.semaphore, !oldSemaphoreESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSemaphore() {
        final SemaphoreType oldSemaphore = this.semaphore;
        final boolean oldSemaphoreESet = this.semaphoreESet;
        this.semaphore = SEMAPHORE_EDEFAULT;
        this.semaphoreESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.ENTRY_TYPE__SEMAPHORE,
                    oldSemaphore,
                    SEMAPHORE_EDEFAULT, oldSemaphoreESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSemaphore() {
        return this.semaphoreESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TypeType getType() {
        return this.type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setType(final TypeType newType) {
        final TypeType oldType = this.type;
        this.type = newType == null ? TYPE_EDEFAULT : newType;
        final boolean oldTypeESet = this.typeESet;
        this.typeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY_TYPE__TYPE, oldType, this.type,
                    !oldTypeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetType() {
        final TypeType oldType = this.type;
        final boolean oldTypeESet = this.typeESet;
        this.type = TYPE_EDEFAULT;
        this.typeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.ENTRY_TYPE__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetType() {
        return this.typeESet;
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
        case LqnPackage.ENTRY_TYPE__RESULT_ENTRY:
            return ((InternalEList<?>) this.getResultEntry()).basicRemove(otherEnd, msgs);
        case LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
            return ((InternalEList<?>) this.getServiceTimeDistribution()).basicRemove(otherEnd, msgs);
        case LqnPackage.ENTRY_TYPE__FORWARDING:
            return ((InternalEList<?>) this.getForwarding()).basicRemove(otherEnd, msgs);
        case LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
            return this.basicSetEntryActivityGraph(null, msgs);
        case LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
            return this.basicSetEntryPhaseActivities(null, msgs);
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
        case LqnPackage.ENTRY_TYPE__RESULT_ENTRY:
            return this.getResultEntry();
        case LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
            return this.getServiceTimeDistribution();
        case LqnPackage.ENTRY_TYPE__FORWARDING:
            return this.getForwarding();
        case LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
            return this.getEntryActivityGraph();
        case LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
            return this.getEntryPhaseActivities();
        case LqnPackage.ENTRY_TYPE__NAME:
            return this.getName();
        case LqnPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
            return this.getOpenArrivalRate();
        case LqnPackage.ENTRY_TYPE__PRIORITY:
            return this.getPriority();
        case LqnPackage.ENTRY_TYPE__RWLOCK:
            return this.getRwlock();
        case LqnPackage.ENTRY_TYPE__SEMAPHORE:
            return this.getSemaphore();
        case LqnPackage.ENTRY_TYPE__TYPE:
            return this.getType();
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
        case LqnPackage.ENTRY_TYPE__RESULT_ENTRY:
            this.getResultEntry().clear();
            this.getResultEntry().addAll((Collection<? extends OutputResultType>) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
            this.getServiceTimeDistribution().clear();
            this.getServiceTimeDistribution().addAll((Collection<? extends OutputEntryDistributionType>) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__FORWARDING:
            this.getForwarding().clear();
            this.getForwarding().addAll((Collection<? extends EntryMakingCallType>) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
            this.setEntryActivityGraph((EntryActivityGraph) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
            this.setEntryPhaseActivities((PhaseActivities) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__NAME:
            this.setName((String) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
            this.setOpenArrivalRate(newValue);
            return;
        case LqnPackage.ENTRY_TYPE__PRIORITY:
            this.setPriority((Integer) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__RWLOCK:
            this.setRwlock((RWLockType) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__SEMAPHORE:
            this.setSemaphore((SemaphoreType) newValue);
            return;
        case LqnPackage.ENTRY_TYPE__TYPE:
            this.setType((TypeType) newValue);
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
        case LqnPackage.ENTRY_TYPE__RESULT_ENTRY:
            this.getResultEntry().clear();
            return;
        case LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
            this.getServiceTimeDistribution().clear();
            return;
        case LqnPackage.ENTRY_TYPE__FORWARDING:
            this.getForwarding().clear();
            return;
        case LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
            this.setEntryActivityGraph((EntryActivityGraph) null);
            return;
        case LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
            this.setEntryPhaseActivities((PhaseActivities) null);
            return;
        case LqnPackage.ENTRY_TYPE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case LqnPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
            this.setOpenArrivalRate(OPEN_ARRIVAL_RATE_EDEFAULT);
            return;
        case LqnPackage.ENTRY_TYPE__PRIORITY:
            this.unsetPriority();
            return;
        case LqnPackage.ENTRY_TYPE__RWLOCK:
            this.unsetRwlock();
            return;
        case LqnPackage.ENTRY_TYPE__SEMAPHORE:
            this.unsetSemaphore();
            return;
        case LqnPackage.ENTRY_TYPE__TYPE:
            this.unsetType();
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
        case LqnPackage.ENTRY_TYPE__RESULT_ENTRY:
            return this.resultEntry != null && !this.resultEntry.isEmpty();
        case LqnPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
            return this.serviceTimeDistribution != null && !this.serviceTimeDistribution.isEmpty();
        case LqnPackage.ENTRY_TYPE__FORWARDING:
            return this.forwarding != null && !this.forwarding.isEmpty();
        case LqnPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
            return this.entryActivityGraph != null;
        case LqnPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
            return this.entryPhaseActivities != null;
        case LqnPackage.ENTRY_TYPE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case LqnPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
            return OPEN_ARRIVAL_RATE_EDEFAULT == null ? this.openArrivalRate != null : !OPEN_ARRIVAL_RATE_EDEFAULT
            .equals(this.openArrivalRate);
        case LqnPackage.ENTRY_TYPE__PRIORITY:
            return this.isSetPriority();
        case LqnPackage.ENTRY_TYPE__RWLOCK:
            return this.isSetRwlock();
        case LqnPackage.ENTRY_TYPE__SEMAPHORE:
            return this.isSetSemaphore();
        case LqnPackage.ENTRY_TYPE__TYPE:
            return this.isSetType();
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
        result.append(" (name: ");
        result.append(this.name);
        result.append(", openArrivalRate: ");
        result.append(this.openArrivalRate);
        result.append(", priority: ");
        if (this.priorityESet) {
            result.append(this.priority);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlock: ");
        if (this.rwlockESet) {
            result.append(this.rwlock);
        } else {
            result.append("<unset>");
        }
        result.append(", semaphore: ");
        if (this.semaphoreESet) {
            result.append(this.semaphore);
        } else {
            result.append("<unset>");
        }
        result.append(", type: ");
        if (this.typeESet) {
            result.append(this.type);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // EntryTypeImpl
