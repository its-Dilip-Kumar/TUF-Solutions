class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=((n+1)*(n))/2;
        int totalNums=0;
        for(int x:nums){
            totalNums+=x;
        }
        return sum-totalNums;

    }
}