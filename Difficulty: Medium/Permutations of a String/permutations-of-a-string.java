class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> res = new ArrayList<>();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int n = s.length();
        boolean visited[] = new boolean[n];
        find(arr , 0 , res , new StringBuilder("") , visited);
        return res;
    }
    public void find(char[] s , int j , ArrayList<String> res,StringBuilder s1 ,boolean vis[])
    {
        if(j == s.length)
        {
            res.add(s1.toString());
            return;
        }
        for(int i = 0 ; i < s.length ; i++)
        {
            if(i > 0 && s[i] == s[i - 1] && !vis[i - 1])
            continue;
            if(!vis[i])
            {
                vis[i] = true;
                s1.append(s[i]);
                find(s, j+1 , res , s1 , vis);
                vis[i] = false;
                s1.deleteCharAt(s1.length() - 1);
            }
        }
    }
}