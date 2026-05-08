class Solution {
    public int findPermutationDifference(String s, String t) {
        int res = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int ind = t.indexOf(ch);
            res += Math.abs(ind - i);
        }
        return res;
    }
}