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
    public int count = 0;
    public long sum = 0;
    public int pathSum(TreeNode root, int t) {
        count  = 0 ;
        sum = 0;
        if(root == null) return 0;
        HashMap<Long , Integer> map = new HashMap<>();
        fun(root , t , map );
        return count;
    }
    public void fun(TreeNode root , long t ,  HashMap<Long , Integer> map)
    {
        if(root == null) {
            return ;
        } 
        sum += root.val;
        if(sum == t ){ count++; }
        Long val = sum - t;
        if(map.containsKey(val))
        {
            count += map.get(val);
        }
        // System.out.println(root.val+" "+sum+" "+val+" "+count);
        map.put(sum , map.getOrDefault(sum , 0) + 1);
        fun(root.left , t ,map );
        fun(root.right , t, map );
        if(map.get(sum) > 1)
        {
            map.put(sum , map.get(sum ) - 1);
        }
        else{
            map.remove(sum);
        }
        sum -= root.val;
        return ;
    }
}