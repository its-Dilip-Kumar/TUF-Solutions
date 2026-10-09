class Solution {
    public static int solve(int idx,int buy,int[] arr,int n,int cap,int[][][] dp){
        if(idx==n || cap==0) return 0;
        if(dp[idx][buy][cap]!=-1) return dp[idx][buy][cap];
        int profit=0;
        if(buy==1){
            profit+=Math.max(-arr[idx]+solve(idx+1,0,arr,n,cap,dp),solve(idx+1,1,arr,n,cap,dp));
        }else{
            profit+=Math.max(arr[idx]+solve(idx+1,1,arr,n,cap-1,dp),solve(idx+1,0,arr,n,cap,dp));
        }
        return dp[idx][buy][cap]=profit;
    }
    public int stockBuySell(int[] arr, int n) {
        int[][][] dp=new int[n][2][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,1,arr,n,2,dp);
    }
}

