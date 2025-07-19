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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode tempPrev = new ListNode(0);
        ListNode cur = tempPrev;
        while(temp != null)
        {
          if(temp.val < x)
          {
            if(temp == head)
            {
                head =head.next;
            }
            ListNode next = temp.next;
            tempPrev.next = new ListNode(temp.val);
            tempPrev = tempPrev.next;
            if(prev != null ){
              prev.next = next;
              }
            temp = next;
          }
          else{
            prev = temp;
            temp = temp.next;
          }
        }
        tempPrev.next = head;
        return cur.next;
    }
}