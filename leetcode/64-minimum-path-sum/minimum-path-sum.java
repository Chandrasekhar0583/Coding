class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Integer dp[][] = new Integer[n][m];
        return fun(0 , 0 , grid , dp);
    }
    public int fun(int i , int j , int[][] arr , Integer dp[][])
    {
        if(i == arr.length - 1 && j == arr[0].length - 1) return arr[i][j];
        if(i >= arr.length || j >= arr[0].length) return Integer.MAX_VALUE;

        if(dp[i][j] != null) return dp[i][j];

        int r = fun(i , j + 1 , arr , dp);
        int d = fun(i + 1 , j , arr , dp);

        return dp[i][j] = Math.min(r , d) + arr[i][j];
    }
}

//2n! / (n + 1) ! n!