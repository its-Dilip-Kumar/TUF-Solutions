class Solution {
    public static int findCeil(int[] nums,int x){
        int n=nums.length;
        int ans=-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans==-1 ? -1 : nums[ans];
    }
    public static int findFloor(int[] nums,int x){
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=x){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans==-1 ? -1 : nums[ans];
    }
    public int[] getFloorAndCeil(int[] nums, int x) {
        int[] ans=new int[2];
        int floor=findFloor(nums,x);
        int ceil=findCeil(nums,x);
        ans[0]=floor;
        ans[1]=ceil;
        return ans;
    }
}