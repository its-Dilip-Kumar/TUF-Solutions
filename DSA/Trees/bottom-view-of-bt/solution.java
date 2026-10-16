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
        int hd;
        public Pair(TreeNode node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public List<Integer> bottomView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair curr=q.remove();
            TreeNode node=curr.node;
            int hd=curr.hd;

            if(map.containsKey(hd)){
                map.put(hd,node.data);
            }else{
                map.put(hd,node.data);
            }

            if(node.left!=null){
                q.add(new Pair(node.left,hd-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,hd+1));
            }
        }

        for(int val:map.values()){
            ans.add(val);
        }
        return ans;

    }
}