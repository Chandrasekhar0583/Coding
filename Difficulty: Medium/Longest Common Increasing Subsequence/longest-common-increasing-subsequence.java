class Solution {
    public int LCIS(int[] a, int[] b) {
        // code here
        int n = a.length;
        int m = b.length;
        
        int cur[] = new int[m];
        
        for(int i =  0 ; i < n  ; i++ )
        {
            int len = 0;
            for(int j = 0 ; j < m ; j++ )
            {
                if(a[i] == b[j])
                cur[j] = Math.max(cur[j] , len+1);
                else if(a[i] > b[j])
                 len = Math.max(cur[j] , len);
            }
            // prev = cur.clone();
        }
      int ans = 0;
        for (int val : cur)
            ans = Math.max(ans, val);
        return ans;
    }
}