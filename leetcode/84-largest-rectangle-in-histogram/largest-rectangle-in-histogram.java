class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int n = heights.length;
        int i = 0 ;
        int next[] = new int[n];
        int prev[] = new int[n];
        int res = 0;
        while(i < n)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
            {
               stk.pop();
            }
            if(!stk.isEmpty())
            {
                prev[i] = stk.peek() + 1;
            }
            else{
                prev[i] = 0;
            }

            stk.push(i);
            i++;
        }
        i = n - 1;
        stk.clear();
        while(i >= 0)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
            {
               stk.pop();
            }
            if(!stk.isEmpty())
            {
                next[i] = stk.peek() - 1;
            }
            else{
                next[i] = n - 1;
            }
            stk.push(i);
            i--;
        }
        for( i = 0 ; i < n ; i++)
        {
            res = Math.max(res , heights[i] * (next[i] - prev[i] + 1));
        }
        return res;
    }
}