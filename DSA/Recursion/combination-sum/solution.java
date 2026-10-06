class Solution {
    public static void solve(int idx,int[] candidates,List<List<Integer>> ans,List<Integer> list,int target,int sum){
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx==candidates.length || sum>target) return;
        list.add(candidates[idx]);
        solve(idx,candidates,ans,list,target,sum+candidates[idx]);
        list.remove(list.size()-1);
        solve(idx+1,candidates,ans,list,target,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,candidates,ans,list,target,0);
        return ans;
    }
}