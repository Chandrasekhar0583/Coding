class Solution {
    public int countTriples(int n) {
        int res = 0;

        for(int i = 1 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                int x = i * i + j * j;
                int y = (int)Math.sqrt(x);

                if(y <= n && y * y == x)
                {
                    res += 2;
                }
            }
        }
        return res;
    }
}