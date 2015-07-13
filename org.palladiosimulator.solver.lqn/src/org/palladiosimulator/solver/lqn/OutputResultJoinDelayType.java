/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Output Result Join Delay Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf95 <em>Result
 * Conf95</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf99 <em>Result
 * Conf99</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinVariance <em>Join
 * Variance</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinWaiting <em>Join
 * Waiting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputResultJoinDelayType()
 * @model extendedMetaData="name='OutputResultJoinDelayType' kind='elementOnly'"
 * @generated
 */
public interface OutputResultJoinDelayType extends EObject {
    /**
     * Returns the value of the '<em><b>Result Conf95</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Conf95</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Result Conf95</em>' containment reference.
     * @see #setResultConf95(ResultConf95Type)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputResultJoinDelayType_ResultConf95()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='result-conf-95' namespace='##targetNamespace'"
     * @generated
     */
    ResultConf95Type getResultConf95();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf95
     * <em>Result Conf95</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Result Conf95</em>' containment reference.
     * @see #getResultConf95()
     * @generated
     */
    void setResultConf95(ResultConf95Type value);

    /**
     * Returns the value of the '<em><b>Result Conf99</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Conf99</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Result Conf99</em>' containment reference.
     * @see #setResultConf99(ResultConf99Type)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputResultJoinDelayType_ResultConf99()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='result-conf-99' namespace='##targetNamespace'"
     * @generated
     */
    ResultConf99Type getResultConf99();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf99
     * <em>Result Conf99</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Result Conf99</em>' containment reference.
     * @see #getResultConf99()
     * @generated
     */
    void setResultConf99(ResultConf99Type value);

    /**
     * Returns the value of the '<em><b>Join Variance</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Join Variance</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Join Variance</em>' attribute.
     * @see #isSetJoinVariance()
     * @see #unsetJoinVariance()
     * @see #setJoinVariance(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputResultJoinDelayType_JoinVariance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='join-variance' namespace='##targetNamespace'"
     * @generated
     */
    double getJoinVariance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinVariance
     * <em>Join Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Join Variance</em>' attribute.
     * @see #isSetJoinVariance()
     * @see #unsetJoinVariance()
     * @see #getJoinVariance()
     * @generated
     */
    void setJoinVariance(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinVariance
     * <em>Join Variance</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetJoinVariance()
     * @see #getJoinVariance()
     * @see #setJoinVariance(double)
     * @generated
     */
    void unsetJoinVariance();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinVariance
     * <em>Join Variance</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Join Variance</em>' attribute is set.
     * @see #unsetJoinVariance()
     * @see #getJoinVariance()
     * @see #setJoinVariance(double)
     * @generated
     */
    boolean isSetJoinVariance();

    /**
     * Returns the value of the '<em><b>Join Waiting</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Join Waiting</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Join Waiting</em>' attribute.
     * @see #isSetJoinWaiting()
     * @see #unsetJoinWaiting()
     * @see #setJoinWaiting(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputResultJoinDelayType_JoinWaiting()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='join-waiting' namespace='##targetNamespace'"
     * @generated
     */
    double getJoinWaiting();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinWaiting
     * <em>Join Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Join Waiting</em>' attribute.
     * @see #isSetJoinWaiting()
     * @see #unsetJoinWaiting()
     * @see #getJoinWaiting()
     * @generated
     */
    void setJoinWaiting(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinWaiting
     * <em>Join Waiting</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetJoinWaiting()
     * @see #getJoinWaiting()
     * @see #setJoinWaiting(double)
     * @generated
     */
    void unsetJoinWaiting();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinWaiting
     * <em>Join Waiting</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Join Waiting</em>' attribute is set.
     * @see #unsetJoinWaiting()
     * @see #getJoinWaiting()
     * @see #setJoinWaiting(double)
     * @generated
     */
    boolean isSetJoinWaiting();

} // OutputResultJoinDelayType
