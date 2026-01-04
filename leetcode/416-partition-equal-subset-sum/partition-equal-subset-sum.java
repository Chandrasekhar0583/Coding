class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        int n = nums.length ;
        for(int i : nums){
            total += i;
        }
        if(total % 2 != 0) return false;
        boolean dp[] = new boolean[(total / 2 )+ 1];
        dp[0] = true;


        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = (total / 2 ) ; j > 0; j--){
                if(j >= nums[i - 1])
                dp[j] |= dp[j - nums[i - 1]];
            }
        }
        return dp[total / 2] ;
    }
}