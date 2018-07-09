/**
 * 
 */
package org.palladiosimulator.solver.reliability.sensitivity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.reliability.SoftwareInducedFailureType;
import org.palladiosimulator.reliability.helper.EMFHelper;
import org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.CommunicationLinkReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterVariation;
import org.palladiosimulator.reliability.sensitivity.HardwareMTTFParameter;
import org.palladiosimulator.reliability.sensitivity.HardwareMTTRParameter;
import org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.NetworkReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter;
import org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter;
import org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation;
import org.palladiosimulator.reliability.sensitivity.SensitivityResultSpecification;
import org.palladiosimulator.reliability.sensitivity.SoftwareFailureTypesParameter;
import org.palladiosimulator.reliability.sensitivity.SoftwareReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.StringParameterSequence;
import org.palladiosimulator.reliability.sensitivity.UsageBranchParameter;
import org.palladiosimulator.reliability.sensitivity.VariableUsageParameter;

/**
 * Creates sensitivity information from a given input sensitivity model.
 * 
 * @author brosch
 * 
 */
public class MarkovSensitivityBuilder {

    /**
     * A LOGGER to give detailed information about the PCM instance traversal.
     */
    private static final Logger LOGGER = Logger.getLogger(MarkovSensitivityBuilder.class.getName());

