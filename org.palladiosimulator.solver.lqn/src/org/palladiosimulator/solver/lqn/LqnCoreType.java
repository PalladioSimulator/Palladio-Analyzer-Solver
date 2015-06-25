/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Core Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnCoreType#getProcessor <em>Processor</em>}</li>
 * <li>{@link org.palladiosimulator.solver.lqn.LqnCoreType#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnCoreType()
 * @model extendedMetaData="name='Lqn-CoreType' kind='elementOnly'"
 * @generated
 */
public interface LqnCoreType extends EObject {

    /**
     * Returns the value of the '<em><b>Processor</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.solver.lqn.ProcessorType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processor</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Processor</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnCoreType_Processor()
     * @model containment="true" required="true" extendedMetaData=
     *        "kind='element' name='processor' namespace='##targetNamespace'"
     * @generated
     */
    EList<ProcessorType> getProcessor();

    /**
     * Returns the value of the '<em><b>Slot</b></em>' containment reference list. The list contents
     * are of type {@link org.palladiosimulator.solver.lqn.SlotType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Slot</em>' containment reference list.
     * @see org.palladiosimulator.solver.lqn.LqnPackage#getLqnCoreType_Slot()
     * @model containment="true" extendedMetaData=
     *        "kind='element' name='slot' namespace='##targetNamespace'"
     * @generated
     */
    EList<SlotType> getSlot();

} // LqnCoreType
