class Solution {
    public static boolean dfs(int sr,boolean[] visited,boolean[] pathvisited,List<List<Integer>> adj){
        visited[sr]=true;
        pathvisited[sr]=true;

        for(int it:adj.get(sr)){
            if(!visited[it]){
                if(dfs(it,visited,pathvisited,adj)) return true;
            }else if(pathvisited[it]){
                return true;
            }
        }
        pathvisited[sr]=false;
        return false;
    }
    public boolean isCyclic(int N, List<List<Integer>> adj) {
        boolean[] visited=new boolean[N];
        boolean[] pathvisited=new boolean[N];
        for(int i=0;i<N;i++){
            if(!visited[i]){
                if(dfs(i,visited,pathvisited,adj)) return true;
            }
        }
        return false;
    }
}
