package de.uka.ipd.sdq.pcmsolver.models;

import java.util.ArrayList;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocationContext;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;

/**
 * @author Koziolek
 *
 */
public class Context {
	private org.palladiosimulator.pcm.system.System mySystem;
	private AssemblyContext myAssemblyContext;
	private Allocation myAllocation;
	
	private ComputedUsageContext usageContext;
	private ComputedAllocationContext actualAllocationContext;
	
	private ArrayList currentLoopIterationNumber;
	private ArrayList currentEvaluatedBranchConditions;
		
	public Context(){
		this.currentEvaluatedBranchConditions = new ArrayList();
		this.currentLoopIterationNumber = new ArrayList();
	}
	
	/**
	 * @return the myAssemblyContext
	 */
	public AssemblyContext getDerivedAssemblyContext() {
		return myAssemblyContext;
	}
	/**
	 * @param myAssemblyContext the myAssemblyContext to set
	 */
	public void setDerivedAssemblyContext(AssemblyContext myAssemblyContext) {
		this.myAssemblyContext = myAssemblyContext;
	}
	/**
	 * @return the mySystem
	 */
	public org.palladiosimulator.pcm.system.System getSystem() {
		return mySystem;
	}
	/**
	 * @param mySystem the mySystem to set
	 */
	public void setSystem(org.palladiosimulator.pcm.system.System mySystem) {
		this.mySystem = mySystem;
	}
	public ComputedAllocationContext getActualAllocationContext() {
		return actualAllocationContext;
	}
	public void setActualAllocationContext(
			ComputedAllocationContext actualAllocationContext) {
		this.actualAllocationContext = actualAllocationContext;
	}
	public ComputedUsageContext getUsageContext() {
		return usageContext;
	}
	public void setUsageContext(ComputedUsageContext usageContext) {
		this.usageContext = usageContext;
	}
	public ArrayList getCurrentEvaluatedBranchConditions() {
		return currentEvaluatedBranchConditions;
	}
	public void setCurrentEvaluatedBranchConditions(
			ArrayList currentEvaluatedBranchConditions) {
		this.currentEvaluatedBranchConditions = currentEvaluatedBranchConditions;
	}
	public ArrayList getCurrentLoopIterationNumber() {
		return currentLoopIterationNumber;
	}
	public void setCurrentLoopIterationNumber(ArrayList currentLoopIterationNumber) {
		this.currentLoopIterationNumber = currentLoopIterationNumber;
	}

	public Allocation getAllocation() {
		return myAllocation;
	}

	public void setAllocation(Allocation myAllocation) {
		this.myAllocation = myAllocation;
	}
	
}
