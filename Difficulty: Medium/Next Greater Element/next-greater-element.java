class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
         for (int i = 0; i < n; i++) {
            res.add(-1);
        }
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            while(!stk.isEmpty() && arr[i] >= stk.peek())
            {
                stk.pop();
            }
            if(!stk.isEmpty())
            res.set(i,stk.peek());
            stk.push(arr[i]);
        }
        return res;
    }
}