package DFS_BFS;

import java.util.*;

public class problem3_Dijkstra {
    static class Node {
        int id;
        int distance;
        Node predecessor;

        public Node(int id) {
            this.id = id;
            this.distance = Integer.MAX_VALUE;
            this.predecessor = null;
        }
    }

    static class Graph {
        private Map<Integer, Node> nodes;
        private Map<Integer, Map<Integer, Integer>> edges;

        public Graph() {
            this.nodes = new HashMap<>();
            this.edges = new HashMap<>();
        }

        public void addNode(int id) {
            Node node = new Node(id);
            nodes.put(id, node);
        }

        public void addEdge(int source, int destination, int weight) {
            if (!nodes.containsKey(source) || !nodes.containsKey(destination)) {
                throw new IllegalArgumentException("Invalid node IDs");
            }

            Map<Integer, Integer> sourceEdges = edges.getOrDefault(source, new HashMap<>());
            sourceEdges.put(destination, weight);
            edges.put(source, sourceEdges);

            Map<Integer, Integer> destinationEdges = edges.getOrDefault(destination, new HashMap<>());
            destinationEdges.put(source, weight);
            edges.put(destination, destinationEdges);
        }

        public List<Node> findShortestPath(int source, int destination) {
            if (!nodes.containsKey(source) || !nodes.containsKey(destination)) {
                throw new IllegalArgumentException("Invalid node IDs");
            }

            Set<Integer> settledNodes = new HashSet<>();
            PriorityQueue<Node> unsettledNodes = new PriorityQueue<>((n1, n2) -> n1.distance - n2.distance);

            Node sourceNode = nodes.get(source);
            sourceNode.distance = 0;
            unsettledNodes.add(sourceNode);

            while (!unsettledNodes.isEmpty()) {
                Node currentNode = unsettledNodes.poll();

                if (currentNode.id == destination) {
                    return reconstructPath(currentNode);
                }

                settledNodes.add(currentNode.id);

                for (Map.Entry<Integer, Integer> edge : edges.get(currentNode.id).entrySet()) {
                    int neighborId = edge.getKey();
                    int weight = edge.getValue();

                    if (!settledNodes.contains(neighborId)) {
                        Node neighborNode = nodes.get(neighborId);
                        int newDistance = currentNode.distance + weight;

                        if (newDistance < neighborNode.distance) {
                            neighborNode.distance = newDistance;
                            neighborNode.predecessor = currentNode;

                            unsettledNodes.remove(neighborNode);
                            unsettledNodes.add(neighborNode);
                        }
                    }
                }
            }

            return null;
        }

        private List<Node> reconstructPath(Node node) {
            List<Node> path = new ArrayList<>();

            while (node != null) {
                path.add(0, node);
                node = node.predecessor;
            }

            return path;
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);

        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 3, 4);
        graph.addEdge(1, 4, 2);
        graph.addEdge(2, 4, 7);
        graph.addEdge(2, 1, 8);
        graph.addEdge(3, 5, 3);
        graph.addEdge(3, 4, 6);
        graph.addEdge(4, 5, 1);

        int source = 0;
        int destination = 5;

        List<Node> shortestPath = graph.findShortestPath(source, destination);

        if (shortestPath == null) {
            System.out.println("No path found from " + source + " to " + destination);
        } else {
            System.out.println("Shortest path from " + source + " to " + destination + ":");
            for (Node node : shortestPath) {
                System.out.print(node.id + " -> ");
            }
            System.out.println(destination);
        }
    }
}
