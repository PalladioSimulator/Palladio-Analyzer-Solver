/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Result Conf95 Type1</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getLossProbability <em>Loss
 * Probability</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getOpenWaitTime <em>Open Wait Time
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ProcWaiting <em>Phase1
 * Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTime <em>Phase1
 * Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTimeVariance <em>
 * Phase1 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Utilization <em>Phase1
 * Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Waiting <em>Phase1 Waiting
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1WaitingVariance <em>Phase1
 * Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ProcWaiting <em>Phase2
 * Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTime <em>Phase2
 * Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTimeVariance <em>
 * Phase2 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Utilization <em>Phase2
 * Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Waiting <em>Phase2 Waiting
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2WaitingVariance <em>Phase2
 * Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ProcWaiting <em>Phase3
 * Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTime <em>Phase3
 * Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTimeVariance <em>
 * Phase3 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Utilization <em>Phase3
 * Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Waiting <em>Phase3 Waiting
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3WaitingVariance <em>Phase3
 * Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProbExceedMaxServiceTime <em>
 * Prob Exceed Max Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcUtilization <em>Proc
 * Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcWaiting <em>Proc Waiting
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderHolding <em>Rwlock
 * Reader Holding</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderUtilization <em>
 * Rwlock Reader Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaiting <em>Rwlock
 * Reader Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaitingVariance <em>
 * Rwlock Reader Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterHolding <em>Rwlock
 * Writer Holding</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterUtilization <em>
 * Rwlock Writer Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaiting <em>Rwlock
 * Writer Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaitingVariance <em>
 * Rwlock Writer Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreUtilization <em>
 * Semaphore Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaiting <em>Semaphore
 * Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaitingVariance <em>
 * Semaphore Waiting Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTime <em>Service Time
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTimeVariance <em>Service
 * Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSquaredCoeffVariation <em>
 * Squared Coeff Variation</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughput <em>Throughput</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughputBound <em>Throughput
 * Bound</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getUtilization <em>Utilization
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaiting <em>Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaitingVariance <em>Waiting
 * Variance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1()
 * @model extendedMetaData="name='result-conf-95_._1_._type' kind='empty'"
 * @generated
 */
