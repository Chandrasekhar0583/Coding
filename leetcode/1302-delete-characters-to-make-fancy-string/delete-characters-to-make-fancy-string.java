class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        if(s.length() <= 2)
        return s;
        res.append(""+s.charAt(0));
        res.append(""+s.charAt(1));
        return find(res , 2,s);
    }
    public String find(StringBuilder res , int i , String s)
    {
        if(i == s.length())
        return res.toString();
        int len = res.length();
        if(res.charAt(len - 1) == res.charAt(len - 2) && res.charAt(len - 1) == s.charAt(i) )
        {
            return find(res , i + 1 ,s);
        }
        else
        return find(res.append(s.charAt(i)), i + 1 , s);
    }
}