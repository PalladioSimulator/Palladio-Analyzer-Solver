package org.palladiosimulator.solver.runconfig;

import java.util.ArrayList;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.analyzer.accuracy.jobs.AccuracyInfluenceAnalysisJob;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMLaunchConfigurationDelegate;
import org.palladiosimulator.analyzer.workflow.core.configurations.PCMWorkflowConfigurationBuilder;

import de.uka.ipd.sdq.workflow.WorkflowExceptionHandler;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.launchconfig.core.configbuilder.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflowExceptionHandler;

public class PCMSolverLaunchConfigurationDelegate
        extends AbstractPCMLaunchConfigurationDelegate<PCMSolverWorkflowRunConfiguration> {

    @Override
    protected WorkflowExceptionHandler createExceptionHandler(boolean interactive) {
        return new UIBasedWorkflowExceptionHandler(!interactive);
    }

    @Override
    protected IJob createWorkflowJob(PCMSolverWorkflowRunConfiguration config, ILaunch launch) throws CoreException {

        // To enable accuracy analysis, the former top-level job (PCMSolverReliabilityJob)
        // is replaced through a new AccuracyInfluenceAnalysisJob:
        PCMSolverWorkflowJobBuilder jobBuilder = new PCMSolverWorkflowJobBuilder(launch);
        return new AccuracyInfluenceAnalysisJob(config, jobBuilder);
    }

    @Override
    protected PCMSolverWorkflowRunConfiguration deriveConfiguration(ILaunchConfiguration configuration, String mode)
            throws CoreException {
        PCMSolverWorkflowRunConfiguration solverConfiguration = new PCMSolverWorkflowRunConfiguration();

        AbstractWorkflowConfigurationBuilder builder;

        builder = new PCMWorkflowConfigurationBuilder(configuration, mode);
        builder.fillConfiguration(solverConfiguration);

        builder = new PCMSolverConfigurationBasedConfigBuilder(configuration, mode);
        builder.fillConfiguration(solverConfiguration);

        return solverConfiguration;
    }

    @Override
    protected ArrayList<LoggerAppenderStruct> setupLogging(Level logLevel) throws CoreException {
        ArrayList<LoggerAppenderStruct> loggerList = super.setupLogging(logLevel);
        loggerList.add(setupLogger("org.palladiosimulator.solver", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));

        return loggerList;
    }

}
