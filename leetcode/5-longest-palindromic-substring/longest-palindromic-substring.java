class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            Arrays.fill(dp[i] , -1);
        }
        int x = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            x =  check(s , i , j , dp);
        }
        // display(dp);
        x = 0;
        String res = ""+s.charAt(0);
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j++)
            {
                if(i == j)
                dp[i][j] = 1;
                if(dp[i][j] == 1)
                {
                    if(x < j - i + 1)
                    {
                        x = j - i + 1;
                        res = s.substring(i , j + 1);
                    }
                }
            }
        }
        return res;
    }
    public int check(String s , int i , int j , int[][] dp)
    {
        if( i >= j) return 1;
        if(dp[i][j] != -1)
        return dp[i][j];
        if(s.charAt(i) != s.charAt(j))
        return 0;
        return  dp[i][j] = check(s , i + 1 , j - 1 , dp);
    }
    // public void display(int dp[][])
    // {
    //     for(int i = 0 ; i < dp.length ; i++)
    //     {
    //         for(int j = 0 ; j < dp.length ; j++)
    //         {
    //             System.out.print(dp[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}