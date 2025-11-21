class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int res = 0;
        HashMap<Character, Integer[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.putIfAbsent(ch, new Integer[2]);
            Integer ind[] = map.get(ch);
            ind[0] = ind[0] != null ? Math.min(i, ind[0]) : i;
            ind[1] = ind[1] != null ? Math.max(i, ind[1]) : i;
        }
        for (Integer[] ind : map.values()) {
            if (ind[0] != null) {
            int pre = 0;
            int num[] = new int[26];
            for(int i = ind[0] + 1; i < ind[1] ; i++)
            {
                char ch = s.charAt(i);
            if (num[ch - 'a'] == 0) {
                pre++;
                num[ch - 'a']++;
            }
            }
            res += pre;

            }
        }
        return res;
    }
}