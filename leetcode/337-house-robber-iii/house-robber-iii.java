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
    public int rob(TreeNode root) {
        HashMap<TreeNode, int[]> map = new HashMap<>();

        int a[] = fun(root, map);
        return Math.max(a[0], a[1]);

    }

    public int[] fun(TreeNode root, HashMap<TreeNode, int[]> map) {
        if (root == null)
            return new int[] { 0, 0 };

        if (map.containsKey(root))
            return map.get(root);
        int left[] = fun(root.left, map);
        int right[] = fun(root.right, map);
        int rob = root.val + left[1] + right[1];
        int notRob = Math.max(left[0], left[1]) + Math.max(right[1], right[0]);
        map.put(root, new int[] { rob, notRob });
        return map.get(root);
    }
}