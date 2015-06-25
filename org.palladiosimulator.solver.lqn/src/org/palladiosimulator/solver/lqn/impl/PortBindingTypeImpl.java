/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.PortBindingType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Port Binding Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PortBindingTypeImpl#getSource <em>Source</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PortBindingTypeImpl#getTarget <em>Target</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class PortBindingTypeImpl extends EObjectImpl implements PortBindingType {

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected static final String TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected String target = TARGET_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PortBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.PORT_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getSource() {
        return this.source;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSource(final String newSource) {
        final String oldSource = this.source;
        this.source = newSource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PORT_BINDING_TYPE__SOURCE, oldSource,
                    this.source));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getTarget() {
        return this.target;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTarget(final String newTarget) {
        final String oldTarget = this.target;
        this.target = newTarget;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PORT_BINDING_TYPE__TARGET, oldTarget,
                    this.target));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case LqnPackage.PORT_BINDING_TYPE__SOURCE:
            return this.getSource();
        case LqnPackage.PORT_BINDING_TYPE__TARGET:
            return this.getTarget();
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
        switch (featureID) {
        case LqnPackage.PORT_BINDING_TYPE__SOURCE:
            this.setSource((String) newValue);
            return;
        case LqnPackage.PORT_BINDING_TYPE__TARGET:
            this.setTarget((String) newValue);
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
        case LqnPackage.PORT_BINDING_TYPE__SOURCE:
            this.setSource(SOURCE_EDEFAULT);
            return;
        case LqnPackage.PORT_BINDING_TYPE__TARGET:
            this.setTarget(TARGET_EDEFAULT);
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
        case LqnPackage.PORT_BINDING_TYPE__SOURCE:
            return SOURCE_EDEFAULT == null ? this.source != null : !SOURCE_EDEFAULT.equals(this.source);
        case LqnPackage.PORT_BINDING_TYPE__TARGET:
            return TARGET_EDEFAULT == null ? this.target != null : !TARGET_EDEFAULT.equals(this.target);
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
        result.append(" (source: ");
        result.append(this.source);
        result.append(", target: ");
        result.append(this.target);
        result.append(')');
        return result.toString();
    }

} // PortBindingTypeImpl
