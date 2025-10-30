class Solution {
    public int minNumberOperations(int[] arr) {
        int res = 0;
        Stack<Integer> stk = new Stack<>();
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(stk.isEmpty())
            {
                res = arr[i];
                // min = Math.min(arr[i] , min);
            }
            if(!stk.isEmpty() && stk.peek() < arr[i])
            {
                res += (arr[i] - stk.peek());
            }
                min = Math.min(arr[i] , min);
                stk.push(arr[i]);
        }
        return res;
    }
}
