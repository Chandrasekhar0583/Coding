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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode cur = even;
        while(cur != null && cur.next != null)
        {
            odd.next = cur.next;
            cur.next = cur.next.next;
            odd = odd.next;
            cur = cur.next;
        }
        odd.next = even;
        return head;
    }
}