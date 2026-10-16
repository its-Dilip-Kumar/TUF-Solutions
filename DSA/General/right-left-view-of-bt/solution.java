/**
 * Definition for a binary tree node. public class TreeNode { int data; TreeNode left; TreeNode
 * right; TreeNode(int val) { data = val; left = null, right = null } }
 */
class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    if (root == null) return ans;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      TreeNode curr = null;
      int n = q.size();
      for (int i = 0; i < n; i++) {
        curr = q.remove();
        if (curr.left != null) q.add(curr.left);
        if (curr.right != null) q.add(curr.right);
      }

      ans.add(curr.data);
    }
    return ans;
  }
}
