class Solution {
    public int[][] rangeAddQueries(int n, int[][] q) {
        int mat[][] = new int[n][n];
        for(int a[] : q)
        {
            for(int i = a[0] ; i <= a[2] ; i++)
            {
                mat[i][a[1]] += 1;
                if(a[3] != n -1)
                mat[i][a[3] + 1] -= 1;
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 1 ; j < n ; j++)
            {
                mat[i][j] += mat[i][j - 1];
            }
        }
        return mat;
    }
}