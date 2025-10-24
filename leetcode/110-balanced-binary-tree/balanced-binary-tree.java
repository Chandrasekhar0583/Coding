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
    public boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
         int t = fun(root);
         return flag;
    }
    public int fun(TreeNode root)
    {
        if(root == null) return 0;

        int l = fun(root.left);
        int r = fun(root.right);

        if(Math.abs(l - r) > 1)
        flag = false;

        return Math.max(l , r) + 1;


    }
}