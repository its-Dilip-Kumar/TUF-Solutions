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
    public static void preorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        ans.add(root.data);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public List<Integer> preorder(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
}