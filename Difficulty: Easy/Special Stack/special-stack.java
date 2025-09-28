/*Complete the function(s) below*/
class GfG {
    int min = -1;
    public void push(int a, Stack<Integer> s) {
        // add code here.
       if(s.isEmpty())
       {
           min = a;
           s.push(a);
       }
       else if(a <= min)
       {
           s.push(2 * a - min);
           min = a;
       }
       else
       s.push(a);
    }

    public int pop(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()) return -1;
        int t = s.pop();
        if(t <= min){
        int x = 2 * min - t;
        t = min;
        min = x;
        }
        return t ;
    }

    public int min(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()) return -1;
        return min;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        // add code here.
        return s.size() == n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        // add code here.
        return s.isEmpty();
    }
}