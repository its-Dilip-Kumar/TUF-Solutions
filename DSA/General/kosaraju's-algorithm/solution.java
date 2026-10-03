class Solution {
    private void dfs(int node,int[] visited,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj){
        visited[node]=1;
        for(int it:adj.get(node)){
            if(visited[it] == 0){             
        dfs(it, visited, st, adj);
    }
        
    }
    st.push(node);
    }

    private void dfs2(int node,int[] visited,ArrayList<ArrayList<Integer>> adjT){
        visited[node]=1;
        for(int it:adjT.get(node)){
            if(visited[it]==0){
                dfs2(it,visited,adjT);
            }
            
        }
    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                dfs(i,visited,st,adj);
            }
        }


        ArrayList<ArrayList<Integer>> adjT=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjT.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            visited[i]=0;
            for(int it:adj.get(i)){
                //i->it
                //it->i
                adjT.get(it).add(i);
            }
        }

        int scc=0;
        while(!st.isEmpty()){
            int node=st.pop();
            if(visited[node]==0){
                scc++;
                dfs2(node,visited,adjT);
            }
        }
        return scc;
    }
}

