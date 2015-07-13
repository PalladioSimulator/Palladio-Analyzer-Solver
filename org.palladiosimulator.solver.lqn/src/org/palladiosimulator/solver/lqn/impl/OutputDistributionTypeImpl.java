/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputDistributionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getUnderflowBin <em>Underflow Bin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getHistogramBin <em>Histogram Bin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getOverflowBin <em>Overflow Bin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getBinSize <em>Bin Size</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getKurtosis <em>Kurtosis</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMidPoint <em>Mid Point</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getNumberBins <em>Number Bins</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getStdDev <em>Std Dev</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputDistributionTypeImpl extends MinimalEObjectImpl.Container implements OutputDistributionType {
	/**
	 * The cached value of the '{@link #getUnderflowBin() <em>Underflow Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderflowBin()
	 * @generated
	 * @ordered
	 */
	protected HistogramBinType underflowBin;

	/**
	 * The cached value of the '{@link #getHistogramBin() <em>Histogram Bin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistogramBin()
	 * @generated
	 * @ordered
	 */
	protected EList<HistogramBinType> histogramBin;

	/**
	 * The cached value of the '{@link #getOverflowBin() <em>Overflow Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflowBin()
	 * @generated
	 * @ordered
	 */
	protected HistogramBinType overflowBin;

	/**
	 * The default value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinSize()
	 * @generated
	 * @ordered
	 */
	protected static final double BIN_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinSize()
	 * @generated
	 * @ordered
	 */
	protected double binSize = BIN_SIZE_EDEFAULT;

	/**
	 * This is true if the Bin Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean binSizeESet;

	/**
	 * The default value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurtosis()
	 * @generated
	 * @ordered
	 */
	protected static final double KURTOSIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurtosis()
	 * @generated
	 * @ordered
	 */
	protected double kurtosis = KURTOSIS_EDEFAULT;

	/**
	 * This is true if the Kurtosis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kurtosisESet;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * This is true if the Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxESet;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected double mean = MEAN_EDEFAULT;

	/**
	 * This is true if the Mean attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meanESet;

	/**
	 * The default value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidPoint()
	 * @generated
	 * @ordered
	 */
	protected static final double MID_POINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidPoint()
	 * @generated
	 * @ordered
	 */
	protected double midPoint = MID_POINT_EDEFAULT;

	/**
	 * This is true if the Mid Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean midPointESet;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * This is true if the Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minESet;

	/**
	 * The default value of the '{@link #getNumberBins() <em>Number Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBins()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_BINS_EDEFAULT = new BigInteger("20");

	/**
	 * The cached value of the '{@link #getNumberBins() <em>Number Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBins()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberBins = NUMBER_BINS_EDEFAULT;

	/**
	 * This is true if the Number Bins attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberBinsESet;

	/**
	 * The default value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected static final double SKEW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected double skew = SKEW_EDEFAULT;

	/**
	 * This is true if the Skew attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean skewESet;

	/**
	 * The default value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDev()
	 * @generated
	 * @ordered
	 */
	protected static final double STD_DEV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDev()
	 * @generated
	 * @ordered
	 */
	protected double stdDev = STD_DEV_EDEFAULT;

	/**
	 * This is true if the Std Dev attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stdDevESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramBinType getUnderflowBin() {
		return underflowBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnderflowBin(HistogramBinType newUnderflowBin, NotificationChain msgs) {
		HistogramBinType oldUnderflowBin = underflowBin;
		underflowBin = newUnderflowBin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, oldUnderflowBin, newUnderflowBin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderflowBin(HistogramBinType newUnderflowBin) {
		if (newUnderflowBin != underflowBin) {
			NotificationChain msgs = null;
			if (underflowBin != null)
				msgs = ((InternalEObject)underflowBin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
			if (newUnderflowBin != null)
				msgs = ((InternalEObject)newUnderflowBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
			msgs = basicSetUnderflowBin(newUnderflowBin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, newUnderflowBin, newUnderflowBin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistogramBinType> getHistogramBin() {
		if (histogramBin == null) {
			histogramBin = new EObjectContainmentEList<HistogramBinType>(HistogramBinType.class, this, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN);
		}
		return histogramBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramBinType getOverflowBin() {
		return overflowBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverflowBin(HistogramBinType newOverflowBin, NotificationChain msgs) {
		HistogramBinType oldOverflowBin = overflowBin;
		overflowBin = newOverflowBin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, oldOverflowBin, newOverflowBin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflowBin(HistogramBinType newOverflowBin) {
		if (newOverflowBin != overflowBin) {
			NotificationChain msgs = null;
			if (overflowBin != null)
				msgs = ((InternalEObject)overflowBin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
			if (newOverflowBin != null)
				msgs = ((InternalEObject)newOverflowBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
			msgs = basicSetOverflowBin(newOverflowBin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, newOverflowBin, newOverflowBin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBinSize() {
		return binSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinSize(double newBinSize) {
		double oldBinSize = binSize;
		binSize = newBinSize;
		boolean oldBinSizeESet = binSizeESet;
		binSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE, oldBinSize, binSize, !oldBinSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBinSize() {
		double oldBinSize = binSize;
		boolean oldBinSizeESet = binSizeESet;
		binSize = BIN_SIZE_EDEFAULT;
		binSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE, oldBinSize, BIN_SIZE_EDEFAULT, oldBinSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBinSize() {
		return binSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKurtosis() {
		return kurtosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKurtosis(double newKurtosis) {
		double oldKurtosis = kurtosis;
		kurtosis = newKurtosis;
		boolean oldKurtosisESet = kurtosisESet;
		kurtosisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS, oldKurtosis, kurtosis, !oldKurtosisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKurtosis() {
		double oldKurtosis = kurtosis;
		boolean oldKurtosisESet = kurtosisESet;
		kurtosis = KURTOSIS_EDEFAULT;
		kurtosisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS, oldKurtosis, KURTOSIS_EDEFAULT, oldKurtosisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKurtosis() {
		return kurtosisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		boolean oldMaxESet = maxESet;
		maxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX, oldMax, max, !oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax() {
		double oldMax = max;
		boolean oldMaxESet = maxESet;
		max = MAX_EDEFAULT;
		maxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX, oldMax, MAX_EDEFAULT, oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return maxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(double newMean) {
		double oldMean = mean;
		mean = newMean;
		boolean oldMeanESet = meanESet;
		meanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN, oldMean, mean, !oldMeanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMean() {
		double oldMean = mean;
		boolean oldMeanESet = meanESet;
		mean = MEAN_EDEFAULT;
		meanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN, oldMean, MEAN_EDEFAULT, oldMeanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMean() {
		return meanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMidPoint() {
		return midPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidPoint(double newMidPoint) {
		double oldMidPoint = midPoint;
		midPoint = newMidPoint;
		boolean oldMidPointESet = midPointESet;
		midPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT, oldMidPoint, midPoint, !oldMidPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMidPoint() {
		double oldMidPoint = midPoint;
		boolean oldMidPointESet = midPointESet;
		midPoint = MID_POINT_EDEFAULT;
		midPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT, oldMidPoint, MID_POINT_EDEFAULT, oldMidPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMidPoint() {
		return midPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		boolean oldMinESet = minESet;
		minESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN, oldMin, min, !oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin() {
		double oldMin = min;
		boolean oldMinESet = minESet;
		min = MIN_EDEFAULT;
		minESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN, oldMin, MIN_EDEFAULT, oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return minESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberBins() {
		return numberBins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberBins(BigInteger newNumberBins) {
		BigInteger oldNumberBins = numberBins;
		numberBins = newNumberBins;
		boolean oldNumberBinsESet = numberBinsESet;
		numberBinsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS, oldNumberBins, numberBins, !oldNumberBinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberBins() {
		BigInteger oldNumberBins = numberBins;
		boolean oldNumberBinsESet = numberBinsESet;
		numberBins = NUMBER_BINS_EDEFAULT;
		numberBinsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS, oldNumberBins, NUMBER_BINS_EDEFAULT, oldNumberBinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberBins() {
		return numberBinsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSkew() {
		return skew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkew(double newSkew) {
		double oldSkew = skew;
		skew = newSkew;
		boolean oldSkewESet = skewESet;
		skewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW, oldSkew, skew, !oldSkewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSkew() {
		double oldSkew = skew;
		boolean oldSkewESet = skewESet;
		skew = SKEW_EDEFAULT;
		skewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW, oldSkew, SKEW_EDEFAULT, oldSkewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSkew() {
		return skewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStdDev() {
		return stdDev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdDev(double newStdDev) {
		double oldStdDev = stdDev;
		stdDev = newStdDev;
		boolean oldStdDevESet = stdDevESet;
		stdDevESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV, oldStdDev, stdDev, !oldStdDevESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStdDev() {
		double oldStdDev = stdDev;
		boolean oldStdDevESet = stdDevESet;
		stdDev = STD_DEV_EDEFAULT;
		stdDevESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV, oldStdDev, STD_DEV_EDEFAULT, oldStdDevESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStdDev() {
		return stdDevESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				return basicSetUnderflowBin(null, msgs);
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				return ((InternalEList<?>)getHistogramBin()).basicRemove(otherEnd, msgs);
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				return basicSetOverflowBin(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				return getUnderflowBin();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				return getHistogramBin();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				return getOverflowBin();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				return getBinSize();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				return getKurtosis();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				return getMax();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				return getMean();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				return getMidPoint();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				return getMin();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				return getNumberBins();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				return getSkew();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				return getStdDev();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				setUnderflowBin((HistogramBinType)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				getHistogramBin().clear();
				getHistogramBin().addAll((Collection<? extends HistogramBinType>)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				setOverflowBin((HistogramBinType)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				setBinSize((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				setKurtosis((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				setMax((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				setMean((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				setMidPoint((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				setMin((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				setNumberBins((BigInteger)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				setSkew((Double)newValue);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				setStdDev((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				setUnderflowBin((HistogramBinType)null);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				getHistogramBin().clear();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				setOverflowBin((HistogramBinType)null);
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				unsetBinSize();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				unsetKurtosis();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				unsetMax();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				unsetMean();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				unsetMidPoint();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				unsetMin();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				unsetNumberBins();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				unsetSkew();
				return;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				unsetStdDev();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				return underflowBin != null;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				return histogramBin != null && !histogramBin.isEmpty();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				return overflowBin != null;
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				return isSetBinSize();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				return isSetKurtosis();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				return isSetMax();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				return isSetMean();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				return isSetMidPoint();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				return isSetMin();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				return isSetNumberBins();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				return isSetSkew();
			case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				return isSetStdDev();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (binSize: ");
		if (binSizeESet) result.append(binSize); else result.append("<unset>");
		result.append(", kurtosis: ");
		if (kurtosisESet) result.append(kurtosis); else result.append("<unset>");
		result.append(", max: ");
		if (maxESet) result.append(max); else result.append("<unset>");
		result.append(", mean: ");
		if (meanESet) result.append(mean); else result.append("<unset>");
		result.append(", midPoint: ");
		if (midPointESet) result.append(midPoint); else result.append("<unset>");
		result.append(", min: ");
		if (minESet) result.append(min); else result.append("<unset>");
		result.append(", numberBins: ");
		if (numberBinsESet) result.append(numberBins); else result.append("<unset>");
		result.append(", skew: ");
		if (skewESet) result.append(skew); else result.append("<unset>");
		result.append(", stdDev: ");
		if (stdDevESet) result.append(stdDev); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutputDistributionTypeImpl
