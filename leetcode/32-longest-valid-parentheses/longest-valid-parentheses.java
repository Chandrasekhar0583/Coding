class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int n = s.length();
        int res = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(s.charAt(i) == '(')
            stk.push(i);
            else{
                if(!stk.isEmpty() && s.charAt(stk.peek()) == '(')
                {
                    stk.pop();
                    if(!stk.isEmpty())
                    res = Math.max(res , i - stk.peek());
                    else{
                        res = Math.max(res , i - 0 + 1);
                    }
                }
                else{
                    stk.push(i);
                }
            }
        }
        return res;
    }
}