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
 class Help{
    int height;
    public Help()
    {
        height = 0;
    }
 }
class Solution {
    public int maxDepth(TreeNode root) {
        Help h = fun(root);
        return h.height; 
    }
    public Help fun(TreeNode root)
    {
        if(root == null)
        {
            return new Help();
        }
        Help l = fun(root.left);
        Help r = fun(root.right);
        Help now = new Help();
        now.height = Math.max(l.height , r.height) + 1;
        return now;
    }
}