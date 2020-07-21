package org.palladiosimulator.solver.utils;

import de.uka.ipd.sdq.probfunction.math.exception.ProbabilityFunctionException;

public class StringNotPMFException extends ProbabilityFunctionException {

    private static final long serialVersionUID = -295130429872106850L;

    public StringNotPMFException() {
        super();
    }

    public StringNotPMFException(String string) {
        super(string);
    }

}
