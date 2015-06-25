/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor;

import org.palladiosimulator.solver.spa.expression.Alternative;

/**
 * An Alternative handler is responsible for handling Alternative instances.
 * 
 * @author Ihssane
 *
 */
public interface AlternativeHandler {

    public void handle(Alternative alt) throws Exception;
}
