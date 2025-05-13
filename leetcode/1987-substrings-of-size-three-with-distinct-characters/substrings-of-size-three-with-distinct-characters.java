class Solution {
    public int countGoodSubstrings(String s) {
        int k = 3;
        int n = s.length();
        int count = 0;
        for(int i = 2 ; i < n ; i++)
        {
            char a = s.charAt(i);
            char b = s.charAt(i - 1);
            char c = s.charAt(i - 2);
            count += a == b ? 0 : a ==c ?0:b == c ? 0 : 1;
        }
        return count;
    }
}