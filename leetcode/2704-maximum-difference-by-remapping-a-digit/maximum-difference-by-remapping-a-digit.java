class Solution {
    public int minMaxDifference(int num) {
        int res = Integer.MIN_VALUE;
        String s = ""+num;
        for(int i = 0 ; i < s.length() ; i++)
        {
            String ch  = ""+s.charAt(i);
            int a = Integer.parseInt(s.replace(ch , "9"));
            s = "" + num;
            int b = Integer.parseInt(s.replace(ch , "0"));
            res = Math.max(res , a - b);
            for(int j = i + 1 ; j < s.length() ; j++ )
            {
            s = ""+num;
            String ch2  = ""+s.charAt(j);
            int c = Integer.parseInt(s.replace(ch2 , "9"));
            s = "" + num;
            int d = Integer.parseInt(s.replace(ch2 , "0"));
            int x =Math.abs( a - d );
            int y = Math.abs(c - b);
            res = Math.max(res , Math.max( x, y ) );
            }
        }
        return res;
    }
}