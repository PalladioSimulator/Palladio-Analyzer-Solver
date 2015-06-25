/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Acquire</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Acquire#getResource <em>Resource</em>}
 * </li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getAcquire()
 * @model
 * @generated
 */
public interface Acquire extends Terminal {

    /**
     * Returns the value of the '<em><b>Resource</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Resource</em>' reference.
     * @see #setResource(org.palladiosimulator.solver.resourcemodel.PassiveResource)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getAcquire_Resource()
     * @model required="true"
     * @generated
     */
    org.palladiosimulator.solver.resourcemodel.PassiveResource getResource();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Acquire#getResource
     * <em>Resource</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Resource</em>' reference.
     * @see #getResource()
     * @generated
     */
    void setResource(org.palladiosimulator.solver.resourcemodel.PassiveResource value);

} // Acquire
