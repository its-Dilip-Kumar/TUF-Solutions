import java.util.*;

class Pair {
    int weight;
    int node;

    public Pair(int weight, int node) {
        this.weight = weight;
        this.node = node;
    }
}

class Solution {
    public List<Integer> shortestPath(int n, int m, int[][] edges) {
        // Step 1: Adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        // Step 2: Distance + Parent
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        dist[1] = 0;

        // Step 3: Priority Queue
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(0, 1));

        // Step 4: Dijkstra
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.weight;

            if (d > dist[u]) continue;

            for (int[] neighbour : adj.get(u)) {
                int v = neighbour[0];
                int w = neighbour[1];

                if (d + w < dist[v]) {
                    dist[v] = d + w;
                    parent[v] = u;
                    pq.add(new Pair(dist[v], v));
                }
            }
        }

        // Step 5: Unreachable check
        if (dist[n] == Integer.MAX_VALUE) {
            List<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }

        // Step 6: Path reconstruct
        List<Integer> path = new ArrayList<>();
        int curr = n;
        while (curr != 1) {
            path.add(curr);
            curr = parent[curr];
        }
        path.add(1);
        Collections.reverse(path);

        // Step 7: Result = [weight, path...]
        List<Integer> ans = new ArrayList<>();
        ans.add(dist[n]);        // ✅ Total weight
        ans.addAll(path);        // ✅ Path

        return ans;
    }
}