
class Solution {
    public static int solve(int[] nums,int idx,int sum,int k){
        if(sum==k) return 1;
        if(idx==nums.length || sum>k) return 0;

        int include=solve(nums,idx+1,sum+nums[idx],k);
        int exclude=solve(nums,idx+1,sum,k);
        return include+exclude;
    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        int n=nums.length;
        return solve(nums,0,0,k);
        
    }
}