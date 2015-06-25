package de.uka.ipd.sdq.spa.basicsolver;

import java.util.Hashtable;
import java.util.List;

import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.IProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.ManagedPDF;
import de.uka.ipd.sdq.probfunction.math.exception.ConfigurationNotSetException;
import de.uka.ipd.sdq.spa.basicsolver.operations.RUPerformanceOps;
import de.uka.ipd.sdq.spa.expression.Acquire;
import de.uka.ipd.sdq.spa.expression.Alternative;
import de.uka.ipd.sdq.spa.expression.Expression;
import de.uka.ipd.sdq.spa.expression.Loop;
import de.uka.ipd.sdq.spa.expression.Parallel;
import de.uka.ipd.sdq.spa.expression.Release;
import de.uka.ipd.sdq.spa.expression.Sequence;
import de.uka.ipd.sdq.spa.expression.Symbol;
import de.uka.ipd.sdq.spa.expression.util.ExpressionSwitch;
import de.uka.ipd.sdq.spa.resourcemodel.ActiveResource;
import de.uka.ipd.sdq.spa.resourcemodel.ResourceUsage;

public class PerformanceSolver {

    private final IProbabilityFunctionFactory pfFactory = IProbabilityFunctionFactory.eINSTANCE;

    private final RUPerformanceOps performanceOps;

    private final ExpressionSwitch exprSwitch = new ExpressionSwitch() {

        @Override
        public Object caseAcquire(final Acquire object) {
            System.err.println("Acquire ignored in performance computation!");
            return super.caseAcquire(object);
        }

        @SuppressWarnings("unchecked")
        @Override
        public Object caseAlternative(final Alternative object) {

            final Hashtable<ActiveResource, ManagedPDF> leftRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    object.getLeftOption().getRegexp());
            final Hashtable<ActiveResource, ManagedPDF> rightRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    object.getRightOption().getRegexp());
            final double leftProb = object.getLeftOption().getProbability();
            final double rightProb = object.getRightOption().getProbability();
            return PerformanceSolver.this.performanceOps.computeAlternative(leftRUs, leftProb, rightRUs, rightProb);
        }

        @SuppressWarnings("unchecked")
        @Override
        public Object caseLoop(final Loop loop) {
            final Hashtable<ActiveResource, ManagedPDF> innerRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    loop.getRegExp());
            final IProbabilityMassFunction iterations = PerformanceSolver.this.pfFactory
                    .transformToPMF(loop.getIterationsPMF());
            try {
                return PerformanceSolver.this.performanceOps.computeIteration(innerRUs, iterations);
            } catch (final ConfigurationNotSetException e) {
                e.printStackTrace();
                System.exit(-1);
                return null;
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Object caseParallel(final Parallel object) {
            final Hashtable<ActiveResource, ManagedPDF> leftRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    object.getLeftTask());
            final Hashtable<ActiveResource, ManagedPDF> rightRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    object.getRightTask());
            return PerformanceSolver.this.performanceOps.computeParallel(leftRUs, rightRUs);
        }

        @Override
        public Object caseRelease(final Release object) {
            System.err.println("Release ignored in performance prediction!");
            return super.caseRelease(object);
        }

        @SuppressWarnings("unchecked")
        @Override
        public Object caseSequence(final Sequence object) {
            final Hashtable<ActiveResource, ManagedPDF> leftRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    object.getLeftRegExp());
            final Hashtable<ActiveResource, ManagedPDF> rightRUs = (Hashtable<ActiveResource, ManagedPDF>) doSwitch(
                    object.getRightRegExp());
            return PerformanceSolver.this.performanceOps.computeSequence(leftRUs, rightRUs);
        }

        @Override
        public Object caseSymbol(final Symbol symbol) {
            final List<ResourceUsage> resourceUsageList = symbol.getResourceUsages();
            return PerformanceSolver.this.performanceOps.getResourceUsageTimes(resourceUsageList);
        }
    };

    public PerformanceSolver(final RUPerformanceOps performanceOps) {
        this.performanceOps = performanceOps;
    }

    public PerformanceSolver() {
        this.performanceOps = new RUPerformanceOps();
    }

    @SuppressWarnings("unchecked")
    public Hashtable<ActiveResource, ManagedPDF> getResourceUsageTimes(final Expression expression) {
        return (Hashtable<ActiveResource, ManagedPDF>) this.exprSwitch.doSwitch(expression);
    }

}
