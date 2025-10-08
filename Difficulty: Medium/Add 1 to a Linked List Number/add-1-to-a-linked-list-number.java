/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int carry = 0;
    public Node addOne(Node head) {
        // code here.
        carry = 1;
        head = ADD(head);
        return head;
    }
    Node ADD(Node head)
    {
        if(head == null)
        return null;
        head = reverse(head);
        Node cur = head;
        while(cur != null && carry > 0)
        {
            int sum = cur.data + carry;
            cur.data = sum % 10;
            carry = sum /10;
            cur = cur.next;
        }
       head = reverse(head);
       if(carry > 0)
       {
           Node temp = new Node(carry);
           temp.next = head;
           return temp;
       }
       return head;
    }
    Node reverse(Node head){
        Node  prev = null;
        Node cur = head;
        while(cur != null)
        {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}