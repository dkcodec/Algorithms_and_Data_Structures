package DFS_BFS;

import java.util.*;


public class problem2_BFS {
    static class Graph {
        private Map<Integer, List<Integer>> adjacencyList;

        public Graph(Map<Integer, List<Integer>> adjacencyList) {
            this.adjacencyList = adjacencyList;
        }

        public void bfs(int startNode) {
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            queue.offer(startNode);
            visited.add(startNode);

            while (!queue.isEmpty()) {
                int currentNode = queue.poll();
                System.out.print(currentNode + " ");

                if (adjacencyList.containsKey(currentNode)) {
                    for (int neighbor : adjacencyList.get(currentNode)) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                            visited.add(neighbor);
                        }
                    }
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
        graph.bfs(57);
    }
}








