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
    public static int count = 0;
    public int[] nextLargerNodes(ListNode head) {
        count = 0;
        Stack<Integer> stk =new Stack<>();
        ListNode reverse = reverse(head);
        int arr[] = new int[count];
        count--;
        arr[count] = 0;
        stk.push(reverse.val);
        reverse = reverse.next;
        while(reverse != null)
        {
            count--;
            while(!stk.isEmpty() && stk.peek() <= reverse.val )
            {
                stk.pop();
            }
            if(!stk.isEmpty() )
            {
                arr[count] = stk.peek();
            }
            else{
                arr[count] = 0 ;
            }
            stk.push(reverse.val);
            reverse = reverse.next;
        }
        return arr;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode res = null;
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = res;
            res = head;
            count++;
            head = temp;
        }
        return res;
    }
}