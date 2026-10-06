class Solution {
    public static boolean solve(int[] nums,int idx,int sum,int k){
        if(sum==k) return true;
        if(idx==nums.length || sum>k) return false;

        if(solve(nums,idx+1,sum+nums[idx],k)) return true;
        return solve(nums,idx+1,sum,k);
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
        int n=nums.length;
        return solve(nums,0,0,k);
    }
}