class Pair{
    int row;
    int col;
    int dist;
    public Pair(int row,int col,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
class Solution {
    public int[][] nearest(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int[][] distance=new int[n][m];
        Queue<Pair> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    visited[i][j]=true;
                    q.add(new Pair(i,j,0));
                }
            }
        }

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!q.isEmpty()){
            Pair node=q.remove();
            int r=node.row;
            int c=node.col;
            int d=node.dist;
            distance[r][c]=d;

            for(int i=0;i<4;i++){
                int delrow=r+dr[i];
                int delcol=c+dc[i];
                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && !visited[delrow][delcol]){
                    visited[delrow][delcol]=true;
                    q.add(new Pair(delrow,delcol,d+1));
                }
            }
        }

        return distance;

    }
}