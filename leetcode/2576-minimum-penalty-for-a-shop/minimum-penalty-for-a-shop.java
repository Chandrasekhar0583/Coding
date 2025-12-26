class Solution {
    public int bestClosingTime(String cus) {
        int suf = 0;
        for(char ch : cus.toCharArray())
        {
            if(ch == 'Y')
            {
                suf++;
            }
        }
        int res = -1;
        int min = cus.length();
        int n = 0;
        for(int i = 0 ; i < cus.length() ; i++)
        {
            if(suf + n < min)
            {
                res = i;
                min = suf + n;
            }
            if(cus.charAt(i) == 'Y')
            {
                suf--;
            }
            else{
                n++;
            }
        }
            if(suf + n < min)
            {
                res = cus.length() ;
                min = suf + n;
            }

        return res;
    }
}