class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        Integer arr[][] = new Integer[m][n];

        for(int a[] : guards)
        {
            arr[a[0]][a[1]] = 1;
        }
        for(int a[] : walls)
        {
            arr[a[0]][a[1]] = -1;
        }
        for(int i = 0 ; i < m ; i++)
        {
            boolean flag = false;
            for(int j = 0 ; j < n ; j++){
            if(arr[i][j] != null && arr[i][j] == 1)
            {
                flag = true;
            }
            else if(arr[i][j] != null && arr[i][j] == -1)
            {
                flag = false;
            }
            else if(arr[i][j] == null && flag){
                arr[i][j] = 0;
            }
            }
        }
        for(int i = 0 ; i < m ; i++)
        {
            boolean flag = false;
            for(int j = n - 1 ; j >= 0 ; j--){
            if( arr[i][j] != null && arr[i][j] == 1)
            {
                flag = true;
            }
            else if(arr[i][j] != null && arr[i][j] == -1)
            {
                flag = false;
            }
            else if(arr[i][j] == null && flag){
                arr[i][j] = 0;
            }
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            boolean flag = false;
            for(int j = m - 1 ; j >= 0 ; j--){
            if(arr[j][i] != null && arr[j][i] == 1)
            {
                flag = true;
            }
            else if(arr[j][i] != null  && arr[j][i] == -1)
            {
                flag = false;
            }
            else if(arr[j][i] == null && flag){
                arr[j][i] = 0;
            }
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            boolean flag = false;
            for(int j = 0 ; j < m ; j++){
            if(arr[j][i] != null && arr[j][i] == 1)
            {
                flag = true;
            }
            else if(arr[j][i] != null && arr[j][i] == -1)
            {
                flag = false;
            }
            else if(arr[j][i] == null && flag){
                arr[j][i] = 0;
            }
            }
        }
        int res = 0;
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(arr[i][j] == null)
                res++;
            }
        }
        return res;
    }
}