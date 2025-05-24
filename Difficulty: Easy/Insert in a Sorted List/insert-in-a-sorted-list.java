/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        
        Node temp = head;
        Node newNode = new Node(key);
        if (head == null || head.data > key) {
         newNode.next = head;
         return newNode;
        }
        while(temp.next != null && temp.next.data <key )
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}