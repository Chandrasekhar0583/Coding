class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int sum = 0;
        int sum1 = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0 ; i < n ; i++ )
        {
            int cur = 0;
            for(int j = 0 ; j < m ; j++)
            {
                cur += mat[i][j];
            }
            sum = Math.max( sum , cur);
        }
        for(int j = 0 ; j < m ; j++ )
        {
            int cur = 0;
            for(int i = 0 ; i < n ; i++ )
            {
                cur += mat[i][j];
            }
            sum1 = Math.max(sum1 , cur);
        }
        int res = 0;
        if(sum >= sum1)
        {
            for(int i = 0 ; i < n ; i++)
            {
                int cur = 0;
                for(int j = 0 ; j < m ; j++)
                {
                    cur += mat[i][j];
                }
                res += (sum - cur);
            }
        }
        else{
            for(int i = 0 ; i < m ; i++)
            {
                int cur = 0;
                for(int j = 0 ; j < n ; j++)
                {
                    cur += mat[j][i];
                }
                res += (sum1 - cur);
            }
            
        }
        return res;
    }
}