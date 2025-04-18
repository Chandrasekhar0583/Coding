class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if(n == 1)
        return s;
        StringBuilder res = new StringBuilder(s);
        while(n-- > 1)
        {
            int count = 1;
            String s1 = "";
            for( int i = 0;i < res.length() ; i++ )
            {
                count = 1;
                while(i < res.length()-1 && res.charAt(i) == res.charAt(i+1))
                {
                    count++;
                    i++;
                }
                s1+= Integer.toString(count) + res.charAt(i);
            }
            res =new StringBuilder(s1);
        }
        return res.toString();
    }
}