/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node newNode = new Node(0);
        merge(newNode , head1 , head2);
        return newNode.next;
    }
    public void merge(Node cur , Node h1 ,Node h2)
    {
        if(h1 == null){
        cur.next = h2;
            return ;
        }
        if(h2 == null ){
        cur.next = h1;
            return ;
        }
        else if(h1.data < h2.data)
        {
            Node temp = h1.next;
            cur.next = h1;
            h1 = temp;
        merge(cur.next , h1 , h2);
        }else
        {
            Node temp = h2.next;
            cur.next = h2;
            h2 = temp;
            
        merge(cur.next , h1 , h2);
        }
    }
}