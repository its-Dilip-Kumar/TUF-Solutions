class Solution {
    public static int solve(int idx,int[] coins,int amount,int[][] dp){
        if(idx<0){
            return amount==0 ? 0 : Integer.MAX_VALUE;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int take=Integer.MAX_VALUE;
        if(coins[idx]<=amount){
            int result=solve(idx,coins,amount-coins[idx],dp);
            if(result!=Integer.MAX_VALUE){
                take=1+result;
            }
        }
        int notake=solve(idx-1,coins,amount,dp);
        return dp[idx][amount]=Math.min(take,notake);
    }
    public int MinimumCoins(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(n-1,coins,amount,dp);
        return ans==Integer.MAX_VALUE ? -1 :ans;
    }
}

