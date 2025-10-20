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
    int index = 0;  
    public TreeNode buildTree(int[] p, int[] i) {
        int n = p.length - 1;
        index = 0;
        return fun(p , i , 0 , n );
    }
    public TreeNode fun(int p[] , int i[] , int l , int h)
    {
        if(l > h) return null;
        TreeNode head =  new TreeNode(p[index]);
        int ind ;
        for( ind = l ; ind <= h ; ind++)
        {
            if(i[ind] == p[index])
            {
                break;
            }
        }
        index++;
        head.left = fun(p , i , l , ind - 1);
        head.right = fun(p , i , ind + 1 , h);
        return head;
    }
}