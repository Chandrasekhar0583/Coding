class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        int total = 0;
        for(char ch : s.toCharArray())
        {
            total += (int) ch;
        }
        ArrayList<Integer> res = new ArrayList<>();
        int arr[] = new int[26];
        Arrays.fill(arr , -1);
        int last1 = 0;
        for(int i = s.length() - 1 ; i > 0 ; i--)
        {
            last1 += (int)s.charAt(i);
            int ind = s.indexOf(s.charAt(i));
            if(ind != i && arr[s.charAt(i) - 'a'] == -1)
            {
              arr[s.charAt(i) -  'a'] = last1 ;
            }
        }
        last1 = 0;
        for(char ch : s.toCharArray() )
        {
            last1 += (int)ch;
            if( arr[ch - 'a'] != -1)
            {
                int x = total - last1 - arr[ch - 'a'];
                arr[ch - 'a'] = -1;
                if(x > 0)
                res.add(x);
            }
        }
        return res;
    }
}