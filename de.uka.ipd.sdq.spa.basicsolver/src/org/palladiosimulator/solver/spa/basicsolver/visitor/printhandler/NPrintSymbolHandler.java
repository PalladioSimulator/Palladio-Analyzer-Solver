/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor.printhandler;

import org.palladiosimulator.solver.spa.basicsolver.visitor.SymbolHandler;
import org.palladiosimulator.solver.spa.expression.Symbol;

/**
 * @author Ihssane
 *
 */
public class NPrintSymbolHandler implements SymbolHandler {

    public void handle(Symbol symbol) {
        // terminal.setResult(terminal.getSymbol());
        System.out.print(symbol.getName());
    }

}
