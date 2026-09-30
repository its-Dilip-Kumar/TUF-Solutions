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
    public static void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public boolean isBST(TreeNode root) {
        if(root==null) return true;
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int n=ans.size();
        for(int i=0;i<n-1;i++){
            if(ans.get(i)>=ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
}