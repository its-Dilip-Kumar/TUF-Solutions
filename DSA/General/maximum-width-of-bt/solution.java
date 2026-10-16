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
    class Pair{
        TreeNode node;
        int idx;
        public Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        int maxwidth=0;
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            int n=q.size();
            int first=-1;
            int last=-1;
            for(int i=0;i<n;i++){
                Pair curr=q.remove();
                if(i==0) first=curr.idx;
                if(i==n-1) last=curr.idx;
                if(curr.node.left!=null) q.add(new Pair(curr.node.left,2*curr.idx+1));
                if(curr.node.right!=null) q.add(new Pair(curr.node.right,2*curr.idx+2));
            }
            maxwidth=Math.max(maxwidth,last-first+1);
        }
        return maxwidth;
    }
}