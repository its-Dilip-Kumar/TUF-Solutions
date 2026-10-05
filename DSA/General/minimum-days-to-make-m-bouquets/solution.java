
class Solution {
    public static int solve(int[] nums,int k,int mid){
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
            }else{
                maxcount+=count/k;
                count=0;
            }
        }
        maxcount+=count/k;
        return maxcount;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
        if(k*m>n) return -1;
        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            start=Math.min(start,nums[i]);
            end=Math.max(end,nums[i]);
        }

        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=solve(nums,k,mid);
            if(count>=m){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;

    }
}


