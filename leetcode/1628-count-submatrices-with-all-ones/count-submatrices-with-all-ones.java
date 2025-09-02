class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int arr[] = new int[m];
        int res = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(mat[i][j] == 0)
                {
                    arr[j] = 0;
                }
                else{
                    arr[j]++;
                }
            }
            // System.out.println(Arrays.toString(arr));
            for(int j = 0 ; j < m ; j++)
            {
                int min = arr[j];
                for(int k = j ; k < m ; k++)
                {
                    min = Math.min(min , arr[k]);
                    res += min;
                }
            }
        }
        return res;
    }
}