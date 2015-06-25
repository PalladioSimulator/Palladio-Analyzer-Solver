/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Sequence</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Sequence#getLeftRegExp <em>Left Reg Exp</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Sequence#getRightRegExp <em>Right Reg Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Operation {

    /**
     * Returns the value of the '<em><b>Left Reg Exp</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left Reg Exp</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Left Reg Exp</em>' containment reference.
     * @see #setLeftRegExp(Expression)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getSequence_LeftRegExp()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getLeftRegExp();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Sequence#getLeftRegExp
     * <em>Left Reg Exp</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Left Reg Exp</em>' containment reference.
     * @see #getLeftRegExp()
     * @generated
     */
    void setLeftRegExp(Expression value);

    /**
     * Returns the value of the '<em><b>Right Reg Exp</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right Reg Exp</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Right Reg Exp</em>' containment reference.
     * @see #setRightRegExp(Expression)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getSequence_RightRegExp()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getRightRegExp();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Sequence#getRightRegExp
     * <em>Right Reg Exp</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Right Reg Exp</em>' containment reference.
     * @see #getRightRegExp()
     * @generated
     */
    void setRightRegExp(Expression value);

} // Sequence
