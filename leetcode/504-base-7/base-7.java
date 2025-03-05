class Solution {
    public String convertToBase7(int num) {
        if(num==0)
        return "0";
        String s = "";
        int c=0;
        if(num<0)
        c++;
        num = Math.abs(num);
        while(num!=0)
        {
            s = num%7 +s;
            num = num / 7;
        }
        if(c==1)
        s = "-"+s;
        return s;
    }
}