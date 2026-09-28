class Solution {
    public int[] eventualSafeNodes(int V, int[][] adj) {
       ArrayList<ArrayList<Integer>> adjRev=new ArrayList<>();
       for(int i=0;i<V;i++){
        adjRev.add(new ArrayList<>());
       }
       int[] indegree=new int[V];
       for(int i=0;i<V;i++){
        for(int it:adj[i]){
            adjRev.get(it).add(i);
            indegree[i]++;
        }
       }

       Queue<Integer> q=new LinkedList<>();
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<V;i++){
        if(indegree[i]==0){
            q.add(i);
        }
       }

       while(!q.isEmpty()){
        int node=q.remove();
        ans.add(node);
        for(int it:adjRev.get(node)){
            indegree[it]--;
            if(indegree[it]==0){
                q.add(it);
            }
        }
       }

       Collections.sort(ans);
       int[] result=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        result[i]=ans.get(i);
       }
       return result;
    }
}
