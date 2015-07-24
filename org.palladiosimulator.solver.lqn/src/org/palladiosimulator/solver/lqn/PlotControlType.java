/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Plot Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.solver.lqn.PlotControlType#getFirstPlot <em>First Plot</em>}</li>
 *   <li>{@link org.palladiosimulator.solver.lqn.PlotControlType#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getPlotControlType()
 * @model extendedMetaData="name='plot-control_._type' kind='elementOnly'"
 * @generated
 */
public interface PlotControlType extends EObject {
	/**
	 * Returns the value of the '<em><b>First Plot</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Plot</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>First Plot</em>' containment reference.
	 * @see #setFirstPlot(FirstPlotType)
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getPlotControlType_FirstPlot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='first-plot' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstPlotType getFirstPlot();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.solver.lqn.PlotControlType#getFirstPlot <em>First Plot</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Plot</em>' containment reference.
	 * @see #getFirstPlot()
	 * @generated
	 */
	void setFirstPlot(FirstPlotType value);

	/**
	 * Returns the value of the '<em><b>Plot</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.solver.lqn.PlotType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plot</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot</em>' containment reference list.
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#getPlotControlType_Plot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='plot' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlotType> getPlot();

} // PlotControlType
