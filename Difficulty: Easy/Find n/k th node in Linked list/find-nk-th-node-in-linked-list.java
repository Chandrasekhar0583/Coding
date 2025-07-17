/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        int i = 0 ; 
        Node cur = head;
        while( cur != null )
        {
            i++;
            cur = cur.next;
        }
        cur = head;
        k = (int)Math.ceil( (double)i / k);
        while(k > 1)
        {
            cur = cur.next;
            k--;
        }
        return cur.data;
    }
}