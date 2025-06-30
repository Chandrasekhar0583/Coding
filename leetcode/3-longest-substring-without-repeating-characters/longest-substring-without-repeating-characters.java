class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0 ,j = 0 , n = s.length() , count = 0;
        while(j < n)
        {
            while( i < j && set.contains(s.charAt(j)) )
            {
                set.remove(s.charAt(i++));
            }
            set.add(s.charAt(j));
            count = Math.max(count , set.size());
            j++;
        }
        return count;
    }
}