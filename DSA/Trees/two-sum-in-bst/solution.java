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
    public static void inorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public boolean twoSumBST(TreeNode root, int k) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return false;
        inorder(root, ans);
        int left=0;
        int right=ans.size()-1;
        while(left<right){
            int sum=ans.get(left)+ans.get(right);
            if(sum==k) return true;
            else if(sum<k) left++;
            else right--;
        }
        return false;
        
    }
}