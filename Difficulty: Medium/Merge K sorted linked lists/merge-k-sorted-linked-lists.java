/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        Node cur = arr[0];
        for(int i  = 1 ; i < arr.length ; i++)
        {
            cur = merge(cur , arr[i]);
        }
        return cur;
    }
    public Node merge(Node h1 , Node h2)
    {
        Node dummy = new Node(-1);
        Node cur = dummy;
        while(h1 != null && h2 != null )
        {
            if(h1.data < h2.data)
            {
                dummy.next = h1;
                h1 = h1.next;
            }
            else{
                dummy.next = h2;
                h2 = h2.next;
            }
            dummy = dummy.next;
        }
        if(h1 != null)
        {
            dummy.next = h1;
        }
        if(h2 != null)
        {
            dummy.next = h2;
        }
        return cur.next;
    }
}