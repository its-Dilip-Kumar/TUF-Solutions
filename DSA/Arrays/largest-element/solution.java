class Solution {
    public int largestElement(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(max<=nums[i]) max=nums[i];
        }

        return max;
    }
}