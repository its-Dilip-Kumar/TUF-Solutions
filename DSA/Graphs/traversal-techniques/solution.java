class Solution {
    public static List<List<Integer>> edgeToAdj(List<List<Integer>> edges,int V){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(List<Integer> e:edges){
            int u=e.get(0);
            int v=e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return adj;
    }
    public static void dfs(int node,List<Integer> result,boolean[] visited,List<List<Integer>> adj){
        visited[node]=true;
        result.add(node);
        for(int it:adj.get(node)){
            if(!visited[it]){
                visited[it]=true;
                dfs(it,result,visited,adj);
            }
        }
    }
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> edges) {
        List<List<Integer>> adj=edgeToAdj(edges,V);
        List<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[V];

        dfs(0,result,visited,adj);
        return result;
      
    }
    
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> edges) {
        List<List<Integer>> adj=edgeToAdj(edges,V);
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        List<Integer> result=new ArrayList<>();

        q.add(0);
        visited[0]=true;

        while(!q.isEmpty()){
            int node=q.remove();
            result.add(node);

            for(int it:adj.get(node)){
                if(!visited[it]){
                    q.add(it);
                    visited[it]=true;
                }
            }
        }

        return result;

    }
}

