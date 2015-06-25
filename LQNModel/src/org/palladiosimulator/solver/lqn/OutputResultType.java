/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Output Result Type</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getResultConf95
 * <em>Result Conf95</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getResultConf99
 * <em>Result Conf99</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getOpenWaitTime
 * <em>Open Wait Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ProcWaiting
 * <em>Phase1 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTime
 * <em>Phase1 Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTimeVariance
 * <em>Phase1 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1Utilization
 * <em>Phase1 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ProcWaiting
 * <em>Phase2 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTime
 * <em>Phase2 Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTimeVariance
 * <em>Phase2 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2Utilization
 * <em>Phase2 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ProcWaiting
 * <em>Phase3 Proc Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTime
 * <em>Phase3 Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTimeVariance
 * <em>Phase3 Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3Utilization
 * <em>Phase3 Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getProbExceedMaxServiceTime
 * <em>Prob Exceed Max Service Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getProcUtilization
 * <em>Proc Utilization</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getProcWaiting <em>Proc Waiting</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getServiceTime <em>Service Time</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getServiceTimeVariance
 * <em>Service Time Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getSquaredCoeffVariation
 * <em>Squared Coeff Variation</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getThroughput <em>Throughput</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getThroughputBound
 * <em>Throughput Bound</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getUtilization <em>Utilization</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getWaiting <em>Waiting</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultType#getWaitingVariance
 * <em>Waiting Variance</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType()
 * @model extendedMetaData="name='OutputResultType' kind='elementOnly'"
 * @generated
 */
public interface OutputResultType extends EObject {

    /**
     * Returns the value of the '<em><b>Result Conf95</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ResultConf95Type1}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Conf95</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Result Conf95</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ResultConf95()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='result-conf-95' namespace='##targetNamespace'"
     * @generated
     */
    EList<ResultConf95Type1> getResultConf95();

    /**
     * Returns the value of the '<em><b>Result Conf99</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ResultConf99Type1}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Conf99</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Result Conf99</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ResultConf99()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='result-conf-99' namespace='##targetNamespace'"
     * @generated
     */
    EList<ResultConf99Type1> getResultConf99();

    /**
     * Returns the value of the '<em><b>Open Wait Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open Wait Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Open Wait Time</em>' attribute.
     * @see #setOpenWaitTime(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_OpenWaitTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='open-wait-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getOpenWaitTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getOpenWaitTime
     * <em>Open Wait Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Open Wait Time</em>' attribute.
     * @see #getOpenWaitTime()
     * @generated
     */
    void setOpenWaitTime(Object value);

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
     * @see #setPhase1ProcWaiting(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase1ProcWaiting()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase1-proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase1ProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ProcWaiting
     * <em>Phase1 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Proc Waiting</em>' attribute.
     * @see #getPhase1ProcWaiting()
     * @generated
     */
    void setPhase1ProcWaiting(Object value);

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
     * @see #setPhase1ServiceTime(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase1ServiceTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase1-service-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase1ServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTime
     * <em>Phase1 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Service Time</em>' attribute.
     * @see #getPhase1ServiceTime()
     * @generated
     */
    void setPhase1ServiceTime(Object value);

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
     * @see #setPhase1ServiceTimeVariance(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase1ServiceTimeVariance()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase1-service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase1ServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTimeVariance
     * <em>Phase1 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Service Time Variance</em>' attribute.
     * @see #getPhase1ServiceTimeVariance()
     * @generated
     */
    void setPhase1ServiceTimeVariance(Object value);

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
     * @see #setPhase1Utilization(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase1Utilization()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase1-utilization' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase1Utilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1Utilization
     * <em>Phase1 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase1 Utilization</em>' attribute.
     * @see #getPhase1Utilization()
     * @generated
     */
    void setPhase1Utilization(Object value);

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
     * @see #setPhase2ProcWaiting(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase2ProcWaiting()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase2-proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase2ProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ProcWaiting
     * <em>Phase2 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Proc Waiting</em>' attribute.
     * @see #getPhase2ProcWaiting()
     * @generated
     */
    void setPhase2ProcWaiting(Object value);

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
     * @see #setPhase2ServiceTime(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase2ServiceTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase2-service-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase2ServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTime
     * <em>Phase2 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Service Time</em>' attribute.
     * @see #getPhase2ServiceTime()
     * @generated
     */
    void setPhase2ServiceTime(Object value);

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
     * @see #setPhase2ServiceTimeVariance(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase2ServiceTimeVariance()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase2-service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase2ServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTimeVariance
     * <em>Phase2 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Service Time Variance</em>' attribute.
     * @see #getPhase2ServiceTimeVariance()
     * @generated
     */
    void setPhase2ServiceTimeVariance(Object value);

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
     * @see #setPhase2Utilization(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase2Utilization()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase2-utilization' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase2Utilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2Utilization
     * <em>Phase2 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase2 Utilization</em>' attribute.
     * @see #getPhase2Utilization()
     * @generated
     */
    void setPhase2Utilization(Object value);

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
     * @see #setPhase3ProcWaiting(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase3ProcWaiting()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase3-proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase3ProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ProcWaiting
     * <em>Phase3 Proc Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Proc Waiting</em>' attribute.
     * @see #getPhase3ProcWaiting()
     * @generated
     */
    void setPhase3ProcWaiting(Object value);

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
     * @see #setPhase3ServiceTime(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase3ServiceTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase3-service-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase3ServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTime
     * <em>Phase3 Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Service Time</em>' attribute.
     * @see #getPhase3ServiceTime()
     * @generated
     */
    void setPhase3ServiceTime(Object value);

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
     * @see #setPhase3ServiceTimeVariance(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase3ServiceTimeVariance()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase3-service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase3ServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTimeVariance
     * <em>Phase3 Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Service Time Variance</em>' attribute.
     * @see #getPhase3ServiceTimeVariance()
     * @generated
     */
    void setPhase3ServiceTimeVariance(Object value);

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
     * @see #setPhase3Utilization(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Phase3Utilization()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='phase3-utilization' namespace='##targetNamespace'"
     * @generated
     */
    Object getPhase3Utilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3Utilization
     * <em>Phase3 Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Phase3 Utilization</em>' attribute.
     * @see #getPhase3Utilization()
     * @generated
     */
    void setPhase3Utilization(Object value);

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
     * @see #setProbExceedMaxServiceTime(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ProbExceedMaxServiceTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='prob-exceed-max-service-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getProbExceedMaxServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getProbExceedMaxServiceTime
     * <em>Prob Exceed Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Prob Exceed Max Service Time</em>' attribute.
     * @see #getProbExceedMaxServiceTime()
     * @generated
     */
    void setProbExceedMaxServiceTime(Object value);

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
     * @see #setProcUtilization(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ProcUtilization()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='proc-utilization' namespace='##targetNamespace'"
     * @generated
     */
    Object getProcUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getProcUtilization
     * <em>Proc Utilization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Proc Utilization</em>' attribute.
     * @see #getProcUtilization()
     * @generated
     */
    void setProcUtilization(Object value);

