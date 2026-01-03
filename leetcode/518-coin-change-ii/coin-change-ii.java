class Solution {
    int n;
    int dp[][];

    public int change(int amount, int[] coins) {
        n = coins.length;
        dp = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++)
            Arrays.fill(dp[i], -1);
        return fun(n, amount, coins);
    }

    public int fun(int row, int col, int arr[]) {
        if (row == 0)
            return col == 0 ? 1 : 0;
        if (col == 0)
            return 1;
            if(dp[row][col] != -1) return dp[row][col];
        int pick = 0;
        if (col >= arr[row - 1]) {
            pick = fun(row, col - arr[row - 1], arr);
        }
        int nonpick = fun(row - 1, col, arr);

        return dp[row][col] = pick + nonpick;
    }
}