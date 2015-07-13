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
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getRunControl <em>Run Control
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getPlotControl <em>Plot Control
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getSolverParams <em>Solver
 * Params</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getProcessor <em>Processor
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getSlot <em>Slot</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getLqx <em>Lqx</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getDescription <em>Description
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getLqnSchemaVersion <em>Lqn
 * Schema Version</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getLqncoreSchemaVersion <em>
 * Lqncore Schema Version</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl#isXmlDebug <em>Xml Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LqnModelTypeImpl extends MinimalEObjectImpl.Container implements LqnModelType {
    /**
     * The cached value of the '{@link #getRunControl() <em>Run Control</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRunControl()
     * @generated
     * @ordered
     */
    protected RunControlType runControl;

    /**
     * The cached value of the '{@link #getPlotControl() <em>Plot Control</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPlotControl()
     * @generated
     * @ordered
     */
    protected PlotControlType plotControl;

    /**
     * The cached value of the '{@link #getSolverParams() <em>Solver Params</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSolverParams()
     * @generated
     * @ordered
     */
    protected SolverParamsType solverParams;

    /**
     * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
     * The default value of the '{@link #getLqx() <em>Lqx</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getLqx()
     * @generated
     * @ordered
     */
    protected static final String LQX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLqx() <em>Lqx</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
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
     * The default value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLqnSchemaVersion()
     * @generated
     * @ordered
     */
    protected static final BigDecimal LQN_SCHEMA_VERSION_EDEFAULT = new BigDecimal("1.0");

    /**
     * The cached value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLqnSchemaVersion()
     * @generated
     * @ordered
     */
    protected BigDecimal lqnSchemaVersion = LQN_SCHEMA_VERSION_EDEFAULT;

    /**
     * This is true if the Lqn Schema Version attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean lqnSchemaVersionESet;

    /**
     * The default value of the '{@link #getLqncoreSchemaVersion() <em>Lqncore Schema Version</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLqncoreSchemaVersion()
     * @generated
     * @ordered
     */
    protected static final BigDecimal LQNCORE_SCHEMA_VERSION_EDEFAULT = new BigDecimal("1.1");

    /**
     * The cached value of the '{@link #getLqncoreSchemaVersion() <em>Lqncore Schema Version</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLqncoreSchemaVersion()
     * @generated
     * @ordered
     */
    protected BigDecimal lqncoreSchemaVersion = LQNCORE_SCHEMA_VERSION_EDEFAULT;

    /**
     * This is true if the Lqncore Schema Version attribute has been set. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean lqncoreSchemaVersionESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
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
     * This is true if the Xml Debug attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean xmlDebugESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LqnModelTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.LQN_MODEL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RunControlType getRunControl() {
        return this.runControl;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRunControl(final RunControlType newRunControl, NotificationChain msgs) {
        final RunControlType oldRunControl = this.runControl;
        this.runControl = newRunControl;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, oldRunControl, newRunControl);
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
    public void setRunControl(final RunControlType newRunControl) {
        if (newRunControl != this.runControl)
        {
            NotificationChain msgs = null;
            if (this.runControl != null) {
                msgs = ((InternalEObject) this.runControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, null, msgs);
            }
            if (newRunControl != null) {
                msgs = ((InternalEObject) newRunControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL, null, msgs);
            }
            msgs = this.basicSetRunControl(newRunControl, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL,
                    newRunControl, newRunControl));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PlotControlType getPlotControl() {
        return this.plotControl;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPlotControl(final PlotControlType newPlotControl, NotificationChain msgs) {
        final PlotControlType oldPlotControl = this.plotControl;
        this.plotControl = newPlotControl;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL, oldPlotControl, newPlotControl);
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
    public void setPlotControl(final PlotControlType newPlotControl) {
        if (newPlotControl != this.plotControl)
        {
            NotificationChain msgs = null;
            if (this.plotControl != null) {
                msgs = ((InternalEObject) this.plotControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL, null, msgs);
            }
            if (newPlotControl != null) {
                msgs = ((InternalEObject) newPlotControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL, null, msgs);
            }
            msgs = this.basicSetPlotControl(newPlotControl, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL,
                    newPlotControl, newPlotControl));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SolverParamsType getSolverParams() {
        return this.solverParams;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetSolverParams(final SolverParamsType newSolverParams, NotificationChain msgs) {
        final SolverParamsType oldSolverParams = this.solverParams;
        this.solverParams = newSolverParams;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS, oldSolverParams, newSolverParams);
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
    public void setSolverParams(final SolverParamsType newSolverParams) {
        if (newSolverParams != this.solverParams)
        {
            NotificationChain msgs = null;
            if (this.solverParams != null) {
                msgs = ((InternalEObject) this.solverParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS, null, msgs);
            }
            if (newSolverParams != null) {
                msgs = ((InternalEObject) newSolverParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS, null, msgs);
            }
            msgs = this.basicSetSolverParams(newSolverParams, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS,
                    newSolverParams, newSolverParams));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ProcessorType> getProcessor() {
        if (this.processor == null)
        {
            this.processor = new EObjectContainmentEList<ProcessorType>(ProcessorType.class, this,
                    LqnPackage.LQN_MODEL_TYPE__PROCESSOR);
        }
        return this.processor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<SlotType> getSlot() {
        if (this.slot == null)
        {
            this.slot = new EObjectContainmentEList<SlotType>(SlotType.class, this, LqnPackage.LQN_MODEL_TYPE__SLOT);
        }
        return this.slot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLqx() {
        return this.lqx;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLqx(final String newLqx) {
        final String oldLqx = this.lqx;
        this.lqx = newLqx;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__LQX, oldLqx, this.lqx));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(final String newDescription) {
        final String oldDescription = this.description;
        this.description = newDescription;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__DESCRIPTION,
                    oldDescription, this.description));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigDecimal getLqnSchemaVersion() {
        return this.lqnSchemaVersion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLqnSchemaVersion(final BigDecimal newLqnSchemaVersion) {
        final BigDecimal oldLqnSchemaVersion = this.lqnSchemaVersion;
        this.lqnSchemaVersion = newLqnSchemaVersion;
        final boolean oldLqnSchemaVersionESet = this.lqnSchemaVersionESet;
        this.lqnSchemaVersionESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION,
                    oldLqnSchemaVersion, this.lqnSchemaVersion, !oldLqnSchemaVersionESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetLqnSchemaVersion() {
        final BigDecimal oldLqnSchemaVersion = this.lqnSchemaVersion;
        final boolean oldLqnSchemaVersionESet = this.lqnSchemaVersionESet;
        this.lqnSchemaVersion = LQN_SCHEMA_VERSION_EDEFAULT;
        this.lqnSchemaVersionESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION,
                    oldLqnSchemaVersion, LQN_SCHEMA_VERSION_EDEFAULT, oldLqnSchemaVersionESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetLqnSchemaVersion() {
        return this.lqnSchemaVersionESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BigDecimal getLqncoreSchemaVersion() {
        return this.lqncoreSchemaVersion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLqncoreSchemaVersion(final BigDecimal newLqncoreSchemaVersion) {
        final BigDecimal oldLqncoreSchemaVersion = this.lqncoreSchemaVersion;
        this.lqncoreSchemaVersion = newLqncoreSchemaVersion;
        final boolean oldLqncoreSchemaVersionESet = this.lqncoreSchemaVersionESet;
        this.lqncoreSchemaVersionESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION,
                    oldLqncoreSchemaVersion, this.lqncoreSchemaVersion, !oldLqncoreSchemaVersionESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetLqncoreSchemaVersion() {
        final BigDecimal oldLqncoreSchemaVersion = this.lqncoreSchemaVersion;
        final boolean oldLqncoreSchemaVersionESet = this.lqncoreSchemaVersionESet;
        this.lqncoreSchemaVersion = LQNCORE_SCHEMA_VERSION_EDEFAULT;
        this.lqncoreSchemaVersionESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION,
                    oldLqncoreSchemaVersion, LQNCORE_SCHEMA_VERSION_EDEFAULT, oldLqncoreSchemaVersionESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetLqncoreSchemaVersion() {
        return this.lqncoreSchemaVersionESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__NAME, oldName,
                    this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isXmlDebug() {
        return this.xmlDebug;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setXmlDebug(final boolean newXmlDebug) {
        final boolean oldXmlDebug = this.xmlDebug;
        this.xmlDebug = newXmlDebug;
        final boolean oldXmlDebugESet = this.xmlDebugESet;
        this.xmlDebugESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL_TYPE__XML_DEBUG,
                    oldXmlDebug,
                    this.xmlDebug, !oldXmlDebugESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetXmlDebug() {
        final boolean oldXmlDebug = this.xmlDebug;
        final boolean oldXmlDebugESet = this.xmlDebugESet;
        this.xmlDebug = XML_DEBUG_EDEFAULT;
        this.xmlDebugESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.LQN_MODEL_TYPE__XML_DEBUG,
                    oldXmlDebug,
                    XML_DEBUG_EDEFAULT, oldXmlDebugESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetXmlDebug() {
        return this.xmlDebugESet;
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
        case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
            return this.basicSetRunControl(null, msgs);
        case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
            return this.basicSetPlotControl(null, msgs);
        case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
            return this.basicSetSolverParams(null, msgs);
        case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
            return ((InternalEList<?>) this.getProcessor()).basicRemove(otherEnd, msgs);
        case LqnPackage.LQN_MODEL_TYPE__SLOT:
            return ((InternalEList<?>) this.getSlot()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
            return this.getRunControl();
        case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
            return this.getPlotControl();
        case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
            return this.getSolverParams();
        case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
            return this.getProcessor();
        case LqnPackage.LQN_MODEL_TYPE__SLOT:
            return this.getSlot();
        case LqnPackage.LQN_MODEL_TYPE__LQX:
            return this.getLqx();
        case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
            return this.getDescription();
        case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
            return this.getLqnSchemaVersion();
        case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
            return this.getLqncoreSchemaVersion();
        case LqnPackage.LQN_MODEL_TYPE__NAME:
            return this.getName();
        case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
            return this.isXmlDebug();
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
        case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
            this.setRunControl((RunControlType) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
            this.setPlotControl((PlotControlType) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
            this.setSolverParams((SolverParamsType) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
            this.getProcessor().clear();
            this.getProcessor().addAll((Collection<? extends ProcessorType>) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__SLOT:
            this.getSlot().clear();
            this.getSlot().addAll((Collection<? extends SlotType>) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__LQX:
            this.setLqx((String) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
            this.setDescription((String) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
            this.setLqnSchemaVersion((BigDecimal) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
            this.setLqncoreSchemaVersion((BigDecimal) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__NAME:
            this.setName((String) newValue);
            return;
        case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
            this.setXmlDebug((Boolean) newValue);
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
        case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
            this.setRunControl((RunControlType) null);
            return;
        case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
            this.setPlotControl((PlotControlType) null);
            return;
        case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
            this.setSolverParams((SolverParamsType) null);
            return;
        case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
            this.getProcessor().clear();
            return;
        case LqnPackage.LQN_MODEL_TYPE__SLOT:
            this.getSlot().clear();
            return;
        case LqnPackage.LQN_MODEL_TYPE__LQX:
            this.setLqx(LQX_EDEFAULT);
            return;
        case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
            this.setDescription(DESCRIPTION_EDEFAULT);
            return;
        case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
            this.unsetLqnSchemaVersion();
            return;
        case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
            this.unsetLqncoreSchemaVersion();
            return;
        case LqnPackage.LQN_MODEL_TYPE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
            this.unsetXmlDebug();
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
        case LqnPackage.LQN_MODEL_TYPE__RUN_CONTROL:
            return this.runControl != null;
        case LqnPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
            return this.plotControl != null;
        case LqnPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
            return this.solverParams != null;
        case LqnPackage.LQN_MODEL_TYPE__PROCESSOR:
            return this.processor != null && !this.processor.isEmpty();
        case LqnPackage.LQN_MODEL_TYPE__SLOT:
            return this.slot != null && !this.slot.isEmpty();
        case LqnPackage.LQN_MODEL_TYPE__LQX:
            return LQX_EDEFAULT == null ? this.lqx != null : !LQX_EDEFAULT.equals(this.lqx);
        case LqnPackage.LQN_MODEL_TYPE__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT
                    .equals(this.description);
        case LqnPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
            return this.isSetLqnSchemaVersion();
        case LqnPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
            return this.isSetLqncoreSchemaVersion();
        case LqnPackage.LQN_MODEL_TYPE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case LqnPackage.LQN_MODEL_TYPE__XML_DEBUG:
            return this.isSetXmlDebug();
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
        result.append(" (lqx: ");
        result.append(this.lqx);
        result.append(", description: ");
        result.append(this.description);
        result.append(", lqnSchemaVersion: ");
        if (this.lqnSchemaVersionESet) {
            result.append(this.lqnSchemaVersion);
        } else {
            result.append("<unset>");
        }
        result.append(", lqncoreSchemaVersion: ");
        if (this.lqncoreSchemaVersionESet) {
            result.append(this.lqncoreSchemaVersion);
        } else {
            result.append("<unset>");
        }
        result.append(", name: ");
        result.append(this.name);
        result.append(", xmlDebug: ");
        if (this.xmlDebugESet) {
            result.append(this.xmlDebug);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // LqnModelTypeImpl
