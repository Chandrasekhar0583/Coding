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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        HashSet<Integer> set=new HashSet<>();
        ListNode current=head;
        ListNode result=new ListNode(0);
        ListNode res=result;
        for(int i:nums)
        {
            set.add(i);
        }
     while(current!=null)
        {
            if(!set.contains(current.val))
            {
                 res.next=current;
                res=res.next;
            }
                current=current.next;
        } 
        res.next = null;
    return result.next;
    }
}