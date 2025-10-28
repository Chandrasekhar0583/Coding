class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        if ( n == 1) return nums[0] == 0 ? 2 : 1;
        arr[0] = nums[0];
        for(int i = 1 ; i < n ; i++ )
        {
            arr[i] += nums[i]+ arr[i - 1];
        }
        int res = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == 0)
            {
                int l = i != 0 ? arr[i - 1] : 0;
                int r = i == n- 1? 0 : arr[n - 1] - l;
                if(l == r) {
                    res += 2;
                }
                else if(Math.abs(l - r) == 1)
                {
                    res++;
                }
            }
        }
        return res;
    }
}