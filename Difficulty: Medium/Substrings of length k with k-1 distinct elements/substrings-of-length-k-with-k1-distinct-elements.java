class Solution {
    public int substrCount(String s, int k) {
        // code here
        HashMap<Character , Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < k ; i++)
        {
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size() + 1 == k)
        count++;
        for(int i = 0 ; i < s.length() - k; i++)
        {
            char c = s.charAt(i);
            if(map.get(c) == 1)
            {
                map.remove(c);
            }
            else{
                map.put(c , map.get(c) - 1);
            }
            map.put(s.charAt(i+k) , map.getOrDefault(s.charAt(i+k),0)+1);
            if(map.size() == (k - 1))
            count++;
        }
            return count;
    }
}