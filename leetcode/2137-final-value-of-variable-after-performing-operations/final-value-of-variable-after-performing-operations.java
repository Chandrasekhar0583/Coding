class Solution {
    public int finalValueAfterOperations(String[] op) {
        int p = 0;
        for(String s : op )
        {
            if(s.charAt(0) == '+' || s.charAt(2) == '+')
            {
                p++;
            }
            else{
                p--;
            }
        }
        return p;
    }
}