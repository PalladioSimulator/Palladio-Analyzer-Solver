/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Histogram Bin Type</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.HistogramBinType#getBegin <em>Begin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf95 <em>Conf95</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf99 <em>Conf99</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.HistogramBinType#getEnd <em>End</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.HistogramBinType#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getHistogramBinType()
 * @model extendedMetaData="name='HistogramBinType' kind='empty'"
 * @generated
 */
public interface HistogramBinType extends EObject {
    /**
     * Returns the value of the '<em><b>Begin</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Begin</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Begin</em>' attribute.
     * @see #isSetBegin()
     * @see #unsetBegin()
     * @see #setBegin(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getHistogramBinType_Begin()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
     *        extendedMetaData="kind='attribute' name='begin' namespace='##targetNamespace'"
     * @generated
     */
    double getBegin();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getBegin
     * <em>Begin</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Begin</em>' attribute.
     * @see #isSetBegin()
     * @see #unsetBegin()
     * @see #getBegin()
     * @generated
     */
    void setBegin(double value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getBegin
     * <em>Begin</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetBegin()
     * @see #getBegin()
     * @see #setBegin(double)
     * @generated
     */
    void unsetBegin();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getBegin <em>Begin</em>}' attribute
     * is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Begin</em>' attribute is set.
     * @see #unsetBegin()
     * @see #getBegin()
     * @see #setBegin(double)
     * @generated
     */
    boolean isSetBegin();

    /**
     * Returns the value of the '<em><b>Conf95</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf95</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Conf95</em>' attribute.
     * @see #isSetConf95()
     * @see #unsetConf95()
     * @see #setConf95(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getHistogramBinType_Conf95()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='conf-95' namespace='##targetNamespace'"
     * @generated
     */
    double getConf95();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf95
     * <em>Conf95</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Conf95</em>' attribute.
     * @see #isSetConf95()
     * @see #unsetConf95()
     * @see #getConf95()
     * @generated
     */
    void setConf95(double value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf95
     * <em>Conf95</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetConf95()
     * @see #getConf95()
     * @see #setConf95(double)
     * @generated
     */
    void unsetConf95();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf95 <em>Conf95</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Conf95</em>' attribute is set.
     * @see #unsetConf95()
     * @see #getConf95()
     * @see #setConf95(double)
     * @generated
     */
    boolean isSetConf95();

    /**
     * Returns the value of the '<em><b>Conf99</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf99</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Conf99</em>' attribute.
     * @see #isSetConf99()
     * @see #unsetConf99()
     * @see #setConf99(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getHistogramBinType_Conf99()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='conf-99' namespace='##targetNamespace'"
     * @generated
     */
    double getConf99();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf99
     * <em>Conf99</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Conf99</em>' attribute.
     * @see #isSetConf99()
     * @see #unsetConf99()
     * @see #getConf99()
     * @generated
     */
    void setConf99(double value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf99
     * <em>Conf99</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetConf99()
     * @see #getConf99()
     * @see #setConf99(double)
     * @generated
     */
    void unsetConf99();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf99 <em>Conf99</em>}'
     * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Conf99</em>' attribute is set.
     * @see #unsetConf99()
     * @see #getConf99()
     * @see #setConf99(double)
     * @generated
     */
    boolean isSetConf99();

    /**
     * Returns the value of the '<em><b>End</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>End</em>' attribute.
     * @see #isSetEnd()
     * @see #unsetEnd()
     * @see #setEnd(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getHistogramBinType_End()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='end' namespace='##targetNamespace'"
     * @generated
     */
    double getEnd();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getEnd
     * <em>End</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>End</em>' attribute.
     * @see #isSetEnd()
     * @see #unsetEnd()
     * @see #getEnd()
     * @generated
     */
    void setEnd(double value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getEnd
     * <em>End</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetEnd()
     * @see #getEnd()
     * @see #setEnd(double)
     * @generated
     */
    void unsetEnd();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getEnd <em>End</em>}' attribute is
     * set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>End</em>' attribute is set.
     * @see #unsetEnd()
     * @see #getEnd()
     * @see #setEnd(double)
     * @generated
     */
    boolean isSetEnd();

    /**
     * Returns the value of the '<em><b>Prob</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prob</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Prob</em>' attribute.
     * @see #isSetProb()
     * @see #unsetProb()
     * @see #setProb(double)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getHistogramBinType_Prob()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
     *        extendedMetaData="kind='attribute' name='prob' namespace='##targetNamespace'"
     * @generated
     */
    double getProb();

    /**
     * Sets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getProb
     * <em>Prob</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Prob</em>' attribute.
     * @see #isSetProb()
     * @see #unsetProb()
     * @see #getProb()
     * @generated
     */
    void setProb(double value);

    /**
     * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.HistogramBinType#getProb
     * <em>Prob</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isSetProb()
     * @see #getProb()
     * @see #setProb(double)
     * @generated
     */
    void unsetProb();

    /**
     * Returns whether the value of the '
     * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getProb <em>Prob</em>}' attribute is
     * set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Prob</em>' attribute is set.
     * @see #unsetProb()
     * @see #getProb()
     * @see #setProb(double)
     * @generated
     */
    boolean isSetProb();

} // HistogramBinType
