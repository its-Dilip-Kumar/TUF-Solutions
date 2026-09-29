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
    private int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxsum;
    }
    private int helper(TreeNode root){
        if(root==null) return 0;
        int lsum=Math.max(0,helper(root.left));
        int rsum=Math.max(0,helper(root.right));
        maxsum=Math.max(maxsum,lsum+rsum+root.data);
        return root.data+Math.max(lsum,rsum);
    }
}