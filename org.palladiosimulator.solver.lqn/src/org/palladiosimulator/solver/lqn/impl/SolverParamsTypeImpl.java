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
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.PragmaType;
import org.palladiosimulator.solver.lqn.ResultGeneralType;
import org.palladiosimulator.solver.lqn.SolverParamsType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Solver Params Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getResultGeneral <em>Result
 * General</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getPragma <em>Pragma</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getComment <em>Comment
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getConvVal <em>Conv Val
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getItLimit <em>It Limit
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getPrintInt <em>Print Int
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl#getUnderrelaxCoeff <em>
 * Underrelax Coeff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolverParamsTypeImpl extends MinimalEObjectImpl.Container implements SolverParamsType {
    /**
     * The cached value of the '{@link #getResultGeneral() <em>Result General</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResultGeneral()
     * @generated
     * @ordered
     */
    protected ResultGeneralType resultGeneral;

    /**
     * The cached value of the '{@link #getPragma() <em>Pragma</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPragma()
     * @generated
     * @ordered
     */
    protected EList<PragmaType> pragma;

    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * This is true if the Comment attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     * @ordered
     */
    protected boolean commentESet;

    /**
     * The default value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConvVal()
     * @generated
     * @ordered
     */
    protected static final double CONV_VAL_EDEFAULT = 1.0;

    /**
     * The cached value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConvVal()
     * @generated
     * @ordered
     */
    protected double convVal = CONV_VAL_EDEFAULT;

    /**
     * This is true if the Conv Val attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean convValESet;

    /**
     * The default value of the '{@link #getItLimit() <em>It Limit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getItLimit()
     * @generated
     * @ordered
     */
    protected static final int IT_LIMIT_EDEFAULT = 50;

    /**
     * The cached value of the '{@link #getItLimit() <em>It Limit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getItLimit()
     * @generated
     * @ordered
     */
    protected int itLimit = IT_LIMIT_EDEFAULT;

    /**
     * This is true if the It Limit attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean itLimitESet;

    /**
     * The default value of the '{@link #getPrintInt() <em>Print Int</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPrintInt()
     * @generated
     * @ordered
     */
    protected static final int PRINT_INT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPrintInt() <em>Print Int</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPrintInt()
     * @generated
     * @ordered
     */
    protected int printInt = PRINT_INT_EDEFAULT;

    /**
     * This is true if the Print Int attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean printIntESet;

    /**
     * The default value of the '{@link #getUnderrelaxCoeff() <em>Underrelax Coeff</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUnderrelaxCoeff()
     * @generated
     * @ordered
     */
    protected static final double UNDERRELAX_COEFF_EDEFAULT = 0.9;

    /**
     * The cached value of the '{@link #getUnderrelaxCoeff() <em>Underrelax Coeff</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUnderrelaxCoeff()
     * @generated
     * @ordered
     */
    protected double underrelaxCoeff = UNDERRELAX_COEFF_EDEFAULT;

    /**
     * This is true if the Underrelax Coeff attribute has been set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean underrelaxCoeffESet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SolverParamsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.SOLVER_PARAMS_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultGeneralType getResultGeneral() {
        return this.resultGeneral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetResultGeneral(final ResultGeneralType newResultGeneral, NotificationChain msgs) {
        final ResultGeneralType oldResultGeneral = this.resultGeneral;
        this.resultGeneral = newResultGeneral;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, oldResultGeneral, newResultGeneral);
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
    public void setResultGeneral(final ResultGeneralType newResultGeneral) {
        if (newResultGeneral != this.resultGeneral)
        {
            NotificationChain msgs = null;
            if (this.resultGeneral != null) {
                msgs = ((InternalEObject) this.resultGeneral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, null, msgs);
            }
            if (newResultGeneral != null) {
                msgs = ((InternalEObject) newResultGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, null, msgs);
            }
            msgs = this.basicSetResultGeneral(newResultGeneral, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL,
                    newResultGeneral, newResultGeneral));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<PragmaType> getPragma() {
        if (this.pragma == null)
        {
            this.pragma = new EObjectContainmentEList<PragmaType>(PragmaType.class, this,
                    LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA);
        }
        return this.pragma;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setComment(final String newComment) {
        final String oldComment = this.comment;
        this.comment = newComment;
        final boolean oldCommentESet = this.commentESet;
        this.commentESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SOLVER_PARAMS_TYPE__COMMENT,
                    oldComment,
                    this.comment, !oldCommentESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetComment() {
        final String oldComment = this.comment;
        final boolean oldCommentESet = this.commentESet;
        this.comment = COMMENT_EDEFAULT;
        this.commentESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.SOLVER_PARAMS_TYPE__COMMENT,
                    oldComment,
                    COMMENT_EDEFAULT, oldCommentESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetComment() {
        return this.commentESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getConvVal() {
        return this.convVal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConvVal(final double newConvVal) {
        final double oldConvVal = this.convVal;
        this.convVal = newConvVal;
        final boolean oldConvValESet = this.convValESet;
        this.convValESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL,
                    oldConvVal,
                    this.convVal, !oldConvValESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetConvVal() {
        final double oldConvVal = this.convVal;
        final boolean oldConvValESet = this.convValESet;
        this.convVal = CONV_VAL_EDEFAULT;
        this.convValESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL,
                    oldConvVal, CONV_VAL_EDEFAULT, oldConvValESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetConvVal() {
        return this.convValESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getItLimit() {
        return this.itLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setItLimit(final int newItLimit) {
        final int oldItLimit = this.itLimit;
        this.itLimit = newItLimit;
        final boolean oldItLimitESet = this.itLimitESet;
        this.itLimitESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT,
                    oldItLimit,
                    this.itLimit, !oldItLimitESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetItLimit() {
        final int oldItLimit = this.itLimit;
        final boolean oldItLimitESet = this.itLimitESet;
        this.itLimit = IT_LIMIT_EDEFAULT;
        this.itLimitESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT,
                    oldItLimit, IT_LIMIT_EDEFAULT, oldItLimitESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetItLimit() {
        return this.itLimitESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getPrintInt() {
        return this.printInt;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPrintInt(final int newPrintInt) {
        final int oldPrintInt = this.printInt;
        this.printInt = newPrintInt;
        final boolean oldPrintIntESet = this.printIntESet;
        this.printIntESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT,
                    oldPrintInt, this.printInt, !oldPrintIntESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetPrintInt() {
        final int oldPrintInt = this.printInt;
        final boolean oldPrintIntESet = this.printIntESet;
        this.printInt = PRINT_INT_EDEFAULT;
        this.printIntESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET, LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT,
                    oldPrintInt, PRINT_INT_EDEFAULT, oldPrintIntESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetPrintInt() {
        return this.printIntESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getUnderrelaxCoeff() {
        return this.underrelaxCoeff;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUnderrelaxCoeff(final double newUnderrelaxCoeff) {
        final double oldUnderrelaxCoeff = this.underrelaxCoeff;
        this.underrelaxCoeff = newUnderrelaxCoeff;
        final boolean oldUnderrelaxCoeffESet = this.underrelaxCoeffESet;
        this.underrelaxCoeffESet = true;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF,
                    oldUnderrelaxCoeff, this.underrelaxCoeff, !oldUnderrelaxCoeffESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void unsetUnderrelaxCoeff() {
        final double oldUnderrelaxCoeff = this.underrelaxCoeff;
        final boolean oldUnderrelaxCoeffESet = this.underrelaxCoeffESet;
        this.underrelaxCoeff = UNDERRELAX_COEFF_EDEFAULT;
        this.underrelaxCoeffESet = false;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.UNSET,
                    LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF,
                    oldUnderrelaxCoeff, UNDERRELAX_COEFF_EDEFAULT, oldUnderrelaxCoeffESet));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isSetUnderrelaxCoeff() {
        return this.underrelaxCoeffESet;
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
        case LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
            return this.basicSetResultGeneral(null, msgs);
        case LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA:
            return ((InternalEList<?>) this.getPragma()).basicRemove(otherEnd, msgs);
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
        case LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
            return this.getResultGeneral();
        case LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA:
            return this.getPragma();
        case LqnPackage.SOLVER_PARAMS_TYPE__COMMENT:
            return this.getComment();
        case LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
            return this.getConvVal();
        case LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
            return this.getItLimit();
        case LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
            return this.getPrintInt();
        case LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
            return this.getUnderrelaxCoeff();
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
        case LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
            this.setResultGeneral((ResultGeneralType) newValue);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA:
            this.getPragma().clear();
            this.getPragma().addAll((Collection<? extends PragmaType>) newValue);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__COMMENT:
            this.setComment((String) newValue);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
            this.setConvVal((Double) newValue);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
            this.setItLimit((Integer) newValue);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
            this.setPrintInt((Integer) newValue);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
            this.setUnderrelaxCoeff((Double) newValue);
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
        case LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
            this.setResultGeneral((ResultGeneralType) null);
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA:
            this.getPragma().clear();
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__COMMENT:
            this.unsetComment();
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
            this.unsetConvVal();
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
            this.unsetItLimit();
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
            this.unsetPrintInt();
            return;
        case LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
            this.unsetUnderrelaxCoeff();
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
        case LqnPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
            return this.resultGeneral != null;
        case LqnPackage.SOLVER_PARAMS_TYPE__PRAGMA:
            return this.pragma != null && !this.pragma.isEmpty();
        case LqnPackage.SOLVER_PARAMS_TYPE__COMMENT:
            return this.isSetComment();
        case LqnPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
            return this.isSetConvVal();
        case LqnPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
            return this.isSetItLimit();
        case LqnPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
            return this.isSetPrintInt();
        case LqnPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
            return this.isSetUnderrelaxCoeff();
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
        result.append(" (comment: ");
        if (this.commentESet) {
            result.append(this.comment);
        } else {
            result.append("<unset>");
        }
        result.append(", convVal: ");
        if (this.convValESet) {
            result.append(this.convVal);
        } else {
            result.append("<unset>");
        }
        result.append(", itLimit: ");
        if (this.itLimitESet) {
            result.append(this.itLimit);
        } else {
            result.append("<unset>");
        }
        result.append(", printInt: ");
        if (this.printIntESet) {
            result.append(this.printInt);
        } else {
            result.append("<unset>");
        }
        result.append(", underrelaxCoeff: ");
        if (this.underrelaxCoeffESet) {
            result.append(this.underrelaxCoeff);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }

} // SolverParamsTypeImpl
