class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int total = n * m ;
        int arr[] = new int[total];
        int k = 0;
        int i = 0,j = 0;
        arr[k++] = mat[i][j];
        j++;
        boolean flag = false;
        while(k < total)
        {
            if(!flag)
            {
                while( i < n && j >= 0)
                {
                    if(i >= 0 && j < m && i < n && j >= 0)
                    arr[k++] = mat[i][j];
                    i++;
                    j--;
                }
                flag = !flag;
                j++;
            }
            if(flag)
            {
                while(j < m && i >= 0)
                {
                    if(i >= 0 && j < m && i < n && j >= 0)
                    {
                        arr[k++] = mat[i][j];
                    }
                    i--;
                    j++;
                }
                i++;
                flag = !flag;
            }
        }
        return arr;
    }
}