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
    public TreeNode lca(TreeNode root, int p, int q) {
        if(root==null || p==root.data || q==root.data) return root;
        TreeNode leftLca=lca(root.left,p,q);
        TreeNode rightLca=lca(root.right,p,q);
        if(leftLca!=null && rightLca!=null) return root;
        return leftLca!=null ? leftLca : rightLca;
    }
}