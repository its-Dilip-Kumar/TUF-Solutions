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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        q.add(root);
        q.add(null);
        boolean flag=false;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                if(flag){
                    Collections.reverse(temp);
                }
                flag=!flag;
                ans.add(new ArrayList<>(temp));
                temp.clear();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                temp.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return ans;
    }
}