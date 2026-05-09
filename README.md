# TSP Solver: Hill Climbing & Simulated Annealing

## 📌 Project Overview
This project focuses on solving the **Traveling Salesman Problem (TSP)**, an NP-hard optimization challenge. We implemented and compared two metaheuristic algorithms to find the shortest possible route for visiting a set of cities.

## 🏗 Project Structure
- **`src/main/java/tsp/`**: Contains the core logic (Main, Solvers, Models, and Utils).
- **`data/`**: Stores benchmark datasets (`berlin52`, `eil51`) in `.tsp` and `.txt` formats.
- **`src/test/`**: Reserved for unit testing and quality assurance.
- **`pom.xml`**: Manages project dependencies and build configurations via Maven.

## 💡 Algorithms Implemented
1. **Hill Climbing (HC)**: 
   - Uses a **2-opt neighborhood search** strategy.
   - Iteratively improves the path by swapping edges to find a local optimum.
2. **Simulated Annealing (SA)**: 
   - A probabilistic approach inspired by metallurgy.
   - Employs a **cooling schedule** to escape local optima and seek a global minimum.

## 📊 Experimental Results

The following table summarizes the performance of the implemented algorithms on standard TSPLIB datasets:

| Dataset | Algorithm | Initial Distance | Final Distance | Improvement (%) |
| :--- | :--- | :--- | :--- | :--- |
| **berlin52** | Hill Climbing | 22205.61 | 11431.77 | **48.5%** |
| **berlin52** | Simulated Annealing | 22205.61 | 12624.80 | **43.1%** |
| **eil51** | Hill Climbing | 1313.46 | 654.51 | **50.1%** |
| **eil51** | Simulated Annealing | 1313.46 | 820.05 | **37.5%** |

👥 Team Members
Shada Alshayie (431201710)

Rola Alharbi (422205738)

... (Add other team members here)

Supervision
Dr. Seham Alharbi 

Course: Artificial Intelligence (CS 432)
