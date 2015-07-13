/**
 */
package org.palladiosimulator.solver.lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Making Call Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.ActivityMakingCallType#getCallsMean <em>Calls Mean</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityMakingCallType()
 * @model extendedMetaData="name='ActivityMakingCallType' kind='elementOnly'"
 * @generated
 */
public interface ActivityMakingCallType extends MakingCallType {
	/**
	 * Returns the value of the '<em><b>Calls Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Mean</em>' attribute.
	 * @see #setCallsMean(Object)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityMakingCallType_CallsMean()
	 * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" required="true"
	 *        extendedMetaData="kind='attribute' name='calls-mean' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCallsMean();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ActivityMakingCallType#getCallsMean <em>Calls Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Mean</em>' attribute.
	 * @see #getCallsMean()
	 * @generated
	 */
	void setCallsMean(Object value);

} // ActivityMakingCallType
