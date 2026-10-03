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
        for(int i=0;i<ans.size();i++){
            for(int j=i+1;j<ans.size();j++){
                int target=ans.get(i)+ans.get(j);
                if(target==k){
                    return true;
                }
            }
        }
        return false;
        
    }
}