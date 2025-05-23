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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while( temp!= null )
        {
            count++;
           
            temp = temp.next;
        }
        temp = head;
        int c =count - count % 2 == 0 ? count / 2 + 1 : count / 2 + 1;
        while( c-- > 1 )
        {
            temp = temp.next;
        }
        return temp;
    }
}