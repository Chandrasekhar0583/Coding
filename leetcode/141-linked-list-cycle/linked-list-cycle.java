/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head ;
        ListNode temp = head ;
        while( temp !=null &&temp.next != null && temp.next.next != null)
        {
            temp = temp.next.next;
            current = current.next;
            if(temp == current)
            return true;
        }
        return false;
    }
}