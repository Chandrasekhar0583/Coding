class myQueue {

    // Initialize your data members
    Stack<Integer> stk = new Stack<>();
    void enqueue(int x) {
        // Implement enqueue operation
        if(stk.isEmpty()){
        stk.push(x);
            return ;
        }
        int y = stk.pop();
        enqueue(x);
        stk.push(y);
    }

    void dequeue() {
        // Implement dequeue operation
        if(stk.isEmpty()) return ;
        else
        stk.pop();
    }

    int front() {
        // Implement front operation
        if(stk.isEmpty()) return -1;
        return stk.peek();
    }

    int size() {
        // Implement size operation
        return stk.size();
    }
}
