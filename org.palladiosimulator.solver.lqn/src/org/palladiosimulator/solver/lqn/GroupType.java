/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Group Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.GroupType#getResultGroup <em>Result Group</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.GroupType#getTask <em>Task</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.GroupType#isCap <em>Cap</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.GroupType#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.GroupType#getShare <em>Share</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getGroupType()
 * @model extendedMetaData="name='GroupType' kind='elementOnly'"
 * @generated
 */
public interface GroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Group</b></em>' containment reference list. The list
	 * contents are of type {@link org.palladiosimulator.solver.lqn.OutputResultType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Group</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Result Group</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getGroupType_ResultGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultType> getResultGroup();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.TaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getGroupType_Task()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaskType> getTask();

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' attribute.
	 * @see #isSetCap()
	 * @see #unsetCap()
	 * @see #setCap(boolean)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getGroupType_Cap()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='cap' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCap();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.GroupType#isCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' attribute.
	 * @see #isSetCap()
	 * @see #unsetCap()
	 * @see #isCap()
	 * @generated
	 */
	void setCap(boolean value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.GroupType#isCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetCap()
	 * @see #isCap()
	 * @see #setCap(boolean)
	 * @generated
	 */
	void unsetCap();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.GroupType#isCap <em>Cap</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cap</em>' attribute is set.
	 * @see #unsetCap()
	 * @see #isCap()
	 * @see #setCap(boolean)
	 * @generated
	 */
	boolean isSetCap();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getGroupType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.GroupType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share</em>' attribute.
	 * @see #setShare(Object)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getGroupType_Share()
	 * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" required="true"
	 *        extendedMetaData="kind='attribute' name='share' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getShare();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.GroupType#getShare <em>Share</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share</em>' attribute.
	 * @see #getShare()
	 * @generated
	 */
	void setShare(Object value);

} // GroupType
