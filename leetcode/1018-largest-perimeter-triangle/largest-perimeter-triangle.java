class Solution {
    public int largestPerimeter(int[] nums) {
        int peri = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i < n - 2 ; i++)
        {
           int sum = nums[i] + nums[i + 1] ;
           if(sum > nums[i + 2])
           {
            peri = Math.max(nums[i + 2] + sum , 0);
           }
        }
        return peri;
    }
}