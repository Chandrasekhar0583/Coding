class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

    
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = (nums[i] == 0) ? 0 : count[nums[i] - 1];
        }
        return res;
    }
}
