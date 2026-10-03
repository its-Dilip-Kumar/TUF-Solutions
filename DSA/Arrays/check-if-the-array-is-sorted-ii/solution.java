class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        return solve(nums,0);
    }
    public static boolean solve(ArrayList<Integer> nums,int i){
        if(i>=nums.size()-1) return true;
        if(nums.get(i)>nums.get(i+1)){
            return false;
        }
        return solve(nums,i+1);
    }
}