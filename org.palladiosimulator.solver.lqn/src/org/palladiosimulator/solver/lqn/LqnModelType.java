/**
 */
package org.palladiosimulator.solver.lqn;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getRunControl <em>Run Control</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getPlotControl <em>Plot Control</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getSolverParams <em>Solver Params</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getProcessor <em>Processor</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getSlot <em>Slot</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getDescription <em>Description</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getLqncoreSchemaVersion <em>Lqncore
 * Schema Version</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getLqnSchemaVersion <em>Lqn Schema
 * Version</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnModelType#getXmlDebug <em>Xml Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType()
 * @model extendedMetaData="name='LqnModelType' kind='elementOnly'"
 * @generated
 */
public interface LqnModelType extends EObject {

    /**
     * Returns the value of the '<em><b>Run Control</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run Control</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Run Control</em>' containment reference.
     * @see #setRunControl(RunControlType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_RunControl()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='run-control' namespace='##targetNamespace'"
     * @generated
     */
    RunControlType getRunControl();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getRunControl
     * <em>Run Control</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Run Control</em>' containment reference.
     * @see #getRunControl()
     * @generated
     */
    void setRunControl(RunControlType value);

    /**
     * Returns the value of the '<em><b>Plot Control</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plot Control</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Plot Control</em>' containment reference.
     * @see #setPlotControl(PlotControlType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_PlotControl()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='plot-control' namespace='##targetNamespace'"
     * @generated
     */
    PlotControlType getPlotControl();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getPlotControl
     * <em>Plot Control</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Plot Control</em>' containment reference.
     * @see #getPlotControl()
     * @generated
     */
    void setPlotControl(PlotControlType value);

    /**
     * Returns the value of the '<em><b>Solver Params</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Solver Params</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Solver Params</em>' containment reference.
     * @see #setSolverParams(SolverParamsType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_SolverParams()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='solver-params' namespace='##targetNamespace'"
     * @generated
     */
    SolverParamsType getSolverParams();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getSolverParams
     * <em>Solver Params</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Solver Params</em>' containment reference.
     * @see #getSolverParams()
     * @generated
     */
    void setSolverParams(SolverParamsType value);

    /**
     * Returns the value of the '<em><b>Processor</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ProcessorType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processor</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Processor</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_Processor()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='processor' namespace='##targetNamespace'"
     * @generated
     */
    EList<ProcessorType> getProcessor();

    /**
     * Returns the value of the '<em><b>Slot</b></em>' containment reference list. The list contents
     * are of type {@link org.palladiosimulator.solver.lqn.SlotType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Slot</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_Slot()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='slot' namespace='##targetNamespace'"
     * @generated
     */
    EList<SlotType> getSlot();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_Description()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getDescription
     * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Lqncore Schema Version</b></em>' attribute. The default
     * value is <code>"1.0"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lqncore Schema Version</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lqncore Schema Version</em>' attribute.
     * @see #isSetLqncoreSchemaVersion()
     * @see #unsetLqncoreSchemaVersion()
     * @see #setLqncoreSchemaVersion(BigDecimal)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_LqncoreSchemaVersion()
     * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData
     *        ="kind='attribute' name='lqncore-schema-version' namespace='##targetNamespace'"
     * @generated
     */
    BigDecimal getLqncoreSchemaVersion();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqncoreSchemaVersion
     * <em>Lqncore Schema Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Lqncore Schema Version</em>' attribute.
     * @see #isSetLqncoreSchemaVersion()
     * @see #unsetLqncoreSchemaVersion()
     * @see #getLqncoreSchemaVersion()
     * @generated
     */
    void setLqncoreSchemaVersion(BigDecimal value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqncoreSchemaVersion
     * <em>Lqncore Schema Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetLqncoreSchemaVersion()
     * @see #getLqncoreSchemaVersion()
     * @see #setLqncoreSchemaVersion(BigDecimal)
     * @generated
     */
    void unsetLqncoreSchemaVersion();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqncoreSchemaVersion
     * <em>Lqncore Schema Version</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return whether the value of the '<em>Lqncore Schema Version</em>' attribute is set.
     * @see #unsetLqncoreSchemaVersion()
     * @see #getLqncoreSchemaVersion()
     * @see #setLqncoreSchemaVersion(BigDecimal)
     * @generated
     */
    boolean isSetLqncoreSchemaVersion();

    /**
     * Returns the value of the '<em><b>Lqn Schema Version</b></em>' attribute. The default value is
     * <code>"1.0"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lqn Schema Version</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lqn Schema Version</em>' attribute.
     * @see #isSetLqnSchemaVersion()
     * @see #unsetLqnSchemaVersion()
     * @see #setLqnSchemaVersion(BigDecimal)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_LqnSchemaVersion()
     * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData
     *        ="kind='attribute' name='lqn-schema-version' namespace='##targetNamespace'"
     * @generated
     */
    BigDecimal getLqnSchemaVersion();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqnSchemaVersion
     * <em>Lqn Schema Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Lqn Schema Version</em>' attribute.
     * @see #isSetLqnSchemaVersion()
     * @see #unsetLqnSchemaVersion()
     * @see #getLqnSchemaVersion()
     * @generated
     */
    void setLqnSchemaVersion(BigDecimal value);

    /**
     * Unsets the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqnSchemaVersion
     * <em>Lqn Schema Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetLqnSchemaVersion()
     * @see #getLqnSchemaVersion()
     * @see #setLqnSchemaVersion(BigDecimal)
     * @generated
     */
    void unsetLqnSchemaVersion();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqnSchemaVersion
     * <em>Lqn Schema Version</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Lqn Schema Version</em>' attribute is set.
     * @see #unsetLqnSchemaVersion()
     * @see #getLqnSchemaVersion()
     * @see #setLqnSchemaVersion(BigDecimal)
     * @generated
     */
    boolean isSetLqnSchemaVersion();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Xml Debug</b></em>' attribute. The default value is
     * <code>"true"</code>. The literals are from the enumeration
     * {@link org.palladiosimulator.solver.lqn.XmlDebugType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xml Debug</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Xml Debug</em>' attribute.
     * @see org.palladiosimulator.solver.lqn.XmlDebugType
     * @see #isSetXmlDebug()
     * @see #unsetXmlDebug()
     * @see #setXmlDebug(XmlDebugType)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnModelType_XmlDebug()
     * @model default="true" unsettable="true"
     *        extendedMetaData="kind='attribute' name='xml-debug' namespace='##targetNamespace'"
     * @generated
     */
    XmlDebugType getXmlDebug();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getXmlDebug
     * <em>Xml Debug</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Xml Debug</em>' attribute.
     * @see org.palladiosimulator.solver.lqn.XmlDebugType
     * @see #isSetXmlDebug()
     * @see #unsetXmlDebug()
     * @see #getXmlDebug()
     * @generated
     */
    void setXmlDebug(XmlDebugType value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.LqnModelType#getXmlDebug
     * <em>Xml Debug</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetXmlDebug()
     * @see #getXmlDebug()
     * @see #setXmlDebug(XmlDebugType)
     * @generated
     */
    void unsetXmlDebug();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.LqnModelType#getXmlDebug <em>Xml Debug</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Xml Debug</em>' attribute is set.
     * @see #unsetXmlDebug()
     * @see #getXmlDebug()
     * @see #setXmlDebug(XmlDebugType)
     * @generated
     */
    boolean isSetXmlDebug();

} // LqnModelType
