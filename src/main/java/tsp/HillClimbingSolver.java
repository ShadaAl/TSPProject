package tsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Please complete this class with your solution to the TSP using the Hill
 * Climbing algorithm.
 * 
 * @author Seham Alharbi
 */

public class HillClimbingSolver {

	private int maxIterations;
	private int iterationsUsed; 

	public HillClimbingSolver(int maxIterations) {
		this.maxIterations = maxIterations;
		this.iterationsUsed = 0;
	}

	public List<City> solve(List<City> initialTour) {

		List<City> currentTour = new ArrayList<>(initialTour);
		double currentDistance = TSPUtils.totalDistance(currentTour);

		
        boolean improved = true;
        iterationsUsed = 0;

        while (improved && iterationsUsed < maxIterations) {
            improved = false;
            
            // (2-opt neighborhood)
            for (int i = 0; i < currentTour.size() - 1; i++) {
                for (int j = i + 1; j < currentTour.size(); j++) {
                    
                    List<City> neighborTour = new ArrayList<>(currentTour);
                    Collections.swap(neighborTour, i, j);
                    
                    double neighborDistance = TSPUtils.totalDistance(neighborTour);
                    
                    if (neighborDistance < currentDistance) {
                        currentTour = neighborTour;
                        currentDistance = neighborDistance;
                        improved = true;
                    }
                }
            }
            iterationsUsed++; 
        }
		
		
		return currentTour;
	}


}
