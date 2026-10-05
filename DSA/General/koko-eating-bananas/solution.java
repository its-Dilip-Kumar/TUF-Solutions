class Solution {
    public static long isPossible(int[] nums,int mid){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int num:nums){
            end=Math.max(end,num);
        }

        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            long result=isPossible(nums,mid);
            if(result<=h){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}