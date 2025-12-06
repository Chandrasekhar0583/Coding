class Solution {
    int n, m;
    int dp[][];

    public String shortestCommonSupersequence(String s1, String s2) {
        lcs(s1, s2);
        // System.out.println(Arrays.deepToString(dp));
        String lcs = generate(s1, s2);

        // StringBuilder sb = new StringBuilder();
        String res = superSeq(s1 , s2, lcs);
        // superSeq(s2 , sb);
        return res;
    }

    public String superSeq(String s1, String s2 , String sb)
    {
        int len = sb.length();
        String res = "";
        int i = 0 , j = 0 , k = 0;

        while(i < n && j < m && k < len)
        {
            if(s1.charAt(i) == s2.charAt(j) && sb.charAt(k) == s1.charAt(i) )
            {
                res += sb.charAt(k);
                i++;
                j++;
                k++;
            }
            if(i < n  && k < len && s1.charAt(i) != sb.charAt(k))
            {
                res += s1.charAt(i);
                i++;
            }
            if(  j < m && k < len && s2.charAt(j) != sb.charAt(k))
            {
                res += s2.charAt(j);
                j++;
            }
        }
        if(i < n  ) res += s1.substring(i);
        if(j < m  ) res += s2.substring(j);
        return res;

    }

    public void lcs(String t1, String t2) {
        n = t1.length();
        m = t2.length();
        dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }

            }
        }
        return;
    }

    public String generate(String s1 , String s2)
    {
        int len = dp[n][m];
        char data[] = new char[len];

        int i = n ;
        int j = m;

        while(i > 0 && j > 0)
        {
            if(s1.charAt(i - 1) == s2.charAt(j - 1))
            {
                data[len - 1] = s1.charAt(i - 1);
                i = i -1;
                len--;
                j = j -1;
            }else{
                if(dp[i][j - 1] > dp[i - 1][j])
                {
                    j--;
                }
                else{
                    i--;
                }
            }
        }
         return new String(data);
    }
}