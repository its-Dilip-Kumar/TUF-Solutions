class Solution {
    public static void swap(int first,int second,int[] nums){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[j]!=0){
                swap(i,j,nums);
                i++;
            }
            j++;
        }
    }
}