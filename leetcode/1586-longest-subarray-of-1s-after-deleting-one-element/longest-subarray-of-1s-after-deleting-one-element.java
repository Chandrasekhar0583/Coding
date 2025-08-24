class Solution {
    public int longestSubarray(int[] nums) {
        int ind = 0;
        int n = nums.length;
        int i = 0;
        int j = 0;
        int zero = 0;
        int res = 0;
        while(i < n)
        {
            if(nums[i] == 0){ 
                zero++;
            if(zero >= 2)
            {
                res = Math.max(res , i - j -1);
                j = ind + 1;
                ind = i;
                zero = 1;
            }
            else{
                ind = i;
            }
        }
            i++;
        }
        res = Math.max(res , i - j - 1 );
        return res;
    }
}