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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> que = new PriorityQueue<>();
        if(lists.length == 0 )
        return null;
        ListNode res = lists[0];
        for(int i = 1 ; i < lists.length ; i++ )
        {
            if(lists[i]  == null)
            continue;
            res = merge(res , lists[i]);
        }
        return res;
    }
    public ListNode merge(ListNode res , ListNode l1){
        if(l1 == null && res == null)
        return res;
        if(res == null && l1 != null)
        {
            return l1;
        }
        if(res != null && l1.val <= res.val)
        {
            ListNode res1 = l1.next;
            l1.next = res;
            res= l1;
            l1 = res1;
        }
        ListNode temp = res;
        while(temp != null && temp.next != null&& l1 != null)
        {
            if(temp.next.val >= l1.val)
            {
                ListNode temp2 = l1.next;
                l1.next = temp.next;
                temp.next = l1;
                l1 = temp2;
            }
            temp = temp.next;
            
        }
        if(l1 != null)
        {
            temp.next = l1;
        }
        return res;
    }
    public void display(ListNode head)
    {
        ListNode cur = head;
        while(cur != null)
        {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println();
    }
}