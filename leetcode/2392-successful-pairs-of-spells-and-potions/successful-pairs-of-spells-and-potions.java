class Solution {
    public int[] successfulPairs(int[] s, int[] p, long success) {
        int n = s.length;
        int m = p.length;
        Arrays.sort(p);
        int res[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            int ind = fun(p , s[i] , success);
            res[i] = ind == -1? 0 : m - ind;
        }
        return res;
    }
    public int fun( int[] arr , long x , long s )
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            long a = x * arr[mid];
            if( a >= s )
            {
                high = mid - 1;
                ans = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}