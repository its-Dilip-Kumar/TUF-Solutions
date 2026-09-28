class Solution {
    public boolean canFinish(int N, int[][] arr) {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<N;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge:arr){
            int u=edge[0];
            int v=edge[1];
            adjList.get(u).add(v);
        }

        int[] indegree=new int[N];
        for(int i=0;i<N;i++){
            for(int it:adjList.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.remove();
            topo.add(node);
            for(int it:adjList.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        return topo.size()==N;

    }
}