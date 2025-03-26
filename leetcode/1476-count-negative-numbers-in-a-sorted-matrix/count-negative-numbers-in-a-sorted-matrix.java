class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int m=grid[0].length;
        for(int a[] : grid)
        {
            Arrays.sort(a);
            int low=0;
            int high=m-1;
            int r=0;
            while(low<=high)
            {
                int mid = (low+high)/2;
                if(a[mid]<0)
                {
                    r = mid+1;
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            res+=r;

        }
        return res;
    }
}