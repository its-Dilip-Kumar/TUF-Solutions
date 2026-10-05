class Solution {
    public static int spid(int divisor,int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+divisor-1)/divisor;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int limit) {
       int start=1;
       int end=0;
       for(int i=0;i<nums.length;i++){
        end=Math.max(end,nums[i]);
       }

       int ans=-1;

       while(start<=end){
        int mid=start+(end-start)/2;
        int result=spid(mid,nums);
        if(result<=limit){
            ans=mid;
            end=mid-1;
        }else{
            start=mid+1;
        }
       }

       return ans;
    }
}