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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(root.data<val){
            root.right=insertIntoBST(root.right,val);
        }else if(root.data>val){
            root.left=insertIntoBST(root.left,val);
        }
        return root;
    }
}