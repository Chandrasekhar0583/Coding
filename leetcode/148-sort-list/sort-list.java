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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next== null)
        {
            return head;
        }
        ListNode second = split(head);
        head = sortList(head);
        second = sortList(second);
        return merge(head , second);
    }
    public ListNode merge(ListNode h1 , ListNode h2)
    {
        if(h1 == null )
        return h2;
        if(h2 == null)
        return h1;
        if(h2.val < h1.val)
        {
            ListNode temp = h2.next;
            h2.next = h1;
            h1 = h2;
            h2 = temp;
        }
        ListNode temp1 = h1;
        while(h1.next != null && h2 != null)
        {
            if(h2.val <= h1.next.val)
            {
                ListNode temp = h2.next;
                h2.next = h1.next;
                h1.next = h2;
                h2 = temp;
            }
            h1 = h1.next;
        }
        if(h2 != null)
        {
            h1.next = h2;
        }
        return temp1;
    }

    public ListNode split(ListNode split)
    {
        ListNode slow = split;
        ListNode fast = split;
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        return fast;
    }
}