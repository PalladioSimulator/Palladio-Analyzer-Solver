package org.palladiosimulator.solver.reliability.sensitivity;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.reliability.InternalFailureOccurrenceDescription;
import org.palladiosimulator.pcm.reliability.ReliabilityFactory;
import org.palladiosimulator.pcm.reliability.SoftwareInducedFailureType;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterVariation;

/**
 * Provides sensitivity support to alter all software failure-on-demand probabilities of a given
 * SoftwareInducedFailureType.
 * 
 * @author brosch
 * 
 */
public class FailureTypeSensitivity extends MarkovSensitivity {

    /**
     * The list of base values of this sensitivity.
     */
    private List<Double> baseValues = null;

    /**
     * The list of affected internal failure occurrence descriptions.
     */
    private List<InternalFailureOccurrenceDescription> descriptions = null;

    /**
     * The IDs of the affected software-induced failure type.
     */
    private List<String> typeIds = null;

    /**
     * The constructor.
     * 
     * @param name
     *            the name of the sensitivity analysis
     * @param typeIds
     *            the IDs of the software-induced failure type
     * @param variation
     *            the parameter variation
     */
    public FailureTypeSensitivity(final String name, final List<String> typeIds,
            final DoubleParameterVariation variation) {

        // Initialize base variables:
        super(name, variation);

        // Store further information:
        this.typeIds = typeIds;
    }

    /**
     * Alters the model according to the next sensitivity analysis step.
     * 
     * @return indicates if the model could be successfully altered
     */
    protected boolean alterModel() {

        // Set the failure probability:
        for (int i = 0; i < descriptions.size(); i++) {
            descriptions.get(i).setFailureProbability(
                    calculator.calculateCurrentDoubleValue(getDoubleVariation(), getCurrentStepNumber(),
                            baseValues.get(i)));
        }

        // Everything ok:
        return true;
    }

    /**
     * Extracts the relevant sensitivity information from the given model.
     */
    protected void extractSensitivityInformation() {

        // Declare result lists:
        descriptions = new BasicEList<InternalFailureOccurrenceDescription>();
        baseValues = new ArrayList<Double>();

        // Retrieve all InternalActions in the PCM Repository:
        List<Repository> repositories = getModel().getRepositories();
        if (repositories.size() == 0) {
            // No repository found!
            LOGGER.error("No PCM Repositories found.");
            return;
        }

        // Search for the relevant failure type:
        for (Repository repository : repositories) {
            EList<EObject> failureTypes = helper.getElements(repository, ReliabilityFactory.eINSTANCE
                    .createSoftwareInducedFailureType().eClass());
            for (EObject object : failureTypes) {
                for (String typeId : typeIds) {
                    if (((SoftwareInducedFailureType) object).getId().equals(typeId)) {
                        for (InternalFailureOccurrenceDescription occurrenceDescription : ((SoftwareInducedFailureType) object)
                                .getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType()) {
                            descriptions.add(occurrenceDescription);
                            baseValues.add(occurrenceDescription.getFailureProbability());
                        }
                        break;
                    }
                }
            }
        }
        if (descriptions.size() == 0) {
            LOGGER.error("Did not find any FailureOccurrenceDescriptions for "
                    + "the specified SoftwareInducedFailureTypes");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.palladiosimulator.reliability.solver.sensitivity.MarkovSensitivity# getLogHeadingsMulti()
     */
    @Override
    protected List<List<String>> getLogHeadingsMulti() {

        // Create a result list:
        List<List<String>> resultList = new ArrayList<List<String>>();

        // Create the headings:
        ArrayList<String> headings = new ArrayList<String>();
        headings.add("Failure Probability");
        resultList.add(headings);

        // Return the result:
        return resultList;
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.palladiosimulator.reliability.solver.sensitivity.MarkovSensitivity#
     * getLogSingleResultsMulti()
     */
    @Override
    protected List<String> getLogSingleResultsMulti() {

        // Create a result list:
        List<String> resultList = new ArrayList<String>();

        // Create the result strings:
        resultList.add(calculator.getCurrentLogEntry(getDoubleVariation(), getCurrentStepNumber()));

        // Return the result:
        return resultList;
    }

}
