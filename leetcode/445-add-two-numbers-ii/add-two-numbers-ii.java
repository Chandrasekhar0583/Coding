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
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null)
        {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null)
        {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode prev = null;

        ListNode cur = prev;

        int carry = 0 ;
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            int sum = s1.pop() + s2.pop() + carry;

            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            node.next = prev;

            prev = node;
        }
        while(!s2.isEmpty())
        {
            int sum = s2.pop() + carry;

            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            node.next = prev;

            prev = node;
        }
        while(!s1.isEmpty())
        {
            int sum = s1.pop() + carry;

            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            node.next = prev;

            prev = node;
        }
        if(carry != 0)
        {
            ListNode node = new ListNode(carry);
            node.next = prev;
            return node;
        }
        return prev;
    }
}