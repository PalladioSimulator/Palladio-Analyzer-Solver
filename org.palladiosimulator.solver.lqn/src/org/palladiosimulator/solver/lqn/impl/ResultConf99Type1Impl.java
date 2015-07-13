/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ResultConf99Type1;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result Conf99 Type1</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getLossProbability <em>
 * Loss Probability</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getOpenWaitTime <em>Open
 * Wait Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase1ProcWaiting <em>
 * Phase1 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase1ServiceTime <em>
 * Phase1 Service Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase1ServiceTimeVariance
 * <em>Phase1 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase1Utilization <em>
 * Phase1 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase1Waiting <em>
 * Phase1 Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase1WaitingVariance
 * <em>Phase1 Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase2ProcWaiting <em>
 * Phase2 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase2ServiceTime <em>
 * Phase2 Service Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase2ServiceTimeVariance
 * <em>Phase2 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase2Utilization <em>
 * Phase2 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase2Waiting <em>
 * Phase2 Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase2WaitingVariance
 * <em>Phase2 Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase3ProcWaiting <em>
 * Phase3 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase3ServiceTime <em>
 * Phase3 Service Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase3ServiceTimeVariance
 * <em>Phase3 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase3Utilization <em>
 * Phase3 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase3Waiting <em>
 * Phase3 Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getPhase3WaitingVariance
 * <em>Phase3 Waiting Variance</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getProbExceedMaxServiceTime
 * <em>Prob Exceed Max Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getProcUtilization <em>
 * Proc Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getProcWaiting <em>Proc
 * Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockReaderHolding
 * <em>Rwlock Reader Holding</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockReaderUtilization
 * <em>Rwlock Reader Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockReaderWaiting
 * <em>Rwlock Reader Waiting</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockReaderWaitingVariance
 * <em>Rwlock Reader Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockWriterHolding
 * <em>Rwlock Writer Holding</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockWriterUtilization
 * <em>Rwlock Writer Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockWriterWaiting
 * <em>Rwlock Writer Waiting</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getRwlockWriterWaitingVariance
 * <em>Rwlock Writer Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getSemaphoreUtilization
 * <em>Semaphore Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getSemaphoreWaiting <em>
 * Semaphore Waiting</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getSemaphoreWaitingVariance
 * <em>Semaphore Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getServiceTime <em>Service
 * Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getServiceTimeVariance
 * <em>Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getSquaredCoeffVariation
 * <em>Squared Coeff Variation</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getThroughput <em>
 * Throughput</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getThroughputBound <em>
 * Throughput Bound</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getUtilization <em>
 * Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getWaiting <em>Waiting
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl#getWaitingVariance <em>
 * Waiting Variance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultConf99Type1Impl extends MinimalEObjectImpl.Container implements ResultConf99Type1 {
    /**
     * The default value of the '{@link #getLossProbability() <em>Loss Probability</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLossProbability()
     * @generated
     * @ordered
     */
    protected static final double LOSS_PROBABILITY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLossProbability() <em>Loss Probability</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLossProbability()
     * @generated
     * @ordered
     */
    protected double lossProbability = LOSS_PROBABILITY_EDEFAULT;

    /**
     * This is true if the Loss Probability attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean lossProbabilityESet;

    /**
     * The default value of the '{@link #getOpenWaitTime() <em>Open Wait Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOpenWaitTime()
     * @generated
     * @ordered
     */
    protected static final double OPEN_WAIT_TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getOpenWaitTime() <em>Open Wait Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOpenWaitTime()
     * @generated
     * @ordered
     */
    protected double openWaitTime = OPEN_WAIT_TIME_EDEFAULT;

    /**
     * This is true if the Open Wait Time attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean openWaitTimeESet;

    /**
     * The default value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ProcWaiting()
     * @generated
     * @ordered
     */
    protected static final double PHASE1_PROC_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ProcWaiting()
     * @generated
     * @ordered
     */
    protected double phase1ProcWaiting = PHASE1_PROC_WAITING_EDEFAULT;

    /**
     * This is true if the Phase1 Proc Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase1ProcWaitingESet;

    /**
     * The default value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ServiceTime()
     * @generated
     * @ordered
     */
    protected static final double PHASE1_SERVICE_TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ServiceTime()
     * @generated
     * @ordered
     */
    protected double phase1ServiceTime = PHASE1_SERVICE_TIME_EDEFAULT;

    /**
     * This is true if the Phase1 Service Time attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase1ServiceTimeESet;

    /**
     * The default value of the '{@link #getPhase1ServiceTimeVariance()
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase1ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final double PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase1ServiceTimeVariance()
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase1ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected double phase1ServiceTimeVariance = PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * This is true if the Phase1 Service Time Variance attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase1ServiceTimeVarianceESet;

    /**
     * The default value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1Utilization()
     * @generated
     * @ordered
     */
    protected static final double PHASE1_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1Utilization()
     * @generated
     * @ordered
     */
    protected double phase1Utilization = PHASE1_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Phase1 Utilization attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase1UtilizationESet;

    /**
     * The default value of the '{@link #getPhase1Waiting() <em>Phase1 Waiting</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1Waiting()
     * @generated
     * @ordered
     */
    protected static final double PHASE1_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase1Waiting() <em>Phase1 Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1Waiting()
     * @generated
     * @ordered
     */
    protected double phase1Waiting = PHASE1_WAITING_EDEFAULT;

    /**
     * This is true if the Phase1 Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase1WaitingESet;

    /**
     * The default value of the '{@link #getPhase1WaitingVariance()
     * <em>Phase1 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1WaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double PHASE1_WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase1WaitingVariance() <em>Phase1 Waiting Variance</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1WaitingVariance()
     * @generated
     * @ordered
     */
    protected double phase1WaitingVariance = PHASE1_WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Phase1 Waiting Variance attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase1WaitingVarianceESet;

    /**
     * The default value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ProcWaiting()
     * @generated
     * @ordered
     */
    protected static final double PHASE2_PROC_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ProcWaiting()
     * @generated
     * @ordered
     */
    protected double phase2ProcWaiting = PHASE2_PROC_WAITING_EDEFAULT;

    /**
     * This is true if the Phase2 Proc Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase2ProcWaitingESet;

    /**
     * The default value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ServiceTime()
     * @generated
     * @ordered
     */
    protected static final double PHASE2_SERVICE_TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ServiceTime()
     * @generated
     * @ordered
     */
    protected double phase2ServiceTime = PHASE2_SERVICE_TIME_EDEFAULT;

    /**
     * This is true if the Phase2 Service Time attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase2ServiceTimeESet;

    /**
     * The default value of the '{@link #getPhase2ServiceTimeVariance()
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase2ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final double PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase2ServiceTimeVariance()
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase2ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected double phase2ServiceTimeVariance = PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * This is true if the Phase2 Service Time Variance attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase2ServiceTimeVarianceESet;

    /**
     * The default value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2Utilization()
     * @generated
     * @ordered
     */
    protected static final double PHASE2_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2Utilization()
     * @generated
     * @ordered
     */
    protected double phase2Utilization = PHASE2_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Phase2 Utilization attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase2UtilizationESet;

    /**
     * The default value of the '{@link #getPhase2Waiting() <em>Phase2 Waiting</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2Waiting()
     * @generated
     * @ordered
     */
    protected static final double PHASE2_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase2Waiting() <em>Phase2 Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2Waiting()
     * @generated
     * @ordered
     */
    protected double phase2Waiting = PHASE2_WAITING_EDEFAULT;

    /**
     * This is true if the Phase2 Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase2WaitingESet;

    /**
     * The default value of the '{@link #getPhase2WaitingVariance()
     * <em>Phase2 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2WaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double PHASE2_WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase2WaitingVariance() <em>Phase2 Waiting Variance</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2WaitingVariance()
     * @generated
     * @ordered
     */
    protected double phase2WaitingVariance = PHASE2_WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Phase2 Waiting Variance attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase2WaitingVarianceESet;

    /**
     * The default value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ProcWaiting()
     * @generated
     * @ordered
     */
    protected static final double PHASE3_PROC_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ProcWaiting()
     * @generated
     * @ordered
     */
    protected double phase3ProcWaiting = PHASE3_PROC_WAITING_EDEFAULT;

    /**
     * This is true if the Phase3 Proc Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase3ProcWaitingESet;

    /**
     * The default value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ServiceTime()
     * @generated
     * @ordered
     */
    protected static final double PHASE3_SERVICE_TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ServiceTime()
     * @generated
     * @ordered
     */
    protected double phase3ServiceTime = PHASE3_SERVICE_TIME_EDEFAULT;

    /**
     * This is true if the Phase3 Service Time attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase3ServiceTimeESet;

    /**
     * The default value of the '{@link #getPhase3ServiceTimeVariance()
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase3ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final double PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase3ServiceTimeVariance()
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase3ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected double phase3ServiceTimeVariance = PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * This is true if the Phase3 Service Time Variance attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase3ServiceTimeVarianceESet;

    /**
     * The default value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3Utilization()
     * @generated
     * @ordered
     */
    protected static final double PHASE3_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3Utilization()
     * @generated
     * @ordered
     */
    protected double phase3Utilization = PHASE3_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Phase3 Utilization attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase3UtilizationESet;

    /**
     * The default value of the '{@link #getPhase3Waiting() <em>Phase3 Waiting</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3Waiting()
     * @generated
     * @ordered
     */
    protected static final double PHASE3_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase3Waiting() <em>Phase3 Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3Waiting()
     * @generated
     * @ordered
     */
    protected double phase3Waiting = PHASE3_WAITING_EDEFAULT;

    /**
     * This is true if the Phase3 Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase3WaitingESet;

    /**
     * The default value of the '{@link #getPhase3WaitingVariance()
     * <em>Phase3 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3WaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double PHASE3_WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPhase3WaitingVariance() <em>Phase3 Waiting Variance</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3WaitingVariance()
     * @generated
     * @ordered
     */
    protected double phase3WaitingVariance = PHASE3_WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Phase3 Waiting Variance attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phase3WaitingVarianceESet;

    /**
     * The default value of the '{@link #getProbExceedMaxServiceTime()
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getProbExceedMaxServiceTime()
     * @generated
     * @ordered
     */
    protected static final double PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProbExceedMaxServiceTime()
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getProbExceedMaxServiceTime()
     * @generated
     * @ordered
     */
    protected double probExceedMaxServiceTime = PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT;

    /**
     * This is true if the Prob Exceed Max Service Time attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean probExceedMaxServiceTimeESet;

    /**
     * The default value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcUtilization()
     * @generated
     * @ordered
     */
    protected static final double PROC_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcUtilization()
     * @generated
     * @ordered
     */
    protected double procUtilization = PROC_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Proc Utilization attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean procUtilizationESet;

    /**
     * The default value of the '{@link #getProcWaiting() <em>Proc Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcWaiting()
     * @generated
     * @ordered
     */
    protected static final double PROC_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProcWaiting() <em>Proc Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcWaiting()
     * @generated
     * @ordered
     */
    protected double procWaiting = PROC_WAITING_EDEFAULT;

    /**
     * This is true if the Proc Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean procWaitingESet;

    /**
     * The default value of the '{@link #getRwlockReaderHolding() <em>Rwlock Reader Holding</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockReaderHolding()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_READER_HOLDING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockReaderHolding() <em>Rwlock Reader Holding</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockReaderHolding()
     * @generated
     * @ordered
     */
    protected double rwlockReaderHolding = RWLOCK_READER_HOLDING_EDEFAULT;

    /**
     * This is true if the Rwlock Reader Holding attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockReaderHoldingESet;

    /**
     * The default value of the '{@link #getRwlockReaderUtilization()
     * <em>Rwlock Reader Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockReaderUtilization()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_READER_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockReaderUtilization()
     * <em>Rwlock Reader Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockReaderUtilization()
     * @generated
     * @ordered
     */
    protected double rwlockReaderUtilization = RWLOCK_READER_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Rwlock Reader Utilization attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockReaderUtilizationESet;

    /**
     * The default value of the '{@link #getRwlockReaderWaiting() <em>Rwlock Reader Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockReaderWaiting()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_READER_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockReaderWaiting() <em>Rwlock Reader Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockReaderWaiting()
     * @generated
     * @ordered
     */
    protected double rwlockReaderWaiting = RWLOCK_READER_WAITING_EDEFAULT;

    /**
     * This is true if the Rwlock Reader Waiting attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockReaderWaitingESet;

    /**
     * The default value of the '{@link #getRwlockReaderWaitingVariance()
     * <em>Rwlock Reader Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getRwlockReaderWaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_READER_WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockReaderWaitingVariance()
     * <em>Rwlock Reader Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getRwlockReaderWaitingVariance()
     * @generated
     * @ordered
     */
    protected double rwlockReaderWaitingVariance = RWLOCK_READER_WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Rwlock Reader Waiting Variance attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockReaderWaitingVarianceESet;

    /**
     * The default value of the '{@link #getRwlockWriterHolding() <em>Rwlock Writer Holding</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockWriterHolding()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_WRITER_HOLDING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockWriterHolding() <em>Rwlock Writer Holding</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockWriterHolding()
     * @generated
     * @ordered
     */
    protected double rwlockWriterHolding = RWLOCK_WRITER_HOLDING_EDEFAULT;

    /**
     * This is true if the Rwlock Writer Holding attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockWriterHoldingESet;

    /**
     * The default value of the '{@link #getRwlockWriterUtilization()
     * <em>Rwlock Writer Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockWriterUtilization()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_WRITER_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockWriterUtilization()
     * <em>Rwlock Writer Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockWriterUtilization()
     * @generated
     * @ordered
     */
    protected double rwlockWriterUtilization = RWLOCK_WRITER_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Rwlock Writer Utilization attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockWriterUtilizationESet;

    /**
     * The default value of the '{@link #getRwlockWriterWaiting() <em>Rwlock Writer Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockWriterWaiting()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_WRITER_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockWriterWaiting() <em>Rwlock Writer Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRwlockWriterWaiting()
     * @generated
     * @ordered
     */
    protected double rwlockWriterWaiting = RWLOCK_WRITER_WAITING_EDEFAULT;

    /**
     * This is true if the Rwlock Writer Waiting attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockWriterWaitingESet;

    /**
     * The default value of the '{@link #getRwlockWriterWaitingVariance()
     * <em>Rwlock Writer Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getRwlockWriterWaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getRwlockWriterWaitingVariance()
     * <em>Rwlock Writer Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getRwlockWriterWaitingVariance()
     * @generated
     * @ordered
     */
    protected double rwlockWriterWaitingVariance = RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Rwlock Writer Waiting Variance attribute has been set. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean rwlockWriterWaitingVarianceESet;

    /**
     * The default value of the '{@link #getSemaphoreUtilization() <em>Semaphore Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSemaphoreUtilization()
     * @generated
     * @ordered
     */
    protected static final double SEMAPHORE_UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSemaphoreUtilization() <em>Semaphore Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSemaphoreUtilization()
     * @generated
     * @ordered
     */
    protected double semaphoreUtilization = SEMAPHORE_UTILIZATION_EDEFAULT;

    /**
     * This is true if the Semaphore Utilization attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean semaphoreUtilizationESet;

    /**
     * The default value of the '{@link #getSemaphoreWaiting() <em>Semaphore Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSemaphoreWaiting()
     * @generated
     * @ordered
     */
    protected static final double SEMAPHORE_WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSemaphoreWaiting() <em>Semaphore Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSemaphoreWaiting()
     * @generated
     * @ordered
     */
    protected double semaphoreWaiting = SEMAPHORE_WAITING_EDEFAULT;

    /**
     * This is true if the Semaphore Waiting attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean semaphoreWaitingESet;

    /**
     * The default value of the '{@link #getSemaphoreWaitingVariance()
     * <em>Semaphore Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getSemaphoreWaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double SEMAPHORE_WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSemaphoreWaitingVariance()
     * <em>Semaphore Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getSemaphoreWaitingVariance()
     * @generated
     * @ordered
     */
    protected double semaphoreWaitingVariance = SEMAPHORE_WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Semaphore Waiting Variance attribute has been set. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean semaphoreWaitingVarianceESet;

    /**
     * The default value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTime()
     * @generated
     * @ordered
     */
    protected static final double SERVICE_TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTime()
     * @generated
     * @ordered
     */
    protected double serviceTime = SERVICE_TIME_EDEFAULT;

    /**
     * This is true if the Service Time attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean serviceTimeESet;

    /**
     * The default value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final double SERVICE_TIME_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected double serviceTimeVariance = SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * This is true if the Service Time Variance attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean serviceTimeVarianceESet;

    /**
     * The default value of the '{@link #getSquaredCoeffVariation()
     * <em>Squared Coeff Variation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSquaredCoeffVariation()
     * @generated
     * @ordered
     */
    protected static final double SQUARED_COEFF_VARIATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSquaredCoeffVariation()
     * @generated
     * @ordered
     */
    protected double squaredCoeffVariation = SQUARED_COEFF_VARIATION_EDEFAULT;

    /**
     * This is true if the Squared Coeff Variation attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean squaredCoeffVariationESet;

    /**
     * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughput()
     * @generated
     * @ordered
     */
    protected static final double THROUGHPUT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughput()
     * @generated
     * @ordered
     */
    protected double throughput = THROUGHPUT_EDEFAULT;

    /**
     * This is true if the Throughput attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean throughputESet;

    /**
     * The default value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughputBound()
     * @generated
     * @ordered
     */
    protected static final double THROUGHPUT_BOUND_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughputBound()
     * @generated
     * @ordered
     */
    protected double throughputBound = THROUGHPUT_BOUND_EDEFAULT;

    /**
     * This is true if the Throughput Bound attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean throughputBoundESet;

    /**
     * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUtilization()
     * @generated
     * @ordered
     */
    protected static final double UTILIZATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUtilization()
     * @generated
     * @ordered
     */
    protected double utilization = UTILIZATION_EDEFAULT;

    /**
     * This is true if the Utilization attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean utilizationESet;

    /**
     * The default value of the '{@link #getWaiting() <em>Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaiting()
     * @generated
     * @ordered
     */
    protected static final double WAITING_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getWaiting() <em>Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaiting()
     * @generated
     * @ordered
     */
    protected double waiting = WAITING_EDEFAULT;

    /**
     * This is true if the Waiting attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean waitingESet;

    /**
     * The default value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaitingVariance()
     * @generated
     * @ordered
     */
    protected static final double WAITING_VARIANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaitingVariance()
     * @generated
     * @ordered
     */
    protected double waitingVariance = WAITING_VARIANCE_EDEFAULT;

    /**
     * This is true if the Waiting Variance attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean waitingVarianceESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResultConf99Type1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.RESULT_CONF99_TYPE1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getLossProbability() {
        return this.lossProbability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLossProbability(final double newLossProbability) {
        final double oldLossProbability = this.lossProbability;
        this.lossProbability = newLossProbability;
        final boolean oldLossProbabilityESet = this.lossProbabilityESet;
        this.lossProbabilityESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY,
                    oldLossProbability, this.lossProbability, !oldLossProbabilityESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetLossProbability() {
        final double oldLossProbability = this.lossProbability;
        final boolean oldLossProbabilityESet = this.lossProbabilityESet;
        this.lossProbability = LOSS_PROBABILITY_EDEFAULT;
        this.lossProbabilityESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY,
                    oldLossProbability, LOSS_PROBABILITY_EDEFAULT, oldLossProbabilityESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetLossProbability() {
        return this.lossProbabilityESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getOpenWaitTime() {
        return this.openWaitTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOpenWaitTime(final double newOpenWaitTime) {
        final double oldOpenWaitTime = this.openWaitTime;
        this.openWaitTime = newOpenWaitTime;
        final boolean oldOpenWaitTimeESet = this.openWaitTimeESet;
        this.openWaitTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME,
                    oldOpenWaitTime, this.openWaitTime, !oldOpenWaitTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetOpenWaitTime() {
        final double oldOpenWaitTime = this.openWaitTime;
        final boolean oldOpenWaitTimeESet = this.openWaitTimeESet;
        this.openWaitTime = OPEN_WAIT_TIME_EDEFAULT;
        this.openWaitTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME,
                    oldOpenWaitTime, OPEN_WAIT_TIME_EDEFAULT, oldOpenWaitTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetOpenWaitTime() {
        return this.openWaitTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase1ProcWaiting() {
        return this.phase1ProcWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1ProcWaiting(final double newPhase1ProcWaiting) {
        final double oldPhase1ProcWaiting = this.phase1ProcWaiting;
        this.phase1ProcWaiting = newPhase1ProcWaiting;
        final boolean oldPhase1ProcWaitingESet = this.phase1ProcWaitingESet;
        this.phase1ProcWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING,
                    oldPhase1ProcWaiting, this.phase1ProcWaiting, !oldPhase1ProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase1ProcWaiting() {
        final double oldPhase1ProcWaiting = this.phase1ProcWaiting;
        final boolean oldPhase1ProcWaitingESet = this.phase1ProcWaitingESet;
        this.phase1ProcWaiting = PHASE1_PROC_WAITING_EDEFAULT;
        this.phase1ProcWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING, oldPhase1ProcWaiting,
                    PHASE1_PROC_WAITING_EDEFAULT, oldPhase1ProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase1ProcWaiting() {
        return this.phase1ProcWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase1ServiceTime() {
        return this.phase1ServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1ServiceTime(final double newPhase1ServiceTime) {
        final double oldPhase1ServiceTime = this.phase1ServiceTime;
        this.phase1ServiceTime = newPhase1ServiceTime;
        final boolean oldPhase1ServiceTimeESet = this.phase1ServiceTimeESet;
        this.phase1ServiceTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME,
                    oldPhase1ServiceTime, this.phase1ServiceTime, !oldPhase1ServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase1ServiceTime() {
        final double oldPhase1ServiceTime = this.phase1ServiceTime;
        final boolean oldPhase1ServiceTimeESet = this.phase1ServiceTimeESet;
        this.phase1ServiceTime = PHASE1_SERVICE_TIME_EDEFAULT;
        this.phase1ServiceTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME, oldPhase1ServiceTime,
                    PHASE1_SERVICE_TIME_EDEFAULT, oldPhase1ServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase1ServiceTime() {
        return this.phase1ServiceTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase1ServiceTimeVariance() {
        return this.phase1ServiceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1ServiceTimeVariance(final double newPhase1ServiceTimeVariance) {
        final double oldPhase1ServiceTimeVariance = this.phase1ServiceTimeVariance;
        this.phase1ServiceTimeVariance = newPhase1ServiceTimeVariance;
        final boolean oldPhase1ServiceTimeVarianceESet = this.phase1ServiceTimeVarianceESet;
        this.phase1ServiceTimeVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE, oldPhase1ServiceTimeVariance,
                    this.phase1ServiceTimeVariance, !oldPhase1ServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase1ServiceTimeVariance() {
        final double oldPhase1ServiceTimeVariance = this.phase1ServiceTimeVariance;
        final boolean oldPhase1ServiceTimeVarianceESet = this.phase1ServiceTimeVarianceESet;
        this.phase1ServiceTimeVariance = PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT;
        this.phase1ServiceTimeVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE, oldPhase1ServiceTimeVariance,
                    PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT, oldPhase1ServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase1ServiceTimeVariance() {
        return this.phase1ServiceTimeVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase1Utilization() {
        return this.phase1Utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1Utilization(final double newPhase1Utilization) {
        final double oldPhase1Utilization = this.phase1Utilization;
        this.phase1Utilization = newPhase1Utilization;
        final boolean oldPhase1UtilizationESet = this.phase1UtilizationESet;
        this.phase1UtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION,
                    oldPhase1Utilization, this.phase1Utilization, !oldPhase1UtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase1Utilization() {
        final double oldPhase1Utilization = this.phase1Utilization;
        final boolean oldPhase1UtilizationESet = this.phase1UtilizationESet;
        this.phase1Utilization = PHASE1_UTILIZATION_EDEFAULT;
        this.phase1UtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION,
                    oldPhase1Utilization, PHASE1_UTILIZATION_EDEFAULT, oldPhase1UtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase1Utilization() {
        return this.phase1UtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase1Waiting() {
        return this.phase1Waiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1Waiting(final double newPhase1Waiting) {
        final double oldPhase1Waiting = this.phase1Waiting;
        this.phase1Waiting = newPhase1Waiting;
        final boolean oldPhase1WaitingESet = this.phase1WaitingESet;
        this.phase1WaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING,
                    oldPhase1Waiting, this.phase1Waiting, !oldPhase1WaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase1Waiting() {
        final double oldPhase1Waiting = this.phase1Waiting;
        final boolean oldPhase1WaitingESet = this.phase1WaitingESet;
        this.phase1Waiting = PHASE1_WAITING_EDEFAULT;
        this.phase1WaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING,
                    oldPhase1Waiting, PHASE1_WAITING_EDEFAULT, oldPhase1WaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase1Waiting() {
        return this.phase1WaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase1WaitingVariance() {
        return this.phase1WaitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1WaitingVariance(final double newPhase1WaitingVariance) {
        final double oldPhase1WaitingVariance = this.phase1WaitingVariance;
        this.phase1WaitingVariance = newPhase1WaitingVariance;
        final boolean oldPhase1WaitingVarianceESet = this.phase1WaitingVarianceESet;
        this.phase1WaitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE, oldPhase1WaitingVariance,
                    this.phase1WaitingVariance, !oldPhase1WaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase1WaitingVariance() {
        final double oldPhase1WaitingVariance = this.phase1WaitingVariance;
        final boolean oldPhase1WaitingVarianceESet = this.phase1WaitingVarianceESet;
        this.phase1WaitingVariance = PHASE1_WAITING_VARIANCE_EDEFAULT;
        this.phase1WaitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE, oldPhase1WaitingVariance,
                    PHASE1_WAITING_VARIANCE_EDEFAULT, oldPhase1WaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase1WaitingVariance() {
        return this.phase1WaitingVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase2ProcWaiting() {
        return this.phase2ProcWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2ProcWaiting(final double newPhase2ProcWaiting) {
        final double oldPhase2ProcWaiting = this.phase2ProcWaiting;
        this.phase2ProcWaiting = newPhase2ProcWaiting;
        final boolean oldPhase2ProcWaitingESet = this.phase2ProcWaitingESet;
        this.phase2ProcWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING,
                    oldPhase2ProcWaiting, this.phase2ProcWaiting, !oldPhase2ProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase2ProcWaiting() {
        final double oldPhase2ProcWaiting = this.phase2ProcWaiting;
        final boolean oldPhase2ProcWaitingESet = this.phase2ProcWaitingESet;
        this.phase2ProcWaiting = PHASE2_PROC_WAITING_EDEFAULT;
        this.phase2ProcWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING, oldPhase2ProcWaiting,
                    PHASE2_PROC_WAITING_EDEFAULT, oldPhase2ProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase2ProcWaiting() {
        return this.phase2ProcWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase2ServiceTime() {
        return this.phase2ServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2ServiceTime(final double newPhase2ServiceTime) {
        final double oldPhase2ServiceTime = this.phase2ServiceTime;
        this.phase2ServiceTime = newPhase2ServiceTime;
        final boolean oldPhase2ServiceTimeESet = this.phase2ServiceTimeESet;
        this.phase2ServiceTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME,
                    oldPhase2ServiceTime, this.phase2ServiceTime, !oldPhase2ServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase2ServiceTime() {
        final double oldPhase2ServiceTime = this.phase2ServiceTime;
        final boolean oldPhase2ServiceTimeESet = this.phase2ServiceTimeESet;
        this.phase2ServiceTime = PHASE2_SERVICE_TIME_EDEFAULT;
        this.phase2ServiceTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME, oldPhase2ServiceTime,
                    PHASE2_SERVICE_TIME_EDEFAULT, oldPhase2ServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase2ServiceTime() {
        return this.phase2ServiceTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase2ServiceTimeVariance() {
        return this.phase2ServiceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2ServiceTimeVariance(final double newPhase2ServiceTimeVariance) {
        final double oldPhase2ServiceTimeVariance = this.phase2ServiceTimeVariance;
        this.phase2ServiceTimeVariance = newPhase2ServiceTimeVariance;
        final boolean oldPhase2ServiceTimeVarianceESet = this.phase2ServiceTimeVarianceESet;
        this.phase2ServiceTimeVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE, oldPhase2ServiceTimeVariance,
                    this.phase2ServiceTimeVariance, !oldPhase2ServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase2ServiceTimeVariance() {
        final double oldPhase2ServiceTimeVariance = this.phase2ServiceTimeVariance;
        final boolean oldPhase2ServiceTimeVarianceESet = this.phase2ServiceTimeVarianceESet;
        this.phase2ServiceTimeVariance = PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT;
        this.phase2ServiceTimeVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE, oldPhase2ServiceTimeVariance,
                    PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT, oldPhase2ServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase2ServiceTimeVariance() {
        return this.phase2ServiceTimeVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase2Utilization() {
        return this.phase2Utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2Utilization(final double newPhase2Utilization) {
        final double oldPhase2Utilization = this.phase2Utilization;
        this.phase2Utilization = newPhase2Utilization;
        final boolean oldPhase2UtilizationESet = this.phase2UtilizationESet;
        this.phase2UtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION,
                    oldPhase2Utilization, this.phase2Utilization, !oldPhase2UtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase2Utilization() {
        final double oldPhase2Utilization = this.phase2Utilization;
        final boolean oldPhase2UtilizationESet = this.phase2UtilizationESet;
        this.phase2Utilization = PHASE2_UTILIZATION_EDEFAULT;
        this.phase2UtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION,
                    oldPhase2Utilization, PHASE2_UTILIZATION_EDEFAULT, oldPhase2UtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase2Utilization() {
        return this.phase2UtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase2Waiting() {
        return this.phase2Waiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2Waiting(final double newPhase2Waiting) {
        final double oldPhase2Waiting = this.phase2Waiting;
        this.phase2Waiting = newPhase2Waiting;
        final boolean oldPhase2WaitingESet = this.phase2WaitingESet;
        this.phase2WaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING,
                    oldPhase2Waiting, this.phase2Waiting, !oldPhase2WaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase2Waiting() {
        final double oldPhase2Waiting = this.phase2Waiting;
        final boolean oldPhase2WaitingESet = this.phase2WaitingESet;
        this.phase2Waiting = PHASE2_WAITING_EDEFAULT;
        this.phase2WaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING,
                    oldPhase2Waiting, PHASE2_WAITING_EDEFAULT, oldPhase2WaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase2Waiting() {
        return this.phase2WaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase2WaitingVariance() {
        return this.phase2WaitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2WaitingVariance(final double newPhase2WaitingVariance) {
        final double oldPhase2WaitingVariance = this.phase2WaitingVariance;
        this.phase2WaitingVariance = newPhase2WaitingVariance;
        final boolean oldPhase2WaitingVarianceESet = this.phase2WaitingVarianceESet;
        this.phase2WaitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE, oldPhase2WaitingVariance,
                    this.phase2WaitingVariance, !oldPhase2WaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase2WaitingVariance() {
        final double oldPhase2WaitingVariance = this.phase2WaitingVariance;
        final boolean oldPhase2WaitingVarianceESet = this.phase2WaitingVarianceESet;
        this.phase2WaitingVariance = PHASE2_WAITING_VARIANCE_EDEFAULT;
        this.phase2WaitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE, oldPhase2WaitingVariance,
                    PHASE2_WAITING_VARIANCE_EDEFAULT, oldPhase2WaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase2WaitingVariance() {
        return this.phase2WaitingVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase3ProcWaiting() {
        return this.phase3ProcWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3ProcWaiting(final double newPhase3ProcWaiting) {
        final double oldPhase3ProcWaiting = this.phase3ProcWaiting;
        this.phase3ProcWaiting = newPhase3ProcWaiting;
        final boolean oldPhase3ProcWaitingESet = this.phase3ProcWaitingESet;
        this.phase3ProcWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING,
                    oldPhase3ProcWaiting, this.phase3ProcWaiting, !oldPhase3ProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase3ProcWaiting() {
        final double oldPhase3ProcWaiting = this.phase3ProcWaiting;
        final boolean oldPhase3ProcWaitingESet = this.phase3ProcWaitingESet;
        this.phase3ProcWaiting = PHASE3_PROC_WAITING_EDEFAULT;
        this.phase3ProcWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING, oldPhase3ProcWaiting,
                    PHASE3_PROC_WAITING_EDEFAULT, oldPhase3ProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase3ProcWaiting() {
        return this.phase3ProcWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase3ServiceTime() {
        return this.phase3ServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3ServiceTime(final double newPhase3ServiceTime) {
        final double oldPhase3ServiceTime = this.phase3ServiceTime;
        this.phase3ServiceTime = newPhase3ServiceTime;
        final boolean oldPhase3ServiceTimeESet = this.phase3ServiceTimeESet;
        this.phase3ServiceTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME,
                    oldPhase3ServiceTime, this.phase3ServiceTime, !oldPhase3ServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase3ServiceTime() {
        final double oldPhase3ServiceTime = this.phase3ServiceTime;
        final boolean oldPhase3ServiceTimeESet = this.phase3ServiceTimeESet;
        this.phase3ServiceTime = PHASE3_SERVICE_TIME_EDEFAULT;
        this.phase3ServiceTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME, oldPhase3ServiceTime,
                    PHASE3_SERVICE_TIME_EDEFAULT, oldPhase3ServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase3ServiceTime() {
        return this.phase3ServiceTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase3ServiceTimeVariance() {
        return this.phase3ServiceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3ServiceTimeVariance(final double newPhase3ServiceTimeVariance) {
        final double oldPhase3ServiceTimeVariance = this.phase3ServiceTimeVariance;
        this.phase3ServiceTimeVariance = newPhase3ServiceTimeVariance;
        final boolean oldPhase3ServiceTimeVarianceESet = this.phase3ServiceTimeVarianceESet;
        this.phase3ServiceTimeVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE, oldPhase3ServiceTimeVariance,
                    this.phase3ServiceTimeVariance, !oldPhase3ServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase3ServiceTimeVariance() {
        final double oldPhase3ServiceTimeVariance = this.phase3ServiceTimeVariance;
        final boolean oldPhase3ServiceTimeVarianceESet = this.phase3ServiceTimeVarianceESet;
        this.phase3ServiceTimeVariance = PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT;
        this.phase3ServiceTimeVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE, oldPhase3ServiceTimeVariance,
                    PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT, oldPhase3ServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase3ServiceTimeVariance() {
        return this.phase3ServiceTimeVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase3Utilization() {
        return this.phase3Utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3Utilization(final double newPhase3Utilization) {
        final double oldPhase3Utilization = this.phase3Utilization;
        this.phase3Utilization = newPhase3Utilization;
        final boolean oldPhase3UtilizationESet = this.phase3UtilizationESet;
        this.phase3UtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION,
                    oldPhase3Utilization, this.phase3Utilization, !oldPhase3UtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase3Utilization() {
        final double oldPhase3Utilization = this.phase3Utilization;
        final boolean oldPhase3UtilizationESet = this.phase3UtilizationESet;
        this.phase3Utilization = PHASE3_UTILIZATION_EDEFAULT;
        this.phase3UtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION,
                    oldPhase3Utilization, PHASE3_UTILIZATION_EDEFAULT, oldPhase3UtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase3Utilization() {
        return this.phase3UtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase3Waiting() {
        return this.phase3Waiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3Waiting(final double newPhase3Waiting) {
        final double oldPhase3Waiting = this.phase3Waiting;
        this.phase3Waiting = newPhase3Waiting;
        final boolean oldPhase3WaitingESet = this.phase3WaitingESet;
        this.phase3WaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING,
                    oldPhase3Waiting, this.phase3Waiting, !oldPhase3WaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase3Waiting() {
        final double oldPhase3Waiting = this.phase3Waiting;
        final boolean oldPhase3WaitingESet = this.phase3WaitingESet;
        this.phase3Waiting = PHASE3_WAITING_EDEFAULT;
        this.phase3WaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING,
                    oldPhase3Waiting, PHASE3_WAITING_EDEFAULT, oldPhase3WaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase3Waiting() {
        return this.phase3WaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPhase3WaitingVariance() {
        return this.phase3WaitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3WaitingVariance(final double newPhase3WaitingVariance) {
        final double oldPhase3WaitingVariance = this.phase3WaitingVariance;
        this.phase3WaitingVariance = newPhase3WaitingVariance;
        final boolean oldPhase3WaitingVarianceESet = this.phase3WaitingVarianceESet;
        this.phase3WaitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE, oldPhase3WaitingVariance,
                    this.phase3WaitingVariance, !oldPhase3WaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPhase3WaitingVariance() {
        final double oldPhase3WaitingVariance = this.phase3WaitingVariance;
        final boolean oldPhase3WaitingVarianceESet = this.phase3WaitingVarianceESet;
        this.phase3WaitingVariance = PHASE3_WAITING_VARIANCE_EDEFAULT;
        this.phase3WaitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE, oldPhase3WaitingVariance,
                    PHASE3_WAITING_VARIANCE_EDEFAULT, oldPhase3WaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPhase3WaitingVariance() {
        return this.phase3WaitingVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProbExceedMaxServiceTime() {
        return this.probExceedMaxServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProbExceedMaxServiceTime(final double newProbExceedMaxServiceTime) {
        final double oldProbExceedMaxServiceTime = this.probExceedMaxServiceTime;
        this.probExceedMaxServiceTime = newProbExceedMaxServiceTime;
        final boolean oldProbExceedMaxServiceTimeESet = this.probExceedMaxServiceTimeESet;
        this.probExceedMaxServiceTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME, oldProbExceedMaxServiceTime,
                    this.probExceedMaxServiceTime, !oldProbExceedMaxServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetProbExceedMaxServiceTime() {
        final double oldProbExceedMaxServiceTime = this.probExceedMaxServiceTime;
        final boolean oldProbExceedMaxServiceTimeESet = this.probExceedMaxServiceTimeESet;
        this.probExceedMaxServiceTime = PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT;
        this.probExceedMaxServiceTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME, oldProbExceedMaxServiceTime,
                    PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT, oldProbExceedMaxServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetProbExceedMaxServiceTime() {
        return this.probExceedMaxServiceTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProcUtilization() {
        return this.procUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProcUtilization(final double newProcUtilization) {
        final double oldProcUtilization = this.procUtilization;
        this.procUtilization = newProcUtilization;
        final boolean oldProcUtilizationESet = this.procUtilizationESet;
        this.procUtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION,
                    oldProcUtilization, this.procUtilization, !oldProcUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetProcUtilization() {
        final double oldProcUtilization = this.procUtilization;
        final boolean oldProcUtilizationESet = this.procUtilizationESet;
        this.procUtilization = PROC_UTILIZATION_EDEFAULT;
        this.procUtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION,
                    oldProcUtilization, PROC_UTILIZATION_EDEFAULT, oldProcUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetProcUtilization() {
        return this.procUtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProcWaiting() {
        return this.procWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProcWaiting(final double newProcWaiting) {
        final double oldProcWaiting = this.procWaiting;
        this.procWaiting = newProcWaiting;
        final boolean oldProcWaitingESet = this.procWaitingESet;
        this.procWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING,
                    oldProcWaiting, this.procWaiting, !oldProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetProcWaiting() {
        final double oldProcWaiting = this.procWaiting;
        final boolean oldProcWaitingESet = this.procWaitingESet;
        this.procWaiting = PROC_WAITING_EDEFAULT;
        this.procWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING,
                    oldProcWaiting, PROC_WAITING_EDEFAULT, oldProcWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetProcWaiting() {
        return this.procWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockReaderHolding() {
        return this.rwlockReaderHolding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockReaderHolding(final double newRwlockReaderHolding) {
        final double oldRwlockReaderHolding = this.rwlockReaderHolding;
        this.rwlockReaderHolding = newRwlockReaderHolding;
        final boolean oldRwlockReaderHoldingESet = this.rwlockReaderHoldingESet;
        this.rwlockReaderHoldingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING, oldRwlockReaderHolding,
                    this.rwlockReaderHolding,
                    !oldRwlockReaderHoldingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockReaderHolding() {
        final double oldRwlockReaderHolding = this.rwlockReaderHolding;
        final boolean oldRwlockReaderHoldingESet = this.rwlockReaderHoldingESet;
        this.rwlockReaderHolding = RWLOCK_READER_HOLDING_EDEFAULT;
        this.rwlockReaderHoldingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING, oldRwlockReaderHolding,
                    RWLOCK_READER_HOLDING_EDEFAULT, oldRwlockReaderHoldingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockReaderHolding() {
        return this.rwlockReaderHoldingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockReaderUtilization() {
        return this.rwlockReaderUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockReaderUtilization(final double newRwlockReaderUtilization) {
        final double oldRwlockReaderUtilization = this.rwlockReaderUtilization;
        this.rwlockReaderUtilization = newRwlockReaderUtilization;
        final boolean oldRwlockReaderUtilizationESet = this.rwlockReaderUtilizationESet;
        this.rwlockReaderUtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION, oldRwlockReaderUtilization,
                    this.rwlockReaderUtilization, !oldRwlockReaderUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockReaderUtilization() {
        final double oldRwlockReaderUtilization = this.rwlockReaderUtilization;
        final boolean oldRwlockReaderUtilizationESet = this.rwlockReaderUtilizationESet;
        this.rwlockReaderUtilization = RWLOCK_READER_UTILIZATION_EDEFAULT;
        this.rwlockReaderUtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION, oldRwlockReaderUtilization,
                    RWLOCK_READER_UTILIZATION_EDEFAULT, oldRwlockReaderUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockReaderUtilization() {
        return this.rwlockReaderUtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockReaderWaiting() {
        return this.rwlockReaderWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockReaderWaiting(final double newRwlockReaderWaiting) {
        final double oldRwlockReaderWaiting = this.rwlockReaderWaiting;
        this.rwlockReaderWaiting = newRwlockReaderWaiting;
        final boolean oldRwlockReaderWaitingESet = this.rwlockReaderWaitingESet;
        this.rwlockReaderWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING, oldRwlockReaderWaiting,
                    this.rwlockReaderWaiting,
                    !oldRwlockReaderWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockReaderWaiting() {
        final double oldRwlockReaderWaiting = this.rwlockReaderWaiting;
        final boolean oldRwlockReaderWaitingESet = this.rwlockReaderWaitingESet;
        this.rwlockReaderWaiting = RWLOCK_READER_WAITING_EDEFAULT;
        this.rwlockReaderWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING, oldRwlockReaderWaiting,
                    RWLOCK_READER_WAITING_EDEFAULT, oldRwlockReaderWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockReaderWaiting() {
        return this.rwlockReaderWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockReaderWaitingVariance() {
        return this.rwlockReaderWaitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockReaderWaitingVariance(final double newRwlockReaderWaitingVariance) {
        final double oldRwlockReaderWaitingVariance = this.rwlockReaderWaitingVariance;
        this.rwlockReaderWaitingVariance = newRwlockReaderWaitingVariance;
        final boolean oldRwlockReaderWaitingVarianceESet = this.rwlockReaderWaitingVarianceESet;
        this.rwlockReaderWaitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE, oldRwlockReaderWaitingVariance,
                    this.rwlockReaderWaitingVariance, !oldRwlockReaderWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockReaderWaitingVariance() {
        final double oldRwlockReaderWaitingVariance = this.rwlockReaderWaitingVariance;
        final boolean oldRwlockReaderWaitingVarianceESet = this.rwlockReaderWaitingVarianceESet;
        this.rwlockReaderWaitingVariance = RWLOCK_READER_WAITING_VARIANCE_EDEFAULT;
        this.rwlockReaderWaitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE, oldRwlockReaderWaitingVariance,
                    RWLOCK_READER_WAITING_VARIANCE_EDEFAULT, oldRwlockReaderWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockReaderWaitingVariance() {
        return this.rwlockReaderWaitingVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockWriterHolding() {
        return this.rwlockWriterHolding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockWriterHolding(final double newRwlockWriterHolding) {
        final double oldRwlockWriterHolding = this.rwlockWriterHolding;
        this.rwlockWriterHolding = newRwlockWriterHolding;
        final boolean oldRwlockWriterHoldingESet = this.rwlockWriterHoldingESet;
        this.rwlockWriterHoldingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING, oldRwlockWriterHolding,
                    this.rwlockWriterHolding,
                    !oldRwlockWriterHoldingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockWriterHolding() {
        final double oldRwlockWriterHolding = this.rwlockWriterHolding;
        final boolean oldRwlockWriterHoldingESet = this.rwlockWriterHoldingESet;
        this.rwlockWriterHolding = RWLOCK_WRITER_HOLDING_EDEFAULT;
        this.rwlockWriterHoldingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING, oldRwlockWriterHolding,
                    RWLOCK_WRITER_HOLDING_EDEFAULT, oldRwlockWriterHoldingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockWriterHolding() {
        return this.rwlockWriterHoldingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockWriterUtilization() {
        return this.rwlockWriterUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockWriterUtilization(final double newRwlockWriterUtilization) {
        final double oldRwlockWriterUtilization = this.rwlockWriterUtilization;
        this.rwlockWriterUtilization = newRwlockWriterUtilization;
        final boolean oldRwlockWriterUtilizationESet = this.rwlockWriterUtilizationESet;
        this.rwlockWriterUtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION, oldRwlockWriterUtilization,
                    this.rwlockWriterUtilization, !oldRwlockWriterUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockWriterUtilization() {
        final double oldRwlockWriterUtilization = this.rwlockWriterUtilization;
        final boolean oldRwlockWriterUtilizationESet = this.rwlockWriterUtilizationESet;
        this.rwlockWriterUtilization = RWLOCK_WRITER_UTILIZATION_EDEFAULT;
        this.rwlockWriterUtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION, oldRwlockWriterUtilization,
                    RWLOCK_WRITER_UTILIZATION_EDEFAULT, oldRwlockWriterUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockWriterUtilization() {
        return this.rwlockWriterUtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockWriterWaiting() {
        return this.rwlockWriterWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockWriterWaiting(final double newRwlockWriterWaiting) {
        final double oldRwlockWriterWaiting = this.rwlockWriterWaiting;
        this.rwlockWriterWaiting = newRwlockWriterWaiting;
        final boolean oldRwlockWriterWaitingESet = this.rwlockWriterWaitingESet;
        this.rwlockWriterWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING, oldRwlockWriterWaiting,
                    this.rwlockWriterWaiting,
                    !oldRwlockWriterWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockWriterWaiting() {
        final double oldRwlockWriterWaiting = this.rwlockWriterWaiting;
        final boolean oldRwlockWriterWaitingESet = this.rwlockWriterWaitingESet;
        this.rwlockWriterWaiting = RWLOCK_WRITER_WAITING_EDEFAULT;
        this.rwlockWriterWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING, oldRwlockWriterWaiting,
                    RWLOCK_WRITER_WAITING_EDEFAULT, oldRwlockWriterWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockWriterWaiting() {
        return this.rwlockWriterWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getRwlockWriterWaitingVariance() {
        return this.rwlockWriterWaitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRwlockWriterWaitingVariance(final double newRwlockWriterWaitingVariance) {
        final double oldRwlockWriterWaitingVariance = this.rwlockWriterWaitingVariance;
        this.rwlockWriterWaitingVariance = newRwlockWriterWaitingVariance;
        final boolean oldRwlockWriterWaitingVarianceESet = this.rwlockWriterWaitingVarianceESet;
        this.rwlockWriterWaitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE, oldRwlockWriterWaitingVariance,
                    this.rwlockWriterWaitingVariance, !oldRwlockWriterWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetRwlockWriterWaitingVariance() {
        final double oldRwlockWriterWaitingVariance = this.rwlockWriterWaitingVariance;
        final boolean oldRwlockWriterWaitingVarianceESet = this.rwlockWriterWaitingVarianceESet;
        this.rwlockWriterWaitingVariance = RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT;
        this.rwlockWriterWaitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE, oldRwlockWriterWaitingVariance,
                    RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT, oldRwlockWriterWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetRwlockWriterWaitingVariance() {
        return this.rwlockWriterWaitingVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getSemaphoreUtilization() {
        return this.semaphoreUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSemaphoreUtilization(final double newSemaphoreUtilization) {
        final double oldSemaphoreUtilization = this.semaphoreUtilization;
        this.semaphoreUtilization = newSemaphoreUtilization;
        final boolean oldSemaphoreUtilizationESet = this.semaphoreUtilizationESet;
        this.semaphoreUtilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION, oldSemaphoreUtilization,
                    this.semaphoreUtilization, !oldSemaphoreUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSemaphoreUtilization() {
        final double oldSemaphoreUtilization = this.semaphoreUtilization;
        final boolean oldSemaphoreUtilizationESet = this.semaphoreUtilizationESet;
        this.semaphoreUtilization = SEMAPHORE_UTILIZATION_EDEFAULT;
        this.semaphoreUtilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION, oldSemaphoreUtilization,
                    SEMAPHORE_UTILIZATION_EDEFAULT, oldSemaphoreUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSemaphoreUtilization() {
        return this.semaphoreUtilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getSemaphoreWaiting() {
        return this.semaphoreWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSemaphoreWaiting(final double newSemaphoreWaiting) {
        final double oldSemaphoreWaiting = this.semaphoreWaiting;
        this.semaphoreWaiting = newSemaphoreWaiting;
        final boolean oldSemaphoreWaitingESet = this.semaphoreWaitingESet;
        this.semaphoreWaitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING,
                    oldSemaphoreWaiting, this.semaphoreWaiting, !oldSemaphoreWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSemaphoreWaiting() {
        final double oldSemaphoreWaiting = this.semaphoreWaiting;
        final boolean oldSemaphoreWaitingESet = this.semaphoreWaitingESet;
        this.semaphoreWaiting = SEMAPHORE_WAITING_EDEFAULT;
        this.semaphoreWaitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING,
                    oldSemaphoreWaiting, SEMAPHORE_WAITING_EDEFAULT, oldSemaphoreWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSemaphoreWaiting() {
        return this.semaphoreWaitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getSemaphoreWaitingVariance() {
        return this.semaphoreWaitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSemaphoreWaitingVariance(final double newSemaphoreWaitingVariance) {
        final double oldSemaphoreWaitingVariance = this.semaphoreWaitingVariance;
        this.semaphoreWaitingVariance = newSemaphoreWaitingVariance;
        final boolean oldSemaphoreWaitingVarianceESet = this.semaphoreWaitingVarianceESet;
        this.semaphoreWaitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE, oldSemaphoreWaitingVariance,
                    this.semaphoreWaitingVariance, !oldSemaphoreWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSemaphoreWaitingVariance() {
        final double oldSemaphoreWaitingVariance = this.semaphoreWaitingVariance;
        final boolean oldSemaphoreWaitingVarianceESet = this.semaphoreWaitingVarianceESet;
        this.semaphoreWaitingVariance = SEMAPHORE_WAITING_VARIANCE_EDEFAULT;
        this.semaphoreWaitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE, oldSemaphoreWaitingVariance,
                    SEMAPHORE_WAITING_VARIANCE_EDEFAULT, oldSemaphoreWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSemaphoreWaitingVariance() {
        return this.semaphoreWaitingVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getServiceTime() {
        return this.serviceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceTime(final double newServiceTime) {
        final double oldServiceTime = this.serviceTime;
        this.serviceTime = newServiceTime;
        final boolean oldServiceTimeESet = this.serviceTimeESet;
        this.serviceTimeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME,
                    oldServiceTime, this.serviceTime, !oldServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetServiceTime() {
        final double oldServiceTime = this.serviceTime;
        final boolean oldServiceTimeESet = this.serviceTimeESet;
        this.serviceTime = SERVICE_TIME_EDEFAULT;
        this.serviceTimeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME,
                    oldServiceTime, SERVICE_TIME_EDEFAULT, oldServiceTimeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetServiceTime() {
        return this.serviceTimeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getServiceTimeVariance() {
        return this.serviceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceTimeVariance(final double newServiceTimeVariance) {
        final double oldServiceTimeVariance = this.serviceTimeVariance;
        this.serviceTimeVariance = newServiceTimeVariance;
        final boolean oldServiceTimeVarianceESet = this.serviceTimeVarianceESet;
        this.serviceTimeVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE, oldServiceTimeVariance,
                    this.serviceTimeVariance,
                    !oldServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetServiceTimeVariance() {
        final double oldServiceTimeVariance = this.serviceTimeVariance;
        final boolean oldServiceTimeVarianceESet = this.serviceTimeVarianceESet;
        this.serviceTimeVariance = SERVICE_TIME_VARIANCE_EDEFAULT;
        this.serviceTimeVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE, oldServiceTimeVariance,
                    SERVICE_TIME_VARIANCE_EDEFAULT, oldServiceTimeVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetServiceTimeVariance() {
        return this.serviceTimeVarianceESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getSquaredCoeffVariation() {
        return this.squaredCoeffVariation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSquaredCoeffVariation(final double newSquaredCoeffVariation) {
        final double oldSquaredCoeffVariation = this.squaredCoeffVariation;
        this.squaredCoeffVariation = newSquaredCoeffVariation;
        final boolean oldSquaredCoeffVariationESet = this.squaredCoeffVariationESet;
        this.squaredCoeffVariationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION, oldSquaredCoeffVariation,
                    this.squaredCoeffVariation, !oldSquaredCoeffVariationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSquaredCoeffVariation() {
        final double oldSquaredCoeffVariation = this.squaredCoeffVariation;
        final boolean oldSquaredCoeffVariationESet = this.squaredCoeffVariationESet;
        this.squaredCoeffVariation = SQUARED_COEFF_VARIATION_EDEFAULT;
        this.squaredCoeffVariationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION, oldSquaredCoeffVariation,
                    SQUARED_COEFF_VARIATION_EDEFAULT, oldSquaredCoeffVariationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSquaredCoeffVariation() {
        return this.squaredCoeffVariationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getThroughput() {
        return this.throughput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setThroughput(final double newThroughput) {
        final double oldThroughput = this.throughput;
        this.throughput = newThroughput;
        final boolean oldThroughputESet = this.throughputESet;
        this.throughputESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT,
                    oldThroughput, this.throughput, !oldThroughputESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetThroughput() {
        final double oldThroughput = this.throughput;
        final boolean oldThroughputESet = this.throughputESet;
        this.throughput = THROUGHPUT_EDEFAULT;
        this.throughputESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT,
                    oldThroughput, THROUGHPUT_EDEFAULT, oldThroughputESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetThroughput() {
        return this.throughputESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getThroughputBound() {
        return this.throughputBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setThroughputBound(final double newThroughputBound) {
        final double oldThroughputBound = this.throughputBound;
        this.throughputBound = newThroughputBound;
        final boolean oldThroughputBoundESet = this.throughputBoundESet;
        this.throughputBoundESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND,
                    oldThroughputBound, this.throughputBound, !oldThroughputBoundESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetThroughputBound() {
        final double oldThroughputBound = this.throughputBound;
        final boolean oldThroughputBoundESet = this.throughputBoundESet;
        this.throughputBound = THROUGHPUT_BOUND_EDEFAULT;
        this.throughputBoundESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND,
                    oldThroughputBound, THROUGHPUT_BOUND_EDEFAULT, oldThroughputBoundESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetThroughputBound() {
        return this.throughputBoundESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getUtilization() {
        return this.utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUtilization(final double newUtilization) {
        final double oldUtilization = this.utilization;
        this.utilization = newUtilization;
        final boolean oldUtilizationESet = this.utilizationESet;
        this.utilizationESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION,
                    oldUtilization, this.utilization, !oldUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetUtilization() {
        final double oldUtilization = this.utilization;
        final boolean oldUtilizationESet = this.utilizationESet;
        this.utilization = UTILIZATION_EDEFAULT;
        this.utilizationESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION,
                    oldUtilization, UTILIZATION_EDEFAULT, oldUtilizationESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetUtilization() {
        return this.utilizationESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getWaiting() {
        return this.waiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWaiting(final double newWaiting) {
        final double oldWaiting = this.waiting;
        this.waiting = newWaiting;
        final boolean oldWaitingESet = this.waitingESet;
        this.waitingESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.RESULT_CONF99_TYPE1__WAITING,
                    oldWaiting,
                    this.waiting, !oldWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetWaiting() {
        final double oldWaiting = this.waiting;
        final boolean oldWaitingESet = this.waitingESet;
        this.waiting = WAITING_EDEFAULT;
        this.waitingESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.RESULT_CONF99_TYPE1__WAITING,
                    oldWaiting, WAITING_EDEFAULT, oldWaitingESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetWaiting() {
        return this.waitingESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getWaitingVariance() {
        return this.waitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWaitingVariance(final double newWaitingVariance) {
        final double oldWaitingVariance = this.waitingVariance;
        this.waitingVariance = newWaitingVariance;
        final boolean oldWaitingVarianceESet = this.waitingVarianceESet;
        this.waitingVarianceESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE,
                    oldWaitingVariance, this.waitingVariance, !oldWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetWaitingVariance() {
        final double oldWaitingVariance = this.waitingVariance;
        final boolean oldWaitingVarianceESet = this.waitingVarianceESet;
        this.waitingVariance = WAITING_VARIANCE_EDEFAULT;
        this.waitingVarianceESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE,
                    oldWaitingVariance, WAITING_VARIANCE_EDEFAULT, oldWaitingVarianceESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetWaitingVariance() {
        return this.waitingVarianceESet;
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
        case LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY:
            return this.getLossProbability();
        case LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME:
            return this.getOpenWaitTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING:
            return this.getPhase1ProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME:
            return this.getPhase1ServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
            return this.getPhase1ServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION:
            return this.getPhase1Utilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING:
            return this.getPhase1Waiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE:
            return this.getPhase1WaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING:
            return this.getPhase2ProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME:
            return this.getPhase2ServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
            return this.getPhase2ServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION:
            return this.getPhase2Utilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING:
            return this.getPhase2Waiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE:
            return this.getPhase2WaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING:
            return this.getPhase3ProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME:
            return this.getPhase3ServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
            return this.getPhase3ServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION:
            return this.getPhase3Utilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING:
            return this.getPhase3Waiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE:
            return this.getPhase3WaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
            return this.getProbExceedMaxServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION:
            return this.getProcUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING:
            return this.getProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING:
            return this.getRwlockReaderHolding();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION:
            return this.getRwlockReaderUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING:
            return this.getRwlockReaderWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE:
            return this.getRwlockReaderWaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING:
            return this.getRwlockWriterHolding();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION:
            return this.getRwlockWriterUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING:
            return this.getRwlockWriterWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE:
            return this.getRwlockWriterWaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION:
            return this.getSemaphoreUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING:
            return this.getSemaphoreWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE:
            return this.getSemaphoreWaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME:
            return this.getServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE:
            return this.getServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION:
            return this.getSquaredCoeffVariation();
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT:
            return this.getThroughput();
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND:
            return this.getThroughputBound();
        case LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION:
            return this.getUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING:
            return this.getWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE:
            return this.getWaitingVariance();
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
        switch (featureID)
        {
        case LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY:
            this.setLossProbability((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME:
            this.setOpenWaitTime((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING:
            this.setPhase1ProcWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME:
            this.setPhase1ServiceTime((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
            this.setPhase1ServiceTimeVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION:
            this.setPhase1Utilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING:
            this.setPhase1Waiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE:
            this.setPhase1WaitingVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING:
            this.setPhase2ProcWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME:
            this.setPhase2ServiceTime((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
            this.setPhase2ServiceTimeVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION:
            this.setPhase2Utilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING:
            this.setPhase2Waiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE:
            this.setPhase2WaitingVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING:
            this.setPhase3ProcWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME:
            this.setPhase3ServiceTime((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
            this.setPhase3ServiceTimeVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION:
            this.setPhase3Utilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING:
            this.setPhase3Waiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE:
            this.setPhase3WaitingVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
            this.setProbExceedMaxServiceTime((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION:
            this.setProcUtilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING:
            this.setProcWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING:
            this.setRwlockReaderHolding((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION:
            this.setRwlockReaderUtilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING:
            this.setRwlockReaderWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE:
            this.setRwlockReaderWaitingVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING:
            this.setRwlockWriterHolding((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION:
            this.setRwlockWriterUtilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING:
            this.setRwlockWriterWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE:
            this.setRwlockWriterWaitingVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION:
            this.setSemaphoreUtilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING:
            this.setSemaphoreWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE:
            this.setSemaphoreWaitingVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME:
            this.setServiceTime((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE:
            this.setServiceTimeVariance((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION:
            this.setSquaredCoeffVariation((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT:
            this.setThroughput((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND:
            this.setThroughputBound((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION:
            this.setUtilization((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING:
            this.setWaiting((Double) newValue);
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE:
            this.setWaitingVariance((Double) newValue);
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
        case LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY:
            this.unsetLossProbability();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME:
            this.unsetOpenWaitTime();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING:
            this.unsetPhase1ProcWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME:
            this.unsetPhase1ServiceTime();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
            this.unsetPhase1ServiceTimeVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION:
            this.unsetPhase1Utilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING:
            this.unsetPhase1Waiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE:
            this.unsetPhase1WaitingVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING:
            this.unsetPhase2ProcWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME:
            this.unsetPhase2ServiceTime();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
            this.unsetPhase2ServiceTimeVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION:
            this.unsetPhase2Utilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING:
            this.unsetPhase2Waiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE:
            this.unsetPhase2WaitingVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING:
            this.unsetPhase3ProcWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME:
            this.unsetPhase3ServiceTime();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
            this.unsetPhase3ServiceTimeVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION:
            this.unsetPhase3Utilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING:
            this.unsetPhase3Waiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE:
            this.unsetPhase3WaitingVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
            this.unsetProbExceedMaxServiceTime();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION:
            this.unsetProcUtilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING:
            this.unsetProcWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING:
            this.unsetRwlockReaderHolding();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION:
            this.unsetRwlockReaderUtilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING:
            this.unsetRwlockReaderWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE:
            this.unsetRwlockReaderWaitingVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING:
            this.unsetRwlockWriterHolding();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION:
            this.unsetRwlockWriterUtilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING:
            this.unsetRwlockWriterWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE:
            this.unsetRwlockWriterWaitingVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION:
            this.unsetSemaphoreUtilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING:
            this.unsetSemaphoreWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE:
            this.unsetSemaphoreWaitingVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME:
            this.unsetServiceTime();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE:
            this.unsetServiceTimeVariance();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION:
            this.unsetSquaredCoeffVariation();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT:
            this.unsetThroughput();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND:
            this.unsetThroughputBound();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION:
            this.unsetUtilization();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING:
            this.unsetWaiting();
            return;
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE:
            this.unsetWaitingVariance();
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
        case LqnPackage.RESULT_CONF99_TYPE1__LOSS_PROBABILITY:
            return this.isSetLossProbability();
        case LqnPackage.RESULT_CONF99_TYPE1__OPEN_WAIT_TIME:
            return this.isSetOpenWaitTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING:
            return this.isSetPhase1ProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME:
            return this.isSetPhase1ServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE:
            return this.isSetPhase1ServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_UTILIZATION:
            return this.isSetPhase1Utilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING:
            return this.isSetPhase1Waiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE:
            return this.isSetPhase1WaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING:
            return this.isSetPhase2ProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME:
            return this.isSetPhase2ServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE:
            return this.isSetPhase2ServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_UTILIZATION:
            return this.isSetPhase2Utilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING:
            return this.isSetPhase2Waiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE:
            return this.isSetPhase2WaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING:
            return this.isSetPhase3ProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME:
            return this.isSetPhase3ServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE:
            return this.isSetPhase3ServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_UTILIZATION:
            return this.isSetPhase3Utilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING:
            return this.isSetPhase3Waiting();
        case LqnPackage.RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE:
            return this.isSetPhase3WaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME:
            return this.isSetProbExceedMaxServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_UTILIZATION:
            return this.isSetProcUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__PROC_WAITING:
            return this.isSetProcWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING:
            return this.isSetRwlockReaderHolding();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION:
            return this.isSetRwlockReaderUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING:
            return this.isSetRwlockReaderWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE:
            return this.isSetRwlockReaderWaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING:
            return this.isSetRwlockWriterHolding();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION:
            return this.isSetRwlockWriterUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING:
            return this.isSetRwlockWriterWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE:
            return this.isSetRwlockWriterWaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION:
            return this.isSetSemaphoreUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING:
            return this.isSetSemaphoreWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE:
            return this.isSetSemaphoreWaitingVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME:
            return this.isSetServiceTime();
        case LqnPackage.RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE:
            return this.isSetServiceTimeVariance();
        case LqnPackage.RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION:
            return this.isSetSquaredCoeffVariation();
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT:
            return this.isSetThroughput();
        case LqnPackage.RESULT_CONF99_TYPE1__THROUGHPUT_BOUND:
            return this.isSetThroughputBound();
        case LqnPackage.RESULT_CONF99_TYPE1__UTILIZATION:
            return this.isSetUtilization();
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING:
            return this.isSetWaiting();
        case LqnPackage.RESULT_CONF99_TYPE1__WAITING_VARIANCE:
            return this.isSetWaitingVariance();
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
        result.append(" (lossProbability: ");
        if (this.lossProbabilityESet) {
            result.append(this.lossProbability);
        } else {
            result.append("<unset>");
        }
        result.append(", openWaitTime: ");
        if (this.openWaitTimeESet) {
            result.append(this.openWaitTime);
        } else {
            result.append("<unset>");
        }
        result.append(", phase1ProcWaiting: ");
        if (this.phase1ProcWaitingESet) {
            result.append(this.phase1ProcWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", phase1ServiceTime: ");
        if (this.phase1ServiceTimeESet) {
            result.append(this.phase1ServiceTime);
        } else {
            result.append("<unset>");
        }
        result.append(", phase1ServiceTimeVariance: ");
        if (this.phase1ServiceTimeVarianceESet) {
            result.append(this.phase1ServiceTimeVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", phase1Utilization: ");
        if (this.phase1UtilizationESet) {
            result.append(this.phase1Utilization);
        } else {
            result.append("<unset>");
        }
        result.append(", phase1Waiting: ");
        if (this.phase1WaitingESet) {
            result.append(this.phase1Waiting);
        } else {
            result.append("<unset>");
        }
        result.append(", phase1WaitingVariance: ");
        if (this.phase1WaitingVarianceESet) {
            result.append(this.phase1WaitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", phase2ProcWaiting: ");
        if (this.phase2ProcWaitingESet) {
            result.append(this.phase2ProcWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", phase2ServiceTime: ");
        if (this.phase2ServiceTimeESet) {
            result.append(this.phase2ServiceTime);
        } else {
            result.append("<unset>");
        }
        result.append(", phase2ServiceTimeVariance: ");
        if (this.phase2ServiceTimeVarianceESet) {
            result.append(this.phase2ServiceTimeVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", phase2Utilization: ");
        if (this.phase2UtilizationESet) {
            result.append(this.phase2Utilization);
        } else {
            result.append("<unset>");
        }
        result.append(", phase2Waiting: ");
        if (this.phase2WaitingESet) {
            result.append(this.phase2Waiting);
        } else {
            result.append("<unset>");
        }
        result.append(", phase2WaitingVariance: ");
        if (this.phase2WaitingVarianceESet) {
            result.append(this.phase2WaitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", phase3ProcWaiting: ");
        if (this.phase3ProcWaitingESet) {
            result.append(this.phase3ProcWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", phase3ServiceTime: ");
        if (this.phase3ServiceTimeESet) {
            result.append(this.phase3ServiceTime);
        } else {
            result.append("<unset>");
        }
        result.append(", phase3ServiceTimeVariance: ");
        if (this.phase3ServiceTimeVarianceESet) {
            result.append(this.phase3ServiceTimeVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", phase3Utilization: ");
        if (this.phase3UtilizationESet) {
            result.append(this.phase3Utilization);
        } else {
            result.append("<unset>");
        }
        result.append(", phase3Waiting: ");
        if (this.phase3WaitingESet) {
            result.append(this.phase3Waiting);
        } else {
            result.append("<unset>");
        }
        result.append(", phase3WaitingVariance: ");
        if (this.phase3WaitingVarianceESet) {
            result.append(this.phase3WaitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", probExceedMaxServiceTime: ");
        if (this.probExceedMaxServiceTimeESet) {
            result.append(this.probExceedMaxServiceTime);
        } else {
            result.append("<unset>");
        }
        result.append(", procUtilization: ");
        if (this.procUtilizationESet) {
            result.append(this.procUtilization);
        } else {
            result.append("<unset>");
        }
        result.append(", procWaiting: ");
        if (this.procWaitingESet) {
            result.append(this.procWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockReaderHolding: ");
        if (this.rwlockReaderHoldingESet) {
            result.append(this.rwlockReaderHolding);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockReaderUtilization: ");
        if (this.rwlockReaderUtilizationESet) {
            result.append(this.rwlockReaderUtilization);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockReaderWaiting: ");
        if (this.rwlockReaderWaitingESet) {
            result.append(this.rwlockReaderWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockReaderWaitingVariance: ");
        if (this.rwlockReaderWaitingVarianceESet) {
            result.append(this.rwlockReaderWaitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockWriterHolding: ");
        if (this.rwlockWriterHoldingESet) {
            result.append(this.rwlockWriterHolding);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockWriterUtilization: ");
        if (this.rwlockWriterUtilizationESet) {
            result.append(this.rwlockWriterUtilization);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockWriterWaiting: ");
        if (this.rwlockWriterWaitingESet) {
            result.append(this.rwlockWriterWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", rwlockWriterWaitingVariance: ");
        if (this.rwlockWriterWaitingVarianceESet) {
            result.append(this.rwlockWriterWaitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", semaphoreUtilization: ");
        if (this.semaphoreUtilizationESet) {
            result.append(this.semaphoreUtilization);
        } else {
            result.append("<unset>");
        }
        result.append(", semaphoreWaiting: ");
        if (this.semaphoreWaitingESet) {
            result.append(this.semaphoreWaiting);
        } else {
            result.append("<unset>");
        }
        result.append(", semaphoreWaitingVariance: ");
        if (this.semaphoreWaitingVarianceESet) {
            result.append(this.semaphoreWaitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", serviceTime: ");
        if (this.serviceTimeESet) {
            result.append(this.serviceTime);
        } else {
            result.append("<unset>");
        }
        result.append(", serviceTimeVariance: ");
        if (this.serviceTimeVarianceESet) {
            result.append(this.serviceTimeVariance);
        } else {
            result.append("<unset>");
        }
        result.append(", squaredCoeffVariation: ");
        if (this.squaredCoeffVariationESet) {
            result.append(this.squaredCoeffVariation);
        } else {
            result.append("<unset>");
        }
        result.append(", throughput: ");
        if (this.throughputESet) {
            result.append(this.throughput);
        } else {
            result.append("<unset>");
        }
        result.append(", throughputBound: ");
        if (this.throughputBoundESet) {
            result.append(this.throughputBound);
        } else {
            result.append("<unset>");
        }
        result.append(", utilization: ");
        if (this.utilizationESet) {
            result.append(this.utilization);
        } else {
            result.append("<unset>");
        }
        result.append(", waiting: ");
        if (this.waitingESet) {
            result.append(this.waiting);
        } else {
            result.append("<unset>");
        }
        result.append(", waitingVariance: ");
        if (this.waitingVarianceESet) {
            result.append(this.waitingVariance);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // ResultConf99Type1Impl
