/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Option</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Option#getProbability <em>Probability</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Option#getRegexp <em>Regexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {

    /**
     * Returns the value of the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Probability</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Probability</em>' attribute.
     * @see #setProbability(double)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getOption_Probability()
     * @model
     * @generated
     */
    double getProbability();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Option#getProbability
     * <em>Probability</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Probability</em>' attribute.
     * @see #getProbability()
     * @generated
     */
    void setProbability(double value);

    /**
     * Returns the value of the '<em><b>Regexp</b></em>' containment reference. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Regexp</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Regexp</em>' containment reference.
     * @see #setRegexp(Expression)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getOption_Regexp()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getRegexp();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Option#getRegexp <em>Regexp</em>}
     * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Regexp</em>' containment reference.
     * @see #getRegexp()
     * @generated
     */
    void setRegexp(Expression value);

} // Option
