class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        return fun(nums , 0 , dp);
    }
    public boolean fun(int nums[] , int i , int[] dp)
    {
        if(i >= nums.length - 1) return true;
        if(dp[i] != 0 ) {
            if(dp[i] == 1) return true;
            else return false;
        }
        for(int j = 1 ; j <= nums[i] ; j++)
        {
            boolean flag = fun(nums , i + j , dp);
            if(flag) {
                dp[i + j] = 1;
                return true;
            }
            if(i +j < nums.length)
            dp[i + j] = -1;
        }
        return false;
    }
}