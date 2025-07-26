class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '#')
            {
                if(!stk1.isEmpty())
                stk1.pop();
            }
            else{
                stk1.push(ch);
            }
        }
        for(char ch : t.toCharArray())
        {
            if(ch == '#')
            {
                if(!stk2.isEmpty())
                stk2.pop();
            }
            else{
                stk2.push(ch);
            }
        }
        while(!stk1.isEmpty() && !stk2.isEmpty())
        {
            if(stk1.peek() != stk2.peek())
            return false;
            stk1.pop() ;
            stk2.pop();
        }
        if(stk1.isEmpty() && stk2.isEmpty())
        return true;
        return false;
    }
}