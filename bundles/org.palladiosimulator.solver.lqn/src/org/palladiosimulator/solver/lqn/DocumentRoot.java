/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.DocumentRoot#getLqnCore <em>Lqn Core</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.DocumentRoot#getLqnModel <em>Lqn Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map. The key is of type
	 * {@link java.lang.String}, and the value is of type {@link java.lang.String}, <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType=
	 *        "org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 *        transient="true" extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map. The key is of type
	 * {@link java.lang.String}, and the value is of type {@link java.lang.String}, <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType=
	 *        "org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 *        transient="true" extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Lqn Core</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lqn Core</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Lqn Core</em>' containment reference.
	 * @see #setLqnCore(LqnCoreType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getDocumentRoot_LqnCore()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lqn-core' namespace='##targetNamespace'"
	 * @generated
	 */
	LqnCoreType getLqnCore();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.DocumentRoot#getLqnCore <em>Lqn Core</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lqn Core</em>' containment reference.
	 * @see #getLqnCore()
	 * @generated
	 */
	void setLqnCore(LqnCoreType value);

	/**
	 * Returns the value of the '<em><b>Lqn Model</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lqn Model</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Lqn Model</em>' containment reference.
	 * @see #setLqnModel(LqnModelType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getDocumentRoot_LqnModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lqn-model' namespace='##targetNamespace'"
	 * @generated
	 */
	LqnModelType getLqnModel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.DocumentRoot#getLqnModel <em>Lqn Model</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lqn Model</em>' containment reference.
	 * @see #getLqnModel()
	 * @generated
	 */
	void setLqnModel(LqnModelType value);

} // DocumentRoot
