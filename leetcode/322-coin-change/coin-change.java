class Solution {
    int n;
    int dp[][];
    int res;

    public int coinChange(int[] coins, int amount) {
        res = Integer.MAX_VALUE / 2;
        n = coins.length;
        dp = new int[n + 1][amount + 1];
        for(int i = 0 ; i <= n ; i++){
            Arrays.fill(dp[i] , -1);
        }
        int x = fun(coins, amount, n);
        return x >= Integer.MAX_VALUE / 2 ? -1 : x;
    }

    public int fun(int coins[], int col, int row) {
        if (row == 0)
            return col  == 0 ? 0 : Integer.MAX_VALUE / 2;

        if (col == 0)
            return 0;

        if (dp[row][col] != -1)
            return dp[row][col];

        int nonpick = fun(coins , col , row - 1);

        int pick = Integer.MAX_VALUE / 2;
        if(col >= coins[row - 1]){
            pick = 1 + fun(coins , col - coins[row - 1] , row);
        }
        return dp[row][col] = Math.min(pick , nonpick);
    }
}