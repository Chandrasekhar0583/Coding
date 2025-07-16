class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
            return false;
            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;
        for(char c : word.toCharArray())
        {
            if("aeiouAEIOU".indexOf(""+c) != -1)
            f1 = true;
            else if(Character.isLetter(c))
            f2 = true;
            else if(Character.isDigit(c))
            f3 = true;
            else
             return false;
        }
        return ( f2 && f1);
    }
}