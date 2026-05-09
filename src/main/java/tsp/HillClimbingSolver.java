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

		
		// TODO: Implement Hill Climbing algorithm solution here.
		
		
		
		return currentTour;
	}


}
