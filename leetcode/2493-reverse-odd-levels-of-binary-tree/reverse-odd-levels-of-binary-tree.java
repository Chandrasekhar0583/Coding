/**
 * Definition for a binary tree TreeNode.
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
    // public boolean flag = true;
    public TreeNode reverseOddLevels(TreeNode root) {
      ArrayList<TreeNode> q = new ArrayList<>();
      Stack<Integer> stk = new Stack<>();
      boolean flag = true;
        if(root == null) return null;
        q.add(root);
        while(!q.isEmpty())
        {
            int x = q.size();
            // int i = 0;
            if(!flag)
            for(int i = 0 ; i < x ; i++)
            {
                q.get(i).val = stk.pop();
            }
            int i = 0;
            while( i < x )
            {
                TreeNode temp = q.remove(0);
                if( temp.left != null)
                {
                    q.add(temp.left);
                    if(flag)
                    {
                        stk.push(temp.left.val);
                    }
                }
                if( temp.right != null )
                {
                    q.add(temp.right);
                    if(flag)
                    {
                        stk.push(temp.right.val);
                    }
                }
                i++;
            }
            flag = !flag;
        }
        return root;
    }
}