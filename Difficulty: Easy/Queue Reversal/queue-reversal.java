class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> stk = new Stack<>();
        while(!q.isEmpty())
        {
            stk.push(q.poll());
        }
        while(!stk.isEmpty())
        {
            q.add(stk.pop());
        }
    }
}