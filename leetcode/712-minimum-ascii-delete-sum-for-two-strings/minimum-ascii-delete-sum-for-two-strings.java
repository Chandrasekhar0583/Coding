class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        long dp[][] = new long[n + 1][m + 1];
        long score = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            // int cur[] = new int[m + 1];
            for(int j = 1 ; j <= m ; j++)
            {
                if(s1.charAt(i - 1)==s2.charAt(j - 1))
                {
                    dp[i][j] = (int)s1.charAt(i - 1)+ dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
                }
            }
          
        }
        int i = 0,j=0;
        while(i < n )
        {
            score += (int)s1.charAt(i);
            i++;
            
        }
        while(j < m )
        {
            score += (int)s2.charAt(j);
            j++;

        }
        return (int)(score - (long)(dp[n][m] * 2));
    }
}