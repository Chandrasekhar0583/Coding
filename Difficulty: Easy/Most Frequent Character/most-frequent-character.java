class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] arr = new int[26];
        int max = 0;
        for(char ch : s.toCharArray())
        {
            int x = ch - 'a';
            arr[x]++;
            max = Math.max(max , arr[x]);
        }
        for(int i = 0 ; i < 26 ; i++)
        {
            if(arr[i] == max)
            {
                char c = (char)((int)'a' + i);
                return c;
            }
        }
        return 'a';
    }
}