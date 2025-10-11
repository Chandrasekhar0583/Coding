class Solution {
    public long maximumTotalDamage(int[] pow) {
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i : pow)
        {
            map.put(i , map.getOrDefault(i , 0l) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int n = list.size() ;
        Long dp[] = new Long[n];
        long res = 0;
        long r = fun(list , 0, dp ,map);
        // System.out.println(Arrays.toString(dp));
        return dp[0];
    }
    public long fun(ArrayList<Integer> list , int i  , Long dp[] ,HashMap<Integer , Long> map)
    {
        if(i >= list.size()) return 0;
        if(dp[i] != null) return dp[i];

        long skip = fun(list , i + 1 , dp , map);

        long sum = (long)(list.get(i) * map.get(list.get(i)));
        int j = i + 1;
        while( j < list.size() && list.get(i) >= ( list.get(j) - 2)) j++;

        sum += fun(list , j , dp , map);
        dp[i] = Math.max(sum , skip);
        return dp[i];
    }
}