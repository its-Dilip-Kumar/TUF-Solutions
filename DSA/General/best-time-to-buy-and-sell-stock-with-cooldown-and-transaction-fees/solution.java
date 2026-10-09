class Solution {
    public static int solve(int idx,int buy,int[] arr,int n,int fee,int[][] dp){
        if(idx==n) return 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        int profit=0;
        if(buy==1){
            profit+=Math.max(-arr[idx]+solve(idx+1,0,arr,n,fee,dp),solve(idx+1,1,arr,n,fee,dp));
        }else{
            profit+=Math.max(arr[idx]-fee+solve(idx+1,1,arr,n,fee,dp),solve(idx+1,0,arr,n,fee,dp));
        }
        return dp[idx][buy]=profit;
    }
    public int stockBuySell(int[] arr, int n, int fee) {
       int[][] dp=new int[n][2];
       for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
       }
       return solve(0,1,arr,n,fee,dp);
    }
}
