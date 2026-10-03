class Solution {
    public int[] reverseArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        reverse(nums,result,0);
        return result;
    }
    public static void reverse(int[] nums,int[] result,int i){
        if(i==nums.length) return ;

        result[nums.length-1-i]=nums[i];

        reverse(nums,result,i+1);
    }
}