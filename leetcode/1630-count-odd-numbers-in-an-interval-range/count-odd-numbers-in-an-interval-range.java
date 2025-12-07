class Solution {
    public int countOdds(int low, int high) {
        long odd = 0;
        if (low % 2 != 0) {
            odd++;
            low++;
        }
        if (low >= high)
            return (int) odd;

        if (high % 2 != 0) {
            odd++;
            high--;
        }
        if (low != high)
            odd += (long) (high - low + 1) / 2;

        return (int) odd;
    }
}