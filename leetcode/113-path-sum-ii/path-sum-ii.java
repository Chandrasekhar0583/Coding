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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        if(root == null ) return res;
        fun(root , sum , res , temp);
        return res;
    }
    public void fun(TreeNode root , int sum , List<List<Integer>> res , ArrayList<Integer> temp  )
    {
        if(root == null) return;
        sum -= root.val;
        temp.add(root.val);
        fun(root.left , sum , res , temp);
        fun(root.right , sum , res , temp);
        if(root.left == null && root.right == null && sum == 0)
        {
            res.add(new ArrayList<>(temp));
        }
        temp.remove(temp.size() - 1);
    }
}