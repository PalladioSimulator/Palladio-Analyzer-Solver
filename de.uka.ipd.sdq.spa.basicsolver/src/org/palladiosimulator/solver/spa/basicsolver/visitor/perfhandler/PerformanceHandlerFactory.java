/**
 * 
 */
package org.palladiosimulator.solver.spa.basicsolver.visitor.perfhandler;

import java.util.Hashtable;

import org.palladiosimulator.solver.spa.basicsolver.visitor.HandlerFactory;
import org.palladiosimulator.solver.spa.expression.Expression;

import de.uka.ipd.sdq.probfunction.math.IProbabilityDensityFunction;

/**
 * @author Ihssane
 * 
 */
public class PerformanceHandlerFactory implements HandlerFactory {

    private Hashtable<Expression, IProbabilityDensityFunction> pdfTable;
    private int domainSize;

    public PerformanceHandlerFactory(int domainSize) {
        super();
        this.domainSize = domainSize;
        this.pdfTable = new Hashtable<Expression, IProbabilityDensityFunction>();
    }

    public PerformanceSymbolHandler createSymbolHandler() {
        return new PerformanceSymbolHandler(pdfTable, domainSize);
    }

    public PerformanceSequenceHandler createSequenceHandler() {
        return new PerformanceSequenceHandler(pdfTable);
    }

    public PerformanceAlternativeHandler createAlternativeHandler() {
        return new PerformanceAlternativeHandler(pdfTable);
    }

    public PerformanceLoopHandler createLoopHandler() {
        return new PerformanceLoopHandler(pdfTable);
    }

    public Hashtable<Expression, IProbabilityDensityFunction> getPdfTable() {
        return pdfTable;
    }
}
