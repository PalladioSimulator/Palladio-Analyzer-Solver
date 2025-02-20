package org.palladiosimulator.solver.transformations.pcm2regex;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.usagemodel.Branch;
import org.palladiosimulator.pcm.usagemodel.BranchTransition;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.Loop;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.Start;
import org.palladiosimulator.pcm.usagemodel.Stop;
import org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch;
import org.palladiosimulator.solver.core.models.PCMInstance;
import org.palladiosimulator.solver.core.transformations.ContextWrapper;
import org.palladiosimulator.solver.core.visitors.EMFQueryHelper;
import org.palladiosimulator.solver.spa.expression.Expression;
import org.palladiosimulator.solver.spa.expression.ExpressionFactory;
import org.palladiosimulator.solver.spa.expression.Option;
import org.palladiosimulator.solver.spa.expression.Sequence;
import org.palladiosimulator.solver.spa.expression.Symbol;

import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.stoex.RandomVariable;

public class TransformUsageModelVisitor extends UsagemodelSwitch {
	
	private static Logger logger = Logger.getLogger(TransformUsageModelVisitor.class.getName());
	
	private ExpressionFactory expFactory = ExpressionFactory.eINSTANCE;
	private IProbabilityFunctionFactory pfFactory = IProbabilityFunctionFactory.eINSTANCE;
	
	private PCMInstance pcmInstance;
	private ContextWrapper myContextWrapper = null;
	
	public TransformUsageModelVisitor(PCMInstance pcm){
		pcmInstance = pcm;
	}

	@Override
	public Object caseStart(Start object) {
		Symbol sym = expFactory.createSymbol();
		sym.setName("Start");
	
		Sequence seq = expFactory.createSequence();
		seq.setLeftRegExp(sym);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));
	
		return seq;
	}

	@Override
	public Object caseStop(Stop object) {
		Symbol sym = expFactory.createSymbol();
		sym.setName("Stop");
		return sym;
	}

	@Override
	public Object caseEntryLevelSystemCall(EntryLevelSystemCall object) {
		// Get List of ContextWrappers, one for each called component instance
		List<ContextWrapper> contextWrapperList;
		if (myContextWrapper == null)
			contextWrapperList = ContextWrapper.getContextWrapperFor(object, pcmInstance);
		else
			contextWrapperList = myContextWrapper.getContextWrapperFor(object);

		List<Option> optionsPerContextWrapperList = new LinkedList<Option>();
		for (ContextWrapper contextWrapper : contextWrapperList) {
			
			// calculate the expression for the contextWrapper in the list iteration
			myContextWrapper = contextWrapper;
			
			Option option = expFactory.createOption();
			option.setRegexp(getEntryExpression(object));
			option.setProbability(1/contextWrapperList.size());
			optionsPerContextWrapperList.add(option);
		}
		Expression exp = null;
		if (optionsPerContextWrapperList.size() == 1){
			exp =  optionsPerContextWrapperList.get(0).getRegexp();
		} else {
			exp =  Pcm2RegexHelper.createAlternativesForExpressions(optionsPerContextWrapperList);
		}
		Sequence seq = expFactory.createSequence();
		seq.setLeftRegExp(exp);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));

		return seq;
		
	}

	

	private Expression getEntryExpression(EntryLevelSystemCall object) {
		OperationProvidedRole role = object.getProvidedRole_EntryLevelSystemCall();
		ProvidedDelegationConnector delegationConnector = getDelegationConnector(role);
		RepositoryComponent offeringComponent = delegationConnector
				.getAssemblyContext_ProvidedDelegationConnector()
				.getEncapsulatedComponent__AssemblyContext();
	
		Expression expr = null;
		ServiceEffectSpecification seff = myContextWrapper.getNextSEFF(object);
		TransformSeffVisitor seffVisitor = new TransformSeffVisitor(myContextWrapper);
		try {
			expr = (Expression)seffVisitor.doSwitch((ResourceDemandingSEFF) seff);
		} catch (Exception e) {
			logger.error("Error while visiting RDSEFF");
			e.printStackTrace();
		}
		
		return expr;
	}

	@Override
	public Object caseBranch(Branch object) {
		
		List<Option> optionsForBranches = new LinkedList<Option>();
		
		for (BranchTransition branch : object.getBranchTransitions_Branch()) {
			Option option = expFactory.createOption();
			option.setProbability(branch.getBranchProbability());
			Expression branchExpression = (Expression)doSwitch(branch.getBranchedBehaviour_BranchTransition());
			option.setRegexp(branchExpression);
			
			optionsForBranches.add(option);
		}
		Expression alt = Pcm2RegexHelper.createAlternativesForExpressions(optionsForBranches);
		
		Sequence seq = expFactory.createSequence();
		seq.setLeftRegExp(alt);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));
		
		return seq;
	}

	@Override
	public Object caseLoop(Loop object) {
		org.palladiosimulator.solver.spa.expression.Loop loop = expFactory.createLoop();
		RandomVariable iterations = (RandomVariable)object.getLoopIteration_Loop();
		loop.setIterationsString(iterations.getSpecification());
		loop.setRegExp((Expression)doSwitch(object.getBodyBehaviour_Loop()));
		
		Sequence seq = expFactory.createSequence();		
		seq.setLeftRegExp(loop);
		seq.setRightRegExp((Expression)doSwitch(object.getSuccessor()));
		
		return seq;
	}

	@Override
	public Object caseScenarioBehaviour(ScenarioBehaviour object) {
		return doSwitch(getStartAction(object));
	}

	private Start getStartAction(ScenarioBehaviour object) {
		Start startAction = (Start) EMFQueryHelper.getObjectByType(object
				.getActions_ScenarioBehaviour(), Start.class);
		return startAction;
	}

	private ProvidedDelegationConnector getDelegationConnector(
			OperationProvidedRole role) {
		ProvidedDelegationConnector delegationConnector = 
			(ProvidedDelegationConnector) EMFQueryHelper
				.executeOCLQuery(
						pcmInstance.getSystem(),
						"self.connectors__ComposedStructure->select(dc|dc.oclIsTypeOf(composition::ProvidedDelegationConnector) and dc.oclAsType(composition::ProvidedDelegationConnector).outerProvidedRole_ProvidedDelegationConnector.providedInterface__OperationProvidedRole.id = '"
								+ role.getProvidedInterface__OperationProvidedRole()
										.getId()
								+ "')->asOrderedSet()->first()");
		return delegationConnector;
		
	}
	
	/**
	 * @param method
	 * @param basicComponent
	 * @return
	 */
	private ServiceEffectSpecification getSeff(Signature method,
			BasicComponent basicComponent) {
		ServiceEffectSpecification seff = (ServiceEffectSpecification) EMFQueryHelper
				.executeOCLQuery(
						basicComponent,
						"self.serviceEffectSpecifications__BasicComponent->select(seff|seff.describedService__SEFF.serviceName = '"
								+ method.getEntityName()
								+ "')->asOrderedSet()->first()");
		return seff;
	}
}
