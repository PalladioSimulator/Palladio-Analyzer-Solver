/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Making Call Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.MakingCallType#getResultCall <em>Result Call</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MakingCallType#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMakingCallType()
 * @model extendedMetaData="name='MakingCallType' kind='elementOnly'"
 * @generated
 */
public interface MakingCallType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Call</b></em>' containment reference list. The list
	 * contents are of type {@link org.palladiosimulator.solver.lqn.OutputResultType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Call</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Result Call</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMakingCallType_ResultCall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-call' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultType> getResultCall();

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' attribute.
	 * @see #setDest(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMakingCallType_Dest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='dest' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MakingCallType#getDest <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' attribute.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(String value);

} // MakingCallType
