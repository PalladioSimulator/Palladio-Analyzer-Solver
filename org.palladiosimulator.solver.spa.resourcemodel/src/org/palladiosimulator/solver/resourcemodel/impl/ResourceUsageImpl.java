/**
 */
package org.palladiosimulator.solver.resourcemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.solver.resourcemodel.ActiveResource;
import org.palladiosimulator.solver.resourcemodel.ResourceModelPackage;
import org.palladiosimulator.solver.resourcemodel.ResourceUsage;

import de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.ResourceUsageImpl#getUsageTime
 * <em>Usage Time</em>}</li>
 * <li>{@link org.palladiosimulator.solver.resourcemodel.impl.ResourceUsageImpl#getResource
 * <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceUsageImpl extends AbstractResourceUsageImpl implements ResourceUsage {

    /**
     * The cached value of the '{@link #getUsageTime() <em>Usage Time</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUsageTime()
     * @generated
     * @ordered
     */
    protected ProbabilityDensityFunction usageTime;

    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected ActiveResource resource;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ResourceUsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceModelPackage.Literals.RESOURCE_USAGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbabilityDensityFunction getUsageTime() {
        return this.usageTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUsageTime(final ProbabilityDensityFunction newUsageTime, NotificationChain msgs) {
        final ProbabilityDensityFunction oldUsageTime = this.usageTime;
        this.usageTime = newUsageTime;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME, oldUsageTime, newUsageTime);
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
    public void setUsageTime(final ProbabilityDensityFunction newUsageTime) {
        if (newUsageTime != this.usageTime) {
            NotificationChain msgs = null;
            if (this.usageTime != null) {
                msgs = ((InternalEObject) this.usageTime).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME, null, msgs);
            }
            if (newUsageTime != null) {
                msgs = ((InternalEObject) newUsageTime).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME, null, msgs);
            }
            msgs = this.basicSetUsageTime(newUsageTime, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME,
                    newUsageTime, newUsageTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ActiveResource getResource() {
        if (this.resource != null && this.resource.eIsProxy()) {
            final InternalEObject oldResource = (InternalEObject) this.resource;
            this.resource = (ActiveResource) this.eResolveProxy(oldResource);
            if (this.resource != oldResource) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ResourceModelPackage.RESOURCE_USAGE__RESOURCE, oldResource, this.resource));
                }
            }
        }
        return this.resource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ActiveResource basicGetResource() {
        return this.resource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setResource(final ActiveResource newResource) {
        final ActiveResource oldResource = this.resource;
        this.resource = newResource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ResourceModelPackage.RESOURCE_USAGE__RESOURCE,
                    oldResource, this.resource));
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
        case ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME:
            return this.basicSetUsageTime(null, msgs);
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
        case ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME:
            return this.getUsageTime();
        case ResourceModelPackage.RESOURCE_USAGE__RESOURCE:
            if (resolve) {
                return this.getResource();
            }
            return this.basicGetResource();
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
        case ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME:
            this.setUsageTime((ProbabilityDensityFunction) newValue);
            return;
        case ResourceModelPackage.RESOURCE_USAGE__RESOURCE:
            this.setResource((ActiveResource) newValue);
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
        case ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME:
            this.setUsageTime((ProbabilityDensityFunction) null);
            return;
        case ResourceModelPackage.RESOURCE_USAGE__RESOURCE:
            this.setResource((ActiveResource) null);
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
        case ResourceModelPackage.RESOURCE_USAGE__USAGE_TIME:
            return this.usageTime != null;
        case ResourceModelPackage.RESOURCE_USAGE__RESOURCE:
            return this.resource != null;
        }
        return super.eIsSet(featureID);
    }

} // ResourceUsageImpl
