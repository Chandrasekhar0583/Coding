class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int arr[][] = new int[n][m];
        if (obstacleGrid[n - 1][m - 1] == 1)
            return 0;
        int c = count(obstacleGrid, 0, 0, n, m, arr);
        return c;
    }

    public int count(int a[][], int i, int j, int n, int m, int b[][]) {
        if (i == n - 1 && j == m - 1)
            return 1;
        else if (i >= n || j >= m)
            return 0;
        else if (a[i][j] == 1)
            return 0;
        if (b[i][j] != 0)
            return b[i][j];
        return b[i][j] = count(a, i + 1, j, n, m, b) + count(a, i, j + 1, n, m, b);

    }
}