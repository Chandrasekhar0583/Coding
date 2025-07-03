class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        fun(sb , 9);
        return sb.charAt(k - 1);
    }
    public void fun(StringBuilder sb ,  int pow)
    {
        if(pow == 0)
        {
            sb.append("a");
            return ;
        }
        fun(sb , pow - 1);
        int len = sb.length();
        int size = 1 << pow ;
        for(int i = len - (size / 2) ; i < len; i++)
        {
            char c =(char) ((int)sb.charAt(i) + 1);
            sb.append(""+c);
        }
        return ;
    }
}