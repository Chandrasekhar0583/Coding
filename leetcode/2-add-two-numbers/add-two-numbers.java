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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode();
        ListNode current = newNode;
        int carry = 0;
        while(l1 != null && l2 != null)
        {
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            ListNode n = new ListNode(value % 10 , null );
            current.next = n;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            int value = carry + l1.val;
            ListNode n = new ListNode(value % 10 , null);
            carry = value / 10;
            current.next = n;
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null)
        {
            int value = carry + l2.val;
            ListNode n = new ListNode(value % 10 , null);
            carry = value / 10;
            current.next = n;
            current = current.next;
            l2 = l2.next;
        }
        if(carry == 1)
        {
            ListNode n = new ListNode(1 ,null);
            current.next = n;
        }
        return newNode.next;
    }
}