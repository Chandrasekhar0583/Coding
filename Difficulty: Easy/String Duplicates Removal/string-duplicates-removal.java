// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        String s1 =  "";
        for(char ch : s.toCharArray())
        {
            if(!set.contains(ch))
            {
                s1 += ch;
                set.add(ch);
            }
        }
        return s1;
    }
}
