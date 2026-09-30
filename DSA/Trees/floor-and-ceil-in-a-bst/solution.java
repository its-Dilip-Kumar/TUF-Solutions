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
    public static int findCeil(TreeNode root,int key){
        if(root==null) return -1;
        int ceil=-1;
        while(root!=null){
            if(root.data==key) return root.data;
            if(root.data<key){
                root=root.right;
            }else{
                ceil=root.data;
                root=root.left;
            }
        }
        return ceil;
    }
    public static int findFloor(TreeNode root,int key){
        if(root==null) return -1;
        int floor=-1;
        while(root!=null){
            if(root.data==key) return root.data;
            if(root.data>key){
                root=root.left;
            }else{
                floor=root.data;
                root=root.right;
            }
        }
        return floor;
    }
    public List<Integer> floorCeilOfBST(TreeNode root, int key) {
        if(root==null) return Arrays.asList(-1,-1);
        List<Integer> ans=new ArrayList<>();
        int floor=findFloor(root,key);
        int ceil=findCeil(root,key);
        ans.add(floor);
        ans.add(ceil);
        return ans;

        
    }
}