class Solution {
    int n , m , len;
    public boolean isInterleave(String s1, String s2, String s3) {
        // code here
        n = s1.length();
        m = s2.length();
        len = s3.length();
        if(n + m != len) return false;
        
        boolean prev[] = new boolean[m + 1];
        boolean cur[] = new boolean[m + 1];
        
        prev[0] = true;
        
        for(int j = 1 ; j <= m ; j++)
        {
            prev[j] = prev[j - 1] && (s2.charAt(j - 1) == s3.charAt(j - 1));
        }
        
        
        for(int i = 1 ; i <= n ; i++)
        {
            cur[0] = prev[0] && (s1.charAt(i - 1) == s3.charAt(i - 1));
            for(int j = 1 ; j <= m ; j++)
            {
                int k = i + j ;
                
                cur[j] = (s1.charAt(i - 1) == s3.charAt(k - 1) && prev[j]) || (s2.charAt(j - 1) == s3.charAt(k - 1) && cur[j - 1]);
                
            }
            prev = cur.clone(); 
        }
        return prev[m];
    }
}