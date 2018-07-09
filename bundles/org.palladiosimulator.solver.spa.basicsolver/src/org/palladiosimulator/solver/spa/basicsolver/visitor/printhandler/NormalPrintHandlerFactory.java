/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor.printhandler;

import org.palladiosimulator.solver.spa.basicsolver.visitor.AlternativeHandler;
import org.palladiosimulator.solver.spa.basicsolver.visitor.HandlerFactory;
import org.palladiosimulator.solver.spa.basicsolver.visitor.LoopHandler;
import org.palladiosimulator.solver.spa.basicsolver.visitor.SequenceHandler;
import org.palladiosimulator.solver.spa.basicsolver.visitor.SymbolHandler;

/**
 * @author Ihssane
 *
 */
public class NormalPrintHandlerFactory implements HandlerFactory {

    public SymbolHandler createSymbolHandler() {
        return new NPrintSymbolHandler();
    }

    public SequenceHandler createSequenceHandler() {
        return new NPrintSequenceHandler();
    }

    public AlternativeHandler createAlternativeHandler() {
        return new NPrintAlternativeHandler();
    }

    public LoopHandler createLoopHandler() {
        return new NPrintLoopHandler();
    }

}
