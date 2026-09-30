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
    static TreeNode prev=null;
    static TreeNode first=null;
    static TreeNode second=null;
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && prev.data>root.data){
            if(first==null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        inorder(root.right);
    }
    void recoverTree(TreeNode root) {
        if(root==null) return;
        prev=first=second=null;
        inorder(root);
        int temp=first.data;
        first.data=second.data;
        second.data=temp;

    }
}