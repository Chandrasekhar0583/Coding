/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int x = len(head1);
        int y = len(head2);
        if(y > x)
        {
            int r = y - x;
            while(r > 0)
            {
                r--;
                head2 = head2.next;
            }
        }
        else if(x > y)
        {
            int r =  x - y;
            while(r > 0)
            {
                r--;
                head1 = head1.next;
            }
        }
        while(head1 != null && head2 != null)
        {
            if(head1 == head2) return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
    public int len(Node head)
    {
        if(head == null) return 0;
        
        return len(head.next) + 1;
    }
}