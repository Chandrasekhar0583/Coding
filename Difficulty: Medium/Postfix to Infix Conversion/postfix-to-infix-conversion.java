// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> stk = new Stack<>();
        for(char ch : exp.toCharArray())
        {
            if( Character.isLetterOrDigit(ch) )
            {
                stk.push(""+ch);
            }
            else{
                String a = stk.pop();
                String b = stk.pop();
                stk.push('(' + b + ch + a + ')');
            }
        }
        return stk.peek();
    }
}
