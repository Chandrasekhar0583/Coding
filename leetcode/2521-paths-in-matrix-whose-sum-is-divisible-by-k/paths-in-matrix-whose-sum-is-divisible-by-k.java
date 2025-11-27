class Solution {
    int mod = 1000000007;
    public int numberOfPaths(int[][] grid, int r) {
        int n = grid.length;
        int m = grid[0].length;
        int prev[][] = new int[m][r];


        int sum = 0;
        for (int j = 0; j < m; j++) {
            sum = (sum + grid[0][j]) % r;
            prev[j][sum] = 1;
        }

        for(int i = 1 ; i < n ; i++)
        {
            int cur[][] = new int[m][r];

            int downSum = grid[i][0] % r;
            for (int k = 0; k < r; k++) {
                if (prev[0][k] > 0) {
                    int newk = (k + downSum) % r;
                    cur[0][newk] = (cur[0][newk] + prev[0][k]) % mod;
                }
            }


            // cur[0][0] = 1;
            for(int j = 1 ; j < m ; j++)
            {
                int val = grid[i][j] % r;
                for(int k = 0 ; k < r ; k++)
                {
                    if(prev[j][k] > 0)
                    {
                        int newk = (k + val) % r;
                        cur[j][newk] = (prev[j][k] + cur[j][newk] ) % mod;
                    }
                }
                for(int k = 0 ; k < r ; k++)
                {
                    if(cur[j - 1][k] > 0)
                    {
                        int newk = (k + val) % r;
                        cur[j][newk] = (cur[j][newk] +  cur[j - 1][k] ) % mod;
                    }
                }
            }
            prev = cur;
        }
        return prev[m - 1][0];
    }
}