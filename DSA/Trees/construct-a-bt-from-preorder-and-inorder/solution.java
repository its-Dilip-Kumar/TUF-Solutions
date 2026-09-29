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
    public static int findIdx(int element,int[] inorder,int start,int end){
        for(int i=start;i<=end;i++){
            if(inorder[i]==element){
                return i;
            }
        }
        return -1;
    }
    public static TreeNode solve(int[] preorder,int[] inorder,int[] preIdx,int startIdx,int endIdx){
        if(startIdx>endIdx) return null;
        int element=preorder[preIdx[0]++];
        TreeNode root=new TreeNode(element);
        int idx=findIdx(element,inorder,startIdx,endIdx);
        root.left=solve(preorder,inorder,preIdx,startIdx,idx-1);
        root.right=solve(preorder,inorder,preIdx,idx+1,endIdx);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        int[] preIdx={0};
        return solve(preorder,inorder,preIdx,0,n-1);
    }
}