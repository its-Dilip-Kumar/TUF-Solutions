class Solution {
    public static void pass(int[] nums,int j,int n){
        if(j>=n-1) return;
        if(nums[j+1]<nums[j]){
            int temp=nums[j+1];
            nums[j+1]=nums[j];
            nums[j]=temp;
        }
        pass(nums,j+1,n);
    }
    public static void sort(int[] nums,int n){
        if(n==1) return;
        pass(nums,0,n);
        sort(nums,n-1);
    }
    public int[] bubbleSort(int[] nums) {
        int n=nums.length;
        sort(nums,n);
        return nums;
    }
}