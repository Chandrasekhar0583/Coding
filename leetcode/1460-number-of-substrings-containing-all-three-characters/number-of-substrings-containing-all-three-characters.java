class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        int count  = 0;
        int left = 0;
        while(i<n)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3)
            {
                count += n-i;
                char ch1 = s.charAt(left);
                if(map.get(ch1)>1)
                map.put(ch1,map.get(ch1)-1);
                else
                map.remove(ch1);
                left++;
            }
            i++;
        }
        return count;
    }
}