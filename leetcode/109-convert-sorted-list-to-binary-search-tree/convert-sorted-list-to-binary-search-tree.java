/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
        return null;
        int n = 0;
        ListNode cur = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(cur != null)
        {
            n++;
            list.add(cur.val);
            cur = cur.next;
        }
        return generate(list , 0 , n - 1);
    }
    public TreeNode generate(ArrayList<Integer> list , int low , int high)
    {
        if(low > high)
        return null;
        if(low == high)
        {
            return new TreeNode(list.get(low));
        }
        int mid = (int)Math.ceil((double)((low + high)/2));
        TreeNode root = new TreeNode(list.get(mid));
        root.left = generate(list , low , mid - 1);
        root.right = generate(list , mid + 1 , high);
        return root ;
     }
}