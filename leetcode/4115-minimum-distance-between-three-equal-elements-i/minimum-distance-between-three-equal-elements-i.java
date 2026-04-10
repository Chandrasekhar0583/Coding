class Solution {
    public int minimumDistance(int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n - 2 ; i++)
            {
                for(int j = i + 1 ; j < n - 1 ; j++)
                    {
                        if(nums[i] == nums[j])
                        {
                            for(int k = j + 1 ; k < n ; k++ )
                                {
                                    if(nums[k] != nums[j]) continue;
                                    int dis = (j - i) + (k - i) + (k - j);
                                    res = Math.min(res , dis);
                                }
                        }
                    }
            }
        return res != Integer.MAX_VALUE ? res : -1;
    }
}