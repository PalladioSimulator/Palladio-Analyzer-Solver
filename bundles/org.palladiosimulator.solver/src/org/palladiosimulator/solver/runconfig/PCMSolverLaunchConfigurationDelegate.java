package org.palladiosimulator.solver.runconfig;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.analyzer.accuracy.jobs.AccuracyInfluenceAnalysisJob;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMLaunchConfigurationDelegate;
import org.palladiosimulator.analyzer.workflow.core.configurations.PCMWorkflowConfigurationBuilder;

import de.uka.ipd.sdq.workflow.BlackboardBasedWorkflow;
import de.uka.ipd.sdq.workflow.WorkflowExceptionHandler;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.launchconfig.core.configbuilder.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflow;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflowExceptionHandler;

public class PCMSolverLaunchConfigurationDelegate
        extends AbstractPCMLaunchConfigurationDelegate<PCMSolverWorkflowRunConfiguration> {

    @Override
    protected BlackboardBasedWorkflow<MDSDBlackboard> createWorkflow(
            final PCMSolverWorkflowRunConfiguration workflowConfiguration, final IProgressMonitor monitor,
            final ILaunch launch) throws CoreException {
        return new UIBasedWorkflow<>(this.createWorkflowJob(workflowConfiguration, launch), monitor,
                this.createExceptionHandler(workflowConfiguration.isInteractive()), this.createBlackboard());
    }

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
    protected List<LoggerAppenderStruct> setupLogging(Level logLevel) throws CoreException {
        List<LoggerAppenderStruct> loggerList = new ArrayList<>(super.setupLogging(logLevel));
        loggerList.add(setupLogger("org.palladiosimulator.solver", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));

        return loggerList;
    }

}
