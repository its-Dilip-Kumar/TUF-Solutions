class Solution {
    public static boolean solve(int idx,int[] arr,int target,int sum,Boolean[][] dp){
        if(sum==target) return true;
        if(idx<0 || sum>target) return false;
        if(dp[idx][sum]!=null) return dp[idx][sum];
        boolean take=solve(idx-1,arr,target,sum+arr[idx],dp);
        boolean notake=solve(idx-1,arr,target,sum,dp);
        return dp[idx][sum]=take || notake;
    }
    public boolean isSubsetSum(int[] arr, int target) {
      int n=arr.length;
      Boolean[][] dp=new Boolean[n][target+1];
      return solve(n-1,arr,target,0,dp);
    }
}
