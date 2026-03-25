class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total_sum1 = 0;

        for (int[] a : grid) {
            for (int i : a) {
                total_sum1 += i;
            }
        }

        int n = grid.length;
        int m = grid[0].length;

        long cur_sum = 0;

    
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                cur_sum += grid[i][j];
            }
            if (cur_sum * 2 == total_sum1)
                return true;
        }

      
        cur_sum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                cur_sum += grid[j][i];
            }
            if (cur_sum * 2 == total_sum1)
                return true;
        }

        return false;
    }
}