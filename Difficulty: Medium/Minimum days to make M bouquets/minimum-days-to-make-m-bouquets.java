class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int low = 0 ;
        int high = -1;
        int res = -1;
        for(int i : arr)
        {
            high = Math.max( i ,high);
        }
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(fun(arr , mid , k , m))
            {
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
    public boolean fun(int arr[] , int mid , int k , int m)
    {
        int count = 0;
        int b = 0;
        for(int i : arr)
        {
            if(i <= mid)
            {
                count++;
            }
            else{
                count = 0;
            }
            if(count == k)
            {
                b++;
                count = 0;
            }
        }
        return b >= m;
    }
}