/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Slot Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.SlotType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SlotType#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SlotType#getBindTarget <em>Bind Target</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SlotType#getId <em>Id</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SlotType#getReplicNum <em>Replic Num</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSlotType()
 * @model extendedMetaData="name='SlotType' kind='elementOnly'"
 * @generated
 */
public interface SlotType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(InterfaceType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSlotType_Interface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceType getInterface();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SlotType#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.BindType}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSlotType_Binding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BindType> getBinding();

	/**
	 * Returns the value of the '<em><b>Bind Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Target</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Target</em>' attribute.
	 * @see #setBindTarget(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSlotType_BindTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='bind-target' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBindTarget();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SlotType#getBindTarget <em>Bind Target</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Target</em>' attribute.
	 * @see #getBindTarget()
	 * @generated
	 */
	void setBindTarget(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSlotType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SlotType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Replic Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replic Num</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replic Num</em>' attribute.
	 * @see #isSetReplicNum()
	 * @see #unsetReplicNum()
	 * @see #setReplicNum(int)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSlotType_ReplicNum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='replic_num' namespace='##targetNamespace'"
	 * @generated
	 */
	int getReplicNum();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SlotType#getReplicNum <em>Replic Num</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replic Num</em>' attribute.
	 * @see #isSetReplicNum()
	 * @see #unsetReplicNum()
	 * @see #getReplicNum()
	 * @generated
	 */
	void setReplicNum(int value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.SlotType#getReplicNum <em>Replic Num</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetReplicNum()
	 * @see #getReplicNum()
	 * @see #setReplicNum(int)
	 * @generated
	 */
	void unsetReplicNum();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.SlotType#getReplicNum <em>Replic Num</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replic Num</em>' attribute is set.
	 * @see #unsetReplicNum()
	 * @see #getReplicNum()
	 * @see #setReplicNum(int)
	 * @generated
	 */
	boolean isSetReplicNum();

} // SlotType
