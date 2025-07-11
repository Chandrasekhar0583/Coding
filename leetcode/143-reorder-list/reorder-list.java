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
    public int length = 0;
    public void reorderList(ListNode head) {
        ListNode dummy = copyFun(head) ;
        length = 0;
        ListNode reverseNode = reverse(dummy);
        ListNode cur = new ListNode(0);
        ListNode current = head;
        ListNode sol = cur;
        int i = 0;
        while(length != 0 && i < length / 2 && current != null && reverseNode != null )
        {
            sol.next = new ListNode(current.val);
            sol = sol.next;
            sol.next = new ListNode(reverseNode.val);
            current = current.next;
            reverseNode = reverseNode.next;
            i++;
            sol = sol.next;
        }
        if(length % 2 != 0)
        {
            sol.next = reverseNode;
            sol = sol.next;
        }
        copyListContent(head , cur.next);
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null)
        {
            ListNode node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = node;
            length++;
        }
        return prev;
    }
    public ListNode copyFun(ListNode head)
    {
      if(head == null)
      {
        return null;
      }
      ListNode res = new ListNode(head.val);
      res.next = copyFun(head.next);
      return res;
    }
    public void copyListContent(ListNode target, ListNode source) {
        while (target != null && source != null) {
            target.val = source.val;
            target = target.next;
            source = source.next;
        }
    }

}