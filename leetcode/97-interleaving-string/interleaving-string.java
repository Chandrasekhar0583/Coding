class Solution {
    int n , m , len ;
    Boolean dp[][];
    public boolean isInterleave(String s1, String s2, String s3) {
        n = s1.length();
        m = s2.length();
        len = s3.length();
        if(n + m != len) return false;
        dp = new Boolean[n+1][m+1];
        return fun(s1 , s2 , s3 , 0 , 0 , 0);
    }
    public boolean fun(String s1 , String s2 , String s3 , int i , int j , int k)
    {
        if(k == len)
        {
            return i == n && j == m;
        }
        if(i >= n && j >= m  ) return k == len;

        if(dp[i][j] != null ) return dp[i][j];

        boolean flag = false;

        if(i < n && s1.charAt(i) == s3.charAt(k))
        {
            flag |= fun(s1 , s2 , s3 , i + 1 , j , k + 1);
        }
        if(j < m && s2.charAt(j) == s3.charAt(k))
        {
            flag |= fun(s1 , s2 , s3 , i  , j + 1 , k + 1);
        }
        return dp[i][j] = flag;

    }
}