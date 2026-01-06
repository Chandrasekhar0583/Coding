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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 0;
        int res = -1;
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int n = q.size();
            level++;
            int x = 0;
            for(int i = 0 ; i < n ; i++){
                TreeNode node = q.poll();
                x += node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            if(x > max){
                max = x;
                res = level;
            }
        }
        return res;

    }
}