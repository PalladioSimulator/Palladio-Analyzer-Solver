/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.FirstPlotType;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>First Plot Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.FirstPlotTypeImpl#getVariable <em>Variable</em>}
 * </li>
 * </ul>
 *
 * @generated
 */
public class FirstPlotTypeImpl extends EObjectImpl implements FirstPlotType {

    /**
     * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected static final String VARIABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected String variable = VARIABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FirstPlotTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return lqnPackage.Literals.FIRST_PLOT_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getVariable() {
        return this.variable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setVariable(final String newVariable) {
        final String oldVariable = this.variable;
        this.variable = newVariable;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, lqnPackage.FIRST_PLOT_TYPE__VARIABLE,
                    oldVariable, this.variable));
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
        case lqnPackage.FIRST_PLOT_TYPE__VARIABLE:
            return this.getVariable();
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
        case lqnPackage.FIRST_PLOT_TYPE__VARIABLE:
            this.setVariable((String) newValue);
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
        case lqnPackage.FIRST_PLOT_TYPE__VARIABLE:
            this.setVariable(VARIABLE_EDEFAULT);
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
        case lqnPackage.FIRST_PLOT_TYPE__VARIABLE:
            return VARIABLE_EDEFAULT == null ? this.variable != null : !VARIABLE_EDEFAULT.equals(this.variable);
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
        result.append(" (variable: ");
        result.append(this.variable);
        result.append(')');
        return result.toString();
    }

} // FirstPlotTypeImpl
