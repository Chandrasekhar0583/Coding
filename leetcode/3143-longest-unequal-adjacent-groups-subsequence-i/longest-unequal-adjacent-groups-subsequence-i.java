class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> res = new ArrayList<>();
        int n = groups.length;
        res.add(words[0]);
        for(int i = 1 ; i < n ; i++ )
        {
            if(groups[i] != groups[i - 1])
            res.add(words[i]);
        }
        return res;
    }
}