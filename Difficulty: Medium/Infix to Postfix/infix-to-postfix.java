class Solution {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> stk = new Stack<>();
        String res = "";
        for(char ch : s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                res += ch;
            }
            else if( ch == '(')
            {
                stk.push(ch);
            }
            else if( ch == ')')
            {
                while(!stk.isEmpty() && stk.peek() != '(')
                {
                    res += stk.pop();
                }
                stk.pop();
            }
            else{
                while(!stk.isEmpty() && stk.peek() != '(' && ((precedence(stk.peek()) > precedence(ch)) || (precedence(stk.peek()) == precedence(ch) && LeftToRight(ch))  ))
                {
                    res += stk.pop();
                }
                stk.push(ch);
            }
        }
        // 702344
        while(!stk.isEmpty())
        {
            res += stk.pop();
        }
        return res;
    }
    public static int precedence( char x )
    {
        if(x == '^') return 3;
        if(x == '*' || x == '/') return 2;
        return 1;
    }
    public static boolean LeftToRight( char ch)
    {
        return ch != '^';
    }
}