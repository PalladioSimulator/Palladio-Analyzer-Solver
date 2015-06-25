/**
 */
package org.palladiosimulator.solver.spa.resourcemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.spa.resourcemodel.AlternativeResourceUsage#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage#getAlternativeResourceUsage()
 * @model
 * @generated
 */
public interface AlternativeResourceUsage extends AbstractResourceUsage {

    /**
     * Returns the value of the '<em><b>Options</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.solver.spa.resourcemodel.Option}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Options</em>' containment reference list.
     * @see org.palladiosimulator.solver.spa.resourcemodel.ResourceModelPackage#getAlternativeResourceUsage_Options()
     * @model type="org.palladiosimulator.solver.spa.resourcemodel.Option" containment="true"
     * @generated
     */
    EList getOptions();

} // AlternativeResourceUsage
