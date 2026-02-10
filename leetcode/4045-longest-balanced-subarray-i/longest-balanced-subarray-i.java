class Solution {
    public int longestBalanced(int[] nums) {
        int i = 0;
        int res = 0;
        int n = nums.length;
        for(i = 0 ; i < n ; i++)
            {
                int even = 0;
                int odd = 0;
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int j = i ; j < n ; j++)
                    {
                        int x = nums[j];
                        if(map.containsKey(x)){
                            if(even == odd)res = Math.max(j - i + 1 , res);
                            continue;
                        }
                        if(x % 2 == 0) even++;
                        else odd++;
                        map.put(x , 1);
                        if(even == odd)res = Math.max(j - i + 1 , res);
                        if(res == n) break;
                    }
                if(res == n) break;
            }
    return res;
    }
}