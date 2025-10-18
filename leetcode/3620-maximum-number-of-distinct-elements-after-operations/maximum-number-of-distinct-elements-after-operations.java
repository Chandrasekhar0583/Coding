class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        int n = nums.length;
        int count = 0;

        for(int i : nums)
        {
            int low = i - k;
            int high = i + k;
            if(prev < high)
            {
                count++;
                prev = Math.max(prev+1 , low);
            }
        }
        return count;
    }
}