package org.palladiosimulator.solver.core.utils;

import java.text.ParseException;

import org.palladiosimulator.pcm.stoex.api.StoExParser;

import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.ManagedPMF;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;

/**
 * Utility class for parsing PMFs from a serialized StoEx.
 */
public final class ManagedPMFParser {

    private static final StoExParser STOEX_PARSER = StoExParser.createInstance();
    
    private ManagedPMFParser() {
        // intentionally left blank
    }

    /**
     * Parses a PMF and creates an instance of {@link ManagedPMF}.
     * 
     * @param serializedStoEx
     *            the serialized StoEx
     * @return The {@link ManagedPMF} instance
     * @throws StringNotPMFException
     *             thrown if the StoEx syntax is invalid or does not represent a PMF.
     */
    public static ManagedPMF createFromString(String serializedStoEx) throws StringNotPMFException {
        Expression parsedStoEx;
        try {
            parsedStoEx = STOEX_PARSER.parse(serializedStoEx);
        } catch (ParseException e) {
            throw new StringNotPMFException(e.getMessage());
        }
        if (!(parsedStoEx instanceof ProbabilityFunctionLiteral)) {
            throw new StringNotPMFException();
        }
        ProbabilityFunctionLiteral pmfLiteral = (ProbabilityFunctionLiteral) parsedStoEx;
        if (!(pmfLiteral.getFunction_ProbabilityFunctionLiteral() instanceof ProbabilityMassFunction)) {
            throw new StringNotPMFException();
        }
        ProbabilityMassFunction pmf = (ProbabilityMassFunction) pmfLiteral.getFunction_ProbabilityFunctionLiteral();
        return new ManagedPMF(pmf);
    }

}
