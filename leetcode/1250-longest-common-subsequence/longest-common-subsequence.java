class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length();
        int m = t2.length();

        int prev[] = new int[m + 1];

        for(int i = 0 ; i < n ; i++)
        {
            int cur[] = new int[m + 1];
            for(int j = 1 ; j <= m ; j++)
            {
                if(t1.charAt(i) == t2.charAt(j - 1))
                {
                    cur[j] = 1 + prev[ j - 1];
                }
                else{
                    cur[j] = Math.max(cur[j - 1] , prev[j]);
                } 
            }
            prev = cur;
        }
        return prev[m];
    }
}