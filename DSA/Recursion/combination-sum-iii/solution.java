class Solution {
    public static void solve(int idx,int[] nums,List<List<Integer>> ans,List<Integer> list,int k,int n,int sum){
        if(list.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(idx==nums.length|| sum>n) return;

        list.add(nums[idx]);
        solve(idx+1,nums,ans,list,k,n,sum+nums[idx]);
        list.remove(list.size()-1);
        solve(idx+1,nums,ans,list,k,n,sum);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] number={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(0,number,ans,list,k,n,0);
        return ans;
    }
}