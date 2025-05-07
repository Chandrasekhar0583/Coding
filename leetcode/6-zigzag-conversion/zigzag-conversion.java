class Solution {
    public String convert(String s, int numRows) {
        int  n = s.length();
        if( numRows == 1)
        return s;
        StringBuilder res = new StringBuilder();
        for(int  i = 0 ; i < numRows ; i++)
        {
            int c = 1;
            int skip = numRows - i - 1;
            skip += skip - 1;
            int skip2 = i;
            skip2 += i -1;
            for(int j = i ; j < n ; j++)
            {
           
                res.append(s.charAt(j));
                if((i!=0 && c%2==0) ||( i == numRows-1))
                {
                    j = j+ skip2;
                }
                else {
                    j = j+skip;
                }
            
                c++;
            }
        }
        return res.toString();
    }
}