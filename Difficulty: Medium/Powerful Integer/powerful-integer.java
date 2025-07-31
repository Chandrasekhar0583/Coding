class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        // code here
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int a[] : intervals)
        {
            map.put(a[0] , map.getOrDefault(a[0] , 0)+1);
            map.put(a[1]+1 , map.getOrDefault(a[1]+1 , 0) -1);
        }
        int ans = -1;
        int fre = 0;
        for(Integer i : map.keySet())
        {
            int val = map.get(i);
            if(val >= 0)
            {
            fre += val;
                if(fre >= k)
                {
                    ans = i;
                }
            }
            else{
                if(fre >= k)
                {
                    ans = i - 1;
                }
            fre += val;
            }
        }
    
        return ans;
    }
}