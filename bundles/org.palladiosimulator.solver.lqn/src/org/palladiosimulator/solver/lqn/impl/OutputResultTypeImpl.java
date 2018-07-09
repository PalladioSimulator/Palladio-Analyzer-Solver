/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.ResultConf95Type1;
import org.palladiosimulator.solver.lqn.ResultConf99Type1;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Output Result Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getResultConf95 <em>Result Conf95</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getResultConf99 <em>Result Conf99</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getLossProbability <em>Loss Probability</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getOpenWaitTime <em>Open Wait Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1ServiceTime <em>Phase1 Service Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1Utilization <em>Phase1 Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1Waiting <em>Phase1 Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1WaitingVariance <em>Phase1 Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2ServiceTime <em>Phase2 Service Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2Utilization <em>Phase2 Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2Waiting <em>Phase2 Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2WaitingVariance <em>Phase2 Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3ServiceTime <em>Phase3 Service Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3Utilization <em>Phase3 Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3Waiting <em>Phase3 Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3WaitingVariance <em>Phase3 Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getProcUtilization <em>Proc Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getProcWaiting <em>Proc Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockReaderHolding <em>Rwlock Reader Holding</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockReaderUtilization <em>Rwlock Reader Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockReaderWaiting <em>Rwlock Reader Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockReaderWaitingVariance <em>Rwlock Reader Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockWriterHolding <em>Rwlock Writer Holding</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockWriterUtilization <em>Rwlock Writer Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockWriterWaiting <em>Rwlock Writer Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getRwlockWriterWaitingVariance <em>Rwlock Writer Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getSemaphoreUtilization <em>Semaphore Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getSemaphoreWaiting <em>Semaphore Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getSemaphoreWaitingVariance <em>Semaphore Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getServiceTimeVariance <em>Service Time Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getThroughputBound <em>Throughput Bound</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getWaiting <em>Waiting</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getWaitingVariance <em>Waiting Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getBottleneckStrength <em>Bottleneck Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputResultTypeImpl extends MinimalEObjectImpl.Container
		implements OutputResultType {
	/**
	 * The cached value of the '{@link #getResultConf95() <em>Result Conf95</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultConf95()
	 * @generated
	 * @ordered
	 */
	protected ResultConf95Type1 resultConf95;

	/**
	 * The cached value of the '{@link #getResultConf99() <em>Result Conf99</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultConf99()
	 * @generated
	 * @ordered
	 */
	protected ResultConf99Type1 resultConf99;

	/**
	 * The default value of the '{@link #getLossProbability() <em>Loss Probability</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLossProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double LOSS_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLossProbability() <em>Loss Probability</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLossProbability()
	 * @generated
	 * @ordered
	 */
	protected double lossProbability = LOSS_PROBABILITY_EDEFAULT;

	/**
	 * This is true if the Loss Probability attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Open Wait Time attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean openWaitTimeESet;

	/**
	 * The default value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE1_PROC_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected double phase1ProcWaiting = PHASE1_PROC_WAITING_EDEFAULT;

	/**
	 * This is true if the Phase1 Proc Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase1ProcWaitingESet;

	/**
	 * The default value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE1_SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double phase1ServiceTime = PHASE1_SERVICE_TIME_EDEFAULT;

	/**
	 * This is true if the Phase1 Service Time attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Phase1 Service Time Variance attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase1ServiceTimeVarianceESet;

	/**
	 * The default value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1Utilization()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE1_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1Utilization()
	 * @generated
	 * @ordered
	 */
	protected double phase1Utilization = PHASE1_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Phase1 Utilization attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase1UtilizationESet;

	/**
	 * The default value of the '{@link #getPhase1Waiting() <em>Phase1 Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * This is true if the Phase1 Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase1WaitingESet;

	/**
	 * The default value of the '{@link #getPhase1WaitingVariance() <em>Phase1 Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1WaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE1_WAITING_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase1WaitingVariance() <em>Phase1 Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase1WaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected double phase1WaitingVariance = PHASE1_WAITING_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Phase1 Waiting Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase1WaitingVarianceESet;

	/**
	 * The default value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE2_PROC_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected double phase2ProcWaiting = PHASE2_PROC_WAITING_EDEFAULT;

	/**
	 * This is true if the Phase2 Proc Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase2ProcWaitingESet;

	/**
	 * The default value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE2_SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double phase2ServiceTime = PHASE2_SERVICE_TIME_EDEFAULT;

	/**
	 * This is true if the Phase2 Service Time attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Phase2 Service Time Variance attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase2ServiceTimeVarianceESet;

	/**
	 * The default value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2Utilization()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE2_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2Utilization()
	 * @generated
	 * @ordered
	 */
	protected double phase2Utilization = PHASE2_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Phase2 Utilization attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase2UtilizationESet;

	/**
	 * The default value of the '{@link #getPhase2Waiting() <em>Phase2 Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * This is true if the Phase2 Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase2WaitingESet;

	/**
	 * The default value of the '{@link #getPhase2WaitingVariance() <em>Phase2 Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2WaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE2_WAITING_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase2WaitingVariance() <em>Phase2 Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase2WaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected double phase2WaitingVariance = PHASE2_WAITING_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Phase2 Waiting Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase2WaitingVarianceESet;

	/**
	 * The default value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE3_PROC_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected double phase3ProcWaiting = PHASE3_PROC_WAITING_EDEFAULT;

	/**
	 * This is true if the Phase3 Proc Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase3ProcWaitingESet;

	/**
	 * The default value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE3_SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double phase3ServiceTime = PHASE3_SERVICE_TIME_EDEFAULT;

	/**
	 * This is true if the Phase3 Service Time attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Phase3 Service Time Variance attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase3ServiceTimeVarianceESet;

	/**
	 * The default value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3Utilization()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE3_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3Utilization()
	 * @generated
	 * @ordered
	 */
	protected double phase3Utilization = PHASE3_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Phase3 Utilization attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase3UtilizationESet;

	/**
	 * The default value of the '{@link #getPhase3Waiting() <em>Phase3 Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * This is true if the Phase3 Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phase3WaitingESet;

	/**
	 * The default value of the '{@link #getPhase3WaitingVariance() <em>Phase3 Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3WaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double PHASE3_WAITING_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhase3WaitingVariance() <em>Phase3 Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhase3WaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected double phase3WaitingVariance = PHASE3_WAITING_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Phase3 Waiting Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This is true if the Prob Exceed Max Service Time attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probExceedMaxServiceTimeESet;

	/**
	 * The default value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProcUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double PROC_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProcUtilization()
	 * @generated
	 * @ordered
	 */
	protected double procUtilization = PROC_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Proc Utilization attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Proc Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean procWaitingESet;

	/**
	 * The default value of the '{@link #getRwlockReaderHolding() <em>Rwlock Reader Holding</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockReaderHolding()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_READER_HOLDING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockReaderHolding() <em>Rwlock Reader Holding</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockReaderHolding()
	 * @generated
	 * @ordered
	 */
	protected double rwlockReaderHolding = RWLOCK_READER_HOLDING_EDEFAULT;

	/**
	 * This is true if the Rwlock Reader Holding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwlockReaderHoldingESet;

	/**
	 * The default value of the '{@link #getRwlockReaderUtilization() <em>Rwlock Reader Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockReaderUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_READER_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockReaderUtilization() <em>Rwlock Reader Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockReaderUtilization()
	 * @generated
	 * @ordered
	 */
	protected double rwlockReaderUtilization = RWLOCK_READER_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Rwlock Reader Utilization attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwlockReaderUtilizationESet;

	/**
	 * The default value of the '{@link #getRwlockReaderWaiting() <em>Rwlock Reader Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockReaderWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_READER_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockReaderWaiting() <em>Rwlock Reader Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockReaderWaiting()
	 * @generated
	 * @ordered
	 */
	protected double rwlockReaderWaiting = RWLOCK_READER_WAITING_EDEFAULT;

	/**
	 * This is true if the Rwlock Reader Waiting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwlockReaderWaitingESet;

	/**
	 * The default value of the '{@link #getRwlockReaderWaitingVariance() <em>Rwlock Reader Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRwlockReaderWaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_READER_WAITING_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockReaderWaitingVariance() <em>Rwlock Reader Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * The default value of the '{@link #getRwlockWriterHolding() <em>Rwlock Writer Holding</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockWriterHolding()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_WRITER_HOLDING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockWriterHolding() <em>Rwlock Writer Holding</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockWriterHolding()
	 * @generated
	 * @ordered
	 */
	protected double rwlockWriterHolding = RWLOCK_WRITER_HOLDING_EDEFAULT;

	/**
	 * This is true if the Rwlock Writer Holding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwlockWriterHoldingESet;

	/**
	 * The default value of the '{@link #getRwlockWriterUtilization() <em>Rwlock Writer Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockWriterUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_WRITER_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockWriterUtilization() <em>Rwlock Writer Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockWriterUtilization()
	 * @generated
	 * @ordered
	 */
	protected double rwlockWriterUtilization = RWLOCK_WRITER_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Rwlock Writer Utilization attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwlockWriterUtilizationESet;

	/**
	 * The default value of the '{@link #getRwlockWriterWaiting() <em>Rwlock Writer Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockWriterWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_WRITER_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockWriterWaiting() <em>Rwlock Writer Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRwlockWriterWaiting()
	 * @generated
	 * @ordered
	 */
	protected double rwlockWriterWaiting = RWLOCK_WRITER_WAITING_EDEFAULT;

	/**
	 * This is true if the Rwlock Writer Waiting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwlockWriterWaitingESet;

	/**
	 * The default value of the '{@link #getRwlockWriterWaitingVariance() <em>Rwlock Writer Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRwlockWriterWaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRwlockWriterWaitingVariance() <em>Rwlock Writer Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * The default value of the '{@link #getSemaphoreUtilization() <em>Semaphore Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemaphoreUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double SEMAPHORE_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSemaphoreUtilization() <em>Semaphore Utilization</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemaphoreUtilization()
	 * @generated
	 * @ordered
	 */
	protected double semaphoreUtilization = SEMAPHORE_UTILIZATION_EDEFAULT;

	/**
	 * This is true if the Semaphore Utilization attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean semaphoreUtilizationESet;

	/**
	 * The default value of the '{@link #getSemaphoreWaiting() <em>Semaphore Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemaphoreWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final double SEMAPHORE_WAITING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSemaphoreWaiting() <em>Semaphore Waiting</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemaphoreWaiting()
	 * @generated
	 * @ordered
	 */
	protected double semaphoreWaiting = SEMAPHORE_WAITING_EDEFAULT;

	/**
	 * This is true if the Semaphore Waiting attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Semaphore Waiting Variance attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
	 * This is true if the Service Time attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceTimeESet;

	/**
	 * The default value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double SERVICE_TIME_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected double serviceTimeVariance = SERVICE_TIME_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Service Time Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceTimeVarianceESet;

	/**
	 * The default value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSquaredCoeffVariation()
	 * @generated
	 * @ordered
	 */
	protected static final double SQUARED_COEFF_VARIATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSquaredCoeffVariation()
	 * @generated
	 * @ordered
	 */
	protected double squaredCoeffVariation = SQUARED_COEFF_VARIATION_EDEFAULT;

	/**
	 * This is true if the Squared Coeff Variation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This is true if the Throughput attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean throughputESet;

	/**
	 * The default value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getThroughputBound()
	 * @generated
	 * @ordered
	 */
	protected static final double THROUGHPUT_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getThroughputBound()
	 * @generated
	 * @ordered
	 */
	protected double throughputBound = THROUGHPUT_BOUND_EDEFAULT;

	/**
	 * This is true if the Throughput Bound attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This is true if the Utilization attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * @see #getWaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double WAITING_VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected double waitingVariance = WAITING_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Waiting Variance attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waitingVarianceESet;

	/**
	 * The default value of the '{@link #getBottleneckStrength() <em>Bottleneck Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottleneckStrength()
	 * @generated
	 * @ordered
	 */
	protected static final int BOTTLENECK_STRENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBottleneckStrength() <em>Bottleneck Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottleneckStrength()
	 * @generated
	 * @ordered
	 */
	protected int bottleneckStrength = BOTTLENECK_STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.OUTPUT_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultConf95Type1 getResultConf95() {
		return resultConf95;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultConf95(
			ResultConf95Type1 newResultConf95, NotificationChain msgs) {
		ResultConf95Type1 oldResultConf95 = resultConf95;
		resultConf95 = newResultConf95;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95,
					oldResultConf95, newResultConf95);
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
	public void setResultConf95(ResultConf95Type1 newResultConf95) {
		if (newResultConf95 != resultConf95) {
			NotificationChain msgs = null;
			if (resultConf95 != null)
				msgs = ((InternalEObject) resultConf95).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95,
						null, msgs);
			if (newResultConf95 != null)
				msgs = ((InternalEObject) newResultConf95).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95,
						null, msgs);
			msgs = basicSetResultConf95(newResultConf95, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95,
					newResultConf95, newResultConf95));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultConf99Type1 getResultConf99() {
		return resultConf99;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultConf99(
			ResultConf99Type1 newResultConf99, NotificationChain msgs) {
		ResultConf99Type1 oldResultConf99 = resultConf99;
		resultConf99 = newResultConf99;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99,
					oldResultConf99, newResultConf99);
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
	public void setResultConf99(ResultConf99Type1 newResultConf99) {
		if (newResultConf99 != resultConf99) {
			NotificationChain msgs = null;
			if (resultConf99 != null)
				msgs = ((InternalEObject) resultConf99).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99,
						null, msgs);
			if (newResultConf99 != null)
				msgs = ((InternalEObject) newResultConf99).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99,
						null, msgs);
			msgs = basicSetResultConf99(newResultConf99, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99,
					newResultConf99, newResultConf99));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLossProbability() {
		return lossProbability;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossProbability(double newLossProbability) {
		double oldLossProbability = lossProbability;
		lossProbability = newLossProbability;
		boolean oldLossProbabilityESet = lossProbabilityESet;
		lossProbabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY,
					oldLossProbability, lossProbability,
					!oldLossProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLossProbability() {
		double oldLossProbability = lossProbability;
		boolean oldLossProbabilityESet = lossProbabilityESet;
		lossProbability = LOSS_PROBABILITY_EDEFAULT;
		lossProbabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY,
					oldLossProbability, LOSS_PROBABILITY_EDEFAULT,
					oldLossProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLossProbability() {
		return lossProbabilityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpenWaitTime() {
		return openWaitTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenWaitTime(double newOpenWaitTime) {
		double oldOpenWaitTime = openWaitTime;
		openWaitTime = newOpenWaitTime;
		boolean oldOpenWaitTimeESet = openWaitTimeESet;
		openWaitTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME,
					oldOpenWaitTime, openWaitTime, !oldOpenWaitTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOpenWaitTime() {
		double oldOpenWaitTime = openWaitTime;
		boolean oldOpenWaitTimeESet = openWaitTimeESet;
		openWaitTime = OPEN_WAIT_TIME_EDEFAULT;
		openWaitTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME,
					oldOpenWaitTime, OPEN_WAIT_TIME_EDEFAULT,
					oldOpenWaitTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOpenWaitTime() {
		return openWaitTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase1ProcWaiting() {
		return phase1ProcWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase1ProcWaiting(double newPhase1ProcWaiting) {
		double oldPhase1ProcWaiting = phase1ProcWaiting;
		phase1ProcWaiting = newPhase1ProcWaiting;
		boolean oldPhase1ProcWaitingESet = phase1ProcWaitingESet;
		phase1ProcWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING,
					oldPhase1ProcWaiting, phase1ProcWaiting,
					!oldPhase1ProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase1ProcWaiting() {
		double oldPhase1ProcWaiting = phase1ProcWaiting;
		boolean oldPhase1ProcWaitingESet = phase1ProcWaitingESet;
		phase1ProcWaiting = PHASE1_PROC_WAITING_EDEFAULT;
		phase1ProcWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING,
					oldPhase1ProcWaiting, PHASE1_PROC_WAITING_EDEFAULT,
					oldPhase1ProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase1ProcWaiting() {
		return phase1ProcWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase1ServiceTime() {
		return phase1ServiceTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase1ServiceTime(double newPhase1ServiceTime) {
		double oldPhase1ServiceTime = phase1ServiceTime;
		phase1ServiceTime = newPhase1ServiceTime;
		boolean oldPhase1ServiceTimeESet = phase1ServiceTimeESet;
		phase1ServiceTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME,
					oldPhase1ServiceTime, phase1ServiceTime,
					!oldPhase1ServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase1ServiceTime() {
		double oldPhase1ServiceTime = phase1ServiceTime;
		boolean oldPhase1ServiceTimeESet = phase1ServiceTimeESet;
		phase1ServiceTime = PHASE1_SERVICE_TIME_EDEFAULT;
		phase1ServiceTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME,
					oldPhase1ServiceTime, PHASE1_SERVICE_TIME_EDEFAULT,
					oldPhase1ServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase1ServiceTime() {
		return phase1ServiceTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase1ServiceTimeVariance() {
		return phase1ServiceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase1ServiceTimeVariance(double newPhase1ServiceTimeVariance) {
		double oldPhase1ServiceTimeVariance = phase1ServiceTimeVariance;
		phase1ServiceTimeVariance = newPhase1ServiceTimeVariance;
		boolean oldPhase1ServiceTimeVarianceESet = phase1ServiceTimeVarianceESet;
		phase1ServiceTimeVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE,
					oldPhase1ServiceTimeVariance, phase1ServiceTimeVariance,
					!oldPhase1ServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase1ServiceTimeVariance() {
		double oldPhase1ServiceTimeVariance = phase1ServiceTimeVariance;
		boolean oldPhase1ServiceTimeVarianceESet = phase1ServiceTimeVarianceESet;
		phase1ServiceTimeVariance = PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT;
		phase1ServiceTimeVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE,
					oldPhase1ServiceTimeVariance,
					PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT,
					oldPhase1ServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase1ServiceTimeVariance() {
		return phase1ServiceTimeVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase1Utilization() {
		return phase1Utilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase1Utilization(double newPhase1Utilization) {
		double oldPhase1Utilization = phase1Utilization;
		phase1Utilization = newPhase1Utilization;
		boolean oldPhase1UtilizationESet = phase1UtilizationESet;
		phase1UtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION,
					oldPhase1Utilization, phase1Utilization,
					!oldPhase1UtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase1Utilization() {
		double oldPhase1Utilization = phase1Utilization;
		boolean oldPhase1UtilizationESet = phase1UtilizationESet;
		phase1Utilization = PHASE1_UTILIZATION_EDEFAULT;
		phase1UtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION,
					oldPhase1Utilization, PHASE1_UTILIZATION_EDEFAULT,
					oldPhase1UtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase1Utilization() {
		return phase1UtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase1Waiting() {
		return phase1Waiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase1Waiting(double newPhase1Waiting) {
		double oldPhase1Waiting = phase1Waiting;
		phase1Waiting = newPhase1Waiting;
		boolean oldPhase1WaitingESet = phase1WaitingESet;
		phase1WaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING,
					oldPhase1Waiting, phase1Waiting, !oldPhase1WaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase1Waiting() {
		double oldPhase1Waiting = phase1Waiting;
		boolean oldPhase1WaitingESet = phase1WaitingESet;
		phase1Waiting = PHASE1_WAITING_EDEFAULT;
		phase1WaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING,
					oldPhase1Waiting, PHASE1_WAITING_EDEFAULT,
					oldPhase1WaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase1Waiting() {
		return phase1WaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase1WaitingVariance() {
		return phase1WaitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase1WaitingVariance(double newPhase1WaitingVariance) {
		double oldPhase1WaitingVariance = phase1WaitingVariance;
		phase1WaitingVariance = newPhase1WaitingVariance;
		boolean oldPhase1WaitingVarianceESet = phase1WaitingVarianceESet;
		phase1WaitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE,
					oldPhase1WaitingVariance, phase1WaitingVariance,
					!oldPhase1WaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase1WaitingVariance() {
		double oldPhase1WaitingVariance = phase1WaitingVariance;
		boolean oldPhase1WaitingVarianceESet = phase1WaitingVarianceESet;
		phase1WaitingVariance = PHASE1_WAITING_VARIANCE_EDEFAULT;
		phase1WaitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE,
					oldPhase1WaitingVariance, PHASE1_WAITING_VARIANCE_EDEFAULT,
					oldPhase1WaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase1WaitingVariance() {
		return phase1WaitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase2ProcWaiting() {
		return phase2ProcWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase2ProcWaiting(double newPhase2ProcWaiting) {
		double oldPhase2ProcWaiting = phase2ProcWaiting;
		phase2ProcWaiting = newPhase2ProcWaiting;
		boolean oldPhase2ProcWaitingESet = phase2ProcWaitingESet;
		phase2ProcWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING,
					oldPhase2ProcWaiting, phase2ProcWaiting,
					!oldPhase2ProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase2ProcWaiting() {
		double oldPhase2ProcWaiting = phase2ProcWaiting;
		boolean oldPhase2ProcWaitingESet = phase2ProcWaitingESet;
		phase2ProcWaiting = PHASE2_PROC_WAITING_EDEFAULT;
		phase2ProcWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING,
					oldPhase2ProcWaiting, PHASE2_PROC_WAITING_EDEFAULT,
					oldPhase2ProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase2ProcWaiting() {
		return phase2ProcWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase2ServiceTime() {
		return phase2ServiceTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase2ServiceTime(double newPhase2ServiceTime) {
		double oldPhase2ServiceTime = phase2ServiceTime;
		phase2ServiceTime = newPhase2ServiceTime;
		boolean oldPhase2ServiceTimeESet = phase2ServiceTimeESet;
		phase2ServiceTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME,
					oldPhase2ServiceTime, phase2ServiceTime,
					!oldPhase2ServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase2ServiceTime() {
		double oldPhase2ServiceTime = phase2ServiceTime;
		boolean oldPhase2ServiceTimeESet = phase2ServiceTimeESet;
		phase2ServiceTime = PHASE2_SERVICE_TIME_EDEFAULT;
		phase2ServiceTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME,
					oldPhase2ServiceTime, PHASE2_SERVICE_TIME_EDEFAULT,
					oldPhase2ServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase2ServiceTime() {
		return phase2ServiceTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase2ServiceTimeVariance() {
		return phase2ServiceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase2ServiceTimeVariance(double newPhase2ServiceTimeVariance) {
		double oldPhase2ServiceTimeVariance = phase2ServiceTimeVariance;
		phase2ServiceTimeVariance = newPhase2ServiceTimeVariance;
		boolean oldPhase2ServiceTimeVarianceESet = phase2ServiceTimeVarianceESet;
		phase2ServiceTimeVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE,
					oldPhase2ServiceTimeVariance, phase2ServiceTimeVariance,
					!oldPhase2ServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase2ServiceTimeVariance() {
		double oldPhase2ServiceTimeVariance = phase2ServiceTimeVariance;
		boolean oldPhase2ServiceTimeVarianceESet = phase2ServiceTimeVarianceESet;
		phase2ServiceTimeVariance = PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT;
		phase2ServiceTimeVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE,
					oldPhase2ServiceTimeVariance,
					PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT,
					oldPhase2ServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase2ServiceTimeVariance() {
		return phase2ServiceTimeVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase2Utilization() {
		return phase2Utilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase2Utilization(double newPhase2Utilization) {
		double oldPhase2Utilization = phase2Utilization;
		phase2Utilization = newPhase2Utilization;
		boolean oldPhase2UtilizationESet = phase2UtilizationESet;
		phase2UtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION,
					oldPhase2Utilization, phase2Utilization,
					!oldPhase2UtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase2Utilization() {
		double oldPhase2Utilization = phase2Utilization;
		boolean oldPhase2UtilizationESet = phase2UtilizationESet;
		phase2Utilization = PHASE2_UTILIZATION_EDEFAULT;
		phase2UtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION,
					oldPhase2Utilization, PHASE2_UTILIZATION_EDEFAULT,
					oldPhase2UtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase2Utilization() {
		return phase2UtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase2Waiting() {
		return phase2Waiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase2Waiting(double newPhase2Waiting) {
		double oldPhase2Waiting = phase2Waiting;
		phase2Waiting = newPhase2Waiting;
		boolean oldPhase2WaitingESet = phase2WaitingESet;
		phase2WaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING,
					oldPhase2Waiting, phase2Waiting, !oldPhase2WaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase2Waiting() {
		double oldPhase2Waiting = phase2Waiting;
		boolean oldPhase2WaitingESet = phase2WaitingESet;
		phase2Waiting = PHASE2_WAITING_EDEFAULT;
		phase2WaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING,
					oldPhase2Waiting, PHASE2_WAITING_EDEFAULT,
					oldPhase2WaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase2Waiting() {
		return phase2WaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase2WaitingVariance() {
		return phase2WaitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase2WaitingVariance(double newPhase2WaitingVariance) {
		double oldPhase2WaitingVariance = phase2WaitingVariance;
		phase2WaitingVariance = newPhase2WaitingVariance;
		boolean oldPhase2WaitingVarianceESet = phase2WaitingVarianceESet;
		phase2WaitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE,
					oldPhase2WaitingVariance, phase2WaitingVariance,
					!oldPhase2WaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase2WaitingVariance() {
		double oldPhase2WaitingVariance = phase2WaitingVariance;
		boolean oldPhase2WaitingVarianceESet = phase2WaitingVarianceESet;
		phase2WaitingVariance = PHASE2_WAITING_VARIANCE_EDEFAULT;
		phase2WaitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE,
					oldPhase2WaitingVariance, PHASE2_WAITING_VARIANCE_EDEFAULT,
					oldPhase2WaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase2WaitingVariance() {
		return phase2WaitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase3ProcWaiting() {
		return phase3ProcWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase3ProcWaiting(double newPhase3ProcWaiting) {
		double oldPhase3ProcWaiting = phase3ProcWaiting;
		phase3ProcWaiting = newPhase3ProcWaiting;
		boolean oldPhase3ProcWaitingESet = phase3ProcWaitingESet;
		phase3ProcWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING,
					oldPhase3ProcWaiting, phase3ProcWaiting,
					!oldPhase3ProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase3ProcWaiting() {
		double oldPhase3ProcWaiting = phase3ProcWaiting;
		boolean oldPhase3ProcWaitingESet = phase3ProcWaitingESet;
		phase3ProcWaiting = PHASE3_PROC_WAITING_EDEFAULT;
		phase3ProcWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING,
					oldPhase3ProcWaiting, PHASE3_PROC_WAITING_EDEFAULT,
					oldPhase3ProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase3ProcWaiting() {
		return phase3ProcWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase3ServiceTime() {
		return phase3ServiceTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase3ServiceTime(double newPhase3ServiceTime) {
		double oldPhase3ServiceTime = phase3ServiceTime;
		phase3ServiceTime = newPhase3ServiceTime;
		boolean oldPhase3ServiceTimeESet = phase3ServiceTimeESet;
		phase3ServiceTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME,
					oldPhase3ServiceTime, phase3ServiceTime,
					!oldPhase3ServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase3ServiceTime() {
		double oldPhase3ServiceTime = phase3ServiceTime;
		boolean oldPhase3ServiceTimeESet = phase3ServiceTimeESet;
		phase3ServiceTime = PHASE3_SERVICE_TIME_EDEFAULT;
		phase3ServiceTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME,
					oldPhase3ServiceTime, PHASE3_SERVICE_TIME_EDEFAULT,
					oldPhase3ServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase3ServiceTime() {
		return phase3ServiceTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase3ServiceTimeVariance() {
		return phase3ServiceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase3ServiceTimeVariance(double newPhase3ServiceTimeVariance) {
		double oldPhase3ServiceTimeVariance = phase3ServiceTimeVariance;
		phase3ServiceTimeVariance = newPhase3ServiceTimeVariance;
		boolean oldPhase3ServiceTimeVarianceESet = phase3ServiceTimeVarianceESet;
		phase3ServiceTimeVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE,
					oldPhase3ServiceTimeVariance, phase3ServiceTimeVariance,
					!oldPhase3ServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase3ServiceTimeVariance() {
		double oldPhase3ServiceTimeVariance = phase3ServiceTimeVariance;
		boolean oldPhase3ServiceTimeVarianceESet = phase3ServiceTimeVarianceESet;
		phase3ServiceTimeVariance = PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT;
		phase3ServiceTimeVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE,
					oldPhase3ServiceTimeVariance,
					PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT,
					oldPhase3ServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase3ServiceTimeVariance() {
		return phase3ServiceTimeVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase3Utilization() {
		return phase3Utilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase3Utilization(double newPhase3Utilization) {
		double oldPhase3Utilization = phase3Utilization;
		phase3Utilization = newPhase3Utilization;
		boolean oldPhase3UtilizationESet = phase3UtilizationESet;
		phase3UtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION,
					oldPhase3Utilization, phase3Utilization,
					!oldPhase3UtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase3Utilization() {
		double oldPhase3Utilization = phase3Utilization;
		boolean oldPhase3UtilizationESet = phase3UtilizationESet;
		phase3Utilization = PHASE3_UTILIZATION_EDEFAULT;
		phase3UtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION,
					oldPhase3Utilization, PHASE3_UTILIZATION_EDEFAULT,
					oldPhase3UtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase3Utilization() {
		return phase3UtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase3Waiting() {
		return phase3Waiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase3Waiting(double newPhase3Waiting) {
		double oldPhase3Waiting = phase3Waiting;
		phase3Waiting = newPhase3Waiting;
		boolean oldPhase3WaitingESet = phase3WaitingESet;
		phase3WaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING,
					oldPhase3Waiting, phase3Waiting, !oldPhase3WaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase3Waiting() {
		double oldPhase3Waiting = phase3Waiting;
		boolean oldPhase3WaitingESet = phase3WaitingESet;
		phase3Waiting = PHASE3_WAITING_EDEFAULT;
		phase3WaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING,
					oldPhase3Waiting, PHASE3_WAITING_EDEFAULT,
					oldPhase3WaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase3Waiting() {
		return phase3WaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPhase3WaitingVariance() {
		return phase3WaitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase3WaitingVariance(double newPhase3WaitingVariance) {
		double oldPhase3WaitingVariance = phase3WaitingVariance;
		phase3WaitingVariance = newPhase3WaitingVariance;
		boolean oldPhase3WaitingVarianceESet = phase3WaitingVarianceESet;
		phase3WaitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE,
					oldPhase3WaitingVariance, phase3WaitingVariance,
					!oldPhase3WaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhase3WaitingVariance() {
		double oldPhase3WaitingVariance = phase3WaitingVariance;
		boolean oldPhase3WaitingVarianceESet = phase3WaitingVarianceESet;
		phase3WaitingVariance = PHASE3_WAITING_VARIANCE_EDEFAULT;
		phase3WaitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE,
					oldPhase3WaitingVariance, PHASE3_WAITING_VARIANCE_EDEFAULT,
					oldPhase3WaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhase3WaitingVariance() {
		return phase3WaitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbExceedMaxServiceTime() {
		return probExceedMaxServiceTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbExceedMaxServiceTime(double newProbExceedMaxServiceTime) {
		double oldProbExceedMaxServiceTime = probExceedMaxServiceTime;
		probExceedMaxServiceTime = newProbExceedMaxServiceTime;
		boolean oldProbExceedMaxServiceTimeESet = probExceedMaxServiceTimeESet;
		probExceedMaxServiceTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME,
					oldProbExceedMaxServiceTime, probExceedMaxServiceTime,
					!oldProbExceedMaxServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProbExceedMaxServiceTime() {
		double oldProbExceedMaxServiceTime = probExceedMaxServiceTime;
		boolean oldProbExceedMaxServiceTimeESet = probExceedMaxServiceTimeESet;
		probExceedMaxServiceTime = PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT;
		probExceedMaxServiceTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME,
					oldProbExceedMaxServiceTime,
					PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT,
					oldProbExceedMaxServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProbExceedMaxServiceTime() {
		return probExceedMaxServiceTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProcUtilization() {
		return procUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcUtilization(double newProcUtilization) {
		double oldProcUtilization = procUtilization;
		procUtilization = newProcUtilization;
		boolean oldProcUtilizationESet = procUtilizationESet;
		procUtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION,
					oldProcUtilization, procUtilization,
					!oldProcUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProcUtilization() {
		double oldProcUtilization = procUtilization;
		boolean oldProcUtilizationESet = procUtilizationESet;
		procUtilization = PROC_UTILIZATION_EDEFAULT;
		procUtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION,
					oldProcUtilization, PROC_UTILIZATION_EDEFAULT,
					oldProcUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProcUtilization() {
		return procUtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProcWaiting() {
		return procWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcWaiting(double newProcWaiting) {
		double oldProcWaiting = procWaiting;
		procWaiting = newProcWaiting;
		boolean oldProcWaitingESet = procWaitingESet;
		procWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING,
					oldProcWaiting, procWaiting, !oldProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProcWaiting() {
		double oldProcWaiting = procWaiting;
		boolean oldProcWaitingESet = procWaitingESet;
		procWaiting = PROC_WAITING_EDEFAULT;
		procWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING,
					oldProcWaiting, PROC_WAITING_EDEFAULT, oldProcWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProcWaiting() {
		return procWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockReaderHolding() {
		return rwlockReaderHolding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockReaderHolding(double newRwlockReaderHolding) {
		double oldRwlockReaderHolding = rwlockReaderHolding;
		rwlockReaderHolding = newRwlockReaderHolding;
		boolean oldRwlockReaderHoldingESet = rwlockReaderHoldingESet;
		rwlockReaderHoldingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING,
					oldRwlockReaderHolding, rwlockReaderHolding,
					!oldRwlockReaderHoldingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockReaderHolding() {
		double oldRwlockReaderHolding = rwlockReaderHolding;
		boolean oldRwlockReaderHoldingESet = rwlockReaderHoldingESet;
		rwlockReaderHolding = RWLOCK_READER_HOLDING_EDEFAULT;
		rwlockReaderHoldingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING,
					oldRwlockReaderHolding, RWLOCK_READER_HOLDING_EDEFAULT,
					oldRwlockReaderHoldingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockReaderHolding() {
		return rwlockReaderHoldingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockReaderUtilization() {
		return rwlockReaderUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockReaderUtilization(double newRwlockReaderUtilization) {
		double oldRwlockReaderUtilization = rwlockReaderUtilization;
		rwlockReaderUtilization = newRwlockReaderUtilization;
		boolean oldRwlockReaderUtilizationESet = rwlockReaderUtilizationESet;
		rwlockReaderUtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION,
					oldRwlockReaderUtilization, rwlockReaderUtilization,
					!oldRwlockReaderUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockReaderUtilization() {
		double oldRwlockReaderUtilization = rwlockReaderUtilization;
		boolean oldRwlockReaderUtilizationESet = rwlockReaderUtilizationESet;
		rwlockReaderUtilization = RWLOCK_READER_UTILIZATION_EDEFAULT;
		rwlockReaderUtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION,
					oldRwlockReaderUtilization,
					RWLOCK_READER_UTILIZATION_EDEFAULT,
					oldRwlockReaderUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockReaderUtilization() {
		return rwlockReaderUtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockReaderWaiting() {
		return rwlockReaderWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockReaderWaiting(double newRwlockReaderWaiting) {
		double oldRwlockReaderWaiting = rwlockReaderWaiting;
		rwlockReaderWaiting = newRwlockReaderWaiting;
		boolean oldRwlockReaderWaitingESet = rwlockReaderWaitingESet;
		rwlockReaderWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING,
					oldRwlockReaderWaiting, rwlockReaderWaiting,
					!oldRwlockReaderWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockReaderWaiting() {
		double oldRwlockReaderWaiting = rwlockReaderWaiting;
		boolean oldRwlockReaderWaitingESet = rwlockReaderWaitingESet;
		rwlockReaderWaiting = RWLOCK_READER_WAITING_EDEFAULT;
		rwlockReaderWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING,
					oldRwlockReaderWaiting, RWLOCK_READER_WAITING_EDEFAULT,
					oldRwlockReaderWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockReaderWaiting() {
		return rwlockReaderWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockReaderWaitingVariance() {
		return rwlockReaderWaitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockReaderWaitingVariance(
			double newRwlockReaderWaitingVariance) {
		double oldRwlockReaderWaitingVariance = rwlockReaderWaitingVariance;
		rwlockReaderWaitingVariance = newRwlockReaderWaitingVariance;
		boolean oldRwlockReaderWaitingVarianceESet = rwlockReaderWaitingVarianceESet;
		rwlockReaderWaitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE,
					oldRwlockReaderWaitingVariance,
					rwlockReaderWaitingVariance,
					!oldRwlockReaderWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockReaderWaitingVariance() {
		double oldRwlockReaderWaitingVariance = rwlockReaderWaitingVariance;
		boolean oldRwlockReaderWaitingVarianceESet = rwlockReaderWaitingVarianceESet;
		rwlockReaderWaitingVariance = RWLOCK_READER_WAITING_VARIANCE_EDEFAULT;
		rwlockReaderWaitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE,
					oldRwlockReaderWaitingVariance,
					RWLOCK_READER_WAITING_VARIANCE_EDEFAULT,
					oldRwlockReaderWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockReaderWaitingVariance() {
		return rwlockReaderWaitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockWriterHolding() {
		return rwlockWriterHolding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockWriterHolding(double newRwlockWriterHolding) {
		double oldRwlockWriterHolding = rwlockWriterHolding;
		rwlockWriterHolding = newRwlockWriterHolding;
		boolean oldRwlockWriterHoldingESet = rwlockWriterHoldingESet;
		rwlockWriterHoldingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING,
					oldRwlockWriterHolding, rwlockWriterHolding,
					!oldRwlockWriterHoldingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockWriterHolding() {
		double oldRwlockWriterHolding = rwlockWriterHolding;
		boolean oldRwlockWriterHoldingESet = rwlockWriterHoldingESet;
		rwlockWriterHolding = RWLOCK_WRITER_HOLDING_EDEFAULT;
		rwlockWriterHoldingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING,
					oldRwlockWriterHolding, RWLOCK_WRITER_HOLDING_EDEFAULT,
					oldRwlockWriterHoldingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockWriterHolding() {
		return rwlockWriterHoldingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockWriterUtilization() {
		return rwlockWriterUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockWriterUtilization(double newRwlockWriterUtilization) {
		double oldRwlockWriterUtilization = rwlockWriterUtilization;
		rwlockWriterUtilization = newRwlockWriterUtilization;
		boolean oldRwlockWriterUtilizationESet = rwlockWriterUtilizationESet;
		rwlockWriterUtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION,
					oldRwlockWriterUtilization, rwlockWriterUtilization,
					!oldRwlockWriterUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockWriterUtilization() {
		double oldRwlockWriterUtilization = rwlockWriterUtilization;
		boolean oldRwlockWriterUtilizationESet = rwlockWriterUtilizationESet;
		rwlockWriterUtilization = RWLOCK_WRITER_UTILIZATION_EDEFAULT;
		rwlockWriterUtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION,
					oldRwlockWriterUtilization,
					RWLOCK_WRITER_UTILIZATION_EDEFAULT,
					oldRwlockWriterUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockWriterUtilization() {
		return rwlockWriterUtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockWriterWaiting() {
		return rwlockWriterWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockWriterWaiting(double newRwlockWriterWaiting) {
		double oldRwlockWriterWaiting = rwlockWriterWaiting;
		rwlockWriterWaiting = newRwlockWriterWaiting;
		boolean oldRwlockWriterWaitingESet = rwlockWriterWaitingESet;
		rwlockWriterWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING,
					oldRwlockWriterWaiting, rwlockWriterWaiting,
					!oldRwlockWriterWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockWriterWaiting() {
		double oldRwlockWriterWaiting = rwlockWriterWaiting;
		boolean oldRwlockWriterWaitingESet = rwlockWriterWaitingESet;
		rwlockWriterWaiting = RWLOCK_WRITER_WAITING_EDEFAULT;
		rwlockWriterWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING,
					oldRwlockWriterWaiting, RWLOCK_WRITER_WAITING_EDEFAULT,
					oldRwlockWriterWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockWriterWaiting() {
		return rwlockWriterWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRwlockWriterWaitingVariance() {
		return rwlockWriterWaitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRwlockWriterWaitingVariance(
			double newRwlockWriterWaitingVariance) {
		double oldRwlockWriterWaitingVariance = rwlockWriterWaitingVariance;
		rwlockWriterWaitingVariance = newRwlockWriterWaitingVariance;
		boolean oldRwlockWriterWaitingVarianceESet = rwlockWriterWaitingVarianceESet;
		rwlockWriterWaitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE,
					oldRwlockWriterWaitingVariance,
					rwlockWriterWaitingVariance,
					!oldRwlockWriterWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRwlockWriterWaitingVariance() {
		double oldRwlockWriterWaitingVariance = rwlockWriterWaitingVariance;
		boolean oldRwlockWriterWaitingVarianceESet = rwlockWriterWaitingVarianceESet;
		rwlockWriterWaitingVariance = RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT;
		rwlockWriterWaitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE,
					oldRwlockWriterWaitingVariance,
					RWLOCK_WRITER_WAITING_VARIANCE_EDEFAULT,
					oldRwlockWriterWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRwlockWriterWaitingVariance() {
		return rwlockWriterWaitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSemaphoreUtilization() {
		return semaphoreUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemaphoreUtilization(double newSemaphoreUtilization) {
		double oldSemaphoreUtilization = semaphoreUtilization;
		semaphoreUtilization = newSemaphoreUtilization;
		boolean oldSemaphoreUtilizationESet = semaphoreUtilizationESet;
		semaphoreUtilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION,
					oldSemaphoreUtilization, semaphoreUtilization,
					!oldSemaphoreUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSemaphoreUtilization() {
		double oldSemaphoreUtilization = semaphoreUtilization;
		boolean oldSemaphoreUtilizationESet = semaphoreUtilizationESet;
		semaphoreUtilization = SEMAPHORE_UTILIZATION_EDEFAULT;
		semaphoreUtilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION,
					oldSemaphoreUtilization, SEMAPHORE_UTILIZATION_EDEFAULT,
					oldSemaphoreUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSemaphoreUtilization() {
		return semaphoreUtilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSemaphoreWaiting() {
		return semaphoreWaiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemaphoreWaiting(double newSemaphoreWaiting) {
		double oldSemaphoreWaiting = semaphoreWaiting;
		semaphoreWaiting = newSemaphoreWaiting;
		boolean oldSemaphoreWaitingESet = semaphoreWaitingESet;
		semaphoreWaitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING,
					oldSemaphoreWaiting, semaphoreWaiting,
					!oldSemaphoreWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSemaphoreWaiting() {
		double oldSemaphoreWaiting = semaphoreWaiting;
		boolean oldSemaphoreWaitingESet = semaphoreWaitingESet;
		semaphoreWaiting = SEMAPHORE_WAITING_EDEFAULT;
		semaphoreWaitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING,
					oldSemaphoreWaiting, SEMAPHORE_WAITING_EDEFAULT,
					oldSemaphoreWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSemaphoreWaiting() {
		return semaphoreWaitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSemaphoreWaitingVariance() {
		return semaphoreWaitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemaphoreWaitingVariance(double newSemaphoreWaitingVariance) {
		double oldSemaphoreWaitingVariance = semaphoreWaitingVariance;
		semaphoreWaitingVariance = newSemaphoreWaitingVariance;
		boolean oldSemaphoreWaitingVarianceESet = semaphoreWaitingVarianceESet;
		semaphoreWaitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE,
					oldSemaphoreWaitingVariance, semaphoreWaitingVariance,
					!oldSemaphoreWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSemaphoreWaitingVariance() {
		double oldSemaphoreWaitingVariance = semaphoreWaitingVariance;
		boolean oldSemaphoreWaitingVarianceESet = semaphoreWaitingVarianceESet;
		semaphoreWaitingVariance = SEMAPHORE_WAITING_VARIANCE_EDEFAULT;
		semaphoreWaitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE,
					oldSemaphoreWaitingVariance,
					SEMAPHORE_WAITING_VARIANCE_EDEFAULT,
					oldSemaphoreWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSemaphoreWaitingVariance() {
		return semaphoreWaitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getServiceTime() {
		return serviceTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceTime(double newServiceTime) {
		double oldServiceTime = serviceTime;
		serviceTime = newServiceTime;
		boolean oldServiceTimeESet = serviceTimeESet;
		serviceTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME,
					oldServiceTime, serviceTime, !oldServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServiceTime() {
		double oldServiceTime = serviceTime;
		boolean oldServiceTimeESet = serviceTimeESet;
		serviceTime = SERVICE_TIME_EDEFAULT;
		serviceTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME,
					oldServiceTime, SERVICE_TIME_EDEFAULT, oldServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServiceTime() {
		return serviceTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getServiceTimeVariance() {
		return serviceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceTimeVariance(double newServiceTimeVariance) {
		double oldServiceTimeVariance = serviceTimeVariance;
		serviceTimeVariance = newServiceTimeVariance;
		boolean oldServiceTimeVarianceESet = serviceTimeVarianceESet;
		serviceTimeVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE,
					oldServiceTimeVariance, serviceTimeVariance,
					!oldServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServiceTimeVariance() {
		double oldServiceTimeVariance = serviceTimeVariance;
		boolean oldServiceTimeVarianceESet = serviceTimeVarianceESet;
		serviceTimeVariance = SERVICE_TIME_VARIANCE_EDEFAULT;
		serviceTimeVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE,
					oldServiceTimeVariance, SERVICE_TIME_VARIANCE_EDEFAULT,
					oldServiceTimeVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServiceTimeVariance() {
		return serviceTimeVarianceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSquaredCoeffVariation() {
		return squaredCoeffVariation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSquaredCoeffVariation(double newSquaredCoeffVariation) {
		double oldSquaredCoeffVariation = squaredCoeffVariation;
		squaredCoeffVariation = newSquaredCoeffVariation;
		boolean oldSquaredCoeffVariationESet = squaredCoeffVariationESet;
		squaredCoeffVariationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION,
					oldSquaredCoeffVariation, squaredCoeffVariation,
					!oldSquaredCoeffVariationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSquaredCoeffVariation() {
		double oldSquaredCoeffVariation = squaredCoeffVariation;
		boolean oldSquaredCoeffVariationESet = squaredCoeffVariationESet;
		squaredCoeffVariation = SQUARED_COEFF_VARIATION_EDEFAULT;
		squaredCoeffVariationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION,
					oldSquaredCoeffVariation, SQUARED_COEFF_VARIATION_EDEFAULT,
					oldSquaredCoeffVariationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSquaredCoeffVariation() {
		return squaredCoeffVariationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughput(double newThroughput) {
		double oldThroughput = throughput;
		throughput = newThroughput;
		boolean oldThroughputESet = throughputESet;
		throughputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT, oldThroughput,
					throughput, !oldThroughputESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetThroughput() {
		double oldThroughput = throughput;
		boolean oldThroughputESet = throughputESet;
		throughput = THROUGHPUT_EDEFAULT;
		throughputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT, oldThroughput,
					THROUGHPUT_EDEFAULT, oldThroughputESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetThroughput() {
		return throughputESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThroughputBound() {
		return throughputBound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughputBound(double newThroughputBound) {
		double oldThroughputBound = throughputBound;
		throughputBound = newThroughputBound;
		boolean oldThroughputBoundESet = throughputBoundESet;
		throughputBoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND,
					oldThroughputBound, throughputBound,
					!oldThroughputBoundESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetThroughputBound() {
		double oldThroughputBound = throughputBound;
		boolean oldThroughputBoundESet = throughputBoundESet;
		throughputBound = THROUGHPUT_BOUND_EDEFAULT;
		throughputBoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND,
					oldThroughputBound, THROUGHPUT_BOUND_EDEFAULT,
					oldThroughputBoundESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetThroughputBound() {
		return throughputBoundESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtilization(double newUtilization) {
		double oldUtilization = utilization;
		utilization = newUtilization;
		boolean oldUtilizationESet = utilizationESet;
		utilizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION, oldUtilization,
					utilization, !oldUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUtilization() {
		double oldUtilization = utilization;
		boolean oldUtilizationESet = utilizationESet;
		utilization = UTILIZATION_EDEFAULT;
		utilizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION, oldUtilization,
					UTILIZATION_EDEFAULT, oldUtilizationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUtilization() {
		return utilizationESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWaiting() {
		return waiting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaiting(double newWaiting) {
		double oldWaiting = waiting;
		waiting = newWaiting;
		boolean oldWaitingESet = waitingESet;
		waitingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__WAITING, oldWaiting,
					waiting, !oldWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWaiting() {
		double oldWaiting = waiting;
		boolean oldWaitingESet = waitingESet;
		waiting = WAITING_EDEFAULT;
		waitingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__WAITING, oldWaiting,
					WAITING_EDEFAULT, oldWaitingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWaiting() {
		return waitingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWaitingVariance() {
		return waitingVariance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitingVariance(double newWaitingVariance) {
		double oldWaitingVariance = waitingVariance;
		waitingVariance = newWaitingVariance;
		boolean oldWaitingVarianceESet = waitingVarianceESet;
		waitingVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE,
					oldWaitingVariance, waitingVariance,
					!oldWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWaitingVariance() {
		double oldWaitingVariance = waitingVariance;
		boolean oldWaitingVarianceESet = waitingVarianceESet;
		waitingVariance = WAITING_VARIANCE_EDEFAULT;
		waitingVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE,
					oldWaitingVariance, WAITING_VARIANCE_EDEFAULT,
					oldWaitingVarianceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWaitingVariance() {
		return waitingVarianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBottleneckStrength() {
		return bottleneckStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottleneckStrength(int newBottleneckStrength) {
		int oldBottleneckStrength = bottleneckStrength;
		bottleneckStrength = newBottleneckStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH,
					oldBottleneckStrength, bottleneckStrength));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
			return basicSetResultConf95(null, msgs);
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
			return basicSetResultConf99(null, msgs);
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
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
			return getResultConf95();
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
			return getResultConf99();
		case LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY:
			return getLossProbability();
		case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
			return getOpenWaitTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
			return getPhase1ProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
			return getPhase1ServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
			return getPhase1ServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
			return getPhase1Utilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING:
			return getPhase1Waiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE:
			return getPhase1WaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
			return getPhase2ProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
			return getPhase2ServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
			return getPhase2ServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
			return getPhase2Utilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING:
			return getPhase2Waiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE:
			return getPhase2WaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
			return getPhase3ProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
			return getPhase3ServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
			return getPhase3ServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
			return getPhase3Utilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING:
			return getPhase3Waiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE:
			return getPhase3WaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
			return getProbExceedMaxServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
			return getProcUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
			return getProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING:
			return getRwlockReaderHolding();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION:
			return getRwlockReaderUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING:
			return getRwlockReaderWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE:
			return getRwlockReaderWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING:
			return getRwlockWriterHolding();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION:
			return getRwlockWriterUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING:
			return getRwlockWriterWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE:
			return getRwlockWriterWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION:
			return getSemaphoreUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING:
			return getSemaphoreWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE:
			return getSemaphoreWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
			return getServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
			return getServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
			return getSquaredCoeffVariation();
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
			return getThroughput();
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
			return getThroughputBound();
		case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
			return getUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
			return getWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
			return getWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH:
			return getBottleneckStrength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
			setResultConf95((ResultConf95Type1) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
			setResultConf99((ResultConf99Type1) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY:
			setLossProbability((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
			setOpenWaitTime((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
			setPhase1ProcWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
			setPhase1ServiceTime((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
			setPhase1ServiceTimeVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
			setPhase1Utilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING:
			setPhase1Waiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE:
			setPhase1WaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
			setPhase2ProcWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
			setPhase2ServiceTime((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
			setPhase2ServiceTimeVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
			setPhase2Utilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING:
			setPhase2Waiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE:
			setPhase2WaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
			setPhase3ProcWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
			setPhase3ServiceTime((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
			setPhase3ServiceTimeVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
			setPhase3Utilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING:
			setPhase3Waiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE:
			setPhase3WaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
			setProbExceedMaxServiceTime((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
			setProcUtilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
			setProcWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING:
			setRwlockReaderHolding((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION:
			setRwlockReaderUtilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING:
			setRwlockReaderWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE:
			setRwlockReaderWaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING:
			setRwlockWriterHolding((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION:
			setRwlockWriterUtilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING:
			setRwlockWriterWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE:
			setRwlockWriterWaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION:
			setSemaphoreUtilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING:
			setSemaphoreWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE:
			setSemaphoreWaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
			setServiceTime((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
			setServiceTimeVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
			setSquaredCoeffVariation((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
			setThroughput((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
			setThroughputBound((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
			setUtilization((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
			setWaiting((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
			setWaitingVariance((Double) newValue);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH:
			setBottleneckStrength((Integer) newValue);
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
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
			setResultConf95((ResultConf95Type1) null);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
			setResultConf99((ResultConf99Type1) null);
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY:
			unsetLossProbability();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
			unsetOpenWaitTime();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
			unsetPhase1ProcWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
			unsetPhase1ServiceTime();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
			unsetPhase1ServiceTimeVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
			unsetPhase1Utilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING:
			unsetPhase1Waiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE:
			unsetPhase1WaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
			unsetPhase2ProcWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
			unsetPhase2ServiceTime();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
			unsetPhase2ServiceTimeVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
			unsetPhase2Utilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING:
			unsetPhase2Waiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE:
			unsetPhase2WaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
			unsetPhase3ProcWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
			unsetPhase3ServiceTime();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
			unsetPhase3ServiceTimeVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
			unsetPhase3Utilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING:
			unsetPhase3Waiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE:
			unsetPhase3WaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
			unsetProbExceedMaxServiceTime();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
			unsetProcUtilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
			unsetProcWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING:
			unsetRwlockReaderHolding();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION:
			unsetRwlockReaderUtilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING:
			unsetRwlockReaderWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE:
			unsetRwlockReaderWaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING:
			unsetRwlockWriterHolding();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION:
			unsetRwlockWriterUtilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING:
			unsetRwlockWriterWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE:
			unsetRwlockWriterWaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION:
			unsetSemaphoreUtilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING:
			unsetSemaphoreWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE:
			unsetSemaphoreWaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
			unsetServiceTime();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
			unsetServiceTimeVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
			unsetSquaredCoeffVariation();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
			unsetThroughput();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
			unsetThroughputBound();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
			unsetUtilization();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
			unsetWaiting();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
			unsetWaitingVariance();
			return;
		case LqnPackage.OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH:
			setBottleneckStrength(BOTTLENECK_STRENGTH_EDEFAULT);
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
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
			return resultConf95 != null;
		case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
			return resultConf99 != null;
		case LqnPackage.OUTPUT_RESULT_TYPE__LOSS_PROBABILITY:
			return isSetLossProbability();
		case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
			return isSetOpenWaitTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
			return isSetPhase1ProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
			return isSetPhase1ServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
			return isSetPhase1ServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
			return isSetPhase1Utilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING:
			return isSetPhase1Waiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE:
			return isSetPhase1WaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
			return isSetPhase2ProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
			return isSetPhase2ServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
			return isSetPhase2ServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
			return isSetPhase2Utilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING:
			return isSetPhase2Waiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE:
			return isSetPhase2WaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
			return isSetPhase3ProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
			return isSetPhase3ServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
			return isSetPhase3ServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
			return isSetPhase3Utilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING:
			return isSetPhase3Waiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE:
			return isSetPhase3WaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
			return isSetProbExceedMaxServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
			return isSetProcUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
			return isSetProcWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING:
			return isSetRwlockReaderHolding();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION:
			return isSetRwlockReaderUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING:
			return isSetRwlockReaderWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE:
			return isSetRwlockReaderWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING:
			return isSetRwlockWriterHolding();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION:
			return isSetRwlockWriterUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING:
			return isSetRwlockWriterWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE:
			return isSetRwlockWriterWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION:
			return isSetSemaphoreUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING:
			return isSetSemaphoreWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE:
			return isSetSemaphoreWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
			return isSetServiceTime();
		case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
			return isSetServiceTimeVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
			return isSetSquaredCoeffVariation();
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
			return isSetThroughput();
		case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
			return isSetThroughputBound();
		case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
			return isSetUtilization();
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
			return isSetWaiting();
		case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
			return isSetWaitingVariance();
		case LqnPackage.OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH:
			return bottleneckStrength != BOTTLENECK_STRENGTH_EDEFAULT;
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
		result.append(" (lossProbability: ");
		if (lossProbabilityESet)
			result.append(lossProbability);
		else
			result.append("<unset>");
		result.append(", openWaitTime: ");
		if (openWaitTimeESet)
			result.append(openWaitTime);
		else
			result.append("<unset>");
		result.append(", phase1ProcWaiting: ");
		if (phase1ProcWaitingESet)
			result.append(phase1ProcWaiting);
		else
			result.append("<unset>");
		result.append(", phase1ServiceTime: ");
		if (phase1ServiceTimeESet)
			result.append(phase1ServiceTime);
		else
			result.append("<unset>");
		result.append(", phase1ServiceTimeVariance: ");
		if (phase1ServiceTimeVarianceESet)
			result.append(phase1ServiceTimeVariance);
		else
			result.append("<unset>");
		result.append(", phase1Utilization: ");
		if (phase1UtilizationESet)
			result.append(phase1Utilization);
		else
			result.append("<unset>");
		result.append(", phase1Waiting: ");
		if (phase1WaitingESet)
			result.append(phase1Waiting);
		else
			result.append("<unset>");
		result.append(", phase1WaitingVariance: ");
		if (phase1WaitingVarianceESet)
			result.append(phase1WaitingVariance);
		else
			result.append("<unset>");
		result.append(", phase2ProcWaiting: ");
		if (phase2ProcWaitingESet)
			result.append(phase2ProcWaiting);
		else
			result.append("<unset>");
		result.append(", phase2ServiceTime: ");
		if (phase2ServiceTimeESet)
			result.append(phase2ServiceTime);
		else
			result.append("<unset>");
		result.append(", phase2ServiceTimeVariance: ");
		if (phase2ServiceTimeVarianceESet)
			result.append(phase2ServiceTimeVariance);
		else
			result.append("<unset>");
		result.append(", phase2Utilization: ");
		if (phase2UtilizationESet)
			result.append(phase2Utilization);
		else
			result.append("<unset>");
		result.append(", phase2Waiting: ");
		if (phase2WaitingESet)
			result.append(phase2Waiting);
		else
			result.append("<unset>");
		result.append(", phase2WaitingVariance: ");
		if (phase2WaitingVarianceESet)
			result.append(phase2WaitingVariance);
		else
			result.append("<unset>");
		result.append(", phase3ProcWaiting: ");
		if (phase3ProcWaitingESet)
			result.append(phase3ProcWaiting);
		else
			result.append("<unset>");
		result.append(", phase3ServiceTime: ");
		if (phase3ServiceTimeESet)
			result.append(phase3ServiceTime);
		else
			result.append("<unset>");
		result.append(", phase3ServiceTimeVariance: ");
		if (phase3ServiceTimeVarianceESet)
			result.append(phase3ServiceTimeVariance);
		else
			result.append("<unset>");
		result.append(", phase3Utilization: ");
		if (phase3UtilizationESet)
			result.append(phase3Utilization);
		else
			result.append("<unset>");
		result.append(", phase3Waiting: ");
		if (phase3WaitingESet)
			result.append(phase3Waiting);
		else
			result.append("<unset>");
		result.append(", phase3WaitingVariance: ");
		if (phase3WaitingVarianceESet)
			result.append(phase3WaitingVariance);
		else
			result.append("<unset>");
		result.append(", probExceedMaxServiceTime: ");
		if (probExceedMaxServiceTimeESet)
			result.append(probExceedMaxServiceTime);
		else
			result.append("<unset>");
		result.append(", procUtilization: ");
		if (procUtilizationESet)
			result.append(procUtilization);
		else
			result.append("<unset>");
		result.append(", procWaiting: ");
		if (procWaitingESet)
			result.append(procWaiting);
		else
			result.append("<unset>");
		result.append(", rwlockReaderHolding: ");
		if (rwlockReaderHoldingESet)
			result.append(rwlockReaderHolding);
		else
			result.append("<unset>");
		result.append(", rwlockReaderUtilization: ");
		if (rwlockReaderUtilizationESet)
			result.append(rwlockReaderUtilization);
		else
			result.append("<unset>");
		result.append(", rwlockReaderWaiting: ");
		if (rwlockReaderWaitingESet)
			result.append(rwlockReaderWaiting);
		else
			result.append("<unset>");
		result.append(", rwlockReaderWaitingVariance: ");
		if (rwlockReaderWaitingVarianceESet)
			result.append(rwlockReaderWaitingVariance);
		else
			result.append("<unset>");
		result.append(", rwlockWriterHolding: ");
		if (rwlockWriterHoldingESet)
			result.append(rwlockWriterHolding);
		else
			result.append("<unset>");
		result.append(", rwlockWriterUtilization: ");
		if (rwlockWriterUtilizationESet)
			result.append(rwlockWriterUtilization);
		else
			result.append("<unset>");
		result.append(", rwlockWriterWaiting: ");
		if (rwlockWriterWaitingESet)
			result.append(rwlockWriterWaiting);
		else
			result.append("<unset>");
		result.append(", rwlockWriterWaitingVariance: ");
		if (rwlockWriterWaitingVarianceESet)
			result.append(rwlockWriterWaitingVariance);
		else
			result.append("<unset>");
		result.append(", semaphoreUtilization: ");
		if (semaphoreUtilizationESet)
			result.append(semaphoreUtilization);
		else
			result.append("<unset>");
		result.append(", semaphoreWaiting: ");
		if (semaphoreWaitingESet)
			result.append(semaphoreWaiting);
		else
			result.append("<unset>");
		result.append(", semaphoreWaitingVariance: ");
		if (semaphoreWaitingVarianceESet)
			result.append(semaphoreWaitingVariance);
		else
			result.append("<unset>");
		result.append(", serviceTime: ");
		if (serviceTimeESet)
			result.append(serviceTime);
		else
			result.append("<unset>");
		result.append(", serviceTimeVariance: ");
		if (serviceTimeVarianceESet)
			result.append(serviceTimeVariance);
		else
			result.append("<unset>");
		result.append(", squaredCoeffVariation: ");
		if (squaredCoeffVariationESet)
			result.append(squaredCoeffVariation);
		else
			result.append("<unset>");
		result.append(", throughput: ");
		if (throughputESet)
			result.append(throughput);
		else
			result.append("<unset>");
		result.append(", throughputBound: ");
		if (throughputBoundESet)
			result.append(throughputBound);
		else
			result.append("<unset>");
		result.append(", utilization: ");
		if (utilizationESet)
			result.append(utilization);
		else
			result.append("<unset>");
		result.append(", waiting: ");
		if (waitingESet)
			result.append(waiting);
		else
			result.append("<unset>");
		result.append(", waitingVariance: ");
		if (waitingVarianceESet)
			result.append(waitingVariance);
		else
			result.append("<unset>");
		result.append(", bottleneckStrength: ");
		result.append(bottleneckStrength);
		result.append(')');
		return result.toString();
	}

} // OutputResultTypeImpl
