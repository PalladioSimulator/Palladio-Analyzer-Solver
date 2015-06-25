/**
 */
package org.palladiosimulator.solver.resourcemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Option</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.Option#getProbability <em>Probability</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.Option#getResourceUsage
 * <em>Resource Usage</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.resourcemodel.ResourceModelPackage#getOption()
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
     * @see org.palladiosimulator.solver.resourcemodel.ResourceModelPackage#getOption_Probability()
     * @model unique="false" required="true"
     * @generated
     */
    double getProbability();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.resourcemodel.Option#getProbability <em>Probability</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Probability</em>' attribute.
     * @see #getProbability()
     * @generated
     */
    void setProbability(double value);

    /**
     * Returns the value of the '<em><b>Resource Usage</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Usage</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Resource Usage</em>' containment reference.
     * @see #setResourceUsage(AbstractResourceUsage)
     * @see org.palladiosimulator.solver.resourcemodel.ResourceModelPackage#getOption_ResourceUsage()
     * @model containment="true" required="true"
     * @generated
     */
    AbstractResourceUsage getResourceUsage();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.resourcemodel.Option#getResourceUsage
     * <em>Resource Usage</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Resource Usage</em>' containment reference.
     * @see #getResourceUsage()
     * @generated
     */
    void setResourceUsage(AbstractResourceUsage value);

} // Option
