class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int count = 0;
        int total = (1 << n);
        int or = 0;
        for(int i : nums)
            or |= i;
        for(int i = 1 ; i < total ; i++)
        {
            int x = 0;
            for(int j = 0 ; j < n ; j++ )
            {
                if( (i & (1 << j)) > 0)
                    x |= nums[j];
            }
            if( x == or)
                count++;
        }
        return count;
    }
}