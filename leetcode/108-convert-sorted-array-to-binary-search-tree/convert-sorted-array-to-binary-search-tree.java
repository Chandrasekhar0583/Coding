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
    public TreeNode sortedArrayToBST(int[] nums) {
        return fun(nums , 0 , nums.length - 1);
    }
    public TreeNode fun(int nums[] , int l , int h)
    {
        if(l > h ) return null;
        int mid = (l + h)/2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = fun(nums , l , mid - 1);
        head.right = fun(nums , mid + 1 , h);
        return head;
    }
}