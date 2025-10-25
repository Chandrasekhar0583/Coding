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
    TreeNode prev , first , middle , last;
    public void recoverTree(TreeNode root) {
        prev = null ; first = null ; middle = null ; last = null;
        inorder(root);
        if(first != null && last != null)
        {
            int val = last.val;
            last.val = first.val;
            first.val = val;
        }
        else if(first != null)
        {
            int val = first.val;
            first.val = middle.val;
            middle.val = val;
        }
        return ;
    }
    public void inorder(TreeNode root)
    {
        if(root == null) return ;

        inorder(root.left);

        if(prev != null && prev.val > root.val )
        {
            if(first == null)
            {
                first = prev;
                middle = root;
            }
            else{
                last = root;
            }
        }
        prev = root;

        inorder(root.right);
        return ;
    }
}