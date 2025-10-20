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
    public TreeNode buildTree(int[] i, int[] p) {
        int n = i.length;
        index = n -1;
        return fun(i , p , 0 , n - 1);
    }
    public TreeNode fun(int i[] , int p[] , int l , int h)
    {
        if(l > h) return null;
        TreeNode head = new TreeNode(p[index]);

        int ind ;
        for(ind = l ; ind <= h ; ind++)
        {
            if(i[ind] == p[index])
            {
                break;
            }
        }
        index--;
        head.right = fun(i , p , ind + 1 , h);
        head.left = fun(i , p , l , ind - 1);
        return head;
    }
}