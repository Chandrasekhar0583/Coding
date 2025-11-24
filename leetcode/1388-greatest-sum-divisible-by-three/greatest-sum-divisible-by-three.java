class Solution {
    long count = 0;
    Integer dp[][];
    int res = 0;
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        res = 0;
        count = 0;
        dp = new Integer[n][3];
        // Arrays.fill(dp , -1);
        int x = fun(0 , nums ,dp , 0);
        // System.out.println(count);
        return x;
    }
    public int fun(int i , int nums[] , Integer dp[][] , int mod)
    {
        if(i == nums.length)
        {
            count++;
            if(mod == 0)
            {
                return 0;
            }
            return Integer.MIN_VALUE / 2;
        }
        if(dp[i][mod] != null) return dp[i][mod];
        int take = nums[i]  + fun(i + 1 , nums , dp ,( mod + nums[i] % 3 ) % 3);
        int skip = fun(i + 1 , nums , dp , mod );
        return dp[i][mod] = Math.max(take , skip);
    }
}