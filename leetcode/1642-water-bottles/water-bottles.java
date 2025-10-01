class Solution {
    public int numWaterBottles(int n, int e) {
        int res = n;
        while(n >= e)
        {
            int q = n / e;
            res += q;
            q += n % e;
            n = q;
        }
        return res;
    }
}