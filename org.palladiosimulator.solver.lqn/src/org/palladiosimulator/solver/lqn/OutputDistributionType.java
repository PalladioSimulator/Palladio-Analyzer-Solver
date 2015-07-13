/**
 */
package org.palladiosimulator.solver.lqn;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getUnderflowBin <em>Underflow Bin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getHistogramBin <em>Histogram Bin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getOverflowBin <em>Overflow Bin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getBinSize <em>Bin Size</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getKurtosis <em>Kurtosis</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMax <em>Max</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMean <em>Mean</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMidPoint <em>Mid Point</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMin <em>Min</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getNumberBins <em>Number Bins</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getStdDev <em>Std Dev</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType()
 * @model extendedMetaData="name='OutputDistributionType' kind='elementOnly'"
 * @generated
 */
public interface OutputDistributionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Underflow Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underflow Bin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underflow Bin</em>' containment reference.
	 * @see #setUnderflowBin(HistogramBinType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_UnderflowBin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='underflow-bin' namespace='##targetNamespace'"
	 * @generated
	 */
	HistogramBinType getUnderflowBin();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getUnderflowBin <em>Underflow Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underflow Bin</em>' containment reference.
	 * @see #getUnderflowBin()
	 * @generated
	 */
	void setUnderflowBin(HistogramBinType value);

	/**
	 * Returns the value of the '<em><b>Histogram Bin</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.HistogramBinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Histogram Bin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Histogram Bin</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_HistogramBin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='histogram-bin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistogramBinType> getHistogramBin();

	/**
	 * Returns the value of the '<em><b>Overflow Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overflow Bin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow Bin</em>' containment reference.
	 * @see #setOverflowBin(HistogramBinType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_OverflowBin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='overflow-bin' namespace='##targetNamespace'"
	 * @generated
	 */
	HistogramBinType getOverflowBin();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getOverflowBin <em>Overflow Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow Bin</em>' containment reference.
	 * @see #getOverflowBin()
	 * @generated
	 */
	void setOverflowBin(HistogramBinType value);

	/**
	 * Returns the value of the '<em><b>Bin Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Size</em>' attribute.
	 * @see #isSetBinSize()
	 * @see #unsetBinSize()
	 * @see #setBinSize(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_BinSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='bin-size' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBinSize();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getBinSize <em>Bin Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Size</em>' attribute.
	 * @see #isSetBinSize()
	 * @see #unsetBinSize()
	 * @see #getBinSize()
	 * @generated
	 */
	void setBinSize(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getBinSize <em>Bin Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBinSize()
	 * @see #getBinSize()
	 * @see #setBinSize(double)
	 * @generated
	 */
	void unsetBinSize();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getBinSize <em>Bin Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bin Size</em>' attribute is set.
	 * @see #unsetBinSize()
	 * @see #getBinSize()
	 * @see #setBinSize(double)
	 * @generated
	 */
	boolean isSetBinSize();

	/**
	 * Returns the value of the '<em><b>Kurtosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kurtosis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kurtosis</em>' attribute.
	 * @see #isSetKurtosis()
	 * @see #unsetKurtosis()
	 * @see #setKurtosis(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_Kurtosis()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='kurtosis' namespace='##targetNamespace'"
	 * @generated
	 */
	double getKurtosis();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getKurtosis <em>Kurtosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kurtosis</em>' attribute.
	 * @see #isSetKurtosis()
	 * @see #unsetKurtosis()
	 * @see #getKurtosis()
	 * @generated
	 */
	void setKurtosis(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getKurtosis <em>Kurtosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKurtosis()
	 * @see #getKurtosis()
	 * @see #setKurtosis(double)
	 * @generated
	 */
	void unsetKurtosis();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getKurtosis <em>Kurtosis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kurtosis</em>' attribute is set.
	 * @see #unsetKurtosis()
	 * @see #getKurtosis()
	 * @see #setKurtosis(double)
	 * @generated
	 */
	boolean isSetKurtosis();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_Max()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(double)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(double)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #isSetMean()
	 * @see #unsetMean()
	 * @see #setMean(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_Mean()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='mean' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #isSetMean()
	 * @see #unsetMean()
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMean()
	 * @see #getMean()
	 * @see #setMean(double)
	 * @generated
	 */
	void unsetMean();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMean <em>Mean</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mean</em>' attribute is set.
	 * @see #unsetMean()
	 * @see #getMean()
	 * @see #setMean(double)
	 * @generated
	 */
	boolean isSetMean();

	/**
	 * Returns the value of the '<em><b>Mid Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mid Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mid Point</em>' attribute.
	 * @see #isSetMidPoint()
	 * @see #unsetMidPoint()
	 * @see #setMidPoint(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_MidPoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='mid-point' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMidPoint();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMidPoint <em>Mid Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mid Point</em>' attribute.
	 * @see #isSetMidPoint()
	 * @see #unsetMidPoint()
	 * @see #getMidPoint()
	 * @generated
	 */
	void setMidPoint(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMidPoint <em>Mid Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMidPoint()
	 * @see #getMidPoint()
	 * @see #setMidPoint(double)
	 * @generated
	 */
	void unsetMidPoint();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMidPoint <em>Mid Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mid Point</em>' attribute is set.
	 * @see #unsetMidPoint()
	 * @see #getMidPoint()
	 * @see #setMidPoint(double)
	 * @generated
	 */
	boolean isSetMidPoint();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_Min()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(double)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(double)
	 * @generated
	 */
	boolean isSetMin();

	/**
	 * Returns the value of the '<em><b>Number Bins</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Bins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Bins</em>' attribute.
	 * @see #isSetNumberBins()
	 * @see #unsetNumberBins()
	 * @see #setNumberBins(BigInteger)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_NumberBins()
	 * @model default="20" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='number-bins' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberBins();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getNumberBins <em>Number Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Bins</em>' attribute.
	 * @see #isSetNumberBins()
	 * @see #unsetNumberBins()
	 * @see #getNumberBins()
	 * @generated
	 */
	void setNumberBins(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getNumberBins <em>Number Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberBins()
	 * @see #getNumberBins()
	 * @see #setNumberBins(BigInteger)
	 * @generated
	 */
	void unsetNumberBins();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getNumberBins <em>Number Bins</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Bins</em>' attribute is set.
	 * @see #unsetNumberBins()
	 * @see #getNumberBins()
	 * @see #setNumberBins(BigInteger)
	 * @generated
	 */
	boolean isSetNumberBins();

	/**
	 * Returns the value of the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skew</em>' attribute.
	 * @see #isSetSkew()
	 * @see #unsetSkew()
	 * @see #setSkew(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_Skew()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='skew' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSkew();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getSkew <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skew</em>' attribute.
	 * @see #isSetSkew()
	 * @see #unsetSkew()
	 * @see #getSkew()
	 * @generated
	 */
	void setSkew(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getSkew <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSkew()
	 * @see #getSkew()
	 * @see #setSkew(double)
	 * @generated
	 */
	void unsetSkew();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getSkew <em>Skew</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Skew</em>' attribute is set.
	 * @see #unsetSkew()
	 * @see #getSkew()
	 * @see #setSkew(double)
	 * @generated
	 */
	boolean isSetSkew();

	/**
	 * Returns the value of the '<em><b>Std Dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std Dev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Dev</em>' attribute.
	 * @see #isSetStdDev()
	 * @see #unsetStdDev()
	 * @see #setStdDev(double)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getOutputDistributionType_StdDev()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='std-dev' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStdDev();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getStdDev <em>Std Dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Dev</em>' attribute.
	 * @see #isSetStdDev()
	 * @see #unsetStdDev()
	 * @see #getStdDev()
	 * @generated
	 */
	void setStdDev(double value);

	/**
	 * Unsets the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getStdDev <em>Std Dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStdDev()
	 * @see #getStdDev()
	 * @see #setStdDev(double)
	 * @generated
	 */
	void unsetStdDev();

	/**
	 * Returns whether the value of the '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getStdDev <em>Std Dev</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Std Dev</em>' attribute is set.
	 * @see #unsetStdDev()
	 * @see #getStdDev()
	 * @see #setStdDev(double)
	 * @generated
	 */
	boolean isSetStdDev();

} // OutputDistributionType