    /**
     * Returns the value of the '<em><b>Proc Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proc Waiting</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Proc Waiting</em>' attribute.
     * @see #setProcWaiting(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ProcWaiting()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='proc-waiting' namespace='##targetNamespace'"
     * @generated
     */
    Object getProcWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getProcWaiting <em>Proc Waiting</em>
     * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Proc Waiting</em>' attribute.
     * @see #getProcWaiting()
     * @generated
     */
    void setProcWaiting(Object value);

    /**
     * Returns the value of the '<em><b>Service Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Time</em>' attribute.
     * @see #setServiceTime(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ServiceTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='service-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getServiceTime <em>Service Time</em>
     * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Time</em>' attribute.
     * @see #getServiceTime()
     * @generated
     */
    void setServiceTime(Object value);

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
     * @see #setServiceTimeVariance(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ServiceTimeVariance()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='service-time-variance' namespace='##targetNamespace'"
     * @generated
     */
    Object getServiceTimeVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getServiceTimeVariance
     * <em>Service Time Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Time Variance</em>' attribute.
     * @see #getServiceTimeVariance()
     * @generated
     */
    void setServiceTimeVariance(Object value);

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
     * @see #setSquaredCoeffVariation(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_SquaredCoeffVariation()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='squared-coeff-variation' namespace='##targetNamespace'"
     * @generated
     */
    Object getSquaredCoeffVariation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getSquaredCoeffVariation
     * <em>Squared Coeff Variation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Squared Coeff Variation</em>' attribute.
     * @see #getSquaredCoeffVariation()
     * @generated
     */
    void setSquaredCoeffVariation(Object value);

    /**
     * Returns the value of the '<em><b>Throughput</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throughput</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Throughput</em>' attribute.
     * @see #setThroughput(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Throughput()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='throughput' namespace='##targetNamespace'"
     * @generated
     */
    Object getThroughput();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputResultType#getThroughput
     * <em>Throughput</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Throughput</em>' attribute.
     * @see #getThroughput()
     * @generated
     */
    void setThroughput(Object value);

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
     * @see #setThroughputBound(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_ThroughputBound()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='throughput-bound' namespace='##targetNamespace'"
     * @generated
     */
    Object getThroughputBound();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getThroughputBound
     * <em>Throughput Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Throughput Bound</em>' attribute.
     * @see #getThroughputBound()
     * @generated
     */
    void setThroughputBound(Object value);

    /**
     * Returns the value of the '<em><b>Utilization</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Utilization</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Utilization</em>' attribute.
     * @see #setUtilization(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Utilization()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='utilization' namespace='##targetNamespace'"
     * @generated
     */
    Object getUtilization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getUtilization <em>Utilization</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Utilization</em>' attribute.
     * @see #getUtilization()
     * @generated
     */
    void setUtilization(Object value);

    /**
     * Returns the value of the '<em><b>Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Waiting</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Waiting</em>' attribute.
     * @see #setWaiting(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_Waiting()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='waiting' namespace='##targetNamespace'"
     * @generated
     */
    Object getWaiting();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputResultType#getWaiting
     * <em>Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Waiting</em>' attribute.
     * @see #getWaiting()
     * @generated
     */
    void setWaiting(Object value);

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
     * @see #setWaitingVariance(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getOutputResultType_WaitingVariance()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='waiting-variance' namespace='##targetNamespace'"
     * @generated
     */
    Object getWaitingVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultType#getWaitingVariance
     * <em>Waiting Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Waiting Variance</em>' attribute.
     * @see #getWaitingVariance()
     * @generated
     */
    void setWaitingVariance(Object value);

} // OutputResultType
