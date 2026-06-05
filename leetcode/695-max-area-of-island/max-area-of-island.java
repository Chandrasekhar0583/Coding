class Solution {
    int max, n , m;
    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        max = 0;
        boolean vis[][] = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    max = Math.max(dfs(grid, vis, i , j) , max);
                }
            }
        }
        return max;
    }
    public int dfs(int grid[][], boolean vis[][], int r, int c){
        vis[r][c] = true;
        int count = 1;
        int dir[][] = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int a[] : dir){
            int x = r +a[0];
            int y = c + a[1];
            if(x < n && x >=0 && y < m && y >= 0 && !vis[x][y] && grid[x][y] == 1){
                count += dfs(grid, vis, x , y);
            }
        }
        return count;
    }
}