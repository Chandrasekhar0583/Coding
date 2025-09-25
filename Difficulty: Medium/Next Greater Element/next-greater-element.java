class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = n - 1 ; i >= 0 ; i-- )
        {
            while(!stk.isEmpty() && stk.peek() <= arr[i])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                res.add(-1);
            }
            else{
                res.add(stk.peek());
            }
            stk.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}