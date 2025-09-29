class Solution {
    static int maxLength(String s) {
        // code here
        int res = 0;
        Stack<Integer> stk = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i < n ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                stk.push(i);
            }
            else{
                if(!stk.isEmpty() && s.charAt(stk.peek()) == '('){
                    stk.pop();
                }
                else if(stk.isEmpty() || s.charAt(stk.peek()) == ')')
                {
                    stk.push(i);
                }
            }
        }
        // n -= 1;
        if(stk.isEmpty())  return n;
        while(!stk.isEmpty())
        {
            // if(n - stk.peek() >= 2)
            res = Math.max( n - stk.peek() - 1 , res);
            n = stk.pop();
        }
        res = Math.max(res , n  );
        return res;
    }
}