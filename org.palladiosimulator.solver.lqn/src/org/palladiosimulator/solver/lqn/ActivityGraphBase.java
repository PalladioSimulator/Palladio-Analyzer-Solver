/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Activity Graph Base</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityGraphBase#getActivity <em>Activity</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityGraphBase#getPrecedence <em>Precedence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityGraphBase()
 * @model extendedMetaData="name='ActivityGraphBase' kind='elementOnly'"
 * @generated
 */
public interface ActivityGraphBase extends EObject {

    /**
     * Returns the value of the '<em><b>Activity</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ActivityDefType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Activity</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityGraphBase_Activity()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='activity' namespace='##targetNamespace'"
     * @generated
     */
    EList<ActivityDefType> getActivity();

    /**
     * Returns the value of the '<em><b>Precedence</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.PrecedenceType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precedence</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Precedence</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityGraphBase_Precedence()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='precedence' namespace='##targetNamespace'"
     * @generated
     */
    EList<PrecedenceType> getPrecedence();

} // ActivityGraphBase
