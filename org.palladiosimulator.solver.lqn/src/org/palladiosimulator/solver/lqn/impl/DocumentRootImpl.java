/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.solver.lqn.DocumentRoot;
import org.palladiosimulator.solver.lqn.LqnCoreType;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS
 * Prefix Map</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI
 * Schema Location</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl#getLqnCore <em>Lqn Core</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl#getLqnModel <em>Lqn Model</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FeatureMap getMixed() {
        if (this.mixed == null)
        {
            this.mixed = new BasicFeatureMap(this, LqnPackage.DOCUMENT_ROOT__MIXED);
        }
        return this.mixed;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EMap<String, String> getXMLNSPrefixMap() {
        if (this.xMLNSPrefixMap == null)
        {
            this.xMLNSPrefixMap = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, this, LqnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return this.xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EMap<String, String> getXSISchemaLocation() {
        if (this.xSISchemaLocation == null)
        {
            this.xSISchemaLocation = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, this, LqnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return this.xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LqnCoreType getLqnCore() {
        return (LqnCoreType) this.getMixed().get(LqnPackage.Literals.DOCUMENT_ROOT__LQN_CORE, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetLqnCore(final LqnCoreType newLqnCore, final NotificationChain msgs) {
        return ((FeatureMap.Internal) this.getMixed()).basicAdd(LqnPackage.Literals.DOCUMENT_ROOT__LQN_CORE,
                newLqnCore,
                msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLqnCore(final LqnCoreType newLqnCore) {
        ((FeatureMap.Internal) this.getMixed()).set(LqnPackage.Literals.DOCUMENT_ROOT__LQN_CORE, newLqnCore);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LqnModelType getLqnModel() {
        return (LqnModelType) this.getMixed().get(LqnPackage.Literals.DOCUMENT_ROOT__LQN_MODEL, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetLqnModel(final LqnModelType newLqnModel, final NotificationChain msgs) {
        return ((FeatureMap.Internal) this.getMixed()).basicAdd(LqnPackage.Literals.DOCUMENT_ROOT__LQN_MODEL,
                newLqnModel,
                msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLqnModel(final LqnModelType newLqnModel) {
        ((FeatureMap.Internal) this.getMixed()).set(LqnPackage.Literals.DOCUMENT_ROOT__LQN_MODEL, newLqnModel);
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
        case LqnPackage.DOCUMENT_ROOT__MIXED:
            return ((InternalEList<?>) this.getMixed()).basicRemove(otherEnd, msgs);
        case LqnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return ((InternalEList<?>) this.getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
        case LqnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return ((InternalEList<?>) this.getXSISchemaLocation()).basicRemove(otherEnd, msgs);
        case LqnPackage.DOCUMENT_ROOT__LQN_CORE:
            return this.basicSetLqnCore(null, msgs);
        case LqnPackage.DOCUMENT_ROOT__LQN_MODEL:
            return this.basicSetLqnModel(null, msgs);
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
        case LqnPackage.DOCUMENT_ROOT__MIXED:
            if (coreType) {
                return this.getMixed();
            }
            return ((FeatureMap.Internal) this.getMixed()).getWrapper();
        case LqnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            if (coreType) {
                return this.getXMLNSPrefixMap();
            } else {
                return this.getXMLNSPrefixMap().map();
            }
        case LqnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            if (coreType) {
                return this.getXSISchemaLocation();
            } else {
                return this.getXSISchemaLocation().map();
            }
        case LqnPackage.DOCUMENT_ROOT__LQN_CORE:
            return this.getLqnCore();
        case LqnPackage.DOCUMENT_ROOT__LQN_MODEL:
            return this.getLqnModel();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case LqnPackage.DOCUMENT_ROOT__MIXED:
            ((FeatureMap.Internal) this.getMixed()).set(newValue);
            return;
        case LqnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            ((EStructuralFeature.Setting) this.getXMLNSPrefixMap()).set(newValue);
            return;
        case LqnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            ((EStructuralFeature.Setting) this.getXSISchemaLocation()).set(newValue);
            return;
        case LqnPackage.DOCUMENT_ROOT__LQN_CORE:
            this.setLqnCore((LqnCoreType) newValue);
            return;
        case LqnPackage.DOCUMENT_ROOT__LQN_MODEL:
            this.setLqnModel((LqnModelType) newValue);
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
        case LqnPackage.DOCUMENT_ROOT__MIXED:
            this.getMixed().clear();
            return;
        case LqnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            this.getXMLNSPrefixMap().clear();
            return;
        case LqnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            this.getXSISchemaLocation().clear();
            return;
        case LqnPackage.DOCUMENT_ROOT__LQN_CORE:
            this.setLqnCore((LqnCoreType) null);
            return;
        case LqnPackage.DOCUMENT_ROOT__LQN_MODEL:
            this.setLqnModel((LqnModelType) null);
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
        case LqnPackage.DOCUMENT_ROOT__MIXED:
            return this.mixed != null && !this.mixed.isEmpty();
        case LqnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return this.xMLNSPrefixMap != null && !this.xMLNSPrefixMap.isEmpty();
        case LqnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return this.xSISchemaLocation != null && !this.xSISchemaLocation.isEmpty();
        case LqnPackage.DOCUMENT_ROOT__LQN_CORE:
            return this.getLqnCore() != null;
        case LqnPackage.DOCUMENT_ROOT__LQN_MODEL:
            return this.getLqnModel() != null;
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
        result.append(" (mixed: ");
        result.append(this.mixed);
        result.append(')');
        return result.toString();
    }

} // DocumentRootImpl
