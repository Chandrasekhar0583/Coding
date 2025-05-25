class Solution {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        int n = s.length();
        int x = 0;
        sb.append(s.charAt(0));
        for(int i = 1 ; i < n ; i++ )
        {
            x = 0;
            if(!sb.isEmpty())
             x = Math.abs(s.charAt(i) - sb.charAt(len));
             x %= 24;
            if(x == 1)
            {
                sb.delete(len, len+1);
                len--;
            }
            else
            {
                sb.append(s.charAt(i));
                len++;
            }
        }
        return sb.toString();
    }
}