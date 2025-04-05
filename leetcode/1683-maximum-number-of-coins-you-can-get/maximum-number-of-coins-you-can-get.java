class Solution {
    public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int res = 0;
            int i =0;
            int high = piles.length-2;
            while(i < high)
            {
                res += piles[high];
                i++;
                high -= 2;
            }
            return res;
    }
}