/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor;

import org.palladiosimulator.solver.spa.expression.Sequence;

/**
 * A Sequence handler is responsible for handling Sequence instances.
 * 
 * @author Ihssane
 *
 */
public interface SequenceHandler {

    public void handle(Sequence seq) throws Exception;

}
