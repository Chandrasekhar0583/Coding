class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int max = grid[0][0];
        int n = grid.length;
        int m = grid[0].length;
        int x = -1, y = -1;
        int count = 0;
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // if(grid[i][j] >= max){
                //     continue;
                // }
                int res = grid[i][j];

                if (i > 0) {
                    res += arr[i - 1][j];
                }

                if (j > 0) {
                    res += arr[i][j - 1];
                }

                if (i > 0 && j > 0) {
                    res -= arr[i - 1][j - 1];
                }

                arr[i][j] = res;

                if (arr[i][j] <= k) {
                    count++;
                }
            }
        }
        return count;
    }
}