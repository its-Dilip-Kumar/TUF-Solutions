class Solution {
    public static boolean canweplace(int[] nums,int k,int mid){
        int cntCows=1;
        int last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=mid){
                cntCows++;
                last=nums[i];
            }
            if(cntCows>=k) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int start=1;
        int end=nums[n-1]-nums[0];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(canweplace(nums,k,mid)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}
