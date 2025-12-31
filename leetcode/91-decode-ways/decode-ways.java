class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s.charAt(0) == '0') return 0;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        return fun(s , dp , 0);
    }
    public int fun(String s , int dp[] , int ind){
        if(ind >= s.length()) return 1;

        

        if(dp[ind] != -1) return dp[ind] ;

        if(s.charAt(ind) == '0'){
            return dp[ind] = 0;
        } 
        int res = 0;
        int num = s.charAt(ind) - '0' ;
        if(ind < s.length() - 1){
        num = num * 10 + s.charAt(ind + 1) -'0';
        if(num < 27)
            res += fun(s , dp , ind + 2);
        }
        res += fun(s , dp , ind + 1);

        return dp[ind] = res;

    }
}