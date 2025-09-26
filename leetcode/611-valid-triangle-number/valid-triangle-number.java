class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count  = 0 ;
        for(int i = 0 ; i < n - 2 ; i++)
        {
            for(int j = i + 1 ; j < n - 1 ; j++)
            {
                int x = nums[i] + nums[j];
                int ans = find(nums , x , j + 1);
                count += ans - j;
            }
        }
        return count;
    }
    public int find(int nums[] , int x , int low)
    {
        int high = nums.length - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] >= x)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low - 1;
    }
}