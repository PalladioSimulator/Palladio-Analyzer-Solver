/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Single Activity List Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.SingleActivityListType#getActivity <em>Activity</em>}
 * </li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSingleActivityListType()
 * @model extendedMetaData="name='SingleActivityListType' kind='elementOnly'"
 * @generated
 */
public interface SingleActivityListType extends EObject {

    /**
     * Returns the value of the '<em><b>Activity</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Activity</em>' containment reference.
     * @see #setActivity(ActivityType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getSingleActivityListType_Activity()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='activity' namespace='##targetNamespace'"
     * @generated
     */
    ActivityType getActivity();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.SingleActivityListType#getActivity <em>Activity</em>}
     * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Activity</em>' containment reference.
     * @see #getActivity()
     * @generated
     */
    void setActivity(ActivityType value);

} // SingleActivityListType
