/**
 */
package org.palladiosimulator.solver.lqn;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>And Join List Type</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.AndJoinListType#getResultJoinDelay <em>Result Join Delay</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.AndJoinListType#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.AndJoinListType#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.AndJoinListType#getQuorum <em>Quorum</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getAndJoinListType()
 * @model extendedMetaData="name='AndJoinListType' kind='elementOnly'"
 * @generated
 */
public interface AndJoinListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Join Delay</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Join Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Join Delay</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getAndJoinListType_ResultJoinDelay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-join-delay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultJoinDelayType> getResultJoinDelay();

	/**
	 * Returns the value of the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.OutputDistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Time Distribution</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time Distribution</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getAndJoinListType_ServiceTimeDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-time-distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputDistributionType> getServiceTimeDistribution();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list. The list
	 * contents are of type {@link org.palladiosimulator.solver.lqn.ActivityType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getAndJoinListType_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Quorum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quorum</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quorum</em>' attribute.
	 * @see #isSetQuorum()
	 * @see #unsetQuorum()
	 * @see #setQuorum(BigInteger)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getAndJoinListType_Quorum()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='quorum' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getQuorum();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.AndJoinListType#getQuorum <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quorum</em>' attribute.
	 * @see #isSetQuorum()
	 * @see #unsetQuorum()
	 * @see #getQuorum()
	 * @generated
	 */
	void setQuorum(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.AndJoinListType#getQuorum <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetQuorum()
	 * @see #getQuorum()
	 * @see #setQuorum(BigInteger)
	 * @generated
	 */
	void unsetQuorum();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.AndJoinListType#getQuorum <em>Quorum</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quorum</em>' attribute is set.
	 * @see #unsetQuorum()
	 * @see #getQuorum()
	 * @see #setQuorum(BigInteger)
	 * @generated
	 */
	boolean isSetQuorum();

} // AndJoinListType
