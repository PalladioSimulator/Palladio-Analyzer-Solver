package org.palladiosimulator.solver.transformations;

import org.palladiosimulator.solver.core.models.PCMInstance;

public interface SolverStrategy {

	void transform(PCMInstance model);
	
	void solve();

	void loadTransformedModel(String fileName);
	
	void storeTransformedModel(String fileName);
}
