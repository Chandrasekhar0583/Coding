class Solution {
    int n , m;
    int dp[];
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        n = nums1.length;
        m = nums2.length ;
        dp = new int[m + 1];

        lcs(nums1 , nums2);
        return dp[m];
    }
      public void lcs(int[] s1 , int[] s2){
        for(int i = 1; i <= n ; i++){
            int cur[] = new int[m + 1];
            for(int j = 1 ; j <= m ; j++){
                if(s1[i - 1] == s2[j - 1])
                {
                    cur[j] = 1 + dp[j - 1];
                }
                else{
                    cur[j] = Math.max(dp[j] , cur[j - 1]);
                }
            }
            dp = cur;
        }
    }
}