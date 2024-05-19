package DFS_BFS;

import java.util.*;

public class problem2_DFS {
    static class Graph {
        private Map<Integer, List<Integer>> adjacencyList;

        public Graph(Map<Integer, List<Integer>> addadjacencyList) {
            this.adjacencyList = addadjacencyList;
        }

        public void dfs(int startNode){
            List<Integer> visited = new ArrayList<>();
            dfsRecursive(startNode, visited);
        }

        public void dfsRecursive(int node, List<Integer> visited){
            if(visited.contains(node)){
                return;
            }

            visited.add(node);
            System.out.print(node + " ");

            if (adjacencyList.containsKey(node)) {
                for (int neighbor : adjacencyList.get(node)) {
                    dfsRecursive(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        adjacencyList.put(57, Arrays.asList(53, 42));
        adjacencyList.put(53, Arrays.asList(48, 25));
        adjacencyList.put(48, Arrays.asList(18, 30));
        adjacencyList.put(25, Arrays.asList(25));
        adjacencyList.put(42, Arrays.asList(34, 29));

        Graph graph = new Graph(adjacencyList);
        graph.dfs(57);
    }
}
