package org.palladiosimulator.solver.handler;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.transformations.ContextWrapper;
import org.palladiosimulator.solver.visitors.AggregatedContextSEFFVisitor;
import org.palladiosimulator.solver.visitors.SeffVisitor;

/**
 * Extends the {@link ExternalCallActionHandler} by overwriting {@link ExternalCallActionHandler#visitSEFF(ServiceEffectSpecification, ContextWrapper)}.
 * Creates a new {@link AggregatedContextSEFFVisitor} instead of a normal {@link SeffVisitor}.
 * @author martens
 *
 */
public class AggregatedContextExternalCallActionHandler extends
		ExternalCallActionHandler {

	private double frequency;
	private UsageScenario usageScenario;
	private ServiceEffectSpecification calledSEFF;
	private AssemblyContext calledAssemblyCtxt;
	private AllocationContext calledAllocationContext;

	public AggregatedContextExternalCallActionHandler(AggregatedContextSEFFVisitor seffVisitor, UsageScenario usageScenario) {
		super(seffVisitor);
		this.frequency = seffVisitor.getCurrentFrequency();
		this.usageScenario = usageScenario;
	}

	/**
	 * Creates a new {@link AggregatedContextSEFFVisitor} instead of a normal {@link SeffVisitor}, which adds the calculation 
	 * of execution frequencies to the context model. 
	 */
	@Override
	SeffVisitor visitSEFF(ServiceEffectSpecification seff,
			ContextWrapper contextWrapper) {
		AggregatedContextSEFFVisitor seffVisitor = new AggregatedContextSEFFVisitor(contextWrapper, this.frequency, seff, this.usageScenario);
		
		this.calledSEFF = seff;
		this.calledAssemblyCtxt = contextWrapper.getAssCtx();
		this.calledAllocationContext = contextWrapper.getAllCtx();
		
		seffVisitor.doSwitch(seff);
		return seffVisitor;
	}
	
	
	public ServiceEffectSpecification getCalledSEFF() {
		return calledSEFF;
	}

	public AssemblyContext getCalledAssemblyCtxt() {
		return calledAssemblyCtxt;
	}	

	public AllocationContext getCalledAllocationContext() {
		return calledAllocationContext;
	}
}
