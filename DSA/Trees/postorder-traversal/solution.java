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
    public static void postorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.data);
    }
    public List<Integer> postorder(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
}