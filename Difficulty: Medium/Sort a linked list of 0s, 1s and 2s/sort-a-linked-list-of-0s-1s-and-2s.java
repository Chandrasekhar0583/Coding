/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node onelist = new Node(-1);
        Node twolist = new Node(-1);
        Node zerolist = new Node(-1);
        Node one = onelist;
        Node two = twolist;
        Node zero = zerolist;
        while(head != null)
        {
            if(head.data == 1)
            {
                one.next = head;
                one = one.next;
            }
            else if(head.data == 2)
            {
                two.next = head;
                two = two.next;
            }
            else{
                zero.next = head;
                zero = zero.next;
            }
            head = head.next;
        }
        zero.next = onelist.next != null ? onelist.next : twolist.next;
        one.next = twolist.next;
        two.next = null;
        head = zerolist.next;
        return head;
        
    }
}