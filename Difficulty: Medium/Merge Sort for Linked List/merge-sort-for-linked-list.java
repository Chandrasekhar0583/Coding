/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node mergeSort(Node head) {
        // code here
        return sort(head);
    }
    public Node sort(Node head)
    {
        if(head == null || head.next == null)
        return head;
        Node second = split(head);
         head = sort(head);
        second = sort(second);
        return merge(head, second);
    }
    public Node split(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
    
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }
    public Node merge(Node h1 , Node h2)
    {
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        if(h1.data <= h2.data)
        {
            h1.next = merge(h1.next,h2);
            return h1;
        }
        else{
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }
}