/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Solver Params Type</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getResultGeneral <em>Result General</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getPragma <em>Pragma</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getConvVal <em>Conv Val</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getItLimit <em>It Limit</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getPrintInt <em>Print Int</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.SolverParamsType#getUnderrelaxCoeff <em>Underrelax Coeff</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType()
 * @model extendedMetaData="name='solver-params_._type' kind='elementOnly'"
 * @generated
 */
public interface SolverParamsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result General</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result General</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Result General</em>' containment reference.
	 * @see #setResultGeneral(ResultGeneralType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_ResultGeneral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-general' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultGeneralType getResultGeneral();

	/**
	 * Sets the value of the '
	 * {@link org.palladiosimulator.solver.lqn.SolverParamsType#getResultGeneral
	 * <em>Result General</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Result General</em>' containment reference.
	 * @see #getResultGeneral()
	 * @generated
	 */
	void setResultGeneral(ResultGeneralType value);

	/**
	 * Returns the value of the '<em><b>Pragma</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.PragmaType}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Pragma</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pragma</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_Pragma()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pragma' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PragmaType> getPragma();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #setComment(String)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_Comment()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	void unsetComment();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getComment <em>Comment</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comment</em>' attribute is set.
	 * @see #unsetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	boolean isSetComment();

	/**
	 * Returns the value of the '<em><b>Conv Val</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conv Val</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conv Val</em>' attribute.
	 * @see #isSetConvVal()
	 * @see #unsetConvVal()
	 * @see #setConvVal(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_ConvVal()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='conv_val' namespace='##targetNamespace'"
	 * @generated
	 */
	double getConvVal();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getConvVal <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conv Val</em>' attribute.
	 * @see #isSetConvVal()
	 * @see #unsetConvVal()
	 * @see #getConvVal()
	 * @generated
	 */
	void setConvVal(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getConvVal <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetConvVal()
	 * @see #getConvVal()
	 * @see #setConvVal(double)
	 * @generated
	 */
	void unsetConvVal();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getConvVal <em>Conv Val</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conv Val</em>' attribute is set.
	 * @see #unsetConvVal()
	 * @see #getConvVal()
	 * @see #setConvVal(double)
	 * @generated
	 */
	boolean isSetConvVal();

	/**
	 * Returns the value of the '<em><b>It Limit</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>It Limit</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>It Limit</em>' attribute.
	 * @see #isSetItLimit()
	 * @see #unsetItLimit()
	 * @see #setItLimit(int)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_ItLimit()
	 * @model default="50" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='it_limit' namespace='##targetNamespace'"
	 * @generated
	 */
	int getItLimit();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getItLimit <em>It Limit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>It Limit</em>' attribute.
	 * @see #isSetItLimit()
	 * @see #unsetItLimit()
	 * @see #getItLimit()
	 * @generated
	 */
	void setItLimit(int value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getItLimit <em>It Limit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetItLimit()
	 * @see #getItLimit()
	 * @see #setItLimit(int)
	 * @generated
	 */
	void unsetItLimit();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getItLimit <em>It Limit</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>It Limit</em>' attribute is set.
	 * @see #unsetItLimit()
	 * @see #getItLimit()
	 * @see #setItLimit(int)
	 * @generated
	 */
	boolean isSetItLimit();

	/**
	 * Returns the value of the '<em><b>Print Int</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Int</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Int</em>' attribute.
	 * @see #isSetPrintInt()
	 * @see #unsetPrintInt()
	 * @see #setPrintInt(int)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_PrintInt()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='print_int' namespace='##targetNamespace'"
	 * @generated
	 */
	int getPrintInt();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getPrintInt <em>Print Int</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Int</em>' attribute.
	 * @see #isSetPrintInt()
	 * @see #unsetPrintInt()
	 * @see #getPrintInt()
	 * @generated
	 */
	void setPrintInt(int value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getPrintInt <em>Print Int</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetPrintInt()
	 * @see #getPrintInt()
	 * @see #setPrintInt(int)
	 * @generated
	 */
	void unsetPrintInt();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getPrintInt <em>Print Int</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Print Int</em>' attribute is set.
	 * @see #unsetPrintInt()
	 * @see #getPrintInt()
	 * @see #setPrintInt(int)
	 * @generated
	 */
	boolean isSetPrintInt();

	/**
	 * Returns the value of the '<em><b>Underrelax Coeff</b></em>' attribute.
	 * The default value is <code>"0.9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underrelax Coeff</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underrelax Coeff</em>' attribute.
	 * @see #isSetUnderrelaxCoeff()
	 * @see #unsetUnderrelaxCoeff()
	 * @see #setUnderrelaxCoeff(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSolverParamsType_UnderrelaxCoeff()
	 * @model default="0.9" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='underrelax_coeff' namespace='##targetNamespace'"
	 * @generated
	 */
	double getUnderrelaxCoeff();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getUnderrelaxCoeff <em>Underrelax Coeff</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underrelax Coeff</em>' attribute.
	 * @see #isSetUnderrelaxCoeff()
	 * @see #unsetUnderrelaxCoeff()
	 * @see #getUnderrelaxCoeff()
	 * @generated
	 */
	void setUnderrelaxCoeff(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getUnderrelaxCoeff <em>Underrelax Coeff</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetUnderrelaxCoeff()
	 * @see #getUnderrelaxCoeff()
	 * @see #setUnderrelaxCoeff(double)
	 * @generated
	 */
	void unsetUnderrelaxCoeff();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getUnderrelaxCoeff <em>Underrelax Coeff</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Underrelax Coeff</em>' attribute is set.
	 * @see #unsetUnderrelaxCoeff()
	 * @see #getUnderrelaxCoeff()
	 * @see #setUnderrelaxCoeff(double)
	 * @generated
	 */
	boolean isSetUnderrelaxCoeff();

} // SolverParamsType
