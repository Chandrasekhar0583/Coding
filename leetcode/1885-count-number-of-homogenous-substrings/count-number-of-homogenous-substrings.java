class Solution {
    public int countHomogenous(String s) {
        int res = 0;
        int count = 1;
        int i = 0 , j = 0;
        int mod = 1000000007;
        int n = s.length();
        while( j  < n)
        {
            i = j + 1;
            while(i < n && s.charAt(j) == s.charAt(i) )
            {
                i++;
                count++;
            }
            res =( res +(int)((1L * count * (count + 1) / 2L) % mod)) % mod;
            count = 1;
            j = i;
        }
        return res;
    }
}