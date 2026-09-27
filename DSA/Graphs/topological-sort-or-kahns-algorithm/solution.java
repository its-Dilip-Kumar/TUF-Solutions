class Solution {
    public static void dfs(int sr,Stack<Integer> st,boolean[] visited,List<List<Integer>> adj){
        visited[sr]=true;
        for(int it:adj.get(sr)){
            if(!visited[it]){
                dfs(it,st,visited,adj);
            }
        }
        st.push(sr);
    }
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int[] result=new int[V];
        Stack<Integer> st=new Stack<>();
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,st,visited,adj);
            }
        }
        for(int i=0;i<V;i++){
            result[i]=st.pop();
        }
        return result;
    }
}