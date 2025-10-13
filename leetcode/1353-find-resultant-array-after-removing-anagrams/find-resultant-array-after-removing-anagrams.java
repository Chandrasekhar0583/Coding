class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        int arr1[] = new int[26];
        for(char ch : words[0].toCharArray())
        {
            arr1[ch - 'a']++;
        }
        for(int i = 1 ; i < words.length ; i++)
        {
            for(char ch : words[i].toCharArray())
            {
                arr1[ch - 'a']--;
            }
            boolean flag = true;
            for(int j = 0; j < 26 ; j++)
            {
                if(arr1[j] != 0) {
                    flag = false;
                }
                arr1[j] = 0;
            }
            if(!flag)
            {
                res.add(words[i]);
            }
            String s = res.get(res.size() - 1);
            for(char ch : s.toCharArray())
            {
                arr1[ch - 'a']++;
            }
        }
        return res;
    }
}