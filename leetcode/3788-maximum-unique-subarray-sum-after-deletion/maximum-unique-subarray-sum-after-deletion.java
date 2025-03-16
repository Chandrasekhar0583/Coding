class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = n-1 ;i>=0;i--)
        {
            if(i==n-1)
            sum+=nums[i];
            else
            {
                if(nums[i]!=nums[i+1])
                sum+=nums[i];
            }
                max = Math.max(sum,max);
        }
        return max;
    }
}