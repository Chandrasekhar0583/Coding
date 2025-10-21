class Solution {
    public int calculateMinimumHP(int[][] grid) {
       int n = grid.length;
        int m = grid[0].length;
        Integer dp[][] = new Integer[n][m];
        int x = fun(0 , 0 , grid , dp);
        return x;
    }
    public int fun(int i , int j , int[][] arr , Integer dp[][])
    {
        if(i == arr.length - 1 && j == arr[0].length - 1) return Math.max(1 - arr[i][j] , 1);
        if(i >= arr.length || j >= arr[0].length) return Integer.MAX_VALUE;

        if(dp[i][j] != null) return dp[i][j];

        int r = fun(i , j + 1 , arr , dp);
        int d = fun(i + 1 , j , arr , dp);

        return dp[i][j] = Math.max(Math.min(r , d) - (arr[i][j]) , 1);
    }
}