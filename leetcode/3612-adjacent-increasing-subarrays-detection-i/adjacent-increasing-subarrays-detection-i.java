class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
         int n = nums.size();
        boolean[] incStart = new boolean[n]; 
        for (int i = 0; i + k <= n; i++) {
            boolean ok = true;
            for (int j = i + 1; j < i + k; j++) {
                if (nums.get(j) <= nums.get(j - 1)) {
                    ok = false;
                    break;
                }
            }
            incStart[i] = ok;
        }

       
        for (int i = 0; i + 2 * k <= n; i++) {
            if (incStart[i] && incStart[i + k]) return true;
        }

        return false;
    }
}