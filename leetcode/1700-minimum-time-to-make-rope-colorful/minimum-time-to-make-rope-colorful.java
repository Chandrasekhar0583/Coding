class Solution {
    public int minCost(String s, int[] time) {
        int i = 0;
        int n = s.length();
        int res = 0;
        while(i < n)
        {
            int max = -1;
            int sum = 0;
            int j = i;
            while(j < n && s.charAt(i) == s.charAt(j))
            {
                sum += time[j];
                max = Math.max(time[j] , max);
                j++;
            }
            res += sum - max;
            i = j;
        }
        return res;
    }
}