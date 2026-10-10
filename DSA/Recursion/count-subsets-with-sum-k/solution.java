class Solution {
    static int mod = (int)(1e9 + 7);
    public static int solve(int idx,int[] arr,int k,int[][] dp){
        if(idx<0){
            return (k==0) ? 1 : 0;
        }
        if(k<0) return 0;
        if(dp[idx][k]!=-1) return dp[idx][k];
        int take=solve(idx-1,arr,k-arr[idx],dp);
        int notake=solve(idx-1,arr,k,dp);
        return dp[idx][k]=(take+notake)%mod;
    }
    public int perfectSum(int[] arr, int K) {
        int n=arr.length;
        int[][] dp=new int[n][K+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,arr,K,dp);
    }
}

