import java.util.*;

class Pair {
    int node;
    int color;
    public Pair(int node, int color) {
        this.node = node;
        this.color = color;
    }
}

class Solution {
    public static boolean isCycle(int sr, int color, Queue<Pair> q,
                                  int[] visited, List<List<Integer>> adj) {
        q.add(new Pair(sr, color));
        visited[sr] = color;

        while (!q.isEmpty()) {
            Pair node = q.remove();
            int childNode = node.node;
            int childColor = node.color;

            for (int it : adj.get(childNode)) {
                if (visited[it] == -1) {
                    q.add(new Pair(it, 1 - childColor));
                    visited[it] = 1 - childColor;
                } else if (visited[it] == childColor) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int V, List<List<Integer>> edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (List<Integer> e : edges) {
            int u = e.get(0);
            int v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] visited = new int[V];
        Arrays.fill(visited, -1);
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (visited[i] == -1) {
                if (!isCycle(i, 0, q, visited, adj)) return false;
            }
        }
        return true;
    }
}