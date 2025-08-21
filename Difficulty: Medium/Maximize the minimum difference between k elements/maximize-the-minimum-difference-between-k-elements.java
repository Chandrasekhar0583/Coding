class Solution {
    public int maxMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int high = arr[n - 1] - arr[0];
        int low = 0;
        int res = -1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(fun(arr , mid , k))
            {
                res = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;            }
        }
        return res;
    }
    public boolean fun(int arr[] , int mid , int k)
    {
        int ele = arr[0];
        int count = 1;
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] >= ele + mid)
            {
                ele = arr[i];
                count++;
            }
        }
        return count >= k;
    }
}
