class Solution {
    public int countGoodNumbers(long n) {
        long res1 = 1;
        long res2 = 1;
        long mod = 1000000007;
        if( n % 2 == 0)
        {
            res1 = count(5 , n/2 , mod);
        }
        else{
            res1 = count(5 , n/2 +1, mod);
        }
            res2 = count(4 , n/2, mod);
        System.out.println(res2);
        return (int)((res1 * res2) % mod);
    }
    public long count(long base , long exp , long mod)
    {
        if(exp <= 0)
        return 1;
        long x = count(base , exp/2 , mod);
        return (x * x *( exp % 2 == 0?1:base))%mod;
    }
}