package Graphs.problem1;
import java.util.*;

public class DirectedGraph {
    private int[][] adjacencyMatrix;
    private ArrayList<ArrayList<Integer>> adjacencyList;
    private int vertices;

    public DirectedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        adjacencyMatrix[from - 1][to - 1] = 1; // Corrected indices
        adjacencyList.get(from - 1).add(to);
    }

    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printAdjacencyList() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print((i + 1) + " -> ");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}