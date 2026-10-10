class Solution {
    static int mod = (int)(1e9 + 7);
    public static int solve(int i,int j,String s1,String s2,int[][] dp){
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            int take=solve(i-1,j-1,s1,s2,dp);
            int notake=solve(i-1,j,s1,s2,dp);
            return dp[i][j]=(take+notake)%mod;
        }else{
            return dp[i][j]=solve(i-1,j,s1,s2,dp)%mod;
        }
    }
    public int distinctSubsequences(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,m-1,s,t,dp);
    }
}