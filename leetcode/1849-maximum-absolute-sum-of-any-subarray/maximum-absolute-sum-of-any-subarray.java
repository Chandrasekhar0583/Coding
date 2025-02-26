class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minsum = 0;
        int maxsum = 0;
        int cur = 0,cur1=0;
        for(int i:nums)
        {
            cur = Math.max(i,cur+i);
            maxsum = Math.max(maxsum,cur);
            cur1 = Math.min(cur1+i,i);
            minsum=Math.min(minsum , cur1);
        }
        return maxsum>=Math.abs(minsum)?maxsum:Math.abs(minsum);
    }
}