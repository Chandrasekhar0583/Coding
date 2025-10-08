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
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node res = new Node(-1);
        Node temp = res;
        int carry = 0;
        while(head1 != null && head2 != null)
        {
            int sum = head1.data + head2.data + carry;
            int r = sum % 10;
            carry = sum / 10;
            head1.data = r;
            Node next = head1.next;
            temp.next = head1;
            head1 = next;
            head2 = head2.next;
            temp = temp.next;
        }
        while(head1 != null )
        {
            int sum = head1.data  + carry;
            int r = sum % 10;
            carry = sum / 10;
            head1.data = r;
            Node next = head1.next;
            temp.next = head1;
            head1 = next;
            temp = temp.next;
    }
        while(head2 != null )
        {
            int sum = head2.data  + carry;
            int r = sum % 10;
            carry = sum / 10;
            head2.data = r;
            Node next = head2.next;
            temp.next = head2;
            head2 = next;
            temp = temp.next;
    }
    if(carry > 0)
    {
        Node n = new Node(carry);
        temp.next = n;
    }
        res =  reverse(res.next);
    while(res != null)
    {
        if(res.data > 0 )
        return res;
        res = res.next;
    }
    res = reverse(res);
    return res;
}
public Node reverse(Node h)
{
    Node prev = null;
    Node cur = h;
    while(cur != null )
    {
        Node next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }
    return prev;
}
}