class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length-3;i++)
        {

            for(int j=i+1 ; j<nums.length-2;j++)
            {
                long sum  = nums[i]+nums[j];
                int low = j+1;
                int c=0;
                int high = nums.length-1;
                while(low<high)
                {
                    if(target == (sum+nums[low]+nums[high]))
                    {
                          List<Integer> r1 = new ArrayList<>();
                    r1.add(nums[i]);
                    r1.add(nums[j]);
                    r1.add(nums[low]);
                    r1.add(nums[high]);
                    if(!res.contains(r1))
                    res.add(r1);
                    System.out.println(r1);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1] && nums[high]==nums[high+1])
                    {
                    low++;
                    high--;

                    }
                    }
                    else if(target>(sum+nums[low]+nums[high]))
                    {
                        low++;
                    }
                    else
                    high--;
                }
            }
        }
        return res;
    }
}