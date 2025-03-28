class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(matrix[0][0]>target || matrix[n-1][m-1]<target)
        return false;
        for(int i=0;i<n;i++)
        {
           int low=0;
           int high=m-1;
           while(low<=high)
           {
            int mid = (low+high)/2;
            if(matrix[i][mid]==target)
            return true;
            else if(matrix[i][mid]<target)
            low = mid+1;
            else 
            high = mid-1;
           }
        }
        return false;
    }
}