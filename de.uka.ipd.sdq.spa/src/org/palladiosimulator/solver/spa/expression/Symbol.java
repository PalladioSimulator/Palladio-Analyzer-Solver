/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.expression;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.solver.spa.resourcemodel.ResourceUsage;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Symbol</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Symbol#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.expression.Symbol#getResourceUsages <em>Resource Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends Terminal {

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. The default value is
     * <code>""</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getSymbol_Name()
     * @model default=""
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.expression.Symbol#getName <em>Name</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Resource Usages</b></em>' containment reference list. The
     * list contents are of type {@link org.palladiosimulator.solver.spa.resourcemodel.ResourceUsage}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Usages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Resource Usages</em>' containment reference list.
     * @see org.palladiosimulator.solver.spa.expression.ExpressionPackage#getSymbol_ResourceUsages()
     * @model type="org.palladiosimulator.solver.spa.resourcemodel.ResourceUsage" containment="true"
     * @generated
     */
    EList<ResourceUsage> getResourceUsages();

} // Symbol
