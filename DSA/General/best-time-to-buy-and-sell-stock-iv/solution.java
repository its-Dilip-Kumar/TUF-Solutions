class Solution {
    public static int solve(int idx,int buy,int[] arr,int n,int k,int[][][] dp){
        if(idx==n || k==0) return 0;
        if(dp[idx][buy][k]!=-1) return dp[idx][buy][k];
        int profit=0;
        if(buy==1){
            profit+=Math.max(-arr[idx]+solve(idx+1,0,arr,n,k,dp),solve(idx+1,1,arr,n,k,dp));
        }else{
            profit+=Math.max(arr[idx]+solve(idx+1,1,arr,n,k-1,dp),solve(idx+1,0,arr,n,k,dp));
        }
        return dp[idx][buy][k]=profit;
    }
    public int stockBuySell(int[] arr, int n, int k) {
        int[][][] dp=new int[n][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }

        return solve(0,1,arr,n,k,dp);
    }
}

