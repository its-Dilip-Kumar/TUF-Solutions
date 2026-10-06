class Solution {
    public static void solve(int idx,int[] nums,List<Integer> ans,int sum){
        if(idx==nums.length){
            ans.add(sum);
            return;
        }
        solve(idx+1,nums,ans,sum+nums[idx]);
        solve(idx+1,nums,ans,sum);

    }
    public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        solve(0,nums,ans,0);
        return ans;
    }
}