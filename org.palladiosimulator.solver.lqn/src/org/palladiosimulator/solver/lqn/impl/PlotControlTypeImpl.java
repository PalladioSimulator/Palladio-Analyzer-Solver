/**
 */
package org.palladiosimulator.solver.lqn.impl;

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
import org.palladiosimulator.solver.lqn.FirstPlotType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.PlotControlType;
import org.palladiosimulator.solver.lqn.PlotType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Plot Control Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PlotControlTypeImpl#getFirstPlot <em>First Plot
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PlotControlTypeImpl#getPlot <em>Plot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlotControlTypeImpl extends MinimalEObjectImpl.Container implements PlotControlType {
    /**
     * The cached value of the '{@link #getFirstPlot() <em>First Plot</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFirstPlot()
     * @generated
     * @ordered
     */
    protected FirstPlotType firstPlot;

    /**
     * The cached value of the '{@link #getPlot() <em>Plot</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPlot()
     * @generated
     * @ordered
     */
    protected EList<PlotType> plot;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PlotControlTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.PLOT_CONTROL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FirstPlotType getFirstPlot() {
        return this.firstPlot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetFirstPlot(final FirstPlotType newFirstPlot, NotificationChain msgs) {
        final FirstPlotType oldFirstPlot = this.firstPlot;
        this.firstPlot = newFirstPlot;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, oldFirstPlot, newFirstPlot);
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
    public void setFirstPlot(final FirstPlotType newFirstPlot) {
        if (newFirstPlot != this.firstPlot)
        {
            NotificationChain msgs = null;
            if (this.firstPlot != null) {
                msgs = ((InternalEObject) this.firstPlot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, null, msgs);
            }
            if (newFirstPlot != null) {
                msgs = ((InternalEObject) newFirstPlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, null, msgs);
            }
            msgs = this.basicSetFirstPlot(newFirstPlot, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT,
                    newFirstPlot, newFirstPlot));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<PlotType> getPlot() {
        if (this.plot == null)
        {
            this.plot = new EObjectContainmentEList<PlotType>(PlotType.class, this, LqnPackage.PLOT_CONTROL_TYPE__PLOT);
        }
        return this.plot;
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
        case LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
            return this.basicSetFirstPlot(null, msgs);
        case LqnPackage.PLOT_CONTROL_TYPE__PLOT:
            return ((InternalEList<?>) this.getPlot()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
            return this.getFirstPlot();
        case LqnPackage.PLOT_CONTROL_TYPE__PLOT:
            return this.getPlot();
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
        case LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
            this.setFirstPlot((FirstPlotType) newValue);
            return;
        case LqnPackage.PLOT_CONTROL_TYPE__PLOT:
            this.getPlot().clear();
            this.getPlot().addAll((Collection<? extends PlotType>) newValue);
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
        case LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
            this.setFirstPlot((FirstPlotType) null);
            return;
        case LqnPackage.PLOT_CONTROL_TYPE__PLOT:
            this.getPlot().clear();
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
        case LqnPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
            return this.firstPlot != null;
        case LqnPackage.PLOT_CONTROL_TYPE__PLOT:
            return this.plot != null && !this.plot.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // PlotControlTypeImpl
