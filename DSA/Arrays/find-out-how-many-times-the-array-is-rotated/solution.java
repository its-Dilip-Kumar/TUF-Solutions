class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n=nums.size();
        int start=0;
        int end=n-1;
        int minval=Integer.MAX_VALUE;
        int minIdx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums.get(start)<=nums.get(mid)){
                if(nums.get(start)<minval){
                    minval=nums.get(start);
                    minIdx=start;
                }
                start=mid+1;
            }else{
                if(nums.get(mid)<minval){
                    minval=nums.get(mid);
                    minIdx=mid;
                }
                end=mid-1;
            }
        }
        return minIdx;
    }
}