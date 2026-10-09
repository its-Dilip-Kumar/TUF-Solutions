class Solution {
    public static int solve(int idx,int last,int[][] matrix,int m,int[][] dp){
        if(idx==0){
            int maxi=0;
            for(int i=0;i<m;i++){
                if(i!=last){
                    maxi=Math.max(maxi,matrix[idx][i]);
                }
            }
            return maxi;
        }

        if(dp[idx][last]!=-1) return dp[idx][last];

        int maxi=0;
        for(int i=0;i<m;i++){
            if(i!=last){
                int curr=matrix[idx][i]+solve(idx-1,i,matrix,m,dp);
                maxi=Math.max(maxi,curr);
            }
        }
        return dp[idx][last]=maxi;
    }
    public int ninjaTraining(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][4];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,3,matrix,m,dp);
    }
}