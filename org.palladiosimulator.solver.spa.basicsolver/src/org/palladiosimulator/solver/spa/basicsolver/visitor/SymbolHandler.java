/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor;

import org.palladiosimulator.solver.spa.expression.Symbol;

/**
 * A Terminal handler is responsible for handling Terminal instances.
 * 
 * @author Ihssane
 *
 */
public interface SymbolHandler {

    public void handle(Symbol symbol) throws Exception;
}
