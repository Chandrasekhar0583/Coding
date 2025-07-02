class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1;
        int high = nums.length;
        int ans = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (fun(nums, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public boolean fun(int[] nums, int k, int mid) {
        long sum = 0;
        for (int i = 0; i < mid; i++) {
            sum += nums[i];
        }
        if (((long) mid * nums[mid - 1] - sum) <= k)
            return true;
        for (int i = 1; i <= nums.length - mid; i++) {
            sum += nums[i + mid - 1];
            sum -= nums[i - 1];
            if (((long) mid * nums[i + mid - 1] - sum) <= k)
                return true;

        }
        return false;

    }
}