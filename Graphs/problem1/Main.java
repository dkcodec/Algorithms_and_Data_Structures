package Graphs.problem1;

public class Main {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(33); // Updated to match the highest vertex
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 4);
        graph.addEdge(2, 12);
        graph.addEdge(4, 2);
        graph.addEdge(12, 4);
        graph.addEdge(12, 33);
        graph.addEdge(2, 10);
        graph.addEdge(10, 11);

        graph.printAdjacencyMatrix();
        graph.printAdjacencyList();
    }
}