class Solution {
    public int minOperations(int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        int one = 0;
        for(int i : nums)
        {
            if(i == 1)
            one++;
        }
        if(one > 0)
        {
            return n - one;
        }
        for(int i = 0 ; i < n - 1 ; i++ )
        {
            int x = gcd(nums[i] , nums[i + 1]);
            if(x == 1)
            {
                res = Math.min(res , n);
            }
            else{
                boolean flag = false;
                int j = i + 2;
                while(j < n)
                {
                    int y = gcd(x , nums[j]);
                    if(y == 1)
                    {
                        res = Math.min(res ,n + j - i -1);
                    }
                    j++;
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public int gcd(int a , int b)
    {
        if(b == 0) return a;

        return gcd(b , a % b);
    }
}