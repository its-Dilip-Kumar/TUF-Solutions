class Solution {

    public static void bfs(int start, boolean[] visited, int[][] adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int node = q.remove();
            for(int i = 0; i < adj[node].length; i++){
                if(adj[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public int numProvinces(int[][] adj) {
        int count = 0;
        int V = adj.length;
        boolean[] visited = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                count++;
                bfs(i, visited, adj);
            }
        }
        return count;
    }
}