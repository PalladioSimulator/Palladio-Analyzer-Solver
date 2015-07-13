/**
 */
package org.palladiosimulator.solver.lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Loop Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.ActivityLoopType#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityLoopType()
 * @model extendedMetaData="name='ActivityLoopType' kind='empty'"
 * @generated
 */
public interface ActivityLoopType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(Object)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityLoopType_Count()
	 * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" required="true"
	 *        extendedMetaData="kind='attribute' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCount();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ActivityLoopType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Object value);

} // ActivityLoopType
