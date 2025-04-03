class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int suf[] = new int[n];
        suf[n-1] = nums[n-1];
        int pre[] = new int[n];
        pre[0] = nums[0];
        long res = 0;
        for(int i = 1;i < n; i++)
        {
            suf[n-1-i] = Math.max(nums[n-1-i],suf[n-i]);
            pre[i] = Math.max(nums[i], pre[i-1]);
        }
        for( int i =1 ;i < n-1 ; i++)
        {
            res = Math.max((long)(pre[i-1] - nums[i])*suf[i+1],res);
        }
        return res<=0?0:res;
    }
}