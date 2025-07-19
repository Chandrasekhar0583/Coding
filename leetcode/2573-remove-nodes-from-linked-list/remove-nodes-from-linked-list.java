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
    public ListNode removeNodes(ListNode head) {
        if(head == null)
        return head;
        Stack<Integer> stk = new Stack<>();
        ListNode reverse = reverse(head);
        stk.push(reverse.val);
        ListNode prev = reverse;
        head = prev;
        reverse = reverse.next;
        while(reverse != null)
        {
            while(!stk.isEmpty() && reverse != null && reverse.val < stk.peek() )
            {
                reverse = reverse.next;
            }
            if(reverse != null){
            stk.push(reverse.val);
            prev.next = reverse;
            prev = prev.next;
            reverse = reverse.next;
            }
            prev.next = null;
        }
        return reverse(head);

    }
    public ListNode reverse(ListNode head)
    {
        ListNode res = null;
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = res;
            res = head;
            head = temp;
        }
        return res;
    }
}