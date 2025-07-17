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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = 1 ;
        ListNode cur = head;
        while(i + 1 < left && cur != null)
        {
            cur = cur.next;
            i++;
        }
        if(cur.next == null)
        return head;
        if(left == 1)
        {
            head = rotate(cur , right - left );
        }
        else{
           cur.next = rotate(cur.next , right - left);
        }
        return head;
    }
    public ListNode rotate(ListNode head , int r)
    {
        int i = 0;
        ListNode cur = head;
        ListNode prev = new ListNode(head.val);
        cur = cur.next;
        while(i < r && cur != null)
        {
            ListNode  temp = cur.next;
            cur.next = prev;
            prev = cur;
            i++;
            cur = temp;
        }
        ListNode temp = prev;
        while(temp != null && temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = cur;
        return prev;

    }
}