/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.ActivityType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityType()
 * @model extendedMetaData="name='ActivityType' kind='empty'"
 * @generated
 */
public interface ActivityType extends EObject {

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
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getActivityType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" extendedMetaData=
     *        "kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ActivityType#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ActivityType
