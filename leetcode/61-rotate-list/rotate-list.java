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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
        return head;
        int n = 0;
        ListNode cur = head;
        while( cur != null )
        {
            n++;
            cur = cur.next;
        }
        cur = head ;
        k = k % n;
        head = rotate(head , 0 , n - k - 1);
        head = rotate(head , n - k , n - 1 );
        head = rotate(head , 0 , n - 1 );
        return head;
    }
    public ListNode rotate(ListNode head, int low , int high)
    {
        if(head == null)
        return head;
        ListNode cur = head;
        int c = 0;
        while( c + 1 < low && cur != null)
        {
            cur = cur.next;
            c++;
        }
        if(low == 0)
        {
            head = reverse(head , high - low);
        }
        else{
            cur.next = reverse(cur.next , high - low);
        }
      return head;
    }
    public ListNode reverse(ListNode head , int r)
    {
        if(head == null)
        return head;
        int r1 = 0 ; 
        ListNode cur = head;
        ListNode prev = new ListNode(cur.val);
        cur = cur.next;
        while(cur != null && r1 < r)
        {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            r1++;
        }
        ListNode temp = prev;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = cur;
        return prev;
    }
}