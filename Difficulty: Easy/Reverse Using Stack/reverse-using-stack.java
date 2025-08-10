class Solution {
    public String reverse(String s) {
        // code here
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray())
        {
            stk.push(ch);
        }
        s = "";
        while(!stk.isEmpty())
        {
            s += stk.pop();
        }
        return s;
    }
}