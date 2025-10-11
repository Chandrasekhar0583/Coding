class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i , map.getOrDefault(i , 0) + i);
        } 
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int n = list.size();
        Integer dp[] = new Integer[n];
        return fun(list , 0 , dp , map);
    }
    public int fun(ArrayList<Integer> list , int i ,Integer dp[] , HashMap<Integer, Integer> map)
    {
        if(i >= list.size()) return 0;
        if(dp[i] != null) return dp[i];
        int skip = fun(list , i + 1 , dp,map);
        int sum = map.get(list.get(i));
        int j = i + 1;
        while(j < list.size() && list.get(i) + 1 == list.get(j))j++;
        sum += fun(list , j , dp ,map);
        dp[i] = Math.max(sum , skip);
        return dp[i];
    }
}