class Solution {
    Boolean dp[][];
    public boolean wildCard(String txt, String pat) {
        // code here
        int n = txt.length();
        int m = pat.length();
        dp = new Boolean[n + 1][m + 1];
        boolean flag = fun(txt , pat , n , m );
        return flag;
    }
    public boolean fun(String txt , String pat , int i , int j)
    {
        if(i == 0 && j == 0) return true;
        if(j == 0) return false;
        if(i == 0  ) {
            for(int k = j - 1; k >= 0 ; k--)
            {
                if(pat.charAt(k ) != '*' ) return false;
            }
            return true;
        }
        
        if(dp[i][j] != null) return dp[i][j];
        
        boolean flag = false;
        if(pat.charAt(j - 1) == '*')
        {
            flag |= fun(txt , pat , i - 1 , j) ;
            flag |= fun(txt , pat , i  , j - 1) ;
        }
        else if(pat.charAt(j - 1) == '?')
        {
            flag |= fun(txt , pat , i - 1 , j - 1);
        }
        else if(txt.charAt(i - 1) != pat.charAt(j - 1))
        {
             flag = false;
        }
        else{
            flag |= fun(txt , pat , i - 1 , j - 1);
        }
        return dp[i][j] = flag;
    }
}