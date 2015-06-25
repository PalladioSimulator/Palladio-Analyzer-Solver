/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor;

import org.palladiosimulator.solver.spa.expression.Loop;

/**
 * A Loop handler is responsible for handling Loop instances.
 * 
 * @author Ihssane
 *
 */
public interface LoopHandler {

    public void handle(Loop loop) throws Exception;

}
