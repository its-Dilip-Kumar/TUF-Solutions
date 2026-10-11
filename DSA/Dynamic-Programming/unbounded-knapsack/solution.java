class Solution {
    public static int solve(int[] wt, int[] val, int idx, int W, int[][] dp) {
    if (idx < 0 || W == 0) return 0;
    if (dp[idx][W] != -1) return dp[idx][W];

    if (wt[idx] <= W) {
        int take = val[idx] + solve(wt, val, idx, W - wt[idx], dp);   // ✅ idx
        int notTake = solve(wt, val, idx - 1, W, dp);
        return dp[idx][W] = Math.max(take, notTake);
    } else {
        return dp[idx][W] = solve(wt, val, idx - 1, W, dp);
    }
}
    public int unboundedKnapsack(int[] wt, int[] val, int n, int W) {
        int[][] dp=new int[n][W+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(wt,val,n-1,W,dp);
    }
}
