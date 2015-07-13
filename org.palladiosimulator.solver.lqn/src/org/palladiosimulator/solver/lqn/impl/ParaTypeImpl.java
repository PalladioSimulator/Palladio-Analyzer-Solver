/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.ParaType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Para Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ParaTypeImpl#getStartValue <em>Start Value</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ParaTypeImpl#getEndValue <em>End Value</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ParaTypeImpl#getStepValue <em>Step Value</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.ParaTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParaTypeImpl extends MinimalEObjectImpl.Container implements ParaType {
    /**
     * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStartValue()
     * @generated
     * @ordered
     */
    protected static final int START_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStartValue()
     * @generated
     * @ordered
     */
    protected int startValue = START_VALUE_EDEFAULT;

    /**
     * This is true if the Start Value attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean startValueESet;

    /**
     * The default value of the '{@link #getEndValue() <em>End Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEndValue()
     * @generated
     * @ordered
     */
    protected static final int END_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getEndValue() <em>End Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEndValue()
     * @generated
     * @ordered
     */
    protected int endValue = END_VALUE_EDEFAULT;

    /**
     * This is true if the End Value attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean endValueESet;

    /**
     * The default value of the '{@link #getStepValue() <em>Step Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStepValue()
     * @generated
     * @ordered
     */
    protected static final int STEP_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStepValue() <em>Step Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStepValue()
     * @generated
     * @ordered
     */
    protected int stepValue = STEP_VALUE_EDEFAULT;

    /**
     * This is true if the Step Value attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean stepValueESet;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected EList<Integer> value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ParaTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.PARA_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getStartValue() {
        return this.startValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStartValue(final int newStartValue) {
        final int oldStartValue = this.startValue;
        this.startValue = newStartValue;
        final boolean oldStartValueESet = this.startValueESet;
        this.startValueESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PARA_TYPE__START_VALUE,
                    oldStartValue,
                    this.startValue, !oldStartValueESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetStartValue() {
        final int oldStartValue = this.startValue;
        final boolean oldStartValueESet = this.startValueESet;
        this.startValue = START_VALUE_EDEFAULT;
        this.startValueESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PARA_TYPE__START_VALUE,
                    oldStartValue,
                    START_VALUE_EDEFAULT, oldStartValueESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetStartValue() {
        return this.startValueESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getEndValue() {
        return this.endValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEndValue(final int newEndValue) {
        final int oldEndValue = this.endValue;
        this.endValue = newEndValue;
        final boolean oldEndValueESet = this.endValueESet;
        this.endValueESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PARA_TYPE__END_VALUE, oldEndValue,
                    this.endValue, !oldEndValueESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetEndValue() {
        final int oldEndValue = this.endValue;
        final boolean oldEndValueESet = this.endValueESet;
        this.endValue = END_VALUE_EDEFAULT;
        this.endValueESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PARA_TYPE__END_VALUE, oldEndValue,
                    END_VALUE_EDEFAULT, oldEndValueESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetEndValue() {
        return this.endValueESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getStepValue() {
        return this.stepValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStepValue(final int newStepValue) {
        final int oldStepValue = this.stepValue;
        this.stepValue = newStepValue;
        final boolean oldStepValueESet = this.stepValueESet;
        this.stepValueESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PARA_TYPE__STEP_VALUE, oldStepValue,
                    this.stepValue, !oldStepValueESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetStepValue() {
        final int oldStepValue = this.stepValue;
        final boolean oldStepValueESet = this.stepValueESet;
        this.stepValue = STEP_VALUE_EDEFAULT;
        this.stepValueESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.PARA_TYPE__STEP_VALUE,
                    oldStepValue,
                    STEP_VALUE_EDEFAULT, oldStepValueESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetStepValue() {
        return this.stepValueESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Integer> getValue() {
        if (this.value == null)
        {
            this.value = new EDataTypeEList<Integer>(Integer.class, this, LqnPackage.PARA_TYPE__VALUE);
        }
        return this.value;
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
        case LqnPackage.PARA_TYPE__START_VALUE:
            return this.getStartValue();
        case LqnPackage.PARA_TYPE__END_VALUE:
            return this.getEndValue();
        case LqnPackage.PARA_TYPE__STEP_VALUE:
            return this.getStepValue();
        case LqnPackage.PARA_TYPE__VALUE:
            return this.getValue();
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
        case LqnPackage.PARA_TYPE__START_VALUE:
            this.setStartValue((Integer) newValue);
            return;
        case LqnPackage.PARA_TYPE__END_VALUE:
            this.setEndValue((Integer) newValue);
            return;
        case LqnPackage.PARA_TYPE__STEP_VALUE:
            this.setStepValue((Integer) newValue);
            return;
        case LqnPackage.PARA_TYPE__VALUE:
            this.getValue().clear();
            this.getValue().addAll((Collection<? extends Integer>) newValue);
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
        case LqnPackage.PARA_TYPE__START_VALUE:
            this.unsetStartValue();
            return;
        case LqnPackage.PARA_TYPE__END_VALUE:
            this.unsetEndValue();
            return;
        case LqnPackage.PARA_TYPE__STEP_VALUE:
            this.unsetStepValue();
            return;
        case LqnPackage.PARA_TYPE__VALUE:
            this.getValue().clear();
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
        case LqnPackage.PARA_TYPE__START_VALUE:
            return this.isSetStartValue();
        case LqnPackage.PARA_TYPE__END_VALUE:
            return this.isSetEndValue();
        case LqnPackage.PARA_TYPE__STEP_VALUE:
            return this.isSetStepValue();
        case LqnPackage.PARA_TYPE__VALUE:
            return this.value != null && !this.value.isEmpty();
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
        result.append(" (startValue: ");
        if (this.startValueESet) {
            result.append(this.startValue);
        } else {
            result.append("<unset>");
        }
        result.append(", endValue: ");
        if (this.endValueESet) {
            result.append(this.endValue);
        } else {
            result.append("<unset>");
        }
        result.append(", stepValue: ");
        if (this.stepValueESet) {
            result.append(this.stepValue);
        } else {
            result.append("<unset>");
        }
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

} // ParaTypeImpl
