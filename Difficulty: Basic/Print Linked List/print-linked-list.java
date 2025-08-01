/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/
/*
    Print elements of a linked list on console
    Head pointer input could be NULL as well for empty list
*/

class Solution {
    // Function to display the elements of a linked list in same line
    void printList(Node head) {
        // add code here.
        Node cur = head;
        while(cur != null)
        {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
}