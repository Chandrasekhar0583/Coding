class Solution {
    public boolean hasSameDigits(String s) {
       while(s.length()>2)
           {
               String s1="";
               for(int i=0;i<s.length()-1;i++)
                   {
                       int x = (int)s.charAt(i);
                       int y = (int)s.charAt(i+1);
                       s1+=(x+y)%10;
                   }
               s=s1;
           }
        return s.charAt(0)==s.charAt(1);
    }
}