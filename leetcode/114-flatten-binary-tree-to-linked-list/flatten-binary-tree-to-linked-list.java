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
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        fun(root , list);
        for(int i = 1 ; i < list.size() ; i++)
        {
            list.get(i - 1).right = list.get(i);
        }
        // return root;
        return ;
    }
    public void fun(TreeNode root , ArrayList<TreeNode> list)
    {
        if(root == null) return ;
        list.add(root);
        fun(root.left , list);
        root.left = null;
        fun(root.right , list);
    }
}