package org.palladiosimulator.solver.reliability;

import org.apache.log4j.Logger;

import org.palladiosimulator.reliability.markov.MarkovChain;
import org.palladiosimulator.reliability.markov.Transition;

/**
 * This class solves Markov Chains in the sense that it calculates the probability of getting from
 * the Start State to the Success State (but not into the Failure State).
 * 
 * @author brosch
 * 
 */
public class MarkovSolver {

    /**
     * A LOGGER to give detailed information about the PCM instance traversal.
     */
    private static final Logger LOGGER = Logger.getLogger(MarkovSolver.class.getName());

    /**
     * The static singleton instance.
     */
    private static MarkovSolver singletonSolver;

    /**
     * Retrieves the singleton solver instance.
     * 
     * @return the singleton solver instance
     */
    public static MarkovSolver getSingletonInstance() {
        if (singletonSolver == null) {
            singletonSolver = new MarkovSolver();
        }
        return singletonSolver;
    }

    /**
     * Singleton instance - private constructor.
     */
    private MarkovSolver() {

    }

    /**
     * Calculates the probability for the given Markov Chain to reach the Success State starting
     * from the Start State.
     * 
     * @param markovChain
     *            the given Markov Chain
     * @return the probability matrix
     */
    public double[][] solve(MarkovChain markovChain) {

        // Do the logging:
        LOGGER.debug("Solving Markov Chain [" + markovChain.getName() + "]");

        // Calculate the transition matrix:
        double[][] transitionMatrix = new double[markovChain.getStates().size()][markovChain.getStates().size()];

        // Take over transition probabilities into the transition matrix:
        for (int i = 0; i < markovChain.getTransitions().size(); i++) {
            Transition transition = markovChain.getTransitions().get(i);
            int index_from = markovChain.getStates().indexOf(transition.getFromState());
            int index_to = markovChain.getStates().indexOf(transition.getToState());
            transitionMatrix[index_from][index_to] = markovChain.getTransitions().get(i).getProbability();
        }

        // Calculate (Identity Matrix - Transition Matrix):
        for (int i = 0; i < transitionMatrix.length; i++) {
            for (int j = 0; j < transitionMatrix[i].length; j++) {
                transitionMatrix[i][j] = ((i == j) ? 1 : 0) - transitionMatrix[i][j];
            }
        }

        // Calculate the inverse matrix:
        return Inverse.invert(transitionMatrix);
    }
}
