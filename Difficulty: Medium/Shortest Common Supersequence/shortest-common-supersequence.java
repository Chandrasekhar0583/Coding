class Solution {
    public static int minSuperSeq(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int cur[] = new int[m + 1];
        int prev[] = new int[m + 1];
        
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= m ; j++)
            {
                if(s1.charAt(i - 1) == s2.charAt(j - 1))
                {
                    cur[j] = 1 + prev[j - 1];
                }
                else{
                    cur[j] = Math.max(cur[j - 1] , prev[j]);
                }
            }
            prev = cur.clone();
        }
        return n + m - cur[m];
    }
}