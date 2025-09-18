class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        ArrayList<Integer> res1 = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        Arrays.fill(res,-1);
        for(int i =  2 * n - 1 ; i >= 0 ; i-- )
        {
            int cur = arr[i % n];
            while(!stk.isEmpty() && stk.peek() <= cur)
            {
                stk.pop();
            }
            if(!stk.isEmpty() && stk.peek() > cur)
            {
                res[i % n] = stk.peek();
            }
            stk.push(cur);
        }
        for(int i : res)
        {
            res1.add(i);
        }
        return res1;
    }
}