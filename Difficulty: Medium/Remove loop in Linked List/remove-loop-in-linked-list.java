/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(slow != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        // System.out.println(flag);
        if(flag)
        {
            slow = head;
            flag = false;
            if(head == fast)
            {
                while(fast.next != slow)
                fast = fast.next;
            }
            else
            while(slow.next != fast.next)
            {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}