package DFS_BFS;

import java.util.*;

public class problem1_DFS {
    static class Graph {
        private Map<Character, Set<Character>> adjacencyList;

        public Graph(Map<Character, Set<Character>> adjacencyList) {
            this.adjacencyList = adjacencyList;
        }

        public void dfs(char startNode) {
            Set<Character> visited = new HashSet<>();
            dfsRecursive(startNode, visited);
        }

        private void dfsRecursive(char node, Set<Character> visited) {
            if (visited.contains(node)) {
                return;
            }

            visited.add(node);
            System.out.print(node + " ");

            for (char neighbor : adjacencyList.get(node)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Map<Character, Set<Character>> adjacencyList = new HashMap<>();
        adjacencyList.put('A', new HashSet<>(Arrays.asList('C', 'D')));
        adjacencyList.put('B', new HashSet<>(Arrays.asList('C')));
        adjacencyList.put('C', new HashSet<>(Arrays.asList('F', 'G')));
        adjacencyList.put('D', new HashSet<>(Arrays.asList('E', 'G', 'H')));
        adjacencyList.put('E', new HashSet<>());
        adjacencyList.put('F', new HashSet<>(Arrays.asList('B')));
        adjacencyList.put('G', new HashSet<>());
        adjacencyList.put('H', new HashSet<>(Arrays.asList('E')));

        Graph graph = new Graph(adjacencyList);

        graph.dfs('A');
    }
}
