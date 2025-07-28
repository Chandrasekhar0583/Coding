/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}*/
// you have to complete this function
class GfG {
    public static Node quickSort(Node node) {
        // Your code here
        Node tail = getTail(node);
        quickSort(node , tail);
        return node;
    }
    public static void quickSort(Node head , Node tail)
    {
        if(head == null || head == tail)
        return ;
        Node pivot = partition(head , tail);
        quickSort(head , pivot);
        quickSort(pivot.next , tail);
    }
    public static Node partition(Node head , Node tail)
    {
        Node pre = head;
        Node cur = head;
        Node pivot = head;
        while(cur != tail.next)
        {
            if(cur.data < pivot.data)
            {
                int curData = cur.data;
                cur.data = pre.next.data;
                pre.next.data = curData;
                pre = pre.next;
            }
            cur = cur.next;
        }
        int curData = pivot.data;
        pivot.data = pre.data;
        pre.data = curData;
        return pre;
    }
    public static Node getTail(Node head)
    {
        Node cur = head;
        while(cur != null && cur.next != null)
        {
            cur = cur.next;
        }
        return cur;
    }
}