class Solution {
    public static void solve(int[] nums,int idx,List<List<Integer>> ans,List<Integer> temp){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(nums,idx+1,ans,temp);
        temp.remove(temp.size()-1);
        solve(nums,idx+1,ans,temp);
    }
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,0,ans,temp);
        return ans;
    }
}