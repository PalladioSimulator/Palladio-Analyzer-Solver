package org.palladiosimulator.solver.core.handler;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.seff.SetVariableAction;
import org.palladiosimulator.solver.core.visitors.SeffVisitor;
import org.palladiosimulator.solver.core.visitors.VariableUsageHelper;

public class SetVariableActionHandler {

	private SeffVisitor visitor;

	public SetVariableActionHandler(SeffVisitor seffVisitor) {
		visitor = seffVisitor;
	}

	public void handle(SetVariableAction sva) {
		EList<VariableUsage> vuList = sva
				.getLocalVariableUsages_SetVariableAction();
		for (VariableUsage vu : vuList) {
			VariableUsageHelper.copySolvedVariableUsageToOutput(visitor
					.getContextWrapper(), vu);
		}
	}

}
