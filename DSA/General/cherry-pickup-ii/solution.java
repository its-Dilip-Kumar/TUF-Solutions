class Solution {
    public static int solve(int row,int col1,int col2,int[][] matrix,int[][][] dp){
        int n=matrix.length;
        int m=matrix[0].length;

        if(col1<0 || col1>=m || col2<0 || col2>=m) return Integer.MIN_VALUE;

        if(row==n-1){
            if(col1==col2){
                return matrix[row][col1];
            }
            return matrix[row][col1]+matrix[row][col2];
        }

        if(dp[row][col1][col2]!=-1) return dp[row][col1][col2];

        int current=(col1==col2) ? matrix[row][col1] : matrix[row][col1]+matrix[row][col2];


        int maxcheery=Integer.MIN_VALUE;
        for(int d1=-1;d1<=1;d1++){
            for(int d2=-1;d2<=1;d2++){
                int next=solve(row+1,col1+d1,col2+d2,matrix,dp);
                maxcheery=Math.max(maxcheery,next);
            }
        }

        return dp[row][col1][col2]=current+maxcheery;
    }
    public int cherryPickup(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][][] dp=new int[n][m][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,0,m-1,matrix,dp);
    }
}