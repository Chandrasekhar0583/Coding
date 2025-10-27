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
    int max ;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        int res =  fun(root);
        return max;
    }
    public int fun(TreeNode root)
    {
        if(root == null) return 0;

        int l = fun(root.left);
        int r = fun(root.right);
        int val = Math.max(Math.max( l , r) + root.val, root.val);
        max = Math.max(Math.max(val ,max) , l + r + root.val);
        return val;
    }
}