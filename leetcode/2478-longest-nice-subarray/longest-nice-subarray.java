class Solution {
    public int longestNiceSubarray(int[] nums) {
        int res = 1;
        int i=0;
        int j=1;
        int n = nums.length;
        long sum = nums[0];
        int count =0;
        long temp = nums[0];
        while(j<n)
        {
           sum +=nums[j];
           temp ^= nums[j];
           while(sum!=temp && i<j)
           {
            sum -= nums[i];
            temp ^= nums[i];
            i++;
           }
           if(sum == temp && i!=j)
           {
           res = Math.max(res,j-i+1);
           }
           j++;
        }
        return res;
    }
}