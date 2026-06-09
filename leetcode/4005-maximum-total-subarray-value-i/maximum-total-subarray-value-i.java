class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i : nums){
            min = Math.min(i , min);
            max = Math.max(i , max);
        }
        return (max - min) * k;
    }
}