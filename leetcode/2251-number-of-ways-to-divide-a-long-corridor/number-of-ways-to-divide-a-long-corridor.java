class Solution {
    public int numberOfWays(String cor) {
        long res = 1;
        int n = cor.length();
        int mod = 1000000007;
        long plants = 0;
        long seats = 0;
        for( int i = 0 ; i < n ; i++)
        {
            if(cor.charAt(i) == 'S')
            {
                seats++;
                if(seats > 2 && seats % 2 == 1)
                {
                    res = (res * (plants + 1) ) % mod;
                    plants = 0;
                }
            }
            else if (seats >= 2 && seats % 2 == 0) {
                plants++;
            }
        }
        return seats > 0 && seats % 2 == 0 ? (int) res : 0;
    }
}