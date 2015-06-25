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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.AxisType;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OutputDistributionType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Output Distribution Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getUnderflowBin
 * <em>Underflow Bin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getHistogramBin
 * <em>Histogram Bin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getOverflowBin
 * <em>Overflow Bin</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getBinSize
 * <em>Bin Size</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getKurtosis
 * <em>Kurtosis</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMax <em>Max</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMean <em>Mean</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMidPoint
 * <em>Mid Point</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getMin <em>Min</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getNumberBins
 * <em>Number Bins</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getSkew <em>Skew</em>
 * }</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getStdDev
 * <em>Std Dev</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl#getXSamples
 * <em>XSamples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputDistributionTypeImpl extends EObjectImpl implements OutputDistributionType {

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
    protected static final Object BIN_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBinSize()
     * @generated
     * @ordered
     */
    protected Object binSize = BIN_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getKurtosis()
     * @generated
     * @ordered
     */
    protected static final Object KURTOSIS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getKurtosis()
     * @generated
     * @ordered
     */
    protected Object kurtosis = KURTOSIS_EDEFAULT;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final Object MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected Object max = MAX_EDEFAULT;

    /**
     * The default value of the '{@link #getMean() <em>Mean</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected static final Object MEAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected Object mean = MEAN_EDEFAULT;

    /**
     * The default value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMidPoint()
     * @generated
     * @ordered
     */
    protected static final Object MID_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMidPoint()
     * @generated
     * @ordered
     */
    protected Object midPoint = MID_POINT_EDEFAULT;

    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected static final Object MIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected Object min = MIN_EDEFAULT;

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
    protected static final Object SKEW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSkew()
     * @generated
     * @ordered
     */
    protected Object skew = SKEW_EDEFAULT;

    /**
     * The default value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStdDev()
     * @generated
     * @ordered
     */
    protected static final Object STD_DEV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStdDev()
     * @generated
     * @ordered
     */
    protected Object stdDev = STD_DEV_EDEFAULT;

    /**
     * The default value of the '{@link #getXSamples() <em>XSamples</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getXSamples()
     * @generated
     * @ordered
     */
    protected static final AxisType XSAMPLES_EDEFAULT = AxisType.LINEAR;

    /**
     * The cached value of the '{@link #getXSamples() <em>XSamples</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getXSamples()
     * @generated
     * @ordered
     */
    protected AxisType xSamples = XSAMPLES_EDEFAULT;

    /**
     * This is true if the XSamples attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean xSamplesESet;

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
        if (this.eNotificationRequired()) {
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
        if (newUnderflowBin != this.underflowBin) {
            NotificationChain msgs = null;
            if (this.underflowBin != null) {
                msgs = ((InternalEObject) this.underflowBin).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
            }
            if (newUnderflowBin != null) {
                msgs = ((InternalEObject) newUnderflowBin).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
            }
            msgs = this.basicSetUnderflowBin(newUnderflowBin, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, newUnderflowBin, newUnderflowBin));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<HistogramBinType> getHistogramBin() {
        if (this.histogramBin == null) {
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
        if (this.eNotificationRequired()) {
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
        if (newOverflowBin != this.overflowBin) {
            NotificationChain msgs = null;
            if (this.overflowBin != null) {
                msgs = ((InternalEObject) this.overflowBin).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
            }
            if (newOverflowBin != null) {
                msgs = ((InternalEObject) newOverflowBin).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
            }
            msgs = this.basicSetOverflowBin(newOverflowBin, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, newOverflowBin, newOverflowBin));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getBinSize() {
        return this.binSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBinSize(final Object newBinSize) {
        final Object oldBinSize = this.binSize;
        this.binSize = newBinSize;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE,
                    oldBinSize, this.binSize));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getKurtosis() {
        return this.kurtosis;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setKurtosis(final Object newKurtosis) {
        final Object oldKurtosis = this.kurtosis;
        this.kurtosis = newKurtosis;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS,
                    oldKurtosis, this.kurtosis));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getMax() {
        return this.max;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMax(final Object newMax) {
        final Object oldMax = this.max;
        this.max = newMax;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX, oldMax,
                    this.max));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getMean() {
        return this.mean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMean(final Object newMean) {
        final Object oldMean = this.mean;
        this.mean = newMean;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN,
                    oldMean, this.mean));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getMidPoint() {
        return this.midPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMidPoint(final Object newMidPoint) {
        final Object oldMidPoint = this.midPoint;
        this.midPoint = newMidPoint;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT,
                    oldMidPoint, this.midPoint));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getMin() {
        return this.min;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMin(final Object newMin) {
        final Object oldMin = this.min;
        this.min = newMin;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN, oldMin,
                    this.min));
        }
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS,
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
            this.eNotify(
                    new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS,
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
    public Object getSkew() {
        return this.skew;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSkew(final Object newSkew) {
        final Object oldSkew = this.skew;
        this.skew = newSkew;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW,
                    oldSkew, this.skew));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getStdDev() {
        return this.stdDev;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStdDev(final Object newStdDev) {
        final Object oldStdDev = this.stdDev;
        this.stdDev = newStdDev;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV,
                    oldStdDev, this.stdDev));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AxisType getXSamples() {
        return this.xSamples;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setXSamples(final AxisType newXSamples) {
        final AxisType oldXSamples = this.xSamples;
        this.xSamples = newXSamples == null ? XSAMPLES_EDEFAULT : newXSamples;
        final boolean oldXSamplesESet = this.xSamplesESet;
        this.xSamplesESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES,
                    oldXSamples, this.xSamples, !oldXSamplesESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetXSamples() {
        final AxisType oldXSamples = this.xSamples;
        final boolean oldXSamplesESet = this.xSamplesESet;
        this.xSamples = XSAMPLES_EDEFAULT;
        this.xSamplesESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES,
                    oldXSamples, XSAMPLES_EDEFAULT, oldXSamplesESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetXSamples() {
        return this.xSamplesESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
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
        switch (featureID) {
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
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
            return this.getXSamples();
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
        switch (featureID) {
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
            this.setBinSize(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            this.setKurtosis(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            this.setMax(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            this.setMean(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            this.setMidPoint(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            this.setMin(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            this.setNumberBins((BigInteger) newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            this.setSkew(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            this.setStdDev(newValue);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
            this.setXSamples((AxisType) newValue);
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
        switch (featureID) {
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
            this.setBinSize(BIN_SIZE_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            this.setKurtosis(KURTOSIS_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            this.setMax(MAX_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            this.setMean(MEAN_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            this.setMidPoint(MID_POINT_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            this.setMin(MIN_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            this.unsetNumberBins();
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            this.setSkew(SKEW_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            this.setStdDev(STD_DEV_EDEFAULT);
            return;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
            this.unsetXSamples();
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
        switch (featureID) {
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
            return this.underflowBin != null;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
            return this.histogramBin != null && !this.histogramBin.isEmpty();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
            return this.overflowBin != null;
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
            return BIN_SIZE_EDEFAULT == null ? this.binSize != null : !BIN_SIZE_EDEFAULT.equals(this.binSize);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
            return KURTOSIS_EDEFAULT == null ? this.kurtosis != null : !KURTOSIS_EDEFAULT.equals(this.kurtosis);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
            return MAX_EDEFAULT == null ? this.max != null : !MAX_EDEFAULT.equals(this.max);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
            return MEAN_EDEFAULT == null ? this.mean != null : !MEAN_EDEFAULT.equals(this.mean);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
            return MID_POINT_EDEFAULT == null ? this.midPoint != null : !MID_POINT_EDEFAULT.equals(this.midPoint);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
            return MIN_EDEFAULT == null ? this.min != null : !MIN_EDEFAULT.equals(this.min);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
            return this.isSetNumberBins();
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
            return SKEW_EDEFAULT == null ? this.skew != null : !SKEW_EDEFAULT.equals(this.skew);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
            return STD_DEV_EDEFAULT == null ? this.stdDev != null : !STD_DEV_EDEFAULT.equals(this.stdDev);
        case LqnPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
            return this.isSetXSamples();
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
        result.append(this.binSize);
        result.append(", kurtosis: ");
        result.append(this.kurtosis);
        result.append(", max: ");
        result.append(this.max);
        result.append(", mean: ");
        result.append(this.mean);
        result.append(", midPoint: ");
        result.append(this.midPoint);
        result.append(", min: ");
        result.append(this.min);
        result.append(", numberBins: ");
        if (this.numberBinsESet) {
            result.append(this.numberBins);
        } else {
            result.append("<unset>");
        }
        result.append(", skew: ");
        result.append(this.skew);
        result.append(", stdDev: ");
        result.append(this.stdDev);
        result.append(", xSamples: ");
        if (this.xSamplesESet) {
            result.append(this.xSamples);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // OutputDistributionTypeImpl
