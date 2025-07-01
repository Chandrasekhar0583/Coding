class Solution {
    public int possibleStringCount(String word) {
        int count = 1 ;
        for(int i = 1 ; i < word.length() ; i++ )
        {
            char c = word.charAt(i);
            char c2 = word.charAt(i - 1);
            if(c == c2)
            {
                count++;
            }
        }
        return count;
    }
}