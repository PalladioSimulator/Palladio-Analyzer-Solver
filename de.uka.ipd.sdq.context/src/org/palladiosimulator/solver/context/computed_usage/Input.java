/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.computed_usage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.parameter.VariableUsage;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Input</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.solver.context.computed_usage.Input#getParameterChacterisations_Input
 * <em>Parameter Chacterisations Input</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * Returns the value of the '<em><b>Parameter Chacterisations Input</b></em>' containment
     * reference list. The list contents are of type
     * {@link org.palladiosimulator.pcm.parameter.VariableUsage}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Chacterisations Input</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Parameter Chacterisations Input</em>' containment reference
     *         list.
     * @see org.palladiosimulator.solver.context.computed_usage.ComputedUsagePackage#getInput_ParameterChacterisations_Input()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<VariableUsage> getParameterChacterisations_Input();

} // Input
