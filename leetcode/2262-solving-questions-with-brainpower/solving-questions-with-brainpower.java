class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        Long dp[] = new Long[n];
        return Helper(questions,0,dp);
    }
    public long Helper(int[][] questions, int i,Long[] dp)
    {
        if(i >= questions.length)
        return 0;
        if(dp[i]!=null)
        return dp[i];
        long points = Math.max(
            Helper(questions,i+1,dp),
            questions[i][0] + Helper(questions,i+questions[i][1]+1,dp));
        dp[i] = points;
        return dp[i];
    }
}