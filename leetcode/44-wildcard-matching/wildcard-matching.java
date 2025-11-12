class Solution {
    Boolean dp[][];
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        dp = new Boolean[n + 1][m + 1];

        return fun(s , p , n , m);
    }
    public boolean fun(String s , String p , int i , int j)
    {
        if(i == 0 && j == 0) return true;

        if(j == 0 ) return false;
        if(i == 0){
            for(int k = j - 1; k >= 0 ; k--)
            {
                if(p.charAt(k) != '*') return false;
            }
            return true;
        }

        if(dp[i][j] != null) return dp[i][j];
        boolean flag = false;

        if(p.charAt(j - 1) == '*')
        {
            flag |= fun(s , p , i - 1 , j);
            flag |= fun(s , p , i , j - 1);
        }
        else if(p.charAt(j - 1) == '?' || p.charAt(j - 1) == s.charAt(i - 1))
        {
            flag |= fun(s , p , i - 1 , j - 1);
        }
        else{
            flag = false;
        }

        return dp[i][j] = flag;
    }
}