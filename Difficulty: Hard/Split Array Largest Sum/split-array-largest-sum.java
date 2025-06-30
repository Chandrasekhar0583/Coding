class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        int low = 0 ; 
        int high = 0;
        for(int i : arr)
        {
            low = Math.max(i , low);
            high += i;
        }
        int res = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = (low + high) / 2;
           if( fun(arr , k , mid))
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
    public boolean fun(int arr[] , int key , int mid)
    {
        int sum = 0;
        int count = 0;
        int max = 0;
        for(int i : arr)
        {
            if(sum + i> mid)
            {
                max = Math.max(sum , max);
                sum = 0;
                count++;
            }
            sum += i;
        }
        if(sum >0)
        {
                max = Math.max(sum , max);
        count++;
        }
        return count <= key;
    }
}