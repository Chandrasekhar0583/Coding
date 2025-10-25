/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    String s;

    public String smallestFromLeaf(TreeNode root) {
        s = "";
        fun(root, new StringBuilder());
        return s;
    }

    public void fun(TreeNode root, StringBuilder sb) {
        if (root == null)
            return;
        sb.append((char) ((int) 'a' + root.val));
        if (root.left == null && root.right == null) {
            String s1 = new StringBuilder(sb).reverse().toString();
            if ((s1.compareTo(s) < 0 || s.length() == 0)) {
                s = s1;
            }
        } else {
            fun(root.left, sb);
            fun(root.right, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}