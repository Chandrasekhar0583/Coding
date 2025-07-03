class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character , Integer >  map = new HashMap<>();
        int i = 0 , j = 0;
        int res = -1;
        int n = s.length();
        while(j < n)
        {
            char c = s.charAt(j);
            map.put(c , map.getOrDefault(c , 0 ) + 1);
            while(i < j && map.size() > k)
            {
                char ch = s.charAt(i);
                if(map.get(ch) == 1)
                {
                    map.remove(ch);
                }
                else{
                    map.put(ch , map.get(ch) - 1);
                }
                i++;
            }
            if(map.size() == k)
            res = Math.max(res , j - i + 1);
            j++;
        }
        return res;
    }
}