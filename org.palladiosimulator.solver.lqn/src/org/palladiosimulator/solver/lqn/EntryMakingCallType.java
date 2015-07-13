/**
 */
package org.palladiosimulator.solver.lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Making Call Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.EntryMakingCallType#getProb <em>Prob</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryMakingCallType()
 * @model extendedMetaData="name='EntryMakingCallType' kind='elementOnly'"
 * @generated
 */
public interface EntryMakingCallType extends MakingCallType {
	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(Object)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryMakingCallType_Prob()
	 * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" required="true"
	 *        extendedMetaData="kind='attribute' name='prob' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getProb();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.EntryMakingCallType#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(Object value);

} // EntryMakingCallType
