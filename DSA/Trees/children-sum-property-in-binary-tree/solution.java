// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) { val = x; }
// }

class Solution {
    boolean checkChildrenSum(TreeNode root) { 
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;

        int leftval=(root.left!=null) ? root.left.val : 0;
        int rightval=(root.right!=null) ? root.right.val : 0;

        if(root.val!=leftval+rightval) return false;
        return checkChildrenSum(root.left) && checkChildrenSum(root.right);
    }
}
