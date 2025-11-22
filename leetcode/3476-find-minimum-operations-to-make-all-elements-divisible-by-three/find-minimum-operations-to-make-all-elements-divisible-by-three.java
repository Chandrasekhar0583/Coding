class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for(int i : nums)
        {
            int x = i % 3;
            res += (x - 0) < (3 - x) ? x - 0 : 3 - x;
        }
        return res;
    }
}