class Solution {
    public int numSub(String s) {
        int res = 0 ; 
        for(int i = 0 ; i < s.length() ;)
        {
            int j = i;
            while( j < s.length() && s.charAt(j) == '1' )
            {
                res =( res + j - i + 1) % 1000000007;
                j++;
            }
            i = j+ 1;
        }
        return res;
    }
}