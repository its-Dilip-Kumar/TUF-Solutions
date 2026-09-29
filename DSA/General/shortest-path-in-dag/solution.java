class Solution {
    public static void toposort(int sr,Stack<Integer> st,boolean[] visited,ArrayList<ArrayList<int[]>> adj){
        visited[sr]=true;
        for(int[] neigbour:adj.get(sr)){
            int nextnode=neigbour[0];
            if(!visited[nextnode]){
                toposort(nextnode,st,visited,adj);
            }
        }
        st.push(sr);
    }
  public int[] shortestPath(int N, int M, int[][] edges) {
    ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
    for(int i=0;i<N;i++){
        adj.add(new ArrayList<>());
    }

    for(int[] edge:edges){
        int u=edge[0];
        int v=edge[1];
        int w=edge[2];
        adj.get(u).add(new int[]{v,w});
    }

    Stack<Integer> st=new Stack<>();
    boolean[] visited=new boolean[N];
    for(int i=0;i<N;i++){
        if(!visited[i]){
            toposort(i,st,visited,adj);
        }
    }

    int[] dist=new int[N];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[0]=0;

    while(!st.isEmpty()){
        int node=st.pop();
        if(dist[node]!=Integer.MAX_VALUE){
            for(int[] neigbour:adj.get(node)){
                int v=neigbour[0];
                int w=neigbour[1];
                if(dist[node]+w<dist[v]){
                    dist[v]=w+dist[node];
                }
            }
        }
    }

    for(int i=0;i<N;i++){
        if(dist[i]==Integer.MAX_VALUE){
            dist[i]=-1;
        }
    }
    return dist;
  }
}