class Solution {

    public int combinationSum4(int[] nums, int tar) {
        int n = nums.length ;

        int dp[] = new int[tar + 1];

        Arrays.fill(dp , -1);
        // dp[0][0] = 1;

        int x = fun(dp , nums , tar);
        return x ;
    }
    public int fun(int dp[] , int nums[] , int T){
        if(T == 0) return 1;

        if(dp[T] != -1) return dp[T];

        int r = 0;
        for(int i : nums){
            if(i <= T){
                r += fun(dp , nums , T - i);
            }
        }
        return dp[T] = r;
    }
}