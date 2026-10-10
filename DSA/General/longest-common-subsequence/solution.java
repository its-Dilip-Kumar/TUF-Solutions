class Solution {
    public static int solve(int i,int j,String str1,String str2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j]=1+solve(i-1,j-1,str1,str2,dp);
        }
        return dp[i][j]=Math.max(solve(i-1,j,str1,str2,dp),solve(i,j-1,str1,str2,dp));
    }
    public int lcs( String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,m-1,str1,str2,dp);
    }
}

