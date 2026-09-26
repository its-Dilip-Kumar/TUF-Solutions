class Pair{
    int node;
    int parent;
    public Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}

class Solution {
    public static boolean bfs(int sr,Queue<Pair> q,boolean[] visited,List<Integer>[] adj){
        q.add(new Pair(sr,-1));
        visited[sr]=true;

        while(!q.isEmpty()){
            Pair node=q.remove();
            int child=node.node;
            int parent=node.parent;

            for(int it:adj[child]){
                if(!visited[it]){
                    q.add(new Pair(it,child));
                    visited[it]=true;
                }
                else if(parent!=it){
                    return true;
                }
            }
            
        }
        return false;
    }
    public boolean isCycle(int V, List<Integer>[] adj) {
        Queue<Pair> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(i,q,visited,adj)) return true;
            }
            
        }
        return false;
        
    }
}