    /**
     * Creates the sensitivity information.
     * 
     * @param sensitivityModelFileName
     *            the sensitivity model file name
     * @param sensitivityLogFileName
     *            the sensitivity log file name
     * @return
     */
    public MarkovSensitivity buildSensitivity(final String sensitivityModelFileName, final String sensitivityLogFileName) {
        SensitivityConfiguration sensitivityConfig = (SensitivityConfiguration) EMFHelper.loadFromXMIFile(
                sensitivityModelFileName, SensitivityPackage.eNS_URI, SensitivityPackage.eINSTANCE);
        return createMarkovSensitivity(sensitivityConfig.getSensitivityParameters__SensitivityConfiguration(),
                sensitivityConfig.getSensitivityResultSpecifications__SensitivityConfiguration(),
                sensitivityLogFileName);
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private ComponentSensitivity createComponentSensitivity(final ComponentReliabilityParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new ComponentSensitivity(parameter.getEntityName(), parameter
                    .getBasicComponent__ComponentReliabilityParameter().getId(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private FailureTypeSensitivity createFailureTypeSensitivity(final SoftwareFailureTypesParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            ArrayList<String> failureTypeIds = new ArrayList<String>();
            for (SoftwareInducedFailureType failureType : parameter
                    .getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter()) {
                failureTypeIds.add(failureType.getId());
            }
            return new FailureTypeSensitivity(parameter.getEntityName(), failureTypeIds,
                    (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private InternalActionSensitivity createInternalActionSensitivity(final InternalActionReliabilityParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new InternalActionSensitivity(parameter.getEntityName(), parameter
                    .getInternalAction__InternalActionReliabilityParameter().getId(), parameter
                    .getSoftwareInducedFailureType__InternalActionReliabilityParameter().getId(),
                    (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * Creates a Markov sensitivity object according to the given parameter.
     * 
     * @param parameter
     *            the sensitivity parameter
     * @param resultSpecifications
     *            the list of result specifications
     * @param logFileName
     *            the sensitivity log file name
     * @return the resulting Markov sensitivity object
     */
    private MarkovSensitivity createMarkovSensitivity(final SensitivityParameter parameter,
            EList<SensitivityResultSpecification> resultSpecifications, final String logFileName) {
        MarkovSensitivity result = null;
        if (parameter instanceof CombinedSensitivityParameter) {
            result = createMultiSensitivity((CombinedSensitivityParameter) parameter, resultSpecifications, logFileName);
        } else if (parameter instanceof CommunicationLinkReliabilityParameter) {
            LOGGER.error("Parameter type \"" + parameter.eClass().toString() + "\" not yet supported.");
            return null;
        } else if (parameter instanceof ComponentReliabilityParameter) {
            result = createComponentSensitivity((ComponentReliabilityParameter) parameter);
        } else if (parameter instanceof HardwareMTTFParameter) {
            result = createMTTFSensitivity((HardwareMTTFParameter) parameter);
        } else if (parameter instanceof HardwareMTTRParameter) {
            result = createMTTRSensitivity((HardwareMTTRParameter) parameter);
        } else if (parameter instanceof InternalActionReliabilityParameter) {
            result = createInternalActionSensitivity((InternalActionReliabilityParameter) parameter);
        } else if (parameter instanceof NetworkReliabilityParameter) {
            result = createNetworkSensitivity((NetworkReliabilityParameter) parameter);
        } else if (parameter instanceof ProbabilisticBranchParameter) {
            result = createProbabilisticBranchSensitivity((ProbabilisticBranchParameter) parameter);
        } else if (parameter instanceof ResourceMTTFParameter) {
            result = createResourceMTTFSensitivity((ResourceMTTFParameter) parameter);
        } else if (parameter instanceof ResourceMTTRParameter) {
            result = createResourceMTTRSensitivity((ResourceMTTRParameter) parameter);
        } else if (parameter instanceof SoftwareReliabilityParameter) {
            result = createSoftwareSensitivity((SoftwareReliabilityParameter) parameter);
        } else if (parameter instanceof VariableUsageParameter) {
            result = createVariableUsageSensitivity((VariableUsageParameter) parameter);
        } else if (parameter instanceof UsageBranchParameter) {
            result = createUsageBranchSensitivity((UsageBranchParameter) parameter);
        } else if (parameter instanceof SoftwareFailureTypesParameter) {
            result = createFailureTypeSensitivity((SoftwareFailureTypesParameter) parameter);
        } else {
            LOGGER.error("Parameter type \"" + parameter.eClass().toString() + "\" not yet supported.");
            return null;
        }
        result.setLogFileName(logFileName);
        result.setResultSpecifications(resultSpecifications);
        return result;
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private MTTFSensitivity createMTTFSensitivity(final HardwareMTTFParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new MTTFSensitivity(parameter.getEntityName(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private MTTRSensitivity createMTTRSensitivity(final HardwareMTTRParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new MTTRSensitivity(parameter.getEntityName(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @param resultSpecifications
     * @param logFileName
     * @return
     */
    private MultiSensitivity createMultiSensitivity(final CombinedSensitivityParameter parameter,
            EList<SensitivityResultSpecification> resultSpecifications, final String logFileName) {
        List<MarkovSensitivity> subSensitivities = new ArrayList<MarkovSensitivity>();
        for (SensitivityParameter subParameter : parameter.getChildParameters__CombinedSensitivityParameter()) {
            subSensitivities.add(createMarkovSensitivity(subParameter, resultSpecifications, logFileName));
        }
        return new MultiSensitivity(parameter.getEntityName(), subSensitivities, parameter.isCombinatory());
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private NetworkSensitivity createNetworkSensitivity(final NetworkReliabilityParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new NetworkSensitivity(parameter.getEntityName(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private ProbabilisticBranchSensitivity createProbabilisticBranchSensitivity(
            final ProbabilisticBranchParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new ProbabilisticBranchSensitivity(parameter.getEntityName(), parameter
                    .getProbabilisticBranchTransition__ProbabilisticBranchParameter().getId(),
                    (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private ResourceMTTFSensitivity createResourceMTTFSensitivity(final ResourceMTTFParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new ResourceMTTFSensitivity(parameter.getEntityName(), parameter
                    .getResourceContainer__ResourceMTTFParameter().getId(), parameter
                    .getProcessingResourceType__ResourceMTTFParameter().getId(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private ResourceMTTRSensitivity createResourceMTTRSensitivity(final ResourceMTTRParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new ResourceMTTRSensitivity(parameter.getEntityName(), parameter
                    .getResourceContainer__ResourceMTTRParameter().getId(), parameter
                    .getProcessingResourceType__ResourceMTTRParameter().getId(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private SoftwareSensitivity createSoftwareSensitivity(final SoftwareReliabilityParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new SoftwareSensitivity(parameter.getEntityName(), (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private UsageBranchSensitivity createUsageBranchSensitivity(final UsageBranchParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof DoubleParameterVariation) {
            return new UsageBranchSensitivity(parameter.getEntityName(), parameter.getBranch__UsageBranchParameter()
                    .getId(), parameter.getScenarioBehaviour__UsageBranchParameter().getId(),
                    (DoubleParameterVariation) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    private VariableUsageSensitivity createVariableUsageSensitivity(final VariableUsageParameter parameter) {
        SensitivityParameterVariation variation = parameter
                .getSensitivityParameterVariation__SingleSensitivityParameter();
        if (variation instanceof StringParameterSequence) {
            String paramId = null;
            switch (parameter.getVariableUsageType__VariableUsageParameter()) {
            case SYSTEM_CALL_INPUT:
                paramId = parameter.getEntryLevelSystemCall__VariableUsageParameter().getId();
                break;
            case COMPONENT_CONFIGURATION:
                paramId = parameter.getBasicComponent__VariableUsageParameter().getId();
                break;
            }
            return new VariableUsageSensitivity(parameter.getEntityName(), paramId, parameter.getVariableName(),
                    parameter.getVariableCharacterisationType__VariableUsageParameter(),
                    parameter.getVariableUsageType__VariableUsageParameter(), (StringParameterSequence) variation);
        } else {
            LOGGER.error("Parameter variation type \"" + variation.eClass().toString()
                    + "\" not supported for parameter type \"" + parameter.eClass().toString() + "\".");
            return null;
        }
    }
}
