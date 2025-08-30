class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0 ; i < n ; i++ )
        {
            int one = 0 ;
            for(int j = 0 ; j < m ; j++ )
            {
                if(i != j && mat[i][j] == 1)
                one++;
            }
            if(one == 0)
            {
                for(int k = 0 ; k < n ; k++)
                {
                    if(mat[k][i] == 0)
                    one++;
                }
                if(one == 0 )
                return i;
            }
        }
        return -1;
    }
}