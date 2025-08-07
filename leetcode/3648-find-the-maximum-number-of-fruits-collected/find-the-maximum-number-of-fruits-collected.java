class Solution {
    public int maxCollectedFruits(int[][] mat) {
        int res = 0;
        int n = mat.length;
        int i = 0;
        while (i < n) {
            res += mat[i][i];
            mat[i][i] = 0;
            i++;
        }
        System.out.println(n);
        int dp[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int x = fun(mat, dp, 0, n - 1, n);
        int y = fun1(mat, dp, n - 1, 0, n);
        return res + dp[0][n - 1] + dp[n - 1][0];
    }

    public int fun1(int mat[][], int dp[][], int i, int j, int n) {
        if (i == j || i >= n || j >= n || i <= j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = mat[i][j] +
                Math.max(fun1(mat, dp, i - 1, j + 1, n),
                        Math.max(fun1(mat, dp, i, j + 1, n), fun1(mat, dp, i + 1, j + 1, n)));
    }

    public int fun(int mat[][], int dp[][], int i, int j, int n) {
        if (i == j || i >= n || j >= n || i >= j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = mat[i][j] +
                Math.max(fun(mat, dp, i + 1, j - 1, n),
                        Math.max(fun(mat, dp, i + 1, j, n), fun(mat, dp, i + 1, j + 1, n)));
    }
}