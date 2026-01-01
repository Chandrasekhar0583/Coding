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
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int h1 = height(head1);
        int h2 = height(head2);
        
        int x = Math.abs(h1 - h2);
        
        if(h1 > h2){
            while(x-- > 0){
                head1 = head1.next;
            }
        }
        else{
            while(x-- > 0){
                head2 = head2.next;
            }
        } 
        
        while(head1 != head2){
            head1 = head1.next ;
            head2 = head2.next;
        }
        return head1;
    }
    public int height(Node h1){
        int count = 0;
        while(h1 != null){
            count++;
            h1 = h1.next;
        }
        return count;
    }
}