public interface ResultConf95Type1 extends EObject {
    /**
     * Returns the value of the '<em><b>Loss Probability</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Loss Probability</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Loss Probability</em>' attribute.
     * @see #isSetLossProbability()
     * @see #unsetLossProbability()
     * @see #setLossProbability(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_LossProbability()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='loss-probability' namespace='##targetNamespace'"
     * @generated
     */
    double getLossProbability();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getLossProbability
     * <em>Loss Probability</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Loss Probability</em>' attribute.
     * @see #isSetLossProbability()
     * @see #unsetLossProbability()
     * @see #getLossProbability()
     * @generated
     */
    void setLossProbability(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getLossProbability
     * <em>Loss Probability</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetLossProbability()
     * @see #getLossProbability()
     * @see #setLossProbability(double)
     * @generated
     */
    void unsetLossProbability();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getLossProbability
     * <em>Loss Probability</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Loss Probability</em>' attribute is set.
     * @see #unsetLossProbability()
     * @see #getLossProbability()
     * @see #setLossProbability(double)
     * @generated
     */
    boolean isSetLossProbability();

    /**
     * Returns the value of the '<em><b>Open Wait Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open Wait Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Open Wait Time</em>' attribute.
     * @see #isSetOpenWaitTime()
     * @see #unsetOpenWaitTime()
     * @see #setOpenWaitTime(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_OpenWaitTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='open-wait-time' namespace='##targetNamespace'"
     * @generated
     */
    double getOpenWaitTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getOpenWaitTime
     * <em>Open Wait Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Open Wait Time</em>' attribute.
     * @see #isSetOpenWaitTime()
     * @see #unsetOpenWaitTime()
     * @see #getOpenWaitTime()
     * @generated
     */
    void setOpenWaitTime(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getOpenWaitTime
     * <em>Open Wait Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetOpenWaitTime()
     * @see #getOpenWaitTime()
     * @see #setOpenWaitTime(double)
     * @generated
     */
    void unsetOpenWaitTime();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getOpenWaitTime
     * <em>Open Wait Time</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Open Wait Time</em>' attribute is set.
     * @see #unsetOpenWaitTime()
     * @see #getOpenWaitTime()
     * @see #setOpenWaitTime(double)
     * @generated
     */
    boolean isSetOpenWaitTime();

    /**
     * Returns the value of the '<em><b>Phase1 Proc Waiting</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase1 Proc Waiting</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase1 Proc Waiting</em>' attribute.
     * @see #isSetPhase1ProcWaiting()
     * @see #unsetPhase1ProcWaiting()
     * @see #setPhase1ProcWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase1ProcWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase1-proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase1ProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ProcWaiting
     * <em>Phase1 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Proc Waiting</em>' attribute.
     * @see #isSetPhase1ProcWaiting()
     * @see #unsetPhase1ProcWaiting()
     * @see #getPhase1ProcWaiting()
     * @generated
     */
    void setPhase1ProcWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ProcWaiting
     * <em>Phase1 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase1ProcWaiting()
     * @see #getPhase1ProcWaiting()
     * @see #setPhase1ProcWaiting(double)
     * @generated
     */
    void unsetPhase1ProcWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ProcWaiting
     * <em>Phase1 Proc Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Phase1 Proc Waiting</em>' attribute is set.
     * @see #unsetPhase1ProcWaiting()
     * @see #getPhase1ProcWaiting()
     * @see #setPhase1ProcWaiting(double)
     * @generated
     */
    boolean isSetPhase1ProcWaiting();

    /**
     * Returns the value of the '<em><b>Phase1 Service Time</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase1 Service Time</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase1 Service Time</em>' attribute.
     * @see #isSetPhase1ServiceTime()
     * @see #unsetPhase1ServiceTime()
     * @see #setPhase1ServiceTime(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase1ServiceTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase1-service-time' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase1ServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTime
     * <em>Phase1 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Service Time</em>' attribute.
     * @see #isSetPhase1ServiceTime()
     * @see #unsetPhase1ServiceTime()
     * @see #getPhase1ServiceTime()
     * @generated
     */
    void setPhase1ServiceTime(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTime
     * <em>Phase1 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase1ServiceTime()
     * @see #getPhase1ServiceTime()
     * @see #setPhase1ServiceTime(double)
     * @generated
     */
    void unsetPhase1ServiceTime();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTime
     * <em>Phase1 Service Time</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Phase1 Service Time</em>' attribute is set.
     * @see #unsetPhase1ServiceTime()
     * @see #getPhase1ServiceTime()
     * @see #setPhase1ServiceTime(double)
     * @generated
     */
    boolean isSetPhase1ServiceTime();

    /**
     * Returns the value of the '<em><b>Phase1 Service Time Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase1 Service Time Variance</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase1 Service Time Variance</em>' attribute.
     * @see #isSetPhase1ServiceTimeVariance()
     * @see #unsetPhase1ServiceTimeVariance()
     * @see #setPhase1ServiceTimeVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase1ServiceTimeVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase1-service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase1ServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTimeVariance
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Service Time Variance</em>' attribute.
     * @see #isSetPhase1ServiceTimeVariance()
     * @see #unsetPhase1ServiceTimeVariance()
     * @see #getPhase1ServiceTimeVariance()
     * @generated
     */
    void setPhase1ServiceTimeVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTimeVariance
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isSetPhase1ServiceTimeVariance()
     * @see #getPhase1ServiceTimeVariance()
     * @see #setPhase1ServiceTimeVariance(double)
     * @generated
     */
    void unsetPhase1ServiceTimeVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTimeVariance
     * <em>Phase1 Service Time Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Phase1 Service Time Variance</em>' attribute is set.
     * @see #unsetPhase1ServiceTimeVariance()
     * @see #getPhase1ServiceTimeVariance()
     * @see #setPhase1ServiceTimeVariance(double)
     * @generated
     */
    boolean isSetPhase1ServiceTimeVariance();

    /**
     * Returns the value of the '<em><b>Phase1 Utilization</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase1 Utilization</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase1 Utilization</em>' attribute.
     * @see #isSetPhase1Utilization()
     * @see #unsetPhase1Utilization()
     * @see #setPhase1Utilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase1Utilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='phase1-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase1Utilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Utilization
     * <em>Phase1 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Utilization</em>' attribute.
     * @see #isSetPhase1Utilization()
     * @see #unsetPhase1Utilization()
     * @see #getPhase1Utilization()
     * @generated
     */
    void setPhase1Utilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Utilization
     * <em>Phase1 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase1Utilization()
     * @see #getPhase1Utilization()
     * @see #setPhase1Utilization(double)
     * @generated
     */
    void unsetPhase1Utilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Utilization
     * <em>Phase1 Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phase1 Utilization</em>' attribute is set.
     * @see #unsetPhase1Utilization()
     * @see #getPhase1Utilization()
     * @see #setPhase1Utilization(double)
     * @generated
     */
    boolean isSetPhase1Utilization();

    /**
     * Returns the value of the '<em><b>Phase1 Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase1 Waiting</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase1 Waiting</em>' attribute.
     * @see #isSetPhase1Waiting()
     * @see #unsetPhase1Waiting()
     * @see #setPhase1Waiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase1Waiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='phase1-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase1Waiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Waiting
     * <em>Phase1 Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Waiting</em>' attribute.
     * @see #isSetPhase1Waiting()
     * @see #unsetPhase1Waiting()
     * @see #getPhase1Waiting()
     * @generated
     */
    void setPhase1Waiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Waiting
     * <em>Phase1 Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase1Waiting()
     * @see #getPhase1Waiting()
     * @see #setPhase1Waiting(double)
     * @generated
     */
    void unsetPhase1Waiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Waiting
     * <em>Phase1 Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phase1 Waiting</em>' attribute is set.
     * @see #unsetPhase1Waiting()
     * @see #getPhase1Waiting()
     * @see #setPhase1Waiting(double)
     * @generated
     */
    boolean isSetPhase1Waiting();

    /**
     * Returns the value of the '<em><b>Phase1 Waiting Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase1 Waiting Variance</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase1 Waiting Variance</em>' attribute.
     * @see #isSetPhase1WaitingVariance()
     * @see #unsetPhase1WaitingVariance()
     * @see #setPhase1WaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase1WaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase1-waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase1WaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1WaitingVariance
     * <em>Phase1 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Waiting Variance</em>' attribute.
     * @see #isSetPhase1WaitingVariance()
     * @see #unsetPhase1WaitingVariance()
     * @see #getPhase1WaitingVariance()
     * @generated
     */
    void setPhase1WaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1WaitingVariance
     * <em>Phase1 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase1WaitingVariance()
     * @see #getPhase1WaitingVariance()
     * @see #setPhase1WaitingVariance(double)
     * @generated
     */
    void unsetPhase1WaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1WaitingVariance
     * <em>Phase1 Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Phase1 Waiting Variance</em>' attribute is set.
     * @see #unsetPhase1WaitingVariance()
     * @see #getPhase1WaitingVariance()
     * @see #setPhase1WaitingVariance(double)
     * @generated
     */
    boolean isSetPhase1WaitingVariance();

    /**
     * Returns the value of the '<em><b>Phase2 Proc Waiting</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase2 Proc Waiting</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase2 Proc Waiting</em>' attribute.
     * @see #isSetPhase2ProcWaiting()
     * @see #unsetPhase2ProcWaiting()
     * @see #setPhase2ProcWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase2ProcWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase2-proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase2ProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ProcWaiting
     * <em>Phase2 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Proc Waiting</em>' attribute.
     * @see #isSetPhase2ProcWaiting()
     * @see #unsetPhase2ProcWaiting()
     * @see #getPhase2ProcWaiting()
     * @generated
     */
    void setPhase2ProcWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ProcWaiting
     * <em>Phase2 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase2ProcWaiting()
     * @see #getPhase2ProcWaiting()
     * @see #setPhase2ProcWaiting(double)
     * @generated
     */
    void unsetPhase2ProcWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ProcWaiting
     * <em>Phase2 Proc Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Phase2 Proc Waiting</em>' attribute is set.
     * @see #unsetPhase2ProcWaiting()
     * @see #getPhase2ProcWaiting()
     * @see #setPhase2ProcWaiting(double)
     * @generated
     */
    boolean isSetPhase2ProcWaiting();

    /**
     * Returns the value of the '<em><b>Phase2 Service Time</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase2 Service Time</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase2 Service Time</em>' attribute.
     * @see #isSetPhase2ServiceTime()
     * @see #unsetPhase2ServiceTime()
     * @see #setPhase2ServiceTime(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase2ServiceTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase2-service-time' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase2ServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTime
     * <em>Phase2 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Service Time</em>' attribute.
     * @see #isSetPhase2ServiceTime()
     * @see #unsetPhase2ServiceTime()
     * @see #getPhase2ServiceTime()
     * @generated
     */
    void setPhase2ServiceTime(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTime
     * <em>Phase2 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase2ServiceTime()
     * @see #getPhase2ServiceTime()
     * @see #setPhase2ServiceTime(double)
     * @generated
     */
    void unsetPhase2ServiceTime();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTime
     * <em>Phase2 Service Time</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Phase2 Service Time</em>' attribute is set.
     * @see #unsetPhase2ServiceTime()
     * @see #getPhase2ServiceTime()
     * @see #setPhase2ServiceTime(double)
     * @generated
     */
    boolean isSetPhase2ServiceTime();

    /**
     * Returns the value of the '<em><b>Phase2 Service Time Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase2 Service Time Variance</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase2 Service Time Variance</em>' attribute.
     * @see #isSetPhase2ServiceTimeVariance()
     * @see #unsetPhase2ServiceTimeVariance()
     * @see #setPhase2ServiceTimeVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase2ServiceTimeVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase2-service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase2ServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTimeVariance
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Service Time Variance</em>' attribute.
     * @see #isSetPhase2ServiceTimeVariance()
     * @see #unsetPhase2ServiceTimeVariance()
     * @see #getPhase2ServiceTimeVariance()
     * @generated
     */
    void setPhase2ServiceTimeVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTimeVariance
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isSetPhase2ServiceTimeVariance()
     * @see #getPhase2ServiceTimeVariance()
     * @see #setPhase2ServiceTimeVariance(double)
     * @generated
     */
    void unsetPhase2ServiceTimeVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTimeVariance
     * <em>Phase2 Service Time Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Phase2 Service Time Variance</em>' attribute is set.
     * @see #unsetPhase2ServiceTimeVariance()
     * @see #getPhase2ServiceTimeVariance()
     * @see #setPhase2ServiceTimeVariance(double)
     * @generated
     */
    boolean isSetPhase2ServiceTimeVariance();

    /**
     * Returns the value of the '<em><b>Phase2 Utilization</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase2 Utilization</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase2 Utilization</em>' attribute.
     * @see #isSetPhase2Utilization()
     * @see #unsetPhase2Utilization()
     * @see #setPhase2Utilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase2Utilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='phase2-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase2Utilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Utilization
     * <em>Phase2 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Utilization</em>' attribute.
     * @see #isSetPhase2Utilization()
     * @see #unsetPhase2Utilization()
     * @see #getPhase2Utilization()
     * @generated
     */
    void setPhase2Utilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Utilization
     * <em>Phase2 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase2Utilization()
     * @see #getPhase2Utilization()
     * @see #setPhase2Utilization(double)
     * @generated
     */
    void unsetPhase2Utilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Utilization
     * <em>Phase2 Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phase2 Utilization</em>' attribute is set.
     * @see #unsetPhase2Utilization()
     * @see #getPhase2Utilization()
     * @see #setPhase2Utilization(double)
     * @generated
     */
    boolean isSetPhase2Utilization();

    /**
     * Returns the value of the '<em><b>Phase2 Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase2 Waiting</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase2 Waiting</em>' attribute.
     * @see #isSetPhase2Waiting()
     * @see #unsetPhase2Waiting()
     * @see #setPhase2Waiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase2Waiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='phase2-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase2Waiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Waiting
     * <em>Phase2 Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Waiting</em>' attribute.
     * @see #isSetPhase2Waiting()
     * @see #unsetPhase2Waiting()
     * @see #getPhase2Waiting()
     * @generated
     */
    void setPhase2Waiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Waiting
     * <em>Phase2 Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase2Waiting()
     * @see #getPhase2Waiting()
     * @see #setPhase2Waiting(double)
     * @generated
     */
    void unsetPhase2Waiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Waiting
     * <em>Phase2 Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phase2 Waiting</em>' attribute is set.
     * @see #unsetPhase2Waiting()
     * @see #getPhase2Waiting()
     * @see #setPhase2Waiting(double)
     * @generated
     */
    boolean isSetPhase2Waiting();

    /**
     * Returns the value of the '<em><b>Phase2 Waiting Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase2 Waiting Variance</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase2 Waiting Variance</em>' attribute.
     * @see #isSetPhase2WaitingVariance()
     * @see #unsetPhase2WaitingVariance()
     * @see #setPhase2WaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase2WaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase2-waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase2WaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2WaitingVariance
     * <em>Phase2 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Waiting Variance</em>' attribute.
     * @see #isSetPhase2WaitingVariance()
     * @see #unsetPhase2WaitingVariance()
     * @see #getPhase2WaitingVariance()
     * @generated
     */
    void setPhase2WaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2WaitingVariance
     * <em>Phase2 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase2WaitingVariance()
     * @see #getPhase2WaitingVariance()
     * @see #setPhase2WaitingVariance(double)
     * @generated
     */
    void unsetPhase2WaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2WaitingVariance
     * <em>Phase2 Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Phase2 Waiting Variance</em>' attribute is set.
     * @see #unsetPhase2WaitingVariance()
     * @see #getPhase2WaitingVariance()
     * @see #setPhase2WaitingVariance(double)
     * @generated
     */
    boolean isSetPhase2WaitingVariance();

    /**
     * Returns the value of the '<em><b>Phase3 Proc Waiting</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase3 Proc Waiting</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase3 Proc Waiting</em>' attribute.
     * @see #isSetPhase3ProcWaiting()
     * @see #unsetPhase3ProcWaiting()
     * @see #setPhase3ProcWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase3ProcWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase3-proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase3ProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ProcWaiting
     * <em>Phase3 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Proc Waiting</em>' attribute.
     * @see #isSetPhase3ProcWaiting()
     * @see #unsetPhase3ProcWaiting()
     * @see #getPhase3ProcWaiting()
     * @generated
     */
    void setPhase3ProcWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ProcWaiting
     * <em>Phase3 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase3ProcWaiting()
     * @see #getPhase3ProcWaiting()
     * @see #setPhase3ProcWaiting(double)
     * @generated
     */
    void unsetPhase3ProcWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ProcWaiting
     * <em>Phase3 Proc Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Phase3 Proc Waiting</em>' attribute is set.
     * @see #unsetPhase3ProcWaiting()
     * @see #getPhase3ProcWaiting()
     * @see #setPhase3ProcWaiting(double)
     * @generated
     */
    boolean isSetPhase3ProcWaiting();

    /**
     * Returns the value of the '<em><b>Phase3 Service Time</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase3 Service Time</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase3 Service Time</em>' attribute.
     * @see #isSetPhase3ServiceTime()
     * @see #unsetPhase3ServiceTime()
     * @see #setPhase3ServiceTime(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase3ServiceTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase3-service-time' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase3ServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTime
     * <em>Phase3 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Service Time</em>' attribute.
     * @see #isSetPhase3ServiceTime()
     * @see #unsetPhase3ServiceTime()
     * @see #getPhase3ServiceTime()
     * @generated
     */
    void setPhase3ServiceTime(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTime
     * <em>Phase3 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase3ServiceTime()
     * @see #getPhase3ServiceTime()
     * @see #setPhase3ServiceTime(double)
     * @generated
     */
    void unsetPhase3ServiceTime();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTime
     * <em>Phase3 Service Time</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Phase3 Service Time</em>' attribute is set.
     * @see #unsetPhase3ServiceTime()
     * @see #getPhase3ServiceTime()
     * @see #setPhase3ServiceTime(double)
     * @generated
     */
    boolean isSetPhase3ServiceTime();

    /**
     * Returns the value of the '<em><b>Phase3 Service Time Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase3 Service Time Variance</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase3 Service Time Variance</em>' attribute.
     * @see #isSetPhase3ServiceTimeVariance()
     * @see #unsetPhase3ServiceTimeVariance()
     * @see #setPhase3ServiceTimeVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase3ServiceTimeVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase3-service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase3ServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTimeVariance
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Service Time Variance</em>' attribute.
     * @see #isSetPhase3ServiceTimeVariance()
     * @see #unsetPhase3ServiceTimeVariance()
     * @see #getPhase3ServiceTimeVariance()
     * @generated
     */
    void setPhase3ServiceTimeVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTimeVariance
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isSetPhase3ServiceTimeVariance()
     * @see #getPhase3ServiceTimeVariance()
     * @see #setPhase3ServiceTimeVariance(double)
     * @generated
     */
    void unsetPhase3ServiceTimeVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTimeVariance
     * <em>Phase3 Service Time Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Phase3 Service Time Variance</em>' attribute is set.
     * @see #unsetPhase3ServiceTimeVariance()
     * @see #getPhase3ServiceTimeVariance()
     * @see #setPhase3ServiceTimeVariance(double)
     * @generated
     */
    boolean isSetPhase3ServiceTimeVariance();

    /**
     * Returns the value of the '<em><b>Phase3 Utilization</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Phase3 Utilization</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase3 Utilization</em>' attribute.
     * @see #isSetPhase3Utilization()
     * @see #unsetPhase3Utilization()
     * @see #setPhase3Utilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase3Utilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='phase3-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase3Utilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Utilization
     * <em>Phase3 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Utilization</em>' attribute.
     * @see #isSetPhase3Utilization()
     * @see #unsetPhase3Utilization()
     * @see #getPhase3Utilization()
     * @generated
     */
    void setPhase3Utilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Utilization
     * <em>Phase3 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase3Utilization()
     * @see #getPhase3Utilization()
     * @see #setPhase3Utilization(double)
     * @generated
     */
    void unsetPhase3Utilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Utilization
     * <em>Phase3 Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phase3 Utilization</em>' attribute is set.
     * @see #unsetPhase3Utilization()
     * @see #getPhase3Utilization()
     * @see #setPhase3Utilization(double)
     * @generated
     */
    boolean isSetPhase3Utilization();

    /**
     * Returns the value of the '<em><b>Phase3 Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase3 Waiting</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase3 Waiting</em>' attribute.
     * @see #isSetPhase3Waiting()
     * @see #unsetPhase3Waiting()
     * @see #setPhase3Waiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase3Waiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='phase3-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase3Waiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Waiting
     * <em>Phase3 Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Waiting</em>' attribute.
     * @see #isSetPhase3Waiting()
     * @see #unsetPhase3Waiting()
     * @see #getPhase3Waiting()
     * @generated
     */
    void setPhase3Waiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Waiting
     * <em>Phase3 Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase3Waiting()
     * @see #getPhase3Waiting()
     * @see #setPhase3Waiting(double)
     * @generated
     */
    void unsetPhase3Waiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Waiting
     * <em>Phase3 Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phase3 Waiting</em>' attribute is set.
     * @see #unsetPhase3Waiting()
     * @see #getPhase3Waiting()
     * @see #setPhase3Waiting(double)
     * @generated
     */
    boolean isSetPhase3Waiting();

    /**
     * Returns the value of the '<em><b>Phase3 Waiting Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase3 Waiting Variance</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phase3 Waiting Variance</em>' attribute.
     * @see #isSetPhase3WaitingVariance()
     * @see #unsetPhase3WaitingVariance()
     * @see #setPhase3WaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Phase3WaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='phase3-waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getPhase3WaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3WaitingVariance
     * <em>Phase3 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Waiting Variance</em>' attribute.
     * @see #isSetPhase3WaitingVariance()
     * @see #unsetPhase3WaitingVariance()
     * @see #getPhase3WaitingVariance()
     * @generated
     */
    void setPhase3WaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3WaitingVariance
     * <em>Phase3 Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetPhase3WaitingVariance()
     * @see #getPhase3WaitingVariance()
     * @see #setPhase3WaitingVariance(double)
     * @generated
     */
    void unsetPhase3WaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3WaitingVariance
     * <em>Phase3 Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Phase3 Waiting Variance</em>' attribute is set.
     * @see #unsetPhase3WaitingVariance()
     * @see #getPhase3WaitingVariance()
     * @see #setPhase3WaitingVariance(double)
     * @generated
     */
    boolean isSetPhase3WaitingVariance();

    /**
     * Returns the value of the '<em><b>Prob Exceed Max Service Time</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prob Exceed Max Service Time</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Prob Exceed Max Service Time</em>' attribute.
     * @see #isSetProbExceedMaxServiceTime()
     * @see #unsetProbExceedMaxServiceTime()
     * @see #setProbExceedMaxServiceTime(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_ProbExceedMaxServiceTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='prob-exceed-max-service-time' namespace='##targetNamespace'"
     * @generated
     */
    double getProbExceedMaxServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProbExceedMaxServiceTime
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Prob Exceed Max Service Time</em>' attribute.
     * @see #isSetProbExceedMaxServiceTime()
     * @see #unsetProbExceedMaxServiceTime()
     * @see #getProbExceedMaxServiceTime()
     * @generated
     */
    void setProbExceedMaxServiceTime(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProbExceedMaxServiceTime
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isSetProbExceedMaxServiceTime()
     * @see #getProbExceedMaxServiceTime()
     * @see #setProbExceedMaxServiceTime(double)
     * @generated
     */
    void unsetProbExceedMaxServiceTime();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProbExceedMaxServiceTime
     * <em>Prob Exceed Max Service Time</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Prob Exceed Max Service Time</em>' attribute is set.
     * @see #unsetProbExceedMaxServiceTime()
     * @see #getProbExceedMaxServiceTime()
     * @see #setProbExceedMaxServiceTime(double)
     * @generated
     */
    boolean isSetProbExceedMaxServiceTime();

    /**
     * Returns the value of the '<em><b>Proc Utilization</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Proc Utilization</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Proc Utilization</em>' attribute.
     * @see #isSetProcUtilization()
     * @see #unsetProcUtilization()
     * @see #setProcUtilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_ProcUtilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='proc-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getProcUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcUtilization
     * <em>Proc Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Proc Utilization</em>' attribute.
     * @see #isSetProcUtilization()
     * @see #unsetProcUtilization()
     * @see #getProcUtilization()
     * @generated
     */
    void setProcUtilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcUtilization
     * <em>Proc Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetProcUtilization()
     * @see #getProcUtilization()
     * @see #setProcUtilization(double)
     * @generated
     */
    void unsetProcUtilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcUtilization
     * <em>Proc Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Proc Utilization</em>' attribute is set.
     * @see #unsetProcUtilization()
     * @see #getProcUtilization()
     * @see #setProcUtilization(double)
     * @generated
     */
    boolean isSetProcUtilization();

    /**
     * Returns the value of the '<em><b>Proc Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proc Waiting</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Proc Waiting</em>' attribute.
     * @see #isSetProcWaiting()
     * @see #unsetProcWaiting()
     * @see #setProcWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_ProcWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcWaiting
     * <em>Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Proc Waiting</em>' attribute.
     * @see #isSetProcWaiting()
     * @see #unsetProcWaiting()
     * @see #getProcWaiting()
     * @generated
     */
    void setProcWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcWaiting
     * <em>Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetProcWaiting()
     * @see #getProcWaiting()
     * @see #setProcWaiting(double)
     * @generated
     */
    void unsetProcWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcWaiting
     * <em>Proc Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Proc Waiting</em>' attribute is set.
     * @see #unsetProcWaiting()
     * @see #getProcWaiting()
     * @see #setProcWaiting(double)
     * @generated
     */
    boolean isSetProcWaiting();

    /**
     * Returns the value of the '<em><b>Rwlock Reader Holding</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Reader Holding</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Reader Holding</em>' attribute.
     * @see #isSetRwlockReaderHolding()
     * @see #unsetRwlockReaderHolding()
     * @see #setRwlockReaderHolding(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockReaderHolding()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-reader-holding' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockReaderHolding();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderHolding
     * <em>Rwlock Reader Holding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Reader Holding</em>' attribute.
     * @see #isSetRwlockReaderHolding()
     * @see #unsetRwlockReaderHolding()
     * @see #getRwlockReaderHolding()
     * @generated
     */
    void setRwlockReaderHolding(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderHolding
     * <em>Rwlock Reader Holding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetRwlockReaderHolding()
     * @see #getRwlockReaderHolding()
     * @see #setRwlockReaderHolding(double)
     * @generated
     */
    void unsetRwlockReaderHolding();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderHolding
     * <em>Rwlock Reader Holding</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Rwlock Reader Holding</em>' attribute is set.
     * @see #unsetRwlockReaderHolding()
     * @see #getRwlockReaderHolding()
     * @see #setRwlockReaderHolding(double)
     * @generated
     */
    boolean isSetRwlockReaderHolding();

    /**
     * Returns the value of the '<em><b>Rwlock Reader Utilization</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Reader Utilization</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Reader Utilization</em>' attribute.
     * @see #isSetRwlockReaderUtilization()
     * @see #unsetRwlockReaderUtilization()
     * @see #setRwlockReaderUtilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockReaderUtilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-reader-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockReaderUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderUtilization
     * <em>Rwlock Reader Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Reader Utilization</em>' attribute.
     * @see #isSetRwlockReaderUtilization()
     * @see #unsetRwlockReaderUtilization()
     * @see #getRwlockReaderUtilization()
     * @generated
     */
    void setRwlockReaderUtilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderUtilization
     * <em>Rwlock Reader Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetRwlockReaderUtilization()
     * @see #getRwlockReaderUtilization()
     * @see #setRwlockReaderUtilization(double)
     * @generated
     */
    void unsetRwlockReaderUtilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderUtilization
     * <em>Rwlock Reader Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Rwlock Reader Utilization</em>' attribute is set.
     * @see #unsetRwlockReaderUtilization()
     * @see #getRwlockReaderUtilization()
     * @see #setRwlockReaderUtilization(double)
     * @generated
     */
    boolean isSetRwlockReaderUtilization();

    /**
     * Returns the value of the '<em><b>Rwlock Reader Waiting</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Reader Waiting</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Reader Waiting</em>' attribute.
     * @see #isSetRwlockReaderWaiting()
     * @see #unsetRwlockReaderWaiting()
     * @see #setRwlockReaderWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockReaderWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-reader-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockReaderWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaiting
     * <em>Rwlock Reader Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Reader Waiting</em>' attribute.
     * @see #isSetRwlockReaderWaiting()
     * @see #unsetRwlockReaderWaiting()
     * @see #getRwlockReaderWaiting()
     * @generated
     */
    void setRwlockReaderWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaiting
     * <em>Rwlock Reader Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetRwlockReaderWaiting()
     * @see #getRwlockReaderWaiting()
     * @see #setRwlockReaderWaiting(double)
     * @generated
     */
    void unsetRwlockReaderWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaiting
     * <em>Rwlock Reader Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Rwlock Reader Waiting</em>' attribute is set.
     * @see #unsetRwlockReaderWaiting()
     * @see #getRwlockReaderWaiting()
     * @see #setRwlockReaderWaiting(double)
     * @generated
     */
    boolean isSetRwlockReaderWaiting();

    /**
     * Returns the value of the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Reader Waiting Variance</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Reader Waiting Variance</em>' attribute.
     * @see #isSetRwlockReaderWaitingVariance()
     * @see #unsetRwlockReaderWaitingVariance()
     * @see #setRwlockReaderWaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockReaderWaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-reader-waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockReaderWaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaitingVariance
     * <em>Rwlock Reader Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Reader Waiting Variance</em>' attribute.
     * @see #isSetRwlockReaderWaitingVariance()
     * @see #unsetRwlockReaderWaitingVariance()
     * @see #getRwlockReaderWaitingVariance()
     * @generated
     */
    void setRwlockReaderWaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaitingVariance
     * <em>Rwlock Reader Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isSetRwlockReaderWaitingVariance()
     * @see #getRwlockReaderWaitingVariance()
     * @see #setRwlockReaderWaitingVariance(double)
     * @generated
     */
    void unsetRwlockReaderWaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaitingVariance
     * <em>Rwlock Reader Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Rwlock Reader Waiting Variance</em>' attribute is set.
     * @see #unsetRwlockReaderWaitingVariance()
     * @see #getRwlockReaderWaitingVariance()
     * @see #setRwlockReaderWaitingVariance(double)
     * @generated
     */
    boolean isSetRwlockReaderWaitingVariance();

    /**
     * Returns the value of the '<em><b>Rwlock Writer Holding</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Writer Holding</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Writer Holding</em>' attribute.
     * @see #isSetRwlockWriterHolding()
     * @see #unsetRwlockWriterHolding()
     * @see #setRwlockWriterHolding(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockWriterHolding()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-writer-holding' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockWriterHolding();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterHolding
     * <em>Rwlock Writer Holding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Writer Holding</em>' attribute.
     * @see #isSetRwlockWriterHolding()
     * @see #unsetRwlockWriterHolding()
     * @see #getRwlockWriterHolding()
     * @generated
     */
    void setRwlockWriterHolding(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterHolding
     * <em>Rwlock Writer Holding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetRwlockWriterHolding()
     * @see #getRwlockWriterHolding()
     * @see #setRwlockWriterHolding(double)
     * @generated
     */
    void unsetRwlockWriterHolding();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterHolding
     * <em>Rwlock Writer Holding</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Rwlock Writer Holding</em>' attribute is set.
     * @see #unsetRwlockWriterHolding()
     * @see #getRwlockWriterHolding()
     * @see #setRwlockWriterHolding(double)
     * @generated
     */
    boolean isSetRwlockWriterHolding();

    /**
     * Returns the value of the '<em><b>Rwlock Writer Utilization</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Writer Utilization</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Writer Utilization</em>' attribute.
     * @see #isSetRwlockWriterUtilization()
     * @see #unsetRwlockWriterUtilization()
     * @see #setRwlockWriterUtilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockWriterUtilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-writer-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockWriterUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterUtilization
     * <em>Rwlock Writer Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Writer Utilization</em>' attribute.
     * @see #isSetRwlockWriterUtilization()
     * @see #unsetRwlockWriterUtilization()
     * @see #getRwlockWriterUtilization()
     * @generated
     */
    void setRwlockWriterUtilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterUtilization
     * <em>Rwlock Writer Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetRwlockWriterUtilization()
     * @see #getRwlockWriterUtilization()
     * @see #setRwlockWriterUtilization(double)
     * @generated
     */
    void unsetRwlockWriterUtilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterUtilization
     * <em>Rwlock Writer Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Rwlock Writer Utilization</em>' attribute is set.
     * @see #unsetRwlockWriterUtilization()
     * @see #getRwlockWriterUtilization()
     * @see #setRwlockWriterUtilization(double)
     * @generated
     */
    boolean isSetRwlockWriterUtilization();

    /**
     * Returns the value of the '<em><b>Rwlock Writer Waiting</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Writer Waiting</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Writer Waiting</em>' attribute.
     * @see #isSetRwlockWriterWaiting()
     * @see #unsetRwlockWriterWaiting()
     * @see #setRwlockWriterWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockWriterWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-writer-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockWriterWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaiting
     * <em>Rwlock Writer Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Writer Waiting</em>' attribute.
     * @see #isSetRwlockWriterWaiting()
     * @see #unsetRwlockWriterWaiting()
     * @see #getRwlockWriterWaiting()
     * @generated
     */
    void setRwlockWriterWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaiting
     * <em>Rwlock Writer Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetRwlockWriterWaiting()
     * @see #getRwlockWriterWaiting()
     * @see #setRwlockWriterWaiting(double)
     * @generated
     */
    void unsetRwlockWriterWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaiting
     * <em>Rwlock Writer Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Rwlock Writer Waiting</em>' attribute is set.
     * @see #unsetRwlockWriterWaiting()
     * @see #getRwlockWriterWaiting()
     * @see #setRwlockWriterWaiting(double)
     * @generated
     */
    boolean isSetRwlockWriterWaiting();

    /**
     * Returns the value of the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rwlock Writer Waiting Variance</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rwlock Writer Waiting Variance</em>' attribute.
     * @see #isSetRwlockWriterWaitingVariance()
     * @see #unsetRwlockWriterWaitingVariance()
     * @see #setRwlockWriterWaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_RwlockWriterWaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='rwlock-writer-waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getRwlockWriterWaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaitingVariance
     * <em>Rwlock Writer Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Rwlock Writer Waiting Variance</em>' attribute.
     * @see #isSetRwlockWriterWaitingVariance()
     * @see #unsetRwlockWriterWaitingVariance()
     * @see #getRwlockWriterWaitingVariance()
     * @generated
     */
    void setRwlockWriterWaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaitingVariance
     * <em>Rwlock Writer Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isSetRwlockWriterWaitingVariance()
     * @see #getRwlockWriterWaitingVariance()
     * @see #setRwlockWriterWaitingVariance(double)
     * @generated
     */
    void unsetRwlockWriterWaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaitingVariance
     * <em>Rwlock Writer Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Rwlock Writer Waiting Variance</em>' attribute is set.
     * @see #unsetRwlockWriterWaitingVariance()
     * @see #getRwlockWriterWaitingVariance()
     * @see #setRwlockWriterWaitingVariance(double)
     * @generated
     */
    boolean isSetRwlockWriterWaitingVariance();

    /**
     * Returns the value of the '<em><b>Semaphore Utilization</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Semaphore Utilization</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Semaphore Utilization</em>' attribute.
     * @see #isSetSemaphoreUtilization()
     * @see #unsetSemaphoreUtilization()
     * @see #setSemaphoreUtilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_SemaphoreUtilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='semaphore-utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getSemaphoreUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreUtilization
     * <em>Semaphore Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Semaphore Utilization</em>' attribute.
     * @see #isSetSemaphoreUtilization()
     * @see #unsetSemaphoreUtilization()
     * @see #getSemaphoreUtilization()
     * @generated
     */
    void setSemaphoreUtilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreUtilization
     * <em>Semaphore Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetSemaphoreUtilization()
     * @see #getSemaphoreUtilization()
     * @see #setSemaphoreUtilization(double)
     * @generated
     */
    void unsetSemaphoreUtilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreUtilization
     * <em>Semaphore Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Semaphore Utilization</em>' attribute is set.
     * @see #unsetSemaphoreUtilization()
     * @see #getSemaphoreUtilization()
     * @see #setSemaphoreUtilization(double)
     * @generated
     */
    boolean isSetSemaphoreUtilization();

    /**
     * Returns the value of the '<em><b>Semaphore Waiting</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Semaphore Waiting</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Semaphore Waiting</em>' attribute.
     * @see #isSetSemaphoreWaiting()
     * @see #unsetSemaphoreWaiting()
     * @see #setSemaphoreWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_SemaphoreWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='semaphore-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getSemaphoreWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaiting
     * <em>Semaphore Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Semaphore Waiting</em>' attribute.
     * @see #isSetSemaphoreWaiting()
     * @see #unsetSemaphoreWaiting()
     * @see #getSemaphoreWaiting()
     * @generated
     */
    void setSemaphoreWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaiting
     * <em>Semaphore Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetSemaphoreWaiting()
     * @see #getSemaphoreWaiting()
     * @see #setSemaphoreWaiting(double)
     * @generated
     */
    void unsetSemaphoreWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaiting
     * <em>Semaphore Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Semaphore Waiting</em>' attribute is set.
     * @see #unsetSemaphoreWaiting()
     * @see #getSemaphoreWaiting()
     * @see #setSemaphoreWaiting(double)
     * @generated
     */
    boolean isSetSemaphoreWaiting();

    /**
     * Returns the value of the '<em><b>Semaphore Waiting Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Semaphore Waiting Variance</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Semaphore Waiting Variance</em>' attribute.
     * @see #isSetSemaphoreWaitingVariance()
     * @see #unsetSemaphoreWaitingVariance()
     * @see #setSemaphoreWaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_SemaphoreWaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='semaphore-waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getSemaphoreWaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaitingVariance
     * <em>Semaphore Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Semaphore Waiting Variance</em>' attribute.
     * @see #isSetSemaphoreWaitingVariance()
     * @see #unsetSemaphoreWaitingVariance()
     * @see #getSemaphoreWaitingVariance()
     * @generated
     */
    void setSemaphoreWaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaitingVariance
     * <em>Semaphore Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isSetSemaphoreWaitingVariance()
     * @see #getSemaphoreWaitingVariance()
     * @see #setSemaphoreWaitingVariance(double)
     * @generated
     */
    void unsetSemaphoreWaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaitingVariance
     * <em>Semaphore Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Semaphore Waiting Variance</em>' attribute is set.
     * @see #unsetSemaphoreWaitingVariance()
     * @see #getSemaphoreWaitingVariance()
     * @see #setSemaphoreWaitingVariance(double)
     * @generated
     */
    boolean isSetSemaphoreWaitingVariance();

    /**
     * Returns the value of the '<em><b>Service Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Time</em>' attribute.
     * @see #isSetServiceTime()
     * @see #unsetServiceTime()
     * @see #setServiceTime(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_ServiceTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='service-time' namespace='##targetNamespace'"
     * @generated
     */
    double getServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTime
     * <em>Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Time</em>' attribute.
     * @see #isSetServiceTime()
     * @see #unsetServiceTime()
     * @see #getServiceTime()
     * @generated
     */
    void setServiceTime(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTime
     * <em>Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetServiceTime()
     * @see #getServiceTime()
     * @see #setServiceTime(double)
     * @generated
     */
    void unsetServiceTime();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTime
     * <em>Service Time</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Service Time</em>' attribute is set.
     * @see #unsetServiceTime()
     * @see #getServiceTime()
     * @see #setServiceTime(double)
     * @generated
     */
    boolean isSetServiceTime();

    /**
     * Returns the value of the '<em><b>Service Time Variance</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Time Variance</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Time Variance</em>' attribute.
     * @see #isSetServiceTimeVariance()
     * @see #unsetServiceTimeVariance()
     * @see #setServiceTimeVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_ServiceTimeVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTimeVariance
     * <em>Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Time Variance</em>' attribute.
     * @see #isSetServiceTimeVariance()
     * @see #unsetServiceTimeVariance()
     * @see #getServiceTimeVariance()
     * @generated
     */
    void setServiceTimeVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTimeVariance
     * <em>Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetServiceTimeVariance()
     * @see #getServiceTimeVariance()
     * @see #setServiceTimeVariance(double)
     * @generated
     */
    void unsetServiceTimeVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTimeVariance
     * <em>Service Time Variance</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Service Time Variance</em>' attribute is set.
     * @see #unsetServiceTimeVariance()
     * @see #getServiceTimeVariance()
     * @see #setServiceTimeVariance(double)
     * @generated
     */
    boolean isSetServiceTimeVariance();

    /**
     * Returns the value of the '<em><b>Squared Coeff Variation</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Squared Coeff Variation</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Squared Coeff Variation</em>' attribute.
     * @see #isSetSquaredCoeffVariation()
     * @see #unsetSquaredCoeffVariation()
     * @see #setSquaredCoeffVariation(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_SquaredCoeffVariation()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" extendedMetaData=
     *        "kind='attribute' name='squared-coeff-variation' namespace='##targetNamespace'"
     * @generated
     */
    double getSquaredCoeffVariation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSquaredCoeffVariation
     * <em>Squared Coeff Variation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Squared Coeff Variation</em>' attribute.
     * @see #isSetSquaredCoeffVariation()
     * @see #unsetSquaredCoeffVariation()
     * @see #getSquaredCoeffVariation()
     * @generated
     */
    void setSquaredCoeffVariation(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSquaredCoeffVariation
     * <em>Squared Coeff Variation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetSquaredCoeffVariation()
     * @see #getSquaredCoeffVariation()
     * @see #setSquaredCoeffVariation(double)
     * @generated
     */
    void unsetSquaredCoeffVariation();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSquaredCoeffVariation
     * <em>Squared Coeff Variation</em>}' attribute is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>Squared Coeff Variation</em>' attribute is set.
     * @see #unsetSquaredCoeffVariation()
     * @see #getSquaredCoeffVariation()
     * @see #setSquaredCoeffVariation(double)
     * @generated
     */
    boolean isSetSquaredCoeffVariation();

    /**
     * Returns the value of the '<em><b>Throughput</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throughput</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Throughput</em>' attribute.
     * @see #isSetThroughput()
     * @see #unsetThroughput()
     * @see #setThroughput(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Throughput()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='throughput' namespace='##targetNamespace'"
     * @generated
     */
    double getThroughput();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughput <em>Throughput</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Throughput</em>' attribute.
     * @see #isSetThroughput()
     * @see #unsetThroughput()
     * @see #getThroughput()
     * @generated
     */
    void setThroughput(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughput <em>Throughput</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetThroughput()
     * @see #getThroughput()
     * @see #setThroughput(double)
     * @generated
     */
    void unsetThroughput();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughput <em>Throughput</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Throughput</em>' attribute is set.
     * @see #unsetThroughput()
     * @see #getThroughput()
     * @see #setThroughput(double)
     * @generated
     */
    boolean isSetThroughput();

    /**
     * Returns the value of the '<em><b>Throughput Bound</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Throughput Bound</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Throughput Bound</em>' attribute.
     * @see #isSetThroughputBound()
     * @see #unsetThroughputBound()
     * @see #setThroughputBound(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_ThroughputBound()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='throughput-bound' namespace='##targetNamespace'"
     * @generated
     */
    double getThroughputBound();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughputBound
     * <em>Throughput Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Throughput Bound</em>' attribute.
     * @see #isSetThroughputBound()
     * @see #unsetThroughputBound()
     * @see #getThroughputBound()
     * @generated
     */
    void setThroughputBound(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughputBound
     * <em>Throughput Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetThroughputBound()
     * @see #getThroughputBound()
     * @see #setThroughputBound(double)
     * @generated
     */
    void unsetThroughputBound();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughputBound
     * <em>Throughput Bound</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Throughput Bound</em>' attribute is set.
     * @see #unsetThroughputBound()
     * @see #getThroughputBound()
     * @see #setThroughputBound(double)
     * @generated
     */
    boolean isSetThroughputBound();

    /**
     * Returns the value of the '<em><b>Utilization</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Utilization</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Utilization</em>' attribute.
     * @see #isSetUtilization()
     * @see #unsetUtilization()
     * @see #setUtilization(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Utilization()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='utilization' namespace='##targetNamespace'"
     * @generated
     */
    double getUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getUtilization
     * <em>Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Utilization</em>' attribute.
     * @see #isSetUtilization()
     * @see #unsetUtilization()
     * @see #getUtilization()
     * @generated
     */
    void setUtilization(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getUtilization
     * <em>Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetUtilization()
     * @see #getUtilization()
     * @see #setUtilization(double)
     * @generated
     */
    void unsetUtilization();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getUtilization
     * <em>Utilization</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Utilization</em>' attribute is set.
     * @see #unsetUtilization()
     * @see #getUtilization()
     * @see #setUtilization(double)
     * @generated
     */
    boolean isSetUtilization();

    /**
     * Returns the value of the '<em><b>Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Waiting</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Waiting</em>' attribute.
     * @see #isSetWaiting()
     * @see #unsetWaiting()
     * @see #setWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_Waiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getWaiting();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaiting
     * <em>Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Waiting</em>' attribute.
     * @see #isSetWaiting()
     * @see #unsetWaiting()
     * @see #getWaiting()
     * @generated
     */
    void setWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaiting <em>Waiting</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetWaiting()
     * @see #getWaiting()
     * @see #setWaiting(double)
     * @generated
     */
    void unsetWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaiting <em>Waiting</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Waiting</em>' attribute is set.
     * @see #unsetWaiting()
     * @see #getWaiting()
     * @see #setWaiting(double)
     * @generated
     */
    boolean isSetWaiting();

    /**
     * Returns the value of the '<em><b>Waiting Variance</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Waiting Variance</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Waiting Variance</em>' attribute.
     * @see #isSetWaitingVariance()
     * @see #unsetWaitingVariance()
     * @see #setWaitingVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf95Type1_WaitingVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getWaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaitingVariance
     * <em>Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Waiting Variance</em>' attribute.
     * @see #isSetWaitingVariance()
     * @see #unsetWaitingVariance()
     * @see #getWaitingVariance()
     * @generated
     */
    void setWaitingVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaitingVariance
     * <em>Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetWaitingVariance()
     * @see #getWaitingVariance()
     * @see #setWaitingVariance(double)
     * @generated
     */
    void unsetWaitingVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaitingVariance
     * <em>Waiting Variance</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Waiting Variance</em>' attribute is set.
     * @see #unsetWaitingVariance()
     * @see #getWaitingVariance()
     * @see #setWaitingVariance(double)
     * @generated
     */
    boolean isSetWaitingVariance();

} // ResultConf95Type1
