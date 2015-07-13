/**
 */
package org.palladiosimulator.solver.lqn;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mva Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getCore <em>Core</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getFaults <em>Faults</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStep <em>Step</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStepSquared <em>Step Squared</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getSubmodels <em>Submodels</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWait <em>Wait</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWaitSquared <em>Wait Squared</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType()
 * @model extendedMetaData="name='mva-info_._type' kind='empty'"
 * @generated
 */
public interface MvaInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' attribute.
	 * @see #setCore(BigInteger)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_Core()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='core' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCore();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getCore <em>Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' attribute.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Faults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faults</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faults</em>' attribute.
	 * @see #setFaults(BigInteger)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_Faults()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='faults' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFaults();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getFaults <em>Faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faults</em>' attribute.
	 * @see #getFaults()
	 * @generated
	 */
	void setFaults(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #setStep(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_Step()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStep()
	 * @see #getStep()
	 * @see #setStep(double)
	 * @generated
	 */
	void unsetStep();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStep <em>Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step</em>' attribute is set.
	 * @see #unsetStep()
	 * @see #getStep()
	 * @see #setStep(double)
	 * @generated
	 */
	boolean isSetStep();

	/**
	 * Returns the value of the '<em><b>Step Squared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Squared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Squared</em>' attribute.
	 * @see #isSetStepSquared()
	 * @see #unsetStepSquared()
	 * @see #setStepSquared(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_StepSquared()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='step-squared' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStepSquared();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStepSquared <em>Step Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Squared</em>' attribute.
	 * @see #isSetStepSquared()
	 * @see #unsetStepSquared()
	 * @see #getStepSquared()
	 * @generated
	 */
	void setStepSquared(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStepSquared <em>Step Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepSquared()
	 * @see #getStepSquared()
	 * @see #setStepSquared(double)
	 * @generated
	 */
	void unsetStepSquared();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStepSquared <em>Step Squared</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Squared</em>' attribute is set.
	 * @see #unsetStepSquared()
	 * @see #getStepSquared()
	 * @see #setStepSquared(double)
	 * @generated
	 */
	boolean isSetStepSquared();

	/**
	 * Returns the value of the '<em><b>Submodels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submodels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodels</em>' attribute.
	 * @see #setSubmodels(BigInteger)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_Submodels()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='submodels' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSubmodels();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getSubmodels <em>Submodels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submodels</em>' attribute.
	 * @see #getSubmodels()
	 * @generated
	 */
	void setSubmodels(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' attribute.
	 * @see #isSetWait()
	 * @see #unsetWait()
	 * @see #setWait(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_Wait()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='wait' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWait();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWait <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' attribute.
	 * @see #isSetWait()
	 * @see #unsetWait()
	 * @see #getWait()
	 * @generated
	 */
	void setWait(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWait <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWait()
	 * @see #getWait()
	 * @see #setWait(double)
	 * @generated
	 */
	void unsetWait();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWait <em>Wait</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wait</em>' attribute is set.
	 * @see #unsetWait()
	 * @see #getWait()
	 * @see #setWait(double)
	 * @generated
	 */
	boolean isSetWait();

	/**
	 * Returns the value of the '<em><b>Wait Squared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait Squared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait Squared</em>' attribute.
	 * @see #isSetWaitSquared()
	 * @see #unsetWaitSquared()
	 * @see #setWaitSquared(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getMvaInfoType_WaitSquared()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='wait-squared' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWaitSquared();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWaitSquared <em>Wait Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Squared</em>' attribute.
	 * @see #isSetWaitSquared()
	 * @see #unsetWaitSquared()
	 * @see #getWaitSquared()
	 * @generated
	 */
	void setWaitSquared(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWaitSquared <em>Wait Squared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaitSquared()
	 * @see #getWaitSquared()
	 * @see #setWaitSquared(double)
	 * @generated
	 */
	void unsetWaitSquared();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWaitSquared <em>Wait Squared</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wait Squared</em>' attribute is set.
	 * @see #unsetWaitSquared()
	 * @see #getWaitSquared()
	 * @see #setWaitSquared(double)
	 * @generated
	 */
	boolean isSetWaitSquared();

} // MvaInfoType
