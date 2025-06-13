class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int n = arr.length;
        int res = arr[n-1];
        Arrays.sort(arr);
        int low = 1;
        int high = arr[n - 1];
        while(low <= high )
        {
            int mid = (low + high) /2;
            if(find(arr , mid , k))
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
    public static boolean find( int[] arr , int mid , int k)
    {
        int count = 0;
        for(int i : arr)
        {
            count += i % mid == 0 ? i / mid : i / mid +1;
        }
        return count<=k;
    }
}
