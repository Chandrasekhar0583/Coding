/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == slow )
        {
            return null;
        }
        fast = head;
        while( fast.next != slow )
        {
            fast = fast.next;
        }
        fast.next = fast.next.next;
        return head;
    }
}