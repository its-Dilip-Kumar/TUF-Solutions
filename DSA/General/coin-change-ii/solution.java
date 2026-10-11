class Solution {
    static int mod=(int)(1e9+7);
    public static int solve(int idx,int[] coins,int amount,int[][] dp){
        if(idx==0){
            return amount%coins[idx]==0 ? 1 : 0;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];

        int pick=0;
        if(coins[idx]<=amount){
            pick=solve(idx,coins,amount-coins[idx],dp);
        }

        int notpick=solve(idx-1,coins,amount,dp);
        return dp[idx][amount]=(pick+notpick)%mod;
    }
    public int count(int[] coins, int N, int amount) {
        int[][] dp=new int[N][amount+1];
        for(int i=0;i<N;i++){
            Arrays.fill(dp[i],-1);
        }
      return solve(N-1,coins,amount,dp);
    }
}
