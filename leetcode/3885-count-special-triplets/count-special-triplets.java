class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            left.put(nums[i] , left.getOrDefault(nums[i] , 0) + 1);
        }
        right.put(nums[0] , 1);
        long res = 0;
        for(int i = 1 ; i < n  - 1; i++)
        {
            int x = nums[i] * 2;

            if(left.containsKey(x) && right.containsKey(x))
            {
                long l = right.get(x);
                long r = left.get(x) - l;
                if(x == 0)
                {
                    r--;
                }
                res =  (res + l * r) % 1000000007;
            }
            right.put(nums[i] , right.getOrDefault(nums[i] , 0) + 1);
            // right.put()
        }

        return (int)res;
    }
}