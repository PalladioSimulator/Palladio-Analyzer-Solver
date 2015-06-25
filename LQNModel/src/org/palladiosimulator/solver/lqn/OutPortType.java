/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Out Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.OutPortType#getConnectTo <em>Connect To</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutPortType#getDescription <em>Description</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.OutPortType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutPortType()
 * @model extendedMetaData="name='out-port_._type' kind='empty'"
 * @generated
 */
public interface OutPortType extends EObject {

    /**
     * Returns the value of the '<em><b>Connect To</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect To</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Connect To</em>' attribute.
     * @see #setConnectTo(List)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutPortType_ConnectTo()
     * @model dataType="org.palladiosimulator.solver.lqn.ConnectToType" many="false"
     *        extendedMetaData="kind='attribute' name='connect-to' namespace='##targetNamespace'"
     * @generated
     */
    List<String> getConnectTo();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutPortType#getConnectTo
     * <em>Connect To</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Connect To</em>' attribute.
     * @see #getConnectTo()
     * @generated
     */
    void setConnectTo(List<String> value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutPortType_Description()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
     *        "kind='attribute' name='description' namespace='##targetNamespace'"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutPortType#getDescription
     * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

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
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutPortType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" extendedMetaData=
     *        "kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutPortType#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // OutPortType
