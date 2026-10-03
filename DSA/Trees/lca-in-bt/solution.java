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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==root || q==root) return root;
        TreeNode leftLca=lowestCommonAncestor(root.left,p,q);
        TreeNode rightLca=lowestCommonAncestor(root.right,p,q);
        if(leftLca!=null && rightLca!=null) return root;
        return leftLca!=null ? leftLca : rightLca;
    }
}