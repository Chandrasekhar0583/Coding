class Solution {
    public String interpret(String c) {
        String res = "";
        for(int i = 0 ; i < c.length() ; i++)
        {
            if(c.charAt(i) == 'G')
            {
                res += 'G';
            }
            else if(c.charAt(i) == '(' && c.charAt(i + 1) == ')')
            {
                res += 'o';
                i++;
            }
            else{
                res += "al";
                i += 3;
            }
        }
        return res;
    }
}