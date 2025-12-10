class Solution {
    // int[] dp;
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        int x=fills(dp,n);

        return dp[n];
    }
    public int fills(int[] dp,int n)
    {
        if(dp[n] == -1)
        {
            int res=fills(dp , n-3)+fills(dp ,n-2)+fills(dp ,n-1);
            dp[n]=res;
        }
        return dp[n];
    }

}