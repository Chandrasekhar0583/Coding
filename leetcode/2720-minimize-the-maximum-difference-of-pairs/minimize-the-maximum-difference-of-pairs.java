class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int dis = nums[n - 1] - nums[0];
        int res = -1;
        int low = 0;
        int high = nums[n - 1];
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(find(nums , p , mid))
            {
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return res;
    }
    public static boolean find(int nums[] , int p , int mid)
    {
        int count = 0 ,i;
        int n = nums.length;
        for( i = 1 ; i < n ;)
        {
            int x = nums[i] - nums[i - 1];
            if(x <= mid)
            {
                count++;
                i+=2;
            }
            else{
              i++;
            }
        }
        return count >= p;
    }
}