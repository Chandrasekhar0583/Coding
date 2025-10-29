class Solution {
    public int minFlips(int a, int b, int c) {
        // int x = a | b;
        int res = 0;
        for(int i = 0 ; i < 32 ; i++)
        {
            int y = (1 << i);
            if((c & y) > 0)
            {
                if(((a & y) | (b & y)) == 0)
                {
                  res++;
                }
            }
            else{
                if((a & y)  != 0) res++;
                if((b & y) != 0) res++;
            // System.out.println(i +" "+res);
            }
        }
        return res;
    }
}