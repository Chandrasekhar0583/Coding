class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int count = 0;
        int res = Calculate(0, nums , n ,count);
        return res;
    }
    public int Calculate(int i , int[] nums, int n ,int count)
    {
      if (i==n)
      return count;
      return  Calculate(i+1 , nums , n , (nums[i] ^ count)) + Calculate(i+1 , nums ,n , count);
    }
}