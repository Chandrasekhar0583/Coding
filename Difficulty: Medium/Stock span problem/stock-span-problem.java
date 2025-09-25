class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            while(!stk.isEmpty() && arr[i] >= arr[stk.peek()])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
             res.add(i + 1);
            }
            else{
                res.add(i - stk.peek());
            }
            stk.push(i);
        }
        return res;
    }
}