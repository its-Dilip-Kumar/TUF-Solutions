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
    public static boolean isMirror(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null || p.data!=q.data) return false;
        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
}