package de.uka.ipd.sdq.pcmsolver.handler;

import org.palladiosimulator.pcm.seff.seff_reliability.RecoveryAction;
import org.palladiosimulator.pcm.seff.seff_reliability.RecoveryActionBehaviour;

import de.uka.ipd.sdq.pcmsolver.visitors.SeffVisitor;

public class RecoveryBlockActionHandler {
	private SeffVisitor visitor;

	public RecoveryBlockActionHandler(SeffVisitor seffVisitor) {
		visitor = seffVisitor;
	}

	public void handle(RecoveryAction recoveryAction) {
		for (RecoveryActionBehaviour behaviour : recoveryAction
				.getRecoveryActionBehaviours__RecoveryAction()) {
			// Direct invocation as a workaround for the missing
			// case for RecoveryBlockAlternativeBehaviours:
			visitor.caseResourceDemandingBehaviour(behaviour);
		}
	}
}
