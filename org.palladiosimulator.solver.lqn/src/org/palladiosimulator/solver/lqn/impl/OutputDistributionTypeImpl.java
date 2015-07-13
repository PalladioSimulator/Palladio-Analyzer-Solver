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
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Output Distribution Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getUnderflowBin <em>
 * Underflow Bin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getHistogramBin <em>
 * Histogram Bin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getOverflowBin <em>
 * Overflow Bin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getBinSize <em>Bin
 * Size</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getKurtosis <em>
 * Kurtosis</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMax <em>Max</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMean <em>Mean
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMidPoint <em>Mid
 * Point</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMin <em>Min</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getNumberBins <em>
 * Number Bins</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getSkew <em>Skew
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getStdDev <em>Std Dev
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDistributionTypeImpl extends MinimalEObjectImpl.Container implements OutputDistributionType {
    /**
     * The cached value of the '{@link #getUnderflowBin() <em>Underflow Bin</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUnderflowBin()
     * @generated
     * @ordered
     */
    protected HistogramBinType underflowBin;

    /**
     * The cached value of the '{@link #getHistogramBin() <em>Histogram Bin</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHistogramBin()
     * @generated
     * @ordered
     */
    protected EList<HistogramBinType> histogramBin;

    /**
     * The cached value of the '{@link #getOverflowBin() <em>Overflow Bin</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOverflowBin()
     * @generated
     * @ordered
     */
    protected HistogramBinType overflowBin;

    /**
     * The default value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBinSize()
     * @generated
     * @ordered
     */
    protected static final double BIN_SIZE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBinSize()
     * @generated
     * @ordered
     */
    protected double binSize = BIN_SIZE_EDEFAULT;

    /**
     * This is true if the Bin Size attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean binSizeESet;

    /**
     * The default value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getKurtosis()
     * @generated
     * @ordered
     */
    protected static final double KURTOSIS_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getKurtosis()
     * @generated
     * @ordered
     */
    protected double kurtosis = KURTOSIS_EDEFAULT;

    /**
     * This is true if the Kurtosis attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean kurtosisESet;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final double MAX_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected double max = MAX_EDEFAULT;

    /**
     * This is true if the Max attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean maxESet;

    /**
     * The default value of the '{@link #getMean() <em>Mean</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected static final double MEAN_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected double mean = MEAN_EDEFAULT;

    /**
     * This is true if the Mean attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean meanESet;

    /**
     * The default value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMidPoint()
     * @generated
     * @ordered
     */
    protected static final double MID_POINT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMidPoint()
     * @generated
     * @ordered
     */
    protected double midPoint = MID_POINT_EDEFAULT;

    /**
     * This is true if the Mid Point attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean midPointESet;

    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected static final double MIN_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected double min = MIN_EDEFAULT;

    /**
     * This is true if the Min attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean minESet;

    /**
     * The default value of the '{@link #getNumberBins() <em>Number Bins</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberBins()
     * @generated
     * @ordered
     */
    protected static final BigInteger NUMBER_BINS_EDEFAULT = new BigInteger("20");

    /**
     * The cached value of the '{@link #getNumberBins() <em>Number Bins</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberBins()
     * @generated
     * @ordered
     */
    protected BigInteger numberBins = NUMBER_BINS_EDEFAULT;

    /**
     * This is true if the Number Bins attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean numberBinsESet;

    /**
     * The default value of the '{@link #getSkew() <em>Skew</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getSkew()
     * @generated
     * @ordered
     */
    protected static final double SKEW_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSkew()
     * @generated
     * @ordered
     */
    protected double skew = SKEW_EDEFAULT;

    /**
     * This is true if the Skew attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean skewESet;

    /**
     * The default value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStdDev()
     * @generated
     * @ordered
     */
    protected static final double STD_DEV_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStdDev()
     * @generated
     * @ordered
     */
    protected double stdDev = STD_DEV_EDEFAULT;

    /**
     * This is true if the Std Dev attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean stdDevESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OutputDistributionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.OUTPUT_DISTRIBUTION_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public HistogramBinType getUnderflowBin() {
        return this.underflowBin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUnderflowBin(final HistogramBinType newUnderflowBin, NotificationChain msgs) {
        final HistogramBinType oldUnderflowBin = this.underflowBin;
        this.underflowBin = newUnderflowBin;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, oldUnderflowBin, newUnderflowBin);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUnderflowBin(final HistogramBinType newUnderflowBin) {
        if (newUnderflowBin != this.underflowBin)
        {
            NotificationChain msgs = null;
            if (this.underflowBin != null) {
                msgs = ((InternalEObject) this.underflowBin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
            }
            if (newUnderflowBin != null) {
                msgs = ((InternalEObject) newUnderflowBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
            }
            msgs = this.basicSetUnderflowBin(newUnderflowBin, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN,
                    newUnderflowBin, newUnderflowBin));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<HistogramBinType> getHistogramBin() {
        if (this.histogramBin == null)
        {
            this.histogramBin = new EObjectContainmentEList<HistogramBinType>(HistogramBinType.class, this,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN);
        }
        return this.histogramBin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public HistogramBinType getOverflowBin() {
        return this.overflowBin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetOverflowBin(final HistogramBinType newOverflowBin, NotificationChain msgs) {
        final HistogramBinType oldOverflowBin = this.overflowBin;
        this.overflowBin = newOverflowBin;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, oldOverflowBin, newOverflowBin);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOverflowBin(final HistogramBinType newOverflowBin) {
        if (newOverflowBin != this.overflowBin)
        {
            NotificationChain msgs = null;
            if (this.overflowBin != null) {
                msgs = ((InternalEObject) this.overflowBin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
            }
            if (newOverflowBin != null) {
                msgs = ((InternalEObject) newOverflowBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
            }
            msgs = this.basicSetOverflowBin(newOverflowBin, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN,
                    newOverflowBin, newOverflowBin));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getBinSize() {
        return this.binSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBinSize(final double newBinSize) {
        final double oldBinSize = this.binSize;
        this.binSize = newBinSize;
        final boolean oldBinSizeESet = this.binSizeESet;
        this.binSizeESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE,
                    oldBinSize, this.binSize, !oldBinSizeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetBinSize() {
        final double oldBinSize = this.binSize;
        final boolean oldBinSizeESet = this.binSizeESet;
        this.binSize = BIN_SIZE_EDEFAULT;
        this.binSizeESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE,
                    oldBinSize, BIN_SIZE_EDEFAULT, oldBinSizeESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetBinSize() {
        return this.binSizeESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getKurtosis() {
        return this.kurtosis;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setKurtosis(final double newKurtosis) {
        final double oldKurtosis = this.kurtosis;
        this.kurtosis = newKurtosis;
        final boolean oldKurtosisESet = this.kurtosisESet;
        this.kurtosisESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS,
                    oldKurtosis, this.kurtosis, !oldKurtosisESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetKurtosis() {
        final double oldKurtosis = this.kurtosis;
        final boolean oldKurtosisESet = this.kurtosisESet;
        this.kurtosis = KURTOSIS_EDEFAULT;
        this.kurtosisESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS,
                    oldKurtosis, KURTOSIS_EDEFAULT, oldKurtosisESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetKurtosis() {
        return this.kurtosisESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMax() {
        return this.max;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMax(final double newMax) {
        final double oldMax = this.max;
        this.max = newMax;
        final boolean oldMaxESet = this.maxESet;
        this.maxESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX,
                    oldMax,
                    this.max, !oldMaxESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetMax() {
        final double oldMax = this.max;
        final boolean oldMaxESet = this.maxESet;
        this.max = MAX_EDEFAULT;
        this.maxESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX,
                    oldMax,
                    MAX_EDEFAULT, oldMaxESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetMax() {
        return this.maxESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMean() {
        return this.mean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMean(final double newMean) {
        final double oldMean = this.mean;
        this.mean = newMean;
        final boolean oldMeanESet = this.meanESet;
        this.meanESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN,
                    oldMean,
                    this.mean, !oldMeanESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetMean() {
        final double oldMean = this.mean;
        final boolean oldMeanESet = this.meanESet;
        this.mean = MEAN_EDEFAULT;
        this.meanESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN,
                    oldMean,
                    MEAN_EDEFAULT, oldMeanESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetMean() {
        return this.meanESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMidPoint() {
        return this.midPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMidPoint(final double newMidPoint) {
        final double oldMidPoint = this.midPoint;
        this.midPoint = newMidPoint;
        final boolean oldMidPointESet = this.midPointESet;
        this.midPointESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT,
                    oldMidPoint, this.midPoint, !oldMidPointESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetMidPoint() {
        final double oldMidPoint = this.midPoint;
        final boolean oldMidPointESet = this.midPointESet;
        this.midPoint = MID_POINT_EDEFAULT;
        this.midPointESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT,
                    oldMidPoint, MID_POINT_EDEFAULT, oldMidPointESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetMidPoint() {
        return this.midPointESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMin() {
        return this.min;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMin(final double newMin) {
        final double oldMin = this.min;
        this.min = newMin;
        final boolean oldMinESet = this.minESet;
        this.minESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN,
                    oldMin,
                    this.min, !oldMinESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetMin() {
        final double oldMin = this.min;
        final boolean oldMinESet = this.minESet;
        this.min = MIN_EDEFAULT;
        this.minESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN,
                    oldMin,
                    MIN_EDEFAULT, oldMinESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetMin() {
        return this.minESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigInteger getNumberBins() {
        return this.numberBins;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNumberBins(final BigInteger newNumberBins) {
        final BigInteger oldNumberBins = this.numberBins;
        this.numberBins = newNumberBins;
        final boolean oldNumberBinsESet = this.numberBinsESet;
        this.numberBinsESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS,
                    oldNumberBins, this.numberBins, !oldNumberBinsESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetNumberBins() {
        final BigInteger oldNumberBins = this.numberBins;
        final boolean oldNumberBinsESet = this.numberBinsESet;
        this.numberBins = NUMBER_BINS_EDEFAULT;
        this.numberBinsESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS,
                    oldNumberBins, NUMBER_BINS_EDEFAULT, oldNumberBinsESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetNumberBins() {
        return this.numberBinsESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getSkew() {
        return this.skew;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSkew(final double newSkew) {
        final double oldSkew = this.skew;
        this.skew = newSkew;
        final boolean oldSkewESet = this.skewESet;
        this.skewESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW,
                    oldSkew,
                    this.skew, !oldSkewESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetSkew() {
        final double oldSkew = this.skew;
        final boolean oldSkewESet = this.skewESet;
        this.skew = SKEW_EDEFAULT;
        this.skewESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW,
                    oldSkew,
                    SKEW_EDEFAULT, oldSkewESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetSkew() {
        return this.skewESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getStdDev() {
        return this.stdDev;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStdDev(final double newStdDev) {
        final double oldStdDev = this.stdDev;
        this.stdDev = newStdDev;
        final boolean oldStdDevESet = this.stdDevESet;
        this.stdDevESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV,
                    oldStdDev, this.stdDev, !oldStdDevESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetStdDev() {
        final double oldStdDev = this.stdDev;
        final boolean oldStdDevESet = this.stdDevESet;
        this.stdDev = STD_DEV_EDEFAULT;
        this.stdDevESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV,
                    oldStdDev, STD_DEV_EDEFAULT, oldStdDevESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetStdDev() {
        return this.stdDevESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
            return this.basicSetUnderflowBin(null, msgs);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
            return ((InternalEList<?>) this.getHistogramBin()).basicRemove(otherEnd, msgs);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
            return this.basicSetOverflowBin(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
            return this.getUnderflowBin();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
            return this.getHistogramBin();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
            return this.getOverflowBin();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
            return this.getBinSize();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            return this.getKurtosis();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            return this.getMax();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            return this.getMean();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            return this.getMidPoint();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            return this.getMin();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            return this.getNumberBins();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            return this.getSkew();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            return this.getStdDev();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
            this.setUnderflowBin((HistogramBinType) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
            this.getHistogramBin().clear();
            this.getHistogramBin().addAll((Collection<? extends HistogramBinType>) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
            this.setOverflowBin((HistogramBinType) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
            this.setBinSize((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            this.setKurtosis((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            this.setMax((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            this.setMean((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            this.setMidPoint((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            this.setMin((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            this.setNumberBins((BigInteger) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            this.setSkew((Double) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            this.setStdDev((Double) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
            this.setUnderflowBin((HistogramBinType) null);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
            this.getHistogramBin().clear();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
            this.setOverflowBin((HistogramBinType) null);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
            this.unsetBinSize();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            this.unsetKurtosis();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            this.unsetMax();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            this.unsetMean();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            this.unsetMidPoint();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            this.unsetMin();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            this.unsetNumberBins();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            this.unsetSkew();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            this.unsetStdDev();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
            return this.underflowBin != null;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
            return this.histogramBin != null && !this.histogramBin.isEmpty();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
            return this.overflowBin != null;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
            return this.isSetBinSize();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            return this.isSetKurtosis();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            return this.isSetMax();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            return this.isSetMean();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            return this.isSetMidPoint();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            return this.isSetMin();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            return this.isSetNumberBins();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            return this.isSetSkew();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            return this.isSetStdDev();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (binSize: ");
        if (this.binSizeESet) {
            result.append(this.binSize);
        } else {
            result.append("<unset>");
        }
        result.append(", kurtosis: ");
        if (this.kurtosisESet) {
            result.append(this.kurtosis);
        } else {
            result.append("<unset>");
        }
        result.append(", max: ");
        if (this.maxESet) {
            result.append(this.max);
        } else {
            result.append("<unset>");
        }
        result.append(", mean: ");
        if (this.meanESet) {
            result.append(this.mean);
        } else {
            result.append("<unset>");
        }
        result.append(", midPoint: ");
        if (this.midPointESet) {
            result.append(this.midPoint);
        } else {
            result.append("<unset>");
        }
        result.append(", min: ");
        if (this.minESet) {
            result.append(this.min);
        } else {
            result.append("<unset>");
        }
        result.append(", numberBins: ");
        if (this.numberBinsESet) {
            result.append(this.numberBins);
        } else {
            result.append("<unset>");
        }
        result.append(", skew: ");
        if (this.skewESet) {
            result.append(this.skew);
        } else {
            result.append("<unset>");
        }
        result.append(", stdDev: ");
        if (this.stdDevESet) {
            result.append(this.stdDev);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // OutputDistributionTypeImpl
