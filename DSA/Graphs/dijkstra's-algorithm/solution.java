class Pair{
    int node;
    int weight;
    public Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}

class Solution
{
    public  int[] dijkstra(int V, ArrayList<ArrayList<Integer>> edges, int S)
    {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(ArrayList<Integer> edge:edges){
            int u=edge.get(0);
            int v=edge.get(1);
            int w=edge.get(2);
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        pq.add(new Pair(S,0));
        dist[S]=0;

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int u=curr.node;
            int d=curr.weight;
            
            for(int[] neigbour:adj.get(u)){
                int v=neigbour[0];
                int w=neigbour[1];
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }
        for (int i = 0; i < V; i++) {
    if (dist[i] == Integer.MAX_VALUE) {
        dist[i] = (int) 1e9; 
    }
}
        return dist;
    }
}
