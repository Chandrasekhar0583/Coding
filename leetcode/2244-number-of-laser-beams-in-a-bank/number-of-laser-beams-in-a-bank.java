class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int prev = 0 ;
        for(String s : bank)
        {
            int j = s.length() - 1;
            int i = 0 ;
            int now = 0;
            while(i < j )
            {
                if(s.charAt(i) == '1')
                {
                    now++;
                }
                if(s.charAt(j) == '1')
                {
                    now++;
                }
                i++;
                j--;
            }
            if(i == j && s.charAt(i) == '1')
            {
                now++;
            }
            if(prev != 0 && now != 0)
            {
                res += prev * now;
            }
            if(now != 0)
            {
                prev = now;
            }
        }
        return res;
    }
}