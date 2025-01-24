import java.util.ArrayList;
import java.util.List;

class Solution {
    private boolean[] safeNodes;

    private boolean checkSafeState(int[][] graph, int[] visited, int curr) {
        visited[curr] = 1; // Mark as visited
        boolean isSafe = true;

        for (int neighbor : graph[curr]) {
            if (visited[neighbor] == 0) { // Unvisited
                isSafe &= checkSafeState(graph, visited, neighbor);
            } else if (visited[neighbor] == 1) { // Cycle
                return safeNodes[curr] = false;
            } else if (visited[neighbor] == 2) { // Processed
                isSafe &= safeNodes[neighbor];
            }
        }
        visited[curr] = 2; // Mark as processed
        return safeNodes[curr] = isSafe;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        safeNodes = new boolean[n]; // Default to false
        for (int i = 0; i < n; i++) safeNodes[i] = true;

        int[] visited = new int[n]; // 0 -> Unvisited, 1 -> Visiting, 2 -> Processed

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                checkSafeState(graph, visited, i);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safeNodes[i]) {
                result.add(i);
            }
        }
        return result;
    }
}