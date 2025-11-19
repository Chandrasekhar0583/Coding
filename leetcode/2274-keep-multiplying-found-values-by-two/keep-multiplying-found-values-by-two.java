class Solution {
    public int findFinalValue(int[] nums, int o) {
        int res = o;
        Arrays.sort(nums);
        for(int i : nums)
        {
            if(res == i)
            {
                res *= 2;
            }
        }
        return res;
    }
}