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
    public Node swapKth(Node head, int k) {
        // code here
        Node temp = head;
        int len = 0;
        int f = -1, l = -1;
        while(temp != null)
        {
            len++;
            if(k == len) f = temp.data;
            temp = temp.next;
        }
        if(f == -1) return head;
        temp = head;
        int ind = len - k;
        while(ind >= 1)
        {
            ind--;
            temp = temp.next;
        }
         l = temp.data;
        temp.data = f;
        temp = head;
        while(k > 1)
        {
            temp = temp.next;
            k--;
        }
        temp.data = l;
        return head;
    }
}
