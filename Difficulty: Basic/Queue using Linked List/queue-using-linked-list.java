// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node head ;
    Node rear ;
    int size ;
    public myQueue() {
        // Initialize your data members
        head = null;
        rear = head;
        size = 0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return head == null;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newnode = new Node(x);
        if(head == null)
        {
            head = newnode;
            rear = newnode;
            size = 1;
        }
        else{
            rear.next = newnode;
            rear = rear.next;
            size++;
        }
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(head == null) return ;
        head = head.next;
        size--;
        if(head == null) rear = null;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(head == null) return -1;
        return head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return size;
    }
}
