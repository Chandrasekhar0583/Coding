class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        int c = count(arr , 0 , 0 , m , n);
        return c;
    }
    public int count(int arr[][], int i , int j,int n, int m)
    {
        if(i == n - 1 && j == m - 1)
        return 1;
        else if(i >= n || j >= m)
        return 0;
        if(arr[i][j] != 0)
        return arr[i][j];
        return arr[i][j] = count(arr , i +1 , j , n , m)+ count(arr , i , j + 1 , n  , m);

    }
}