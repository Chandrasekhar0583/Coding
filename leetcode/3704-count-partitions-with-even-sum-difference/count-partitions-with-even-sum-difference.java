class Solution {
    public int countPartitions(int[] nums) {
        int tsum = 0;
        int presum = 0;
        for(int i : nums)
        {
            tsum += i;
        }
        presum = nums[0];
        int res = 0;
        tsum -= nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            boolean f1 = presum % 2 == 0;
            boolean f2 = tsum % 2 == 0;
            if(f1 && f2) res++;
            else if(!f1 && !f2) res++;

            presum += nums[i];
            tsum -= nums[i];
        }
        return res;
    }
}