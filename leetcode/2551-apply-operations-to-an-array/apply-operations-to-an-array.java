class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1 ; i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int i = 0;
        int j= 0;
        while(j<nums.length)
        {
            if(nums[j]!=0)
            {
               int x = nums[i];
               nums[i] = nums[j];
               nums[j] = x;
               i++;
            }
            j++;
        }
        return nums;
    }
}