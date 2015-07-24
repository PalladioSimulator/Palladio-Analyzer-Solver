/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigDecimal;
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
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.PlotControlType;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.RunControlType;
import org.palladiosimulator.solver.lqn.SlotType;
import org.palladiosimulator.solver.lqn.SolverParamsType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getRunControl <em>Run Control</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getPlotControl <em>Plot Control</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getSolverParams <em>Solver Params</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getLqx <em>Lqx</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getLqnSchemaVersion <em>Lqn Schema Version</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#isXmlDebug <em>Xml Debug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LqnModelTypeImpl extends MinimalEObjectImpl.Container implements LqnModelType {
	/**
	 * The cached value of the '{@link #getRunControl() <em>Run Control</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunControl()
	 * @generated
	 * @ordered
	 */
	protected RunControlType runControl;

	/**
	 * The cached value of the '{@link #getPlotControl() <em>Plot Control</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPlotControl()
	 * @generated
	 * @ordered
	 */
	protected PlotControlType plotControl;

	/**
	 * The cached value of the '{@link #getSolverParams() <em>Solver Params</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolverParams()
	 * @generated
	 * @ordered
	 */
	protected SolverParamsType solverParams;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorType> processor;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotType> slot;

	/**
	 * The default value of the '{@link #getLqx() <em>Lqx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqx()
	 * @generated
	 * @ordered
	 */
	protected static final String LQX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLqx() <em>Lqx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqx()
	 * @generated
	 * @ordered
	 */
	protected String lqx = LQX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLqnSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LQN_SCHEMA_VERSION_EDEFAULT = new BigDecimal("1.0");

	/**
	 * The cached value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLqnSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lqnSchemaVersion = LQN_SCHEMA_VERSION_EDEFAULT;

	/**
	 * This is true if the Lqn Schema Version attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lqnSchemaVersionESet;

	/**
	 * The default value of the '{@link #getLqncoreSchemaVersion() <em>Lqncore Schema Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLqncoreSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LQNCORE_SCHEMA_VERSION_EDEFAULT = new BigDecimal("1.1");

	/**
	 * The cached value of the '{@link #getLqncoreSchemaVersion() <em>Lqncore Schema Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLqncoreSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lqncoreSchemaVersion = LQNCORE_SCHEMA_VERSION_EDEFAULT;

	/**
	 * This is true if the Lqncore Schema Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lqncoreSchemaVersionESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isXmlDebug() <em>Xml Debug</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isXmlDebug()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XML_DEBUG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXmlDebug() <em>Xml Debug</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isXmlDebug()
	 * @generated
	 * @ordered
	 */
	protected boolean xmlDebug = XML_DEBUG_EDEFAULT;

	/**
	 * This is true if the Xml Debug attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xmlDebugESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LqnModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.LQN_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunControlType getRunControl() {
		return runControl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunControl(RunControlType newRunControl, NotificationChain msgs) {
		RunControlType oldRunControl = runControl;
		runControl = newRunControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, oldRunControl, newRunControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunControl(RunControlType newRunControl) {
		if (newRunControl != runControl) {
			NotificationChain msgs = null;
			if (runControl != null)
				msgs = ((InternalEObject) runControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, null, msgs);
			if (newRunControl != null)
				msgs = ((InternalEObject) newRunControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, null, msgs);
			msgs = basicSetRunControl(newRunControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, newRunControl,
					newRunControl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlotControlType getPlotControl() {
		return plotControl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlotControl(PlotControlType newPlotControl, NotificationChain msgs) {
		PlotControlType oldPlotControl = plotControl;
		plotControl = newPlotControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL, oldPlotControl, newPlotControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlotControl(PlotControlType newPlotControl) {
		if (newPlotControl != plotControl) {
			NotificationChain msgs = null;
			if (plotControl != null)
				msgs = ((InternalEObject) plotControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL, null, msgs);
			if (newPlotControl != null)
				msgs = ((InternalEObject) newPlotControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL, null, msgs);
			msgs = basicSetPlotControl(newPlotControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL,
					newPlotControl, newPlotControl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolverParamsType getSolverParams() {
		return solverParams;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolverParams(SolverParamsType newSolverParams, NotificationChain msgs) {
		SolverParamsType oldSolverParams = solverParams;
		solverParams = newSolverParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS, oldSolverParams, newSolverParams);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolverParams(SolverParamsType newSolverParams) {
		if (newSolverParams != solverParams) {
			NotificationChain msgs = null;
			if (solverParams != null)
				msgs = ((InternalEObject) solverParams).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS, null, msgs);
			if (newSolverParams != null)
				msgs = ((InternalEObject) newSolverParams).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS, null, msgs);
			msgs = basicSetSolverParams(newSolverParams, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS,
					newSolverParams, newSolverParams));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessorType> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<ProcessorType>(ProcessorType.class, this,
					LqnPackage.LQN_MODEL_TYPE__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SlotType> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<SlotType>(SlotType.class, this, LqnPackage.LQN_MODEL_TYPE__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLqx() {
		return lqx;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLqx(String newLqx) {
		String oldLqx = lqx;
		lqx = newLqx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__LQX, oldLqx, lqx));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLqnSchemaVersion() {
		return lqnSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLqnSchemaVersion(BigDecimal newLqnSchemaVersion) {
		BigDecimal oldLqnSchemaVersion = lqnSchemaVersion;
		lqnSchemaVersion = newLqnSchemaVersion;
		boolean oldLqnSchemaVersionESet = lqnSchemaVersionESet;
		lqnSchemaVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION,
					oldLqnSchemaVersion, lqnSchemaVersion, !oldLqnSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLqnSchemaVersion() {
		BigDecimal oldLqnSchemaVersion = lqnSchemaVersion;
		boolean oldLqnSchemaVersionESet = lqnSchemaVersionESet;
		lqnSchemaVersion = LQN_SCHEMA_VERSION_EDEFAULT;
		lqnSchemaVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION,
					oldLqnSchemaVersion, LQN_SCHEMA_VERSION_EDEFAULT, oldLqnSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLqnSchemaVersion() {
		return lqnSchemaVersionESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLqncoreSchemaVersion() {
		return lqncoreSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLqncoreSchemaVersion(BigDecimal newLqncoreSchemaVersion) {
		BigDecimal oldLqncoreSchemaVersion = lqncoreSchemaVersion;
		lqncoreSchemaVersion = newLqncoreSchemaVersion;
		boolean oldLqncoreSchemaVersionESet = lqncoreSchemaVersionESet;
		lqncoreSchemaVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION,
					oldLqncoreSchemaVersion, lqncoreSchemaVersion, !oldLqncoreSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLqncoreSchemaVersion() {
		BigDecimal oldLqncoreSchemaVersion = lqncoreSchemaVersion;
		boolean oldLqncoreSchemaVersionESet = lqncoreSchemaVersionESet;
		lqncoreSchemaVersion = LQNCORE_SCHEMA_VERSION_EDEFAULT;
		lqncoreSchemaVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION,
					oldLqncoreSchemaVersion, LQNCORE_SCHEMA_VERSION_EDEFAULT, oldLqncoreSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLqncoreSchemaVersion() {
		return lqncoreSchemaVersionESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isXmlDebug() {
		return xmlDebug;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlDebug(boolean newXmlDebug) {
		boolean oldXmlDebug = xmlDebug;
		xmlDebug = newXmlDebug;
		boolean oldXmlDebugESet = xmlDebugESet;
		xmlDebugESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__XML_DEBUG, oldXmlDebug,
					xmlDebug, !oldXmlDebugESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetXmlDebug() {
		boolean oldXmlDebug = xmlDebug;
		boolean oldXmlDebugESet = xmlDebugESet;
		xmlDebug = XML_DEBUG_EDEFAULT;
		xmlDebugESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.LQN_MODEL_TYPE__XML_DEBUG, oldXmlDebug,
					XML_DEBUG_EDEFAULT, oldXmlDebugESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetXmlDebug() {
		return xmlDebugESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
			return basicSetRunControl(null, msgs);
		case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
			return basicSetPlotControl(null, msgs);
		case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
			return basicSetSolverParams(null, msgs);
		case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
			return ((InternalEList<?>) getProcessor()).basicRemove(otherEnd, msgs);
		case LqnPackage.LQN_MODEL_TYPE__SLOT:
			return ((InternalEList<?>) getSlot()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
			return getRunControl();
		case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
			return getPlotControl();
		case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
			return getSolverParams();
		case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
			return getProcessor();
		case LqnPackage.LQN_MODEL_TYPE__SLOT:
			return getSlot();
		case LqnPackage.LQN_MODEL_TYPE__LQX:
			return getLqx();
		case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
			return getDescription();
		case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
			return getLqnSchemaVersion();
		case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
			return getLqncoreSchemaVersion();
		case LqnPackage.LQN_MODEL_TYPE__NAME:
			return getName();
		case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
			return isXmlDebug();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
			setRunControl((RunControlType) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
			setPlotControl((PlotControlType) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
			setSolverParams((SolverParamsType) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
			getProcessor().clear();
			getProcessor().addAll((Collection<? extends ProcessorType>) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__SLOT:
			getSlot().clear();
			getSlot().addAll((Collection<? extends SlotType>) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__LQX:
			setLqx((String) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
			setLqnSchemaVersion((BigDecimal) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
			setLqncoreSchemaVersion((BigDecimal) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__NAME:
			setName((String) newValue);
			return;
		case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
			setXmlDebug((Boolean) newValue);
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
		case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
			setRunControl((RunControlType) null);
			return;
		case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
			setPlotControl((PlotControlType) null);
			return;
		case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
			setSolverParams((SolverParamsType) null);
			return;
		case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
			getProcessor().clear();
			return;
		case LqnPackage.LQN_MODEL_TYPE__SLOT:
			getSlot().clear();
			return;
		case LqnPackage.LQN_MODEL_TYPE__LQX:
			setLqx(LQX_EDEFAULT);
			return;
		case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
			unsetLqnSchemaVersion();
			return;
		case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
			unsetLqncoreSchemaVersion();
			return;
		case LqnPackage.LQN_MODEL_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
			unsetXmlDebug();
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
		case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
			return runControl != null;
		case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
			return plotControl != null;
		case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
			return solverParams != null;
		case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
			return processor != null && !processor.isEmpty();
		case LqnPackage.LQN_MODEL_TYPE__SLOT:
			return slot != null && !slot.isEmpty();
		case LqnPackage.LQN_MODEL_TYPE__LQX:
			return LQX_EDEFAULT == null ? lqx != null : !LQX_EDEFAULT.equals(lqx);
		case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
			return isSetLqnSchemaVersion();
		case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
			return isSetLqncoreSchemaVersion();
		case LqnPackage.LQN_MODEL_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
			return isSetXmlDebug();
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
		result.append(" (lqx: ");
		result.append(lqx);
		result.append(", description: ");
		result.append(description);
		result.append(", lqnSchemaVersion: ");
		if (lqnSchemaVersionESet)
			result.append(lqnSchemaVersion);
		else
			result.append("<unset>");
		result.append(", lqncoreSchemaVersion: ");
		if (lqncoreSchemaVersionESet)
			result.append(lqncoreSchemaVersion);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", xmlDebug: ");
		if (xmlDebugESet)
			result.append(xmlDebug);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LqnModelTypeImpl
