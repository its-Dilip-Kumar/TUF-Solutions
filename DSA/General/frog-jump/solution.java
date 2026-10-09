class Solution {
    public static int solve(int idx,int[] heights,int[] dp){
        if(idx==heights.length-1){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int step1=Integer.MAX_VALUE;
        if(idx+1<heights.length){
            step1=Math.abs(heights[idx]-heights[idx+1])+solve(idx+1,heights,dp);
        }
        int step2=Integer.MAX_VALUE;
        if(idx+2<heights.length){
            step2=Math.abs(heights[idx]-heights[idx+2])+solve(idx+2,heights,dp);
        }
        return dp[idx]=Math.min(step1,step2);
    }
    public int frogJump(int[] heights) {
        int n=heights.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,heights,dp);
    }
}