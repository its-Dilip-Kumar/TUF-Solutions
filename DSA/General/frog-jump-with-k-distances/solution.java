class Solution {
    public static int solve(int idx,int[] heights,int k,int[] dp){
        if(idx==heights.length-1){
            return 0;
        }

        if(dp[idx]!=-1) return dp[idx];

        int stepk=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(idx+i<heights.length){
            int cost=Math.abs(heights[idx]-heights[idx+i])+solve(idx+i,heights,k,dp);
            stepk=Math.min(stepk,cost);
            }
        }
        

        return dp[idx]=stepk;
    }
    public int frogJump(int[] heights, int k) {
        int n=heights.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,heights,k,dp);
    }
}