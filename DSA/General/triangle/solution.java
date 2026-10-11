class Solution {
    public static int solve(int i,int j,int[][] matrix,int[][] dp){
        if(j>=matrix[i].length) return Integer.MAX_VALUE;
        if(i==matrix.length-1) return matrix[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int bottom=solve(i+1,j,matrix,dp);
        int bottomRight=solve(i+1,j+1,matrix,dp);
        return dp[i][j]=matrix[i][j]+Math.min(bottom,bottomRight);
    }
    public int minTriangleSum(int[][] triangle) {
        int n=triangle.length;
        int m=triangle[0].length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            min=Math.min(min,solve(0,j,triangle,dp));
        }
        return min;
    }
}