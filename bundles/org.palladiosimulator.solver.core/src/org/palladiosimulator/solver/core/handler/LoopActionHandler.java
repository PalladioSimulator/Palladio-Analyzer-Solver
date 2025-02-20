/**
 * 
 */
package org.palladiosimulator.solver.core.handler;

import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.seff.LoopAction;
import org.palladiosimulator.solver.core.visitors.ExpressionHelper;
import org.palladiosimulator.solver.core.visitors.SeffVisitor;

/**
 * @author Koziolek
 *
 */
public class LoopActionHandler extends AbstractLoopActionHandler {
	
	private static Logger logger = Logger.getLogger(LoopActionHandler.class.getName());

	public LoopActionHandler(SeffVisitor seffVisitor) {
		super(seffVisitor);
	}

	public void handle(LoopAction loop) {
		String specification = loop.getIterationCount_LoopAction().getSpecification();
		String solvedSpecification = 
			ExpressionHelper.getSolvedExpressionAsString(specification, visitor.getContextWrapper());

		if (solvedSpecification == null){
			logger.error("Could not determine iterations specification. Skipping execution of loop body!");
			return;
		}
		
		logger.debug("NumberOfIterations: "+solvedSpecification);
		
		storeToUsageContext(loop, solvedSpecification);
		
		visitLoopBody(loop, solvedSpecification);
	}




}
