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
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        return true;
        Check c = validate(root);
       return c.flag;
    }
    public Check validate(TreeNode root)
    {
        if(root == null)
        return new Check(Long.MAX_VALUE,Long.MIN_VALUE , true);
        Check left = validate(root.left);
        Check right = validate(root.right);
        if(!left.flag)
        return left;
        if(!right.flag)
        return right;
        if(root.val <= left.max ){
            left.flag = false;
        return left;
        }
        if(root.val >= right.min)
        {
            right.flag = false;
            return right;
        }
        long min = Math.min(left.min,root.val);
        long max = Math.max(right.max , root.val);
        return new Check(min , max , true);
    }
}
 class Check
 {
    long min,max;
    boolean flag ;
    Check(long min , long max , boolean  flag)
    {
        this.min = min;
        this.flag = flag;
        this.max = max;
    }
 }