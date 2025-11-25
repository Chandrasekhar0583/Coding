class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) return -1;

        long res = 1;
        int count = 1;

        while(res % k != 0 )
        {
            res = (res * 10 + 1) % k;
            count++;
        }

        return count;
    }
}