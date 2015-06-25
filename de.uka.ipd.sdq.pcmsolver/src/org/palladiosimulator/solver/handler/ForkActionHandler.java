package org.palladiosimulator.solver.handler;

import org.palladiosimulator.pcm.seff.ForkAction;
import org.palladiosimulator.pcm.seff.ForkedBehaviour;
import org.palladiosimulator.pcm.seff.SynchronisationPoint;
import org.palladiosimulator.solver.visitors.SeffVisitor;

public class ForkActionHandler {
	private SeffVisitor visitor;

	public ForkActionHandler(SeffVisitor seffVisitor) {
		visitor = seffVisitor;
	}

	public void handle(ForkAction fork) {
		for (ForkedBehaviour behaviour : fork
				.getAsynchronousForkedBehaviours_ForkAction()) {
			visitor.doSwitch(behaviour);
		}
		SynchronisationPoint synch = fork
				.getSynchronisingBehaviours_ForkAction();
		if (synch != null) {
			for (ForkedBehaviour behaviour : synch
					.getSynchronousForkedBehaviours_SynchronisationPoint()) {
				visitor.doSwitch(behaviour);
			}
		}
	}
}
