
class Solution {
    static int n ;
    static int dp[][];
    static int minDeletions(String s) {
        n = s.length();
        dp = new int[n + 1][n + 1];

        lcs(s , new StringBuilder(s).reverse().toString());
        return n - dp[n][n];
    }
    static  void lcs(String s1 , String s2){
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1))
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
                }
            }
        }
    }
}