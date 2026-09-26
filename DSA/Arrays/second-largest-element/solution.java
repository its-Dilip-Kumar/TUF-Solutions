class Solution {
    public int secondLargestElement(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>fmax){
                smax=fmax;
                fmax=nums[i];
            }else if(nums[i]!=fmax && nums[i]>smax){
                smax=nums[i];
            }
        }
        return smax==Integer.MIN_VALUE ? -1 : smax;
    }
}