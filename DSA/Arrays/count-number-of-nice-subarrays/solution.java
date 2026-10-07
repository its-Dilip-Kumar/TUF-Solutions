class Solution {
    public static int solve(int[] nums,int goal){
        int n=nums.length;
        if(goal<0) return 0;
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        while(right<n){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
    public int numberOfOddSubarrays(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i]%2;
        }
        return solve(arr,k)-solve(arr,k-1);
    }
}