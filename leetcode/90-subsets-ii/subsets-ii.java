class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         int n = nums.length;
         Arrays.sort(nums);
         int x = 1 << n;
         for(int i = 0 ; i <= x ; i++)
         {
            List<Integer> l = new ArrayList<>();
            for(int j = 0 ; j < n ; j++)
            {
                if((i & (1 << j)) != 0)
                {
                    l.add(nums[j]);
                }
            }
            if(!res.contains(l))
            {
                res.add(l);
            }
         }
         return res;
    }
}