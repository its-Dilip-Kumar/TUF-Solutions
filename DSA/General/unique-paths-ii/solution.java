class Solution {
    public static int solve(int i,int j,int[][] matrix){
        if(i<0 || j<0 || matrix[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        int left=solve(i,j-1,matrix);
        int up=solve(i-1,j,matrix);
        return left+up;
    }
    public int uniquePathsWithObstacles(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(matrix[0][0]==1) return 0;
        return solve(n-1,m-1,matrix);
    }
}