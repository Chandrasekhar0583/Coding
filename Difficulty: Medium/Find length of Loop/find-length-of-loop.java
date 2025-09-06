/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(fast.next != null && fast.next.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast )
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        return 0;
        int n = 0;
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        n = 1;
        fast = fast.next;
        while(slow != fast)
        {
            fast = fast.next;
            n++;
        }
        return n;
    }
}