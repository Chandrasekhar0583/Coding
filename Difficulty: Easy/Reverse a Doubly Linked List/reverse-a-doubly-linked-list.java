/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head == null || head.next == null)
        return head;
        Node cur = head;
        Node prev = null ; 
        while(cur != null)
        {
           prev = cur.prev ;
           cur.prev = cur.next;
           cur.next = prev ;
           cur = cur.prev ;
        }
        head = prev.prev;
        return head;
    }
}