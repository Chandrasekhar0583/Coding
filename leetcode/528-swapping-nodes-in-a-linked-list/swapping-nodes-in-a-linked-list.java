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
    public ListNode swapNodes(ListNode head, int k) {
        int first = -1;
        int second = -1;
        int i = 1;
        ListNode temp = head;
        while(temp != null)
        {
            if( i == k)
            {
                first = temp.val;
            }
            temp = temp.next;
            i++;
        }
        temp = head;
        int ind = i - k;
        while(ind-- > 1)
        {
            temp = temp.next;
        }
        second = temp.val;
        temp.val = first;
        i = 1;
        temp = head;
        while(temp != null)
        {
            if(i == k)
            {
                temp.val = second;
                break;
            }
            temp = temp.next;
            i++;
        }
        return head;
    }
}