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
    public boolean isEvenOddTree(TreeNode root) {
        boolean flag = true;
        if(root == null) return true;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int pre;
            if(!flag)
            {
                pre = Integer.MAX_VALUE;
            }else{
                pre = Integer.MIN_VALUE;
            }
            int n = q.size();
            for(int i = 0 ; i < n ; i++)
            {
                TreeNode node = q.poll();
                if(flag )
                {
                    if(pre < node.val  && node.val % 2 != 0)
                    {
                        pre = node.val;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(pre > node.val  && node.val % 2 == 0)
                    {
                        pre = node.val;
                    }
                    else{
                        return false;
                    }
                }
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

            }
            flag = !flag;
        }
        return true;
    }
}