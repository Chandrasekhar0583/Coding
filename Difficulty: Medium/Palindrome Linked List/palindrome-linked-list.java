/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
        Node slow = head;
        Node fast = head;
        while(slow != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = rotate(slow.next);
        slow.next = null;
        return check(head , fast);
    }
    static Node rotate(Node head)
    {
        Node prev = null;
        while(head != null)
        {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    static boolean check(Node h1 , Node h2)
    {
        while(h1 != null && h2 != null)
        {
            if(h1.data != h2.data)
            {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }
}