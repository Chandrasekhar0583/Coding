class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long tsum = 0;
        for(int i : nums)
        {
            tsum += i;
        }
        int rem =(int) (tsum % p);
        if (rem == 0) return 0;
        int res = n;
        int pref = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0 ; i < n ; i++)
        {
            pref = (pref + nums[i])% p ;
            int target = (pref - rem + p) % p;
            if(map.containsKey(target))
            {
                res = Math.min(res , i - map.get(target));
            }
            map.put(pref , i);

        }
        return res == n ? -1 : res;
    }
}