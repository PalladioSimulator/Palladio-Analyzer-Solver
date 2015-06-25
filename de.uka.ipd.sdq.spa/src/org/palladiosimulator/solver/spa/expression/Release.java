/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression;

import de.uka.ipd.sdq.spa.resourcemodel.PassiveResource;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Release</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Release#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends Terminal {

    /**
     * Returns the value of the '<em><b>Resource</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Resource</em>' reference.
     * @see #setResource(PassiveResource)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getRelease_Resource()
     * @model required="true"
     * @generated
     */
    PassiveResource getResource();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Release#getResource
     * <em>Resource</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Resource</em>' reference.
     * @see #getResource()
     * @generated
     */
    void setResource(PassiveResource value);

} // Release
