/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Conf99 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinVariance <em>Join Variance</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinWaiting <em>Join Waiting</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf99Type()
 * @model extendedMetaData="name='result-conf-99_._type' kind='empty'"
 * @generated
 */
public interface ResultConf99Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Variance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Variance</em>' attribute.
	 * @see #isSetJoinVariance()
	 * @see #unsetJoinVariance()
	 * @see #setJoinVariance(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf99Type_JoinVariance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='join-variance' namespace='##targetNamespace'"
	 * @generated
	 */
	double getJoinVariance();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinVariance <em>Join Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Variance</em>' attribute.
	 * @see #isSetJoinVariance()
	 * @see #unsetJoinVariance()
	 * @see #getJoinVariance()
	 * @generated
	 */
	void setJoinVariance(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinVariance <em>Join Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJoinVariance()
	 * @see #getJoinVariance()
	 * @see #setJoinVariance(double)
	 * @generated
	 */
	void unsetJoinVariance();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinVariance <em>Join Variance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Join Variance</em>' attribute is set.
	 * @see #unsetJoinVariance()
	 * @see #getJoinVariance()
	 * @see #setJoinVariance(double)
	 * @generated
	 */
	boolean isSetJoinVariance();

	/**
	 * Returns the value of the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Waiting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Waiting</em>' attribute.
	 * @see #isSetJoinWaiting()
	 * @see #unsetJoinWaiting()
	 * @see #setJoinWaiting(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultConf99Type_JoinWaiting()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='join-waiting' namespace='##targetNamespace'"
	 * @generated
	 */
	double getJoinWaiting();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinWaiting <em>Join Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Waiting</em>' attribute.
	 * @see #isSetJoinWaiting()
	 * @see #unsetJoinWaiting()
	 * @see #getJoinWaiting()
	 * @generated
	 */
	void setJoinWaiting(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinWaiting <em>Join Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJoinWaiting()
	 * @see #getJoinWaiting()
	 * @see #setJoinWaiting(double)
	 * @generated
	 */
	void unsetJoinWaiting();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinWaiting <em>Join Waiting</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Join Waiting</em>' attribute is set.
	 * @see #unsetJoinWaiting()
	 * @see #getJoinWaiting()
	 * @see #setJoinWaiting(double)
	 * @generated
	 */
	boolean isSetJoinWaiting();

} // ResultConf99Type
