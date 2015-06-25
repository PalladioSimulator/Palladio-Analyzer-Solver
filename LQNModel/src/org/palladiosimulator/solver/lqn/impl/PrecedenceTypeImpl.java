/**
 */
package org.palladiosimulator.solver.lqn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.solver.lqn.ActivityListType;
import org.palladiosimulator.solver.lqn.ActivityLoopListType;
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.OrListType;
import org.palladiosimulator.solver.lqn.PrecedenceType;
import org.palladiosimulator.solver.lqn.SingleActivityListType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Precedence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPre <em>Pre</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPreOR <em>Pre OR</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPreAND <em>Pre AND</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPost <em>Post</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPostOR <em>Post OR</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPostAND <em>Post AND</em>}
 * </li>
 * <li>{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl#getPostLOOP
 * <em>Post LOOP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrecedenceTypeImpl extends EObjectImpl implements PrecedenceType {

    /**
     * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPre()
     * @generated
     * @ordered
     */
    protected SingleActivityListType pre;

    /**
     * The cached value of the '{@link #getPreOR() <em>Pre OR</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPreOR()
     * @generated
     * @ordered
     */
    protected ActivityListType preOR;

    /**
     * The cached value of the '{@link #getPreAND() <em>Pre AND</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPreAND()
     * @generated
     * @ordered
     */
    protected AndJoinListType preAND;

    /**
     * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPost()
     * @generated
     * @ordered
     */
    protected SingleActivityListType post;

    /**
     * The cached value of the '{@link #getPostOR() <em>Post OR</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPostOR()
     * @generated
     * @ordered
     */
    protected OrListType postOR;

    /**
     * The cached value of the '{@link #getPostAND() <em>Post AND</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPostAND()
     * @generated
     * @ordered
     */
    protected ActivityListType postAND;

    /**
     * The cached value of the '{@link #getPostLOOP() <em>Post LOOP</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPostLOOP()
     * @generated
     * @ordered
     */
    protected ActivityLoopListType postLOOP;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PrecedenceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LqnPackage.Literals.PRECEDENCE_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SingleActivityListType getPre() {
        return this.pre;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPre(final SingleActivityListType newPre, NotificationChain msgs) {
        final SingleActivityListType oldPre = this.pre;
        this.pre = newPre;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__PRE, oldPre, newPre);
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
    public void setPre(final SingleActivityListType newPre) {
        if (newPre != this.pre) {
            NotificationChain msgs = null;
            if (this.pre != null) {
                msgs = ((InternalEObject) this.pre).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__PRE, null, msgs);
            }
            if (newPre != null) {
                msgs = ((InternalEObject) newPre).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__PRE, null, msgs);
            }
            msgs = this.basicSetPre(newPre, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(
                    new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__PRE, newPre, newPre));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityListType getPreOR() {
        return this.preOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPreOR(final ActivityListType newPreOR, NotificationChain msgs) {
        final ActivityListType oldPreOR = this.preOR;
        this.preOR = newPreOR;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__PRE_OR, oldPreOR, newPreOR);
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
    public void setPreOR(final ActivityListType newPreOR) {
        if (newPreOR != this.preOR) {
            NotificationChain msgs = null;
            if (this.preOR != null) {
                msgs = ((InternalEObject) this.preOR).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__PRE_OR, null, msgs);
            }
            if (newPreOR != null) {
                msgs = ((InternalEObject) newPreOR).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__PRE_OR, null, msgs);
            }
            msgs = this.basicSetPreOR(newPreOR, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__PRE_OR, newPreOR,
                    newPreOR));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AndJoinListType getPreAND() {
        return this.preAND;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPreAND(final AndJoinListType newPreAND, NotificationChain msgs) {
        final AndJoinListType oldPreAND = this.preAND;
        this.preAND = newPreAND;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__PRE_AND, oldPreAND, newPreAND);
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
    public void setPreAND(final AndJoinListType newPreAND) {
        if (newPreAND != this.preAND) {
            NotificationChain msgs = null;
            if (this.preAND != null) {
                msgs = ((InternalEObject) this.preAND).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__PRE_AND, null, msgs);
            }
            if (newPreAND != null) {
                msgs = ((InternalEObject) newPreAND).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__PRE_AND, null, msgs);
            }
            msgs = this.basicSetPreAND(newPreAND, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__PRE_AND, newPreAND,
                    newPreAND));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SingleActivityListType getPost() {
        return this.post;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPost(final SingleActivityListType newPost, NotificationChain msgs) {
        final SingleActivityListType oldPost = this.post;
        this.post = newPost;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__POST, oldPost, newPost);
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
    public void setPost(final SingleActivityListType newPost) {
        if (newPost != this.post) {
            NotificationChain msgs = null;
            if (this.post != null) {
                msgs = ((InternalEObject) this.post).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST, null, msgs);
            }
            if (newPost != null) {
                msgs = ((InternalEObject) newPost).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST, null, msgs);
            }
            msgs = this.basicSetPost(newPost, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(
                    new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__POST, newPost, newPost));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OrListType getPostOR() {
        return this.postOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPostOR(final OrListType newPostOR, NotificationChain msgs) {
        final OrListType oldPostOR = this.postOR;
        this.postOR = newPostOR;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__POST_OR, oldPostOR, newPostOR);
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
    public void setPostOR(final OrListType newPostOR) {
        if (newPostOR != this.postOR) {
            NotificationChain msgs = null;
            if (this.postOR != null) {
                msgs = ((InternalEObject) this.postOR).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST_OR, null, msgs);
            }
            if (newPostOR != null) {
                msgs = ((InternalEObject) newPostOR).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST_OR, null, msgs);
            }
            msgs = this.basicSetPostOR(newPostOR, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__POST_OR, newPostOR,
                    newPostOR));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityListType getPostAND() {
        return this.postAND;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPostAND(final ActivityListType newPostAND, NotificationChain msgs) {
        final ActivityListType oldPostAND = this.postAND;
        this.postAND = newPostAND;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__POST_AND, oldPostAND, newPostAND);
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
    public void setPostAND(final ActivityListType newPostAND) {
        if (newPostAND != this.postAND) {
            NotificationChain msgs = null;
            if (this.postAND != null) {
                msgs = ((InternalEObject) this.postAND).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST_AND, null, msgs);
            }
            if (newPostAND != null) {
                msgs = ((InternalEObject) newPostAND).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST_AND, null, msgs);
            }
            msgs = this.basicSetPostAND(newPostAND, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__POST_AND, newPostAND,
                    newPostAND));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ActivityLoopListType getPostLOOP() {
        return this.postLOOP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetPostLOOP(final ActivityLoopListType newPostLOOP, NotificationChain msgs) {
        final ActivityLoopListType oldPostLOOP = this.postLOOP;
        this.postLOOP = newPostLOOP;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    LqnPackage.PRECEDENCE_TYPE__POST_LOOP, oldPostLOOP, newPostLOOP);
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
    public void setPostLOOP(final ActivityLoopListType newPostLOOP) {
        if (newPostLOOP != this.postLOOP) {
            NotificationChain msgs = null;
            if (this.postLOOP != null) {
                msgs = ((InternalEObject) this.postLOOP).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST_LOOP, null, msgs);
            }
            if (newPostLOOP != null) {
                msgs = ((InternalEObject) newPostLOOP).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE_TYPE__POST_LOOP, null, msgs);
            }
            msgs = this.basicSetPostLOOP(newPostLOOP, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE_TYPE__POST_LOOP,
                    newPostLOOP, newPostLOOP));
        }
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
        case LqnPackage.PRECEDENCE_TYPE__PRE:
            return this.basicSetPre(null, msgs);
        case LqnPackage.PRECEDENCE_TYPE__PRE_OR:
            return this.basicSetPreOR(null, msgs);
        case LqnPackage.PRECEDENCE_TYPE__PRE_AND:
            return this.basicSetPreAND(null, msgs);
        case LqnPackage.PRECEDENCE_TYPE__POST:
            return this.basicSetPost(null, msgs);
        case LqnPackage.PRECEDENCE_TYPE__POST_OR:
            return this.basicSetPostOR(null, msgs);
        case LqnPackage.PRECEDENCE_TYPE__POST_AND:
            return this.basicSetPostAND(null, msgs);
        case LqnPackage.PRECEDENCE_TYPE__POST_LOOP:
            return this.basicSetPostLOOP(null, msgs);
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
        case LqnPackage.PRECEDENCE_TYPE__PRE:
            return this.getPre();
        case LqnPackage.PRECEDENCE_TYPE__PRE_OR:
            return this.getPreOR();
        case LqnPackage.PRECEDENCE_TYPE__PRE_AND:
            return this.getPreAND();
        case LqnPackage.PRECEDENCE_TYPE__POST:
            return this.getPost();
        case LqnPackage.PRECEDENCE_TYPE__POST_OR:
            return this.getPostOR();
        case LqnPackage.PRECEDENCE_TYPE__POST_AND:
            return this.getPostAND();
        case LqnPackage.PRECEDENCE_TYPE__POST_LOOP:
            return this.getPostLOOP();
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
        case LqnPackage.PRECEDENCE_TYPE__PRE:
            this.setPre((SingleActivityListType) newValue);
            return;
        case LqnPackage.PRECEDENCE_TYPE__PRE_OR:
            this.setPreOR((ActivityListType) newValue);
            return;
        case LqnPackage.PRECEDENCE_TYPE__PRE_AND:
            this.setPreAND((AndJoinListType) newValue);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST:
            this.setPost((SingleActivityListType) newValue);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST_OR:
            this.setPostOR((OrListType) newValue);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST_AND:
            this.setPostAND((ActivityListType) newValue);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST_LOOP:
            this.setPostLOOP((ActivityLoopListType) newValue);
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
        case LqnPackage.PRECEDENCE_TYPE__PRE:
            this.setPre((SingleActivityListType) null);
            return;
        case LqnPackage.PRECEDENCE_TYPE__PRE_OR:
            this.setPreOR((ActivityListType) null);
            return;
        case LqnPackage.PRECEDENCE_TYPE__PRE_AND:
            this.setPreAND((AndJoinListType) null);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST:
            this.setPost((SingleActivityListType) null);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST_OR:
            this.setPostOR((OrListType) null);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST_AND:
            this.setPostAND((ActivityListType) null);
            return;
        case LqnPackage.PRECEDENCE_TYPE__POST_LOOP:
            this.setPostLOOP((ActivityLoopListType) null);
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
        case LqnPackage.PRECEDENCE_TYPE__PRE:
            return this.pre != null;
        case LqnPackage.PRECEDENCE_TYPE__PRE_OR:
            return this.preOR != null;
        case LqnPackage.PRECEDENCE_TYPE__PRE_AND:
            return this.preAND != null;
        case LqnPackage.PRECEDENCE_TYPE__POST:
            return this.post != null;
        case LqnPackage.PRECEDENCE_TYPE__POST_OR:
            return this.postOR != null;
        case LqnPackage.PRECEDENCE_TYPE__POST_AND:
            return this.postAND != null;
        case LqnPackage.PRECEDENCE_TYPE__POST_LOOP:
            return this.postLOOP != null;
        }
        return super.eIsSet(featureID);
    }

} // PrecedenceTypeImpl
