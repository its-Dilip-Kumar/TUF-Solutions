class Solution {
    public static void solve(int idx,int[] nums,List<List<Integer>> ans,List<Integer> list){
        if(idx==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        solve(idx+1,nums,ans,list);
        list.remove(list.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        solve(idx+1,nums,ans,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,ans,list);
        return ans;
    }
}