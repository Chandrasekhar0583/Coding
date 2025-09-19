class Solution {
    public int minParentheses(String s) {
        // code here
        int bal = 0;
        int unbal = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            bal++;
            else if(ch ==')')
            bal--;
            if(bal < 0) 
            {
                unbal++;
                bal = 0;
            }
        }
        return bal+ unbal;
    }
}
