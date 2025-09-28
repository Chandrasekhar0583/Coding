class SpecialStack {
    Stack<Integer> stk;
    Stack<Integer> min;
    public SpecialStack() {
        // Define Stack
        stk = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        stk.push(x);
        if(min.isEmpty() || x <= min.peek())
        {
            min.push(x);
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(stk.peek() == min.peek())
        {
            min.pop();
        }
        stk.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(stk.isEmpty()) return -1;
        return stk.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return stk.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(min.isEmpty()) return -1;
        return min.peek();
    }
}