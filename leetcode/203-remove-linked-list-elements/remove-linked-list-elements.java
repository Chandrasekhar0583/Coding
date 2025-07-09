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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(0) ;
        ListNode cur = prev;
        while( head != null )
        {
            if(head.val != val  )
            {
                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }
        if( prev.next != null && prev.next.val == val)
        prev.next = null;
        return cur.next;
    }
}