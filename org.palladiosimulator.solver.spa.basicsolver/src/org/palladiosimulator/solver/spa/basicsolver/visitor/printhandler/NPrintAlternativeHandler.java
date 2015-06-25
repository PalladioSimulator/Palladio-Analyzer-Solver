/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor.printhandler;

import org.palladiosimulator.solver.spa.basicsolver.visitor.AlternativeHandler;
import org.palladiosimulator.solver.spa.expression.Alternative;

/**
 * @author Ihssane
 *
 */
public class NPrintAlternativeHandler implements AlternativeHandler {

    public void handle(Alternative alt) {
        // alt.setResult("(" + alt.getLeftRegExp().getResult()+ alt
        // .getRightRegExp().getResult()
        // + ")");
        System.out.print("|");
    }

}
