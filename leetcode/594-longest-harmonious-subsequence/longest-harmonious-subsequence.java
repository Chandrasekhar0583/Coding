class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer > map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i ,map.getOrDefault(i , 0)+1);
        }
        int count  = 0;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] != nums[i - 1] && nums[i] - nums[i - 1] == 1)
            {
                count = Math.max(count , map.get(nums[i]) + map.get(nums[i - 1]));
            }
        }
        return count;
    }
}