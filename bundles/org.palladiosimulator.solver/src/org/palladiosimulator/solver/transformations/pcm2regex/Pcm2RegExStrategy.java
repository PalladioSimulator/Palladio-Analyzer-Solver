package org.palladiosimulator.solver.transformations.pcm2regex;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.core.models.PCMInstance;
import org.palladiosimulator.solver.core.transformations.EMFHelper;
import org.palladiosimulator.solver.exprsolver.ExpressionSolver;
import org.palladiosimulator.solver.runconfig.PCMSolverWorkflowRunConfiguration;
import org.palladiosimulator.solver.spa.expression.Expression;
import org.palladiosimulator.solver.transformations.SolverStrategy;
import org.palladiosimulator.solver.visitors.UsageModelVisitor;
import org.palladiosimulator.solver.visualisation.JFVisualisation;

import de.uka.ipd.sdq.probfunction.math.IProbabilityDensityFunction;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.ISamplePDF;
import de.uka.ipd.sdq.probfunction.math.ManagedPDF;
import de.uka.ipd.sdq.probfunction.math.PDFConfiguration;
import de.uka.ipd.sdq.probfunction.math.exception.ConfigurationNotSetException;
import de.uka.ipd.sdq.probfunction.math.exception.ProbabilityFunctionException;
import de.uka.ipd.sdq.probfunction.math.exception.UnknownPDFTypeException;
import de.uka.ipd.sdq.probfunction.print.ProbFunctionCSVPrint;

/**
 * This is an excerpt of Heiko's dissertation (see below for link)
 * 
 * The Stochastic Regular Expression (SRE) model is an analytical performance
 * model in the class of semi-Markov processes [Tri01]. It consists of a
 * discrete time Markov-chain (DTMC) to model state transitions, but the sojourn
 * time in each state can follow arbitrary probability distributions instead of
 * being limited to exponential distributions as in Markov chains. Furthermore,
 * SREs are hierarchically structured and do not allow cycles in the embedded
 * DTMC for more accurate predictions. Chapter 6.3.3 will provide the syntax and
 * semantics of SREs, afterwards Chapter 6.3.4 shows how to compute overall
 * sojourn times with SREs. Only a partial transformation of PCM instances to
 * SREs is possible, because of the model's limited expressiveness. The
 * transformation is straight-forward, as the control flow modelling of PCM
 * instances and SREs are closely aligned. Chapter 6.3.5 will describe the
 * transformation PCM2SRE. While allowing accurate predictions by supporting
 * arbitrary distribution functions for timing values, SRE are limited to
 * analysing single-user scenarios. They do not include queues or control flow
 * forks, and cannot express contention effects due to concurrent requests.
 * However, they provide a fast method of producing performance predictions
 * during early development stages, as they are usually more quickly solved than
 * running a simulation. Chapter 6.3.6 discusses the assumptions underlying SREs
 * in detail. The SRE model will be used for a performance prediction in a case
 * study in Chapter 7.3.3.
 * 
 * @see Heiko's dissertation, section 6.3 at
 *      http://docserver.bis.uni-oldenburg.de
 *      /_publikationen/dissertation/2008/kozpar08/pdf/kozpar08.pdf
 * @author Heiko Koziolek
 * 
 */
public class Pcm2RegExStrategy implements SolverStrategy {

    Expression stoRegEx;

    protected IProbabilityFunctionFactory iProbFuncFactory =
            IProbabilityFunctionFactory.eINSTANCE;

    private static Logger logger = Logger.getLogger(Pcm2RegExStrategy.class.getName());

    private long overallDuration = 0;

    private final PCMSolverWorkflowRunConfiguration configuration;

