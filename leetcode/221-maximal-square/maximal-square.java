class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int res = Count(0, 0, matrix, dp, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res = Math.max( res , dp[i][j] );
            }
        }
        return res*res;
    }

    public int Count(int i, int j, char[][] matrix, int[][] dp, int n, int m) {
        if (i >= n || j >= m) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        if (matrix[i][j] == '0') {
            dp[i][j] = 0;
        } 
       else  if (i == n - 1 || j == m - 1) {

            dp[i][j] = 1;
            return 1;
        }

     else  if (matrix[i][j] == '1') {
            int a = Count(i + 1, j, matrix, dp, n, m);
            int b = Count(i + 1, j + 1, matrix, dp, n, m);
            int c = Count(i, j + 1, matrix, dp, n, m);
            dp[i][j] = Math.min(a, Math.min(b, c)) + 1;
            return dp[i][j];
        }
           int x= Math.min(matrix[i][j] , Count(i, j + 1, matrix, dp, n, m));
           int y= Math.min(matrix[i][j] , Count(i+1, j, matrix, dp, n, m));

        return dp[i][j];
    }
}