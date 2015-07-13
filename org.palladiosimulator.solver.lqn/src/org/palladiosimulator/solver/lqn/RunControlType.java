/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Run Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.RunControlType#getPara <em>Para</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getRunControlType()
 * @model extendedMetaData="name='run-control_._type' kind='elementOnly'"
 * @generated
 */
public interface RunControlType extends EObject {
    /**
     * Returns the value of the '<em><b>Para</b></em>' containment reference list. The list contents
     * are of type {@link org.palladiosimulator.solver.lqn.ParaType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Para</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Para</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getRunControlType_Para()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
     * @generated
     */
    EList<ParaType> getPara();

} // RunControlType
