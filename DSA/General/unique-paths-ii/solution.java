class Solution {
    public static int solve(int i,int j,int[][] matrix,int[][] dp){
        if(i<0 || j<0 || matrix[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int left=solve(i,j-1,matrix,dp);
        int up=solve(i-1,j,matrix,dp);
        return dp[i][j]=left+up;
    }
    public int uniquePathsWithObstacles(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(matrix[0][0]==1) return 0;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,m-1,matrix,dp);
    }
}