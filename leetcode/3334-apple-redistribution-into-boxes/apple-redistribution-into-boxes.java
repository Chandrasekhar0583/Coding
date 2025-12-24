class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count = 0;
        for(int i : apple)
        {
            count += i;
        }
        Arrays.sort(capacity);
        int res = 0;
        for(int i = capacity.length - 1 ; i >= 0 ; i--)
        {
            if(count > 0)
            {
                res++;
                count -= capacity[i];
            }
            if(count == 0) return res;
        }
        return res;
    }
}