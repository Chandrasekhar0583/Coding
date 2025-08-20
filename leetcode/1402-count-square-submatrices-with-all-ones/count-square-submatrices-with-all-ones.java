class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int count = 0;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];
        for( int i = 0 ; i < n ;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        count = Count(0,0,matrix,dp,n,m);
        count = 0;
        for(int i []:dp)
        {
            for(int j :i)
            {
               count += j;
            }
        }
        return count;
    }
    public int Count(int i , int j , int[][] matrix , int[][] dp , int n ,int m)
    {
        if(i>=n || j>=m)
        return 0  ;   
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        if(matrix[i][j]==1)
        {
            int cnt = 1;
            int a = Count(i+1 , j , matrix,dp,n,m);
            int b = Count(i+1 , j+1 , matrix,dp,n,m);
            int c = Count(i , j+1 , matrix,dp,n,m);
            cnt += Math.min(a,Math.min(b,c));
            dp[i][j] = cnt;
            return dp[i][j];
        }
        else{
            dp[i][j] = 0;
        }
          int c = Count(i , j+1 , matrix,dp,n,m);
          int y = Count(i+1 , j , matrix,dp,n,m);
        return dp[i][j] ;
    }
}