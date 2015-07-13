/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Activity Def Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getServiceTimeDistribution <em>
 * Service Time Distribution</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getResultActivity <em>Result Activity
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandCvsq <em>Host Demand
 * Cvsq</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandMean <em>Host Demand
 * Mean</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getMaxServiceTime <em>Max Service
 * Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase()
 * @model extendedMetaData="name='ActivityDefBase' kind='elementOnly'"
 * @generated
 */
public interface ActivityDefBase extends EObject {
    /**
     * Returns the value of the '<em><b>Service Time Distribution</b></em>' containment reference
     * list. The list contents are of type
     * {@link org.palladiosimulator.solver.lqn.OutputDistributionType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Time Distribution</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Time Distribution</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_ServiceTimeDistribution()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='service-time-distribution' namespace='##targetNamespace'"
     * @generated
     */
    EList<OutputDistributionType> getServiceTimeDistribution();

    /**
     * Returns the value of the '<em><b>Result Activity</b></em>' containment reference list. The
     * list contents are of type {@link org.palladiosimulator.solver.lqn.OutputResultType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Activity</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Result Activity</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_ResultActivity()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='result-activity' namespace='##targetNamespace'"
     * @generated
     */
    EList<OutputResultType> getResultActivity();

    /**
     * Returns the value of the '<em><b>Call Order</b></em>' attribute. The default value is
     * <code>"STOCHASTIC"</code>. The literals are from the enumeration
     * {@link org.palladiosimulator.solver.lqn.CallOrderType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Order</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Call Order</em>' attribute.
     * @see org.palladiosimulator.solver.lqn.CallOrderType
     * @see #isSetCallOrder()
     * @see #unsetCallOrder()
     * @see #setCallOrder(CallOrderType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_CallOrder()
     * @model default="STOCHASTIC" unsettable="true"
     *        extendedMetaData="kind='attribute' name='call-order' namespace='##targetNamespace'"
     * @generated
     */
    CallOrderType getCallOrder();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getCallOrder
     * <em>Call Order</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Call Order</em>' attribute.
     * @see org.palladiosimulator.solver.lqn.CallOrderType
     * @see #isSetCallOrder()
     * @see #unsetCallOrder()
     * @see #getCallOrder()
     * @generated
     */
    void setCallOrder(CallOrderType value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetCallOrder()
     * @see #getCallOrder()
     * @see #setCallOrder(CallOrderType)
     * @generated
     */
    void unsetCallOrder();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Call Order</em>' attribute is set.
     * @see #unsetCallOrder()
     * @see #getCallOrder()
     * @see #setCallOrder(CallOrderType)
     * @generated
     */
    boolean isSetCallOrder();

    /**
     * Returns the value of the '<em><b>Host Demand Cvsq</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Host Demand Cvsq</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Host Demand Cvsq</em>' attribute.
     * @see #setHostDemandCvsq(Object)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_HostDemandCvsq()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat"
     *        extendedMetaData="kind='attribute' name='host-demand-cvsq' namespace='##targetNamespace'"
     * @generated
     */
    Object getHostDemandCvsq();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandCvsq
     * <em>Host Demand Cvsq</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Host Demand Cvsq</em>' attribute.
     * @see #getHostDemandCvsq()
     * @generated
     */
    void setHostDemandCvsq(Object value);

    /**
     * Returns the value of the '<em><b>Host Demand Mean</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Host Demand Mean</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Host Demand Mean</em>' attribute.
     * @see #setHostDemandMean(Object)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_HostDemandMean()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" required="true"
     *        extendedMetaData=
     *        "kind='attribute' name='host-demand-mean' namespace='##targetNamespace'"
     * @generated
     */
    Object getHostDemandMean();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandMean
     * <em>Host Demand Mean</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Host Demand Mean</em>' attribute.
     * @see #getHostDemandMean()
     * @generated
     */
    void setHostDemandMean(Object value);

    /**
     * Returns the value of the '<em><b>Max Service Time</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Max Service Time</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Max Service Time</em>' attribute.
     * @see #setMaxServiceTime(Object)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_MaxServiceTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat"
     *        extendedMetaData="kind='attribute' name='max-service-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getMaxServiceTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ActivityDefBase#getMaxServiceTime
     * <em>Max Service Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Max Service Time</em>' attribute.
     * @see #getMaxServiceTime()
     * @generated
     */
    void setMaxServiceTime(Object value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Think Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Think Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Think Time</em>' attribute.
     * @see #setThinkTime(Object)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityDefBase_ThinkTime()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat"
     *        extendedMetaData="kind='attribute' name='think-time' namespace='##targetNamespace'"
     * @generated
     */
    Object getThinkTime();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getThinkTime
     * <em>Think Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Think Time</em>' attribute.
     * @see #getThinkTime()
     * @generated
     */
    void setThinkTime(Object value);

} // ActivityDefBase
