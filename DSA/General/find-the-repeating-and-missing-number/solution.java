class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }

        int missing=-1;
        int repeating=-1;
        for(int i=1;i<=n;i++){
            if(freq[i]>1){
                repeating=i;
            }else if(freq[i]==0){
                missing=i;
            }
        }
        return new int[]{repeating,missing};
    }
}