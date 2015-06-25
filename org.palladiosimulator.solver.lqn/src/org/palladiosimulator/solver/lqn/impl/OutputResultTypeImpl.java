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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.ResultConf95Type1;
import org.palladiosimulator.solver.lqn.ResultConf99Type1;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Output Result Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getResultConf95
 * <em>Result Conf95</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getResultConf99
 * <em>Result Conf99</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getOpenWaitTime
 * <em>Open Wait Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1ProcWaiting
 * <em>Phase1 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1ServiceTime
 * <em>Phase1 Service Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1ServiceTimeVariance
 * <em>Phase1 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase1Utilization
 * <em>Phase1 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2ProcWaiting
 * <em>Phase2 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2ServiceTime
 * <em>Phase2 Service Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2ServiceTimeVariance
 * <em>Phase2 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase2Utilization
 * <em>Phase2 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3ProcWaiting
 * <em>Phase3 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3ServiceTime
 * <em>Phase3 Service Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3ServiceTimeVariance
 * <em>Phase3 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getPhase3Utilization
 * <em>Phase3 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getProbExceedMaxServiceTime
 * <em>Prob Exceed Max Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getProcUtilization
 * <em>Proc Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getProcWaiting
 * <em>Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getServiceTime
 * <em>Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getServiceTimeVariance
 * <em>Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getSquaredCoeffVariation
 * <em>Squared Coeff Variation</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getThroughput
 * <em>Throughput</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getThroughputBound
 * <em>Throughput Bound</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getUtilization
 * <em>Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getWaiting <em>Waiting</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl#getWaitingVariance
 * <em>Waiting Variance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputResultTypeImpl extends EObjectImpl implements OutputResultType {

    /**
     * The cached value of the '{@link #getResultConf95() <em>Result Conf95</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultConf95()
     * @generated
     * @ordered
     */
    protected EList<ResultConf95Type1> resultConf95;

    /**
     * The cached value of the '{@link #getResultConf99() <em>Result Conf99</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultConf99()
     * @generated
     * @ordered
     */
    protected EList<ResultConf99Type1> resultConf99;

    /**
     * The default value of the '{@link #getOpenWaitTime() <em>Open Wait Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOpenWaitTime()
     * @generated
     * @ordered
     */
    protected static final Object OPEN_WAIT_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpenWaitTime() <em>Open Wait Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOpenWaitTime()
     * @generated
     * @ordered
     */
    protected Object openWaitTime = OPEN_WAIT_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ProcWaiting()
     * @generated
     * @ordered
     */
    protected static final Object PHASE1_PROC_WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ProcWaiting()
     * @generated
     * @ordered
     */
    protected Object phase1ProcWaiting = PHASE1_PROC_WAITING_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ServiceTime()
     * @generated
     * @ordered
     */
    protected static final Object PHASE1_SERVICE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1ServiceTime()
     * @generated
     * @ordered
     */
    protected Object phase1ServiceTime = PHASE1_SERVICE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase1ServiceTimeVariance()
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase1ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final Object PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase1ServiceTimeVariance()
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase1ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected Object phase1ServiceTimeVariance = PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1Utilization()
     * @generated
     * @ordered
     */
    protected static final Object PHASE1_UTILIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase1Utilization()
     * @generated
     * @ordered
     */
    protected Object phase1Utilization = PHASE1_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ProcWaiting()
     * @generated
     * @ordered
     */
    protected static final Object PHASE2_PROC_WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ProcWaiting()
     * @generated
     * @ordered
     */
    protected Object phase2ProcWaiting = PHASE2_PROC_WAITING_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ServiceTime()
     * @generated
     * @ordered
     */
    protected static final Object PHASE2_SERVICE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2ServiceTime()
     * @generated
     * @ordered
     */
    protected Object phase2ServiceTime = PHASE2_SERVICE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase2ServiceTimeVariance()
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase2ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final Object PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase2ServiceTimeVariance()
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase2ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected Object phase2ServiceTimeVariance = PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2Utilization()
     * @generated
     * @ordered
     */
    protected static final Object PHASE2_UTILIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase2Utilization()
     * @generated
     * @ordered
     */
    protected Object phase2Utilization = PHASE2_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ProcWaiting()
     * @generated
     * @ordered
     */
    protected static final Object PHASE3_PROC_WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ProcWaiting()
     * @generated
     * @ordered
     */
    protected Object phase3ProcWaiting = PHASE3_PROC_WAITING_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ServiceTime()
     * @generated
     * @ordered
     */
    protected static final Object PHASE3_SERVICE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3ServiceTime()
     * @generated
     * @ordered
     */
    protected Object phase3ServiceTime = PHASE3_SERVICE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase3ServiceTimeVariance()
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase3ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final Object PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase3ServiceTimeVariance()
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getPhase3ServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected Object phase3ServiceTimeVariance = PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3Utilization()
     * @generated
     * @ordered
     */
    protected static final Object PHASE3_UTILIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPhase3Utilization()
     * @generated
     * @ordered
     */
    protected Object phase3Utilization = PHASE3_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getProbExceedMaxServiceTime()
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getProbExceedMaxServiceTime()
     * @generated
     * @ordered
     */
    protected static final Object PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProbExceedMaxServiceTime()
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getProbExceedMaxServiceTime()
     * @generated
     * @ordered
     */
    protected Object probExceedMaxServiceTime = PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcUtilization()
     * @generated
     * @ordered
     */
    protected static final Object PROC_UTILIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcUtilization()
     * @generated
     * @ordered
     */
    protected Object procUtilization = PROC_UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getProcWaiting() <em>Proc Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcWaiting()
     * @generated
     * @ordered
     */
    protected static final Object PROC_WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcWaiting() <em>Proc Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcWaiting()
     * @generated
     * @ordered
     */
    protected Object procWaiting = PROC_WAITING_EDEFAULT;

    /**
     * The default value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTime()
     * @generated
     * @ordered
     */
    protected static final Object SERVICE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTime()
     * @generated
     * @ordered
     */
    protected Object serviceTime = SERVICE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected static final Object SERVICE_TIME_VARIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getServiceTimeVariance()
     * @generated
     * @ordered
     */
    protected Object serviceTimeVariance = SERVICE_TIME_VARIANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>
     * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSquaredCoeffVariation()
     * @generated
     * @ordered
     */
    protected static final Object SQUARED_COEFF_VARIATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSquaredCoeffVariation()
     * @generated
     * @ordered
     */
    protected Object squaredCoeffVariation = SQUARED_COEFF_VARIATION_EDEFAULT;

    /**
     * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughput()
     * @generated
     * @ordered
     */
    protected static final Object THROUGHPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughput()
     * @generated
     * @ordered
     */
    protected Object throughput = THROUGHPUT_EDEFAULT;

    /**
     * The default value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughputBound()
     * @generated
     * @ordered
     */
    protected static final Object THROUGHPUT_BOUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getThroughputBound()
     * @generated
     * @ordered
     */
    protected Object throughputBound = THROUGHPUT_BOUND_EDEFAULT;

    /**
     * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUtilization()
     * @generated
     * @ordered
     */
    protected static final Object UTILIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUtilization()
     * @generated
     * @ordered
     */
    protected Object utilization = UTILIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getWaiting() <em>Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaiting()
     * @generated
     * @ordered
     */
    protected static final Object WAITING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaiting() <em>Waiting</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaiting()
     * @generated
     * @ordered
     */
    protected Object waiting = WAITING_EDEFAULT;

    /**
     * The default value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaitingVariance()
     * @generated
     * @ordered
     */
    protected static final Object WAITING_VARIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWaitingVariance()
     * @generated
     * @ordered
     */
    protected Object waitingVariance = WAITING_VARIANCE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OutputResultTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.OUTPUT_RESULT_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ResultConf95Type1> getResultConf95() {
        if (this.resultConf95 == null) {
            this.resultConf95 = new EObjectContainmentEList<ResultConf95Type1>(ResultConf95Type1.class, this,
                    LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95);
        }
        return this.resultConf95;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ResultConf99Type1> getResultConf99() {
        if (this.resultConf99 == null) {
            this.resultConf99 = new EObjectContainmentEList<ResultConf99Type1>(ResultConf99Type1.class, this,
                    LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99);
        }
        return this.resultConf99;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getOpenWaitTime() {
        return this.openWaitTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOpenWaitTime(final Object newOpenWaitTime) {
        final Object oldOpenWaitTime = this.openWaitTime;
        this.openWaitTime = newOpenWaitTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME,
                    oldOpenWaitTime, this.openWaitTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase1ProcWaiting() {
        return this.phase1ProcWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1ProcWaiting(final Object newPhase1ProcWaiting) {
        final Object oldPhase1ProcWaiting = this.phase1ProcWaiting;
        this.phase1ProcWaiting = newPhase1ProcWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING, oldPhase1ProcWaiting, this.phase1ProcWaiting));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase1ServiceTime() {
        return this.phase1ServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1ServiceTime(final Object newPhase1ServiceTime) {
        final Object oldPhase1ServiceTime = this.phase1ServiceTime;
        this.phase1ServiceTime = newPhase1ServiceTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME, oldPhase1ServiceTime, this.phase1ServiceTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase1ServiceTimeVariance() {
        return this.phase1ServiceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1ServiceTimeVariance(final Object newPhase1ServiceTimeVariance) {
        final Object oldPhase1ServiceTimeVariance = this.phase1ServiceTimeVariance;
        this.phase1ServiceTimeVariance = newPhase1ServiceTimeVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE, oldPhase1ServiceTimeVariance,
                    this.phase1ServiceTimeVariance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase1Utilization() {
        return this.phase1Utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase1Utilization(final Object newPhase1Utilization) {
        final Object oldPhase1Utilization = this.phase1Utilization;
        this.phase1Utilization = newPhase1Utilization;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION, oldPhase1Utilization, this.phase1Utilization));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase2ProcWaiting() {
        return this.phase2ProcWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2ProcWaiting(final Object newPhase2ProcWaiting) {
        final Object oldPhase2ProcWaiting = this.phase2ProcWaiting;
        this.phase2ProcWaiting = newPhase2ProcWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING, oldPhase2ProcWaiting, this.phase2ProcWaiting));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase2ServiceTime() {
        return this.phase2ServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2ServiceTime(final Object newPhase2ServiceTime) {
        final Object oldPhase2ServiceTime = this.phase2ServiceTime;
        this.phase2ServiceTime = newPhase2ServiceTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME, oldPhase2ServiceTime, this.phase2ServiceTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase2ServiceTimeVariance() {
        return this.phase2ServiceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2ServiceTimeVariance(final Object newPhase2ServiceTimeVariance) {
        final Object oldPhase2ServiceTimeVariance = this.phase2ServiceTimeVariance;
        this.phase2ServiceTimeVariance = newPhase2ServiceTimeVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE, oldPhase2ServiceTimeVariance,
                    this.phase2ServiceTimeVariance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase2Utilization() {
        return this.phase2Utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase2Utilization(final Object newPhase2Utilization) {
        final Object oldPhase2Utilization = this.phase2Utilization;
        this.phase2Utilization = newPhase2Utilization;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION, oldPhase2Utilization, this.phase2Utilization));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase3ProcWaiting() {
        return this.phase3ProcWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3ProcWaiting(final Object newPhase3ProcWaiting) {
        final Object oldPhase3ProcWaiting = this.phase3ProcWaiting;
        this.phase3ProcWaiting = newPhase3ProcWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING, oldPhase3ProcWaiting, this.phase3ProcWaiting));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase3ServiceTime() {
        return this.phase3ServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3ServiceTime(final Object newPhase3ServiceTime) {
        final Object oldPhase3ServiceTime = this.phase3ServiceTime;
        this.phase3ServiceTime = newPhase3ServiceTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME, oldPhase3ServiceTime, this.phase3ServiceTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase3ServiceTimeVariance() {
        return this.phase3ServiceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3ServiceTimeVariance(final Object newPhase3ServiceTimeVariance) {
        final Object oldPhase3ServiceTimeVariance = this.phase3ServiceTimeVariance;
        this.phase3ServiceTimeVariance = newPhase3ServiceTimeVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE, oldPhase3ServiceTimeVariance,
                    this.phase3ServiceTimeVariance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getPhase3Utilization() {
        return this.phase3Utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPhase3Utilization(final Object newPhase3Utilization) {
        final Object oldPhase3Utilization = this.phase3Utilization;
        this.phase3Utilization = newPhase3Utilization;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION, oldPhase3Utilization, this.phase3Utilization));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getProbExceedMaxServiceTime() {
        return this.probExceedMaxServiceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProbExceedMaxServiceTime(final Object newProbExceedMaxServiceTime) {
        final Object oldProbExceedMaxServiceTime = this.probExceedMaxServiceTime;
        this.probExceedMaxServiceTime = newProbExceedMaxServiceTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME, oldProbExceedMaxServiceTime,
                    this.probExceedMaxServiceTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getProcUtilization() {
        return this.procUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProcUtilization(final Object newProcUtilization) {
        final Object oldProcUtilization = this.procUtilization;
        this.procUtilization = newProcUtilization;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION,
                    oldProcUtilization, this.procUtilization));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getProcWaiting() {
        return this.procWaiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProcWaiting(final Object newProcWaiting) {
        final Object oldProcWaiting = this.procWaiting;
        this.procWaiting = newProcWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING,
                    oldProcWaiting, this.procWaiting));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getServiceTime() {
        return this.serviceTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceTime(final Object newServiceTime) {
        final Object oldServiceTime = this.serviceTime;
        this.serviceTime = newServiceTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME,
                    oldServiceTime, this.serviceTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getServiceTimeVariance() {
        return this.serviceTimeVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceTimeVariance(final Object newServiceTimeVariance) {
        final Object oldServiceTimeVariance = this.serviceTimeVariance;
        this.serviceTimeVariance = newServiceTimeVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(
                    new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE,
                            oldServiceTimeVariance, this.serviceTimeVariance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getSquaredCoeffVariation() {
        return this.squaredCoeffVariation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSquaredCoeffVariation(final Object newSquaredCoeffVariation) {
        final Object oldSquaredCoeffVariation = this.squaredCoeffVariation;
        this.squaredCoeffVariation = newSquaredCoeffVariation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION, oldSquaredCoeffVariation,
                    this.squaredCoeffVariation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getThroughput() {
        return this.throughput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setThroughput(final Object newThroughput) {
        final Object oldThroughput = this.throughput;
        this.throughput = newThroughput;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT,
                    oldThroughput, this.throughput));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getThroughputBound() {
        return this.throughputBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setThroughputBound(final Object newThroughputBound) {
        final Object oldThroughputBound = this.throughputBound;
        this.throughputBound = newThroughputBound;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND,
                    oldThroughputBound, this.throughputBound));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getUtilization() {
        return this.utilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUtilization(final Object newUtilization) {
        final Object oldUtilization = this.utilization;
        this.utilization = newUtilization;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION,
                    oldUtilization, this.utilization));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getWaiting() {
        return this.waiting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWaiting(final Object newWaiting) {
        final Object oldWaiting = this.waiting;
        this.waiting = newWaiting;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__WAITING,
                    oldWaiting, this.waiting));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getWaitingVariance() {
        return this.waitingVariance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWaitingVariance(final Object newWaitingVariance) {
        final Object oldWaitingVariance = this.waitingVariance;
        this.waitingVariance = newWaitingVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE,
                    oldWaitingVariance, this.waitingVariance));
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
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
            return ((InternalEList<?>) this.getResultConf95()).basicRemove(otherEnd, msgs);
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
            return ((InternalEList<?>) this.getResultConf99()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
            return this.getResultConf95();
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
            return this.getResultConf99();
        case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
            return this.getOpenWaitTime();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
            return this.getPhase1ProcWaiting();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
            return this.getPhase1ServiceTime();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
            return this.getPhase1ServiceTimeVariance();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
            return this.getPhase1Utilization();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
            return this.getPhase2ProcWaiting();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
            return this.getPhase2ServiceTime();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
            return this.getPhase2ServiceTimeVariance();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
            return this.getPhase2Utilization();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
            return this.getPhase3ProcWaiting();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
            return this.getPhase3ServiceTime();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
            return this.getPhase3ServiceTimeVariance();
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
            return this.getPhase3Utilization();
        case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
            return this.getProbExceedMaxServiceTime();
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
            return this.getProcUtilization();
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
            return this.getProcWaiting();
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
            return this.getServiceTime();
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
            return this.getServiceTimeVariance();
        case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
            return this.getSquaredCoeffVariation();
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
            return this.getThroughput();
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
            return this.getThroughputBound();
        case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
            return this.getUtilization();
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
            return this.getWaiting();
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
            return this.getWaitingVariance();
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
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
            this.getResultConf95().clear();
            this.getResultConf95().addAll((Collection<? extends ResultConf95Type1>) newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
            this.getResultConf99().clear();
            this.getResultConf99().addAll((Collection<? extends ResultConf99Type1>) newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
            this.setOpenWaitTime(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
            this.setPhase1ProcWaiting(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
            this.setPhase1ServiceTime(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
            this.setPhase1ServiceTimeVariance(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
            this.setPhase1Utilization(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
            this.setPhase2ProcWaiting(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
            this.setPhase2ServiceTime(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
            this.setPhase2ServiceTimeVariance(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
            this.setPhase2Utilization(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
            this.setPhase3ProcWaiting(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
            this.setPhase3ServiceTime(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
            this.setPhase3ServiceTimeVariance(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
            this.setPhase3Utilization(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
            this.setProbExceedMaxServiceTime(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
            this.setProcUtilization(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
            this.setProcWaiting(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
            this.setServiceTime(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
            this.setServiceTimeVariance(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
            this.setSquaredCoeffVariation(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
            this.setThroughput(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
            this.setThroughputBound(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
            this.setUtilization(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
            this.setWaiting(newValue);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
            this.setWaitingVariance(newValue);
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
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
            this.getResultConf95().clear();
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
            this.getResultConf99().clear();
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
            this.setOpenWaitTime(OPEN_WAIT_TIME_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
            this.setPhase1ProcWaiting(PHASE1_PROC_WAITING_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
            this.setPhase1ServiceTime(PHASE1_SERVICE_TIME_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
            this.setPhase1ServiceTimeVariance(PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
            this.setPhase1Utilization(PHASE1_UTILIZATION_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
            this.setPhase2ProcWaiting(PHASE2_PROC_WAITING_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
            this.setPhase2ServiceTime(PHASE2_SERVICE_TIME_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
            this.setPhase2ServiceTimeVariance(PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
            this.setPhase2Utilization(PHASE2_UTILIZATION_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
            this.setPhase3ProcWaiting(PHASE3_PROC_WAITING_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
            this.setPhase3ServiceTime(PHASE3_SERVICE_TIME_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
            this.setPhase3ServiceTimeVariance(PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
            this.setPhase3Utilization(PHASE3_UTILIZATION_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
            this.setProbExceedMaxServiceTime(PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
            this.setProcUtilization(PROC_UTILIZATION_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
            this.setProcWaiting(PROC_WAITING_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
            this.setServiceTime(SERVICE_TIME_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
            this.setServiceTimeVariance(SERVICE_TIME_VARIANCE_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
            this.setSquaredCoeffVariation(SQUARED_COEFF_VARIATION_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
            this.setThroughput(THROUGHPUT_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
            this.setThroughputBound(THROUGHPUT_BOUND_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
            this.setUtilization(UTILIZATION_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
            this.setWaiting(WAITING_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
            this.setWaitingVariance(WAITING_VARIANCE_EDEFAULT);
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
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
            return this.resultConf95 != null && !this.resultConf95.isEmpty();
        case LqnPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
            return this.resultConf99 != null && !this.resultConf99.isEmpty();
        case LqnPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
            return OPEN_WAIT_TIME_EDEFAULT == null ? this.openWaitTime != null
                    : !OPEN_WAIT_TIME_EDEFAULT.equals(this.openWaitTime);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
            return PHASE1_PROC_WAITING_EDEFAULT == null ? this.phase1ProcWaiting != null
                    : !PHASE1_PROC_WAITING_EDEFAULT.equals(this.phase1ProcWaiting);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
            return PHASE1_SERVICE_TIME_EDEFAULT == null ? this.phase1ServiceTime != null
                    : !PHASE1_SERVICE_TIME_EDEFAULT.equals(this.phase1ServiceTime);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
            return PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT == null ? this.phase1ServiceTimeVariance != null
                    : !PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT.equals(this.phase1ServiceTimeVariance);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
            return PHASE1_UTILIZATION_EDEFAULT == null ? this.phase1Utilization != null
                    : !PHASE1_UTILIZATION_EDEFAULT.equals(this.phase1Utilization);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
            return PHASE2_PROC_WAITING_EDEFAULT == null ? this.phase2ProcWaiting != null
                    : !PHASE2_PROC_WAITING_EDEFAULT.equals(this.phase2ProcWaiting);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
            return PHASE2_SERVICE_TIME_EDEFAULT == null ? this.phase2ServiceTime != null
                    : !PHASE2_SERVICE_TIME_EDEFAULT.equals(this.phase2ServiceTime);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
            return PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT == null ? this.phase2ServiceTimeVariance != null
                    : !PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT.equals(this.phase2ServiceTimeVariance);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
            return PHASE2_UTILIZATION_EDEFAULT == null ? this.phase2Utilization != null
                    : !PHASE2_UTILIZATION_EDEFAULT.equals(this.phase2Utilization);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
            return PHASE3_PROC_WAITING_EDEFAULT == null ? this.phase3ProcWaiting != null
                    : !PHASE3_PROC_WAITING_EDEFAULT.equals(this.phase3ProcWaiting);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
            return PHASE3_SERVICE_TIME_EDEFAULT == null ? this.phase3ServiceTime != null
                    : !PHASE3_SERVICE_TIME_EDEFAULT.equals(this.phase3ServiceTime);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
            return PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT == null ? this.phase3ServiceTimeVariance != null
                    : !PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT.equals(this.phase3ServiceTimeVariance);
        case LqnPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
            return PHASE3_UTILIZATION_EDEFAULT == null ? this.phase3Utilization != null
                    : !PHASE3_UTILIZATION_EDEFAULT.equals(this.phase3Utilization);
        case LqnPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
            return PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT == null ? this.probExceedMaxServiceTime != null
                    : !PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT.equals(this.probExceedMaxServiceTime);
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
            return PROC_UTILIZATION_EDEFAULT == null ? this.procUtilization != null
                    : !PROC_UTILIZATION_EDEFAULT.equals(this.procUtilization);
        case LqnPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
            return PROC_WAITING_EDEFAULT == null ? this.procWaiting != null
                    : !PROC_WAITING_EDEFAULT.equals(this.procWaiting);
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
            return SERVICE_TIME_EDEFAULT == null ? this.serviceTime != null
                    : !SERVICE_TIME_EDEFAULT.equals(this.serviceTime);
        case LqnPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
            return SERVICE_TIME_VARIANCE_EDEFAULT == null ? this.serviceTimeVariance != null
                    : !SERVICE_TIME_VARIANCE_EDEFAULT.equals(this.serviceTimeVariance);
        case LqnPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
            return SQUARED_COEFF_VARIATION_EDEFAULT == null ? this.squaredCoeffVariation != null
                    : !SQUARED_COEFF_VARIATION_EDEFAULT.equals(this.squaredCoeffVariation);
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
            return THROUGHPUT_EDEFAULT == null ? this.throughput != null : !THROUGHPUT_EDEFAULT.equals(this.throughput);
        case LqnPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
            return THROUGHPUT_BOUND_EDEFAULT == null ? this.throughputBound != null
                    : !THROUGHPUT_BOUND_EDEFAULT.equals(this.throughputBound);
        case LqnPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
            return UTILIZATION_EDEFAULT == null ? this.utilization != null
                    : !UTILIZATION_EDEFAULT.equals(this.utilization);
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING:
            return WAITING_EDEFAULT == null ? this.waiting != null : !WAITING_EDEFAULT.equals(this.waiting);
        case LqnPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
            return WAITING_VARIANCE_EDEFAULT == null ? this.waitingVariance != null
                    : !WAITING_VARIANCE_EDEFAULT.equals(this.waitingVariance);
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
        result.append(" (openWaitTime: ");
        result.append(this.openWaitTime);
        result.append(", phase1ProcWaiting: ");
        result.append(this.phase1ProcWaiting);
        result.append(", phase1ServiceTime: ");
        result.append(this.phase1ServiceTime);
        result.append(", phase1ServiceTimeVariance: ");
        result.append(this.phase1ServiceTimeVariance);
        result.append(", phase1Utilization: ");
        result.append(this.phase1Utilization);
        result.append(", phase2ProcWaiting: ");
        result.append(this.phase2ProcWaiting);
        result.append(", phase2ServiceTime: ");
        result.append(this.phase2ServiceTime);
        result.append(", phase2ServiceTimeVariance: ");
        result.append(this.phase2ServiceTimeVariance);
        result.append(", phase2Utilization: ");
        result.append(this.phase2Utilization);
        result.append(", phase3ProcWaiting: ");
        result.append(this.phase3ProcWaiting);
        result.append(", phase3ServiceTime: ");
        result.append(this.phase3ServiceTime);
        result.append(", phase3ServiceTimeVariance: ");
        result.append(this.phase3ServiceTimeVariance);
        result.append(", phase3Utilization: ");
        result.append(this.phase3Utilization);
        result.append(", probExceedMaxServiceTime: ");
        result.append(this.probExceedMaxServiceTime);
        result.append(", procUtilization: ");
        result.append(this.procUtilization);
        result.append(", procWaiting: ");
        result.append(this.procWaiting);
        result.append(", serviceTime: ");
        result.append(this.serviceTime);
        result.append(", serviceTimeVariance: ");
        result.append(this.serviceTimeVariance);
        result.append(", squaredCoeffVariation: ");
        result.append(this.squaredCoeffVariation);
        result.append(", throughput: ");
        result.append(this.throughput);
        result.append(", throughputBound: ");
        result.append(this.throughputBound);
        result.append(", utilization: ");
        result.append(this.utilization);
        result.append(", waiting: ");
        result.append(this.waiting);
        result.append(", waitingVariance: ");
        result.append(this.waitingVariance);
        result.append(')');
        return result.toString();
    }

} // OutputResultTypeImpl
