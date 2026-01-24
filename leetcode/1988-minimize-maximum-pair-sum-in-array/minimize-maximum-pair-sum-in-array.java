class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int res = 0;
        while(low < high){
            res = Math.max(res , nums[low] + nums[high]);
            low++;
            high--;
        }
        return res;
    }
}