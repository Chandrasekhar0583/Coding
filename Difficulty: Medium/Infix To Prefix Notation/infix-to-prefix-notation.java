class Solution {
    public String infixToPrefix(String s) {
        // code here
        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder("");
        int n = s.length() ;
        for(int i = n -1 ; i >= 0 ; i--)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res.append(ch);
            }
            else if(ch ==')')
            {
               stk.push(ch);
            }
            else if(ch == '(')
            {
                while(!stk.isEmpty() && stk.peek() != ')')
                {
                    res.append(stk.pop());
                }
                if(!stk.isEmpty())
                stk.pop();
            }
            else{
                while(!stk.isEmpty() && stk.peek() != ')' && (pre(stk.peek()) > pre(ch) || (pre(stk.peek()) == pre(ch) && Left(ch)) ))
                {
                    res.append(stk.pop());
                }
                stk.push(ch);
            }
        }
        while(!stk.isEmpty())
        {
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
    public int pre(char ch)
    {
        if(ch == '^') return 3;
        else if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch =='/') return 2;
        else return 0;
    }
    public boolean Left(char ch)
    {
        return ch == '^';
    }
}