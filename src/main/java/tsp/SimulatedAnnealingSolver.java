package tsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Please complete this class with your solution to the TSP using the Simulated
 * Annealing algorithm.
 * 
 * @author Seham Alharbi
 */
public class SimulatedAnnealingSolver {
	private double initialTemperature;
	private double coolingRate;
	private int maxIterations;
	private int iterationsUsed;

	public SimulatedAnnealingSolver(double initialTemperature, double coolingRate, int maxIterations) {
		this.initialTemperature = initialTemperature;
		this.coolingRate = coolingRate;
		this.maxIterations = maxIterations;
		this.iterationsUsed = 0;
	}

	public List<City> solve(List<City> initialTour) {

		List<City> currentTour = new ArrayList<>(initialTour);
		List<City> bestTour = new ArrayList<>(currentTour);
		
		
		// TODO: Implement Simulated Annealing algorithm solution here.
        
        double temperature = initialTemperature;
        double currentDistance = TSPUtils.totalDistance(currentTour);
        double bestDistance = currentDistance;
        Random random = new Random();
        iterationsUsed = 0;

        while (iterationsUsed < maxIterations && temperature > 1) {
            int index1 = random.nextInt(currentTour.size());
            int index2 = random.nextInt(currentTour.size());

            List<City> neighborTour = new ArrayList<>(currentTour);
            Collections.swap(neighborTour, index1, index2);

            double neighborDistance = TSPUtils.totalDistance(neighborTour);

            //  (Acceptance Probability)
            if (neighborDistance < currentDistance) {
                currentTour = new ArrayList<>(neighborTour);
                currentDistance = neighborDistance;
            } else {
                double acceptanceProb = Math.exp((currentDistance - neighborDistance) / temperature);
                if (acceptanceProb > random.nextDouble()) {
                    currentTour = new ArrayList<>(neighborTour);
                    currentDistance = neighborDistance;
                }
            }

            if (currentDistance < bestDistance) {
                bestTour = new ArrayList<>(currentTour);
                bestDistance = currentDistance;
            }

            temperature *= (1 - coolingRate);
            iterationsUsed++;
        }

		return bestTour;
	}

}
