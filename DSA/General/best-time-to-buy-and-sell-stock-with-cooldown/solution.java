class Solution {
    public static int solve(int idx,int buy,int[] prices,int n,int[][] dp){
        if(idx>=n) return 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        int profit=0;
        if(buy==1){
            profit+=Math.max(-prices[idx]+solve(idx+1,0,prices,n,dp),solve(idx+1,1,prices,n,dp));
        }else{
            profit+=Math.max(prices[idx]+solve(idx+2,1,prices,n,dp),solve(idx+1,0,prices,n,dp));
        }
        return dp[idx][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,1,prices,n,dp);
    }
}
