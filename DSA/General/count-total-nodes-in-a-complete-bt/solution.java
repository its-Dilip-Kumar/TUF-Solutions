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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lc=countNodes(root.left);
        int rc=countNodes(root.right);
        return lc+rc+1;
    }
}