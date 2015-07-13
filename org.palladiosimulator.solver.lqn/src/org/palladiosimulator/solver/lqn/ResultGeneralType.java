/**
 */
package org.palladiosimulator.solver.lqn;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Result General Type</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getMvaInfo <em>Mva Info</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal <em>Conv Val</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getElapsedTime <em>Elapsed Time
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getPlatformInfo <em>Platform Info
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSolverInfo <em>Solver Info</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSystemCpuTime <em>System Cpu
 * Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getUserCpuTime <em>User Cpu Time
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType()
 * @model extendedMetaData="name='result-general_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultGeneralType extends EObject {
    /**
     * Returns the value of the '<em><b>Mva Info</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mva Info</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Mva Info</em>' containment reference.
     * @see #setMvaInfo(MvaInfoType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_MvaInfo()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mva-info' namespace='##targetNamespace'"
     * @generated
     */
    MvaInfoType getMvaInfo();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getMvaInfo
     * <em>Mva Info</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Mva Info</em>' containment reference.
     * @see #getMvaInfo()
     * @generated
     */
    void setMvaInfo(MvaInfoType value);

    /**
     * Returns the value of the '<em><b>Conv Val</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conv Val</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Conv Val</em>' attribute.
     * @see #isSetConvVal()
     * @see #unsetConvVal()
     * @see #setConvVal(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_ConvVal()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
     *        extendedMetaData="kind='attribute' name='conv-val' namespace='##targetNamespace'"
     * @generated
     */
    double getConvVal();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal
     * <em>Conv Val</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Conv Val</em>' attribute.
     * @see #isSetConvVal()
     * @see #unsetConvVal()
     * @see #getConvVal()
     * @generated
     */
    void setConvVal(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal <em>Conv Val</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetConvVal()
     * @see #getConvVal()
     * @see #setConvVal(double)
     * @generated
     */
    void unsetConvVal();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal <em>Conv Val</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Conv Val</em>' attribute is set.
     * @see #unsetConvVal()
     * @see #getConvVal()
     * @see #setConvVal(double)
     * @generated
     */
    boolean isSetConvVal();

    /**
     * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elapsed Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Elapsed Time</em>' attribute.
     * @see #setElapsedTime(XMLGregorianCalendar)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_ElapsedTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
     *        extendedMetaData="kind='attribute' name='elapsed-time' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getElapsedTime();

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
    void setElapsedTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Iterations</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iterations</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Iterations</em>' attribute.
     * @see #isSetIterations()
     * @see #unsetIterations()
     * @see #setIterations(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_Iterations()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='iterations' namespace='##targetNamespace'"
     * @generated
     */
    double getIterations();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Iterations</em>' attribute.
     * @see #isSetIterations()
     * @see #unsetIterations()
     * @see #getIterations()
     * @generated
     */
    void setIterations(double value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetIterations()
     * @see #getIterations()
     * @see #setIterations(double)
     * @generated
     */
    void unsetIterations();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Iterations</em>' attribute is set.
     * @see #unsetIterations()
     * @see #getIterations()
     * @see #setIterations(double)
     * @generated
     */
    boolean isSetIterations();

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
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_PlatformInfo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='platform-info' namespace='##targetNamespace'"
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
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_SolverInfo()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='solver-info' namespace='##targetNamespace'"
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
     * @see #setSystemCpuTime(XMLGregorianCalendar)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_SystemCpuTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
     *        extendedMetaData="kind='attribute' name='system-cpu-time' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getSystemCpuTime();

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
    void setSystemCpuTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>User Cpu Time</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Cpu Time</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>User Cpu Time</em>' attribute.
     * @see #setUserCpuTime(XMLGregorianCalendar)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_UserCpuTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
     *        extendedMetaData="kind='attribute' name='user-cpu-time' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getUserCpuTime();

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
    void setUserCpuTime(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Valid</b></em>' attribute. The literals are from the
     * enumeration {@link org.palladiosimulator.solver.lqn.ValidType}. <!-- begin-user-doc -->
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
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getResultGeneralType_Valid()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='valid' namespace='##targetNamespace'"
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
