/**
 */
package org.palladiosimulator.solver.spa.resourcemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.spa.resourcemodel.Resource#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.spa.resourcemodel.Resource#getNumberOfServers <em>Number Of Servers</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage#getResource_Name()
     * @model default="" required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.resourcemodel.Resource#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Number Of Servers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of Servers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number Of Servers</em>' attribute.
     * @see #setNumberOfServers(int)
     * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage#getResource_NumberOfServers()
     * @model required="true"
     * @generated
     */
    int getNumberOfServers();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.spa.resourcemodel.Resource#getNumberOfServers <em>Number Of Servers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Servers</em>' attribute.
     * @see #getNumberOfServers()
     * @generated
     */
    void setNumberOfServers(int value);

} // Resource
