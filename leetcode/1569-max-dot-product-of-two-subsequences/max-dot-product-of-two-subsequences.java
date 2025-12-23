class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Long dp[][] = new Long[n + 1][m + 1];
        for(int i = 0 ; i <= n ; i++)
        {
            dp[i][0] = Long.MIN_VALUE / 2;
        }
        for(int i = 0 ; i <= m ; i++)
        {
            dp[0][i] = Long.MIN_VALUE / 2;
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= m ; j++)
            {
                long x = nums1[i - 1] * nums2[j - 1] ;

                dp[i][j] = Math.max(dp[i - 1][j] , Math.max(dp[i][j - 1] ,Math.max(x , x + dp[i - 1][j -1])));
                // System.out.println(dp[i][j]);
            }
        }
        // long 
        return (int) (long)dp[n][m];
    }
}