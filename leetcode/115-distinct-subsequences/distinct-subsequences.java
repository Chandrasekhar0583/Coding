class Solution {
    int res , n , m;
    Integer dp[][];
    public int numDistinct(String s, String t) {
        res = 0;
        n = s.length();
        m = t.length();

        dp = new Integer[n + 1][ m + 1];

        return fun(s , t , 0 , 0 );
    }
    public int fun(String s , String t , int i , int j)
    {
        if(j == m) return 1;
        if(i >= n ) return j == m ? 1 : 0;

        if(dp[i][j] != null) return dp[i][j];

        int r = 0;

        if(s.charAt(i) == t.charAt(j) )
        {
            r += fun(s , t , i + 1 , j + 1);
        }
        r += fun(s , t , i + 1 , j);
        return dp[i][j] = r;
    }
}