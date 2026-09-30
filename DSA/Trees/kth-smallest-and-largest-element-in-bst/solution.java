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
    public List<Integer> kLargesSmall(TreeNode root, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int n=ans.size();
        List<Integer> result=new ArrayList<>();
        result.add(ans.get(k-1));
        result.add(ans.get(n-k));
        return result;
    }
}