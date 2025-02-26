class Solution {
    public int myAtoi(String s) {
        long num = 0;
        s=s.trim();
        if(s.length()==0)
        return 0;
        int i=0,k=1;
        if(s.charAt(i)=='-')
        {
            i++;
            k=-1;
        }
        if(s.charAt(0)=='+' && i==0)
        {
            i++;
        }
        while(i<s.length())
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
            num = num*10 + (ch-'0');

            if(num>Integer.MAX_VALUE)
            {
                return k==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            }
            else
            break;
            i++;

        }
        if(k==1)
        return num>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)num;
        return num>Integer.MAX_VALUE?Integer.MIN_VALUE:(int)(k*num);
      
    }
}