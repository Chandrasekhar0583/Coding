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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> l = new ArrayList<>();
            int n = q.size();
            for(int i = 0 ; i < n ; i++)
            {
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null)q.add(node.right);
            }
            res.add(l);
        }
        return res;
    }
}