    public Pcm2RegExStrategy(final PCMSolverWorkflowRunConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void loadTransformedModel(final String fileName) {
        final EObject object = EMFHelper.loadFromXMIFile(fileName);
        if (object instanceof Expression){
            this.stoRegEx = (Expression)object;
        } else {
            logger.warn("Could not load "+fileName+" because is not an Expression model");
        }
    }

    @Override
    public void solve() {
        if (stoRegEx != null){
            final long timeBeforeCalc = System.nanoTime();
            final ExpressionSolver solver = new ExpressionSolver();
            final ManagedPDF resultPDF = solver.getResponseTime(stoRegEx);

            if(resultPDF == null){
                logger.error("StochasticRegularExpression could not be solved!");
                return;
            }

            final long timeAfterCalc = System.nanoTime();
            long duration = TimeUnit.NANOSECONDS.toMillis(timeAfterCalc-timeBeforeCalc);
            overallDuration += duration;
            logger.info("Finished Running ExprSolver:\t"+ duration + " ms");
            logger.debug("Resulting PDF:\t\t\t"+resultPDF.toString());
            logger.trace("As csv:\n\nx;probability\n"+new ProbFunctionCSVPrint().doSwitch(resultPDF.getModelBoxedPdf()));

            visualize(resultPDF.getPdfTimeDomain());
            final long timeAfterVisualisation = System.nanoTime();

            //logger.info("PDF in time domain: "+resultPDF.getPdfTimeDomain());

            duration = TimeUnit.NANOSECONDS.toMillis(timeAfterVisualisation-timeAfterCalc);
            overallDuration += duration;
            logger.info("Finished Visualisation:\t\t"+ duration + " ms");
            logger.info("Finished SRE-Solver:\t\t"+ overallDuration+ " ms");

        } else {
            logger.error("No StochasticRegularExpression available for solution!");
        }
    }

    @Override
    public void storeTransformedModel(final String fileName) {

        EMFHelper.saveToXMIFile(stoRegEx, fileName);

    }

    @Override
    public void transform(final PCMInstance model) {

        if (!this.configuration.isUseSREInputModel()){
            final long timeBeforeCalc = System.nanoTime();
            runDSolver(model);
            runPcm2RegEx(model);
            printStoRegEx();

            storeTransformedModel(this.configuration.getSREOutputFile());

            final long timeAfterCalc = System.nanoTime();
            final long duration = TimeUnit.NANOSECONDS.toMillis(timeAfterCalc-timeBeforeCalc);
            overallDuration += duration;
            logger.info("Finished Running PCM2SRE:\t\t"+ duration + " ms");
        } else {
            final String filename = this.configuration.getSREOutputFile();
            loadTransformedModel(filename);
            logger.warn("Using predefined Expression model "+filename);
        }


    }

    private void printStoRegEx() {
        final ExpressionPrinter expPrinter = new ExpressionPrinter();
        expPrinter.doSwitch(stoRegEx);
        logger.debug("ExpressionPrinter: "+expPrinter.getOutput());
    }

    private void runPcm2RegEx(final PCMInstance model) {
        final TransformUsageModelVisitor umVisit = new TransformUsageModelVisitor(model);
        final UsageScenario us = model.getUsageModel().getUsageScenario_UsageModel().get(0);
        try {
            stoRegEx = (Expression)umVisit.doSwitch(us.getScenarioBehaviour_UsageScenario());
        } catch (final Exception e) {
            logger.error("Transforming the PCM instance into a stochastic regular expression caused an Exception! Check your model for broken references, e.g. old, dangling Connectors." + e.getMessage());
            e.printStackTrace();

            throw new RuntimeException(e);
        }
    }

    private void runDSolver(final PCMInstance model) {
        final UsageModelVisitor visitor = new UsageModelVisitor(model);
        try {
            final UsageScenario us = model.getUsageModel()
                    .getUsageScenario_UsageModel().get(0);
            visitor.doSwitch(us.getScenarioBehaviour_UsageScenario());
        } catch (final Exception e) {
            logger.error("Running the dependency solver caused an Exception! Check your model for broken references, e.g. old, dangling Connectors." + e.getMessage());
            e.printStackTrace();

            throw new RuntimeException(e);
        }
    }

    private void visualize(final IProbabilityDensityFunction iPDF) {
        ISamplePDF samplePDF = null;
        try {
            samplePDF = iProbFuncFactory.transformToSamplePDF(iPDF);
        } catch (final UnknownPDFTypeException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            double dist = 0.0;
            try {
                dist = PDFConfiguration.getCurrentConfiguration().getDistance();
            } catch (final ConfigurationNotSetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            final JFVisualisation vis = new JFVisualisation(dist);
            vis.addSamplePDF(samplePDF,"Execution Time");
            vis.visualizeOverlay();
        } catch (final ProbabilityFunctionException e) {
            e.printStackTrace();
        }
    }

}
