class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long res = 0;
        long x1 = n / k;
        long x2 = m / k;
        long r1 = n <= k? 0 : n % k == 0 ? 1: n % k;
        long r2 = m <= k ? 0: m % k == 0 ? 1: m % k;
        res = ((long)Math.pow(k,x1) * r1) +((long)Math.pow(k,x2) * r2 );
        return res;
    }
}