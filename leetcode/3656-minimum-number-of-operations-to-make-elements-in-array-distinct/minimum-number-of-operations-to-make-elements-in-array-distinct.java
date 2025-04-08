class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int suffixLength = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                break;
            }
            seen.add(nums[i]);
            suffixLength++;
        }

        int toRemove = nums.length - suffixLength;
        return (toRemove + 2) / 3; 
    }
}
