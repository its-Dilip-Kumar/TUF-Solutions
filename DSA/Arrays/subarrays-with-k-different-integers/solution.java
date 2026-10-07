class Solution {
    public static int solve(int[] nums,int goal){
        int n=nums.length;
        if(n==0 || goal==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        while(right<n){
            int val=nums[right];
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }

            while(map.size()>goal){
                int leftval=nums[left];
                map.put(leftval,map.get(leftval)-1);
                if(map.get(leftval)==0) map.remove(leftval);
                left++;
            }

            count+=(right-left+1);
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length;
        return solve(nums,k)-solve(nums,k-1);
    }
}