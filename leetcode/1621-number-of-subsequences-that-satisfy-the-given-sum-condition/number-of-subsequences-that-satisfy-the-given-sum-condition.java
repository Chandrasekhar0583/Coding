class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length ;
        int mod = 1000000007;
        int count  = 0 ;
        int pow[] = new int[n];
        pow[0] = 1;
        for(int i = 1 ; i <n ; i++)
        {
            pow[i] = (pow[i - 1] * 2)% mod;
        }
        for(int i = 0 ; i < n ; i++ )
        {
            int low = i ;
            int high = n - 1;
            int k = target - nums[i];
            int a = -1;
            while(low <= high)
            {
                int mid = (low + high) / 2;
                if(nums[mid] > k)
                high = mid - 1;
                else{
                    low = mid + 1;
                    a = mid;
                }
            }
            if(a != -1)
            {
                count = (count + pow[a - i]) % mod;
            }
        }
        return count;
    }
}