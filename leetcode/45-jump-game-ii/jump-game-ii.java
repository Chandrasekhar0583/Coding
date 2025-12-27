class Solution {
    int res , n;
    public int jump(int[] nums) {
        n = nums.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp , -1);
        return fun(nums , 0 , dp);
    }
    public int fun(int[] nums , int ind , int dp[])
    {
        if(ind >= n - 1) return 0;

        if(dp[ind] != -1) return dp[ind];

        int min = Integer.MAX_VALUE / 2;
        for(int i = 1 ; i <= nums[ind] ; i++){
            min = Math.min(min , fun(nums , ind + i , dp)) ;
        }
        return dp[ind] = min + 1;
    }
}