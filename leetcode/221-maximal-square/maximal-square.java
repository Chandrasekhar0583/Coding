class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res = Math.max(res, Count(i, j, matrix, dp, n, m));
            }
        }

        return res * res;
    }

    public int Count(int i, int j, char[][] matrix, int[][] dp, int n, int m) {
        if (i >= n || j >= m) {
            return 0;
        }

        if (dp[i][j] != -1) return dp[i][j];

        if (matrix[i][j] == '0') {
            dp[i][j] = 0;
        } else {
            int down = Count(i + 1, j, matrix, dp, n, m);
            int diag = Count(i + 1, j + 1, matrix, dp, n, m);
            int right = Count(i, j + 1, matrix, dp, n, m);
            dp[i][j] = 1 + Math.min(down, Math.min(diag, right));
        }

        return dp[i][j];
    }
}
