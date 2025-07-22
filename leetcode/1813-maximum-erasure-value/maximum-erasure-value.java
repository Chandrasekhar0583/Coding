class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0 , j =0;
        int sum = 0;
        int n = nums.length;
        int res = 0;
        while(j < n)
        {
            while(set.contains(nums[j]) && i < j)
            {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            set.add(nums[j]);
            sum += nums[j];
            j++;
            res = Math.max(res , sum);
        }
        return res;
    }
}