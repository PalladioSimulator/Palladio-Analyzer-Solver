/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pragma Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.PragmaType#getParam <em>Param</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.PragmaType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getPragmaType()
 * @model extendedMetaData="name='pragma_._type' kind='empty'"
 * @generated
 */
public interface PragmaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getPragmaType_Param()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.PragmaType#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getPragmaType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.PragmaType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PragmaType
