class Solution {
    int res = 0;
    int n , m;
    public int findMaxForm(String[] strs, int m1, int n1) {
        int len = strs.length;
        Integer dp[][][] = new Integer[m1 + 1][n1 + 1][len + 1];
        HashMap<Integer , int[]> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++)
        {
            String s = strs[i];
            int o = 0;
            int e = 0;
            for(char ch : s.toCharArray())
            {
                if(ch == '0')
                o++;
                else
                e++;
            }
            map.put(i , new int[]{o , e});
        }
        res = 0;
        n = n1;
        m = m1;
        int x = fun(map , 0 , 0 , 0 , 0 , dp);
        return x;
    }
    public int fun(HashMap<Integer , int[]> map , int ind , int i , int j , int count , Integer[][][] dp)
    {
        if(ind >= map.size()) return 0;
           
        if(i > m || j > n)
            return 0;
      
        if(dp[i][j][ind] != null ) return dp[i][j][ind];

        int arr[] = map.get(ind);
        int pick = 0 , skip = 0;
        if(i + arr[0] <= m && j + arr[1] <= n)
        pick = 1 + fun(map , ind + 1 , i + arr[0] , j + arr[1] , count+1 , dp);

        skip = fun(map , ind + 1 , i , j  , count , dp);
       
       
        dp[i][j][ind] = Math.max(pick , skip);


        return  dp[i][j][ind];
    }
}