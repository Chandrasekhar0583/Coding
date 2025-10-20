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
    long sum = 0;

    public int sumNumbers(TreeNode root) {
        sum = 0;
        fun(root, 0);
        return (int) sum ;
    }

    public void fun(TreeNode root, int x) {
        // if (root == null) {
        //     sum += x;
        //     return;
        // }
        x = x * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += x;
            return;
        }
        if (root.left != null) {
            fun(root.left, x);
        }
        if (root.right != null) {
            fun(root.right, x);
        }
    }
}