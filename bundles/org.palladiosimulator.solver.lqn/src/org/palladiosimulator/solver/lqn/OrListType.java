/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Or List Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.OrListType#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOrListType()
 * @model extendedMetaData="name='OrListType' kind='elementOnly'"
 * @generated
 */
public interface OrListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list. The list
	 * contents are of type {@link org.palladiosimulator.solver.lqn.ActivityOrType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOrListType_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityOrType> getActivity();

} // OrListType
