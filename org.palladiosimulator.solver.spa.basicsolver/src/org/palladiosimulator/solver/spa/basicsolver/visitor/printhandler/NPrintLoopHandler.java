/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor.printhandler;

import org.palladiosimulator.solver.spa.basicsolver.visitor.LoopHandler;
import org.palladiosimulator.solver.spa.expression.Loop;

/**
 * @author Ihssane
 *
 */
public class NPrintLoopHandler implements LoopHandler {

    public void handle(Loop loop) {
        // loop.setResult("(" + loop.getRegExp().getResult() + ")*");
        System.out.print("*");
    }

}
