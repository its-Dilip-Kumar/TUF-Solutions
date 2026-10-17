class Solution {
    public static void solve(int[][] grid,int row,int col,List<String> list,StringBuilder str,int[][] visited){
        visited[row][col]=1;
        if(row==grid.length-1 && col==grid[0].length-1){
            list.add(str.toString());
            visited[row][col]=0;
            return;
        }

        int[] dr={0,0,-1,1};
        int[] dc={1,-1,0,0};
        char[] direction={'R','L','U','D'};
        for(int i=0;i<4;i++){
            int delrow=row+dr[i];
            int delcol=col+dc[i];
            char delchar=direction[i];
            if(delrow>=0 && delrow<grid.length && delcol>=0 && delcol<grid[0].length && grid[delrow][delcol]==1 && visited[delrow][delcol]!=1){
                str.append(delchar);
                solve(grid,delrow,delcol,list,str,visited);
                str.deleteCharAt(str.length() - 1);
            }
        }
        visited[row][col] = 0;
    } 
    public List<String> findPath(int[][] grid) {
        List<String> ans=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==0) return ans;
        int[][] visited=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(visited[i],0);
        }

        solve(grid,0,0,ans,new StringBuilder(),visited);
        return ans;
    }
}