/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Result General Type</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal <em>Conv Val</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getElapsedTime
 * <em>Elapsed Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getPlatformInfo
 * <em>Platform Info</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSolverInfo <em>Solver Info</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSystemCpuTime
 * <em>System Cpu Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getUserCpuTime
 * <em>User Cpu Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType()
 * @model extendedMetaData="name='result-general_._type' kind='empty'"
 * @generated
 */
public interface ResultGeneralType extends EObject {

    /**
     * Returns the value of the '<em><b>Conv Val</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conv Val</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Conv Val</em>' attribute.
     * @see #setConvVal(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_ConvVal()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" required="true"
     *        extendedMetaData="kind='attribute' name='conv-val' namespace='##targetNamespace'"
     * @generated
     */
    Object getConvVal();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal
     * <em>Conv Val</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Conv Val</em>' attribute.
     * @see #getConvVal()
     * @generated
     */
    void setConvVal(Object value);

    /**
     * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elapsed Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Elapsed Time</em>' attribute.
     * @see #setElapsedTime(String)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_ElapsedTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
     *        "kind='attribute' name='elapsed-time' namespace='##targetNamespace'"
     * @generated
     */
    String getElapsedTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getElapsedTime
     * <em>Elapsed Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Elapsed Time</em>' attribute.
     * @see #getElapsedTime()
     * @generated
     */
    void setElapsedTime(String value);

    /**
     * Returns the value of the '<em><b>Iterations</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iterations</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Iterations</em>' attribute.
     * @see #setIterations(Object)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_Iterations()
     * @model dataType="org.palladiosimulator.solver.lqn.SrvnFloat" extendedMetaData=
     *        "kind='attribute' name='iterations' namespace='##targetNamespace'"
     * @generated
     */
    Object getIterations();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Iterations</em>' attribute.
     * @see #getIterations()
     * @generated
     */
    void setIterations(Object value);

    /**
     * Returns the value of the '<em><b>Platform Info</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Platform Info</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Platform Info</em>' attribute.
     * @see #setPlatformInfo(String)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_PlatformInfo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
     *        "kind='attribute' name='platform-info' namespace='##targetNamespace'"
     * @generated
     */
    String getPlatformInfo();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getPlatformInfo
     * <em>Platform Info</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Platform Info</em>' attribute.
     * @see #getPlatformInfo()
     * @generated
     */
    void setPlatformInfo(String value);

    /**
     * Returns the value of the '<em><b>Solver Info</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Solver Info</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Solver Info</em>' attribute.
     * @see #setSolverInfo(String)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_SolverInfo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
     *        "kind='attribute' name='solver-info' namespace='##targetNamespace'"
     * @generated
     */
    String getSolverInfo();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSolverInfo <em>Solver Info</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Solver Info</em>' attribute.
     * @see #getSolverInfo()
     * @generated
     */
    void setSolverInfo(String value);

    /**
     * Returns the value of the '<em><b>System Cpu Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Cpu Time</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>System Cpu Time</em>' attribute.
     * @see #setSystemCpuTime(String)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_SystemCpuTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
     *        "kind='attribute' name='system-cpu-time' namespace='##targetNamespace'"
     * @generated
     */
    String getSystemCpuTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSystemCpuTime
     * <em>System Cpu Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>System Cpu Time</em>' attribute.
     * @see #getSystemCpuTime()
     * @generated
     */
    void setSystemCpuTime(String value);

    /**
     * Returns the value of the '<em><b>User Cpu Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Cpu Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>User Cpu Time</em>' attribute.
     * @see #setUserCpuTime(String)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_UserCpuTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
     *        "kind='attribute' name='user-cpu-time' namespace='##targetNamespace'"
     * @generated
     */
    String getUserCpuTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getUserCpuTime
     * <em>User Cpu Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>User Cpu Time</em>' attribute.
     * @see #getUserCpuTime()
     * @generated
     */
    void setUserCpuTime(String value);

    /**
     * Returns the value of the '<em><b>Valid</b></em>' attribute. The default value is
     * <code>"YES"</code>. The literals are from the enumeration
     * {@link org.palladiosimulator.solver.lqn.ValidType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Valid</em>' attribute.
     * @see org.palladiosimulator.solver.lqn.ValidType
     * @see #isSetValid()
     * @see #unsetValid()
     * @see #setValid(ValidType)
     * @see org.palladiosimulator.solver.lqn.lqnPackage#getResultGeneralType_Valid()
     * @model default="YES" unsettable="true" required="true" extendedMetaData=
     *        "kind='attribute' name='valid' namespace='##targetNamespace'"
     * @generated
     */
    ValidType getValid();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getValid
     * <em>Valid</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Valid</em>' attribute.
     * @see org.palladiosimulator.solver.lqn.ValidType
     * @see #isSetValid()
     * @see #unsetValid()
     * @see #getValid()
     * @generated
     */
    void setValid(ValidType value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getValid
     * <em>Valid</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetValid()
     * @see #getValid()
     * @see #setValid(ValidType)
     * @generated
     */
    void unsetValid();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getValid <em>Valid</em>}' attribute
     * is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Valid</em>' attribute is set.
     * @see #unsetValid()
     * @see #getValid()
     * @see #setValid(ValidType)
     * @generated
     */
    boolean isSetValid();

} // ResultGeneralType
