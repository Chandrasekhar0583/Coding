class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        int n = nums.length;
        int pref = 0;
        for(int i : nums)
        {
            total += i;
        }
        for(int i=0;i<n;i++)
        {
            total -= nums[i];
            if(pref==total)
            return i;
            pref += nums[i];
        }
        return -1;
    }
}