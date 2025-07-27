class Solution {
    public int countHillValley(int[] nums) {
        int count = 0 ;
        int i = 1 ;
        int n = nums.length;
        while(i < n - 1)
        {
            if(nums[i] == nums[i - 1])
            {
                i++;
                continue;
            }
            int j = i - 1;
            int k = i + 1;
            while(j >= 0 && nums[i] == nums[j])
            {
                j--;
            }
            while(k < n && nums[i] == nums[k])
            {
                k++;
            }
            if(j >= 0 && k < n &&((nums[j] > nums[i] && nums[k] > nums[i]) || (nums[j] < nums[i] && nums[k] < nums[i])))
            count++;
            i++;
        }
        return count;
    }
}