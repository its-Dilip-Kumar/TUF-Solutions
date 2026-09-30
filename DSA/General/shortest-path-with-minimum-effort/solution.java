class Pair{
    int weight;
    int row;
    int col;
    public Pair(int weight,int row,int col){
        this.weight=weight;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int n=grid.length;
        int m=grid[0].length;
        if(source[0]==destination[0] && source[1]==destination[1]) return 0;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }

        dist[source[0]][source[1]]=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,source[0],source[1]));
       
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            Pair node=q.remove();
            int d=node.weight;
            int r=node.row;
            int c=node.col;

            for(int i=0;i<4;i++){
                int delrow=r+dr[i];
                int delcol=c+dc[i];
                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && grid[delrow][delcol]==1 && d+1<dist[delrow][delcol]){
                    dist[delrow][delcol]=d+1;
                    if(delrow==destination[0] && delcol==destination[1]) return d+1;
                    q.add(new Pair(d+1,delrow,delcol));
                }
            } 
        }
        return -1;
    }
}

