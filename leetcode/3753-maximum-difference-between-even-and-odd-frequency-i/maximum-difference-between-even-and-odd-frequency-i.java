class Solution {
    public int maxDifference(String s) {
        HashMap<Character , Integer > map = new HashMap<>();
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            map.put(ch ,map.getOrDefault(ch , 0) + 1);
        }
        for(Integer val : map.values())
        {
            if(val % 2 == 0)
            {
                min = Math.min(min , val);
            }
            else{
                max = Math.max(max,val);
            }
        }
        return max - min;
    }
}