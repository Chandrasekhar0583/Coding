class Solution {
    static int n , m;
    static int lcs(String s1, String s2) {
        // code here
        n = s1.length();
        m = s2.length();
        int prev[] = new int[m + 1];
        for(int i = 0 ; i < n ; i++)
        {
            int cur[] = new int[m + 1];
            for(int j = 1 ; j <= m ; j++)
            {
                if(s1.charAt(i) == s2.charAt(j - 1))
                {
                    cur[j] = 1 + prev [j - 1];
                }
                else{
                    cur[j] = Math.max(prev[j] , cur[j - 1]);
                }
            }
            prev = cur;
        }
        return prev[m];
    }
}