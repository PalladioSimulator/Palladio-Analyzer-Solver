/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Histogram Bin Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getConf95 <em>Conf95</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getConf99 <em>Conf99</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistogramBinTypeImpl extends MinimalEObjectImpl.Container
		implements HistogramBinType {
	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final double BEGIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected double begin = BEGIN_EDEFAULT;

	/**
	 * This is true if the Begin attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean beginESet;

	/**
	 * The default value of the '{@link #getConf95() <em>Conf95</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getConf95()
	 * @generated
	 * @ordered
	 */
	protected static final double CONF95_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConf95() <em>Conf95</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getConf95()
	 * @generated
	 * @ordered
	 */
	protected double conf95 = CONF95_EDEFAULT;

	/**
	 * This is true if the Conf95 attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean conf95ESet;

	/**
	 * The default value of the '{@link #getConf99() <em>Conf99</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getConf99()
	 * @generated
	 * @ordered
	 */
	protected static final double CONF99_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConf99() <em>Conf99</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getConf99()
	 * @generated
	 * @ordered
	 */
	protected double conf99 = CONF99_EDEFAULT;

	/**
	 * This is true if the Conf99 attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean conf99ESet;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final double END_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected double end = END_EDEFAULT;

	/**
	 * This is true if the End attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endESet;

	/**
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final double PROB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected double prob = PROB_EDEFAULT;

	/**
	 * This is true if the Prob attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean probESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramBinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.HISTOGRAM_BIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(double newBegin) {
		double oldBegin = begin;
		begin = newBegin;
		boolean oldBeginESet = beginESet;
		beginESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN, oldBegin, begin,
					!oldBeginESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBegin() {
		double oldBegin = begin;
		boolean oldBeginESet = beginESet;
		begin = BEGIN_EDEFAULT;
		beginESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN, oldBegin,
					BEGIN_EDEFAULT, oldBeginESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBegin() {
		return beginESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getConf95() {
		return conf95;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConf95(double newConf95) {
		double oldConf95 = conf95;
		conf95 = newConf95;
		boolean oldConf95ESet = conf95ESet;
		conf95ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.HISTOGRAM_BIN_TYPE__CONF95, oldConf95, conf95,
					!oldConf95ESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConf95() {
		double oldConf95 = conf95;
		boolean oldConf95ESet = conf95ESet;
		conf95 = CONF95_EDEFAULT;
		conf95ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.HISTOGRAM_BIN_TYPE__CONF95, oldConf95,
					CONF95_EDEFAULT, oldConf95ESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConf95() {
		return conf95ESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getConf99() {
		return conf99;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConf99(double newConf99) {
		double oldConf99 = conf99;
		conf99 = newConf99;
		boolean oldConf99ESet = conf99ESet;
		conf99ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.HISTOGRAM_BIN_TYPE__CONF99, oldConf99, conf99,
					!oldConf99ESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConf99() {
		double oldConf99 = conf99;
		boolean oldConf99ESet = conf99ESet;
		conf99 = CONF99_EDEFAULT;
		conf99ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.HISTOGRAM_BIN_TYPE__CONF99, oldConf99,
					CONF99_EDEFAULT, oldConf99ESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConf99() {
		return conf99ESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(double newEnd) {
		double oldEnd = end;
		end = newEnd;
		boolean oldEndESet = endESet;
		endESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.HISTOGRAM_BIN_TYPE__END, oldEnd, end,
					!oldEndESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEnd() {
		double oldEnd = end;
		boolean oldEndESet = endESet;
		end = END_EDEFAULT;
		endESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.HISTOGRAM_BIN_TYPE__END, oldEnd, END_EDEFAULT,
					oldEndESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEnd() {
		return endESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProb(double newProb) {
		double oldProb = prob;
		prob = newProb;
		boolean oldProbESet = probESet;
		probESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LqnPackage.HISTOGRAM_BIN_TYPE__PROB, oldProb, prob,
					!oldProbESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProb() {
		double oldProb = prob;
		boolean oldProbESet = probESet;
		prob = PROB_EDEFAULT;
		probESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					LqnPackage.HISTOGRAM_BIN_TYPE__PROB, oldProb,
					PROB_EDEFAULT, oldProbESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProb() {
		return probESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
			return getBegin();
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
			return getConf95();
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
			return getConf99();
		case LqnPackage.HISTOGRAM_BIN_TYPE__END:
			return getEnd();
		case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
			return getProb();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
			setBegin((Double) newValue);
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
			setConf95((Double) newValue);
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
			setConf99((Double) newValue);
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__END:
			setEnd((Double) newValue);
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
			setProb((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
			unsetBegin();
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
			unsetConf95();
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
			unsetConf99();
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__END:
			unsetEnd();
			return;
		case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
			unsetProb();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LqnPackage.HISTOGRAM_BIN_TYPE__BEGIN:
			return isSetBegin();
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF95:
			return isSetConf95();
		case LqnPackage.HISTOGRAM_BIN_TYPE__CONF99:
			return isSetConf99();
		case LqnPackage.HISTOGRAM_BIN_TYPE__END:
			return isSetEnd();
		case LqnPackage.HISTOGRAM_BIN_TYPE__PROB:
			return isSetProb();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (begin: ");
		if (beginESet)
			result.append(begin);
		else
			result.append("<unset>");
		result.append(", conf95: ");
		if (conf95ESet)
			result.append(conf95);
		else
			result.append("<unset>");
		result.append(", conf99: ");
		if (conf99ESet)
			result.append(conf99);
		else
			result.append("<unset>");
		result.append(", end: ");
		if (endESet)
			result.append(end);
		else
			result.append("<unset>");
		result.append(", prob: ");
		if (probESet)
			result.append(prob);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HistogramBinTypeImpl
