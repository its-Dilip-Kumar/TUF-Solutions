class Pair{
    int node;
    int parent;
    public Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}
class Solution {
    public static boolean bfs(int node,List<Integer>[] adj,boolean[] visited){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,-1));
        visited[node]=true;

        while(!q.isEmpty()){
            Pair curr=q.remove();
            int currnode=curr.node;
            int currparent=curr.parent;

            for(int neigbour:adj[currnode]){
                if(!visited[neigbour]){
                    visited[neigbour]=true;
                    q.add(new Pair(neigbour,currnode));
                }else if(neigbour!=currparent){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isCycle(int V, List<Integer>[] adj) {
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(!bfs(i,adj,visited)) return true;
            }
        }
        return false;
    }
}
