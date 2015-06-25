/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedCommunication;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ServiceExecutionContext;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aggregated Communication</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedCommunicationImpl#getAverageMessageSize
 * <em>Average Message Size</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedCommunicationImpl#getAverageMessageFrequency
 * <em>Average Message Frequency</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedCommunicationImpl#getReceiver_AggregatedCommunication
 * <em>Receiver Aggregated Communication</em>}</li>
 * <li>
 * {@link org.palladiosimulator.solver.context.aggregatedUsageContext.impl.AggregatedCommunicationImpl#getUsedCommunicationLinkResourceSpecification_AggregatedCommunication
 * <em>Used Communication Link Resource Specification Aggregated Communication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedCommunicationImpl extends EObjectImpl implements AggregatedCommunication {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * The default value of the '{@link #getAverageMessageSize() <em>Average Message Size</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAverageMessageSize()
     * @generated
     * @ordered
     */
    protected static final double AVERAGE_MESSAGE_SIZE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAverageMessageSize() <em>Average Message Size</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAverageMessageSize()
     * @generated
     * @ordered
     */
    protected double averageMessageSize = AVERAGE_MESSAGE_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getAverageMessageFrequency()
     * <em>Average Message Frequency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAverageMessageFrequency()
     * @generated
     * @ordered
     */
    protected static final double AVERAGE_MESSAGE_FREQUENCY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAverageMessageFrequency()
     * <em>Average Message Frequency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAverageMessageFrequency()
     * @generated
     * @ordered
     */
    protected double averageMessageFrequency = AVERAGE_MESSAGE_FREQUENCY_EDEFAULT;

    /**
     * The cached value of the '{@link #getReceiver_AggregatedCommunication()
     * <em>Receiver Aggregated Communication</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getReceiver_AggregatedCommunication()
     * @generated
     * @ordered
     */
    protected ServiceExecutionContext receiver_AggregatedCommunication;

    /**
     * The cached value of the '
     * {@link #getUsedCommunicationLinkResourceSpecification_AggregatedCommunication()
     * <em>Used Communication Link Resource Specification Aggregated Communication</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsedCommunicationLinkResourceSpecification_AggregatedCommunication()
     * @generated
     * @ordered
     */
    protected CommunicationLinkResourceSpecification usedCommunicationLinkResourceSpecification_AggregatedCommunication;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AggregatedCommunicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AggregatedUsageContextPackage.Literals.AGGREGATED_COMMUNICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getAverageMessageSize() {
        return this.averageMessageSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAverageMessageSize(final double newAverageMessageSize) {
        final double oldAverageMessageSize = this.averageMessageSize;
        this.averageMessageSize = newAverageMessageSize;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE,
                    oldAverageMessageSize, this.averageMessageSize));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getAverageMessageFrequency() {
        return this.averageMessageFrequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAverageMessageFrequency(final double newAverageMessageFrequency) {
        final double oldAverageMessageFrequency = this.averageMessageFrequency;
        this.averageMessageFrequency = newAverageMessageFrequency;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY,
                    oldAverageMessageFrequency, this.averageMessageFrequency));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceExecutionContext getReceiver_AggregatedCommunication() {
        if (this.receiver_AggregatedCommunication != null && this.receiver_AggregatedCommunication.eIsProxy())
        {
            final InternalEObject oldReceiver_AggregatedCommunication = (InternalEObject) this.receiver_AggregatedCommunication;
            this.receiver_AggregatedCommunication = (ServiceExecutionContext) this
                    .eResolveProxy(oldReceiver_AggregatedCommunication);
            if (this.receiver_AggregatedCommunication != oldReceiver_AggregatedCommunication)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION,
                            oldReceiver_AggregatedCommunication, this.receiver_AggregatedCommunication));
                }
            }
        }
        return this.receiver_AggregatedCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceExecutionContext basicGetReceiver_AggregatedCommunication() {
        return this.receiver_AggregatedCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetReceiver_AggregatedCommunication(
            final ServiceExecutionContext newReceiver_AggregatedCommunication, NotificationChain msgs) {
        final ServiceExecutionContext oldReceiver_AggregatedCommunication = this.receiver_AggregatedCommunication;
        this.receiver_AggregatedCommunication = newReceiver_AggregatedCommunication;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION,
                    oldReceiver_AggregatedCommunication, newReceiver_AggregatedCommunication);
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
    public void setReceiver_AggregatedCommunication(final ServiceExecutionContext newReceiver_AggregatedCommunication) {
        if (newReceiver_AggregatedCommunication != this.receiver_AggregatedCommunication)
        {
            NotificationChain msgs = null;
            if (this.receiver_AggregatedCommunication != null) {
                msgs = ((InternalEObject) this.receiver_AggregatedCommunication)
                        .eInverseRemove(
                                this,
                                AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION,
                                ServiceExecutionContext.class, msgs);
            }
            if (newReceiver_AggregatedCommunication != null) {
                msgs = ((InternalEObject) newReceiver_AggregatedCommunication)
                        .eInverseAdd(
                                this,
                                AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION,
                                ServiceExecutionContext.class, msgs);
            }
            msgs = this.basicSetReceiver_AggregatedCommunication(newReceiver_AggregatedCommunication, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION,
                    newReceiver_AggregatedCommunication, newReceiver_AggregatedCommunication));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CommunicationLinkResourceSpecification getUsedCommunicationLinkResourceSpecification_AggregatedCommunication() {
        if (this.usedCommunicationLinkResourceSpecification_AggregatedCommunication != null
                && ((EObject) this.usedCommunicationLinkResourceSpecification_AggregatedCommunication).eIsProxy())
        {
            final InternalEObject oldUsedCommunicationLinkResourceSpecification_AggregatedCommunication = (InternalEObject) this.usedCommunicationLinkResourceSpecification_AggregatedCommunication;
            this.usedCommunicationLinkResourceSpecification_AggregatedCommunication = (CommunicationLinkResourceSpecification) this
                    .eResolveProxy(oldUsedCommunicationLinkResourceSpecification_AggregatedCommunication);
            if (this.usedCommunicationLinkResourceSpecification_AggregatedCommunication != oldUsedCommunicationLinkResourceSpecification_AggregatedCommunication)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(
                            this,
                            Notification.RESOLVE,
                            AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION,
                            oldUsedCommunicationLinkResourceSpecification_AggregatedCommunication,
                            this.usedCommunicationLinkResourceSpecification_AggregatedCommunication));
                }
            }
        }
        return this.usedCommunicationLinkResourceSpecification_AggregatedCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CommunicationLinkResourceSpecification basicGetUsedCommunicationLinkResourceSpecification_AggregatedCommunication() {
        return this.usedCommunicationLinkResourceSpecification_AggregatedCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsedCommunicationLinkResourceSpecification_AggregatedCommunication(
            final CommunicationLinkResourceSpecification newUsedCommunicationLinkResourceSpecification_AggregatedCommunication) {
        final CommunicationLinkResourceSpecification oldUsedCommunicationLinkResourceSpecification_AggregatedCommunication = this.usedCommunicationLinkResourceSpecification_AggregatedCommunication;
        this.usedCommunicationLinkResourceSpecification_AggregatedCommunication = newUsedCommunicationLinkResourceSpecification_AggregatedCommunication;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION,
                    oldUsedCommunicationLinkResourceSpecification_AggregatedCommunication,
                    this.usedCommunicationLinkResourceSpecification_AggregatedCommunication));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID)
        {
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION:
            if (this.receiver_AggregatedCommunication != null) {
                msgs = ((InternalEObject) this.receiver_AggregatedCommunication)
                        .eInverseRemove(
                                this,
                                AggregatedUsageContextPackage.SERVICE_EXECUTION_CONTEXT__RECEIVED_AGGREGATED_COMMUNICATION_AGGREGATED_COMMUNICATION,
                                ServiceExecutionContext.class, msgs);
            }
            return this.basicSetReceiver_AggregatedCommunication((ServiceExecutionContext) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
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
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION:
            return this.basicSetReceiver_AggregatedCommunication(null, msgs);
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
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE:
            return this.getAverageMessageSize();
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY:
            return this.getAverageMessageFrequency();
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION:
            if (resolve) {
                return this.getReceiver_AggregatedCommunication();
            }
            return this.basicGetReceiver_AggregatedCommunication();
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION:
            if (resolve) {
                return this.getUsedCommunicationLinkResourceSpecification_AggregatedCommunication();
            }
            return this.basicGetUsedCommunicationLinkResourceSpecification_AggregatedCommunication();
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
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE:
            this.setAverageMessageSize((Double) newValue);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY:
            this.setAverageMessageFrequency((Double) newValue);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION:
            this.setReceiver_AggregatedCommunication((ServiceExecutionContext) newValue);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION:
            this.setUsedCommunicationLinkResourceSpecification_AggregatedCommunication((CommunicationLinkResourceSpecification) newValue);
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
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE:
            this.setAverageMessageSize(AVERAGE_MESSAGE_SIZE_EDEFAULT);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY:
            this.setAverageMessageFrequency(AVERAGE_MESSAGE_FREQUENCY_EDEFAULT);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION:
            this.setReceiver_AggregatedCommunication((ServiceExecutionContext) null);
            return;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION:
            this.setUsedCommunicationLinkResourceSpecification_AggregatedCommunication((CommunicationLinkResourceSpecification) null);
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
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_SIZE:
            return this.averageMessageSize != AVERAGE_MESSAGE_SIZE_EDEFAULT;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__AVERAGE_MESSAGE_FREQUENCY:
            return this.averageMessageFrequency != AVERAGE_MESSAGE_FREQUENCY_EDEFAULT;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__RECEIVER_AGGREGATED_COMMUNICATION:
            return this.receiver_AggregatedCommunication != null;
        case AggregatedUsageContextPackage.AGGREGATED_COMMUNICATION__USED_COMMUNICATION_LINK_RESOURCE_SPECIFICATION_AGGREGATED_COMMUNICATION:
            return this.usedCommunicationLinkResourceSpecification_AggregatedCommunication != null;
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
        result.append(" (averageMessageSize: ");
        result.append(this.averageMessageSize);
        result.append(", averageMessageFrequency: ");
        result.append(this.averageMessageFrequency);
        result.append(')');
        return result.toString();
    }

} // AggregatedCommunicationImpl
