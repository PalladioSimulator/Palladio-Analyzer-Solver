/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor.printhandler;

import org.palladiosimulator.solver.spa.basicsolver.visitor.SequenceHandler;
import org.palladiosimulator.solver.spa.expression.Sequence;

/**
 * @author Ihssane
 *
 */
public class NPrintSequenceHandler implements SequenceHandler {

    public void handle(Sequence seq) {
        // seq.setResult(seq.getLeftRegExp().getResult()+ seq
        // .getRightRegExp().getResult());
        System.out.print(".");
    }

}
