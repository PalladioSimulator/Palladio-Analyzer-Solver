/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.solver.spa.expression.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Process Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.spa.ProcessBehaviour#getNumReplicas <em>Num Replicas</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.spa.ProcessBehaviour#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.spa.ProcessBehaviour#getBehaviour <em>Behaviour</em>}
 * </li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.spa.SpaPackage#getProcessBehaviour()
 * @model
 * @generated
 */
public interface ProcessBehaviour extends EObject {

    /**
     * Returns the value of the '<em><b>Num Replicas</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Replicas</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Num Replicas</em>' attribute.
     * @see #setNumReplicas(int)
     * @see org.palladiosimulator.solver.spa.SpaPackage#getProcessBehaviour_NumReplicas()
     * @model
     * @generated
     */
    int getNumReplicas();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.spa.ProcessBehaviour#getNumReplicas <em>Num Replicas</em>
     * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Num Replicas</em>' attribute.
     * @see #getNumReplicas()
     * @generated
     */
    void setNumReplicas(int value);

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
     * @see org.palladiosimulator.solver.spa.SpaPackage#getProcessBehaviour_Name()
     * @model default=""
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.ProcessBehaviour#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Behaviour</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behaviour</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Behaviour</em>' containment reference.
     * @see #setBehaviour(Expression)
     * @see org.palladiosimulator.solver.spa.SpaPackage#getProcessBehaviour_Behaviour()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getBehaviour();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.ProcessBehaviour#getBehaviour
     * <em>Behaviour</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Behaviour</em>' containment reference.
     * @see #getBehaviour()
     * @generated
     */
    void setBehaviour(Expression value);

} // ProcessBehaviour
