class Solution {
    public int[] productQueries(int n, int[][] que) {
        int len  = que.length;
        int res[] = new int[len];
        int mod = 1000000007;
        int pow[] = new int[32];
        pow[0] = 1;
        for(int i = 1 ; i < 32 ; i++)
        {
            pow[i] = (int)(pow[i-1] * 2L) % mod;
        } 
        ArrayList<Integer> ind = new ArrayList<>();
        int i = 0 ;
        while(i < 32)
        {
            int x = (1 << i);
            if((x & n) != 0)
            ind.add(pow[i]);
            i++;
        }
        for( i = 0 ; i < len ; i++)
        {
            long prod = 1;
            for(int j = que[i][0] ; j <= que[i][1] ; j++)
            {
                prod = (prod * ind.get(j)) % mod;
            }
            res[i] = (int) prod;
        }
        return res;
    }
}