class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int mini = n , maxi = 0;
        int minj = m , maxj = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 1)
                {
                    mini = Math.min(mini , i);
                    minj = Math.min(minj , j);
                    maxi = Math.max(maxi , i);
                    maxj = Math.max(maxj , j);
                }
            }
        }
        return (maxi - mini + 1) * (maxj - minj + 1);
    }
}