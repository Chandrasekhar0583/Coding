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
    public TreeNode deleteNode(TreeNode root, int key) {
        root = delete( root ,  key);
        return root;
    }
    public TreeNode delete( TreeNode root , int key )
    {
        if( root == null )
            return null ;
        if( key > root.val )
            root.right =  delete( root.right , key );
        else if( key < root.val )
            root.left = delete( root.left , key );
        else
        {   
            if( root.left == null )
                return root.right;
            else if( root.right == null)
                return root.left;
            else{
                int min = find(root.right);
                root.val = min;
                root.right = delete( root.right , min);
            }
        }
         return root;
    }
    public int find(TreeNode root)
    {
        if( root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val , find(root.left));
    }
}