/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public static void solve(TreeNode root,List<List<Integer>> ans,List<Integer> list){
        if(root==null) return;
        list.add(root.data);
        if(root.left==null && root.right==null){
            ans.add(new ArrayList<>(list));
        }else{
            if(root.left!=null) solve(root.left,ans,list);
            if(root.right!=null) solve(root.right,ans,list);
        }

        list.remove(list.size()-1);

    }
    public List<List<Integer>> allRootToLeaf(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> list=new ArrayList<>();
        solve(root,ans,list);
        return ans;
    }
}