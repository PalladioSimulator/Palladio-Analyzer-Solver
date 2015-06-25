/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Entry Activity Def Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getCallList <em>Call List</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getGroup <em>Group</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getSynchCall <em>Synch Call
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getAsynchCall <em>Asynch Call
 * </em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getFirstActivity <em>First
 * Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryActivityDefType()
 * @model extendedMetaData="name='EntryActivityDefType' kind='elementOnly'"
 * @generated
 */
public interface EntryActivityDefType extends ActivityDefBase {

    /**
     * Returns the value of the '<em><b>Call List</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.CallListType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call List</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Call List</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryActivityDefType_CallList()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='call-list' namespace='##targetNamespace'"
     * @generated
     */
    EList<CallListType> getCallList();

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list. The list contents are of
     * type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryActivityDefType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:11'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Synch Call</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ActivityMakingCallType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synch Call</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Synch Call</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryActivityDefType_SynchCall()
     * @model containment="true" transient="true" volatile="true" derived="true" extendedMetaData=
     *        "kind='element' name='synch-call' namespace='##targetNamespace' group='group:11'"
     * @generated
     */
    EList<ActivityMakingCallType> getSynchCall();

    /**
     * Returns the value of the '<em><b>Asynch Call</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ActivityMakingCallType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asynch Call</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Asynch Call</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryActivityDefType_AsynchCall()
     * @model containment="true" transient="true" volatile="true" derived="true" extendedMetaData=
     *        "kind='element' name='asynch-call' namespace='##targetNamespace' group='group:11'"
     * @generated
     */
    EList<ActivityMakingCallType> getAsynchCall();

    /**
     * Returns the value of the '<em><b>First Activity</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Activity</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>First Activity</em>' attribute.
     * @see #setFirstActivity(String)
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getEntryActivityDefType_FirstActivity()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='first-activity' namespace='##targetNamespace'"
     * @generated
     */
    String getFirstActivity();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getFirstActivity
     * <em>First Activity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>First Activity</em>' attribute.
     * @see #getFirstActivity()
     * @generated
     */
    void setFirstActivity(String value);

} // EntryActivityDefType
