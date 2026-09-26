class Solution {
    public static int sum(int idx,int sum,int[] nums){
        if(idx==nums.length-1) return sum+nums[idx];

        return sum(idx+1,sum+nums[idx],nums);

    }
    public int arraySum(int[] nums) {
        return sum(0,0,nums);
    }
}