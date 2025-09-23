class myQueue {
    int arr[];
    int size = 0;
    int ind = -1;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr = new int[n];
        size = n;
        ind = -1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return ind == -1;
    }

    public boolean isFull() {
        // Check if queue is full
        return ind == size - 1;
    }

    public void enqueue(int x) {
        // Enqueue
        if(ind >= size) return ;
        arr[++ind] = x;
        // ind++;
    }

    public void dequeue() {
        // Dequeue
        if(ind < 0) return ;
        for(int i = 1 ; i <= ind ; i++)
        {
            arr[i - 1] = arr[i];
        }
        ind--;
    }

    public int getFront() {
        if(ind < 0) return -1;
        int x = arr[0];
        return x;
        // Get front element
    }

    public int getRear() {
        if(ind == -1) return -1;
        return arr[ind];
    }
}
