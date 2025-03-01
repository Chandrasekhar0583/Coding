class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0]<=target && target<=matrix[i][m-1])
            return binarysearch(matrix[i],0,m-1,target);
        }
        return false;
    }
    public boolean binarysearch(int arr[] , int start ,int end,int target)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
            return true;
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}