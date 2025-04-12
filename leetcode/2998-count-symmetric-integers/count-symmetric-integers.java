class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while( low <= high)
        {
            String s = ""+low;
            if(s.length() % 2 == 0)
            {
                count += find( s );
            }
            low++;
        }
        return count ;
    }
    public int find ( String s)
    {
        int n = s.length();
        int sum1=0;
        int sum2 = 0;
        for( int i = 0 ; i < n / 2; i++)
        {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(n-1-i) - '0';
        }
        return sum1 == sum2 ? 1 : 0;
    }
}