class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        int i = 0 ;
        long res = 0;
        while(i < n)
        {
            int j = i;
            while(j < n && nums[j] == 0 )
            {
                j++;
            }
            long x = j - i;
            res += (x) * (x + 1) / 2;
            i = j+1;
        }
        return res;
    }
}